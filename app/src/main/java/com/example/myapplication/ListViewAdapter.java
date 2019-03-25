package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends ArrayAdapter {
    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] nameArray;

    private final String[] infoArray;

    public ListViewAdapter(Activity context,String[] nameArray,
                           String[] infoArray,Integer[] imageID ){
        super(context,R.layout.contact,nameArray);

        this.context = context;
        this.imageIDarray = imageID;
        this.nameArray = nameArray;
        this.infoArray = infoArray;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.contact, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.name);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.message_body);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.contactImage);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    };

}
