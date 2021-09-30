package jp.techacademy.taichi.takeuchi.kotlinlog

import android.util.Log

class Human: Animal,Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String ): super(name, age) {
        this.hobby = hobby
    }

    //私の名前は〜〜です。年は〜〜歳です。
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。年は" + this.age + "歳です。")
    }

    //「私は〜〜について考える。」
    override fun think() {
        Log.d("kotlintest", "「私は"+this.hobby + "について考える」")
    }
}