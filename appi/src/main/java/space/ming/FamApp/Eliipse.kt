package space.ming.FamApp

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

 class Ellipse(basePoint: Point?, radius: Int, var radius2: Int) : Circle(basePoint, radius) {
    override  fun draw(canvas: Canvas?) {
        canvas!!.drawOval(
                basePoint!!.x.toFloat(),
                basePoint!!.y.toFloat(),
                basePoint!!.x + radius2 * 2.toFloat(),
                basePoint!!.y + radius * 2.toFloat(),
                paint
        )
    }

    fun changeColor(color: Int) {
        paint.color = color
    }

    companion object {
        private lateinit var paint: Paint
    }

    init {
        paint = Paint()
        paint.color = Color.BLUE
    }
}