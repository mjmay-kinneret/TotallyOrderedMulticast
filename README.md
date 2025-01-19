# Totally Ordered Multicast 

## Author: Michael J. May
### Kinneret College on the Sea of Galilee
### Distributed Systems Course

This is the starter code for the Totally Ordered Multicast recitation tool.  The code is based on the totally ordered multicast algorithm described by van Steen in Distributed Systems Principles and Paradigms version 4 Chatper 5.2.

The internally uses Lamport Logical Clocks and queues to manage messages that arrive.  To ensure liveness, the tool uses ACKs on each incoming message.  The result is an O(n^2) number of messages.  The tool's complexity could be reduced by remove the ACKs with the cost being the need to ensure that all nodes send messages with regular frequency.
