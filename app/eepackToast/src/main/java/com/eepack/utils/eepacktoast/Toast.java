package com.eepack.utils.eepacktoast;

import android.content.Context;

public class Toast {
    public Toast(){}

    public static void showToast(Context context, String str){
        android.widget.Toast.makeText(context,str, android.widget.Toast.LENGTH_LONG).show();
    }
}
