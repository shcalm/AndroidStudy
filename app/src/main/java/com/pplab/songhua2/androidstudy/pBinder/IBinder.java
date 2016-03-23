package com.pplab.songhua2.androidstudy.pBinder;


import com.pplab.songhua2.androidstudy.pUtil.RemoteException;

/**
 * Created by songhua2 on 2016/3/22.
 */
public interface IBinder {
    public String getInterfaceDescriptor() throws RemoteException;

    public boolean isBinderAlive();

    public IInterface queryLocalInterface(String descriptor);

    public boolean transact(int code, Parcel data, Parcel reply, int flags);

    public interface DeathRecipient{
        public void binderDied();
    }

    public void linkToDeath(DeathRecipient reipient,int flags) throws RemoteException;

    public boolean unlinkToDeath(DeathRecipient recipent,int flags);
}
