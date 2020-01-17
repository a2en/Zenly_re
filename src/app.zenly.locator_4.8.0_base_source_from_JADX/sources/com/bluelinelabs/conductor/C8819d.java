package com.bluelinelabs.conductor;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bluelinelabs.conductor.internal.C8846a;
import com.bluelinelabs.conductor.internal.RouterRequiringFunc;
import com.bluelinelabs.conductor.internal.ViewAttachHandler;
import com.bluelinelabs.conductor.internal.ViewAttachHandler.ViewAttachListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bluelinelabs.conductor.d */
public abstract class C8819d {

    /* renamed from: A */
    private C8828i f22867A;

    /* renamed from: B */
    private ViewAttachHandler f22868B;

    /* renamed from: C */
    private final List<C8830f> f22869C;

    /* renamed from: D */
    private final List<C8827h> f22870D;

    /* renamed from: E */
    private final ArrayList<String> f22871E;

    /* renamed from: F */
    private final ArrayList<RouterRequiringFunc> f22872F;

    /* renamed from: G */
    private WeakReference<View> f22873G;

    /* renamed from: H */
    private boolean f22874H;

    /* renamed from: I */
    private boolean f22875I;

    /* renamed from: e */
    private final Bundle f22876e;

    /* renamed from: f */
    Bundle f22877f;

    /* renamed from: g */
    private Bundle f22878g;

    /* renamed from: h */
    boolean f22879h;

    /* renamed from: i */
    private boolean f22880i;

    /* renamed from: j */
    private boolean f22881j;

    /* renamed from: k */
    private boolean f22882k;

    /* renamed from: l */
    private boolean f22883l;

    /* renamed from: m */
    boolean f22884m;

    /* renamed from: n */
    boolean f22885n;

    /* renamed from: o */
    C8831g f22886o;

    /* renamed from: p */
    View f22887p;

    /* renamed from: q */
    private C8819d f22888q;

    /* renamed from: r */
    String f22889r;

    /* renamed from: s */
    private String f22890s;

    /* renamed from: t */
    private boolean f22891t;

    /* renamed from: u */
    private boolean f22892u;

    /* renamed from: v */
    private boolean f22893v;

    /* renamed from: w */
    private boolean f22894w;

    /* renamed from: x */
    boolean f22895x;

    /* renamed from: y */
    private ControllerChangeHandler f22896y;

    /* renamed from: z */
    private ControllerChangeHandler f22897z;

    /* renamed from: com.bluelinelabs.conductor.d$a */
    class C8820a implements RouterRequiringFunc {

        /* renamed from: a */
        final /* synthetic */ Intent f22898a;

        C8820a(Intent intent) {
            this.f22898a = intent;
        }

