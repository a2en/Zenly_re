package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat.C0508a;
import androidx.core.app.NotificationCompat.C0511d;
import androidx.core.app.NotificationCompat.C0512e;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.tasks.C10697f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.d */
final class C11105d {

    /* renamed from: a */
    private final Executor f28792a;

    /* renamed from: b */
    private final Context f28793b;

    /* renamed from: c */
    private final C11104c f28794c;

    /* renamed from: d */
    private final Bundle f28795d;

    public C11105d(Context context, Bundle bundle, Executor executor) {
        this.f28792a = executor;
        this.f28793b = context;
        this.f28795d = bundle;
        this.f28794c = new C11104c(context, context.getPackageName());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32351a() {
        boolean z;
        if ("1".equals(C11104c.m28591a(this.f28795d, "gcm.n.noui"))) {
            return true;
        }
        if (!((KeyguardManager) this.f28793b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!C10174k.m25684g()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List runningAppProcesses = ((ActivityManager) this.f28793b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        C11108g a = C11108g.m28608a(C11104c.m28591a(this.f28795d, "gcm.n.image"));
        if (a != null) {
            a.mo32354a(this.f28792a);
        }
        C11106e a2 = this.f28794c.mo32350a(this.f28795d);
        C0511d dVar = a2.f28796a;
        String str = "FirebaseMessaging";
        if (a != null) {
            try {
                Bitmap bitmap = (Bitmap) C10697f.m27264a(a.mo32353a(), 5, TimeUnit.SECONDS);
                dVar.mo2989a(bitmap);
                C0508a aVar = new C0508a();
                aVar.mo2981b(bitmap);
                aVar.mo2979a((Bitmap) null);
                dVar.mo2991a((C0512e) aVar);
            } catch (ExecutionException unused) {
            } catch (InterruptedException unused2) {
                Log.w(str, "Interrupted while downloading image, showing notification without it");
                a.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused3) {
                Log.w(str, "Failed to download image in time, showing notification without it");
                a.close();
            }
        }
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Showing notification");
        }
        ((NotificationManager) this.f28793b.getSystemService("notification")).notify(a2.f28797b, 0, a2.f28796a.mo2984a());
        return true;
    }
}
