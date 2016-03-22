package com.pplab.songhua2.androidstudy.pSysService.am;

import com.pplab.songhua2.androidstudy.pBinder.IInterface;
import com.pplab.songhua2.androidstudy.pContext.ComponentName;
import com.pplab.songhua2.androidstudy.pContext.Intent;
import com.pplab.songhua2.androidstudy.pUtil.RemoteException;

/**
 * Created by songhua2 on 2016/3/22.
 */
public interface IActivityManager extends IInterface {

    public ComponentName startService(IApplicationThread caller,Intent service,
                                      String resolveType,String callingPackage,int userId) throws RemoteException;
}
