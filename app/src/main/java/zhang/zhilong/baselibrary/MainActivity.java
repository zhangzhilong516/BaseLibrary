package zhang.zhilong.baselibrary;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import zhang.zhilong.baselibrary.utils.SystemBarUtils;
import zhang.zhilong.baselibrary.utils.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SystemBarUtils.setSystemBarColor(this, Color.RED);
    }
}
