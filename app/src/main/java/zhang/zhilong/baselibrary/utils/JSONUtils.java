package zhang.zhilong.baselibrary.utils;

import com.alibaba.fastjson.JSON;

/**
 * author zhangzhilong
 * on 2018/5/11.
 * Description: JSON转换工具类
 */

public final class JSONUtils {
    /**
     * 对象转json
     * @param object
     * @return
     */
    public static String toJSONString(Object object){
        return JSON.toJSONString(object);
    }

    /**
     * json转对象
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T parseObject(String json, Class<T> clazz) {
        return (T) JSON.parseObject(json, clazz);
    }
}
