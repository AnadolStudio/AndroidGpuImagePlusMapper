package com.anadolstudio.library.implementation.adjust

import com.anadolstudio.library.Function
import com.anadolstudio.library.util.StringConst.SPACE

open class WhiteBalanceFunction(
    protected val temperature: Float,
    protected val tint: Float,
    function: Function
) : Adjust(function) {

    override val subType: String = "whitebalance"

    override fun getFunction(): String = "${super.getFunction()}$temperature$SPACE$tint"

}
