package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager.C0786f;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.i */
class C0810i {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0811a> f3285a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final FragmentManager f3286b;

    /* renamed from: androidx.fragment.app.i$a */
    private static final class C0811a {

        /* renamed from: a */
        final C0786f f3287a;

        /* renamed from: b */
        final boolean f3288b;
    }

    C0810i(FragmentManager fragmentManager) {
        this.f3286b = fragmentManager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4253a(Fragment fragment, Context context, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4253a(fragment, context, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4146a(this.f3286b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4257b(Fragment fragment, Context context, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4257b(fragment, context, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4150b(this.f3286b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4260c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4260c(fragment, bundle, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4153c(this.f3286b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4263d(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4263d(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4154d(this.f3286b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4264e(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4264e(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4156e(this.f3286b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4265f(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4265f(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4157f(this.f3286b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4266g(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4266g(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4158g(this.f3286b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4254a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4254a(fragment, bundle, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4147a(this.f3286b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4258b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4258b(fragment, bundle, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4151b(this.f3286b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4261c(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4261c(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4152c(this.f3286b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4262d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4262d(fragment, bundle, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4155d(this.f3286b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4255a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4255a(fragment, view, bundle, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4148a(this.f3286b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4259b(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4259b(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4149b(this.f3286b, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4256a(Fragment fragment, boolean z) {
        Fragment t = this.f3286b.mo4125t();
        if (t != null) {
            t.getParentFragmentManager().mo4124s().mo4256a(fragment, true);
        }
        Iterator it = this.f3285a.iterator();
        while (it.hasNext()) {
            C0811a aVar = (C0811a) it.next();
            if (!z || aVar.f3288b) {
                aVar.f3287a.mo4145a(this.f3286b, fragment);
            }
        }
    }
}
