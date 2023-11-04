package uz.coder.androidd258;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uz.coder.androidd258.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ListView listView;
    private List<KinoModel> kinolist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        KinoAdapter kinoAdapter = new KinoAdapter(this,kinolist);
        binding.lv.setAdapter(kinoAdapter);
        binding.lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Bu "+ position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Name",kinolist.get(position).getName());
                intent.putExtra("Cat",kinolist.get(position).getCat());
                intent.putExtra("Count",kinolist.get(position).getCount());
                intent.putExtra("position",position);
                intent.putExtra("Image",kinolist.get(position).getImg());
                intent.putExtra("Malum",kinolist.get(position).getMalumot());
                startActivityForResult(intent,0);
            }
        });

    }

    private void loadData() {
        kinolist = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            kinolist.add(new KinoModel("https://uzmax.net/uploads/posts/2021-05/1620370333_orgimchak-odam-2-2004-uzbek-tilida.jpg","O'rgimchak odam 2","Tarjima kinolar / Jangari / Sarguzasht / Fantastika","+484","Oʻrgimchak-odam kinoda. Birinchi boʻlib 2002-yili ilk yaxshi formatda chiqqan Kino mashhur bolgan va koblap muhlislarning koʻnglidan joy olgan Piter Parker rolini Toby Maguere oʻynagan bu aktyorning orgimchak odami 3-shaxsiy filmida omadsizlikga uchragan va bir necha yillardan soʻng Yangi orgimchak odam rolida Endryu Garfild oʻynagan boʻlib, 2-shaxsiy filmi omadsizlaikga uchrab tohtatilgan. Keyinchalik Oʻrgimchak odam Marvel studyasiga qaytariladi va birinchi bolib Kapitan Amerika. Fuqarolik urushi filmida kameo qilgan keyinchalik oʻzining shaxsiy filmi chiqqan Rolni Tom Holland oʻynagan. Oʻrgimchak odam keyinchalik \"Qasoskorlar: Cheksizlik jangi\"da qatnashgan va \"Qasoskorlar: Intiho\" filmida tirilgan Oʻzining 2-filmida uning Piter Parker ekanini hamma bilgan va 3-filmida Doctor Strangening sehrni buzib Multiolamni buzgan va Piter Parkerni tanigan barcha bir olamga toplanib Tobey Maguire hamda Endryu Garfild rolidagi oʻrgimchak odamlar birlashib avvalgi yovuzlarni davolaydi shu bilan film omadli bolib keyingi Tom Hollandni Oʻrgimchak odammi yana trilogiyasiga start berildi\n" +
                    "\n" +
                    "Shaxsiyati"));
            kinolist.add(new KinoModel("https://topfilms.me/uploads/posts/2022-04/1649056440_1620605905_poster.jpg","Oltin kompas","Tarjima kinolar / Jangari","+462","Filipp Pullmanning Jon Miltonga yaqinligi shundan ko'rinib turibdi Oltin kompas. Bu o'quvchiga taqdim etiladigan xayoliy dunyoda seziladi. Ushbu xayoliy makonda odamlarning ruhi tanadan va hayvonlar siluetidan (demonlar) ajralib turadigan jismoniy shaklni namoyish etadi.. Ushbu koinotning o'ziga xos xususiyatlaridan yana biri uning madaniy va texnologik rivojlanishidir: elektr energiyasi \"ambarik\" deb nomlanadi va fizika \"eksperimental ilohiyot\" deb nomlanadi.\n" +
                    "\n" +
                    "Boshqa tomondan, havo transporti zeppelinlar va havo sharlaridan iborat. Hukumatning eng yuqori vakolatxonasi \"Magisterium\" deb nomlanadi va u erda juda aqlli gapiradigan zirhli ayiqlar mavjud (garchi ular xizmat ko'rsatmasa ham). Bundan tashqari, yuzlab yillar davomida yashashga qodir bo'lgan jodugarlar va qayiqlarda yashaydigan ko'chmanchi odamlar bor (ular kamdan-kam hollarda dengizdan boshqa joyda): \"giptliklar\"."));
            kinolist.add(new KinoModel("https://avatars.mds.yandex.net/get-kinopoisk-image/1898899/c23d2777-2ce5-4be3-8a5d-2ef7eea8c2cc/600x900","101 dalmatin","Tarjima kinolar / Multfilm","+146","101 ta dalmatin (inglizcha: One Hundred and One Dalmatians) 17chi toʻliq metrajli Disney animatsion filmidir. 25-yanvar 1961-yilda ekranlarga chiqarilgan[2]. Walt Disney Productions tomonidan ishlangan va Buena Vista Film Distribution tomonidan tarqatilgan. Filmga Hamilton Luske, Clyde Geronimi va Wolfgang Reitherman rejissorlik qilgan. Filmda bosh qahramonlarga Rod Taylor, Cate Bauer, Betty Lou Gerson, Ben Wright, Lisa Davis va Martha Wentworth ovoz bergan.\n" +
                    "\n" +
                    "Film sikveli, 101 Dalmatians II: Patch's London Adventure, 2003-yilda chiqarilgan."));
        }

    }
}