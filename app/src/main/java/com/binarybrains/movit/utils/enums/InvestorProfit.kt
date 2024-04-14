package com.binarybrains.movit.utils.enums

enum class InvestorProfit(val id: Int, val value: Double) {
    FIRST_PROFIT(0, 3.33),
    SECOND_PROFIT(1, 23.56),
    THIRTH_PROFIT(2, 32.56),
    FOURTH_PROFIT(3, 59.45),
    FIFTH_PROFIT(4, 131.40),
    SIXTH_PROFIT(5, 141.13)
}
fun getInvestorProfitById(id: Int): Double?{
    return InvestorProfit.entries.find { it.id == id }?.value
}