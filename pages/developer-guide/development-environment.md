# ![](../../assets/icons/source-branch.png)Development Environment

---

## Operating System

You can modify and commit code in any operating system with **git**, but can only run Trueno is a Unix based Operating System:

- Mac OS
- Ubuntu
- Fedora
- CentOS

## Dependencies

In order to develop and modify Trueno, you must meet the following dependencies:

* **Java 8** or later
* **Node.js 6** with **npm** or later (we recommend to use [nvm](https://github.com/creationix/nvm#install-script))
* **tar** and **unzip**

####Clone the repository

  ```bash
  > git clone https://github.com/TruenoDB/trueno.git
  ```

####Install Node Modules and Bower Components

  ```bash
  > cd trueno
  > npm install
  ```

####Install Trueno Components

  ```bash
  > node lib//trueno.js setup
  ```

####Start Trueno

  ```bash
  > node lib//trueno.js start
  ```

**NOTE**: In case you find any difficulty starting Trueno, add the --debug flag to see the bootstrap process logs output.
