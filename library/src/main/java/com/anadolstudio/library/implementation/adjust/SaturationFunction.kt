package com.anadolstudio.library.implementation.adjust

import com.anadolstudio.library.Function

class SaturationFunction(
    private val saturation: Float,
    function: Function
) : Adjust(function) {

    override val subType: String = "saturation"

    override fun getFunction(): String = "${super.getFunction()}$saturation"

}
