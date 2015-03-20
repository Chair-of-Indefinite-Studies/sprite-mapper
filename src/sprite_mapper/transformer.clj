(ns sprite-mapper.transformer
  (:import java.awt.image.BufferedImage)
  (:import java.awt.Color))

(defn color-tranform [color]
  Color/GREEN)

(defn place-sprite [image sprite x y]
  "Places sprite at location x, y in image"
  (let [tag-index (fn [index color] {:index index :color color})
        pallete-data (map-indexed  tag-index (:pallete sprite))]
    (for [data pallete-data]
      (let [index (:index data) color (color-transform (:color data)) points (:pixels sprite)]
        (for [[dx dy] (get points index)]
          (.setRGB image (+ x dx) (+ y dy) color))))))
