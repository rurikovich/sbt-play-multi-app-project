name := "multiApp1"

version := "1.0"

lazy val a = RootProject(file("../a"))

val multiapp1 = Project(id = "multiapp1", base = file("."))

scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )


scalacOptions ++= Seq("-deprecation", "-feature")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

skip in publish := true

enablePlugins(PlayScala)