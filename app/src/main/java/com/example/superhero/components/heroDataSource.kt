package com.example.superhero.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superhero.model.Hero


@Composable
fun HeroCard(hero: Hero,modifier: Modifier = Modifier) {
    Card(elevation = 2.dp, modifier = Modifier.padding(8.dp)) {
        Row(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .sizeIn(minHeight = 72.dp)
                .background(MaterialTheme.colors.surface), verticalAlignment = Alignment.CenterVertically) {
            Column (modifier = Modifier.weight(1f)){
                Text(text = stringResource(hero.nameRes), style = MaterialTheme.typography.h3, fontSize = 25.sp)
                Text(text = stringResource(hero.descriptionRes), style = MaterialTheme.typography.body1)
            }
            Spacer(Modifier.width(16.dp))
            Box(modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(8.dp))) {

                Image(
                    painter = painterResource(hero.imageRes),
                    contentDescription = null,
                    alignment = Alignment.TopCenter,
                    contentScale = ContentScale.FillWidth
                )
            }

        }
    }
}