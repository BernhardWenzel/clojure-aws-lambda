(defproject clojure-aws-lambda "0.1.0-SNAPSHOT"
  :description "Getting started project demonstrating how to use Clojure for AWS Lambda"
  :url "https://bernhardwenzel.com/articles"
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]]
  :aot :all)

