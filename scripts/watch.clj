(require '[cljs.build.api :as b])

(b/watch (b/inputs "test" "src")
  {:main 'beicon.tests-runner
   :target :nodejs
   :output-to "out/tests.js"
   :output-dir "out"
   :optimizations :none
   :pretty-print true
   :language-in  :ecmascript5
   :language-out :ecmascript5
   :verbose true})
