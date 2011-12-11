(ns easy-pos.route.routes
  (:use compojure.core)
  (require [compojure.route :as route]
           [compojure.handler :as handler]
           [compojure.response :as response]))

(defroutes main-routes
  (GET "/user/:id" [id] 
    (str "<h1>Hello User " id "</h1>"))
  (route/resources "/")
  (route/not-found "Page not found"))

