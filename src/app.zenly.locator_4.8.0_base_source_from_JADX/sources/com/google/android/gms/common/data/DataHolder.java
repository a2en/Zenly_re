package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.android.volley.toolbox.C8733j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Creator<DataHolder> CREATOR = new C10073c();

    /* renamed from: e */
    private final int f26466e;

    /* renamed from: f */
    private final String[] f26467f;

    /* renamed from: g */
    private Bundle f26468g;

    /* renamed from: h */
    private final CursorWindow[] f26469h;

    /* renamed from: i */
    private final int f26470i;

    /* renamed from: j */
    private final Bundle f26471j;

    /* renamed from: k */
    private int[] f26472k;

    /* renamed from: l */
    private boolean f26473l = false;

    /* renamed from: m */
    private boolean f26474m = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C10070a {
        private C10070a(String[] strArr, String str) {
            C10123l.m25505a(strArr);
            String[] strArr2 = strArr;
            new ArrayList();
            new HashMap();
        }

        /* synthetic */ C10070a(String[] strArr, String str, C10072b bVar) {
            this(strArr, null);
        }
    }

    public static class zaa extends RuntimeException {
    }

    static {
        new C10072b(new String[0], null);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f26466e = i;
        this.f26467f = strArr;
        this.f26469h = cursorWindowArr;
        this.f26470i = i2;
        this.f26471j = bundle;
    }

    /* renamed from: a */
    public final int mo27316a() {
        return this.f26470i;
    }

    /* renamed from: b */
    public final void mo27317b() {
        this.f26468g = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f26467f;
            if (i2 >= strArr.length) {
                break;
            }
            this.f26468g.putInt(strArr[i2], i2);
            i2++;
        }
        this.f26472k = new int[this.f26469h.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f26469h;
            if (i < cursorWindowArr.length) {
                this.f26472k[i] = i3;
                i3 += this.f26469h[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        synchronized (this) {
            if (!this.f26473l) {
                this.f26473l = true;
                for (CursorWindow close : this.f26469h) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f26474m && this.f26469h.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle getMetadata() {
        return this.f26471j;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f26473l;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25590a(parcel, 1, this.f26467f, false);
        C10134a.m25589a(parcel, 2, (T[]) this.f26469h, i, false);
        C10134a.m25575a(parcel, 3, mo27316a());
        C10134a.m25577a(parcel, 4, getMetadata(), false);
        C10134a.m25575a(parcel, (int) C8733j.DEFAULT_IMAGE_TIMEOUT_MS, this.f26466e);
        C10134a.m25571a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
