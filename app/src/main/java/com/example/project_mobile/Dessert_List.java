package com.example.project_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project_mobile.model.Dessert;

import java.util.ArrayList;
import java.util.List;


public class Dessert_List extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_list);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        // เก็บ Food 4 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        // เก็บ Dessert 5 อย่างไว้ใน ArrayList<Dessert> ชื่อว่า desserts

        List<Dessert> desserts = new ArrayList<>();
        Dessert dessert = new Dessert();
        dessert.setDessert_name("ขนมทองหยิบ");
        dessert.setDessert_image("https://img.wongnai.com/p/1920x0/2018/04/04/00176c8efd9e4bd1956bc8676b5baa7a.jpg");
        dessert.setDessert_price(30);
        dessert.setDessert_type("ขนมไทยโบราณ");
        dessert.setDessert_description("ขนมทองหยิบเป็นขนมไทยโบราณ ทำจากไข่แดงตีฟู หยอดลงในน้ำเชื่อมแล้วหยิบเป็นกลีบดอกไม้ หวานหอม และมีสีเหลืองทอง");
        desserts.add(dessert);

        Dessert dessert2 = new Dessert();
        dessert2.setDessert_name("ขนมบัวลอยเสียบไม้");
        dessert2.setDessert_image("https://img.wongnai.com/p/1920x0/2018/06/18/2979c50de28b4137a3c0224591db4af5.jpg");
        dessert2.setDessert_price(40);
        dessert2.setDessert_type("ขนมไทยโบราณ");
        dessert2.setDessert_description("ขนมบัวลอยเสียบไม้เป็นการนำบัวลอยไทยมาปั้นเป็นลูกกลม ต้มในน้ำกะทิ แล้วเสียบไม้กินง่าย มีสีสันสวยงามและรสหวานมันจากกะทิ");

        desserts.add(dessert2);

        Dessert dessert3 = new Dessert();
        dessert3.setDessert_name("ขนมชั้น");
        dessert3.setDessert_image("https://img.wongnai.com/p/1920x0/2024/06/05/91d7fbadd20749d0b04afc563a530046.jpg");
        dessert3.setDessert_price(25);
        dessert3.setDessert_type("ขนมไทยโบราณ");
        dessert3.setDessert_description("ขนมชั้นเป็นขนมไทยชั้นดี ทำจากแป้งผสมกะทิและน้ำตาล เรียงเป็นชั้นสีสันสวยงาม เนื้อเหนียวนุ่ม หอมหวาน");
        desserts.add(dessert3);

        Dessert dessert4= new Dessert();
        dessert4.setDessert_name("วุ้นกะทิใบเตย");
        dessert4.setDessert_image("https://img.wongnai.com/p/1920x0/2018/06/21/e2e6a288b8894e81a73af60914677373.jpg");
        dessert4.setDessert_price(25);
        dessert4.setDessert_type("ขนมไทยโบราณ");
        dessert4.setDessert_description("ขนมวุ้นกะทิใบเตยเป็นขนมไทย ทำจากวุ้นผสมกะทิและน้ำใบเตย มีสองชั้น " +
                "สีเขียวหอมใบเตยและชั้นกะทิขาวมัน รสหวานหอมและเนื้อเด้งนุ่ม");
        desserts.add(dessert4);

        Dessert dessert5= new Dessert();
        dessert5.setDessert_name("สาคูบัวลอย");
        dessert5.setDessert_image("https://img.wongnai.com/p/1920x0/2018/05/15/8168232862954cf397f1e8dbc147e1b3.jpg");
        dessert5.setDessert_price(30);
        dessert5.setDessert_type("ขนมไทยโบราณ");
        dessert5.setDessert_description("ขนมสาคูบัวลอยเป็นขนมไทยที่ทำจากเม็ดสาคู ต้มกับน้ำกะทิและน้ำตาล ผสมสีสันสวยงาม รสหวานมัน เนื้อเหนียวนุ่ม");
        desserts.add(dessert5);

        Dessert dessert6= new Dessert();
        dessert6.setDessert_name("สาคูไส้หมู");
        dessert6.setDessert_image("https://img.wongnai.com/p/1920x0/2018/07/06/372815862b444fb6bc2763f90b336e4a.jpg");
        dessert6.setDessert_price(20);
        dessert6.setDessert_type("ขนมไทยโบราณ");
        dessert6.setDessert_description("ขนมสาคูไส้หมูเป็นขนมไทยคาว ทำจากเม็ดสาคูห่อไส้หมูผัดกับถั่วลิสง หัวไชโป๊ และเครื่องเทศ " +
                "รสเค็มหวาน ห่อเป็นลูกกลม นึ่งจนเหนียวนุ่ม");
        desserts.add(dessert6);

        Dessert dessert7= new Dessert();
        dessert7.setDessert_name("กล้วยบวชชี");
        dessert7.setDessert_image("https://img.wongnai.com/p/1920x0/2024/08/27/3ebc353a90554639bea8cc6c6886bee0.jpg");
        dessert7.setDessert_price(35);
        dessert7.setDessert_type("ขนมไทยโบราณ");
        dessert7.setDessert_description("กล้วยบวชชีเป็นขนมไทยทำจากกล้วยน้ำว้าสุก ต้มในน้ำกะทิหวานมัน หอมกลิ่นกะทิ เนื้อกล้วยนุ่ม รสชาติหวานเค็มกลมกล่อม");
        desserts.add(dessert7);

        Dessert dessert8= new Dessert();
        dessert8.setDessert_name("ทับทิมกรอบ");
        dessert8.setDessert_image("https://img.wongnai.com/p/l/2017/10/01/87b765c03bd247a39626940a96071d15.jpg");
        dessert8.setDessert_price(35);
        dessert8.setDessert_type("ขนมไทยโบราณ");
        dessert8.setDessert_description("ทับทิมกรอบเป็นขนมไทย ทำจากแห้วชุบแป้งมันสีแดงต้มจนใส เสิร์ฟในน้ำกะทิหอมมันและน้ำเชื่อมเย็นสดชื่น มีเนื้อสัมผัสกรอบนอกนุ่มใน");
        desserts.add(dessert8);

        Dessert dessert9= new Dessert();
        dessert9.setDessert_name("ขนมหยกมณี");
        dessert9.setDessert_image("https://img.wongnai.com/p/1920x0/2018/10/18/1c8d6fcb22454cb3a2882637d50d8e2b.jpg");
        dessert9.setDessert_price(30);
        dessert9.setDessert_type("ขนมไทยโบราณ");
        dessert9.setDessert_description("ขนมหยกมณีทำจากแป้งข้าวเหนียว น้ำตาลมะพร้าว(หรือน้ำตาลทราย) " +
                                        "กะทิ และสีผสมอาหาร โดยนำส่วนผสมทั้งหมดมานึ่งจนสุก ให้มีลักษณะนุ่มเหนียวและมีสีสันสวยงาม");
        desserts.add(dessert9);

        Dessert dessert10= new Dessert();
        dessert10.setDessert_name("ขนมพระพาย");
        dessert10.setDessert_image("https://img.wongnai.com/p/1920x0/2018/12/18/5e8f656e14aa41fa83113e4d94aae164.jpg");
        dessert10.setDessert_price(35);
        dessert10.setDessert_type("ขนมไทยโบราณ");
        dessert10.setDessert_description("ขนมพระพายทำจากแป้งข้าวเหนียว ผสมกับน้ำตาลมะพร้าว กะทิ " +
                                         "และมะพร้าวขูด โดยจะนวดให้เข้ากันแล้วห่อด้วยใบตอง ก่อนจะนึ่งจนสุก ขนมนี้มีลักษณะนุ่มและหอมมันจากกะทิ");
        desserts.add(dessert10);

        // ส่ง foods ไปให้ MyAdapter
        mAdapter = new MyAdapter(desserts, this);
        recyclerView.setAdapter(mAdapter);


    }
}
