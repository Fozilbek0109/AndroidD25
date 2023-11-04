package uz.coder.androidd258;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

import uz.coder.androidd258.databinding.ItemActivityBinding;
import uz.coder.androidd258.databinding.ItemKinoBinding;

public class SecondAdapter extends ArrayAdapter<SecondModel> {
    List<SecondModel> secondModels;
    public SecondAdapter(@NonNull Context context, @NonNull List<SecondModel> secondModels) {
        super(context, R.layout.item_activity, secondModels);
        this.secondModels = secondModels;
    }

    @Override
    public int getCount() {
        return secondModels.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemActivityBinding binding;
        if (convertView == null){
            binding = ItemActivityBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        }else {
            binding = ItemActivityBinding.bind(convertView);
        }
        Glide.with(binding.surat).load(secondModels.get(position).getImg()).into(binding.surat);
        binding.txtName.setText(secondModels.get(position).getSname());
        binding.catigory.setText(secondModels.get(position).getCatigory());
        binding.Count.setText(secondModels.get(position).getCount());
        binding.malumot.setText(secondModels.get(position).getMalum());
        return super.getView(position, convertView, parent);
    }
}
