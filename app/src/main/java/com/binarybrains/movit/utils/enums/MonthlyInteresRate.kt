package com.binarybrains.movit.utils.enums

enum class MonthlyInteresRate(val id: Int, val interest: Int) {
    FIRST_INTEREST(0, 45),
    SECOND_INTEREST(1, 30),
    THIRTH_INTEREST(2,20),
    FORTH_INTEREST(3, 10),
    FIFTH_INTEREST(4,15),
    SIX_INTEREST(5,5)
}
fun getMonthlyInterestRateById(id:Int):Int?{
    return MonthlyInteresRate.entries.find { it.id == id}?.interest
}