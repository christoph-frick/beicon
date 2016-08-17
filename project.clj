(defproject funcool/beicon "2.3.0"
  :description "Reactive Streams for Clojure(Script)"
  :url "https://github.com/funcool/beicon"
  :license {:name "Public Domain" :url "http://unlicense.org/"}
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.216" :scope "provided"]
                 [funcool/promesa "1.4.0" :scope "provided"]
                 [io.reactivex/rxjava "1.1.9"]]

  :deploy-repositories {"releases" :clojars
                        "snapshots" :clojars}
  :source-paths ["src" "assets"]
  :test-paths ["test"]
  :jar-exclusions [#"\.swp|\.swo|user.clj"]

  :codeina {:sources ["src"]
            :reader :clojurescript
            :target "doc/dist/latest/api"
            :src-uri "http://github.com/funcool/beicon/blob/master/"
            :src-uri-prefix "#L"}

  :plugins [[funcool/codeina "0.5.0"]
            [lein-ancient "0.6.10"]])
