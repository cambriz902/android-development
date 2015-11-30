package com.bloc.breezy.blocly.ui.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bloc.breezy.blocly.R;
import com.bloc.breezy.blocly.ui.adapter.ItemAdapter;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;


/**
 * Created by cambriz on 11/21/15.
 */
public class BloclyActivity extends Activity {

    private ItemAdapter itemAdapter;
    private ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);

        itemAdapter = new ItemAdapter();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_activity_blocly);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);


        background = (ImageView) findViewById(R.id.background);
        ImageLoader.getInstance().loadImage("http://crackberry.com/sites/crackberry.com/files/styles" +
                "/large/public/topic_images/2013/ANDROID.png?itok=xhm7jaxS", new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String imageUri, View view) {

            }

            @Override
            public void onLoadingFailed(String imageUri, View view, FailReason failReason) {

            }

            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                if(background != null) {
                    background.setImageBitmap(loadedImage);
                }
            }

            @Override
            public void onLoadingCancelled(String imageUri, View view) {

            }
        });

    }
}
