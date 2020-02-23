package ir.s.s.verifyeditext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.s.s.verifyet.VerifyEdittext;

public class MainActivity extends AppCompatActivity {

    VerifyEdittext verify_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verify_et=findViewById(R.id.verify_et);




        verify_et.setTextSize(36);

    }
}
