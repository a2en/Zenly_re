package com.bluelinelabs.conductor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.C8819d.C8827h;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener;
import com.bluelinelabs.conductor.changehandler.C8817d;
import com.bluelinelabs.conductor.internal.C8847b;
import com.bluelinelabs.conductor.internal.C8848c;
import com.bluelinelabs.conductor.internal.C8850d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bluelinelabs.conductor.g */
public abstract class C8831g {

    /* renamed from: a */
    final C8810b f22926a = new C8810b();

    /* renamed from: b */
    private final List<ControllerChangeListener> f22927b = new ArrayList();

    /* renamed from: c */
    private final List<C8808c> f22928c = new ArrayList();

    /* renamed from: d */
    final List<C8819d> f22929d = new ArrayList();

    /* renamed from: e */
    private boolean f22930e = false;

    /* renamed from: f */
    boolean f22931f = false;

    /* renamed from: g */
    boolean f22932g = false;

    /* renamed from: h */
    ViewGroup f22933h;

    /* renamed from: com.bluelinelabs.conductor.g$a */
    class C8832a extends C8827h {

        /* renamed from: a */
        final /* synthetic */ List f22934a;

        C8832a(List list) {
            this.f22934a = list;
        }

        /* renamed from: a */
        public void mo7344a(C8819d dVar, ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
            if (eVar == C8829e.POP_EXIT) {
                for (int size = this.f22934a.size() - 1; size > 0; size--) {
                    C8831g.this.mo23992a((C8836h) null, (C8836h) this.f22934a.get(size), true, (ControllerChangeHandler) new C8817d());
                }
            }
        }
    }

    /* renamed from: com.bluelinelabs.conductor.g$b */
    class C8833b implements Runnable {
        C8833b() {
        }

        public void run() {
            C8831g.this.f22931f = true;
        }
    }

    /* renamed from: com.bluelinelabs.conductor.g$c */
    class C8834c implements Runnable {
        C8834c() {
        }

        public void run() {
            C8831g.this.mo24013m();
        }
    }

    /* renamed from: com.bluelinelabs.conductor.g$d */
    class C8835d extends C8827h {
        C8835d() {
        }

        /* renamed from: b */
        public void mo9318b(C8819d dVar) {
            C8831g.this.f22929d.remove(dVar);
        }
    }

    /* renamed from: t */
    private void mo23983t() {
        ArrayList arrayList = new ArrayList();
        for (C8836h hVar : m20992a(this.f22926a.iterator())) {
            if (hVar.f22940a.mo23948m() != null) {
                arrayList.add(hVar.f22940a.mo23948m());
            }
        }
        for (C8831g gVar : mo23869g()) {
            if (gVar.f22933h == this.f22933h) {
                m20994a(gVar, (List<View>) arrayList);
            }
        }
        for (int childCount = this.f22933h.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f22933h.getChildAt(childCount);
            if (!arrayList.contains(childAt)) {
                this.f22933h.removeView(childAt);
            }
        }
    }

    /* renamed from: a */
    public abstract Activity mo23856a();

    /* renamed from: a */
    public abstract void mo23857a(int i, int i2, Intent intent);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23859a(Intent intent);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23862a(String str, int i);

