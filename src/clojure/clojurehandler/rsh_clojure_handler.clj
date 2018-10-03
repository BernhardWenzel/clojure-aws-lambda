(ns clojurehandler.rsh_clojure_handler
  (:require [clojure.java.io :as io]))
(gen-class
  :name "clojurehandler.RSHClojureHandler"
  :implements [com.amazonaws.services.lambda.runtime.RequestStreamHandler])
(defn -handleRequest [this input output ctx]
  (let [name (slurp input)]
    (with-open [o (io/writer output)]
      (.write o (str "Hello " name "!")))))
