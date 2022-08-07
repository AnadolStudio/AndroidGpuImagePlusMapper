package com.anadolstudio.library.implementation.adjust

import com.anadolstudio.library.Function

class BrightnessFunction(
    private val brightness: Float,
    function: Function
) : Adjust(function) {

    override val subType: String = "brightness"

    override fun getFunction(): String = "${super.getFunction()}$brightness"

}