    /* renamed from: a */
    public void mo23994a(String str, int i, String[] strArr, int[] iArr) {
        C8819d a = mo23987a(str);
        if (a != null) {
            a.mo23923b(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23863a(String str, Intent intent, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23864a(String str, Intent intent, int i, Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo23865a(String str, String[] strArr, int i);

    /* renamed from: b */
    public C8831g mo23998b(boolean z) {
        this.f22930e = z;
        return this;
    }

    /* renamed from: c */
    public void mo24005c(C8836h hVar) {
        C8848c.m21105a();
        C8836h peek = this.f22926a.peek();
        if (!this.f22926a.isEmpty()) {
            m21001e(this.f22926a.pop());
        }
        ControllerChangeHandler d = hVar.mo24029d();
        if (peek != null) {
            boolean z = false;
            boolean z2 = peek.mo24029d() == null || peek.mo24029d().mo23853d();
            if (d == null || d.mo23853d()) {
                z = true;
            }
            if (!z2 && z) {
                for (C8836h a : m20992a(this.f22926a.iterator())) {
                    mo23992a((C8836h) null, a, true, d);
                }
            }
        }
        mo23981b(hVar);
        if (d != null) {
            d.mo23850a(true);
        }
        hVar.mo24026b(d);
        m20996a(hVar, peek, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo23867c(String str);

    /* renamed from: d */
    public int mo24006d() {
        ViewGroup viewGroup = this.f22933h;
        if (viewGroup != null) {
            return viewGroup.getId();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo24010e(Activity activity) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23940e(activity);
            for (C8831g e : hVar.f22940a.mo23937d()) {
                e.mo24010e(activity);
            }
        }
        this.f22932g = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract C8831g mo23868f();

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract List<C8831g> mo23869g();

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract C8850d mo23870h();

    /* renamed from: i */
    public boolean mo24011i() {
        C8848c.m21105a();
        if (this.f22926a.isEmpty() || (!this.f22926a.peek().f22940a.handleBack() && !mo24014n())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo24012j() {
        return mo24003c() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public abstract void mo23871k();

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo23872l() {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            ((C8836h) it.next()).f22940a.mo23951p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo24013m() {
        for (int i = 0; i < this.f22928c.size(); i++) {
            ControllerChangeHandler.m20787a((C8808c) this.f22928c.get(i));
        }
        this.f22928c.clear();
    }

    /* renamed from: n */
    public boolean mo24014n() {
        C8848c.m21105a();
        C8836h peek = this.f22926a.peek();
        if (peek != null) {
            return mo23997a(peek.f22940a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }

    /* renamed from: o */
    public boolean mo24015o() {
        C8848c.m21105a();
        return mo23996a((ControllerChangeHandler) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo24016p() {
        this.f22931f = false;
        ViewGroup viewGroup = this.f22933h;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
    }

    /* renamed from: q */
    public void mo24017q() {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            if (ControllerChangeHandler.m20790a(hVar.f22940a.mo23939e())) {
                hVar.f22940a.mo23931b(true);
            }
            hVar.f22940a.mo23953s();
        }
    }

    /* renamed from: r */
    public void mo24018r() {
        C8848c.m21105a();
        Iterator b = this.f22926a.mo23878b();
        while (b.hasNext()) {
            C8836h hVar = (C8836h) b.next();
            if (hVar.f22940a.mo23941f()) {
                mo23992a(hVar, (C8836h) null, true, (ControllerChangeHandler) new C8817d(false));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo24019s() {
        this.f22933h.post(new C8833b());
    }

    /* renamed from: b */
    public List<C8836h> mo24000b() {
        ArrayList arrayList = new ArrayList(this.f22926a.size());
        Iterator b = this.f22926a.mo23878b();
        while (b.hasNext()) {
            arrayList.add(b.next());
        }
        return arrayList;
    }

    /* renamed from: d */
    public void mo24008d(C8836h hVar) {
        C8848c.m21105a();
        mo23978a(Collections.singletonList(hVar), hVar.mo24029d());
    }

    /* renamed from: a */
    public boolean mo23997a(C8819d dVar) {
        C8848c.m21105a();
        C8836h peek = this.f22926a.peek();
        boolean z = true;
        if (peek != null && peek.f22940a == dVar) {
            m21001e(this.f22926a.pop());
            m20996a(this.f22926a.peek(), peek, false);
        } else {
            Iterator it = this.f22926a.iterator();
            C8836h hVar = null;
            C8836h hVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8836h hVar3 = (C8836h) it.next();
                C8819d dVar2 = hVar3.f22940a;
                if (dVar2 == dVar) {
                    if (dVar.mo23949n()) {
                        m21001e(hVar3);
                    }
                    it.remove();
                    hVar2 = hVar3;
                } else if (hVar2 != null) {
                    if (!dVar2.mo23949n()) {
                        hVar = hVar3;
                    }
                }
            }
            if (hVar2 != null) {
                m20996a(hVar, hVar2, false);
            }
        }
        if (!this.f22930e) {
            return !this.f22926a.isEmpty();
        }
        if (peek == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public final void mo24007d(Activity activity) {
        this.f22932g = false;
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23938d(activity);
            for (C8831g d : hVar.f22940a.mo23937d()) {
                d.mo24007d(activity);
            }
        }
    }

    /* renamed from: b */
    public void mo24002b(ControllerChangeListener controllerChangeListener) {
        this.f22927b.remove(controllerChangeListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final List<C8819d> mo24009e() {
        ArrayList arrayList = new ArrayList(this.f22926a.size());
        Iterator b = this.f22926a.mo23878b();
        while (b.hasNext()) {
            arrayList.add(((C8836h) b.next()).f22940a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo24001b(Activity activity) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23924b(activity);
            for (C8831g b : hVar.f22940a.mo23937d()) {
                b.mo24001b(activity);
            }
        }
    }

    /* renamed from: e */
    private void m21001e(C8836h hVar) {
        if (!hVar.f22940a.mo23950o()) {
            this.f22929d.add(hVar.f22940a);
            hVar.f22940a.mo23911a((C8827h) new C8835d());
        }
    }

    /* renamed from: b */
    public void mo23866b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.f22926a.mo23879b(bundle2);
        bundle.putParcelable("Router.backstack", bundle2);
        bundle.putBoolean("Router.popsLastView", this.f22930e);
    }

    /* renamed from: c */
    public int mo24003c() {
        return this.f22926a.size();
    }

    /* renamed from: c */
    public final void mo24004c(Activity activity) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23934c(activity);
            for (C8831g c : hVar.f22940a.mo23937d()) {
                c.mo24004c(activity);
            }
        }
    }

    /* renamed from: b */
    public final Boolean mo23999b(String str) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            if (hVar.f22940a.mo23919a(str)) {
                return Boolean.valueOf(hVar.f22940a.mo23936c(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m21000c(List<C8836h> list) {
        for (C8836h e : list) {
            m21001e(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23981b(C8836h hVar) {
        if (!this.f22926a.mo23877a(hVar.f22940a)) {
            this.f22926a.mo23875a(hVar);
            return;
        }
        throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
    }

    /* renamed from: a */
    public void mo23991a(C8836h hVar) {
        C8848c.m21105a();
        C8836h peek = this.f22926a.peek();
        mo23981b(hVar);
        m20996a(hVar, peek, true);
    }

    /* renamed from: b */
    private void m20999b(List<C8836h> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C8836h hVar : list) {
            hVar.mo24025a(mo23870h());
            arrayList.add(Integer.valueOf(hVar.f22945f));
        }
        Collections.sort(arrayList);
        for (int i = 0; i < list.size(); i++) {
            ((C8836h) list.get(i)).f22945f = ((Integer) arrayList.get(i)).intValue();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23979a(boolean z) {
        this.f22930e = true;
        List a = this.f22926a.mo23873a();
        m21000c(a);
        if (z && a.size() > 0) {
            C8836h hVar = (C8836h) a.get(0);
            hVar.mo24022a().mo23911a((C8827h) new C8832a(a));
            mo23992a((C8836h) null, hVar, false, hVar.mo24028c());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23980b(C8819d dVar) {
        dVar.mo23930b(this);
        dVar.mo23951p();
    }

    /* renamed from: a */
    public boolean mo23996a(ControllerChangeHandler controllerChangeHandler) {
        C8848c.m21105a();
        if (this.f22926a.size() <= 1) {
            return false;
        }
        m20995a(this.f22926a.mo23880c(), controllerChangeHandler);
        return true;
    }

    /* renamed from: a */
    public C8819d mo23987a(String str) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8819d b = ((C8836h) it.next()).f22940a.mo23922b(str);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo23978a(List<C8836h> list, ControllerChangeHandler controllerChangeHandler) {
        C8848c.m21105a();
        List b = mo24000b();
        List a = m20992a(this.f22926a.iterator());
        mo23983t();
        m20999b(list);
        m20997a(list);
        this.f22926a.mo23876a(list);
        ArrayList<C8836h> arrayList = new ArrayList<>();
        Iterator it = b.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C8836h hVar = (C8836h) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (hVar.f22940a == ((C8836h) it2.next()).f22940a) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                hVar.f22940a.f22879h = true;
                arrayList.add(hVar);
            }
        }
        Iterator b2 = this.f22926a.mo23878b();
        while (b2.hasNext()) {
            C8836h hVar2 = (C8836h) b2.next();
            hVar2.mo24027b();
            mo23980b(hVar2.f22940a);
        }
        if (list.size() > 0) {
            ArrayList arrayList2 = new ArrayList(list);
            Collections.reverse(arrayList2);
            List a2 = m20992a(arrayList2.iterator());
            boolean z2 = a2.size() <= 0 || !b.contains(a2.get(0));
            if (!m20998a(a2, a)) {
                C8836h hVar3 = a.size() > 0 ? (C8836h) a.get(0) : null;
                C8836h hVar4 = (C8836h) a2.get(0);
                if (hVar3 == null || hVar3.f22940a != hVar4.f22940a) {
                    if (hVar3 != null) {
                        ControllerChangeHandler.m20790a(hVar3.f22940a.mo23939e());
                    }
                    mo23992a(hVar4, hVar3, z2, controllerChangeHandler);
                }
                for (int size = a.size() - 1; size > 0; size--) {
                    C8836h hVar5 = (C8836h) a.get(size);
                    if (!a2.contains(hVar5)) {
                        ControllerChangeHandler b3 = controllerChangeHandler != null ? controllerChangeHandler.mo12522b() : new C8817d();
                        b3.mo23850a(true);
                        ControllerChangeHandler.m20790a(hVar5.f22940a.mo23939e());
                        mo23992a((C8836h) null, hVar5, z2, b3);
                    }
                }
                for (int i = 1; i < a2.size(); i++) {
                    C8836h hVar6 = (C8836h) a2.get(i);
                    if (!a.contains(hVar6)) {
                        mo23992a(hVar6, (C8836h) a2.get(i - 1), true, hVar6.mo24029d());
                    }
                }
            }
        } else {
            for (int size2 = a.size() - 1; size2 >= 0; size2--) {
                C8836h hVar7 = (C8836h) a.get(size2);
                ControllerChangeHandler b4 = controllerChangeHandler != null ? controllerChangeHandler.mo12522b() : new C8817d();
                ControllerChangeHandler.m20790a(hVar7.f22940a.mo23939e());
                mo23992a((C8836h) null, hVar7, false, b4);
            }
        }
        for (C8836h hVar8 : arrayList) {
            hVar8.f22940a.mo23899a();
        }
    }

    /* renamed from: a */
    public void mo23990a(ControllerChangeListener controllerChangeListener) {
        if (!this.f22927b.contains(controllerChangeListener)) {
            this.f22927b.add(controllerChangeListener);
        }
    }

    /* renamed from: a */
    public final void mo23993a(String str, int i, int i2, Intent intent) {
        C8819d a = mo23987a(str);
        if (a != null) {
            a.mo8182a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo23858a(Activity activity) {
        mo24016p();
        this.f22927b.clear();
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23901a(activity);
            for (C8831g a : hVar.f22940a.mo23937d()) {
                a.mo23858a(activity);
            }
        }
        for (int size = this.f22929d.size() - 1; size >= 0; size--) {
            C8819d dVar = (C8819d) this.f22929d.get(size);
            dVar.mo23901a(activity);
            for (C8831g a2 : dVar.mo23937d()) {
                a2.mo23858a(activity);
            }
        }
        this.f22933h = null;
    }

    /* renamed from: a */
    public void mo23860a(Bundle bundle) {
        this.f22926a.mo23874a((Bundle) bundle.getParcelable("Router.backstack"));
        this.f22930e = bundle.getBoolean("Router.popsLastView");
        Iterator b = this.f22926a.mo23878b();
        while (b.hasNext()) {
            mo23980b(((C8836h) b.next()).f22940a);
        }
    }

    /* renamed from: a */
    public final void mo23989a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23906a(menu, menuInflater);
            for (C8831g a : hVar.f22940a.mo23937d()) {
                a.mo23989a(menu, menuInflater);
            }
        }
    }

    /* renamed from: a */
    public final void mo23988a(Menu menu) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            hVar.f22940a.mo23925b(menu);
            for (C8831g a : hVar.f22940a.mo23937d()) {
                a.mo23988a(menu);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo23995a(MenuItem menuItem) {
        Iterator it = this.f22926a.iterator();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            if (hVar.f22940a.mo23932b(menuItem)) {
                return true;
            }
            Iterator it2 = hVar.f22940a.mo23937d().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C8831g) it2.next()).mo23995a(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m20995a(C8836h hVar, ControllerChangeHandler controllerChangeHandler) {
        if (this.f22926a.size() > 0) {
            C8836h peek = this.f22926a.peek();
            ArrayList arrayList = new ArrayList();
            Iterator b = this.f22926a.mo23878b();
            while (b.hasNext()) {
                C8836h hVar2 = (C8836h) b.next();
                arrayList.add(hVar2);
                if (hVar2 == hVar) {
                    break;
                }
            }
            if (controllerChangeHandler == null) {
                controllerChangeHandler = peek.mo24028c();
            }
            mo23978a((List<C8836h>) arrayList, controllerChangeHandler);
        }
    }

    /* renamed from: a */
    private void m20996a(C8836h hVar, C8836h hVar2, boolean z) {
        if (z && hVar != null) {
            hVar.mo24027b();
        }
        ControllerChangeHandler controllerChangeHandler = z ? hVar.mo24029d() : hVar2 != null ? hVar2.mo24028c() : null;
        mo23992a(hVar, hVar2, z, controllerChangeHandler);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23992a(C8836h hVar, C8836h hVar2, boolean z, ControllerChangeHandler controllerChangeHandler) {
        boolean z2;
        C8819d dVar = null;
        C8819d dVar2 = hVar != null ? hVar.f22940a : null;
        if (hVar2 != null) {
            dVar = hVar2.f22940a;
        }
        if (hVar != null) {
            hVar.mo24025a(mo23870h());
            mo23980b(dVar2);
        } else if (this.f22926a.size() == 0 && !this.f22930e) {
            controllerChangeHandler = new C8847b();
            z2 = true;
            m20993a(dVar2, dVar, z, controllerChangeHandler);
            if (z2 && dVar != null && dVar.mo23948m() != null) {
                dVar.mo23909a(dVar.mo23948m(), true, false);
                return;
            }
            return;
        }
        z2 = false;
        m20993a(dVar2, dVar, z, controllerChangeHandler);
        if (z2) {
        }
    }

    /* renamed from: a */
    private void m20993a(C8819d dVar, C8819d dVar2, boolean z, ControllerChangeHandler controllerChangeHandler) {
        if (!z || dVar == null || !dVar.mo23950o()) {
            C8808c cVar = new C8808c(dVar, dVar2, z, this.f22933h, controllerChangeHandler, new ArrayList(this.f22927b));
            if (this.f22928c.size() > 0) {
                this.f22928c.add(cVar);
            } else if (dVar2 == null || ((controllerChangeHandler != null && !controllerChangeHandler.mo23853d()) || this.f22931f)) {
                ControllerChangeHandler.m20787a(cVar);
            } else {
                this.f22928c.add(cVar);
                this.f22933h.post(new C8834c());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to push a controller that has already been destroyed. (");
            sb.append(dVar.getClass().getSimpleName());
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m20997a(List<C8836h> list) {
        int i = 0;
        while (i < list.size()) {
            C8819d dVar = ((C8836h) list.get(i)).f22940a;
            i++;
            int i2 = i;
            while (true) {
                if (i2 < list.size()) {
                    if (((C8836h) list.get(i2)).f22940a != dVar) {
                        i2++;
                    } else {
                        throw new IllegalStateException("Trying to push the same controller to the backstack more than once.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m20994a(C8831g gVar, List<View> list) {
        for (C8819d dVar : gVar.mo24009e()) {
            if (dVar.mo23948m() != null) {
                list.add(dVar.mo23948m());
            }
            for (C8831g a : dVar.mo23937d()) {
                m20994a(a, list);
            }
        }
    }

    /* renamed from: a */
    private List<C8836h> m20992a(Iterator<C8836h> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            C8836h hVar = (C8836h) it.next();
            arrayList.add(hVar);
            if (hVar.mo24029d() != null) {
                if (hVar.mo24029d().mo23853d()) {
                    break;
                }
            } else {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private boolean m20998a(List<C8836h> list, List<C8836h> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (((C8836h) list2.get(i)).mo24022a() != ((C8836h) list.get(i)).mo24022a()) {
                return false;
            }
        }
        return true;
    }
}
