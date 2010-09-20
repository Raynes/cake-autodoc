(ns cake-autodoc.tasks
  (:use cake cake.core autodoc.autodoc))

(deftask autodoc []
  "Generates autodoc documentation for your project based on keys defined in project.clj." 
  (autodoc
   (merge
    (select-keys *project* [:name :description :root])
    (:autodoc *project*))))