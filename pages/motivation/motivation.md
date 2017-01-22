# ![](/assets/icons/lightbulb.png)Motivation

---

Trueno came to fruition because of the following arguments and needs:

- As **2017**, there's not a wide variety of graphs databases available.
- Existing solutions are either:
    + **Hard to setup and deploy**.
    + Propietary and closed source.
    + Not free(many with the distributed version)
    + Not scalable.
    + Does not support large range of applications.
- The pipeline of graph analysis is slow and inefficient. This usually consist of:
    1. Parse graph data, or build graph models.
    2. Store into a graph database, in files, or not store the data at all.
    3. Write a program to analyze the graph, or use a graph processing framework such as [GraphX](http://spark.apache.org/graphx/), [Giraph](http://giraph.apache.org/), and [GraphLab](https://turi.com/).
    4. Store the results back to disk or get temporary results.
    5. Repeat this process with the temporary data if additional analysis is required.
- The previous pipeline can take days or weeks to accomplish, and even more if advanced and repetitive analysis is required.
- Building new graph algorithms and deploying them distributively is hard, time consuming, and not community friendly since solutions are scattered through repositories or not available to the public.
- Current solutions require average to high computer science knowledge. Experts in other fields usually require additional help to deploy and analyze graphs.

## What Trueno aims for?

This project was build by a group of Doctoral and Master Students at ![](../../assets/icons/school.png)[**Purdue CS**](https://www.cs.purdue.edu/) 
with the goal of accelerating graph based applications and analysis. Trueno was started taking in consideration 
the following characteristics to address the previous needs and arguments:

- **Easy** to deploy and run, involving the least configuration possible from the user.
- Able to handle small and large graph data.
- Open source and free.
- Support a broad range of applications.
- Provide extensibility via a plugin system for new graph algorithms and a global repository.(**under construction**)
- **Process graph algorithms** on the stored graph data.
- Easy to integrate with other graph analysis tools such as [Gephi](https://gephi.org/), [Gremlin](http://tinkerpop.apache.org/gremlin.html), [Cytoscape](http://www.cytoscape.org/), etc.
- Users should not need to learn how to code in a programming language to exploit all the features Trueno provides.

