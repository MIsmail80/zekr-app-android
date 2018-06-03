package net.a15minute.zekr.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.a15minute.zekr.R;
import net.a15minute.zekr.models.Zekr;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ZekrAdapter extends ArrayAdapter<Zekr> {

    public ZekrAdapter(Activity context, ArrayList<Zekr> azkarList) {
        super(context, 0, azkarList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Zekr currentZekr = getItem(position);

        TextView idTextView = (TextView) listItemView.findViewById(R.id.zekr_id);
        NumberFormat nf= NumberFormat.getInstance(new Locale("ar","EG"));
        idTextView.setText(String.valueOf(nf.format(currentZekr.getId())));

        TextView metaTextView = (TextView) listItemView.findViewById(R.id.meta);
        metaTextView.setText(currentZekr.getMeta());

        TextView contentTextView = (TextView) listItemView.findViewById(R.id.content);
        contentTextView.setText(currentZekr.getContent());

        return listItemView;
    }

}
