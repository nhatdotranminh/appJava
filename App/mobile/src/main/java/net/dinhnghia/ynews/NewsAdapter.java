package net.dinhnghia.ynews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vodinhnghia on 12/27/17.
 */

public class NewsAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private List<News> newsList;

    public NewsAdapter(Context context, int layout, List<News> newsList) {
        this.context = context;
        this.layout = layout;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTile;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTile = (TextView) view.findViewById(R.id.title);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        News news = newsList.get(i);
        holder.txtTile.setText(news.getTitle());
        return view;
    }
}
