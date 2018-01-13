package com.admadimurtiwikanagmail.quisenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Windows 10 on 13/01/2018.
 */

public class Hasilkuis extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.hasil_kuis);

            TextView hasil = (TextView)findViewById(R.id.hasil);
            TextView nilai = (TextView)findViewById(R.id.nilai);

            hasil.setText("Jawaban benar : "+MainActivity.benar+"\nJawaban salah : "+MainActivity.salah);
            nilai.setText(""+MainActivity.hasil);
        }

        public void ulangi (View view)
            {
                finish();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }

}
