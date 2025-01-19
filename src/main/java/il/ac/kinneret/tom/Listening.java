package il.ac.kinneret.tom;

import java.net.ServerSocket;

/**
 * Listens on a server socket for incoming messages.  When a new message comes in, it's put in the
 * Incoming Messages Queue for processing by the other threads.
 *
 * @author Michael J. May
 * @version 2025
 */
public class Listening extends Thread {

    /**
     * The socket that we listen on
     */
    ServerSocket listeningSocket;

    /**
     * A new listening thread.  Needs the socket to listen on
     *
     * @param listeningSocket The socket to listen on
     */
    public Listening(ServerSocket listeningSocket) {
        this.listeningSocket = listeningSocket;
    }

    /**
     * Runs the thread
     */
    public void run() {
        // listen on the server socket for incoming conversations
        while (!interrupted() && !listeningSocket.isClosed()) {
            // TODO: Fill me in!
            // TODO: Listen for incoming messages.  Put them in the correct queue based on their type.
        }
    }
}
