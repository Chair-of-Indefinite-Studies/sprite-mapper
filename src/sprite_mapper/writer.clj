(ns sprite-mapper.writer
  (:import javax.imageio.ImageIO))

(defn write-png [image file]
  "Write BufferedImage image to file"
  (ImageIO/write image "png" file))
