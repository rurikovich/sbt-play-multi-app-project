name := "sbt-multiproject-rootbuild"

scalaVersion := "2.12.4"


resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"



lazy val a = project.in(file("a"))


lazy val c = project.in(file("c")).enablePlugins(PlayScala).dependsOn(a)
lazy val d = project.in(file("d")).enablePlugins(PlayScala)

