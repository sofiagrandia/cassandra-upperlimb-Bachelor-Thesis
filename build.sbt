name := """proyectosI"""
organization := "com.sof"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).disablePlugins(PlayFilters)

scalaVersion := "2.13.3"

libraryDependencies += guice
/*libraryDependencies ++= Seq(
  javaJdbc
)

name := """play-java-cassandra-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

// Cassandra Database
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.3.0"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
/*
libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.11.908"
)

javaOptions ++= Seq(
  "-Djavax.net.ssl.trustStore=project/cassandra_truststore.jks",
  "-Djavax.net.ssl.trustStorePassword=amazon"
)

// Must enable JVM forking to use javaOptions with runAll.
fork := true*/*/
