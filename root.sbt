name := "sbt-multiproject-rootbuild"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.4"

lazy val a = project.in(file("a"))

lazy val app1 = (project in file("app1"))
  .settings(
    name := "app1",
    version := "1.0",
    scalaVersion := "2.12.2",
    resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
    libraryDependencies ++= Seq(jdbc, ehcache, ws, specs2 % Test, guice)
  )
  .enablePlugins(PlayScala)
  .dependsOn(a)

lazy val multiapp2 = (project in file("d"))
  .settings(
    name := "multiApp2",
    version := "1.0",
    scalaVersion := "2.12.2",
    resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
    libraryDependencies ++= Seq(jdbc, ehcache, ws, specs2 % Test, guice)
  )
  .enablePlugins(PlayScala).dependsOn(a)

