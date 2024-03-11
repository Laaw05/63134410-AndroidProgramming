package till.edu.ex_6_listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu trên listview
        //B1: lấy dữ liệu từ cơ sở dữ liệu(SQL, XML, noSQL, ....)
        //Ở bài này chúng ta hard-code dữ liệu trực tiep
        //Cần biến phù hợp để lưu du lieu
        //Khai bao bien luu du lieu
        ArrayList<String> dsTenTinhThanh= new ArrayList<String>();
        //Them du lieu o day
        dsTenTinhThanh.add("Ha Noi");
        dsTenTinhThanh.add("Thanh pho HCM");
        dsTenTinhThanh.add("Binh Thuan");
        dsTenTinhThanh.add("Quang Ngai");
        dsTenTinhThanh.add("Nha Trang");
        dsTenTinhThanh.add("Thua Thien Hue");
        dsTenTinhThanh.add("Lam Dong");

        //Tao adpter
        ArrayAdapter<String> adapterTinhThanh= new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsTenTinhThanh);
        //Gan dieu kien hien thi ListView
        ListView lvTenTinhThanh= findViewById(R.id.lvTTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

    }
}