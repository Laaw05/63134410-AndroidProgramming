package ntu.dhl63134410.bottomnavigationview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Integer> courseImg;
    private ArrayList<String> courseName;

    public CourseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize course data
        courseImg = new ArrayList<>(Arrays.asList(
                R.drawable.data_structure, R.drawable.c_plus_plus,
                R.drawable.c_hash, R.drawable.java_script,
                R.drawable.java, R.drawable.c,
                R.drawable.html, R.drawable.css));

        courseName = new ArrayList<>(Arrays.asList(
                "Data Structure", "C++", "C#", "JavaScript", "Java",
                "C-Language", "HTML 5", "CSS"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);

        // Setting the layout as linear layout for vertical orientation
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        // Initialize Adapter with course data
        Adapter adapter = new Adapter(getContext(), courseImg, courseName);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
