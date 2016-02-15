package com.pplab.songhua2.androidstudy.handler;

import android.os.SystemClock;

/**
 * Created by songhua2 on 2016/2/15.
 */
public class Handler {
    private static final boolean FIND_LEAKS = false;

    private static final String TAG = "myhandler";

    final MessageQueue mQueue;

    final Looper mLooper;
    final Callback mCallback;
    final boolean mAsynchronous;

    public interface Callback{
         boolean handleMessage(Message msg);
    }


    public Handler(){
        this(null,false);
    }


    public Handler(Callback callback, boolean async) {
        if(FIND_LEAKS){

        }

        mLooper = Looper.myLooper();

        if(mLooper == null){
            throw new RuntimeException("can't create handler inside that has not called Looper.prepared()");
        }
        mQueue = mLooper.mQueue;
        mCallback = callback;
        mAsynchronous = async;

    }

    public void dispatchMessage(Message msg){
        if(msg.callback != null){

        }else {
            if (mCallback != null) {
                if (mCallback.handleMessage(msg)) {
                    return;
                }

            }
            handleMessage(msg);
        }
    }

    public final boolean sendMessage(Message msg){
        return sendMessageDelayed(msg,0);
    }

    public final  boolean sendMessageDelayed(Message msg, long delay) {
        if(delay < 0){
            delay = 0;
        }
        return sendMessageAtTime(msg, SystemClock.uptimeMillis() + delay);

    }

    public final boolean sendMessageAtTime(Message msg, long updateMilis) {
        MessageQueue queue = mQueue;
        if(queue == null){
            RuntimeException e = new RuntimeException("send message with no queue");
            return false;
        }
        return enqueueMessage(queue,msg,updateMilis);

    }

    public final boolean enqueueMessage(MessageQueue queue, Message msg, long updateMilis) {
        msg.target = this;
        if(mAsynchronous){
            msg.setAsynchronous(true);
        }
        return queue.enqueueMessage(msg,updateMilis);
    }

    public  void handleMessage(Message msg) {
    }
}
