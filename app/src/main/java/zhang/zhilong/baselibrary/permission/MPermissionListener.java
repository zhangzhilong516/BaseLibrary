package zhang.zhilong.baselibrary.permission;

/**
 * @author: zhangzhilong
 * @date: 2018/5/18
 * @des:
 */
public abstract class MPermissionListener {
    abstract void onPermissionGranted();
    abstract void onPermissionDenied();
    public void shouldShowRationale(){
    }
}
