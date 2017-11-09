(ns leiningen.antlr
 (:import
   [org.antlr.v4 Tool])
 (:use [clojure.string :only (split)])
)

(defn antlr-tool
 [args]
 (Tool/main (into-array String args))
)

(defn split-args
 [args]
 (split args #" ")
)

(defn antlr
 "Compiles antlr grammars"
 [project & args]
  (-> (get project :antlr-cmd)
     split-args
     antlr-tool)
)
