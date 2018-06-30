package zhang.zhilong.baselibrary.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/**
 * author zhangzhilong
 * on 2018/4/22.
 * Description:
 */
public final class Utils {

    @SuppressLint("StaticFieldLeak")
    private static Application mApplication;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     * @param app 应用
     */
    public static void init(@NonNull final Application app) {
        Utils.mApplication = app;
    }

    /**
     * 获取 Application
     * @return Application
     */
    public static Application getApp() {
        if (mApplication != null) return mApplication;
        throw new NullPointerException("u should init first");
    }
}
