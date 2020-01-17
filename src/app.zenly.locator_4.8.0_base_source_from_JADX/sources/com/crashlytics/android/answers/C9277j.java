package com.crashlytics.android.answers;

import java.io.File;
import java.util.List;
import p389io.fabric.sdk.android.services.concurrency.internal.C12224a;
import p389io.fabric.sdk.android.services.concurrency.internal.C12225b;
import p389io.fabric.sdk.android.services.concurrency.internal.C12226c;
import p389io.fabric.sdk.android.services.events.FilesSender;

/* renamed from: com.crashlytics.android.answers.j */
class C9277j implements FilesSender {

    /* renamed from: a */
    private final C9297y f24105a;

    /* renamed from: b */
    private final C9293v f24106b;

    C9277j(C9297y yVar, C9293v vVar) {
        this.f24105a = yVar;
        this.f24106b = vVar;
    }

    /* renamed from: a */
    public static C9277j m22352a(C9297y yVar) {
        return new C9277j(yVar, new C9293v(new C12226c(new C9292u(new C12225b(1000, 8), 0.1d), new C12224a(5))));
    }

    public boolean send(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.f24106b.mo25027a(nanoTime)) {
            if (this.f24105a.send(list)) {
                this.f24106b.mo25026a();
                return true;
            }
            this.f24106b.mo25028b(nanoTime);
        }
        return false;
    }
}
