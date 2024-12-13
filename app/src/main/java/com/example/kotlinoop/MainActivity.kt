package com.example.kotlinoop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
           var myUser = User("Fazil",24)
            myUser.name="Kamil"
            myUser.age=44

        println(myUser.name)
        println(myUser.age.toString())

        //encapsulation
        var james = Musician("James","Guitar",55)
        println(james.age.toString())
        println(james.returnBandName("Fazil"))
        println(james.returnBandName("Kamil"))

        //inheritance
        val lars = SuperMusician("Lars","Drums",65)
        println(lars.name)
        lars.sing()

        //polymorphism

        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorphism
        val animal=Animal()
        animal.sing()

        val barley=Dog()
        barley.test()
        barley.sing()

        //abstract & interface

        //var myPeople=People()
        var myPiano = Piano()
        myPiano.brand="Yamaha"
        myPiano.digital=false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions
        val testString = {myString : String -> println(myString) }
        testString("My Lambda String")

        val multiplyLamnbda = {a:Int,b:Int -> a*b}
        println(multiplyLamnbda(7,19))

        val multiplyLambda2 : (Int,Int) -> Int ={a,b -> a*b}
        println(multiplyLambda2(9,47))

        //asynchrnous

        //callback function,listener function, cmpletion function

        fun downloadMusicians(url:String,completion : (Musician) -> Unit){
            val kirkHammet = Musician("Kirk","Guitar",55)
            completion(kirkHammet)
        }
        downloadMusicians("google.com",{ musician ->
            println(musician.name)
        })
    }

}