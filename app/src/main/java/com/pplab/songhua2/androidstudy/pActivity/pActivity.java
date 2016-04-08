package com.pplab.songhua2.androidstudy.pActivity;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.pplab.songhua2.androidstudy.pActivity.pWindow.Window;
import com.pplab.songhua2.androidstudy.pBinder.Bundle;
import com.pplab.songhua2.androidstudy.pContext.ComponentCallbacks;
import com.pplab.songhua2.androidstudy.pContext.Context;
import com.pplab.songhua2.androidstudy.pInputEvent.KeyEvent;
import com.pplab.songhua2.androidstudy.pInputEvent.MotionEvent;

/**
 * Created by songhua2 on 2016/2/16.
 */
public class pActivity extends Context implements ComponentCallbacks,Window.Callback,
        Window.onWindowDismissedCallback,
        KeyEvent.Callback{
    //start componentcallback
    @Override
    public void onConfigurationChanged() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimmemory() {

    }

    //end componment

    //start window.callback
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return false;
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return false;
    }

    @Override
    public void onContentChanged() {

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

    }

    //end window.callback

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return false;
    }
    //start window dissmissed
    @Override
    public void onWindowDismissed() {

    }
    //end

    public void onCreate(@Nullable Bundle savedInstanceState,
                         @Nullable PersistableBundle persistableBundle){
        onCreate(savedInstanceState);
    }

    public  void onCreate(@Nullable  Bundle savedInstanceState) {

    }
    public void setContentView(int layoutResID){

    }
}
