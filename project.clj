(defproject cake-autodoc "0.0.1-SNAPSHOT"
  :description "A task for generating autodoc documentation."
  :dependencies [[clojure "1.2.0"]
                 [clojure-contrib "1.2.0"]
                 [org.clojars.rayne/autodoc "0.8.0-SNAPSHOT"]]
  :dev-dependencies [[org.clojars.rayne/autodoc "0.8.0-SNAPSHOT"]
                     [clojure-contrib "1.2.0"]]
  :tasks [cake-autodoc.tasks])
