package zhang.zhilong.baselibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * author zhangzhilong
 * on 2018/5/11.
 * Description:
 */

public final class ToastUtils{
    private static MToast mToast;

    public static MToast with(Context context){
        if(mToast == null){
            mToast = new MToast(context);
        }
        return mToast;
    }

    public static void showShort(Context context,CharSequence s){
        with(context).setMText(s).setMDuration(Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context,CharSequence s){
        with(context).setMText(s).setMDuration(Toast.LENGTH_LONG).show();
    }

    public static void showLong(Context context,CharSequence s,int duration){
        with(context).setMText(s).setMDuration(duration).show();
    }

    public static class MToast extends Toast{
        public MToast(Context context) {
            super(context);
        }
        public MToast setMText(CharSequence s){
            setText(s);
            return this;
        }
        public MToast setMText(int resId){
            mToast.setText(resId);
            return this;
        }

        public MToast setMDuration(int duration){
            mToast.setDuration(duration);
            return this;
        }
    }
}
