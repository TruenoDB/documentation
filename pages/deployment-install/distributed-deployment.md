# ![](/assets/icons/server.png)Cluster Deployment(Distributed)

---

This section describes how to deploy Trueno in a cluster environment, i.e. in multiple machines to handle higher amounts of graph data. In simple words, how to scale.

Important notes:

- Trueno has 3 distributed subcomponents that are resilient and distributed by design:
    + Apache Cassandra
    + ElasticSearch
    + Spark
- When running Trueno in cluster mode, all machines will connect these subcomponents and create your cluster.
- Any machine can receive and serve request, the backend storage will handle the **persistence**, **consistency**, **sharding**, and **replication**.

In order to deploy Trueno in a distributed way you will need follow these steps:

1. [Install](pages/deployment-install/install.md) Trueno at each machine you want to deploy as part of the cluster.
2. Run the cluster setup coordinator, where the Spark Master will run.
3. Run other Trueno instances at other machines which will connect to the coordinator in order to setup the cluster.
4. (optional) Run a load balancer to redirect request to all machines in a balanced way.

### Setup Guide

Lets say you have 4 machines where you want to deploy your cluster, and you want to distribute the componenes by machines.

**NOTE**: you can run all subcomponents in all machines but the master that must be present in just one:

|  machine  | master | compute | backend | index |
|:---------:|:------:|:-------:|:-------:|:-----:|
| ![](/assets/icons/desktop-mac.png) machine_1 |   ![](/assets/icons/account-network.png)    |    ![](/assets/icons/chip.png)    |         |       |
| ![](/assets/icons/desktop-mac.png) machine_2 |        |    ![](/assets/icons/chip.png)    |    ![](/assets/icons/database.png)    |       |
| ![](/assets/icons/desktop-mac.png) machine_3 |        |    ![](/assets/icons/chip.png)    |    ![](/assets/icons/database.png)    |   ![](/assets/icons/magnify.png)   |
| ![](/assets/icons/desktop-mac.png) machine_4 |        |    ![](/assets/icons/chip.png)    |    ![](/assets/icons/database.png)    |   ![](/assets/icons/magnify.png)   |

The previous table shows how the subcomponents will be distribured by machine. Now lets show one necessary file we must have to deploy the cluster:

![](/assets/icons/json.png) **cluster.json**
```json
{
    "192.168.1.40": {"master": true, "compute": true},
    "192.168.1.41": {"compute": true,"backend": true},
    "192.168.1.42": {"compute": true,"backend": true,"index": true},
    "192.168.1.43": {"compute": true,"backend": true,"index": true}
}
```
Copy this json file to all the machines and start the Trueno instances. Note that we must start the coordinator first which is **192.168.1.40**.

**NOTE**: The machine name on the json file **must** match the hostname when you start the instance(using the -h flag).


**Step 1**

At machine **192.168.1.40**:

  ```bash
  > trueno start -h 192.168.1.40 --cluster path/to/cluster.json
  ```

You will see the following line in the console output:

> info: >> CLUSTER: Awaiting for cluster hosts ready signal


**Step 2**

At all other machines, start the trueno instance the same way:

At machine **192.168.1.41**:

  ```bash
  > trueno start -h 192.168.1.41 --cluster path/to/cluster.json
  ```

At machine **192.168.1.42**:

  ```bash
  > trueno start -h 192.168.1.42 --cluster path/to/cluster.json
  ```

At machine **192.168.1.43**:

  ```bash
  > trueno start -h 192.168.1.43 --cluster path/to/cluster.json
  ```

Now, at machine **192.168.1.40**(coordinator), you will see that the database
will display a starting message. This means that the coordinator has connect all subcomponents and is ready to receive requests.