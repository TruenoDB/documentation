# ![](../../assets/icons/file-tree.png)Codebase Structure

---

## Structure

The following file tree describes how the project is structure. More details about tooling follows.

![](../../assets/icons/folder.png)**trueno**<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**assets**: Project assets such as images and icons.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**conf**: Trueno configuration files(sources, settings, hostnames and ports).<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**lib**: Where all logic resides(sources).<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**test**: Testing suite directory.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**.gitignore**: Git ignore.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**gulpfile.js**: Gulp configuration file.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**LICENCE**: The project licence.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**package.json**: The Node.js modules configuration file.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**README.md**: The readme instruction file.<br>


## Codebase

The most important directories of the project are **conf** and **lib**.

![](../../assets/icons/folder.png)**conf**<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**gremlin-server**: The Gremlin Server configuration and binaries for the Trueno backend.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**pm2-gui-custom.ini**: The [PM2 GUI](https://github.com/Tjatse/pm2-gui) custom configuration.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**pm2-gui-custom.ini**: The [PM2 GUI](https://github.com/Tjatse/pm2-gui) configuration.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-component-sources.yaml**: The [components](../deployment-install/install.html#download-and-install-internal-components) sources(download links and info.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-config.yaml**: Trueno configurations and **components settings overwrites**.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-config.yaml**: Trueno configurations and **components settings overwrites**.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-post-install.yaml**: Post component installation sources/commands.<br>


![](../../assets/icons/folder.png)**lib**<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**balancer**: Websocket load balancer sources.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**compute**: Graph compute layer sources.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**console**: Trueno CLI console sources.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**core**: Trueno core(central component sticking everything together) sources<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**search**: Indexing and search layer(elasticsearch) sources.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**ui**: Web UI sources.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-balancer.js**: The load balancer entry script. <br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-console.js**: The console entry script. <br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-post-start.js**: Trueno's post initialization entry script. <br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-setup.js**: The setup entry script.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-start.js**: Trueno engine-start entry script.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-stop.js**: Trueno execution halt script.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno-tools.js**: Command line tools entry script.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/file.png)**trueno.js**: Trueno **main** execution script.<br>

Finally, the most complex and important structure to explain may be the **core** directory:

![](../../assets/icons/folder.png)**core**<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**api**: The communication protocol library, all client calls are here.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**binaries**: Components binary folder, generated after setup. <br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**communication**: The WebSocket library for clients and internal communication.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**data**: The default data directory. Generated at runtime if no data path is provided.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**data_structures**: Shared datastructures, ex. Graph, Vertice, and Edge.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**enum**: Trueno enumerators.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**initialize**: The initialization library, the initial execution flow begins here.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**logging**: The logging library.<br>
&nbsp;&nbsp;&nbsp;&nbsp;![](../../assets/icons/folder.png)**status**: The metrics analyzer library.<br>

