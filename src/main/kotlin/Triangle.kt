class Triangle() {
    private var point1: Pair<Float, Float>
    private var point2: Pair<Float, Float>
    private var point3: Pair<Float, Float>
    private var checkPoint: Pair<Float, Float>

    init {
        point1 = Pair(0f,0f)
        point2 = Pair(0f,0f)
        point3 = Pair(0f,0f)
        checkPoint = Pair(0f,0f)
    }

    constructor(a: Pair<Float, Float>, b: Pair<Float, Float>,
                c: Pair<Float, Float>, p: Pair<Float, Float>): this() {
        point1 = a
        point2 = b
        point3 = c
        checkPoint = p
    }


    private fun q (ax: Float, ay: Float, bx: Float, by: Float, atx: Float, aty: Float): Float {
        return (atx * (by - ay) + aty * (ax - bx) + ay * bx - ax * by)
    }

    fun isInTriangle() {
        val q1 = q(point1.first, point1.second, point2.first, point2.second, checkPoint.first, checkPoint.second)
        val q2 = q(point2.first, point2.second, point3.first, point3.second, checkPoint.first, checkPoint.second)
        val q3 = q(point3.first, point3.second, point1.first, point1.second, checkPoint.first, checkPoint.second)

        if ((((q1 >= 0) && (q2 >= 0) && (q3 >= 0)) || ((q1 <= 0) && (q2 <= 0) && (q3 <= 0)))) {
            println("Точка находится внутри треугольника")
        }
        else {
            println("Точка находится за границами треугольника")
        }
    }


}