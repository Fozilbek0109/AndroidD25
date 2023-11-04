package uz.coder.androidd258;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import uz.coder.androidd258.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    List<SecondModel> secondModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String Cat = intent.getStringExtra("Cat");
        String Count = intent.getStringExtra("Count");
        int position = intent.getIntExtra("position",0);
        String malum = intent.getStringExtra("Malum");
        SecondAdapter kinoAdapter = new SecondAdapter(this,secondModels);
        binding.layout.setAdapter(kinoAdapter);
        secondModels = new ArrayList<>();
        secondModels.add(new SecondModel("https://uzmax.net/uploads/posts/2021-05/1620370333_orgimchak-odam-2-2004-uzbek-tilida.jpg",name,malum,Cat,Count));
        secondModels.add(new SecondModel("https://topfilms.me/uploads/posts/2022-04/1649056440_1620605905_poster.jpg",name,malum,Cat,Count));
        secondModels.add(new SecondModel("https://avatars.mds.yandex.net/get-kinopoisk-image/1898899/c23d2777-2ce5-4be3-8a5d-2ef7eea8c2cc/600x900",name,malum,Cat,Count));
    }
}