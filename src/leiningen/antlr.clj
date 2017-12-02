(ns leiningen.antlr
 (:import
   [org.antlr.v4 Tool]
   [com.github.almondbranch.command_line_parser CmdArgsReader])
)

(defn antlr
 "Compiles antlr grammars"
 [project & args]
  (-> (get project :antlr-cmd)
     CmdArgsReader/read
     Tool/main)
)
