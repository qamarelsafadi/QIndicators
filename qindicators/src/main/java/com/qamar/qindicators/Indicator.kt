package com.qamar.qindicators

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Indicators(
    count: Int,
    size: Int,
    spacer: Int,
    selectedPage: Int = 0,
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
            Row {
                Box(
                    modifier =
                    Modifier
                        .size(size.dp)
                        .clip(CircleShape)
                        .background(
                            if (selectedPage == it) {
                                doneSelection.add(it)
                                selectedColor
                            } else {
                                    unselectedColor
                            }
                        )
                )
                Spacer(modifier = Modifier.width(spacer.dp))
            }
        }
    }
}