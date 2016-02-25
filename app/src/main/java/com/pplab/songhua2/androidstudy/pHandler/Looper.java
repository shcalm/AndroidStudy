package com.pplab.songhua2.androidstudy.pHandler;

/**
 * Created by songhua2 on 2016/2/15.
 */
public class Looper {
    static final ThreadLocal<Looper> sThreadLocal = new ThreadLocal<Looper>();

    private static Looper sMainLooper;

    final MessageQueue mQueue;

    final Thread mThread;

    public static void prepare(){
        prepare(true);
    }
    public static void prepare(boolean quitAllowed){
        if(sThreadLocal.get() != null){
            throw new RuntimeException("only one looper per thread");
        }
        sThreadLocal.set(new Looper(quitAllowed));
    }

    private Looper(boolean quitAllowed){
        mQueue = new MessageQueue(quitAllowed);
        mThread = Thread.currentThread();
    }

    public static Looper myLooper(){
        return sThreadLocal.get();

    }

    public static void loop(){
        final Looper me = myLooper();

        final MessageQueue queue = me.mQueue;

        for(;;){
            Message msg = queue.next();

            if( msg == null){
                return;
            }

            msg.target.handleMessage(msg);


        msg.recycleUnchecked();
        }

    }

}
