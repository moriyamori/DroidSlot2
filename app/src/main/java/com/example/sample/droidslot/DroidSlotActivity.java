package com.example.sample.droidslot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DroidSlotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_slot);
        //変数=指定したウィジェットID
        ImageView droidImage1 = (ImageView) this.findViewById(R.id.droidimageid1);
        droidImage1.setImageResource(R.drawable.droid_back);
    }
}
