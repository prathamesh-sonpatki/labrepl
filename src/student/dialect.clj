(ns student.dialect
  (:require [clojure.string :as str])
  )

(defn canadianize
  "Appends ',eh' at the end of string"
  [word]
  (str/replace word #"\.$" ",eh")
  )

(defn marathi
  "Appends 'Namaskar!' at the end"
  [word]
  (str word "Namskar!")
  )

(defn pig-latinize
  [word]
  (str/replace word #"^([^aeiou]*)(.*)$" "$2$1ay")
  )