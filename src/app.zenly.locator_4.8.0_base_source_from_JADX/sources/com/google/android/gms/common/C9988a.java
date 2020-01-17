package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C10123l;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C9988a implements ServiceConnection {

    /* renamed from: a */
    private boolean f26263a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f26264b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo27004a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C10123l.m25519c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f26263a) {
            this.f26263a = true;
            IBinder iBinder = (IBinder) this.f26264b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f26264b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
