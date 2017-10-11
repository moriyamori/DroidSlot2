package com.example.sample.droidslot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;


public class DroidSlotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_slot);
        //変数=指定したウィジェットID
        ImageView droidImage1 = (ImageView) this.findViewById(R.id.droidimageid1);
        int droidSide1;

        Random r = new Random();//Randomクラスのオブジェクト作成
        droidSide1 = r.nextInt(4);//０以上２未満の整数乱数を作成
        switch (droidSide1) {//向きを表す値が0であれば
            case 0:
                droidImage1.setImageResource(R.drawable.droid_front);
                break;
            case 1:
                droidImage1.setImageResource(R.drawable.droid_back);
                break;
            case 2:
                droidImage1.setImageResource(R.drawable.droid_left);
                break;
            case 3:
                droidImage1.setImageResource(R.drawable.droid_right);
        }
    }
}