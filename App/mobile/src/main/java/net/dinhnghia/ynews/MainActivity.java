package net.dinhnghia.ynews;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvNews;
    ArrayList<String> arrNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNews = (ListView) findViewById(R.id.listviewNews);
        arrNews = new ArrayList<>();

        arrNews.add("Công an vào cuộc vụ Chánh thanh tra Sở bị tố 'bảo kê' xe quá tải");
        arrNews.add("Điều chỉnh quy hoạch xây dựng vùng TP.HCM");
        arrNews.add("Tổng bí thư nêu 5 nhiệm vụ quan trọng của quân đội");
        arrNews.add("Tài xế tông chết 4 người ở Thái Nguyên khai do phóng nhanh");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrNews
        );

        lvNews.setAdapter(adapter);
        lvNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //i => index of arrNews
                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void XinChao (){
        Log.d("VDN", "Xin chao");
    }


}
