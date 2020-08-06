package space.ming.FamApp

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

open class Square(basePoint: Point?, var width: Int) : Figure(basePoint!!) {
    override fun draw(canvas: Canvas?) {
        canvas!!.drawRect(
                basePoint!!.x.toFloat(),
                basePoint!!.y.toFloat(),
                basePoint!!.x + width.toFloat(),
                basePoint!!.y + width.toFloat(),
                paint
        )
    }

    open fun changeColor(color: Int) {
        paint.color = color
    }

    companion object {
        private lateinit var paint: Paint
    }

    init {
        paint = Paint()
        paint.color = Color.GREEN
    }
}