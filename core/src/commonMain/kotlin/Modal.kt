package com.composables.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.KeyEvent

@Composable
internal expect fun Modal(
    onKeyEvent: (KeyEvent) -> Boolean = { false },
    onBackPressed: () -> Unit = { },
    content: @Composable () -> Unit
)