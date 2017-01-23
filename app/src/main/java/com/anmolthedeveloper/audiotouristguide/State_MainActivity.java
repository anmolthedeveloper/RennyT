package com.anmolthedeveloper.audiotouristguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class State_MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state__main);

        ArrayList<InfoCards> items = new ArrayList<>();
        items.add(new InfoCards(R.drawable.andamanandnicobar, getString(R.string.item_title_1), getString(R.string.item_text_1)));
        items.add(new InfoCards(R.drawable.andhrapradesh, getString(R.string.item_title_2), getString(R.string.item_text_2)));
        items.add(new InfoCards(R.drawable.arunachalpradesh, getString(R.string.item_title_3), getString(R.string.item_text_3)));
        items.add(new InfoCards(R.drawable.assam, getString(R.string.item_title_4), getString(R.string.item_text_4)));
        items.add(new InfoCards(R.drawable.bihar, getString(R.string.item_title_5), getString(R.string.item_text_5)));
        items.add(new InfoCards(R.drawable.chandighar, getString(R.string.item_title_6), getString(R.string.item_text_6)));
        items.add(new InfoCards(R.drawable.chhattisgarh, getString(R.string.item_title_7), getString(R.string.item_text_7)));
        items.add(new InfoCards(R.drawable.dadraandnagarhaveli, getString(R.string.item_title_8), getString(R.string.item_text_8)));
        items.add(new InfoCards(R.drawable.damananddiu, getString(R.string.item_title_9), getString(R.string.item_text_9)));
        items.add(new InfoCards(R.drawable.delhi, getString(R.string.item_title_10), getString(R.string.item_text_10)));
        items.add(new InfoCards(R.drawable.goa, getString(R.string.item_title_11), getString(R.string.item_text_11)));
        items.add(new InfoCards(R.drawable.gujarat, getString(R.string.item_title_12), getString(R.string.item_text_12)));
        items.add(new InfoCards(R.drawable.himachalpradesh, getString(R.string.item_title_13), getString(R.string.item_text_13)));
        items.add(new InfoCards(R.drawable.jammuandkashmir, getString(R.string.item_title_14), getString(R.string.item_text_14)));
        items.add(new InfoCards(R.drawable.jharkhand, getString(R.string.item_title_15), getString(R.string.item_text_15)));
        items.add(new InfoCards(R.drawable.karnataka, getString(R.string.item_title_16), getString(R.string.item_text_16)));
        items.add(new InfoCards(R.drawable.kerala, getString(R.string.item_title_17), getString(R.string.item_text_17)));
        items.add(new InfoCards(R.drawable.lakshadweep, getString(R.string.item_title_18), getString(R.string.item_text_18)));
        items.add(new InfoCards(R.drawable.madhyapradesh, getString(R.string.item_title_19), getString(R.string.item_text_19)));
        items.add(new InfoCards(R.drawable.maharastra, getString(R.string.item_title_20), getString(R.string.item_text_20)));
        items.add(new InfoCards(R.drawable.manipur, getString(R.string.item_title_21), getString(R.string.item_text_21)));
        items.add(new InfoCards(R.drawable.meghalaya, getString(R.string.item_title_22), getString(R.string.item_text_22)));
        items.add(new InfoCards(R.drawable.mizoram, getString(R.string.item_title_23), getString(R.string.item_text_23)));
        items.add(new InfoCards(R.drawable.nagaland, getString(R.string.item_title_24), getString(R.string.item_text_24)));
        items.add(new InfoCards(R.drawable.odisha, getString(R.string.item_title_25), getString(R.string.item_text_25)));
        items.add(new InfoCards(R.drawable.pondicherry, getString(R.string.item_title_26), getString(R.string.item_text_26)));
        items.add(new InfoCards(R.drawable.punjab, getString(R.string.item_title_27), getString(R.string.item_text_27)));
        items.add(new InfoCards(R.drawable.rajasthan, getString(R.string.item_title_28), getString(R.string.item_text_28)));
        items.add(new InfoCards(R.drawable.sikkim, getString(R.string.item_title_29), getString(R.string.item_text_29)));
        items.add(new InfoCards(R.drawable.tamilnadu, getString(R.string.item_title_30), getString(R.string.item_text_30)));
        items.add(new InfoCards(R.drawable.telangana, getString(R.string.item_title_31), getString(R.string.item_text_31)));
        items.add(new InfoCards(R.drawable.tripura, getString(R.string.item_title_32), getString(R.string.item_text_32)));
        items.add(new InfoCards(R.drawable.uttarakhand, getString(R.string.item_title_33), getString(R.string.item_text_33)));
        items.add(new InfoCards(R.drawable.uttarpradesh, getString(R.string.item_title_34), getString(R.string.item_text_34)));
        items.add(new InfoCards(R.drawable.westbengal, getString(R.string.item_title_35), getString(R.string.item_text_35)));


        setContentView(R.layout.activity_state__main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new RecyclerAdapter(this, items);
        //adapter.setHasStableIds(true);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_state__main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about_us) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
