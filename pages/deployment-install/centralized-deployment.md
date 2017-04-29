# ![](../../assets/icons/server-minus.png)Single Machine Deployment(Centralized)

---

This section servers as a guide to deploy Trueno in a single machine.

Run trueno single instance:


  ```bash
  > trueno start
  ```

You will see a console output similar to the following:

  ```ruby
    info: Sanity check done, all components present.
    info: Executing Trueno Components...
    info: Spark Master successfully started!
    info: Spark Worker successfully started!
    info: Gremlin Server successfully started!
    info: Elasticsearch successfully started!
    info: All components started
    info: Starting database...
    info: Internal API awaiting for connections at: localhost:8001
    info: ElasticSeach engine connected at: [{"port":8004,"host":"localhost"}]
    info: External API awaiting for connections at: localhost:8000
    info: Cluster status collected.  _id=localhost, arch=64, model=Intel(R) Core(TM) i5-5257U CPU @ 2.70GHz, speed=2700, user=181792530, nice=0, sys=116932760, idle=744926600, irq=0, cores=4, network=null, freemem=147283968, hostname=localhost, platform=Node.js, totalmem=8589934592, uptime=9068212, osversion=15.6.0, version=6.0.0, os=OS X, $ref=$["_instance"]
    info: PM2-UI Monitor: [INFO] Starting..
  ```

This will start Trueno as a single instance. Trueno connects by default to the address **http://localhost:8000** 
If Trueno must be accessed from outside your computer, you can use the **-h** flag to bind to a public address, 
for instance '0.0.0.0' (all interfaces).

If you want to run Trueno as a background process, the **forever** flag can be used.

  ```bash
  > trueno start --forever
  ```

To stop Trueno, simply execute:

  ```bash
  > trueno stop
  ```

Trueno and all subcomponents will be stopped.

The following is a complete example of starting Trueno in a single machine with all available flags and their explanation:

  ```bash
  > trueno start \
    -h 'my_custom_host'
    -p 9999
    --dir /path/to/my/data/dir
    --debug
  ```

- **h**: Provide the hostname to bind, in this example, locahost will be used.
- **p**: The external port for external driver connections, in this example **9999**.
- **dir**: The data directory. All data will be stored in this directory.
- **debug**: Print all output, including errors to console for all components.