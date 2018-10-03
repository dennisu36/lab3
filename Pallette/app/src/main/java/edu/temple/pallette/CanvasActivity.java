package edu.temple.pallette;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CanvasActivity extends BaseAdapter{

    Context context;
    String colors[];

    public CanvasActivity(Context context, String colors[]){
        this.context=context;
        this.colors=colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView theseColors = new TextView(context);
        theseColors.setText(colors[position]);
        theseColors.setBackgroundColor(Color.parseColor(colors[position]));
        return theseColors;
    }
}
