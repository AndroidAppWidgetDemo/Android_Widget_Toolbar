package com.xiaxl.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * http://blog.csdn.net/feiduclear_up/article/details/46457433
 */
public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.Toolbar001);
        setSupportActionBar(toolbar);
        //
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // 主标题
        toolbar.setTitle("主标题");
        // 副标题
        toolbar.setSubtitle("副标题");
        // logo图标
        toolbar.setLogo(R.mipmap.ic_launcher);
        // 导航按钮
        toolbar.setNavigationIcon(android.R.drawable.ic_input_delete);
    }

}
