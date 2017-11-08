(ns lein-antlr.core
 (:import
   [org.antlr.v4 Tool])
 (:use [clojure.string :only (split)])
)

(defn antlr
 [file]
 (Tool/main (into-array String [file]))
)

(defn split-args
 [args]
 (split args #" ")
)

(defn -main
 [& args]
 ;; TO DO - Remove this hard coded path...
 (antlr "/home/ubuntu/code/lein-antlr/Test.g4"))
