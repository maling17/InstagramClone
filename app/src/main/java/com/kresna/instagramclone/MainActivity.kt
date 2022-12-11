package com.kresna.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kresna.instagramclone.ui.theme.InstagramCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { HeaderStorySection() },
                    bottomBar = { BottomSheetSection() },
                    content = { padding -> ContentSection(modifier = Modifier.padding(padding)) }
                )
            }
        }
    }
}

@Composable
fun HeaderStorySection() {
    TopAppBar(
        backgroundColor = Color.White,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        val appIcons = Icons.Rounded
        Row(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Instagram",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(icon = appIcons.AddCircle, namaIcon = "Tambah Icon", 24)
                IconButton(icon = appIcons.Favorite, namaIcon = "Tambah Icon", 24)
                IconButton(icon = appIcons.Send, namaIcon = "Tambah Icon", 24)
            }
        }
    }

}

@Composable
fun ContentSection(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        ContentItem("Maling17")
        ContentItem("Kresnaa09")
        ContentItem("KresMal1709")
        ContentItem("MalKres0917")
    }
}

@Composable
fun BottomSheetSection() {
    val appIcons = Icons.Rounded
    BottomNavigation(backgroundColor = Color.White) {
        IconButton(appIcons.Home, "Home", 32)
        IconButton(appIcons.Search, "Search", 32)
        IconButton(appIcons.PlayArrow, "Reels", 32)
        IconButton(appIcons.ShoppingCart, "Keranjang", 32)
        IconButton(appIcons.Person, "Profil", 32)
    }
}

@Composable
fun IconButton(icon: ImageVector, namaIcon: String, size: Int, colorIcon: Color = Color.Black) {
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 5.dp)
            .fillMaxHeight()
    ) {
        Icon(
            icon,
            tint = colorIcon,
            contentDescription = namaIcon,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxHeight()
                .width(size.dp)
        )
    }
}

@Composable
fun ContentItem(username: String) {
    val appIcons = Icons.Rounded
    Column(modifier = Modifier.background(Color.White)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = username,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                Icon(
                    Icons.Rounded.MoreVert,
                    tint = Color.Black,
                    contentDescription = "More",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp),
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Content Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                appIcons.FavoriteBorder,
                tint = Color.Black,
                contentDescription = "More",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                appIcons.Email,
                tint = Color.Black,
                contentDescription = "More",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                appIcons.Send,
                tint = Color.Black,
                contentDescription = "More",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                appIcons.Share,
                tint = Color.Black,
                contentDescription = "More",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
            )
            Spacer(modifier = Modifier.width(12.dp))
        }
        Spacer(modifier = Modifier.height(12.dp))
        Column(modifier = Modifier.padding(horizontal = 12.dp)) {
            Text(
                text = "9999 Views",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quis varius quam quisque id. Adipiscing elit duis tristique sollicitudin nibh sit. Venenatis tellus in metus vulputate eu. In dictum non consectetur a erat nam. Mauris cursus mattis molestie a iaculis at. ",
                style = TextStyle(fontWeight = FontWeight.Normal),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "View All 99 comments",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal
                ),
            )
            Spacer(modifier = Modifier.height(10.dp))

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstagramCloneTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { HeaderStorySection() },
            bottomBar = { BottomSheetSection() },
            content = { padding -> ContentSection(modifier = Modifier.padding(padding)) }
        )
    }
}