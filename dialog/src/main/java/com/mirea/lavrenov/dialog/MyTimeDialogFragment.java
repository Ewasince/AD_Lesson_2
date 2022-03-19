package com.mirea.lavrenov.dialog;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.icu.util.Calendar;
import android.os.Build;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class MyTimeDialogFragment extends TimePickerDialog {
    private int mYear, mMonth, mDay, mHour, mMinute;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public MyTimeDialogFragment(Context context, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) {
        super(context, listener, hourOfDay, minute, is24HourView);
    }
}
