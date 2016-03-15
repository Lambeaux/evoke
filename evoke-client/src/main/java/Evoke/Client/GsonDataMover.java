package Evoke.Client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import Evoke.Core.MetadataMover;
import Evoke.Core.MetadataSendable;

/**
 * Created by lambeaux on 3/6/16.
 *
 */
public class GsonDataMover implements MetadataMover {
    private Gson gson;

    private JsonWriter clientSender;

    private JsonReader clientReceiver;

    private Socket clientSocket;

    public GsonDataMover() {
        this.gson = new Gson();
        this.clientSocket = null;
        this.clientSender = null;
        this.clientReceiver = null;
    }

    public boolean send(MetadataSendable sendable) {
        if (clientSocket == null) {
            throw new NullPointerException("Cannot send data with null socket.");
        } else {
            gson.toJson(sendable, sendable.getClass(), clientSender);
            return true;
        }
    }

    public MetadataSendable receive() {
        if (clientSocket == null) {
            throw new NullPointerException("Cannot receive data with null socket.");
        } else {
            MetadataSendable received = gson.fromJson(clientReceiver, MetadataSendable.class);
            return received;
        }
    }

    public void connectToServer(String host, int port) throws IOException {
        clientSocket = new Socket(host, port);
        clientSender = new JsonWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        clientReceiver = new JsonReader(new InputStreamReader(clientSocket.getInputStream()));
    }
}
