fun main() {
    //var triangle1 = Triangle(Pair(-6f, -2f), Pair(2f, 12f), Pair(12f, -4f), Pair(4f, 4f))
    println("Программа проверят входит ли точка в треугольник\nНа ввод подаются координаты вершин треугольника и точки")
    val myTriangle = triangleInit()
    myTriangle.isInTriangle()
}

fun triangleInit(): Triangle {
    val points = mutableListOf<Pair<Float, Float>>()
    println("Первые три точки - координаты треугольника\nНа ввод можно подавать дробные числа")
    for (i in 0 until 4) {
        points.add(pairFloatValidate("Введите координаты ${i + 1} точки через пробел: "))
    }
    return Triangle(points[0], points[1], points [2], points[3])
}

fun pairFloatValidate(message: String): Pair<Float, Float> {
    print(message)
    val result: Pair<Float, Float>
    try {
        val userInput = readln().split(' ', limit = 2)
        result = Pair(userInput.first().toFloat(), userInput[1].toFloat())
    }
    catch (e: Exception) {
        println("Ошибка ввода!\nИспользуйте только числа (можно использовать дробные)")
        return pairFloatValidate(message)
    }
    return result
}