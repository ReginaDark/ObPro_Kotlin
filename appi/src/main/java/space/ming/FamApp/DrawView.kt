package space.ming.FamApp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.*

class DrawView : View {
    var p: Paint? = null
    lateinit var circles: Array<Circle>
    private lateinit var ellipses: Array<Ellipse>
    private lateinit var rectangles: Array<Rectangle>
    private lateinit var squares: Array<Square>
    private var random: Random? = null

    constructor(context: Context?) : super(context) {
        init()
    }

    private fun init() {
        p = Paint()
        random = Random()
        circles = arrayOf(
                Circle(Point(400, 400), 200),
                Circle(Point(400, 600), 150)
        )
        squares = arrayOf(
                Square(Point(400, 400), 200),
                Square(Point(400, 600), 120)
        )
        rectangles = arrayOf(
                Rectangle(Point(400, 950), 100, 190),
                Rectangle(Point(400, 900), 80, 110)
        )
        ellipses = arrayOf(
                Ellipse(Point(400, 500), 100, 180),
                Ellipse(Point(400, 800), 50, 170)
        )
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.BLACK)
        for (c in circles) {
            c.draw(canvas)
        }
        for (e in ellipses) {
            e.draw(canvas)
        }
        for (r in rectangles) {
            r.draw(canvas)
        }
        for (s in squares) {
            s.draw(canvas)
        }
    }

    override fun invalidate() {
        for (c in circles) {
            c.moveTo(
                    -STEP + random!!.nextInt(STEP * 2),
                    -STEP + random!!.nextInt(STEP * 2)
            )
        }
        for (e in ellipses) {
            e.moveTo(-STEP + random!!.nextInt(STEP * 2),
                    -STEP + random!!.nextInt(STEP * 2)
            )
        }
        for (s in squares) {
            s.moveTo(-STEP + random!!.nextInt(STEP * 2),
                    -STEP + random!!.nextInt(STEP * 2)
            )
        }
        for (r in rectangles) {
            r.moveTo(-STEP + random!!.nextInt(STEP * 2),
                    -STEP + random!!.nextInt(STEP * 2)
            )
        }
        super.invalidate()
    }

    fun ChangeColor1() {
        for (r in rectangles) {
            r.changeColor(Color.WHITE)
        }
        invalidate()
    }

    fun ChangeColor2() {
        for (e in ellipses) {
            e.changeColor(Color.CYAN)
        }
        invalidate()
    }

    fun ChangeColor3() {
        for (s in squares) {
            s.changeColor(Color.BLUE)
        }
        invalidate()
    }

    companion object {
        private const val STEP = 20
    }
}