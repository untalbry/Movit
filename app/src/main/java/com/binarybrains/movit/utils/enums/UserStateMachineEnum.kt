package com.binarybrains.movit.utils.enums

enum class UserStateMachineEnum(val state: Int) {
    REQUESTED(0),
    APROVED(1),
    PAID(2),
    MORA(3),
    CANCELLED(4)

}