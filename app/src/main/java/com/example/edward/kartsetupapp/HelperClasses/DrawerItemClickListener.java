package com.example.edward.kartsetupapp.HelperClasses;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.edward.kartsetupapp.Setups;

/**
 * Created by Edward on 12/07/2017.
 */

public class DrawerItemClickListener implements ListView.OnItemClickListener {
    Context context;

    public DrawerItemClickListener (Context context){
        super();
        this.context = context;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(context, view.toString(),Toast.LENGTH_SHORT);
    }
}
