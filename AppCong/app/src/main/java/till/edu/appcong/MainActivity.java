package till.edu.appcong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View view){
        //Tham chieu den dieu khien trong XML
        EditText editnumA= findViewById(R.id.edit1);
        EditText editnumB= findViewById(R.id.edit2);
        EditText editTextKQ= findViewById(R.id.editKQ);
        //Get data
        String strA= editnumA.getText().toString();
        String strB= editnumB.getText().toString();
        // Convert to Num
        int numA= Integer.parseInt(strA);
        int numB= Integer.parseInt(strB);
        //Tinh toan
        int Sum= numA+numB;
        String strKQ= String.valueOf(Sum);
        //Hien thi KQ ra man hinh
        editTextKQ.setText(strKQ);

    }
}