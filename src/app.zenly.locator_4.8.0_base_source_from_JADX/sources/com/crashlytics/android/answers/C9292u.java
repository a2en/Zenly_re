package com.crashlytics.android.answers;

import java.util.Random;
import p389io.fabric.sdk.android.services.concurrency.internal.Backoff;

/* renamed from: com.crashlytics.android.answers.u */
class C9292u implements Backoff {

    /* renamed from: a */
    final Backoff f24136a;

    /* renamed from: b */
    final Random f24137b;

    /* renamed from: c */
    final double f24138c;

    public C9292u(Backoff backoff, double d) {
        this(backoff, d, new Random());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public double mo25024a() {
        double d = this.f24138c;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.f24137b.nextDouble());
    }

    public long getDelayMillis(int i) {
        return (long) (mo25024a() * ((double) this.f24136a.getDelayMillis(i)));
    }

    public C9292u(Backoff backoff, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (backoff == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.f24136a = backoff;
            this.f24138c = d;
            this.f24137b = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }
}
