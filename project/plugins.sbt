logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.20")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC11")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.2-RC2")
