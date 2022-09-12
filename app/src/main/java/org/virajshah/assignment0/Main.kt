package org.virajshah.assignment0

class Main {
    fun main(args: Array<String>) {
        print("Let's create some shapes!")

        val rectLen = decimalInput("Rectangle Length")
        val rectHeight = decimalInput("Rectangle Height")

        val circleRadius = decimalInput("Circle Radius")

        val triangleA = decimalInput("Triangle Side #1")
        val triangleB = decimalInput("Triangle Side #2")
        val triangleC = decimalInput("Triangle Side #3")

        val equilateralTriangleSidelen = decimalInput("Equilateral Triangle Side Length")

        val rect: Shape = Rectangle(rectLen, rectHeight)
        val circle: Shape = Circle(circleRadius)
        val triangle: Shape = Triangle(triangleA, triangleB, triangleC)
        val equiTriangle: Shape = EquilateralTriangle(equilateralTriangleSidelen)

        printShape("Rectangle", rect)
        printShape("Circle", circle)
        printShape("Triangle", triangle)
        printShape("Equilateral Triangle", equiTriangle)
    }

    private fun printShape(name: String, shape: Shape) {
        print(String.format("[%s] ", name))
        shape.printDimensions()
        print(" ; area = ")
        print(shape.getArea())
        println()
    }

    private fun decimalInput(message: String): Double {
        print(String.format("%s: ", message))
        val input = readLine()

        if (input === null) {
            throw Error(String.format("Invalid input"))
        }

        try {
            return input.toDouble()
        } catch (e: NumberFormatException) {
            throw Error(String.format("%s is an invalid number", input))
        }
    }
}