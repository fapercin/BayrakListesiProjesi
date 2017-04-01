package com.example.fapercin.bayraklistesiprojesi;

        import android.content.res.Resources;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

/*
* 1- Veri kaynaklarını hazırlayalım
* 2- Tek bir satır list viewın layoutunu hazırlayalım
* 3-Custom Adapter Tanımlayalım
*   3.1 Bir daha önceden tanımlı constructorı çağır
*   3.2 getView Methodu kişiselleştir
* */

public class MainActivity extends AppCompatActivity {

    ListView ulkelerListesi;

    String[] ulkeAdlari;
    String[] ulkeTanimlari;
    int[] bayrakResimleri = {R.drawable.ulke1, R.drawable.ulke2, R.drawable.ulke3, R.drawable.ulke4,
            R.drawable.ulke5, R.drawable.ulke6, R.drawable.ulke7, R.drawable.ulke8,
            R.drawable.ulke9, R.drawable.ulke10, R.drawable.ulke10, R.drawable.ulke11,
            R.drawable.ulke12, R.drawable.ulke13, R.drawable.ulke14, R.drawable.ulke15,
            R.drawable.ulke16, R.drawable.ulke17, R.drawable.ulke18,
            R.drawable.ulke19, R.drawable.ulke20};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources veriKaynagi = getResources();
        ulkeAdlari = veriKaynagi.getStringArray(R.array.ulkeAdlari);
        ulkeTanimlari = veriKaynagi.getStringArray(R.array.ulke_tanimlari);
        ulkelerListesi = (ListView) findViewById(R.id.ulkelerListesi);

        PercinAdapter adapter=new PercinAdapter(this,ulkeAdlari, ulkeTanimlari, bayrakResimleri);
        ulkelerListesi.setAdapter(adapter);


    }
}