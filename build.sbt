name := """play-mocha-playground"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

libraryDependencies ++= Seq(
  "org.webjars" % "rjs" % "2.2.0" % "test",
  "org.webjars" % "squirejs" % "0.1.0" % "test"
)

MochaKeys.requires += "Setup"

