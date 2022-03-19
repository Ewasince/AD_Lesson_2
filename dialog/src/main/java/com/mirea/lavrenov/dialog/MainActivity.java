package com.mirea.lavrenov.dialog;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private MainActivity link = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onClickDate(View view) {
        int mYear, mMonth, mDay, mHour, mMinute;

        final Calendar cal = Calendar.getInstance();
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);

        // инициализируем диалог выбора даты текущими значениями
        DatePickerDialog datePickerDialog = new MyDateDialogFragment(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String editTextDateParam = dayOfMonth + "." + (monthOfYear + 1) + "." + year;
                Toast.makeText(getApplicationContext(), editTextDateParam, Toast.LENGTH_SHORT).show();
            }
        }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onClickTime(View view) {
        int mYear, mMonth, mDay, mHour, mMinute;

        // получаем текущее время
        final Calendar cal = Calendar.getInstance();
        mHour = cal.get(Calendar.HOUR_OF_DAY);
        mMinute = cal.get(Calendar.MINUTE);

        // инициализируем диалог выбора времени текущими значениями
        TimePickerDialog timePickerDialog = new MyTimeDialogFragment(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String editTextTimeParam = hourOfDay + " : " + minute;
                        Toast.makeText(getApplicationContext(),editTextTimeParam, Toast.LENGTH_SHORT).show();
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();
    }

    public void onClickProgress(View view) {
        ProgressDialog pd;
        pd = new ProgressDialog(this);
        pd.setTitle("Title");
        pd.setMessage("Message");
        // добавляем кнопку
        pd.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Progress button has been clicked!", Toast.LENGTH_LONG);
            }
        });
        pd.show();
    }
}