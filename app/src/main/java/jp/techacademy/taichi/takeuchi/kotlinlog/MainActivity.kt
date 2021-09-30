package jp.techacademy.taichi.takeuchi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("アレックス",15,"船")
        val human2 = Human("オノルド",20,"動物")

        human.say()
        human.think()
        human2.say()
        human2.think()

    }
}