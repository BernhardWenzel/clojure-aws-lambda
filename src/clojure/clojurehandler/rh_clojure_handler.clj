(ns clojurehandler.rh_clojure_handler
  (:import (javahandler Request Response)))
(gen-class
  :name "clojurehandler.RHClojureHandler"
  :implements [com.amazonaws.services.lambda.runtime.RequestHandler])
(defn -handleRequest [this request ctx]
  (Response. (str "Hello " (.getFirstName request) " " (.getLastName request) "!")))
