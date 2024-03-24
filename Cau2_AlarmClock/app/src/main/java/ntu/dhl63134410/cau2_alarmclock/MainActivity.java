package ntu.dhl63134410.cau2_alarmclock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.util.Calendar;

import ntu.dhl63134410.cau2_alarmclock.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MaterialTimePicker timePicker;
    private Calendar calendar;
    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        createNotiChannel();

        binding.selectTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePicker= new MaterialTimePicker.Builder()
                        .setTimeFormat(TimeFormat.CLOCK_12H)
                        .setHour(12)
                        .setMinute(0)
                        .setTitleText("Select Alarm Time")
                        .build();

                timePicker.show(getSupportFragmentManager(), "danghoanglam");
                timePicker.addOnPositiveButtonClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (timePicker.getHour() > 12){
                            binding.selectTime.setText(
                                    String.format("%02d",(timePicker.getHour()-12)) +":"+ String.format("%02d", timePicker.getMinute())+"PM"
                            );
                        }else{
                            binding.selectTime.setText(timePicker.getHour()+":" + timePicker.getMinute()+ "AM");
                        }
                        calendar= Calendar.getInstance();
                        calendar.set(Calendar.HOUR_OF_DAY, timePicker.getHour());
                        calendar.set(Calendar.MINUTE, timePicker.getMinute());
                        calendar.set(Calendar.SECOND,0);
                        calendar.set(Calendar.MILLISECOND,0);
                    }
                });
            }
        });

        binding.setAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Intent intent= new Intent(MainActivity.this, AlarmReceiver.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(
                        MainActivity.this,
                        0,
                        intent,
                        PendingIntent.FLAG_IMMUTABLE // hoặc PendingIntent.FLAG_MUTABLE
                );

                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
                Toast.makeText(MainActivity.this,"Alarm Set", Toast.LENGTH_SHORT).show();

            }
        });
        
    }

    private void createNotiChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "akchannel";
            String desc = "Channel for Alarm Manager";
            int imp = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel= new NotificationChannel("danghoanglam", name, imp);
            channel.setDescription(desc);

            NotificationManager notificationManager= getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}