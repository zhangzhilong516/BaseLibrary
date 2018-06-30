package zhang.zhilong.baselibrary.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @author: zhangzhilong
 * @date: 2018/5/17
 * @des:   公共Adapter
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    protected Context context;

    protected List<T> mData;

    protected int mLayoutId;

    public CommonAdapter(Context context,int layoutId,List<T> data){
        this.context = context;
        this.mData = data;
        this.mLayoutId = layoutId;
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = ViewHolder.getHolder(context,convertView,mLayoutId);

        convert(viewHolder,mData.get(position),position);

        return viewHolder.getConvertView();
    }

    public abstract void convert(ViewHolder viewHolder,T t, int position);
}
