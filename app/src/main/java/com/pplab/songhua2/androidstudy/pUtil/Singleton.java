package com.pplab.songhua2.androidstudy.pUtil;

/**
 * Created by songhua2 on 2016/3/22.
 */
public abstract  class Singleton<T> {

    private T mInstance;

    protected abstract T create();

    public final T get(){
        synchronized (this){
            if(mInstance == null){
                mInstance = create();
            }
            return  mInstance;
        }
    }
}
