# cake-autodoc

cake-autodoc is a simple plugin for generating autodoc documentation for your project via cake.

# usage

The plugin contains a single task, `cake autodoc`. This task will generate documentation for your project.

The plugin works just like the leiningen plugin, in that you can put info about your project in your project.clj for autodoc like this:

`:autodoc { :name "Bugs", :page-title "Bugs API Documentation"}`

cake-autodoc will set the name, description, and source-path parameters from the cake configuration. Other parameters can be set via a map attached to the :autodoc key, as demonstrated above.

You can generally follow the instructions here: http://tomfaulhaber.github.com/autodoc/ the only differences are the names of the build tools and the way you get the plugin. See installation.

# installation

cake-autodoc is on clojars. You can add it to your dev-dependencies, and it will also grab autodoc and the required dependencies. Here is a sample project.clj:

    (defproject project "0.0.1-SNAPSHOT"
      :description "Description."
      :dependencies [[clojure "1.2.0"]]
      :dev-dependencies [[cake-autodoc "0.0.1-SNAPSHOT"]]
      :tasks [cake-autodoc.tasks])

