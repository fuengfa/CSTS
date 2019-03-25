 package com.example.myapplication;

         import android.content.Intent;
         import android.graphics.Color;
         import android.support.v7.app.AppCompatActivity;
         import android.os.Bundle;
         import android.view.View;
         import android.widget.AdapterView;
         import android.widget.ListView;
         import android.widget.Toast;

         import java.util.Random;

 public class contact_list extends AppCompatActivity {
     public String[] name = {"Barkkung1","BarkJung2","Barkkung3","BarkJung4","Barkkung5","BarkJung6","Barkkung7","BarkJung8","Barkkung9","BarkJung10","Barkkung11","BarkJung12","Barkkung13","BarkJung14"};
     public String[] info = {"Awsome Paw XD1","Awsome Paw2","Awsome Paw XD3","Awsome Paw4","Awsome Paw XD5","Awsome Paw6","Awsome Paw XD7","Awsome Paw8","Awsome Paw XD9","Awsome Paw10","Awsome Paw XD11","Awsome Paw12","Awsome Paw XD13","Awsome Paw14"};
     public Integer[] photo = {R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark,R.drawable.bark};
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_contact_list);
         ListView listview = (ListView)findViewById(R.id.contactList);
         ListViewAdapter adap = new ListViewAdapter(this,name,info,photo);
         listview.setAdapter(adap);
         listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 if(name[position]=="Barkkung1"){
                     Intent intent = new Intent(contact_list.this,MainActivity.class);
                     intent.putExtra("KEY",name[position]);
                     startActivity(intent);
                 }
             }
         });
     }
 }
