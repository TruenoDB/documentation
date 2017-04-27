# Ports & Flags

---

## ![](../../assets/icons/serial-port.png)Ports

- ![](../../assets/icons/serial-port.png) **8000**: Trueno Web Console.
- ![](../../assets/icons/serial-port.png) **8001**: Trueno internal port. This port is only used for internal system communication.
- ![](../../assets/icons/serial-port.png) **8002**: The Gremlin Server port.
- ![](../../assets/icons/serial-port.png) **8004**: ElasticSearch external port.
- ![](../../assets/icons/serial-port.png) **8005**: Spark Master external port.
- ![](../../assets/icons/serial-port.png) **8006**: Spark Web UI port.
- ![](../../assets/icons/serial-port.png) **8007**: Trueno default external port. This port will be exposed to external drivers. 

**NOTE**: At the moment, the only configurable port is the Trueno Web Concole (8000) and the default port(8007). If you need to change a certain port, edit directly the configuration file at:

> path/to/global/node_modules/trueno/conf/trueno-config.yaml

## ![](../../assets/icons/flag.png)Flags

Trueno has **5** main flags with subflags. The following is the description of each command:

Usage:

```bash
> trueno <cmd>
```

### ![](../../assets/icons/flag.png) start

Launch Trueno.

```bash
> trueno start [options]
```

  Options:

    -h, --help                 output usage information
    -V, --version              output the version number
    -h, --host <string>        The host or IP address to be exposed, default: localhost
    -p, --port <number>        The local port to be exposed, default: 8000
    --dir <dataDirectoryPath>  The data directory for the storage engines
    --forever                  Run trueno as a daemon in the background
    --cluster <hostsJSON>      Start the database in cluster mode with the provided hosts JSON
    --debug                    Show debug messages in the console

### ![](../../assets/icons/flag.png) stop

Stop Trueno(if running in daemon mode, otherwise Ctrl+C will stop the foreground process).

```bash
> trueno stop [options]
```
 
  Options:

    -h, --help     output usage information
    -V, --version  output the version number


### ![](../../assets/icons/flag.png) setup

Install [internal components](install.html#internal-components).

```bash
> trueno setup [options]
```

  Options:

    -h, --help     output usage information
    -V, --version  output the version number
    -p, --post     Run post setup.
    --debug        Show debug messages in the console


### ![](../../assets/icons/flag.png) balancer

Run Trueno load balancer. This will be used when running in [cluster mode](distributed-deployment.html) with multiple machines.

```bash
> trueno balancer [options]
```

  Options:

    -h, --help         output usage information
    -V, --version      output the version number
    --start <config>   Start the balancer with he JSON file containing the balancer configuration
    --stop             Stop running load balancers
    --list             List running load balancers
    --generate <path>  Generate configuration template file to the desired path

### ![](../../assets/icons/flag.png) tools

Execute Trueno's utility tools.

```bash
> trueno tools [options]
```

  Options:

    -h, --help          output usage information
    -V, --version       output the version number
    --flush             Flush PM2 logs
    --clear             Clear this Trueno instance data
    --status            Show the database processes status
    --monitor <option>  Monitor the database processes, options: s(simple) or a(advanced)