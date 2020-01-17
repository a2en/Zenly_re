package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0862g.C0864b;
import androidx.viewpager.widget.C1295a;

/* renamed from: androidx.fragment.app.l */
public abstract class C0815l extends C1295a {

    /* renamed from: c */
    private final FragmentManager f3296c;

    /* renamed from: d */
    private final int f3297d;

    /* renamed from: e */
    private C0819o f3298e;

    /* renamed from: f */
    private Fragment f3299f;

    @Deprecated
    public C0815l(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    /* renamed from: a */
    public Object mo4281a(ViewGroup viewGroup, int i) {
        if (this.f3298e == null) {
            this.f3298e = this.f3296c.mo4084b();
        }
        long c = mo4290c(i);
        Fragment b = this.f3296c.mo4083b(m3830a(viewGroup.getId(), c));
        if (b != null) {
            this.f3298e.mo4315a(b);
        } else {
            b = mo4287b(i);
            this.f3298e.mo4312a(viewGroup.getId(), b, m3830a(viewGroup.getId(), c));
        }
        if (b != this.f3299f) {
            b.setMenuVisibility(false);
            if (this.f3297d == 1) {
                this.f3298e.mo4178a(b, C0864b.STARTED);
            } else {
                b.setUserVisibleHint(false);
            }
        }
        return b;
    }

    /* renamed from: a */
    public void mo4282a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public Parcelable mo4286b() {
        return null;
    }

    /* renamed from: b */
    public abstract Fragment mo4287b(int i);

    /* renamed from: b */
    public void mo4288b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    public long mo4290c(int i) {
        return (long) i;
    }

    public C0815l(FragmentManager fragmentManager, int i) {
        this.f3298e = null;
        this.f3299f = null;
        this.f3296c = fragmentManager;
        this.f3297d = i;
    }

    /* renamed from: b */
    public void mo4289b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3299f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3297d == 1) {
                    if (this.f3298e == null) {
                        this.f3298e = this.f3296c.mo4084b();
                    }
                    this.f3298e.mo4178a(this.f3299f, C0864b.STARTED);
                } else {
                    this.f3299f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3297d == 1) {
                if (this.f3298e == null) {
                    this.f3298e = this.f3296c.mo4084b();
                }
                this.f3298e.mo4178a(fragment, C0864b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3299f = fragment;
        }
    }

    /* renamed from: a */
    public void mo4284a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3298e == null) {
            this.f3298e = this.f3296c.mo4084b();
        }
        this.f3298e.mo4188b(fragment);
        if (fragment.equals(this.f3299f)) {
            this.f3299f = null;
        }
    }

    /* renamed from: a */
    public void mo4283a(ViewGroup viewGroup) {
        C0819o oVar = this.f3298e;
        if (oVar != null) {
            try {
                oVar.mo4194d();
            } catch (IllegalStateException unused) {
                this.f3298e.mo4185b();
            }
            this.f3298e = null;
        }
    }

    /* renamed from: a */
    public boolean mo4285a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: a */
    private static String m3830a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
