package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.location.zzbh;

public interface Geofence {

    /* renamed from: com.google.android.gms.location.Geofence$a */
    public static final class C10556a {

        /* renamed from: a */
        private String f27492a = null;

        /* renamed from: b */
        private int f27493b = 0;

        /* renamed from: c */
        private long f27494c = Long.MIN_VALUE;

        /* renamed from: d */
        private short f27495d = -1;

        /* renamed from: e */
        private double f27496e;

        /* renamed from: f */
        private double f27497f;

        /* renamed from: g */
        private float f27498g;

        /* renamed from: h */
        private int f27499h = 0;

        /* renamed from: i */
        private int f27500i = -1;

        /* renamed from: a */
        public final C10556a mo28621a(double d, double d2, float f) {
            this.f27495d = 1;
            this.f27496e = d;
            this.f27497f = d2;
            this.f27498g = f;
            return this;
        }

        /* renamed from: a */
        public final C10556a mo28622a(int i) {
            this.f27500i = i;
            return this;
        }

        /* renamed from: a */
        public final C10556a mo28623a(long j) {
            if (j < 0) {
                this.f27494c = -1;
            } else {
                this.f27494c = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        /* renamed from: a */
        public final C10556a mo28624a(String str) {
            this.f27492a = str;
            return this;
        }

        /* renamed from: a */
        public final Geofence mo28625a() {
            if (this.f27492a != null) {
                int i = this.f27493b;
                if (i == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i & 4) == 0 || this.f27500i >= 0) {
                    long j = this.f27494c;
                    if (j == Long.MIN_VALUE) {
                        throw new IllegalArgumentException("Expiration not set.");
                    } else if (this.f27495d != -1) {
                        int i2 = this.f27499h;
                        if (i2 >= 0) {
                            zzbh zzbh = new zzbh(this.f27492a, this.f27493b, 1, this.f27496e, this.f27497f, this.f27498g, j, i2, this.f27500i);
                            return zzbh;
                        }
                        throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                    } else {
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                } else {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        /* renamed from: b */
        public final C10556a mo28626b(int i) {
            this.f27499h = i;
            return this;
        }

        /* renamed from: c */
        public final C10556a mo28627c(int i) {
            this.f27493b = i;
            return this;
        }
    }

    String getRequestId();
}
