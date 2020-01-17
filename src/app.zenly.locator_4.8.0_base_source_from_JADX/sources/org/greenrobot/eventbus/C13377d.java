package org.greenrobot.eventbus;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

/* renamed from: org.greenrobot.eventbus.d */
public class C13377d {

    /* renamed from: k */
    private static final ExecutorService f34709k = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f34710a = true;

    /* renamed from: b */
    boolean f34711b = true;

    /* renamed from: c */
    boolean f34712c = true;

    /* renamed from: d */
    boolean f34713d = true;

    /* renamed from: e */
    boolean f34714e;

    /* renamed from: f */
    boolean f34715f = true;

    /* renamed from: g */
    boolean f34716g;

    /* renamed from: h */
    boolean f34717h;

    /* renamed from: i */
    ExecutorService f34718i = f34709k;

    /* renamed from: j */
    List<SubscriberInfoIndex> f34719j;

    C13377d() {
    }

    /* renamed from: a */
    public C13377d mo38590a(boolean z) {
        this.f34711b = z;
        return this;
    }

    /* renamed from: b */
    public C13377d mo38591b(boolean z) {
        this.f34713d = z;
        return this;
    }

    /* renamed from: c */
    public C13377d mo38592c(boolean z) {
        this.f34717h = z;
        return this;
    }

    /* renamed from: d */
    public C13377d mo38593d(boolean z) {
        this.f34714e = z;
        return this;
    }

    /* renamed from: a */
    public C13373c mo38589a() {
        return new C13373c(this);
    }
}
