package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.C0862g.C0864b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.o */
public abstract class C0819o {

    /* renamed from: a */
    ArrayList<C0820a> f3309a = new ArrayList<>();

    /* renamed from: b */
    int f3310b;

    /* renamed from: c */
    int f3311c;

    /* renamed from: d */
    int f3312d;

    /* renamed from: e */
    int f3313e;

    /* renamed from: f */
    int f3314f;

    /* renamed from: g */
    boolean f3315g;

    /* renamed from: h */
    boolean f3316h = true;

    /* renamed from: i */
    String f3317i;

    /* renamed from: j */
    int f3318j;

    /* renamed from: k */
    CharSequence f3319k;

    /* renamed from: l */
    int f3320l;

    /* renamed from: m */
    CharSequence f3321m;

    /* renamed from: n */
    ArrayList<String> f3322n;

    /* renamed from: o */
    ArrayList<String> f3323o;

    /* renamed from: p */
    boolean f3324p = false;

    /* renamed from: q */
    ArrayList<Runnable> f3325q;

    /* renamed from: androidx.fragment.app.o$a */
    static final class C0820a {

        /* renamed from: a */
        int f3326a;

        /* renamed from: b */
        Fragment f3327b;

        /* renamed from: c */
        int f3328c;

        /* renamed from: d */
        int f3329d;

        /* renamed from: e */
        int f3330e;

        /* renamed from: f */
        int f3331f;

        /* renamed from: g */
        C0864b f3332g;

        /* renamed from: h */
        C0864b f3333h;

        C0820a() {
        }

        C0820a(int i, Fragment fragment) {
            this.f3326a = i;
            this.f3327b = fragment;
            C0864b bVar = C0864b.RESUMED;
            this.f3332g = bVar;
            this.f3333h = bVar;
        }

        C0820a(int i, Fragment fragment, C0864b bVar) {
            this.f3326a = i;
            this.f3327b = fragment;
            this.f3332g = fragment.mMaxState;
            this.f3333h = bVar;
        }
    }

    C0819o(C0807f fVar, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public abstract int mo4176a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4319a(C0820a aVar) {
        this.f3309a.add(aVar);
        aVar.f3328c = this.f3310b;
        aVar.f3329d = this.f3311c;
        aVar.f3330e = this.f3312d;
        aVar.f3331f = this.f3313e;
    }

    /* renamed from: b */
    public abstract int mo4185b();

    /* renamed from: b */
    public C0819o mo4320b(int i, Fragment fragment) {
        mo4321b(i, fragment, null);
        return this;
    }

    /* renamed from: c */
    public C0819o mo4190c(Fragment fragment) {
        mo4319a(new C0820a(4, fragment));
        return this;
    }

    /* renamed from: c */
    public abstract void mo4191c();

    /* renamed from: d */
    public C0819o mo4193d(Fragment fragment) {
        mo4319a(new C0820a(3, fragment));
        return this;
    }

    /* renamed from: d */
    public abstract void mo4194d();

    /* renamed from: e */
    public C0819o mo4195e(Fragment fragment) {
        mo4319a(new C0820a(8, fragment));
        return this;
    }

    /* renamed from: f */
    public C0819o mo4196f(Fragment fragment) {
        mo4319a(new C0820a(5, fragment));
        return this;
    }

    /* renamed from: b */
    public C0819o mo4321b(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo4180a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: e */
    public C0819o mo4322e() {
        if (!this.f3315g) {
            this.f3316h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: b */
    public C0819o mo4188b(Fragment fragment) {
        mo4319a(new C0820a(6, fragment));
        return this;
    }

    /* renamed from: a */
    public C0819o mo4316a(Fragment fragment, String str) {
        mo4180a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0819o mo4311a(int i, Fragment fragment) {
        mo4180a(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a */
    public C0819o mo4312a(int i, Fragment fragment, String str) {
        mo4180a(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0819o mo4314a(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        mo4312a(viewGroup.getId(), fragment, str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4180a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.mTag;
            if (str4 == null || str.equals(str4)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.mTag);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(str3);
                    sb3.append(fragment.mFragmentId);
                    sb3.append(str2);
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        mo4319a(new C0820a(i2, fragment));
    }

    /* renamed from: a */
    public C0819o mo4315a(Fragment fragment) {
        mo4319a(new C0820a(7, fragment));
        return this;
    }

    /* renamed from: a */
    public C0819o mo4178a(Fragment fragment, C0864b bVar) {
        mo4319a(new C0820a(10, fragment, bVar));
        return this;
    }

    /* renamed from: a */
    public C0819o mo4310a(int i, int i2, int i3, int i4) {
        this.f3310b = i;
        this.f3311c = i2;
        this.f3312d = i3;
        this.f3313e = i4;
        return this;
    }

    /* renamed from: a */
    public C0819o mo4313a(View view, String str) {
        if (C0821p.m3922b()) {
            String t = ViewCompat.m2867t(view);
            if (t != null) {
                if (this.f3322n == null) {
                    this.f3322n = new ArrayList<>();
                    this.f3323o = new ArrayList<>();
                } else {
                    String str2 = "' has already been added to the transaction.";
                    if (this.f3323o.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("A shared element with the target name '");
                        sb.append(str);
                        sb.append(str2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (this.f3322n.contains(t)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("A shared element with the source name '");
                        sb2.append(t);
                        sb2.append(str2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                this.f3322n.add(t);
                this.f3323o.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0819o mo4317a(String str) {
        if (this.f3316h) {
            this.f3315g = true;
            this.f3317i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: a */
    public C0819o mo4318a(boolean z) {
        this.f3324p = z;
        return this;
    }
}
