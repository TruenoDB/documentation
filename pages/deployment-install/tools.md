# ![](../../assets/icons/wrench.png)Tools

---

### ![](../../assets/icons/chart-bar.png)Monitoring

To inspect the status of all the running Trueno components are running, use the **tools** command.

To check Trueno's current status:

  ```bash
  > trueno tools --status
  ```

To start the Trueno monitor in **simple** mode: 

  ```bash
  > trueno tools --monitor s
  ```
**Simple** mode will show the current usage of all components and other status information.

To start the Trueno monitor in **advanced** mode: 

  ```bash
  > trueno tools --monitor a
  ```
**Advanced** mode will show you detailed information and log output of each component.

### ![](../../assets/icons/broom.png)Misc

Trueno tools provides some extra functionality that must be used with caution. 

To **wipe** all data from the Trueno installation.

  ```bash
  > trueno tools --clear
  ```

To clear all logs from the Trueno Core and internal components:

  ```bash
  > trueno tools --flush
  ```


