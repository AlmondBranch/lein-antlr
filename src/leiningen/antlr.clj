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
 (antlr-tool (get project :antlr-cmd)))
