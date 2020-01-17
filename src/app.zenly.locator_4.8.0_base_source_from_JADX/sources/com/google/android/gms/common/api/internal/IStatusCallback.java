package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface IStatusCallback extends IInterface {
    void onResult(Status status) throws RemoteException;
}
