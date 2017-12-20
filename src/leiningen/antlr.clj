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

(defn get-output-arg-value
 "Retrieves the value of the output argument in the antlr command line"
 [cmd-line]
  (let [args (seq (CmdArgsReader/read cmd-line))]
    (second (drop-while #(not= % "-o") args)
  )))
