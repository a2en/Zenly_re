package p389io.fabric.sdk.android;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.concurrency.C12214c;
import p389io.fabric.sdk.android.services.concurrency.Task;

/* renamed from: io.fabric.sdk.android.g */
public abstract class C12161g<Result> implements Comparable<C12161g> {

    /* renamed from: e */
    C12154c f31606e;

    /* renamed from: f */
    C12160f<Result> f31607f = new C12160f<>(this);

    /* renamed from: g */
    Context f31608g;

    /* renamed from: h */
    InitializationCallback<Result> f31609h;

    /* renamed from: i */
    C12195p f31610i;

    /* renamed from: j */
    final C12214c f31611j = ((C12214c) getClass().getAnnotation(C12214c.class));

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo24942a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36006a(Context context, C12154c cVar, InitializationCallback<Result> initializationCallback, C12195p pVar) {
        this.f31606e = cVar;
        this.f31608g = new C12158d(context, mo24943f(), mo36015g());
        this.f31609h = initializationCallback;
        this.f31610i = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36007a(Result result) {
    }

    /* renamed from: b */
    public Context mo36008b() {
        return this.f31608g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36009b(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection<Task> mo36011c() {
        return this.f31607f.getDependencies();
    }

    /* renamed from: d */
    public C12154c mo36013d() {
        return this.f31606e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12195p mo36014e() {
        return this.f31610i;
    }

    /* renamed from: f */
    public abstract String mo24943f();

    /* renamed from: g */
    public String mo36015g() {
        StringBuilder sb = new StringBuilder();
        sb.append(".Fabric");
        sb.append(File.separator);
        sb.append(mo24943f());
        return sb.toString();
    }

    /* renamed from: h */
    public abstract String mo24945h();

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo36016i() {
        return this.f31611j != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo36017j() {
        this.f31607f.mo36139a(this.f31606e.mo35983b(), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo24961k() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo36010b(C12161g gVar) {
        if (mo36016i()) {
            for (Class isAssignableFrom : this.f31611j.value()) {
                if (isAssignableFrom.isAssignableFrom(gVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C12161g gVar) {
        if (mo36010b(gVar)) {
            return 1;
        }
        if (gVar.mo36010b(this)) {
            return -1;
        }
        if (mo36016i() && !gVar.mo36016i()) {
            return 1;
        }
        if (mo36016i() || !gVar.mo36016i()) {
            return 0;
        }
        return -1;
    }
}
