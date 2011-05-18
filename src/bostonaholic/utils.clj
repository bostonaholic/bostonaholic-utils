(ns bostonaholic.utils)

(defn to-keyword [num]
  (if-not (keyword? num)
    (keyword (str num))
    num))

