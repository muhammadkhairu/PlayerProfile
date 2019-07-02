package com.example.playerprofile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPlayerActivity extends AppCompatActivity {

    public static String EXTRA_PLAYER = "extra_player";
    TextView tvNo, tvNama;
    ImageView img_Profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        tvNo = findViewById(R.id.tvNo);
        tvNama = findViewById(R.id.tvNama);
        img_Profile = findViewById(R.id.img_profile);


        PlayerItem playerItem =  getIntent().getParcelableExtra(EXTRA_PLAYER);

        String no = playerItem.getNo();
        String name = playerItem.getName();
        String poster = playerItem.getPoster();

        tvNo.setText(no);
        tvNama.setText(name);
        Glide.with(this).load(poster).into(img_Profile);


    }
}
