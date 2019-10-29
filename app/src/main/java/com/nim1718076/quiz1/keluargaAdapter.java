package com.nim1718076.quiz1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class keluargaAdapter extends RecyclerView.Adapter<keluargaAdapter.keluargaViewHolder> {
    private ArrayList<keluarga> dataList;

    public keluargaAdapter(ArrayList<keluarga> dataList) {

        this.dataList = dataList;
    }

    @NonNull
    @Override
    public keluargaAdapter.keluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new keluargaViewHolder(view);
    }

    public void onBindViewHolder(keluargaViewHolder holder, int position) {
        holder.imPP.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getmStatus());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class keluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStatus;
        private ImageView imPP;

        public keluargaViewHolder(View itemView) {
            super(itemView);
            imPP = (ImageView) itemView.findViewById(R.id.img_pp);
            txtNama = (TextView) itemView.findViewById(R.id.tv_nama);
            txtStatus = (TextView) itemView.findViewById(R.id.tv_stat);
        }
    }
}
