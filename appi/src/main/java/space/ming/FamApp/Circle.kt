package space.ming.FamApp

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

open class Circle(basePoint: Point?, var radius: Int) : Figure(basePoint) {
    public override fun draw(canvas: Canvas?) {
        canvas!!.drawCircle(
                basePoint!!.x.toFloat(),
                basePoint!!.y.toFloat(),
                radius.toFloat(),
                paint
        )
    }

    companion object {
        private lateinit var paint: Paint
    }

    init {
        paint = Paint()
        paint.color = Color.RED
    }
}