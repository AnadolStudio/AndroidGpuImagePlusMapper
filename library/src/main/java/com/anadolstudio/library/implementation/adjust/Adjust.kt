package com.anadolstudio.library.implementation.adjust

import com.anadolstudio.library.Function
import com.anadolstudio.library.FunctionDecorator

abstract class Adjust(function: Function) :FunctionDecorator(function) {

    abstract val subType: String

    override fun type(): String = "@adjust $subType"
}
