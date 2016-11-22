# ![](../../assets/icons/update.png)Update

---

To update Trueno, execute the following command:

  ```bash
  > npm update -g trueno
  ```

This will update the global NPM package.

**NOTE**: If you are using Trueno without the **--dir** flag, all the existing data will be wiped along with the installation. 
If you wish to keep the data either use the **--dir** flag or go to:

> path/to/global/node_modules/trueno/lib/core/data

You will find all the data there. To use this data with a new installation, back up the directory and just point the **--dir** flag to it on the new installation.