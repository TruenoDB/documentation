# ![](/assets/icons/wrench.png)Tools

---

### ![](/assets/icons/chart-bar.png)Monitoring

The if you want to inspect the output and how the components are running, execute the **tools** command with serveral utilities.

The following command will check Trueno's current status.

  ```bash
  > trueno tools --status
  ```

The following command will start the Trueno monitor in **simple** mode where you will see all the components usage and other useful information.

  ```bash
  > trueno tools --monitor s
  ```

The following command will start the Trueno monitor in **advanced** mode where you will see advanced information and the console output of each component.

  ```bash
  > trueno tools --monitor a
  ```

### ![](/assets/icons/broom.png)Misc

Trueno tools provides some extra functionality which are useful but dangerous. Please analyze the situation before using these commands.

The following command will **wipe** all default data directory from Trueno.

  ```bash
  > trueno tools --clear
  ```

The following command will clear all logs from the Trueno Core and internal components:

  ```bash
  > trueno tools --flush
  ```


