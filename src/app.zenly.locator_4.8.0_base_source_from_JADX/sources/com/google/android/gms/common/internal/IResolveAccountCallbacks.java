package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;

public interface IResolveAccountCallbacks extends IInterface {
    void onAccountResolutionComplete(ResolveAccountResponse resolveAccountResponse) throws RemoteException;
}
