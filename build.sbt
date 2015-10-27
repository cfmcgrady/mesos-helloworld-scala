import AssemblyKeys._
assemblySettings

name := "MesosHelloWorld"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.mesos" % "mesos" % "0.25.0"
)

