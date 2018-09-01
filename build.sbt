name := "Spark Scala Template"

version := "1.0"

organization := "com.databricks.example"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
		"org.apache.spark" %% "spark-core" % "2.3.0" % "provided",
	  "org.apache.spark" %% "spark-sql" % "2.3.0" % "provided"
)


resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Twitter4J Repository" at "http://twitter4j.org/maven2/",
  "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
  "Twitter Maven Repo" at "http://maven.twttr.com/",
  "scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Second Typesafe repo" at "http://repo.typesafe.com/typesafe/maven-releases/",
  "Mesosphere Public Repository" at "http://downloads.mesosphere.io/maven",
  Resolver.sonatypeRepo("public")
)

// Your username to login to Databricks
dbcUsername := System.getenv("DBCLOUD_USER")// e.g. "admin"

// Your password (Can be set as an environment variable)
dbcPassword := System.getenv("DBCLOUD_PASSWORD")
// e.g. "admin" or System.getenv("DBCLOUD_PASSWORD") // Gotcha: Setting environment variables in IDE's may differ. IDE's usually don't pick up environment variables from .bash_profile or .bashrc

// The URL to the Databricks REST API.
dbcApiUrl := "https://demo.cloud.databricks.com/api/1.2" // "https://organization.cloud.databricks.com/api/1.2"

// Add any clusters that you would like to deploy your work to. e.g. "My Cluster"
dbcClusters += "Demo-mwc" // Add "ALL_CLUSTERS" if you want to attach your work to all clusters

// An optional parameter to set the location to upload your libraries to in the workspace e.g. "/home/USER/libraries"
// This location must be an existing path.
// NOTE: Specifying this parameter is *strongly* recommended as many jars will be uploaded to your cluster.
// Putting them in one folder will make it easy for your to delete all the libraries at once.
dbcLibraryPath := "/Users/mwc@databricks.com/test/"  // Default is "/"

// Whether to restart the clusters everytime a new version is uploaded to Databricks.
dbcRestartOnAttach := false // Default true
