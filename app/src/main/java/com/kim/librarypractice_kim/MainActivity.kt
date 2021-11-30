package com.kim.librarypractice_kim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileImg.setOnClickListener {

//            프로필 크게 보는 액티비티로 이동

            val myIntent = Intent(this,ViewProfilePhotoActivity::class.java)
            startActivity(myIntent)

        }

//        인터넷에 있는 이미지(https:///...)를 이미지뷰에 바로 적용

        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnlL0iNL2oyp_h4smXHHuLiE5o5hO4mv2uUw&usqp=CAU").into(lectureImg1)
    }
}