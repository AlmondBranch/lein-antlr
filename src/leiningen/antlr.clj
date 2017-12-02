(ns leiningen.antlr
 (:import
   [org.antlr.v4 Tool]
   [com.github.almondbranch.command_line_parser CmdArgsReader])
 (:use [clojure.string :only (split)])
)

(defn antlr-tool
 [args]
 (Tool/main (into-array String args))
)

(defn split-args
 [args]
 (CmdArgsReader/read args)
)

(defn antlr
 "Compiles antlr grammars"
 [project & args]
  (-> (get project :antlr-cmd)
     split-args
     antlr-tool)
)
