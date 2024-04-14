package com.binarybrains.movit.utils.enums

enum class MaxCreditEnum (val id: Int, val credit: Double){
    FIRST_CREDIT(0, 100.0),
    SECOND_CREDIT(1, 500.0),
    THIRTH_CREDIT(2, 1000.0),
    FORTH_CREDIT(3, 2000.0),
    FIFTH_CREDIT(4, 3000.0),
    SIXTH_CREDIT(5,5000.0)
}
fun getCreditValueById(id: Int): Double?{
    return MaxCreditEnum.entries.find { it.id == id }?.credit
}