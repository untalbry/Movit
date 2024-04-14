package com.binarybrains.movit.utils.enums

enum class MonthlyPayment(val id: Int, val value: Double) {
    FISRT_MONTHLY_PAYMENT(0, getTotalAmountOfDebtById(0)!! + getInvestorProfitById(0)!!),
    SECOND_MONTHLY_PAYMENT(1, getTotalAmountOfDebtById(1)!! + getInvestorProfitById(1)!!),
    THIRTH_MONTLHY_PAYMENT(2, getTotalAmountOfDebtById(2)!! + getInvestorProfitById(2)!!),
    FOURTH_MONTLHY_PAYMENT(3, getTotalAmountOfDebtById(3)!! + getInvestorProfitById(3)!!),
    FIFTH_MONTHLY_PAYMENT(4, getTotalAmountOfDebtById(4)!! + getInvestorProfitById(4)!!),
    SIXTH_MONTHTLY_PAYMENT(5, getTotalAmountOfDebtById(5)!! + getInvestorProfitById(5)!!)
}
fun getMonthlyPaymentById(id: Int): Double?{
    return MonthlyPayment.entries.find { it.id == id }?.value
}