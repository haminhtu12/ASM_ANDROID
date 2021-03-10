package com.example.ha_minh_tu_assignment_android;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ha_minh_tu_assignment_android.ConvertDateTime;

import com.example.ha_minh_tu_assignment_android.ConvertIconImage;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter {
    Activity activity;
    List<Item> list;
    ConvertDateTime cv = new ConvertDateTime();
    ConvertIconImage cvim = new ConvertIconImage();

    public HomeAdapter(Activity activity, List<Item> list) {
        this.activity = activity;
        this.list = list;
    }

    public  void reloadData(List<Item> list){
        this.list = list;
        this.notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.acivity_item,parent,false);
        HomeHolder hd = new HomeHolder(itemView);
        return hd;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        HomeHolder hd = (HomeHolder) holder;
        Item model = list.get(position);
        hd.tvTime.setText(cv.convertTime(model.getDateTime()));
        hd.tvTemperature.setText(model.getTemperature().getValue().toString());
        Glide.with(activity).load(cvim.convertIcon(model.getWeatherIcon())).into(hd.ivIcon);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class HomeHolder extends RecyclerView.ViewHolder {
        TextView tvTime,tvTemperature;
        ImageView ivIcon;

        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvTemperature = itemView.findViewById(R.id.tvItemTemperature);
            ivIcon = itemView.findViewById(R.id.ivItemIcon);
        }
    }
}
