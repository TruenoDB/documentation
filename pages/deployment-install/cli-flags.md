# CLI Flags

---

Trueno has **5** main flags with subflags. The following is the description of each command:

Usage:

```bash
> trueno <cmd>
```

### ![](/assets/icons/flag.png) start

Launch trueno.

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

### ![](/assets/icons/flag.png) stop

Stop trueno(if running in daemon mode, otherwise Ctrl+C will stop the foreground process).

```bash
> trueno stop [options]
```
 
  Options:

    -h, --help     output usage information
    -V, --version  output the version number


### ![](/assets/icons/flag.png) setup

Install [internal components](install.html#internal-components).

```bash
> trueno setup [options]
```

  Options:

    -h, --help     output usage information
    -V, --version  output the version number
    -p, --post     Run post setup.
    --debug        Show debug messages in the console


### ![](/assets/icons/flag.png) balancer

Run trueno load balancer. This will be used when running in [cluster mode](distributed-deployment.md) with multiple machines.

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

### ![](/assets/icons/flag.png) tools

Execute trueno's utility tools.

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