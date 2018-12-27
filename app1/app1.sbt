name := "app1"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++= Seq(jdbc, ehcache, ws, specs2 % Test, guice)