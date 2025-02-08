package com.example.gomesdapaz_renato_as1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gomesdapaz_renato_as1.ui.theme.GomesdaPaz_Renato_AS1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GomesdaPaz_Renato_AS1Theme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GomesdaPaz_Renato_AS1()
                }
            }
        }
    }
}

@Composable
fun GomesdaPaz_Renato_AS1() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.android_logo)
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(text = stringResource(R.string.renato_gomesdapaz),color = Color.White)
        Text(text = stringResource(R.string.business),color = Color.Green)

    }
    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 70.dp),
             horizontalAlignment = Alignment.CenterHorizontally,
             verticalArrangement = Arrangement.Center

    ){
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 100.dp),

            ){
            Text(text = stringResource(R.string.phone_number), modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp),
        ){
            Text(text = stringResource(R.string.email_text), modifier = Modifier.padding(start = 50.dp),color = Color.White)
                    }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
//            Text(text = stringResource(R.string.share_text), modifier = Modifier.padding(start = 75.dp),color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    GomesdaPaz_Renato_AS1Theme {
        Surface{
            GomesdaPaz_Renato_AS1()
        }

    }
}