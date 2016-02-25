package com.pplab.songhua2.androidstudy.pHandler;

import java.io.Serializable;

/**
 * Created by songhua2 on 2016/2/15.
 */
public class Message implements Serializable {

    static final int FLAG_ASYNCHRONOUS = 1 << 1;
    int flags;
    Handler target;
    Runnable callback;

    public void setAsynchronous(boolean async) {
        if(async){
            flags |= FLAG_ASYNCHRONOUS;
        }else{
            flags &= ~FLAG_ASYNCHRONOUS;
        }
    }

    public void recycleUnchecked() {
    }
}
