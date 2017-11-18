(defproject pigdicegame "0.1.0-SNAPSHOT"
  :description "Pig the Dice Game"
  :url ""
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot pigdicegame.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
