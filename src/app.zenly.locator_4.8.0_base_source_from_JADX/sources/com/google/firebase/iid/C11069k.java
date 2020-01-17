package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.k */
final class C11069k {

    /* renamed from: a */
    private final Messenger f28713a;

    /* renamed from: b */
    private final zzm f28714b;

    C11069k(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f28713a = new Messenger(iBinder);
            this.f28714b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f28714b = new zzm(iBinder);
            this.f28713a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32294a(Message message) throws RemoteException {
        Messenger messenger = this.f28713a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzm zzm = this.f28714b;
        if (zzm != null) {
            zzm.mo32337a(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
