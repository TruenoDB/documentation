# Motivation

---

Trueno came to fruition because of the following arguments and needs:

- As **2016**, there are not enough graphs databases out there.
- Current solutions are either:
    + **Hard to setup and deploy**.
    + Propietary and closed source.
    + Not free(many with the distributed version)
    + Not scalable.
    + Does not support large range of applications.
- The pipeline of graph analysis is slow and ineficient. This usually consist of:
    1. Parse graph data, or build graph models.
    2. Store into a graph database, in files, or not store the data at all.
    3. Write a program to analyse the graph, or use a graph processing famework such as [GraphX](http://spark.apache.org/graphx/), [Giraph](http://giraph.apache.org/), and [GraphLab](https://turi.com/).
    4. Store the results back to disk or get not persisted results.
    5. If additional analysis is required, repeat from step 1, 2, or 3.
- The previous pipeline can take days or weeks to accomplish, and even more if advanced and repetitive analysis is required.
- Build new graph algorithms and deploy distributively is hard, time consuming, and not community friendy since solutions are sparsed through repositories or not shared at all.
- Current solutions require average to high computer science knowledge. Experts in other fields usually require addional help to deploy and analyze graphs.

## What Trueno aims for?

This project was build by a group of Doctoral and Master Students at [**Purdue CS**](https://www.cs.purdue.edu/) with the only goal of accelerate graph based applications, analysis, and scientific applications. Furthermore, we decide that Trueno MUST meet the following charasteristics to address the previous needs and arguments:

- Must be **easy** to deploy and getting started. As less configuration as possible.
- Must be able to handle small and large graph data.
- Must be open source and free.
- Must be flexible and support broad range of applications.
- Must be extendable and easy to modify(add new features).
- Must be able to **process graph algorithms** using the stored data.
- Must provide a **plugable graph algorithm** mechanism with global repository for easy extensibility and reusability(**under construction**)
- Must be easy to integrate with other graph tools such as [Gephi](https://gephi.org/), [Gremlin](http://tinkerpop.apache.org/gremlin.html), [Cytoscape](http://www.cytoscape.org/), etc.
- Must be simple enough such that profesionals in other fields with not advanced coding skills can use it efficiently.

