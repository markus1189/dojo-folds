import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "de.codecentric",
      scalaVersion := "2.12.6",
      version := "0.1.0-SNAPSHOT",
      scalafmtOnCompile := true
    )),
  name := "folds",
  libraryDependencies += scalaTest % Test
)
