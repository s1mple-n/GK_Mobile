package com.example.a19481471_nguyenduongminhhuy_gk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class XeAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Xe> list;
    private int positionSelect = -1;

    public void setList(List<Xe> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public XeAdapter(Context context, int idLayout, List<Xe> list) {
        this.context = context;
        this.idLayout = idLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        if (list.size()!=0&&!list.isEmpty()){
            return list.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }
        TextView tvname = view.findViewById(R.id.tvname);
        TextView tvgiagiam = view.findViewById(R.id.tvgiagiam);
        TextView tvgiagoc = view.findViewById(R.id.tvgiagoc);
        ImageView imv = view.findViewById(R.id.imvxe);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.ct);
        final Xe xe = list.get(i);

        if(list.size()!=0&&!list.isEmpty()){
            tvname.setText(xe.getName());
            tvgiagiam.setText("$"+xe.getGiasaugiam());
            tvgiagoc.setText("$"+xe.getGiagoc());
            imv.setImageResource(xe.getId());

        }








        return view;
    }
}
