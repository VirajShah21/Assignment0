package org.virajshah.assignment0

import kotlin.math.sqrt

interface Dimensionable {
    fun printDimensions()
}

abstract class Shape(private val name: String) : Dimensionable {
    abstract fun getArea(): Double
}

open class Rectangle(
    private val length: Double,
    private val height: Double,
    name: String = "Rectangle"
) :
    Shape(name) {
    override fun printDimensions() {
        print(String.format("%.2f x %.2f", length, height))
    }

    override fun getArea(): Double {
        return length * height
    }
}

class Square(s: Double) : Rectangle(s, s)

class Circle(private val radius: Double) : Shape("Circle") {
    override fun printDimensions() {
        print(String.format("r = %.2f", radius))
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}

open class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double,
    name: String = "Triangle"
) :
    Shape(name) {
    override fun printDimensions() {
        print(String.format("%.2f x %.2f x %.2f", a, b, c))
    }

    override fun getArea(): Double {
        val s = 0.5 * (a + b + c)
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}

class EquilateralTriangle(s: Double) : Triangle(s, s, s)