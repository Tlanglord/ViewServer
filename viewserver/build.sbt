import collection.JavaConversions._

androidBuildJar
minSdkVersion in Android := "4"

crossPaths := false
autoScalaLibrary := false
javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

name := "viewserver"
organization := "com.hanhuy.android"
version := "1.0.3"

javacOptions in (Compile,doc) += "-Xdoclint:none"

platformTarget in Android := "android-19"

// sonatype publishing options follow
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php"))

homepage := Some(url("https://github.com/pfn/ViewServer"))
pomIncludeRepository := { _ => false }

pomExtra :=
  <scm>
    <url>git@github.com:pfn/ViewServer.git</url>
    <connection>scm:git:git@github.com:pfn/ViewServer.git</connection>
  </scm>
  <developers>
    <developer>
      <id>pfnguyen</id>
      <name>Perry Nguyen</name>
      <url>https://github.com/pfn</url>
    </developer>
  </developers>

