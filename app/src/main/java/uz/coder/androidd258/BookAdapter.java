package uz.coder.androidd258;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import uz.coder.androidd258.databinding.ItemBookBinding;

public class BookAdapter extends ArrayAdapter<Book> {
    private List<Book>bookList;
    public BookAdapter(@NonNull Context context, int resource, @NonNull List<Book> bookList) {
        super(context, resource, bookList);
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemBookBinding binding;
        if (convertView == null){
            binding = ItemBookBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        }else{
            binding = ItemBookBinding.bind(convertView);
        }
        binding.txt1.setText(bookList.get(position).getName());
        binding.txt2.setText(bookList.get(position).getPrice());
        return binding.getRoot();
    }
}
