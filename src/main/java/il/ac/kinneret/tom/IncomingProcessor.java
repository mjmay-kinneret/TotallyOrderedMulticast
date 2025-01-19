package il.ac.kinneret.tom;

/**
 * The thread that handles incoming messages. The job of the thread is to check
 * what messages have arrived and process them accordingly.  They could be MESSAGE
 * messages that reflect a new message that must be ACKed.  They also could be ACK
 * messages that update the state of the pending messages queue.
 * The thread reads from the Incoming Messages Queue.
 *
 * @author Michael J. May
 * @version 2025
 */
public class IncomingProcessor extends Thread {

    public IncomingProcessor() {

    }

    public void run() {
        // TODO: Fill me in!
        // TODO: Need to listen to incoming messages that are placed on the incoming messages queue. When a message is added to the queue, take it off and process.
        // TODO: Handle the pending message queue here.  When an ACK comes, update the queue and remove messages that can be output now.
    }
}
