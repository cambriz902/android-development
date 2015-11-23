package com.bloc.breezy.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.bloc.breezy.blocly.BloclyApplication;
import com.bloc.breezy.blocly.R;


/**
 * Created by cambriz on 11/21/15.
 */
public class BloclyActivity extends Activity {

    private TextView centertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
        String firstFeedTitle = BloclyApplication
                .getSharedDataSource()
                .getFeeds()
                .get(0)
                .getTitle();
        setCentertext(firstFeedTitle);
    }

    // Private methods
    private void setCentertext(String text){
        centertext = (TextView) findViewById(R.id.centertext);
        centertext.setText(text);
    }

}
