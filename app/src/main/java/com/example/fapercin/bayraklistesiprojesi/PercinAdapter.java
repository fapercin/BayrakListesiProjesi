package com.example.fapercin.bayraklistesiprojesi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by fapercin on 3/24/2017.
 */

class ViewYerTutucu{

    ImageView resim;
    TextView ulke;
    TextView tanim;

    ViewYerTutucu(View v){
        resim= (ImageView) v.findViewById(R.id.imageView);
        ulke= (TextView) v.findViewById(R.id.textView);
        tanim= (TextView) v.findViewById(R.id.textView2);
    }}


public class PercinAdapter extends ArrayAdapter<String>{

    Context context;
    String[] ulkeAdlari;
    String[] ulkeTanimlari;
    int[] resimler;

    public PercinAdapter(Context c, String[] ulkeAdlari, String[] ulkeTanimlari, int resimlerDizisi[]) {
        super(c, R.layout.tek_satir, R.id.textView, ulkeAdlari);

        this.context = c;
        this.ulkeAdlari = ulkeAdlari;
        this.ulkeTanimlari = ulkeTanimlari;
        this.resimler= resimlerDizisi;
    }





    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View tek_satir = convertView;
        ViewYerTutucu tutucu=null;

        if (tek_satir == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            tek_satir = inflater.inflate(R.layout.tek_satir, parent, false);
            tutucu=new ViewYerTutucu(tek_satir);
            tek_satir.setTag(tutucu);
            Log.e("FPER","yeni üye");
        }
        else{
            tutucu= (ViewYerTutucu) tek_satir.getTag();
            Log.e("FPER","recycled üye");
        }


        tutucu.resim.setImageResource(resimler[position]);
        tutucu.ulke.setText(ulkeAdlari[position]);
        tutucu.tanim.setText(ulkeTanimlari[position]);


        return tek_satir;
    }
}
