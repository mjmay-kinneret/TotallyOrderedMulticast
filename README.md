# Totally Ordered Multicast 🚀

**Author:** Michael J. May  
**Institution:** Kinneret College on the Sea of Galilee  
**Course:** Distributed Systems

## Overview 📚

This repository contains the starter code for the *Totally Ordered Multicast* recitation tool. The implementation is based on the totally ordered multicast algorithm described by van Steen in *Distributed Systems: Principles and Paradigms* (4th Edition, Chapter 5.2).

The tool utilizes Lamport Logical Clocks and message queues to manage the delivery of messages, ensuring that messages are received in a totally ordered sequence across all nodes. 

## Features ✨

- **Lamport Logical Clocks:** ⏰ Used to assign timestamps to messages to maintain ordering.
- **Message Queues:** 📥 Handle incoming messages and ensure they are processed in the correct order.
- **ACK Mechanism:** ✅ Each incoming message is acknowledged to ensure liveness in the system. This results in a communication overhead of O(n²) messages.

## Performance ⚙️

The current implementation has a time complexity of O(n²) due to the use of ACKs for each incoming message. While this ensures message delivery and system liveness, the complexity could be reduced by eliminating the ACKs. However, doing so would require ensuring that all nodes regularly send messages to maintain synchronization and prevent deadlocks.

## Future Improvements 🔮

- **Reducing Communication Overhead:** 🔧 Investigate ways to minimize the number of ACKs required to maintain system consistency.
- **Optimization:** ⚡ Explore techniques to reduce the overall complexity and improve scalability for larger systems.

## License 📜

MIT License

Copyright (c) 2025 Michael J. May

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES, OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT, OR OTHERWISE, ARISING FROM, OUT OF, OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
