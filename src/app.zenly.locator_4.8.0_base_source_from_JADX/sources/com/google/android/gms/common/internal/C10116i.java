package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C10069d;
import com.google.android.gms.common.api.Api.Client;

/* renamed from: com.google.android.gms.common.internal.i */
public class C10116i {

    /* renamed from: a */
    private final SparseIntArray f26627a = new SparseIntArray();

    /* renamed from: b */
    private C10069d f26628b;

    public C10116i(C10069d dVar) {
        C10123l.m25505a(dVar);
        this.f26628b = dVar;
    }

    /* renamed from: a */
    public int mo27490a(Context context, Client client) {
        C10123l.m25505a(context);
        C10123l.m25505a(client);
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i = this.f26627a.get(minApkVersion, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f26627a.size()) {
                break;
            }
            int keyAt = this.f26627a.keyAt(i2);
            if (keyAt > minApkVersion && this.f26627a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.f26628b.mo27285a(context, minApkVersion);
        }
        this.f26627a.put(minApkVersion, i);
        return i;
    }

    /* renamed from: a */
    public void mo27491a() {
        this.f26627a.clear();
    }
}
