// Project $name$ written by $author$

lazy val $name$ = (
    project in file(".")
  ).enablePlugins(
    ScalaJSPlugin
  ).settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scalaVersion$"
    )),
    name := "$name$",
    clippyColorsEnabled := true,
    wartremoverErrors ++= Warts.unsafe,
    wartremoverErrors ++= Seq(
      ScalaJSWart.ArrayPartial,
      ScalaJSWart.UndefOrOpsPartial
    ),
    scalaSource in Compile := file(s"\${baseDirectory.value.getAbsolutePath}/$type$"),
    scalaSource in Test := file(s"\${baseDirectory.value.getAbsolutePath}/$type$-test"),
    version := "0.0.1",
    libraryDependencies := Seq(
      "org.scalactic" %%% "scalactic" % "3.0.1" % "test",
      "org.scalatest" %%% "scalatest" % "3.0.1" % "test",
      "com.lihaoyi" %%% "scalatags" % "0.6.2",
      "io.monix" %%% "monix" % "2.2.1",
      "io.monix" %%% "monix-cats" % "2.2.1"
    ),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
    addCompilerPlugin("org.wartremover" %% "wartremover" % "2.0.2"),
    resolvers += Resolver.sonatypeRepo("releases"),
    addCompilerPlugin("com.softwaremill.clippy" %% "plugin" % "0.5.1" classifier "bundle")
  )

lazy val $name$Sample = (
    project in file("./$name$-sample")
  ).enablePlugins(
    ScalaJSPlugin
  ).settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scalaVersion$"
    )),
    name := "$name$Sample",
    clippyColorsEnabled := true,
    wartremoverErrors ++= Warts.unsafe,
    wartremoverErrors ++= Seq(
      ScalaJSWart.ArrayPartial,
      ScalaJSWart.UndefOrOpsPartial
    ),
    scalaSource in Compile := file(s"\${baseDirectory.value.getAbsolutePath}/app"),
    scalaSource in Test := file(s"\${baseDirectory.value.getAbsolutePath}/test"),
    version := "0.0.1",
    libraryDependencies := Seq(
      "org.scalactic" %%% "scalactic" % "3.0.1" % "test",
      "org.scalatest" %%% "scalatest" % "3.0.1" % "test",
      "com.lihaoyi" %%% "scalatags" % "0.6.2",
      "io.monix" %%% "monix" % "2.2.1",
      "io.monix" %%% "monix-cats" % "2.2.1"
    ),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
    addCompilerPlugin("org.wartremover" %% "wartremover" % "2.0.2"),
    resolvers += Resolver.sonatypeRepo("releases"),
    addCompilerPlugin("com.softwaremill.clippy" %% "plugin" % "0.5.1" classifier "bundle")
  ).dependsOn($name$)