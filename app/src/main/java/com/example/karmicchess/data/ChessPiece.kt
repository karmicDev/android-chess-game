package com.example.karmicchess.data

data class ChessPiece(
    val type: PieceType,
    val color: PieceColor
)

enum class PieceType {
    KING,
    QUEEN,
    BISHOP,
    KNIGHT,
    ROOK,
    PAWN
}

enum class PieceColor {
    WHITE,
    BLACK
}