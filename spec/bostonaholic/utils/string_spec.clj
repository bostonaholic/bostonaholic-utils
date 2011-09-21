(ns bostonaholic.utils.string_spec
  (:use speclj.core
        bostonaholic.utils.string))

(describe "Bostonaholic utils.string"

  (it "returns the middle of a string"
    (should= "sd" (middle "asdf"))
    (should= "" (middle "as"))))
