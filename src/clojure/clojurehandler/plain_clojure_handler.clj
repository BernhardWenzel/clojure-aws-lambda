(ns clojurehandler.plain_clojure_handler
  (:gen-class
    :name "clojurehandler.PlainClojureHandler"
    :methods [[myhandler [String com.amazonaws.services.lambda.runtime.Context] String]]))

(defn -myhandler [this s ctx]
  (str "Hello " s "!"))