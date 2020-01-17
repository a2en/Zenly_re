package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Task implements ReflectedParcelable {

    /* renamed from: e */
    private final String f26792e;

    /* renamed from: f */
    private final String f26793f;

    /* renamed from: g */
    private final boolean f26794g;

    /* renamed from: h */
    private final boolean f26795h;

    /* renamed from: i */
    private final int f26796i;

    /* renamed from: j */
    private final Set<Uri> f26797j;

    /* renamed from: k */
    private final boolean f26798k;

    /* renamed from: l */
    private final C10220k f26799l;

    /* renamed from: m */
    private final Bundle f26800m;

    /* renamed from: com.google.android.gms.gcm.Task$a */
    public static abstract class C10209a {

        /* renamed from: a */
        protected int f26801a;

        /* renamed from: b */
        protected String f26802b;

        /* renamed from: c */
        protected String f26803c;

        /* renamed from: d */
        protected boolean f26804d;

        /* renamed from: e */
        protected boolean f26805e = true;

        /* renamed from: f */
        protected boolean f26806f;

        /* renamed from: g */
        protected Set<Uri> f26807g = Collections.emptySet();

        /* renamed from: h */
        protected C10220k f26808h = C10220k.f26820d;

        /* renamed from: i */
        protected Bundle f26809i;

        /* renamed from: a */
        public abstract C10209a mo27682a(int i);

        /* renamed from: a */
        public abstract C10209a mo27684a(Bundle bundle);

        /* renamed from: a */
        public abstract C10209a mo27685a(Class<? extends GcmTaskService> cls);

        /* renamed from: a */
        public abstract C10209a mo27686a(String str);

        /* renamed from: a */
        public abstract C10209a mo27687a(boolean z);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo27688a() {
            C10123l.m25513a(this.f26802b != null, (Object) "Must provide an endpoint for this task by calling setService(ComponentName).");
            C10210a.m25818b(this.f26803c);
            C10220k kVar = this.f26808h;
            if (kVar != null) {
                int a = kVar.mo27720a();
                if (a == 1 || a == 0) {
                    int b = kVar.mo27722b();
                    int c = kVar.mo27723c();
                    if (a == 0 && b < 0) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("InitialBackoffSeconds can't be negative: ");
                        sb.append(b);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (a == 1 && b < 10) {
                        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    } else if (c < b) {
                        int c2 = kVar.mo27723c();
                        StringBuilder sb2 = new StringBuilder(77);
                        sb2.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                        sb2.append(c2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(45);
                    sb3.append("Must provide a valid RetryPolicy: ");
                    sb3.append(a);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (this.f26805e) {
                Task.m25803b(this.f26809i);
            }
            if (this.f26807g.isEmpty() || this.f26801a != 2) {
                for (Uri b2 : this.f26807g) {
                    Task.m25801a(b2);
                }
                return;
            }
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }

        /* renamed from: b */
        public abstract C10209a mo27689b(boolean z);

        /* renamed from: c */
        public abstract C10209a mo27691c(boolean z);
    }

    Task(C10209a aVar) {
        this.f26792e = aVar.f26802b;
        this.f26793f = aVar.f26803c;
        this.f26794g = aVar.f26804d;
        this.f26795h = aVar.f26805e;
        this.f26796i = aVar.f26801a;
        this.f26797j = aVar.f26807g;
        this.f26798k = aVar.f26806f;
        this.f26800m = aVar.f26809i;
        C10220k kVar = aVar.f26808h;
        if (kVar == null) {
            kVar = C10220k.f26820d;
        }
        this.f26799l = kVar;
    }

    /* renamed from: a */
    public void mo27677a(Bundle bundle) {
        bundle.putString("tag", this.f26793f);
        bundle.putBoolean("update_current", this.f26794g);
        bundle.putBoolean("persisted", this.f26795h);
        bundle.putString("service", this.f26792e);
        bundle.putInt("requiredNetwork", this.f26796i);
        if (!this.f26797j.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : this.f26797j) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.f26798k);
        bundle.putBoolean("requiresIdle", false);
        C10220k kVar = this.f26799l;
        Bundle bundle2 = new Bundle();
        kVar.mo27721a(bundle2);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.f26800m);
    }

    /* renamed from: b */
    public String mo27701b() {
        return this.f26793f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26792e);
        parcel.writeString(this.f26793f);
        parcel.writeInt(this.f26794g ? 1 : 0);
        parcel.writeInt(this.f26795h ? 1 : 0);
    }

    /* renamed from: b */
    public static void m25803b(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= 10240) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                        if (obj instanceof Bundle) {
                            m25803b((Bundle) obj);
                        } else {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Extras exceeding maximum size(10240 bytes): ");
            sb.append(dataSize);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Deprecated
    Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f26792e = parcel.readString();
        this.f26793f = parcel.readString();
        boolean z = true;
        this.f26794g = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f26795h = z;
        this.f26796i = 2;
        this.f26797j = Collections.emptySet();
        this.f26798k = false;
        this.f26799l = C10220k.f26820d;
        this.f26800m = null;
    }

    /* renamed from: a */
    public String mo27700a() {
        return this.f26792e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m25801a(Uri uri) {
        if (uri != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if ("tcp".equals(scheme)) {
                    if (port <= 0 || port > 65535) {
                        int port2 = uri.getPort();
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Invalid required URI port: ");
                        sb.append(port2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!"ping".equals(scheme)) {
                    String str = "Unsupported required URI scheme: ";
                    String valueOf = String.valueOf(scheme);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                } else if (port != -1) {
                    throw new IllegalArgumentException("Ping does not support port numbers");
                }
            } catch (NumberFormatException e) {
                String str2 = "Invalid port number: ";
                String valueOf2 = String.valueOf(e.getMessage());
                throw new IllegalArgumentException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
        } else {
            throw new IllegalArgumentException("Null URI");
        }
    }
}
