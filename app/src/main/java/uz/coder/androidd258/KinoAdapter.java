package uz.coder.androidd258;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

import uz.coder.androidd258.databinding.ItemKinoBinding;

public class KinoAdapter extends ArrayAdapter<KinoModel> {
    List<KinoModel>kinoModelList;
    public KinoAdapter(@NonNull Context context, @NonNull List<KinoModel> kinoModelList) {
        super(context, R.layout.item_kino,kinoModelList);
        this.kinoModelList = kinoModelList;
    }

    @Override
    public int getCount() {
        return kinoModelList.size();
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemKinoBinding binding = null;
        if (convertView == null) {
            binding = ItemKinoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        } else {
            binding = ItemKinoBinding.bind(convertView);
        }
//        Picasso.get().load(kinoModelList.get(position).getImg()).into(binding.imageView);
        Glide.with(binding.imageView).load(kinoModelList.get(position).getImg()).into(binding.imageView);
        binding.txtName.setText(kinoModelList.get(position).getName());
        binding.txtcat.setText(kinoModelList.get(position).getCat());
        binding.txtCount.setText(kinoModelList.get(position).getCount());
        return binding.getRoot();

    }
}
