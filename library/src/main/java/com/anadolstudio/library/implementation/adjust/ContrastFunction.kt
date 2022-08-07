package com.anadolstudio.library.implementation.adjust

import com.anadolstudio.library.Function

class ContrastFunction(
    private val contrast: Float,
    function: Function
) : Adjust(function) {

    override val subType: String = "contrast"

    override fun getFunction(): String = "${super.getFunction()}$contrast"

}
