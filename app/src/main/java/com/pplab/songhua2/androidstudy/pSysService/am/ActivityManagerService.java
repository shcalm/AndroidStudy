package com.pplab.songhua2.androidstudy.pSysService.am;

import com.pplab.songhua2.androidstudy.pBinder.Binder;
import com.pplab.songhua2.androidstudy.pContext.ComponentName;
import com.pplab.songhua2.androidstudy.pContext.Context;
import com.pplab.songhua2.androidstudy.pContext.Intent;
import com.pplab.songhua2.androidstudy.pUtil.RemoteException;

/**
 * Created by songhua2 on 2016/2/26.
 */
public class ActivityManagerService extends  ActivityManagerNative{


    final ActiveService mService;
    public ActivityManagerService(Context contet){
        mService = new ActiveService(this);
    }
    public ComponentName startService(IApplicationThread caller, Intent service, String resolveType, String callingPackage, int userId) throws RemoteException {

        synchronized (this){
            final int callingPid = 0;//Binder.getCallingPid();
            final int callingUid = 0;//Binder.getCallingUid();
            final long origId = 0;//Binder.clearCallingIdentity();

            ComponentName res = mService.startServiceLocked(caller,service,resolveType,
                    callingPid,callingUid,userId);
            return res;
        }
    }

}
