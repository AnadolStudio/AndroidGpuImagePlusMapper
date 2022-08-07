package com.anadolstudio.library

import android.graphics.Point
import com.anadolstudio.library.implementation.adjust.BrightnessFunction
import com.anadolstudio.library.implementation.adjust.ContrastFunction
import com.anadolstudio.library.implementation.adjust.SaturationFunction
import com.anadolstudio.library.implementation.adjust.WhiteBalanceFunction
import com.anadolstudio.library.implementation.curve.CurveFunction
import com.anadolstudio.library.implementation.selcolor.SelColorFunction
import org.junit.Assert.assertEquals
import org.junit.Test

class FunctionStringConvertTest {
    @Test
    fun curveFunctionTest() {
        val func = CurveFunction(
            rgb = listOf(Point(1, 1)),
            r = listOf(Point(1, 1)),
            g = listOf(Point(1, 1)),
            b = listOf(Point(1, 1)),
            function = Function.Empty
        ).getFunction()

        assertEquals("@curve RGB (0, 0) R (0, 0) G (0, 0) B (0, 0) ", func)
    }

    @Test
    fun whiteBalanceFunctionTest() {
        val func: String = WhiteBalanceFunction(
            1F,
            2.5F,
            Function.Empty
        ).getFunction()

        assertEquals("@adjust whitebalance 1.0 2.5", func)
    }

    @Test
    fun contrastFunctionTest() {
        val func: String = ContrastFunction(
            1F,
            Function.Empty
        ).getFunction()

        assertEquals("@adjust contrast 1.0", func)
    }

    @Test
    fun saturationFunctionTest() {
        val func: String = SaturationFunction(
            1F,
            Function.Empty
        ).getFunction()

        assertEquals("@adjust saturation 1.0", func)
    }

    @Test
    fun brightnessFunctionTest() {
        val func: String = BrightnessFunction(
            1F,
            Function.Empty
        ).getFunction()

        assertEquals("@adjust brightness 1.0", func)
    }

    @Test
    fun selColorFunctionTest() {
        assertEquals(
            "@selcolor red(0, 0, 0, 0) green(0, 0, 0, 0) blue(0, 0, 0, 0) cyan(0, 0, 0, 0) magenta(0, 0, 0, 0) yellow(0, 0, 0, 0) white(0, 0, 0, 0) gray(0, 0, 0, 0) black(0, 0, 0, 0)",
            SelColorFunction(function = Function.Empty).getFunction()
        )
    }

}
