package com.example.project_mobile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Dessert_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_detail);

        // รับข้อมูลจาก Intent
        String dessertName = getIntent().getStringExtra("dessert_name");
        String dessertImage = getIntent().getStringExtra("dessert_image");
        int dessertPrice = getIntent().getIntExtra("dessert_price", 0);
        String dessertType = getIntent().getStringExtra("dessert_type");
        String dessertDescription = getIntent().getStringExtra("dessert_description");

        // ค้นหา View จาก layout
        TextView nameTextView = findViewById(R.id.dessert_name);
        ImageView imageView = findViewById(R.id.dessert_image);
        TextView priceTextView = findViewById(R.id.dessert_price);
        TextView typeTextView = findViewById(R.id.dessert_type);
        TextView descriptionTextView = findViewById(R.id.dessert_description);

        // กำหนดค่าให้ View ต่างๆ
        nameTextView.setText(dessertName);
        priceTextView.setText("ราคา: " + dessertPrice + " บาท");
        typeTextView.setText("ประเภทขนม: " + dessertType);
        descriptionTextView.setText("รายละเอียดขนม: " + dessertDescription);

        // ใช้ Glide แสดงรูปภาพ
        Glide.with(this)
                .load(dessertImage)
                .into(imageView);
    }
}
