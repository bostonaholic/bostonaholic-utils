(ns bostonaholic.utils.math.fibonacci_spec
  (:use speclj.core
        bostonaholic.utils.math.fibonacci))

(describe "math.fibonacci tests"

  (it "should return first x items in fibonacci sequence"
    (should= '(0 1 1) (fib 3))
    (should= '(0 1 1 2 3 5 8 13) (fib 8)))

  (it "should return items in fib sequence less than x"
    (should= '(0) (fib-less-than 1))
    (should= '(0 1 1 2 3 5) (fib-less-than 8))))