        public void execute() {
            C8819d.this.f22886o.mo23859a(this.f22898a);
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$b */
    class C8821b implements RouterRequiringFunc {

        /* renamed from: a */
        final /* synthetic */ Intent f22900a;

        /* renamed from: b */
        final /* synthetic */ int f22901b;

        C8821b(Intent intent, int i) {
            this.f22900a = intent;
            this.f22901b = i;
        }

        public void execute() {
            C8819d dVar = C8819d.this;
            dVar.f22886o.mo23863a(dVar.f22889r, this.f22900a, this.f22901b);
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$c */
    class C8822c implements RouterRequiringFunc {

        /* renamed from: a */
        final /* synthetic */ Intent f22903a;

        /* renamed from: b */
        final /* synthetic */ int f22904b;

        /* renamed from: c */
        final /* synthetic */ Bundle f22905c;

        C8822c(Intent intent, int i, Bundle bundle) {
            this.f22903a = intent;
            this.f22904b = i;
            this.f22905c = bundle;
        }

        public void execute() {
            C8819d dVar = C8819d.this;
            dVar.f22886o.mo23864a(dVar.f22889r, this.f22903a, this.f22904b, this.f22905c);
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$d */
    class C8823d implements RouterRequiringFunc {

        /* renamed from: a */
        final /* synthetic */ int f22907a;

        C8823d(int i) {
            this.f22907a = i;
        }

        public void execute() {
            C8819d dVar = C8819d.this;
            dVar.f22886o.mo23862a(dVar.f22889r, this.f22907a);
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$e */
    class C8824e implements RouterRequiringFunc {

        /* renamed from: a */
        final /* synthetic */ String[] f22909a;

        /* renamed from: b */
        final /* synthetic */ int f22910b;

        C8824e(String[] strArr, int i) {
            this.f22909a = strArr;
            this.f22910b = i;
        }

        public void execute() {
            C8819d dVar = C8819d.this;
            dVar.f22886o.mo23865a(dVar.f22889r, this.f22909a, this.f22910b);
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$f */
    class C8825f implements Comparator<C8836h> {
        C8825f(C8819d dVar) {
        }

        /* renamed from: a */
        public int compare(C8836h hVar, C8836h hVar2) {
            return hVar2.f22945f - hVar.f22945f;
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$g */
    class C8826g implements ViewAttachListener {
        C8826g() {
        }

        public void onAttached() {
            C8819d dVar = C8819d.this;
            dVar.f22884m = true;
            dVar.f22885n = false;
            dVar.mo23907a(dVar.f22887p);
        }

        public void onDetached(boolean z) {
            C8819d dVar = C8819d.this;
            dVar.f22884m = false;
            dVar.f22885n = true;
            if (!dVar.f22895x) {
                dVar.mo23909a(dVar.f22887p, false, z);
            }
        }

        public void onViewDetachAfterStop() {
            C8819d dVar = C8819d.this;
            if (!dVar.f22895x) {
                dVar.mo23909a(dVar.f22887p, false, false);
            }
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$h */
    public static abstract class C8827h {
        /* renamed from: a */
        public void mo23961a(C8819d dVar) {
        }

        /* renamed from: a */
        public void mo23962a(C8819d dVar, Context context) {
        }

        /* renamed from: a */
        public void mo23963a(C8819d dVar, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo9317a(C8819d dVar, View view) {
        }

        /* renamed from: a */
        public void mo7344a(C8819d dVar, ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        }

        /* renamed from: b */
        public void mo9318b(C8819d dVar) {
        }

        /* renamed from: b */
        public void mo23964b(C8819d dVar, Context context) {
        }

        /* renamed from: b */
        public void mo23965b(C8819d dVar, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo9319b(C8819d dVar, View view) {
        }

        /* renamed from: b */
        public void mo23966b(C8819d dVar, ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        }

        /* renamed from: c */
        public void mo23967c(C8819d dVar) {
        }

        /* renamed from: c */
        public void mo23968c(C8819d dVar, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo23969c(C8819d dVar, View view) {
        }

        /* renamed from: d */
        public void mo23970d(C8819d dVar) {
        }

        /* renamed from: d */
        public void mo23971d(C8819d dVar, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo23972d(C8819d dVar, View view) {
        }

        /* renamed from: e */
        public void mo23973e(C8819d dVar) {
        }

        /* renamed from: e */
        public void mo23974e(C8819d dVar, View view) {
        }

        /* renamed from: f */
        public void mo23975f(C8819d dVar) {
        }

        /* renamed from: f */
        public void mo23976f(C8819d dVar, View view) {
        }
    }

    /* renamed from: com.bluelinelabs.conductor.d$i */
    public enum C8828i {
        RELEASE_DETACH,
        RETAIN_DETACH
    }

    protected C8819d() {
        this(null);
    }

    /* renamed from: c */
    static C8819d m20860c(Bundle bundle) {
        C8819d dVar;
        String string = bundle.getString("Controller.className");
        Class a = C8846a.m21100a(string, false);
        Constructor[] constructors = a.getConstructors();
        Constructor a2 = m20858a(constructors);
        Bundle bundle2 = bundle.getBundle("Controller.args");
        if (bundle2 != null) {
            bundle2.setClassLoader(a.getClassLoader());
        }
        if (a2 != null) {
            try {
                dVar = (C8819d) a2.newInstance(new Object[]{bundle2});
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("An exception occurred while creating a new instance of ");
                sb.append(string);
                sb.append(". ");
                sb.append(e.getMessage());
                throw new RuntimeException(sb.toString(), e);
            }
        } else {
            dVar = (C8819d) m20859b(constructors).newInstance(new Object[0]);
            if (bundle2 != null) {
                dVar.f22876e.putAll(bundle2);
            }
        }
        dVar.m20861d(bundle);
        return dVar;
    }

    /* renamed from: u */
    private void mo9312u() {
        Constructor[] constructors = getClass().getConstructors();
        if (m20858a(constructors) == null && m20859b(constructors) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: v */
    private void mo9313v() {
        if (this.f22875I) {
            for (C8827h b : new ArrayList(this.f22870D)) {
                b.mo23964b(this, (Context) mo23920b());
            }
            this.f22875I = false;
            mo23952q();
            for (C8827h a : new ArrayList(this.f22870D)) {
                a.mo23961a(this);
            }
        }
        if (!this.f22880i) {
            for (C8827h f : new ArrayList(this.f22870D)) {
                f.mo23975f(this);
            }
            this.f22880i = true;
            mo10333r();
            this.f22888q = null;
            for (C8827h b2 : new ArrayList(this.f22870D)) {
                b2.mo9318b(this);
            }
        }
    }

    /* renamed from: w */
    private void mo7339w() {
        Bundle bundle = this.f22878g;
        if (bundle != null && this.f22886o != null) {
            mo9305a(bundle);
            for (C8827h a : new ArrayList(this.f22870D)) {
                a.mo23963a(this, this.f22878g);
            }
            this.f22878g = null;
        }
    }

    /* renamed from: x */
    private void mo9314x() {
        View view = this.f22887p;
        if (view != null) {
            if (!this.f22879h && !this.f22894w) {
                mo7857f(view);
            }
            for (C8827h e : new ArrayList(this.f22870D)) {
                e.mo23974e(this, this.f22887p);
            }
            mo7066c(this.f22887p);
            this.f22868B.mo24070b(this.f22887p);
            this.f22868B = null;
            this.f22884m = false;
            if (this.f22879h) {
                this.f22873G = new WeakReference<>(this.f22887p);
            }
            this.f22887p = null;
            for (C8827h c : new ArrayList(this.f22870D)) {
                c.mo23967c(this);
            }
            for (C8830f w : this.f22869C) {
                w.mo23986w();
            }
        }
        if (this.f22879h) {
            mo9313v();
        }
    }

    /* renamed from: y */
    private void mo7097y() {
        for (C8830f fVar : this.f22869C) {
            if (!fVar.mo23985v()) {
                View findViewById = this.f22887p.findViewById(fVar.mo23983t());
                if (findViewById != null && (findViewById instanceof ViewGroup)) {
                    fVar.mo23977a(this, (ViewGroup) findViewById);
                    fVar.mo24018r();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    public final C8831g mo23896a(ViewGroup viewGroup) {
        return mo23897a(viewGroup, (String) null);
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo12056a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9305a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo23905a(Menu menu) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23908a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public boolean mo23918a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public final Activity mo23920b() {
        C8831g gVar = this.f22886o;
        if (gVar != null) {
            return gVar.mo23856a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9307b(Bundle bundle) {
    }

    /* renamed from: b */
    public void mo23926b(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11363b(View view, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9309c(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
    }

    /* renamed from: d */
    public final List<C8831g> mo23937d() {
        ArrayList arrayList = new ArrayList(this.f22869C.size());
        arrayList.addAll(this.f22869C);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo9310d(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
    }

    /* renamed from: e */
    public final String mo23939e() {
        return this.f22889r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11367f(Activity activity) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo23941f() {
        return this.f22891t;
    }

    /* renamed from: g */
    public ControllerChangeHandler mo23942g() {
        return this.f22897z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11369g(Activity activity) {
    }

    /* renamed from: h */
    public final ControllerChangeHandler mo23943h() {
        return this.f22896y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo11371h(Activity activity) {
    }

    public boolean handleBack() {
        ArrayList<C8836h> arrayList = new ArrayList<>();
        for (C8830f b : this.f22869C) {
            arrayList.addAll(b.mo24000b());
        }
        Collections.sort(arrayList, new C8825f(this));
        for (C8836h hVar : arrayList) {
            C8819d dVar = hVar.f22940a;
            if (dVar.mo23949n() && dVar.mo23946k().mo24011i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final C8819d mo23944i() {
        return this.f22888q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo11373i(Activity activity) {
    }

    /* renamed from: j */
    public final Resources mo23945j() {
        Activity b = mo23920b();
        if (b != null) {
            return b.getResources();
        }
        return null;
    }

    /* renamed from: k */
    public final C8831g mo23946k() {
        return this.f22886o;
    }

    /* renamed from: l */
    public final C8819d mo23947l() {
        if (this.f22890s != null) {
            return this.f22886o.mo23868f().mo23987a(this.f22890s);
        }
        return null;
    }

    /* renamed from: m */
    public final View mo23948m() {
        return this.f22887p;
    }

    /* renamed from: n */
    public final boolean mo23949n() {
        return this.f22881j;
    }

    /* renamed from: o */
    public final boolean mo23950o() {
        return this.f22880i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo23951p() {
        Activity a = this.f22886o.mo23856a();
        if (a != null && !this.f22875I) {
            for (C8827h d : new ArrayList(this.f22870D)) {
                d.mo23970d(this);
            }
            this.f22875I = true;
            mo7065a((Context) a);
            for (C8827h a2 : new ArrayList(this.f22870D)) {
                a2.mo23962a(this, (Context) a);
            }
        }
        for (C8831g l : this.f22869C) {
            l.mo23872l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo23952q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo10333r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final void mo23953s() {
        this.f22891t = this.f22891t || this.f22881j;
        for (C8830f q : this.f22869C) {
            q.mo24017q();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final Bundle mo23954t() {
        if (!this.f22894w) {
            View view = this.f22887p;
            if (view != null) {
                mo7857f(view);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("Controller.className", getClass().getName());
        bundle.putBundle("Controller.viewState", this.f22877f);
        bundle.putBundle("Controller.args", this.f22876e);
        bundle.putString("Controller.instanceId", this.f22889r);
        bundle.putString("Controller.target.instanceId", this.f22890s);
        bundle.putStringArrayList("Controller.requestedPermissions", this.f22871E);
        bundle.putBoolean("Controller.needsAttach", this.f22891t || this.f22881j);
        bundle.putInt("Controller.retainViewMode", this.f22867A.ordinal());
        ControllerChangeHandler controllerChangeHandler = this.f22896y;
        if (controllerChangeHandler != null) {
            bundle.putBundle("Controller.overriddenPushHandler", controllerChangeHandler.mo23854e());
        }
        ControllerChangeHandler controllerChangeHandler2 = this.f22897z;
        if (controllerChangeHandler2 != null) {
            bundle.putBundle("Controller.overriddenPopHandler", controllerChangeHandler2.mo23854e());
        }
        ArrayList arrayList = new ArrayList(this.f22869C.size());
        for (C8830f fVar : this.f22869C) {
            Bundle bundle2 = new Bundle();
            fVar.mo23866b(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("Controller.childRouters", arrayList);
        Bundle bundle3 = new Bundle(getClass().getClassLoader());
        mo9307b(bundle3);
        for (C8827h c : new ArrayList(this.f22870D)) {
            c.mo23968c(this, bundle3);
        }
        bundle.putBundle("Controller.savedState", bundle3);
        return bundle;
    }

    protected C8819d(Bundle bundle) {
        this.f22867A = C8828i.RELEASE_DETACH;
        this.f22869C = new ArrayList();
        this.f22870D = new ArrayList();
        this.f22871E = new ArrayList<>();
        this.f22872F = new ArrayList<>();
        if (bundle == null) {
            bundle = new Bundle(getClass().getClassLoader());
        }
        this.f22876e = bundle;
        this.f22889r = UUID.randomUUID().toString();
        mo9312u();
    }

    /* renamed from: f */
    private void mo7857f(View view) {
        this.f22894w = true;
        this.f22877f = new Bundle(getClass().getClassLoader());
        SparseArray sparseArray = new SparseArray();
        view.saveHierarchyState(sparseArray);
        this.f22877f.putSparseParcelableArray("Controller.viewState.hierarchy", sparseArray);
        Bundle bundle = new Bundle(getClass().getClassLoader());
        mo11363b(view, bundle);
        this.f22877f.putBundle("Controller.viewState.bundle", bundle);
        for (C8827h d : new ArrayList(this.f22870D)) {
            d.mo23971d(this, this.f22877f);
        }
    }

    /* renamed from: a */
    public final C8831g mo23897a(ViewGroup viewGroup, String str) {
        return mo23898a(viewGroup, str, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C8819d mo23922b(String str) {
        if (this.f22889r.equals(str)) {
            return this;
        }
        for (C8831g a : this.f22869C) {
            C8819d a2 = a.mo23987a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo23940e(Activity activity) {
        boolean z = this.f22881j;
        ViewAttachHandler viewAttachHandler = this.f22868B;
        if (viewAttachHandler != null) {
            viewAttachHandler.mo24069b();
        }
        if (z && activity.isChangingConfigurations()) {
            this.f22891t = true;
        }
        mo11373i(activity);
    }

    /* renamed from: a */
    public final C8831g mo23898a(ViewGroup viewGroup, String str, boolean z) {
        C8830f fVar;
        int id = viewGroup.getId();
        Iterator it = this.f22869C.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = null;
                break;
            }
            fVar = (C8830f) it.next();
            if (fVar.mo23983t() == id && TextUtils.equals(str, fVar.mo23984u())) {
                break;
            }
        }
        if (fVar == null) {
            if (z) {
                fVar = new C8830f(viewGroup.getId(), str);
                fVar.mo23977a(this, viewGroup);
                this.f22869C.add(fVar);
                if (this.f22874H) {
                    fVar.mo23982c(true);
                }
            }
        } else if (!fVar.mo23985v()) {
            fVar.mo23977a(this, viewGroup);
            fVar.mo24018r();
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo23938d(Activity activity) {
        ViewAttachHandler viewAttachHandler = this.f22868B;
        if (viewAttachHandler != null) {
            viewAttachHandler.mo24067a();
        }
        mo11371h(activity);
    }

    /* renamed from: b */
    public void mo23929b(C8819d dVar) {
        if (this.f22890s == null) {
            this.f22890s = dVar != null ? dVar.mo23939e() : null;
            return;
        }
        throw new RuntimeException("Target controller already set. A controller's target may only be set once.");
    }

    /* renamed from: d */
    private void mo9311d(boolean z) {
        this.f22879h = true;
        C8831g gVar = this.f22886o;
        if (gVar != null) {
            gVar.mo23867c(this.f22889r);
        }
        for (C8830f a : this.f22869C) {
            a.mo23979a(false);
        }
        if (!this.f22881j) {
            mo9314x();
        } else if (z) {
            mo23909a(this.f22887p, true, false);
        }
    }

    /* renamed from: e */
    private void mo7061e(View view) {
        Bundle bundle = this.f22877f;
        if (bundle != null) {
            view.restoreHierarchyState(bundle.getSparseParcelableArray("Controller.viewState.hierarchy"));
            Bundle bundle2 = this.f22877f.getBundle("Controller.viewState.bundle");
            bundle2.setClassLoader(getClass().getClassLoader());
            mo23908a(view, bundle2);
            mo7097y();
            for (C8827h b : new ArrayList(this.f22870D)) {
                b.mo23965b(this, this.f22877f);
            }
        }
    }

    /* renamed from: b */
    public final void mo23928b(C8827h hVar) {
        this.f22870D.remove(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23931b(boolean z) {
        this.f22891t = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23923b(int i, String[] strArr, int[] iArr) {
        this.f22871E.removeAll(Arrays.asList(strArr));
        mo12056a(i, strArr, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23930b(C8831g gVar) {
        if (this.f22886o != gVar) {
            this.f22886o = gVar;
            mo7339w();
            Iterator it = this.f22872F.iterator();
            while (it.hasNext()) {
                ((RouterRequiringFunc) it.next()).execute();
            }
            this.f22872F.clear();
            return;
        }
        mo7339w();
    }

    /* renamed from: c */
    public Bundle mo23933c() {
        return this.f22876e;
    }

    /* renamed from: c */
    public boolean mo23936c(String str) {
        return VERSION.SDK_INT >= 23 && mo23920b().shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: d */
    private void m20861d(Bundle bundle) {
        this.f22877f = bundle.getBundle("Controller.viewState");
        Bundle bundle2 = this.f22877f;
        if (bundle2 != null) {
            bundle2.setClassLoader(getClass().getClassLoader());
        }
        this.f22889r = bundle.getString("Controller.instanceId");
        this.f22890s = bundle.getString("Controller.target.instanceId");
        this.f22871E.addAll(bundle.getStringArrayList("Controller.requestedPermissions"));
        this.f22896y = ControllerChangeHandler.m20791c(bundle.getBundle("Controller.overriddenPushHandler"));
        this.f22897z = ControllerChangeHandler.m20791c(bundle.getBundle("Controller.overriddenPopHandler"));
        this.f22891t = bundle.getBoolean("Controller.needsAttach");
        this.f22867A = C8828i.values()[bundle.getInt("Controller.retainViewMode", 0)];
        for (Bundle bundle3 : bundle.getParcelableArrayList("Controller.childRouters")) {
            C8830f fVar = new C8830f();
            fVar.mo23860a(bundle3);
            this.f22869C.add(fVar);
        }
        this.f22878g = bundle.getBundle("Controller.savedState");
        Bundle bundle4 = this.f22878g;
        if (bundle4 != null) {
            bundle4.setClassLoader(getClass().getClassLoader());
        }
        mo7339w();
    }

    /* renamed from: a */
    public final void mo23914a(C8831g gVar) {
        if ((gVar instanceof C8830f) && this.f22869C.remove(gVar)) {
            gVar.mo23979a(true);
        }
    }

    /* renamed from: c */
    public final void mo23935c(boolean z) {
        boolean z2 = this.f22881j && this.f22882k && this.f22883l != z;
        this.f22883l = z;
        if (z2) {
            this.f22886o.mo23871k();
        }
    }

    /* renamed from: a */
    public final void mo23902a(Intent intent) {
        mo23915a((RouterRequiringFunc) new C8820a(intent));
    }

    /* renamed from: a */
    public final void mo23903a(Intent intent, int i) {
        mo23915a((RouterRequiringFunc) new C8821b(intent, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo23934c(Activity activity) {
        if (!this.f22881j) {
            View view = this.f22887p;
            if (view != null && this.f22884m) {
                mo23907a(view);
                mo11369g(activity);
            }
        }
        if (this.f22881j) {
            this.f22891t = false;
            this.f22894w = false;
        }
        mo11369g(activity);
    }

    /* renamed from: a */
    public final void mo23904a(Intent intent, int i, Bundle bundle) {
        mo23915a((RouterRequiringFunc) new C8822c(intent, i, bundle));
    }

    /* renamed from: a */
    public final void mo23900a(int i) {
        mo23915a((RouterRequiringFunc) new C8823d(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23924b(Activity activity) {
        mo11367f(activity);
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo23917a(String[] strArr, int i) {
        this.f22871E.addAll(Arrays.asList(strArr));
        mo23915a((RouterRequiringFunc) new C8824e(strArr, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final View mo23921b(ViewGroup viewGroup) {
        View view = this.f22887p;
        if (!(view == null || view.getParent() == null || this.f22887p.getParent() == viewGroup)) {
            mo23909a(this.f22887p, true, false);
            mo9314x();
        }
        if (this.f22887p == null) {
            for (C8827h e : new ArrayList(this.f22870D)) {
                e.mo23973e(this);
            }
            this.f22887p = mo7054a(LayoutInflater.from(viewGroup.getContext()), viewGroup);
            if (this.f22887p != viewGroup) {
                for (C8827h b : new ArrayList(this.f22870D)) {
                    b.mo9319b(this, this.f22887p);
                }
                mo7061e(this.f22887p);
                this.f22868B = new ViewAttachHandler(new C8826g());
                this.f22868B.mo24068a(this.f22887p);
            } else {
                throw new IllegalStateException("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
            }
        } else if (this.f22867A == C8828i.RETAIN_DETACH) {
            mo7097y();
        }
        return this.f22887p;
    }

    /* renamed from: a */
    public final void mo23911a(C8827h hVar) {
        if (!this.f22870D.contains(hVar)) {
            this.f22870D.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo23912a(C8828i iVar) {
        if (iVar == null) {
            iVar = C8828i.RELEASE_DETACH;
        }
        this.f22867A = iVar;
        if (this.f22867A == C8828i.RELEASE_DETACH && !this.f22881j) {
            mo9314x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo23919a(String str) {
        return this.f22871E.contains(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23915a(RouterRequiringFunc routerRequiringFunc) {
        if (this.f22886o != null) {
            routerRequiringFunc.execute();
        } else {
            this.f22872F.add(routerRequiringFunc);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23901a(Activity activity) {
        if (activity.isChangingConfigurations()) {
            mo23909a(this.f22887p, true, false);
        } else {
            mo9311d(true);
        }
        if (this.f22875I) {
            for (C8827h b : new ArrayList(this.f22870D)) {
                b.mo23964b(this, (Context) activity);
            }
            this.f22875I = false;
            mo23952q();
            for (C8827h a : new ArrayList(this.f22870D)) {
                a.mo23961a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23927b(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        if (!eVar.f22921e) {
            this.f22874H = true;
            for (C8830f c : this.f22869C) {
                c.mo23982c(true);
            }
        }
        mo9310d(controllerChangeHandler, eVar);
        for (C8827h b : new ArrayList(this.f22870D)) {
            b.mo23966b(this, controllerChangeHandler, eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23907a(View view) {
        this.f22892u = this.f22886o == null || view.getParent() != this.f22886o.f22933h;
        if (!this.f22892u) {
            C8819d dVar = this.f22888q;
            if (dVar == null || dVar.f22881j) {
                this.f22893v = false;
                this.f22894w = false;
                for (C8827h d : new ArrayList(this.f22870D)) {
                    d.mo23972d(this, view);
                }
                this.f22881j = true;
                this.f22891t = this.f22886o.f22932g;
                mo7052b(view);
                if (this.f22882k && !this.f22883l) {
                    this.f22886o.mo23871k();
                }
                for (C8827h a : new ArrayList(this.f22870D)) {
                    a.mo9317a(this, view);
                }
                for (C8830f fVar : this.f22869C) {
                    Iterator it = fVar.f22926a.iterator();
                    while (it.hasNext()) {
                        C8819d dVar2 = ((C8836h) it.next()).f22940a;
                        if (dVar2.f22893v) {
                            dVar2.mo23907a(dVar2.f22887p);
                        }
                    }
                }
                return;
            }
            this.f22893v = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23925b(Menu menu) {
        if (this.f22881j && this.f22882k && !this.f22883l) {
            mo23905a(menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo23932b(MenuItem menuItem) {
        return this.f22881j && this.f22882k && !this.f22883l && mo23918a(menuItem);
    }

    /* renamed from: b */
    private static Constructor m20859b(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 0) {
                return constructor;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23909a(View view, boolean z, boolean z2) {
        if (!this.f22892u) {
            for (C8830f q : this.f22869C) {
                q.mo24017q();
            }
        }
        boolean z3 = !z2 && (z || this.f22867A == C8828i.RELEASE_DETACH || this.f22879h);
        if (this.f22881j) {
            for (C8827h f : new ArrayList(this.f22870D)) {
                f.mo23976f(this, view);
            }
            this.f22881j = false;
            if (!this.f22893v) {
                mo7053d(view);
            }
            if (this.f22882k && !this.f22883l) {
                this.f22886o.mo23871k();
            }
            for (C8827h c : new ArrayList(this.f22870D)) {
                c.mo23969c(this, view);
            }
        }
        if (z3) {
            mo9314x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23899a() {
        mo9311d(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23910a(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        if (!eVar.f22921e) {
            this.f22874H = false;
            for (C8830f c : this.f22869C) {
                c.mo23982c(false);
            }
        }
        mo9309c(controllerChangeHandler, eVar);
        for (C8827h a : new ArrayList(this.f22870D)) {
            a.mo7344a(this, controllerChangeHandler, eVar);
        }
        if (this.f22879h && !this.f22884m && !this.f22881j) {
            WeakReference<View> weakReference = this.f22873G;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (!(this.f22886o.f22933h == null || view == null)) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = this.f22886o.f22933h;
                    if (parent == viewGroup) {
                        viewGroup.removeView(view);
                    }
                }
                this.f22873G = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23916a(boolean z) {
        if (this.f22895x != z) {
            this.f22895x = z;
            for (C8830f c : this.f22869C) {
                c.mo23982c(z);
            }
            if (!z) {
                View view = this.f22887p;
                if (view != null && this.f22885n) {
                    mo23909a(view, false, false);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23906a(Menu menu, MenuInflater menuInflater) {
        if (this.f22881j && this.f22882k && !this.f22883l) {
            mo23926b(menu, menuInflater);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23913a(C8819d dVar) {
        this.f22888q = dVar;
    }

    /* renamed from: a */
    private static Constructor m20858a(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }
}
