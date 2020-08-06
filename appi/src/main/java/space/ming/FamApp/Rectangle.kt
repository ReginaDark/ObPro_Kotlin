package space.ming.FamApp

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class Rectangle(basePoint: Point?, width: Int, var height: Int) : Square(basePoint, width) {
    override fun draw(canvas: Canvas?) {
        canvas!!.drawRect(
                basePoint!!.x.toFloat(),
                basePoint!!.y.toFloat(),
                basePoint!!.x + width.toFloat(),
                basePoint!!.y + height.toFloat(),
                paint
        )
    }


    override fun changeColor(color: Int) {
        paint.color = color
    }

    companion object {
        private lateinit var paint: Paint
    }

    init {
        paint = Paint()
        paint.color = Color.YELLOW
    }
}