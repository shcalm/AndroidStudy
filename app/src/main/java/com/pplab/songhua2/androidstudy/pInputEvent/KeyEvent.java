package com.pplab.songhua2.androidstudy.pInputEvent;

/**
 * Created by songhua2 on 2016/2/16.
 */
public class KeyEvent {
    public interface Callback{
        boolean onKeyDown(int keyCode,KeyEvent event);

        boolean onKeyUp(int keyCode,KeyEvent event);
    }
}
