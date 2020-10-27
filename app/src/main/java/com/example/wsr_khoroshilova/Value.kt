package com.example.wsr_khoroshilova

data class Value(
    val categories: List<Any>,
    val id: Int,
    val joke: String //задаём параиетры каждой шутки(категоря, id, текст шутки)
)