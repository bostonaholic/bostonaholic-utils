(ns bostonaholic.utils.math.prime
  (:use bostonaholic.utils.math))

(defn prime? [x]
  (cond
    (or (= x 2) (= x 3))
      true
    (or (< x 2) (even? x))
      false
    :else (no-factors? x)))

(defn prime-factors [x]
  (filter prime? (factors x)))

(defn prime-seq []
  (filter prime? (iterate inc 1)))

(defn nth-prime [n]
  (last (take n (prime-seq))))

(defn primes-below [n]
  (take-while #(< % n) (prime-seq)))
