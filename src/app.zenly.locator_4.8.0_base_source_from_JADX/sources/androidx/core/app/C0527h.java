package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.p001v4.app.INotificationSideChannel;
import android.support.p001v4.app.INotificationSideChannel.C0006a;
import android.util.Log;
import com.android.volley.toolbox.C8733j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: androidx.core.app.h */
public final class C0527h {

    /* renamed from: c */
    private static final Object f2528c = new Object();

    /* renamed from: d */
    private static String f2529d;

    /* renamed from: e */
    private static Set<String> f2530e = new HashSet();

    /* renamed from: f */
    private static final Object f2531f = new Object();

    /* renamed from: g */
    private static C0531d f2532g;

    /* renamed from: a */
    private final Context f2533a;

    /* renamed from: b */
    private final NotificationManager f2534b = ((NotificationManager) this.f2533a.getSystemService("notification"));

    /* renamed from: androidx.core.app.h$a */
    private static class C0528a implements C0533e {

        /* renamed from: a */
        final String f2535a;

        /* renamed from: b */
        final int f2536b = 0;

        /* renamed from: c */
        final String f2537c = null;

        /* renamed from: d */
        final boolean f2538d = true;

        C0528a(String str) {
            this.f2535a = str;
        }

        /* renamed from: a */
        public void mo3044a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f2538d) {
                iNotificationSideChannel.cancelAll(this.f2535a);
            } else {
                iNotificationSideChannel.cancel(this.f2535a, this.f2536b, this.f2537c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.f2535a);
            sb.append(", id:");
            sb.append(this.f2536b);
            sb.append(", tag:");
            sb.append(this.f2537c);
            sb.append(", all:");
            sb.append(this.f2538d);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.core.app.h$b */
    private static class C0529b implements C0533e {

        /* renamed from: a */
        final String f2539a;

        /* renamed from: b */
        final int f2540b;

        /* renamed from: c */
        final String f2541c;

        /* renamed from: d */
        final Notification f2542d;

        C0529b(String str, int i, String str2, Notification notification) {
            this.f2539a = str;
            this.f2540b = i;
            this.f2541c = str2;
            this.f2542d = notification;
        }

        /* renamed from: a */
        public void mo3044a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f2539a, this.f2540b, this.f2541c, this.f2542d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.f2539a);
            sb.append(", id:");
            sb.append(this.f2540b);
            sb.append(", tag:");
            sb.append(this.f2541c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.core.app.h$c */
    private static class C0530c {

        /* renamed from: a */
        final ComponentName f2543a;

        /* renamed from: b */
        final IBinder f2544b;

        C0530c(ComponentName componentName, IBinder iBinder) {
            this.f2543a = componentName;
            this.f2544b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.h$d */
    private static class C0531d implements Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f2545a;

        /* renamed from: b */
        private final HandlerThread f2546b;

        /* renamed from: c */
        private final Handler f2547c;

        /* renamed from: d */
        private final Map<ComponentName, C0532a> f2548d = new HashMap();

        /* renamed from: e */
        private Set<String> f2549e = new HashSet();

        /* renamed from: androidx.core.app.h$d$a */
        private static class C0532a {

            /* renamed from: a */
            final ComponentName f2550a;

            /* renamed from: b */
            boolean f2551b = false;

            /* renamed from: c */
            INotificationSideChannel f2552c;

            /* renamed from: d */
            ArrayDeque<C0533e> f2553d = new ArrayDeque<>();

            /* renamed from: e */
            int f2554e = 0;

            C0532a(ComponentName componentName) {
                this.f2550a = componentName;
            }
        }

        C0531d(Context context) {
            this.f2545a = context;
            this.f2546b = new HandlerThread("NotificationManagerCompat");
            this.f2546b.start();
            this.f2547c = new Handler(this.f2546b.getLooper(), this);
        }

        /* renamed from: b */
        private void m2500b(C0533e eVar) {
            m2494a();
            for (C0532a aVar : this.f2548d.values()) {
                aVar.f2553d.add(eVar);
                m2501c(aVar);
            }
        }

        /* renamed from: c */
        private void m2501c(C0532a aVar) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f2550a);
                sb.append(", ");
                sb.append(aVar.f2553d.size());
                sb.append(" queued tasks");
                Log.d(str, sb.toString());
            }
            if (!aVar.f2553d.isEmpty()) {
                if (!m2497a(aVar) || aVar.f2552c == null) {
                    m2502d(aVar);
                    return;
                }
                while (true) {
                    C0533e eVar = (C0533e) aVar.f2553d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(eVar);
                            Log.d(str, sb2.toString());
                        }
                        eVar.mo3044a(aVar.f2552c);
                        aVar.f2553d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f2550a);
                            Log.d(str, sb3.toString());
                        }
                    } catch (RemoteException e) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.f2550a);
                        Log.w(str, sb4.toString(), e);
                    }
                }
                if (!aVar.f2553d.isEmpty()) {
                    m2502d(aVar);
                }
            }
        }

        /* renamed from: d */
        private void m2502d(C0532a aVar) {
            if (!this.f2547c.hasMessages(3, aVar.f2550a)) {
                aVar.f2554e++;
                int i = aVar.f2554e;
                String str = "NotifManCompat";
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.f2553d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.f2550a);
                    sb.append(" after ");
                    sb.append(aVar.f2554e);
                    sb.append(" retries");
                    Log.w(str, sb.toString());
                    aVar.f2553d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                    Log.d(str, sb2.toString());
                }
                this.f2547c.sendMessageDelayed(this.f2547c.obtainMessage(3, aVar.f2550a), (long) i2);
            }
        }

        /* renamed from: a */
        public void mo3047a(C0533e eVar) {
            this.f2547c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m2500b((C0533e) message.obj);
                return true;
            } else if (i == 1) {
                C0530c cVar = (C0530c) message.obj;
                m2496a(cVar.f2543a, cVar.f2544b);
                return true;
            } else if (i == 2) {
                m2498b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m2495a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                Log.d(str, sb.toString());
            }
            this.f2547c.obtainMessage(1, new C0530c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                Log.d(str, sb.toString());
            }
            this.f2547c.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m2496a(ComponentName componentName, IBinder iBinder) {
            C0532a aVar = (C0532a) this.f2548d.get(componentName);
            if (aVar != null) {
                aVar.f2552c = C0006a.m3a(iBinder);
                aVar.f2554e = 0;
                m2501c(aVar);
            }
        }

        /* renamed from: b */
        private void m2498b(ComponentName componentName) {
            C0532a aVar = (C0532a) this.f2548d.get(componentName);
            if (aVar != null) {
                m2499b(aVar);
            }
        }

        /* renamed from: a */
        private void m2495a(ComponentName componentName) {
            C0532a aVar = (C0532a) this.f2548d.get(componentName);
            if (aVar != null) {
                m2501c(aVar);
            }
        }

        /* renamed from: b */
        private void m2499b(C0532a aVar) {
            if (aVar.f2551b) {
                this.f2545a.unbindService(this);
                aVar.f2551b = false;
            }
            aVar.f2552c = null;
        }

        /* renamed from: a */
        private void m2494a() {
            String str;
            Set<String> b = C0527h.m2488b(this.f2545a);
            if (!b.equals(this.f2549e)) {
                this.f2549e = b;
                List queryIntentServices = this.f2545a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                Iterator it = queryIntentServices.iterator();
                while (true) {
                    str = "NotifManCompat";
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (b.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w(str, sb.toString());
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f2548d.containsKey(componentName2)) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d(str, sb2.toString());
                        }
                        this.f2548d.put(componentName2, new C0532a(componentName2));
                    }
                }
                Iterator it2 = this.f2548d.entrySet().iterator();
                while (it2.hasNext()) {
                    Entry entry = (Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(entry.getKey());
                            Log.d(str, sb3.toString());
                        }
                        m2499b((C0532a) entry.getValue());
                        it2.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m2497a(C0532a aVar) {
            if (aVar.f2551b) {
                return true;
            }
            aVar.f2551b = this.f2545a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2550a), this, 33);
            if (aVar.f2551b) {
                aVar.f2554e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f2550a);
                Log.w("NotifManCompat", sb.toString());
                this.f2545a.unbindService(this);
            }
            return aVar.f2551b;
        }
    }

    /* renamed from: androidx.core.app.h$e */
    private interface C0533e {
        /* renamed from: a */
        void mo3044a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private C0527h(Context context) {
        this.f2533a = context;
    }

    /* renamed from: a */
    public static C0527h m2485a(Context context) {
        return new C0527h(context);
    }

    /* renamed from: b */
    public void mo3043b() {
        this.f2534b.cancelAll();
        if (VERSION.SDK_INT <= 19) {
            m2486a((C0533e) new C0528a(this.f2533a.getPackageName()));
        }
    }

    /* renamed from: a */
    public void mo3041a(String str, int i, Notification notification) {
        if (m2487a(notification)) {
            m2486a((C0533e) new C0529b(this.f2533a.getPackageName(), i, str, notification));
            this.f2534b.cancel(str, i);
            return;
        }
        this.f2534b.notify(str, i, notification);
    }

    /* renamed from: b */
    public static Set<String> m2488b(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2528c) {
            if (string != null) {
                if (!string.equals(f2529d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f2530e = hashSet;
                    f2529d = string;
                }
            }
            set = f2530e;
        }
        return set;
    }

    /* renamed from: a */
    public boolean mo3042a() {
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return this.f2534b.areNotificationsEnabled();
        }
        boolean z = true;
        if (i >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f2533a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f2533a.getApplicationInfo();
            String packageName = this.f2533a.getApplicationContext().getPackageName();
            int i2 = applicationInfo.uid;
            try {
                Class cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() != 0) {
                    z = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2487a(Notification notification) {
        Bundle a = NotificationCompat.m2385a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    private void m2486a(C0533e eVar) {
        synchronized (f2531f) {
            if (f2532g == null) {
                f2532g = new C0531d(this.f2533a.getApplicationContext());
            }
            f2532g.mo3047a(eVar);
        }
    }
}
