package com.binarybrains.movit.view.elearning.ui

@Composable
fun PestaaElearning(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xffe6e6e6))
    ) {
        VariantThinGreen(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 68.dp,
                    y = 53.dp))
        Property1white(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 751.dp))
        Selection(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 61.dp,
                    y = 246.dp))
        Frame17()
    }
}

@Composable
fun VariantThinGreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 175.dp)
            .requiredHeight(height = 39.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 0.dp)
        ) {
            Text(
                text = "Aprende",
                color = Color(0xff9fffcb),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Medium))
        }
    }
}

@Composable
fun Property1white(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(64.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 49.dp)
            .background(color = Color(0xffe6e6e6))
    ) {
        Image(
            painter = painterResource(id = R.drawable.navbaricons),
            contentDescription = "NavBarIcons",
            colorFilter = ColorFilter.tint(Color(0xff004e64)),
            modifier = Modifier
                .requiredWidth(width = 25.dp)
                .requiredHeight(height = 20.dp))
        Image(
            painter = painterResource(id = R.drawable.navbaricons),
            contentDescription = "NavBarIcons",
            colorFilter = ColorFilter.tint(Color(0xff004e64)),
            modifier = Modifier
                .requiredWidth(width = 16.dp)
                .requiredHeight(height = 20.dp))
        Icon(
            painter = painterResource(id = R.drawable.iconcurrencyicon),
            contentDescription = "NavBarIcons",
            tint = Color(0xff004e64),
            modifier = Modifier
                .requiredWidth(width = 19.dp)
                .requiredHeight(height = 20.dp))
        Icon(
            painter = painterResource(id = R.drawable.iconsettingsicon),
            contentDescription = "NavBarIcons",
            tint = Color(0xff004e64),
            modifier = Modifier
                .requiredSize(size = 20.dp))
    }
}

@Composable
fun Selection(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(22.dp, Alignment.Top),
        modifier = modifier
    ) {
        Property1popup()
        Property1Default()
        Property1Default()
        Property1Default()
        Property1Default()
    }
}

@Composable
fun Property1popup(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(109.dp, Alignment.Start),
        modifier = modifier
            .requiredWidth(width = 256.dp)
            .clip(shape = MaterialTheme.shapes.medium)
    ) {
        Column(
            modifier = Modifier
                .weight(weight = 1f)
                .clip(shape = MaterialTheme.shapes.medium)
                .background(color = Color(0xff00a5cf))
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(109.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Property1white()
                Icon(
                    painter = painterResource(id = R.drawable.property1vector),
                    contentDescription = "E-learning-icons",
                    tint = Color(0xffe6e6e6),
                    modifier = Modifier
                        .requiredWidth(width = 25.dp)
                        .requiredHeight(height = 20.dp))
            }
            Status0()
        }
        Box(
            modifier = Modifier
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 85.dp)
                .clip(shape = MaterialTheme.shapes.medium)
                .background(color = Color(0xff00a5cf))
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(3.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredWidth(width = 248.dp)
                    .requiredHeight(height = 85.dp)
                    .padding(horizontal = 12.dp,
                        vertical = 4.dp)
            ) {
                Property1SmallBold()
                Property1Small()
                TypeLarge()
            }
            Image(
                painter = painterResource(id = R.drawable.polygon1),
                contentDescription = "Polygon 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 167.dp,
                        y = (-7).dp)
                    .requiredWidth(width = 28.dp)
                    .requiredHeight(height = 19.dp))
        }
    }
}

@Composable
fun Property1white(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 106.dp)
            .requiredHeight(height = 36.dp)
    ) {
        Row() {
            Text(
                text = "Lección 5",
                color = Color(0xffe6e6e6),
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium))
        }
    }
}

@Composable
fun Status0(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 256.dp)
            .requiredHeight(height = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = MaterialTheme.shapes.medium)
                .background(color = Color(0xff004e64)))
    }
}

@Composable
fun Property1SmallBold(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Text(
            text = "En esta lección",
            color = Color(0xffe6e6e6),
            style = TextStyle(
                fontSize = 12.sp))
    }
}

@Composable
fun Property1Small(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Text(
            text = "Tendrás un aprendizaje de ..",
            color = Color(0xffe6e6e6),
            style = TextStyle(
                fontSize = 12.sp))
    }
}

@Composable
fun TypeLarge(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 225.dp)
            .requiredHeight(height = 27.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xff004e64))
            .padding(horizontal = 32.dp,
                vertical = 12.dp)
    ) {
        Text(
            text = "Empezar",
            color = Color(0xff9fffcb),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium))
    }
}

@Composable
fun Property1Default(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(109.dp, Alignment.Start),
        modifier = modifier
            .requiredWidth(width = 256.dp)
            .clip(shape = MaterialTheme.shapes.medium)
            .background(color = Color(0xff00a5cf))
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(109.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(weight = 1f)
        ) {
            Property1white()
            Icon(
                painter = painterResource(id = R.drawable.property1vector),
                contentDescription = "E-learning-icons",
                tint = Color(0xffe6e6e6),
                modifier = Modifier
                    .requiredWidth(width = 25.dp)
                    .requiredHeight(height = 20.dp))
        }
        Status0()
    }
}

@Composable
fun Frame17(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(30.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 63.dp)
            .background(color = Color(0xff004e64))
            .padding(horizontal = 16.dp)
    ) {
        Property1Default()
        VariantThinGreen()
    }
}

@Composable
fun Property1Default(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
        modifier = modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xff004e64))
            .padding(all = 10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.returnleft),
            contentDescription = "Return-left",
            colorFilter = ColorFilter.tint(Color(0xff00a5cf)),
            modifier = Modifier
                .requiredWidth(width = 12.dp)
                .requiredHeight(height = 18.dp))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun PestaaElearningPreview() {
    PestaaElearning(Modifier)
}