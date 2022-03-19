package com.mirea.lavrenov.dialog;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentManager;


public class MyDateDialogFragment extends DatePickerDialog {
    public MyDateDialogFragment(@NonNull Context context, @Nullable OnDateSetListener listener, int year, int month, int dayOfMonth) {
        super(context, listener, year, month, dayOfMonth);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Здравствуй МИРЭА!")
//                .setMessage("Успех близок?")
//                .setIcon(R.mipmap.ic_launcher_round)
//                .setPositiveButton("Иду дальше", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // Закрываем окно
//                        ((MainActivity)getActivity()).onOkClicked();
//                        dialog.cancel();
//                    }
//                })
//                .setNeutralButton("На паузе",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog,
//                                                int id) {
//                                ((MainActivity)getActivity()).onNeutralClicked();
//                                dialog.cancel();
//                            }
//                        })
//                .setNegativeButton("Нет",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog,
//                                                int id) {
//
//                                ((MainActivity)getActivity()).onCancelClicked();
//                                dialog.cancel();
//                            }
//                        });
//        return builder.create();
//    }
}
