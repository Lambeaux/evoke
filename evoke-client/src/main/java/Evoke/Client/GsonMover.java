package Evoke.Client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import Evoke.Core.Moveable;
import Evoke.Core.Mover;
import Evoke.Core.MoveableResult;

/**
 * Gson implementation of the Mover. This is the default mover.
 */
public class GsonMover implements Mover {
    private Gson gson;

    private JsonWriter clientSender;

    private JsonReader clientReceiver;

    private Socket clientSocket;

    public GsonMover() {
        this.gson = new Gson();
        this.clientSocket = null;
        this.clientSender = null;
        this.clientReceiver = null;
    }

    public MoveableResult move(Moveable moveable) {
        if (clientSocket == null) {
            throw new NullPointerException("Cannot move data with null socket.");
        } else {
            gson.toJson(moveable, moveable.getClass(), clientSender);
            return new MoveableResult(moveable, new Date(), true);
        }
    }

    public Moveable receive() {
        if (clientSocket == null) {
            throw new NullPointerException("Cannot receive data with null socket.");
        } else {
            return gson.fromJson(clientReceiver, Moveable.class);
        }
    }

    public void connectToServer(String host, int port) throws IOException {
        clientSocket = new Socket(host, port);
        clientSender = new JsonWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        clientReceiver = new JsonReader(new InputStreamReader(clientSocket.getInputStream()));
    }
}
