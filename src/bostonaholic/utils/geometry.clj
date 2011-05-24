(ns bostonaholic.utils.geometry)

(defn line-segment [start end]
  "create a list of points on a cartesian plane"
  ;;TODO: 3D plane
  (let [x1 (first start) x2 (first end)
        y1 (last start)  y2 (last end)
        dx (if (> x1 x2) -1 1)
        dy (if (> y1 y2) -1 1)]
    (for [x (range x1 (+ dx x2) dx)
          y (range y1 (+ dy y2) dy)]
      [x y])))
