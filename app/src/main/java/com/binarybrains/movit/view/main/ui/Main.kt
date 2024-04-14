package com.binarybrains.movit.view.main.ui
@Composable
fun Main(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xff092f39))
    ) {
        VariantThinGreen(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 68.dp,
                    y = 53.dp))
        Property1Default(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 751.dp))
        VariantSmall1(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 8.dp,
                    y = 494.dp))
        VariantSmall1(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 127.dp,
                    y = 494.dp))
        VariantSmall(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 243.dp,
                    y = 494.dp))
        Text(
            text = "Hola de nuevo",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 181.dp,
                    y = 53.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 228.dp,
                    y = 92.dp)
                .requiredWidth(width = 98.dp)
                .requiredHeight(height = 25.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = Color(0xff62c38f)))
        Text(
            text = "Disponible",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 239.dp,
                    y = 94.dp))
        Text(
            text = "$ 200.00",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 64.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 227.dp))
        Text(
            text = "Credito disponible",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 39.dp,
                    y = 216.dp))
    }
}

@Composable
fun VariantThinGreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 175.dp)
            .requiredHeight(height = 39.dp))
}

@Composable
fun Property1Default(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(42.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 49.dp)
            .background(color = Color(0xff004e64))
    ) {
        Image(
            painter = painterResource(id = R.drawable.navbaricons),
            contentDescription = "NavBarIcons",
            colorFilter = ColorFilter.tint(Color(0xffe6e6e6)),
            modifier = Modifier
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 20.dp))
        Image(
            painter = painterResource(id = R.drawable.navbaricons),
            contentDescription = "NavBarIcons",
            colorFilter = ColorFilter.tint(Color(0xffe6e6e6)),
            modifier = Modifier
                .requiredWidth(width = 16.dp)
                .requiredHeight(height = 20.dp))
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 19.dp))
        Icon(
            painter = painterResource(id = R.drawable.iconcurrencyicon),
            contentDescription = "NavBarIcons",
            tint = Color(0xffe6e6e6),
            modifier = Modifier
                .requiredWidth(width = 19.dp)
                .requiredHeight(height = 20.dp))
        Icon(
            painter = painterResource(id = R.drawable.iconsettingsicon),
            contentDescription = "NavBarIcons",
            tint = Color(0xffe6e6e6),
            modifier = Modifier
                .requiredSize(size = 20.dp))
    }
}

@Composable
fun VariantSmall1(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .requiredWidth(width = 105.dp)
            .requiredHeight(height = 90.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xff004e64))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .requiredWidth(width = 105.dp)
                    .requiredHeight(height = 90.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredHeight(height = 67.dp)
                ) {
                    Property1Green()
                }
            }
            Image(
                painter = painterResource(id = R.drawable.coins),
                contentDescription = "coins",
                colorFilter = ColorFilter.tint(Color(0xff9fffcb)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 43.dp,
                        y = 11.dp)
                    .requiredSize(size = 16.dp))
        }
    }
}

@Composable
fun Property1Green(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(height = 47.dp)
    ) {
        Row() {
            Text(
                text = "Aprende",
                color = Color(0xff9fffcb),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium))
        }
    }
}

@Composable
fun VariantSmall(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .requiredWidth(width = 105.dp)
            .requiredHeight(height = 90.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xff004e64))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(height = 53.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 105.dp)
                        .requiredHeight(height = 53.dp)
                        .padding(horizontal = 4.dp)
                ) {
                    Property1Green()
                    Property10()
                }
                Image(
                    painter = painterResource(id = R.drawable.book),
                    contentDescription = "book",
                    colorFilter = ColorFilter.tint(Color(0xff9fffcb)),
                    modifier = Modifier
                        .align(alignment = Alignment.TopEnd)
                        .offset(x = (-12).dp,
                            y = 15.dp)
                        .requiredWidth(width = 10.dp)
                        .requiredHeight(height = 12.dp))
            }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                modifier = Modifier
                    .requiredWidth(width = 99.dp)
                    .requiredHeight(height = 36.dp)
                    .padding(horizontal = 8.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 99.dp)
                        .requiredHeight(height = 36.dp)
                ) {
                    Text(
                        text = "Tu lección en curso:\nCREDITO",
                        color = Color(0xffe6e6e6),
                        style = TextStyle(
                            fontSize = 8.sp))
                }
            }
        }
    }
}

@Composable
fun Property10(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 79.dp)
            .requiredHeight(height = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = MaterialTheme.shapes.small)
                .background(color = Color(0xff00a5cf)))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = MaterialTheme.shapes.small)
                .background(color = Color(0xff9fffcb)))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun PestaaMainPreview() {
    PestaaMain(Modifier)
}