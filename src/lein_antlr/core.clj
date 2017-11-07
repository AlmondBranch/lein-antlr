(ns lein-antlr.core
 (:import
   [org.antlr.v4 Tool]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main
 [& args]
 (foo "Test"))
