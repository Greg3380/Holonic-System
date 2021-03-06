# Holonic-System
Project for Agent System Course

## How to run project.

This section is about installing and running project.

### Clone the repository

First, you need to clone this repository locally. Use following command:
```
https://github.com/Greg3380/Holonic-System.git
```
### Download and run SARL

You can download a plugin to Eclipse which is supporting SARL language from [this site](http://www.sarl.io/)
It does not require installation to run, just doubleclick on eclipse-sarl.exe.

### Import project

Next step is to import cloned project into Eclipse. To do so, just import project via File -> Open Projects from File System

### Create run configuration

Your run configuration should looks like ![this one](https://github.com/Greg3380/Holonic-System/blob/master/holonicsystem/run_configuration.png)

### Setup input parameters

In Root.sarl you are able to specify input parameters, such as: composition of the product, total weight, max pollution level, cost. Based on these parameters output will be calculated.

### Run simulation 

Left click on the green play button on the top of Eclipse window. Simulation should start and output should be displayed on finish. 
