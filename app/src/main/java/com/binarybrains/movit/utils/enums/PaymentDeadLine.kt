package com.binarybrains.movit.utils.enums

enum class PaymentDeadLine(val id: Int, val numberOfMonths: Int) {
    FIRST_MONTH(0, 1),
    SECOND_MONTH(1, 3),
    THIRTH_MONTH(2, 3),
    FOURHT_MONTH(3, 6),
    FIFTH_MONTH(4, 6),
    SIX_MONTH(5, 12)
}
fun getPaymentDeadLineById(id: Int):Int?{
    return PaymentDeadLine.entries.find { it.id == id }?.numberOfMonths
}