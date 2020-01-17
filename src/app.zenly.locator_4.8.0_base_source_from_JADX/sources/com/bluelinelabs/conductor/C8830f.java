package com.bluelinelabs.conductor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener;
import com.bluelinelabs.conductor.internal.C8850d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bluelinelabs.conductor.f */
class C8830f extends C8831g {

    /* renamed from: i */
    private C8819d f22922i;

    /* renamed from: j */
    private int f22923j;

    /* renamed from: k */
    private String f22924k;

    /* renamed from: l */
    private boolean f22925l;

    C8830f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23977a(C8819d dVar, ViewGroup viewGroup) {
        if (this.f22922i != dVar || this.f22933h != viewGroup) {
            mo23986w();
            if (viewGroup instanceof ControllerChangeListener) {
                mo23990a((ControllerChangeListener) viewGroup);
            }
            this.f22922i = dVar;
            this.f22933h = viewGroup;
            Iterator it = this.f22926a.iterator();
            while (it.hasNext()) {
                ((C8836h) it.next()).f22940a.mo23913a(dVar);
            }
            mo24019s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23981b(C8836h hVar) {
        if (this.f22925l) {
            hVar.f22940a.mo23916a(true);
        }
        super.mo23981b(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo23982c(boolean z) {
        this.f22925l = z;
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            ((C8836h) it.next()).f22940a.mo23916a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8831g mo23868f() {
        C8819d dVar = this.f22922i;
        return (dVar == null || dVar.mo23946k() == null) ? this : this.f22922i.mo23946k().mo23868f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C8831g> mo23869g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22922i.mo23937d());
        arrayList.addAll(this.f22922i.mo23946k().mo23869g());
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C8850d mo23870h() {
        String str;
        if (mo23868f() != this) {
            return mo23868f().mo23870h();
        }
        C8819d dVar = this.f22922i;
        if (dVar != null) {
            str = String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", new Object[]{dVar.getClass().getSimpleName(), Boolean.valueOf(this.f22922i.mo23949n()), Boolean.valueOf(this.f22922i.f22879h), this.f22922i.mo23944i()});
        } else {
            str = "null host controller";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to retrieve TransactionIndexer from ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public void mo23871k() {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23871k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public int mo23983t() {
        return this.f22923j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public String mo23984u() {
        return this.f22924k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public boolean mo23985v() {
        return this.f22922i != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo23986w() {
        ViewGroup viewGroup = this.f22933h;
        if (viewGroup != null && (viewGroup instanceof ControllerChangeListener)) {
            mo24002b((ControllerChangeListener) viewGroup);
        }
        for (C8819d dVar : new ArrayList(this.f22929d)) {
            if (dVar.mo23948m() != null) {
                dVar.mo23909a(dVar.mo23948m(), true, false);
            }
        }
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            if (hVar.f22940a.mo23948m() != null) {
                C8819d dVar2 = hVar.f22940a;
                dVar2.mo23909a(dVar2.mo23948m(), true, false);
            }
        }
        mo24016p();
        this.f22922i = null;
        this.f22933h = null;
    }

    C8830f(int i, String str) {
        this.f22923j = i;
        this.f22924k = str;
    }

    /* renamed from: b */
    public void mo23866b(Bundle bundle) {
        super.mo23866b(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.f22923j);
        bundle.putString("ControllerHostedRouter.tag", this.f22924k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo23867c(String str) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23867c(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23980b(C8819d dVar) {
        dVar.mo23913a(this.f22922i);
        super.mo23980b(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23979a(boolean z) {
        mo23982c(false);
        super.mo23979a(z);
    }

    /* renamed from: a */
    public void mo23978a(List<C8836h> list, ControllerChangeHandler controllerChangeHandler) {
        if (this.f22925l) {
            for (C8836h hVar : list) {
                hVar.f22940a.mo23916a(true);
            }
        }
        super.mo23978a(list, controllerChangeHandler);
    }

    /* renamed from: a */
    public Activity mo23856a() {
        C8819d dVar = this.f22922i;
        if (dVar != null) {
            return dVar.mo23920b();
        }
        return null;
    }

    /* renamed from: a */
    public void mo23858a(Activity activity) {
        super.mo23858a(activity);
        mo23986w();
    }

    /* renamed from: a */
    public void mo23857a(int i, int i2, Intent intent) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23857a(i, i2, intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23859a(Intent intent) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23859a(intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23863a(String str, Intent intent, int i) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23863a(str, intent, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23864a(String str, Intent intent, int i, Bundle bundle) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23864a(str, intent, i, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23862a(String str, int i) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23862a(str, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23865a(String str, String[] strArr, int i) {
        C8819d dVar = this.f22922i;
        if (dVar != null && dVar.mo23946k() != null) {
            this.f22922i.mo23946k().mo23865a(str, strArr, i);
        }
    }

    /* renamed from: a */
    public void mo23860a(Bundle bundle) {
        super.mo23860a(bundle);
        this.f22923j = bundle.getInt("ControllerHostedRouter.hostId");
        this.f22924k = bundle.getString("ControllerHostedRouter.tag");
    }
}
