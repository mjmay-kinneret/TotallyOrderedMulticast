package il.ac.kinneret.tom;

/**
 * Thread whose job it is to send messages from the Outgoing Messages Queue and send them to all neighbors.
 * Takes from the queue and uses the neighbors list in the SharedState class.
 *
 * @author Michael J. May
 * @version 2025
 * @see SharedState
 */
public class OutgoingProcessor extends Thread {

    public OutgoingProcessor() {
    }

    public void run()
    {
        // get the next message or ACK to send
        while (!interrupted())
        {
            // TODO: Fill me in!
            // TODO: When a message is added to the outgoing sending queue, send it to all of the neighbors.
        }

    }


}
