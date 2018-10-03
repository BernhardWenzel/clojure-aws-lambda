(ns clojurehandler.pojo_clojure_handler
  (:import (javahandler Request Response)))

(gen-class
  :name "clojurehandler.POJOClojureHandler"
  :methods [[myhandler [javahandler.Request com.amazonaws.services.lambda.runtime.Context] javahandler.Response]])

(defn -handleRequest [this request ctx]
  (Response. (str "Hello " (.getFirstName request) " " (.getLastName request) "!")))