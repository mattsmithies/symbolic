(ns symbolic.core)

;; if
(defmacro ? [pred a b]
`(if ~pred ~a ~b))

;; not if
(defmacro !? [pred a b]
`(not (if ~pred ~a ~b)))

;;some
(defmacro ∑ [fun coll]
	`(some ~fun ~coll))

(defmacro )


