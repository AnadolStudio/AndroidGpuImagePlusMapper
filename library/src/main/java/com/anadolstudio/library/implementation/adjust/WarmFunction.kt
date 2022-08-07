package com.anadolstudio.library.implementation.adjust

import com.anadolstudio.library.Function

class WarmFunction(temperature: Float, function: Function) :
    WhiteBalanceFunction(temperature = temperature, tint = TINT, function = function) {

        private companion object{
            const val TINT = 2.5F
        }
}
