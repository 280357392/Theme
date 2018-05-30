package com.huatec.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    private static int theme = R.style.Blue;//设置默认主题

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(theme);//设置主题
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.change,menu);
        return true;
    }

    /**
     * 切换主题
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.blue://设置为蓝色主题
                theme = R.style.Blue;
                break;
            case R.id.gray://设置为黑色主题
                theme = R.style.Black;
                break;
            case R.id.green://设置为绿色主题
                theme = R.style.Green;
                break;
            case R.id.yellow://设置为黄色色主题
                theme = R.style.Yellow;
                break;
        }
        recreate();//重启界面
        return super.onOptionsItemSelected(item);
    }
}
