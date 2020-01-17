package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.Task.C10209a;

public class PeriodicTask extends Task {
    public static final Creator<PeriodicTask> CREATOR = new C10219j();

    /* renamed from: n */
    protected long f26788n;

    /* renamed from: o */
    protected long f26789o;

    /* renamed from: com.google.android.gms.gcm.PeriodicTask$a */
    public static class C10208a extends C10209a {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f26790j = -1;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public long f26791k = -1;

        /* renamed from: a */
        public C10208a mo27697a(long j) {
            this.f26791k = j;
            return this;
        }

        /* renamed from: b */
        public C10208a mo27698b(long j) {
            this.f26790j = j;
            return this;
        }

        /* renamed from: c */
        public C10208a mo27691c(boolean z) {
            this.f26804d = z;
            return this;
        }

        /* renamed from: a */
        public C10208a mo27685a(Class<? extends GcmTaskService> cls) {
            this.f26802b = cls.getName();
            return this;
        }

        /* renamed from: b */
        public C10208a mo27689b(boolean z) {
            this.f26806f = z;
            return this;
        }

        /* renamed from: a */
        public C10208a mo27682a(int i) {
            this.f26801a = i;
            return this;
        }

        /* renamed from: b */
        public PeriodicTask mo27699b() {
            mo27688a();
            return new PeriodicTask(this, (C10219j) null);
        }

        /* renamed from: a */
        public C10208a mo27686a(String str) {
            this.f26803c = str;
            return this;
        }

        /* renamed from: a */
        public C10208a mo27687a(boolean z) {
            this.f26805e = z;
            return this;
        }

        /* renamed from: a */
        public C10208a mo27684a(Bundle bundle) {
            this.f26809i = bundle;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo27688a() {
            super.mo27688a();
            long j = this.f26790j;
            if (j == -1) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            } else if (j > 0) {
                long j2 = this.f26791k;
                if (j2 == -1) {
                    this.f26791k = (long) (((float) j) * 0.1f);
                    return;
                }
                if (j2 > j) {
                    this.f26791k = j;
                }
            } else {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Period set cannot be less than or equal to 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    private PeriodicTask(C10208a aVar) {
        super((C10209a) aVar);
        this.f26788n = -1;
        this.f26789o = -1;
        this.f26788n = aVar.f26790j;
        this.f26789o = Math.min(aVar.f26791k, this.f26788n);
    }

    /* renamed from: a */
    public void mo27677a(Bundle bundle) {
        super.mo27677a(bundle);
        bundle.putLong("period", this.f26788n);
        bundle.putLong("period_flex", this.f26789o);
    }

    /* renamed from: c */
    public long mo27694c() {
        return this.f26789o;
    }

    /* renamed from: d */
    public long mo27695d() {
        return this.f26788n;
    }

    public String toString() {
        String obj = super.toString();
        long d = mo27695d();
        long c = mo27694c();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(d);
        sb.append(" flex=");
        sb.append(c);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f26788n);
        parcel.writeLong(this.f26789o);
    }

    @Deprecated
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.f26788n = -1;
        this.f26789o = -1;
        this.f26788n = parcel.readLong();
        this.f26789o = Math.min(parcel.readLong(), this.f26788n);
    }

    /* synthetic */ PeriodicTask(Parcel parcel, C10219j jVar) {
        this(parcel);
    }

    /* synthetic */ PeriodicTask(C10208a aVar, C10219j jVar) {
        this(aVar);
    }
}
