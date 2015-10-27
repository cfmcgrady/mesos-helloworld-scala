#Mesos hello world in scala

This repository example to run shell commands in Apache mesos

#Building
```shell
   sbt clean assembly 
```

#Running example
Mesos Framework need access mesos.so shared library

```shell
MESOS_NATIVE_JAVA_LIBRARY=/data/libmesos-0.22.1.so java -cp /tmp/MesosHelloWorld-assembly-1.0.jar FrameworkClient "/bin/echo hello"
```

