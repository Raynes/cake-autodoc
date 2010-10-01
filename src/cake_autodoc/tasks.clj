(ns cake-autodoc.tasks
  (:use cake cake.core))

(deftask autodoc
  "Generates autodoc documentation for your project based on keys defined in project.clj."
  (prn *command-line-args*)
  (bake (:use autodoc.autodoc) []
        (autodoc
         (merge
          (select-keys *project* [:name :description :root :source-path])
          (:autodoc *project*))
         (next *command-line-args*))))