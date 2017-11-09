(ns leiningen.antlr
 (:import
   [org.antlr.v4 Tool])
 (:use [clojure.string :only (split)])
)

(defn antlr-tool
 [file]
 (Tool/main (into-array String [file]))
)

(defn split-args
 [args]
 (split args #" ")
)

(defn antlr
 "Compiles antlr grammars"
 [project & args]
 ;; TO DO - Remove this hard coded path...
 (antlr-tool "/home/ubuntu/code/lein-antlr/Test.g4"))
