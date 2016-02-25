package com.pplab.songhua2.androidstudy.pService;

import android.app.Application;

import com.pplab.songhua2.androidstudy.pContext.ComponentCallbacks;
import com.pplab.songhua2.androidstudy.pContext.Context;

/**
 * Created by songhua2 on 2016/2/15.
 */
public abstract  class Service  extends Context implements ComponentCallbacks{

    private Application mApplication = null;
    public Service(){

    }

    public void onCreate(){

    }
    public final void stopSelf(){
        stopSelf(-1);
    }

    public final  void stopSelf(int i) {

    }

}
