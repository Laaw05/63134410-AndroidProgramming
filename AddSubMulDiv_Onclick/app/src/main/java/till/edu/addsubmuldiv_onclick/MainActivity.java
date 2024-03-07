package till.edu.addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextNum1;
    EditText editTextNum2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //Gan bo lang nghe su kien cho tung nut
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data
                // 1. Tim editText
                //2. Lay du lieu
                String strNum1=  editTextNum1.getText().toString();
                String strNum2=  editTextNum2.getText().toString();
                //3. Chuyen du lieu chu sang du lieu so
                float Num1= Float.parseFloat(strNum1);
                float Num2= Float.parseFloat(strNum2);
                //4. Thuc hien cong 2 so
                float Sum= Num1+Num2;
                //5. Chuyen ket qua tu so thanh chu roi in ra man hinh
                String displayKQ= String.valueOf(Sum);
                editTextKQ.setText(displayKQ);
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data
                // 1. Tim editText
                //2. Lay du lieu
                String strNum1=  editTextNum1.getText().toString();
                String strNum2=  editTextNum2.getText().toString();
                //3. Chuyen du lieu chu sang du lieu so
                float Num1= Float.parseFloat(strNum1);
                float Num2= Float.parseFloat(strNum2);
                //4. Thuc hien cong 2 so
                float Sum= Num1-Num2;
                //5. Chuyen ket qua tu so thanh chu roi in ra man hinh
                String displayKQ= String.valueOf(Sum);
                editTextKQ.setText(displayKQ);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data
                // 1. Tim editText
                //2. Lay du lieu
                String strNum1=  editTextNum1.getText().toString();
                String strNum2=  editTextNum2.getText().toString();
                //3. Chuyen du lieu chu sang du lieu so
                float Num1= Float.parseFloat(strNum1);
                float Num2= Float.parseFloat(strNum2);
                //4. Thuc hien cong 2 so
                float Sum= Num1*Num2;
                //5. Chuyen ket qua tu so thanh chu roi in ra man hinh
                String displayKQ= String.valueOf(Sum);
                editTextKQ.setText(displayKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data
                // 1. Tim editText
                //2. Lay du lieu
                String strNum1=  editTextNum1.getText().toString();
                String strNum2=  editTextNum2.getText().toString();
                //3. Chuyen du lieu chu sang du lieu so
                float Num1= Float.parseFloat(strNum1);
                float Num2= Float.parseFloat(strNum2);
                //4. Thuc hien cong 2 so
                float Sum= Num1 / Num2;
                //5. Chuyen ket qua tu so thanh chu roi in ra man hinh
                String displayKQ= String.valueOf(Sum);
                editTextKQ.setText(displayKQ);
            }
        });
    }
    public void  TimDieuKhien(){
         editTextNum1= (EditText)findViewById(R.id.editNum1);
         editTextNum2= (EditText)findViewById(R.id.editNum2);
         editTextKQ = (EditText)findViewById(R.id.editKQ);
         nutCong= (Button)findViewById(R.id.btnCong);
         nutTru= (Button)findViewById(R.id.btnTru);
         nutNhan= (Button)findViewById(R.id.btnNhan);
         nutChia= (Button)findViewById(R.id.btnChia);

    }
    //Cac ham xu ly
    public void XuLyCong(View v){


    }
    public void XuLyTru(View v){

    }
    public void XuLyNhan(View v){

    }
    public void XuLyChia(View v){

    }
}