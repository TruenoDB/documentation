# ![](/assets/icons/scale-balance.png)Load Balancing

---

In the [Cluster Deployment](pages/deployment-install/distributed-deployment.md) section we setup a cluster with 4 machines which can receive read/write request at any time. Let say we want to load balance request among these machines and abstract the user to connect to just one machine.

We pick one of the machines, preferable a new one, say machine **192.168.1.44** to deploy our load balancer. We need an aditional json file that will map to all machines in the cluster:

![](/assets/icons/json.png) **balancer.json**
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

We can see that **'sourcePort'** is the port at the new balancing machine(**192.168.1.44**). **'targets'** are the machines in the cluster with their respective address and port.

Now, at machine **192.168.1.44** execute:

  ```bash
  > trueno balancer --start path/to/balancer.json
  ```

You will see a message like the following:

> [Success] Started loadbalancer - Logging to /path/to/global/node_modules/trueno/loadbalancer.out

Now the you can connect using any [driver](pages/api-drivers/drivers-connectors/drivers-connectors.md) to connect to this balancer, which will redirect the request to one of the cluster machines. You can also go to the Web Console accesing **192.168.1.44:8000** as if you where connecting to one of the cluster machines.

The balancer process runs in the background, to stop the process, just execute:

  ```bash
  > trueno balancer --stop
  ```

You will see a message like the following:

> [Success] Stopped loadbalancers

