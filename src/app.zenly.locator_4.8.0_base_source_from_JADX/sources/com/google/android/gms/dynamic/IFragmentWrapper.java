package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public interface IFragmentWrapper extends IInterface {
    Bundle getArguments() throws RemoteException;

    int getId() throws RemoteException;

    boolean getRetainInstance() throws RemoteException;

    String getTag() throws RemoteException;

    int getTargetRequestCode() throws RemoteException;

    boolean getUserVisibleHint() throws RemoteException;

    boolean isAdded() throws RemoteException;

    boolean isDetached() throws RemoteException;

    boolean isHidden() throws RemoteException;

    boolean isInLayout() throws RemoteException;

    boolean isRemoving() throws RemoteException;

    boolean isResumed() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void setHasOptionsMenu(boolean z) throws RemoteException;

    void setMenuVisibility(boolean z) throws RemoteException;

    void setRetainInstance(boolean z) throws RemoteException;

    void setUserVisibleHint(boolean z) throws RemoteException;

    void startActivity(Intent intent) throws RemoteException;

    void startActivityForResult(Intent intent, int i) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzae() throws RemoteException;

    IFragmentWrapper zzaf() throws RemoteException;

    IObjectWrapper zzag() throws RemoteException;

    IFragmentWrapper zzah() throws RemoteException;

    IObjectWrapper zzai() throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;
}
