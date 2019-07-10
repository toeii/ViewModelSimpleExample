package com.toeii.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.toeii.lifecycle.model.BaseModel
import com.toeii.lifecycle.model.BaseModel2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userModel = ViewModelProviders.of(this)[BaseModel::class.java]
        val userModel2 = BaseModel2()
        val tvContent = findViewById<TextView>(R.id.tv_content)

        if(userModel.userTag.isNotEmpty()){
            tvContent.text = userModel.userTag
        }

//        if(userModel2.userTag.isNotEmpty()){
//            tvContent.text = userModel2.userTag
//        }

        tvContent.setOnClickListener {
            userModel.userTag = "Hello BaseModel"
//            userModel2.userTag = "Hello BaseModel2"
            tvContent.text = userModel.userTag
        }

    }

}
