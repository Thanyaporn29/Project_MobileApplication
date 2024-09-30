package com.example.project_mobile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project_mobile.model.Dessert;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Dessert> values;
    private Context context;

    public MyAdapter(List<Dessert> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = (ImageView) v.findViewById(R.id.dessert_image);
            txtHeader = (TextView) v.findViewById(R.id.dessert_name);
            txtFooter = (TextView) v.findViewById(R.id.dessert_price);
        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.dessert_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Dessert dessert = values.get(position);
        holder.txtHeader.setText(dessert.getDessert_name());
        holder.txtFooter.setText(dessert.getDessert_price() + " บาท");

        // ใช้ Glide ในการแสดงภาพ
        Glide.with(context)
                .load(dessert.getDessert_image())
                .into(holder.imgView);

        // คลิกที่รูปภาพเพื่อแสดงป๊อปอัพ
        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(dessert.getDessert_name());
                builder.setMessage("ต้องการดูรายละเอียดเพิ่มเติมหรือไม่?");
                builder.setPositiveButton("ดูรายละเอียด", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // เปิดหน้ารายละเอียดขนม
                        Intent intent = new Intent(context, Dessert_detail.class);
                        intent.putExtra("dessert_name", dessert.getDessert_name());
                        intent.putExtra("dessert_image", dessert.getDessert_image());
                        intent.putExtra("dessert_price", dessert.getDessert_price());
                        intent.putExtra("dessert_type", dessert.getDessert_type());
                        intent.putExtra("dessert_description", dessert.getDessert_description());
                        context.startActivity(intent);
                    }
                });
                builder.setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}
