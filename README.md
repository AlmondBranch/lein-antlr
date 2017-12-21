# lein-antlr

[![Clojars Artifact](https://img.shields.io/clojars/v/almondbranch/lein-antlr.svg)](https://clojars.org/almondbranch/lein-antlr)

Leiningen plugin for compiling an antlr4 grammar file. Simple implementation that is only a few lines of code and is easy to understand.

## Instructions

Inside of your `project.clj` file:

1. Add the plugin `[almondbranch/lein-antlr "1.0.0"]` to the `:plugins` section of `defproject`
2. Create a new key `:antlr-cmd` in `defproject` and set its value to a string containing the arguments that you would have sent to `antlr4` on the command line. For example, if you wanted to run `antlr4 grammar.g4 -visitor` you would add the line `:antlr-cmd "grammar.g4 -visitor"` to `defproject`

To run the antlr4 command specified inside of your `project.clj` just run `lein antlr` from the command prompt in the directory where `project.clj` is located.
