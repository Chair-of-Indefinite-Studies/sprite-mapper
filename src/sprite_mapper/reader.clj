(ns sprite-mapper.reader
  (:use [clojure.data.json :only (read-str)]))

(defn read-from-string [input]
  "returns a representation of a spritem"
  (clojure.data.json/read-str input))
