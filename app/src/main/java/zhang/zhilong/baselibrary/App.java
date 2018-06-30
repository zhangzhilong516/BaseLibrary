package zhang.zhilong.baselibrary;

import android.app.Application;

import zhang.zhilong.baselibrary.utils.LogUtils;
import zhang.zhilong.baselibrary.utils.Utils;

/**
 * author zhangzhilong
 * on 2018/4/22.
 * Description:
 */

public class App extends Application{
    private static App instance;

    public static App getApp() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Utils.init(this);
        LogUtils.init(true);
    }
}
