package com.toeii.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.toeii.lifecycle.model.BaseModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvContent = findViewById<TextView>(R.id.tv_content)
        val baseModel = ViewModelProviders.of(this)[BaseModel::class.java]
        if(baseModel.userTag.isNotEmpty()){
            tvContent.text = baseModel.userTag
        }
        tvContent.setOnClickListener {
            baseModel.userTag = "Hello BaseModel"
            tvContent.text = baseModel.userTag
        }
    }
}
