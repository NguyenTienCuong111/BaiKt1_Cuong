package com.example.bt_shared_preferences;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SingerAdapter extends RecyclerView.Adapter<SingerAdapter.SingerViewHolder> {
    private Context mContext;
    private List<Singer> mListSinger;

    public SingerAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<Singer> list){
        this.mListSinger = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public SingerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_singer, parent, false);

        return new SingerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SingerViewHolder holder, int position) {
        Singer singer = mListSinger.get(position);
        if(singer ==null){
            return;
        }
        holder.imgSinger.setImageResource(singer.getResourceId());
        holder.tvName.setText(singer.getName());
        holder.tvNgheDanh.setText(singer.getNghedanh());
        holder.tvQuocGia.setText(singer.getQuocgia());
        holder.tvSoSao.setText(singer.getSosao());


    }

    @Override
    public int getItemCount() {
        if (mListSinger != null){
            return mListSinger.size();
        }
        return 0;
    }

    public class SingerViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgSinger;
        private TextView tvName, tvNgheDanh, tvQuocGia, tvSoSao;

        public SingerViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSinger= itemView.findViewById(R.id.img_singer);
            tvName = itemView.findViewById(R.id.tv_name);
            tvNgheDanh = itemView.findViewById(R.id.tv_nghedanh);
            tvQuocGia = itemView.findViewById(R.id.tv_quocgia);
            tvSoSao = itemView.findViewById(R.id.tv_sosao);
        }
    }
}
