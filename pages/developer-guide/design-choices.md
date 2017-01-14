# ![](../../assets/icons/exclamation.png)Design Choices

---

In this section we describe the reason for our design choices. Note that Trueno is very modular and any choice choice can change for better.

#### ![](../../assets/icons/help.png)Why so many components and dependencies?

There are two points points to support this argument:

1. One of our main constraints was time. We decided to use already build and proven software as components for Trueno since it was the fastest way to get a usable and stable piece of software running in less than 6 months. Creating all layers for a datastore/database is a tremendous ammount of effort and time, we decided to sacrifice a bit of performance and incur in overhead in exchange of delivering in time.
2. We believe that a multilayer design is a good idea for the following reasons:
    - All components are supported by different communities and are continuously maintained and improved.
    - A moduler design with abstraction layers make it easy to swap the components for something better in the future.

#### ![](../../assets/icons/help.png)Why Node.js?

Since we are using multiple components, we needed to write a core module to stick all these together. From the Communication layer with websockets, to indexing and storage. We choosed Node.js for the following reasons:

1. We needed a language that makes easy and natural to handle asynchronous operations from the different components. Javascript is asynchronous and functional by design, which makes it excellent.
2. Node.js async mechanismn free us from explicit multithreading and complex concurrency control of requests and IO operations.
3. Well done code writing is short and easy to understand.
4. Node.js is moving really fast and its performance is improving fast at each release. We find out that for serving request and connect multiple components is very efficient in terms of speed and low memory footprint.
5. There are plenty of modules to fullfill our needs. From encryption to serialization modules.
6. Javascript is everywhere, which makes easy to find people that can understand the codebase.

#### ![](../../assets/icons/help.png)Why Socket.io?

Without doubt, there are better socket libraries out there. But socket.io has a bigger community and multiple implementation accross different languages, which makes it easy to write client drivers. This means that it would be trivial to create an iOS driver for Trueno for instance.



