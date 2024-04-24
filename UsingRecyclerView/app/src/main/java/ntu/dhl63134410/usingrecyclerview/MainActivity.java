package ntu.dhl63134410.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewData = getDataForRecycleView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);

        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecycleView() {
        ArrayList<LandScape> dsDulieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("cotco", "Cot co Ha Noi");
        dsDulieu.add(new LandScape("paris", "Paris"));
        dsDulieu.add(new LandScape("rome", "Rome"));
        dsDulieu.add(new LandScape("hanoi", "Hà Nội"));
        dsDulieu.add(new LandScape("london", "Luân Đôn"));

        return dsDulieu;
    }
}