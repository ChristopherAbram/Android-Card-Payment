package fi.jamk.android.androidcardpayment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by r9_bl on November 12 2017.
 */

public class ProductListAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<ShopItem> list;

    public ProductListAdapter(Context context, ArrayList<ShopItem> list) {
        super(context, R.layout.listlayout, R.id.textView, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listlayout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        textView.setText(list.get(position).getName());

        TextView textView2 = (TextView) rowView.findViewById(R.id.textView2);
        textView2.setText(list.get(position).getType() + ": " + list.get(position).getDetail());

        Button button = (Button) rowView.findViewById(R.id.buyButton);
        button.setText(list.get(position).getPrice() + " " + list.get(position).getCurrency());
        button.setTag(list.get(position).getId());

        TextView ratingScore = (TextView) rowView.findViewById(R.id.ratingScore);
        RatingBar ratingBar = (RatingBar) rowView.findViewById(R.id.ratingBar);
        ratingScore.setText(list.get(position).getRating()+" ");
        ratingBar.setRating(list.get(position).getRating());

        return rowView;
    }

}