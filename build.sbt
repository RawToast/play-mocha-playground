name := """play-mocha-playground"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

libraryDependencies ++= Seq(
  guice,
  "org.webjars" % "rjs" % "2.2.0" % "test",
  "org.webjars" % "squirejs" % "0.1.0" % "test"
)

MochaKeys.requires += "Setup"

