(ns bostonaholic.utils.string)

(defn middle [s]
  (subs (str s)
        1
        (- (.length (str s)) 1)))
