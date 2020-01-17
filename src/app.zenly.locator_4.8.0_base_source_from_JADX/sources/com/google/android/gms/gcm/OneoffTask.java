package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.Task.C10209a;

public class OneoffTask extends Task {
    public static final Creator<OneoffTask> CREATOR = new C10217h();

    /* renamed from: n */
    private final long f26783n;

    /* renamed from: o */
    private final long f26784o;

    /* renamed from: com.google.android.gms.gcm.OneoffTask$a */
    public static class C10207a extends C10209a {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f26785j = -1;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public long f26786k = -1;

        /* renamed from: a */
        public C10207a mo27683a(long j, long j2) {
            this.f26785j = j;
            this.f26786k = j2;
            return this;
        }

        /* renamed from: b */
        public C10207a mo27689b(boolean z) {
            this.f26806f = z;
            return this;
        }

        /* renamed from: c */
        public C10207a mo27691c(boolean z) {
            this.f26804d = z;
            return this;
        }

        /* renamed from: b */
        public OneoffTask mo27690b() {
            mo27688a();
            return new OneoffTask(this, (C10217h) null);
        }

        /* renamed from: a */
        public C10207a mo27685a(Class<? extends GcmTaskService> cls) {
            this.f26802b = cls.getName();
            return this;
        }

        /* renamed from: a */
        public C10207a mo27682a(int i) {
            this.f26801a = i;
            return this;
        }

        /* renamed from: a */
        public C10207a mo27686a(String str) {
            this.f26803c = str;
            return this;
        }

        /* renamed from: a */
        public C10207a mo27687a(boolean z) {
            this.f26805e = z;
            return this;
        }

        /* renamed from: a */
        public C10207a mo27684a(Bundle bundle) {
            this.f26809i = bundle;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo27688a() {
            super.mo27688a();
            long j = this.f26785j;
            if (j != -1) {
                long j2 = this.f26786k;
                if (j2 != -1) {
                    if (j >= j2) {
                        throw new IllegalArgumentException("Window start must be shorter than window end.");
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }
    }

    private OneoffTask(C10207a aVar) {
        super((C10209a) aVar);
        this.f26783n = aVar.f26785j;
        this.f26784o = aVar.f26786k;
    }

    /* renamed from: a */
    public void mo27677a(Bundle bundle) {
        super.mo27677a(bundle);
        bundle.putLong("window_start", this.f26783n);
        bundle.putLong("window_end", this.f26784o);
    }

    /* renamed from: c */
    public long mo27678c() {
        return this.f26784o;
    }

    /* renamed from: d */
    public long mo27679d() {
        return this.f26783n;
    }

    public String toString() {
        String obj = super.toString();
        long d = mo27679d();
        long c = mo27678c();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(d);
        sb.append(" windowEnd=");
        sb.append(c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f26783n);
        parcel.writeLong(this.f26784o);
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.f26783n = parcel.readLong();
        this.f26784o = parcel.readLong();
    }

    /* synthetic */ OneoffTask(Parcel parcel, C10217h hVar) {
        this(parcel);
    }

    /* synthetic */ OneoffTask(C10207a aVar, C10217h hVar) {
        this(aVar);
    }
}
