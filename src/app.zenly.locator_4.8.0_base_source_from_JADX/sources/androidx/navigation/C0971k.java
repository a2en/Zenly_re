package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.navigation.p006u.C0999a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p214e.p228e.C7585h;

/* renamed from: androidx.navigation.k */
public class C0971k extends C0969j implements Iterable<C0969j> {

    /* renamed from: m */
    final C7585h<C0969j> f3717m = new C7585h<>();

    /* renamed from: n */
    private int f3718n;

    /* renamed from: o */
    private String f3719o;

    /* renamed from: androidx.navigation.k$a */
    class C0972a implements Iterator<C0969j> {

        /* renamed from: e */
        private int f3720e = -1;

        /* renamed from: f */
        private boolean f3721f = false;

        C0972a() {
        }

        public boolean hasNext() {
            return this.f3720e + 1 < C0971k.this.f3717m.mo19615a();
        }

        public void remove() {
            if (this.f3721f) {
                ((C0969j) C0971k.this.f3717m.mo19627f(this.f3720e)).mo4726a((C0971k) null);
                C0971k.this.f3717m.mo19626e(this.f3720e);
                this.f3720e--;
                this.f3721f = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }

        public C0969j next() {
            if (hasNext()) {
                this.f3721f = true;
                C7585h<C0969j> hVar = C0971k.this.f3717m;
                int i = this.f3720e + 1;
                this.f3720e = i;
                return (C0969j) hVar.mo19627f(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C0971k(Navigator<? extends C0971k> navigator) {
        super(navigator);
    }

    /* renamed from: a */
    public void mo4664a(Context context, AttributeSet attributeSet) {
        super.mo4664a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0999a.NavGraphNavigator);
        mo4744d(obtainAttributes.getResourceId(C0999a.NavGraphNavigator_startDestination, 0));
        this.f3719o = C0969j.m4325a(context, this.f3718n);
        obtainAttributes.recycle();
    }

    /* renamed from: c */
    public final C0969j mo4743c(int i) {
        return mo4741a(i, true);
    }

    /* renamed from: d */
    public final void mo4744d(int i) {
        this.f3718n = i;
        this.f3719o = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo4745h() {
        if (this.f3719o == null) {
            this.f3719o = Integer.toString(this.f3718n);
        }
        return this.f3719o;
    }

    /* renamed from: i */
    public final int mo4746i() {
        return this.f3718n;
    }

    public final Iterator<C0969j> iterator() {
        return new C0972a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        C0969j c = mo4743c(mo4746i());
        if (c == null) {
            String str = this.f3719o;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.f3718n));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(c.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo4733c() {
        return mo4734d() != 0 ? super.mo4733c() : "the root navigation";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0970a mo4724a(Uri uri) {
        C0970a a = super.mo4724a(uri);
        Iterator it = iterator();
        while (it.hasNext()) {
            C0970a a2 = ((C0969j) it.next()).mo4724a(uri);
            if (a2 != null && (a == null || a2.compareTo(a) > 0)) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo4742a(C0969j jVar) {
        if (jVar.mo4734d() != 0) {
            C0969j jVar2 = (C0969j) this.f3717m.mo19617a(jVar.mo4734d());
            if (jVar2 != jVar) {
                if (jVar.mo4736f() == null) {
                    if (jVar2 != null) {
                        jVar2.mo4726a((C0971k) null);
                    }
                    jVar.mo4726a(this);
                    this.f3717m.mo19622c(jVar.mo4734d(), jVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0969j mo4741a(int i, boolean z) {
        C0969j jVar = (C0969j) this.f3717m.mo19617a(i);
        if (jVar != null) {
            return jVar;
        }
        if (!z || mo4736f() == null) {
            return null;
        }
        return mo4736f().mo4743c(i);
    }
}
