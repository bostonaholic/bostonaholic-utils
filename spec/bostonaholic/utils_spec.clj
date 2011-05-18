(ns bostonaholic.utils_spec
  (:use bostonaholic.utils
        speclj.core))

(describe "Bostonaholic utils"

  (it "should convert a number to a symbol"
    (should= :123 (to-keyword 123))))
