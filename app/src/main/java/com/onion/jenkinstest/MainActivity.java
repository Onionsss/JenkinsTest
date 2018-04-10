package com.onion.jenkinstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by OnionMac on 2018/4/10.
 */

public class MainActivity extends AppCompatActivity {

    //网络地址
    public static final String NET_ADDRESS = BuildConfig.API_HOST;
    public static final String productFlavors = BuildConfig.FLAVOR;
    public static final boolean log = BuildConfig.DEBUG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView net = findViewById(R.id.net);
        TextView name = findViewById(R.id.name);
        TextView fl = findViewById(R.id.fl);
        TextView log = findViewById(R.id.log);

        net.setText("网络地址:"+NET_ADDRESS);
        name.setText("app名称:"+Utils.getApplicationName(this));
        fl.setText("app渠道:"+productFlavors);
        log.setText("是否开启日志:"+this.log);
    }


}
