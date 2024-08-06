package com.example.myapplication.android.auth.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.android.R
import com.example.myapplication.android.common.theming.LargeSpacing

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxSize()
    )
    {
        Text(
            text = stringResource(id = R.string.trending_posts_title),
            style = MaterialTheme.typography.subtitle1,
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = LargeSpacing),
            textAlign = TextAlign.Center
        )
    }
}