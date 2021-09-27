package jp.techacademy.taichi.takeuchi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  //追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト") ; Log.d("kotlintest", "ログ2")   // ここを追加

        //
        var num = 10
        Log.d("kotlintest",Integer.toString(num))

        num =50
        Log.d("kotlintest",num.toString())

    }
}