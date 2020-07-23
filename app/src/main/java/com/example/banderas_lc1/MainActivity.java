package com.example.banderas_lc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mindorks.placeholderview.PlaceHolderView;

public class MainActivity extends AppCompatActivity {
    public PlaceHolderView mGalleryView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGalleryView = (PlaceHolderView)findViewById(R.id.galleryView);
        mGalleryView
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img1)))
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img2)))
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img3)))
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img4)))
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img5)))
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img6)))
                .addView(new GalleryItem(getResources().getDrawable(R.drawable.img7)))
                ;
    }
}