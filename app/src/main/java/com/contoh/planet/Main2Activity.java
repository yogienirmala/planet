package com.contoh.planet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imgPhoto;
    TextView tvName;
    TextView tvRemarks;
    TextView tvDesc;
    TextView tvDesc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvName = findViewById(R.id.tv_item_name);
        imgPhoto = findViewById(R.id.img_item_photo);
        tvRemarks = findViewById(R.id.tv_item_remarks);
        tvDesc = findViewById(R.id.tv_item_desc);
        tvDesc2 = findViewById(R.id.tv_item_desc2);

        Intent getdetail = getIntent();
        getSupportActionBar().setTitle(getdetail.getStringExtra("tvName"));
        imgPhoto.setImageResource(getdetail.getIntExtra("imgPhoto", 1));
        tvName.setText(getdetail.getStringExtra("tvName"));
        tvRemarks.setText(getdetail.getStringExtra("tvRemarks"));
        tvDesc.setText(getdetail.getStringExtra("tvDesc"));
        tvDesc2.setText(getdetail.getStringExtra("tvDesc2"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
