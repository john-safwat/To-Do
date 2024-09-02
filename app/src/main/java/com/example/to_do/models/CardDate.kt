package com.example.to_do.models

import java.util.Date

data class CardDate(
    val month: String,
    val dayNumber: String,
    val dayName: String,
    val dateTime: Date,
    var isSelected: Boolean
)