package com.example.gmail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    List<ItemModel> items;

    public ItemAdapter(List<ItemModel> item) {
        this.items = item;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        }

        ImageView imageAvatar = convertView.findViewById(R.id.image_avatar);
        TextView name = convertView.findViewById(R.id.name);
        TextView description = convertView.findViewById(R.id.description);
        TextView content = convertView.findViewById(R.id.content);
        TextView time = convertView.findViewById(R.id.time);

        ItemModel item = items.get(position);
        imageAvatar.setImageResource(item.getAvatarResource());
        name.setText(item.getName());
        description.setText(item.getDescription());
        content.setText(item.getContent());
        time.setText(item.getTime());

        return convertView;
    }
}
