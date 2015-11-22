package com.bloc.breezy.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.bloc.breezy.blocly.BloclyApplication;
import com.bloc.breezy.blocly.R;


/**
 * Created by cambriz on 11/21/15.
 */
public class BloclyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
        Toast.makeText(this,
                BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
                Toast.LENGTH_LONG).show();
    }
}
