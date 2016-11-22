# ![](../../assets/icons/delete.png)Uninstall

---

To uninstall Trueno, remove the global NPM package:

  ```bash
  > npm remove -g trueno
  ```

**NOTE**: If you where using trueno without the **--dir** flag, all the data will be wiped along with the installation. If you want to keep the data either use the **--dir** flag or go to:

> path/to/global/node_modules/trueno/lib/core/data

You will find all the data there. To use this data with a new installation, back up the directory and just point the **--dir** flag to it on the new installation.