package com.binarybrains.movit.utils.enums

enum class Commission(val id: Int, val commissionValue: Double) {
    FIRST_COMMISION(0, 5.0),
    SECOND_COMMISION(1, 25.0),
    THIRTH_COMMISION(2, 50.0),
    FORTH_COMMISION(3, 100.0),
    FIFTH_COMMISION(4, 150.0),
    SIXTH_COMMISION(5, 250.0)

}
fun getCommisionById(id: Int): Double?{
    return Commission.entries.find { it.id == id }?.commissionValue;
}