(ns bostonaholic.utils.geometry_spec
  (:use speclj.core
        bostonaholic.utils.geometry))

(describe "Bostonaholic utils.geometry"

  (it "should return a sequence of coords"
    (should= '([5 7] [5 8]) (line-segment [5 7] [5 8]))
    (should= '([5 7] [5 8] [5 9]) (line-segment [5 7] [5 9]))
    (should= '([5 7] [6 7] [7 7]) (line-segment [5 7] [7 7]))))