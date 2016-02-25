package com.pplab.songhua2.androidstudy.pActivity.pWindow;

import com.pplab.songhua2.androidstudy.pActivity.pView.View;
import com.pplab.songhua2.androidstudy.pInputEvent.KeyEvent;
import com.pplab.songhua2.androidstudy.pInputEvent.MotionEvent;

/**
 * Created by songhua2 on 2016/2/16.
 */
public abstract  class Window {

    public interface Callback{
        public boolean dispatchKeyEvent(KeyEvent event);

        public boolean dispatchTouchEvent(MotionEvent event);

        public void onContentChanged();

        public void onWindowFocusChanged(boolean hasFocus);

       // public

    }

    public interface onWindowDismissedCallback{
        public void onWindowDismissed();
    }

    public  abstract void setContentView(View view);
}
