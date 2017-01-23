package com.anmolthedeveloper.audiotouristguide;

/**
 * Created by Anmol Singh on 09-Jan-2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anmolthedeveloper.audiotouristguide.Inner_State_Activitys.Andaman_And_Nicobar.Andaman_And_Nicobar_MainActivity;

import com.anmolthedeveloper.audiotouristguide.Inner_State_Activitys.Andaman_And_Nicobar.Andhrapradesh.Andhrapradesh_MainActivity;
import com.anmolthedeveloper.audiotouristguide.Inner_State_Activitys.Andaman_And_Nicobar.Arunachalpradesh.Arunachalpradesh_MainActivity;
import com.anmolthedeveloper.audiotouristguide.Inner_State_Activitys.Andaman_And_Nicobar.Assam.Assam_MainActivity;
import com.anmolthedeveloper.audiotouristguide.Inner_State_Activitys.Andaman_And_Nicobar.Bihar.Bihar_MainActivity;
import com.anmolthedeveloper.audiotouristguide.Inner_State_Activitys.Andaman_And_Nicobar.Chandighar.Chandighar_MainActivity;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private Context context;
    private List<InfoCards> items;

    public RecyclerAdapter(Context context, List<InfoCards> items) {
        this.context = context;
        this.items = items;
    }

// NEW SYSTEM
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imagen;
        public TextView nameCard;
        public TextView information;
        public View view;

        public ViewHolder(View v) {
            super(v);

            imagen = (ImageView) v.findViewById(R.id.item_image);
            nameCard = (TextView) v.findViewById(R.id.item_title);
            information = (TextView) v.findViewById(R.id.item_text);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //created class object here
                    int position = getAdapterPosition();
                    Intent intent;
                    switch (getLayoutPosition()) {
                        case 0:
                            intent = new Intent (context , Andaman_And_Nicobar_MainActivity.class);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent = new Intent(context , Andhrapradesh_MainActivity.class);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent = new Intent(context , Arunachalpradesh_MainActivity.class);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent = new Intent(context , Assam_MainActivity.class);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent = new Intent(context , Bihar_MainActivity.class);
                            context.startActivity(intent);
                            break;

                        case 5:
                            intent = new Intent(context , Chandighar_MainActivity.class);
                            context.startActivity(intent);
                            break;

                        case 6:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 7:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 8:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 9:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 10:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 11:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 12:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 13:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 14:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 15:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 16:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 17:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 18:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 19:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 20:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 21:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 22:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 23:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 24:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 25:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 26:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 27:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 28:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 29:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 30:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 31:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 32:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 33:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 34:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;

                        case 35:
                            Snackbar.make(v, "Click detected on item " + position,
                                    Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                            break;
                    }
                }
            });
        }

    }



    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_state__main, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {

        Glide.with(context).load(items.get(i).getImagen()).into(viewHolder.imagen);
        viewHolder.nameCard.setText(items.get(i).getNameCard());
        viewHolder.information.setText(String.valueOf(items.get(i).getInformation()));

    }
}


// Not Working
