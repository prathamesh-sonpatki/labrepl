(ns student.dialect
  (:require [clojure.string :as str])
)

(defn canadianize
  "Appends ',eh' at the end of string"
  [sentence]
  (str/replace sentence #"\.$" ",eh")
)

(defn marathi
  "Appends 'Namaskar!' at the end"
  [sentence]
  (str sentence "Namskar!")
)