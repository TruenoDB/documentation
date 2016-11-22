# ![](../../assets/icons/scale-balance.png)Load Balancing

---

In the [Cluster Deployment](distributed-deployment.html) section we setup a cluster with 4 machines which can receive 
read/write request at any time. To balance the requests among these machines, a new or existing machine can be configured 
to distribute requests among the all the machines.

Example:

To deploy and activate a load balancer on a new machine with IP **192.168.1.44**, first a JSON configuration file is deployed:

![](../../assets/icons/json.png) **balancer.json**
```json
{
  "sourcePort": 8000,
  "targets": [
    {
      "host": "192.168.1.40",
      "port": 8000
    },
    {
      "host": "192.168.1.41",
      "port": 8000
    },
    {
      "host": "192.168.1.42",
      "port": 8000
    },
    {
      "host": "192.168.1.43",
      "port": 8000
    }
  ]
}
```

**sourcePort** is the port at the balancing machine(**192.168.1.44**).
**'targets'** are the machines in the cluster with their respective addresses and ports.

Next, execute:

  ```bash
  > trueno balancer --start path/to/balancer.json
  ```

You will see a message like the following:

> [Success] Started loadbalancer - Logging to /path/to/global/node_modules/trueno/loadbalancer.out

Now you can connect to any machine managed by the balancer using any of the [drivers](../api-drivers/drivers-connectors/drivers-connectors.html) 
or by using the Web Console at **192.168.1.44:8000**.

The balancer process runs as a background process. To stop the balancer, execute:

  ```bash
  > trueno balancer --stop
  ```

You will see a message like the following:

> [Success] Stopped loadbalancers

