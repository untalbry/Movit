package com.binarybrains.movit.utils.enums

enum class IvaEnum (val id: Int, val ivaValue: Double){
    IVA_FIRST(0, 0.80),
    IVA_SECOND(1, 4.0),
    IVA_THIRTH(2, 8.0),
    IVA_FOURTH(3, 16.0),
    IVA_FIFTH(4, 24.0),
    IVA_SIXTH(5, 40.0)
}
fun getIvaById(id: Int): Double?{
    return IvaEnum.entries.find { it.id == id }?.ivaValue
}