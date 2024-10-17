package com.example.karmicchess.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.karmicchess.ui.theme.KarmicChessTheme

@Composable
fun ChessBoard() {
    val boardSize = 8

    LazyVerticalGrid(
        columns = GridCells.Fixed(boardSize),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalArrangement = Arrangement.Center,
        content = {
            for (index in 0 until boardSize * boardSize) {
                val row = index / boardSize
                val col = index % boardSize
                val isWhiteSquare = (row + col) % 2 == 0

                this.item {
                    Box(Modifier
                        .aspectRatio(1f)
                        .background(if (isWhiteSquare) Color.White else Color.Gray)
                        .border(0.5.dp, color = Color.Gray)
                    )
                }
            }

        }
    )
}

@Preview(showBackground = true)
@Composable
fun ChessBoardPreview() {
    KarmicChessTheme {
        ChessBoard()
    }
}