name := "b"

val a = project.in(file("../a"))
dependsOn(a)

scalaVersion := "2.12.4"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % Test
)
scalacOptions ++= Seq("-deprecation", "-feature")

test := {throw new MessageOnlyException("this does not work") }

skip in publish := true
enablePlugins(JavaAppPackaging)
