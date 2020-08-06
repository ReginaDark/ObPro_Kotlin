package space.ming.FamApp

import android.graphics.Canvas

abstract class Figure(var basePoint: Point?) {
    abstract fun draw(canvas: Canvas?)
    fun moveTo(dx: Int, dy: Int) {
        basePoint!!.x = basePoint!!.x + dx
        basePoint!!.y = basePoint!!.y + dy
    }

}