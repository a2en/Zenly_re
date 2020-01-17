package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.engine.u */
class C9008u {

    /* renamed from: a */
    private boolean f23531a;

    /* renamed from: b */
    private final Handler f23532b = new Handler(Looper.getMainLooper(), new C9009a());

    /* renamed from: com.bumptech.glide.load.engine.u$a */
    private static final class C9009a implements Callback {
        C9009a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).recycle();
            return true;
        }
    }

    C9008u() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24514a(Resource<?> resource) {
        if (this.f23531a) {
            this.f23532b.obtainMessage(1, resource).sendToTarget();
        } else {
            this.f23531a = true;
            resource.recycle();
            this.f23531a = false;
        }
    }
}
