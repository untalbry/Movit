package com.binarybrains.movit.utils.enums

enum class FinalCommission(val id: Int, val value: Double) {
    FIRST_FINAL(0, getCommisionById(0)!! + getIvaById(0)!!),
    SECOND_FINAL(1, getCommisionById(1)!! + getIvaById(1)!!),
    THIRTH_FINAL(2, getCommisionById(2)!! + getIvaById(2)!!),
    FOURTH_FINAL(3, getCommisionById(3)!! + getIvaById(3)!!),
    FIFTH_FINAL(4, getCommisionById(4)!! + getIvaById(4)!!),
    SIXTH_FINAL(5, getCommisionById(5)!! + getIvaById(5)!!)
}
fun getFinalCommissionById(id: Int): Double?{
    return FinalCommission.entries.find { it.id == id }?.value
}