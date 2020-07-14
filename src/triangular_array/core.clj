(ns triangular-array.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn print-tri-arr [coll]
  (println (loop [remaining (drop 2 coll)
                  cur (second coll)
                  out ""
                  acc 1]
             (if (empty? remaining)
               (str out cur (str/join (repeat acc "|___")) "\n   "
                    (str/join "   " (butlast coll)))
               (recur (rest remaining)
                      (first remaining)
                      (str out cur (str/join (repeat acc "|___")) "\n")
                      (inc acc))))))

(defn -main
  [& args]
  ;; If no args, prompt user for array
  (if (empty? args)
    (do (print "Enter your array (states): ")
        (println)
        (print-tri-arr (str/split (read-line) #" ")))
    (print-tri-arr (if (coll? (first args)) (first args) args))))
