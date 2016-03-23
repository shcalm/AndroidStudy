package com.pplab.songhua2.androidstudy.pBinder;

import com.pplab.songhua2.androidstudy.pUtil.RemoteException;

/**
 * Created by songhua2 on 2016/3/22.
 */
public class Binder implements  IBinder{

    private long mObject;
    private IInterface mOwner;
    private String mDescriptor;
/*some native methods comment now
    public static final native int getCallingPid();
    public static final native int getCallingUid();
    public static final native long clearCallingIdentity();
    public static final native void restoreCallingIdentity();
    public static final native int getThreadStrictModePolicy();
    public static final native void flushPendingCommands();
    public static final native void joinThreadPool();
*/
    public static final boolean isProxy(IInterface iface){
        return iface.asBinder() != iface;
    }
    public Binder(){
      //  init();

    }
    public void attachInterface(IInterface owner,String descriptor){
        mOwner = owner;
        mDescriptor = descriptor;
    }
    @Override
    public String getInterfaceDescriptor() throws RemoteException {
        return mDescriptor;
    }

    @Override
    public boolean isBinderAlive() {
        return true;
    }

    @Override
    public IInterface queryLocalInterface(String descriptor) {
        if(mDescriptor.equals(descriptor)){
            return mOwner;
        }
        return null;
    }

    @Override
    public boolean transact(int code, Parcel data, Parcel reply, int flags) {
        return false;
    }

    @Override
    public void linkToDeath(DeathRecipient reipient, int flags) throws RemoteException {

    }

    @Override
    public boolean unlinkToDeath(DeathRecipient recipent, int flags) {
        return false;
    }
}
