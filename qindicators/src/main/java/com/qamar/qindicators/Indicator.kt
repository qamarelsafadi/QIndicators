package com.qamar.qindicators

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Indicators(
    count: Int,
    size: Int,
    spacer: Int,
    selectedIndex: Int = 0,
    indicatorSelectedLength: Int = 60,
    modifier: Modifier = Modifier
        .fillMaxWidth(),
    selectedColor: Color,
    unselectedColor: Color
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(count) {
            val isSelected = selectedIndex == it
            IndicatorView(
                isSelected, size, indicatorSelectedLength, selectedColor, unselectedColor, spacer
            )
        }
    }
}

@Composable
private fun IndicatorView(
    isSelected: Boolean,
    size: Int,
    indicatorSelectedLength: Int,
    selectedColor: Color,
    unselectedColor: Color,
    spacer: Int
) {
    val color: Color by animateColorAsState(
        targetValue = if (isSelected) {
            selectedColor
        } else {
            unselectedColor
        },
        animationSpec = tween(
            durationMillis = 1000,
        )
    )
    val width: Dp by animateDpAsState(
        targetValue = if (isSelected) {
            indicatorSelectedLength.dp
        } else {
            size.dp
        },
        animationSpec = tween(
            durationMillis = 1000,
        )
    )
    Row {
        Box(
            modifier =
            Modifier
                .size(
                    width = width,
                    height = size.dp
                )
                .clip(CircleShape)
                .background(
                    color
                )
        )
        Spacer(modifier = Modifier.width(spacer.dp))
    }
}