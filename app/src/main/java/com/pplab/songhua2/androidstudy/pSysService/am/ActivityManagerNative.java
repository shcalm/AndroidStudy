package com.pplab.songhua2.androidstudy.pSysService.am;

import android.content.Context;

import com.pplab.songhua2.androidstudy.pBinder.Binder;
import com.pplab.songhua2.androidstudy.pBinder.IBinder;
import com.pplab.songhua2.androidstudy.pContext.ComponentName;
import com.pplab.songhua2.androidstudy.pContext.Intent;
import com.pplab.songhua2.androidstudy.pUtil.RemoteException;
import com.pplab.songhua2.androidstudy.pUtil.Singleton;

/**
 * Created by songhua2 on 2016/3/22.
 */
public class ActivityManagerNative extends Binder implements  IActivityManager{

    private static final Singleton<IActivityManager> gDefault= new Singleton<IActivityManager>(){

        @Override
        protected IActivityManager create() {
            IBinder b = ServiceManager.getService("activity");
            IActivityManager am = asInterface(b);
            return am;
        }
    }
    public static Context getDefault() {
        return null;
    }

    @Override
    public ComponentName startService(IApplicationThread caller, Intent service, String resolveType, String callingPackage, int userId) throws RemoteException {
        return null;
    }

    @Override
    public IBinder asBinder() {
        return null;
    }

    static public IActivityManager asInterface(IBinder obj){
        if(obj == null)
            return null;
        IActivityManager in = (IActivityManager)obj.
    }
}
