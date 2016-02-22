package Evoke.Core;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Created by lambeaux on 2/22/16.
 *
 */
public class EvokeClientNode implements DataMover {
    private List<DataSendable> localSendables;
    private List<DataSendable> remoteSendables;

    private Gson transformer;

    private Socket clientSocket;

    private JsonWriter clientSender;

    private JsonReader clientReceiver;

    public EvokeClientNode() {
        transformer = new Gson();

        localSendables = new ArrayList<DataSendable>();
        remoteSendables = new ArrayList<DataSendable>();

        clientSocket = null;
        clientSender = null;
        clientReceiver = null;
    }

    public String connectToServer(String host, int port) {
        try {
            clientSocket = new Socket(host, port);
        } catch (IOException e) {
            return processConnectionError("IOException during socket creation: ", e);
        }

        try {
            clientSender = new JsonWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        } catch (IOException e) {
            return processConnectionError("IOException during fetch of output stream: ", e);
        }

        try {
            clientReceiver = new JsonReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            return processConnectionError("IOException during fetch of input stream: ", e);
        }

        return "All services started normally";
    }

    public boolean send(DataSendable sendable) {
        if (clientSocket == null) {
            return false;
        } else {
            localSendables.add(sendable);
            transformer.toJson(sendable, sendable.getClass(), clientSender);
            return true;
        }
    }

    public boolean receive() {
        if (clientSocket == null) {
            return false;
        } else {
            DataSendable received = transformer.fromJson(clientReceiver, DataSendable.class);
            remoteSendables.add(received);
            return true;
        }
    }

    private String processConnectionError(String msg, Exception e) {
        clientSocket = null;
        return msg + e.getMessage();
    }
}
