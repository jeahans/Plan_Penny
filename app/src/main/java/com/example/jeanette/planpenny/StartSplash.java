package com.example.jeanette.planpenny;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;


public class StartSplash extends Activity implements Runnable{

    Handler handler = new Handler();
    static StartSplash aktivitetDerVisesNu=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_splash);
        if(savedInstanceState==null){
            handler.postDelayed(this,3000);
        }
        aktivitetDerVisesNu=this;
    }
    public void run(){
        getFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.insertFrag, new MainScreenFragment())
                .addToBackStack(null)
                .commit();
        aktivitetDerVisesNu.finish();
        aktivitetDerVisesNu=null;
    }

    public void finish(){
        super.finish();
        handler.removeCallbacks(this);

    }


}
