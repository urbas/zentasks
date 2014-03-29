name := "zentasks"

version := "1.0-SNAPSHOT"

val pless = "si.urbas" %% "pless" % "0.0.2-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  pless
)     

libraryDependencies ++= Seq(
  pless % "test" classifier "tests"
)

play.Project.playJavaSettings
