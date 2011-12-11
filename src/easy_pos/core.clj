(ns easy-pos.core
    (:use compojure.core
          easy-pos.route.main-routes)
    (:require [compojure.route :as route]
              [compojure.handler :as handler]))

(def app
  (handler/site main-routes))
