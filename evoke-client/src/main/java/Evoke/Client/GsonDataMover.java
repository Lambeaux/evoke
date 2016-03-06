package Evoke.Client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import Evoke.Core.DataFlowException;
import Evoke.Core.DataMover;
import Evoke.Core.DataSendable;

/**
 * Created by lambeaux on 3/6/16.
 *
 */
public class GsonDataMover implements DataMover {
    private Gson gson;

    private JsonWriter clientSender;

    private JsonReader clientReceiver;

    private Socket clientSocket;

    private String lastStatusMessage;

    public GsonDataMover(PrintStream stream) {
        this.gson = new Gson();
        this.lastStatusMessage = null;
        this.clientSocket = null;
        this.clientSender = null;
        this.clientReceiver = null;
    }

    public String getLastStatusMessage() {
        return lastStatusMessage;
    }

    public boolean send(DataSendable sendable) {
        if (clientSocket == null) {
            throw new DataFlowException("Cannot send data with null socket.");
        } else {
            gson.toJson(sendable, sendable.getClass(), clientSender);
            return true;
        }
    }

    public DataSendable receive() {
        if (clientSocket == null) {
            throw new DataFlowException("Cannot receive data with null socket.");
        } else {
            DataSendable received = gson.fromJson(clientReceiver, DataSendable.class);
            return received;
        }
    }

    public boolean connectToServer(String host, int port) {
        try {
            clientSocket = new Socket(host, port);
        } catch (IOException e) {
            lastStatusMessage = processConnectionError("IOException during socket creation: ", e);
            return false;
        }

        try {
            clientSender = new JsonWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        } catch (IOException e) {
            lastStatusMessage =
                    processConnectionError("IOException during fetch of output stream: ", e);
            return false;
        }

        try {
            clientReceiver = new JsonReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            lastStatusMessage = processConnectionError("IOException during fetch of input stream: ",
                    e);
            return false;
        }

        lastStatusMessage = "All services started normally";
        return true;
    }

    private String processConnectionError(String msg, Exception e) {
        clientSocket = null;
        return msg + e.getMessage();
    }
}
