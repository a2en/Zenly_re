package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment.SavedState;
import androidx.lifecycle.C0862g.C0864b;
import androidx.viewpager.widget.C1295a;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.n */
public abstract class C0818n extends C1295a {

    /* renamed from: c */
    private final FragmentManager f3303c;

    /* renamed from: d */
    private final int f3304d;

    /* renamed from: e */
    private C0819o f3305e = null;

    /* renamed from: f */
    private ArrayList<SavedState> f3306f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<Fragment> f3307g = new ArrayList<>();

    /* renamed from: h */
    private Fragment f3308h = null;

    public C0818n(FragmentManager fragmentManager, int i) {
        this.f3303c = fragmentManager;
        this.f3304d = i;
    }

    /* renamed from: a */
    public Object mo4281a(ViewGroup viewGroup, int i) {
        if (this.f3307g.size() > i) {
            Fragment fragment = (Fragment) this.f3307g.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f3305e == null) {
            this.f3305e = this.f3303c.mo4084b();
        }
        Fragment b = mo4309b(i);
        if (this.f3306f.size() > i) {
            SavedState savedState = (SavedState) this.f3306f.get(i);
            if (savedState != null) {
                b.setInitialSavedState(savedState);
            }
        }
        while (this.f3307g.size() <= i) {
            this.f3307g.add(null);
        }
        b.setMenuVisibility(false);
        if (this.f3304d == 0) {
            b.setUserVisibleHint(false);
        }
        this.f3307g.set(i, b);
        this.f3305e.mo4311a(viewGroup.getId(), b);
        if (this.f3304d == 1) {
            this.f3305e.mo4178a(b, C0864b.STARTED);
        }
        return b;
    }

    /* renamed from: b */
    public abstract Fragment mo4309b(int i);

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

    /* renamed from: b */
    public void mo4289b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3308h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3304d == 1) {
                    if (this.f3305e == null) {
                        this.f3305e = this.f3303c.mo4084b();
                    }
                    this.f3305e.mo4178a(this.f3308h, C0864b.STARTED);
                } else {
                    this.f3308h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3304d == 1) {
                if (this.f3305e == null) {
                    this.f3305e = this.f3303c.mo4084b();
                }
                this.f3305e.mo4178a(fragment, C0864b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3308h = fragment;
        }
    }

    /* renamed from: a */
    public void mo4284a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3305e == null) {
            this.f3305e = this.f3303c.mo4084b();
        }
        while (this.f3306f.size() <= i) {
            this.f3306f.add(null);
        }
        this.f3306f.set(i, fragment.isAdded() ? this.f3303c.mo4116n(fragment) : null);
        this.f3307g.set(i, null);
        this.f3305e.mo4193d(fragment);
        if (fragment.equals(this.f3308h)) {
            this.f3308h = null;
        }
    }

    /* renamed from: b */
    public Parcelable mo4286b() {
        Bundle bundle;
        if (this.f3306f.size() > 0) {
            bundle = new Bundle();
            SavedState[] savedStateArr = new SavedState[this.f3306f.size()];
            this.f3306f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3307g.size(); i++) {
            Fragment fragment = (Fragment) this.f3307g.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("f");
                sb.append(i);
                this.f3303c.mo4064a(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo4283a(ViewGroup viewGroup) {
        C0819o oVar = this.f3305e;
        if (oVar != null) {
            try {
                oVar.mo4194d();
            } catch (IllegalStateException unused) {
                this.f3305e.mo4185b();
            }
            this.f3305e = null;
        }
    }

    /* renamed from: a */
    public boolean mo4285a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: a */
    public void mo4282a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3306f.clear();
            this.f3307g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3306f.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.f3303c.mo4059a(bundle, str);
                    if (a != null) {
                        while (this.f3307g.size() <= parseInt) {
                            this.f3307g.add(null);
                        }
                        a.setMenuVisibility(false);
                        this.f3307g.set(parseInt, a);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                        Log.w("FragmentStatePagerAdapt", sb.toString());
                    }
                }
            }
        }
    }
}
