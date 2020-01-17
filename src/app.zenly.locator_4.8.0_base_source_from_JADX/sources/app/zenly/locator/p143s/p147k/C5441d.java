package app.zenly.locator.p143s.p147k;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p389io.reactivex.C12279e;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.s.k.d */
public class C5441d<T extends MessageLite> {

    /* renamed from: a */
    private final C5440c<T> f14007a;

    public C5441d(Context context, String str, T t) {
        this.f14007a = new C5440c<>(context, str, t);
    }

    /* renamed from: a */
    public C12279e<List<T>> mo13014a() {
        C5440c<T> cVar = this.f14007a;
        cVar.getClass();
        return C12279e.m32616a((Callable<? extends T>) new C5439b<Object>(cVar)).mo36452b(C12802a.m33491b());
    }

    /* renamed from: b */
    public C12279e<Boolean> mo13016b(Collection<T> collection) {
        return C12279e.m32616a((Callable<? extends T>) new C5438a<Object>(this, collection)).mo36452b(C12802a.m33491b());
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo13015a(Collection collection) throws Exception {
        return Boolean.valueOf(this.f14007a.mo13013a(collection));
    }
}
