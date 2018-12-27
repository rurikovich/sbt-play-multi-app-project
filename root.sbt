name := "sbt-multiproject-rootbuild"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.4"

lazy val app1 = (project in file("app1"))
  .enablePlugins(PlayScala)
  .dependsOn(model)

lazy val app2 = (project in file("app2"))
  .enablePlugins(PlayScala)
  .dependsOn(model)

lazy val model = project.in(file("model"))
