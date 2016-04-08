package com.pplab.songhua2.androidstudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by songhua2 on 2016/3/23.
 */
public class MyService extends Service {

    class imple extends IMyAidlInterface.Stub{

        @Override
        public int getmy() throws RemoteException {
            return 5;
        }

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new imple();
    }
}
