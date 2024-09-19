package br.senai.jandira.sp.callme.telas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import br.senai.jandira.sp.callme.R

@Composable
fun LoginTheme() {
    var emailState= remember {
        mutableStateOf("")
    }
    var senhaState= remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFE3EFFF),
                        Color(0xFF275BC8)

                    ),
                )
            )
    ) {
        Spacer(modifier = Modifier.height(300.dp))
        Column (
            verticalArrangement = Arrangement.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(93.dp)
                    .padding(top = 23.dp),
                alignment = Alignment.Center
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    textAlign = TextAlign.Center,
                    text = "Seja bem vindo ao Callme!\nFaça seu login!",
                    fontSize = 22.sp,
                    color = Color(0xFF04276D),
                    fontWeight = FontWeight.Medium
                )

            }
            Spacer(modifier = Modifier.height(50.dp))
            Image(
                painter = painterResource(id = R.drawable.macallmesonhando),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .padding(top = 16.dp),
                alignment = Alignment.Center
            )

            Spacer(modifier = Modifier.height(40.dp))
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 24.dp),
                shape = RoundedCornerShape(32.dp)
            ){
                Row {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .width(120.dp)
                            .height(600.dp)
                            .background(
                                color = Color(0xFF2755B2),
                                shape = RoundedCornerShape(
                                    bottomEnd = 32.dp,
                                    bottomStart = 32.dp,
                                    topStart = 32.dp
                                )

                            )
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "E-mail",
                            fontSize = 17.sp,
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }

                    OutlinedTextField (value = emailState.value, onValueChange = {emailState.value = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color.Transparent, focusedBorderColor = Color.Transparent))
                }

            }
            Spacer(modifier = Modifier.height(16.dp))
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 24.dp),
                shape = RoundedCornerShape(32.dp)
            ){
                Row {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .width(120.dp)
                            .height(600.dp)
                            .background(
                                color = Color(0xFF2755B2),
                                shape = RoundedCornerShape(
                                    bottomEnd = 32.dp,
                                    bottomStart = 32.dp,
                                    topStart = 32.dp
                                )

                            )
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Senha",
                            fontSize = 17.sp,
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }
                    OutlinedTextField (value = senhaState.value, onValueChange = {senhaState.value = it},
                        colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color.Transparent, focusedBorderColor = Color.Transparent))
                }

            }


            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color.Transparent
                    ),
                modifier = Modifier,
            ) {
                Text(
                    text = "Esqueci minha senha",
                    color = Color(0xFF213787),
                    fontWeight = FontWeight.Bold,

                    modifier = Modifier
                        .padding(12.dp)
                        .clickable {

                        }


                )
            }

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color(0XFFE2EFFF)
                    ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(300.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(size = 32.dp)
            ) {
                Text(
                    text = "Login",
                    color = Color(0xFF1F55C6),
                    fontSize = 20.sp,
                    modifier = Modifier
                )

            }
            Card (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(30.dp)
                    .width(230.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0x800B4ED7)),
            shape = RoundedCornerShape(
                bottomEnd = 32.dp,
                bottomStart = 32.dp,)){
                Text(
                    textAlign = TextAlign.Center,
                    text = "Não tem conta? Faça seu cadastro",
                    fontSize = 13.sp,
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .fillMaxHeight()
                        .align(Alignment.CenterHorizontally),
                    lineHeight = 2.em
                   )
            }

        }


    }
}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    LoginTheme()
}
