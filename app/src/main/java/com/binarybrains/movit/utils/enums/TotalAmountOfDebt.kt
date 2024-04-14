package com.binarybrains.movit.utils.enums

enum class TotalAmountOfDebt (val id: Int, val amount: Double){
    FIRST_TOTAL(0, getCreditValueById(0)!! + getFinalCommissionById(0)!!),
    SECOND_TOTAL(1, getCreditValueById(1)!! + getFinalCommissionById(1)!!),
    THIRTH_TOTAL(2, getCreditValueById(2)!! + getFinalCommissionById(2)!!),
    FOURTH_TOTAL(3, getCreditValueById(3)!! + getFinalCommissionById(3)!!),
    FIFTH_TOTAL(4, getCreditValueById(4)!! + getFinalCommissionById(4)!!),
    SIXTH_TOTAL(5, getCreditValueById(5)!! + getCreditValueById(5)!!)
}
fun getTotalAmountOfDebtById(id: Int): Double ?{
    return TotalAmountOfDebt.entries.find { it.id == id }?.amount
}