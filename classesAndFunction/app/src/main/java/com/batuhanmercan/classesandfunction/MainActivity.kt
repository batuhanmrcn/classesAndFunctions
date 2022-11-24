package com.batuhanmercan.classesandfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        //Void - Unit
       // mySum(10,30)

        //val button = findViewById<Button>(R.id.button1)


        //Return
        val result = myMultiply(11,55)
        //textView.text = "Result: ${result}"
        //Class


         //Objective & Instance

        val homer = Simpson("Homer Simpson",50,"Nuclear")

        //homer.age = 50
        //homer.job = "Nuclear"
        //homer.name= "Homer Simpson"

        println(homer.age)

        //Nullability
        //Nullable (?) && Non-null
        // !! vs ?
        var myString : String? = null
            println(myString)
        var myAge : Int? = null

        //1) Null Safety
        if (myAge != null){
            println(myAge * 10)
        } else {
            println("myAge null")
        }

        //2) safe call
        println(myAge?.compareTo(2))

        //3) elvis
        val myResult = myAge?.compareTo(2) ?: - 100
        println(myResult)



    }


    fun test(){
        println("test function")
    }
//Input - Return
    fun mySum(a:Int,b:Int){
       //resultText.text = "Result : ${a+b}"
    }
    fun myMultiply(sınav1:Int, sınav2:Int) : Int {
        return sınav1 * sınav2

    }

    fun makeSimpson(view : View){



        name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if(age == null){
            age = 0
        }

        val job = jobText.text.toString()
        val simpson = Simpson(name,age,job)

        resultText.text = "Name: ${name}, Age: ${age}, Job: ${job}"




    } //Scope

    fun scopeExample(view : View){

        println(name)

    }

}