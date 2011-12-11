(defproject easy-pos "1.0.0-SNAPSHOT"
  :description "easy-pos is a web-based POS system"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "0.6.5"]
                 [hiccup "0.3.7"]]
  :dev-dependencies [[lein-ring "0.4.5"]]
  :ring {:handler easy-pos.core/app})
