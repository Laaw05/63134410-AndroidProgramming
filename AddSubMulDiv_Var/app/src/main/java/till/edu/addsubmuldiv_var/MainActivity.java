package till.edu.addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText editnumA;
    EditText editnumB;

    Button nutCong, nutTru, nutNhan, nutChia;

    EditText textviewKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tim dieu khien (View)
        TimView();
        //Set Listening
        nutCong.setOnClickListener(Listener_Cong);
        nutTru.setOnClickListener(Listener_Tru);
        nutNhan.setOnClickListener(Listener_Nhan);
        nutChia.setOnClickListener(Listener_Chia);

    }
    /////////////////////////////////////////////////
    public void TimView(){
        editnumA= (EditText)findViewById(R.id.editNumA);
        editnumB= (EditText)findViewById(R.id.editNumB);
        textviewKQ= (EditText)findViewById(R.id.tvKQ);
        nutCong= (Button)findViewById(R.id.btnCong);
        nutTru= (Button)findViewById(R.id.btnTru);
        nutNhan= (Button)findViewById(R.id.btnNhan);
        nutChia= (Button)findViewById(R.id.btnChia);
    }
    //////////////////////////////////////////////////

    //////////////////////////////////////////////////
    //Tao bo lang nghe va xu ly su kien
    View.OnClickListener Listener_Cong= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNumA= editnumA.getText().toString();
            String strNumB= editnumB.getText().toString();

            float NumA= Float.parseFloat(strNumA);
            float NumB= Float.parseFloat(strNumB);

            float SUM= NumA+NumB;

            String strKQ= String.valueOf(SUM);

            textviewKQ.setText(strKQ);
        }
    };
    View.OnClickListener Listener_Tru= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNumA= editnumA.getText().toString();
            String strNumB= editnumB.getText().toString();

            float NumA= Float.parseFloat(strNumA);
            float NumB= Float.parseFloat(strNumB);

            float SUM= NumA-NumB;

            String strKQ= String.valueOf(SUM);

            textviewKQ.setText(strKQ);
        }
    };
    View.OnClickListener Listener_Nhan= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNumA= editnumA.getText().toString();
            String strNumB= editnumB.getText().toString();

            float NumA= Float.parseFloat(strNumA);
            float NumB= Float.parseFloat(strNumB);

            float SUM= NumA*NumB;

            String strKQ= String.valueOf(SUM);

            textviewKQ.setText(strKQ);
        }
    };
    View.OnClickListener Listener_Chia= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNumA= editnumA.getText().toString();
            String strNumB= editnumB.getText().toString();

            float NumA= Float.parseFloat(strNumA);
            float NumB= Float.parseFloat(strNumB);

            float SUM= NumA/NumB;

            String strKQ= String.valueOf(SUM);

            textviewKQ.setText(strKQ);
        }
    };
}