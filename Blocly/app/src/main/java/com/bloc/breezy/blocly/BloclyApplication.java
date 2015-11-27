package com.bloc.breezy.blocly;

import android.app.Application;

import com.bloc.breezy.blocly.api.DataSource;

/**
 * Created by cambriz on 11/22/15.
 */
public class BloclyApplication extends Application {

    public static BloclyApplication getSharedInstance() {
        return sharedInstance;
    }

    public static DataSource getSharedDataSource() {
        return BloclyApplication.getSharedInstance().getDataSource();
    }

    private static BloclyApplication sharedInstance;
    private DataSource dataSource;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
