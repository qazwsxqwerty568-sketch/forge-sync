package com.forge.sync;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        
        TextView t = new TextView(this);
        t.setTextSize(18f);
        t.setPadding(40, 40, 40, 40);

        String deviceId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        String info = "ДАННЫЕ УСТРОЙСТВА:\n\n"
                + "Модель: " + Build.MODEL + "\n\n"
                + "Производитель: " + Build.MANUFACTURER + "\n\n"
                + "Версия Android: " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")\n\n"
                + "ID устройства: " + deviceId + "\n\n"
                + "Бренд: " + Build.BRAND + "\n\n"
                + "Устройство: " + Build.DEVICE + "\n\n"
                + "Плата: " + Build.BOARD;

        t.setText(info);
        
        ScrollView scroll = new ScrollView(this);
        scroll.addView(t);
        setContentView(scroll);
    }
}
