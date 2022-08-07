package com.anadolstudio.library.implementation.selcolor

import com.anadolstudio.library.Function
import com.anadolstudio.library.FunctionDecorator
import com.anadolstudio.library.util.StringConst.SPACE

class SelColorFunction(
    private val red: SelColorItem = SelColorItem(),
    private val green: SelColorItem = SelColorItem(),
    private val blue: SelColorItem = SelColorItem(),
    private val cyan: SelColorItem = SelColorItem(),
    private val magenta: SelColorItem = SelColorItem(),
    private val yellow: SelColorItem = SelColorItem(),
    private val white: SelColorItem = SelColorItem(),
    private val gray: SelColorItem = SelColorItem(),
    private val black: SelColorItem = SelColorItem(),
    function: Function
) : FunctionDecorator(function) {

    override fun type(): String = "@selcolor"

    override fun getFunction(): String = super.getFunction() + convertAllDataToString()

    private fun convertAllDataToString(): String  =
        red.let { "red$it$SPACE" } +
        green.let { "green$it$SPACE" } +
        blue.let { "blue$it$SPACE" } +
        cyan.let { "cyan$it$SPACE" } +
        magenta.let { "magenta$it$SPACE" } +
        yellow.let { "yellow$it$SPACE" } +
        white.let { "white$it$SPACE" } +
        gray.let { "gray$it$SPACE" } +
        black.let { "black$it" }


    data class SelColorItem(
        val cyan: Int = 0,
        val megenta: Int = 0,
        val yellow: Int = 0,
        val black: Int = 0
    ) {
        override fun toString(): String = "($cyan, $megenta, $yellow, $black)"
    }

}
