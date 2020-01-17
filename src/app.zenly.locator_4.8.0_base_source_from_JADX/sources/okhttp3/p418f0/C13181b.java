package okhttp3.p418f0;

import java.util.concurrent.ThreadFactory;

/* renamed from: okhttp3.f0.b */
/* compiled from: lambda */
public final /* synthetic */ class C13181b implements ThreadFactory {

    /* renamed from: e */
    private final /* synthetic */ String f33851e;

    /* renamed from: f */
    private final /* synthetic */ boolean f33852f;

    public /* synthetic */ C13181b(String str, boolean z) {
        this.f33851e = str;
        this.f33852f = z;
    }

    public final Thread newThread(Runnable runnable) {
        return C13184e.m34493a(this.f33851e, this.f33852f, runnable);
    }
}
