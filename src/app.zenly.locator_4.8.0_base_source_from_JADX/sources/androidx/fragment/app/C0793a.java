package androidx.fragment.app;

import android.util.Log;
import androidx.core.util.C0601c;
import androidx.fragment.app.FragmentManager.BackStackEntry;
import androidx.lifecycle.C0862g.C0864b;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
final class C0793a extends C0819o implements BackStackEntry, C0787g {

    /* renamed from: r */
    final FragmentManager f3241r;

    /* renamed from: s */
    boolean f3242s;

    /* renamed from: t */
    int f3243t;

    C0793a(FragmentManager fragmentManager) {
        C0807f p = fragmentManager.mo4120p();
        C0808g<?> gVar = fragmentManager.f3197p;
        super(p, gVar != null ? gVar.mo4249c().getClassLoader() : null);
        this.f3243t = -1;
        this.f3241r = fragmentManager;
    }

    /* renamed from: a */
    public void mo4182a(String str, PrintWriter printWriter) {
        mo4183a(str, printWriter, true);
    }

    /* renamed from: b */
    public C0819o mo4188b(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3241r) {
            super.mo4188b(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public C0819o mo4190c(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3241r) {
            super.mo4190c(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C0819o mo4193d(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3241r) {
            super.mo4193d(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public C0819o mo4195e(Fragment fragment) {
        if (fragment != null) {
            FragmentManager fragmentManager = fragment.mFragmentManager;
            if (!(fragmentManager == null || fragmentManager == this.f3241r)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
                sb.append(fragment.toString());
                sb.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
        }
        super.mo4195e(fragment);
        return this;
    }

    /* renamed from: f */
    public C0819o mo4196f(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3241r) {
            super.mo4196f(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo4198g() {
        for (int i = 0; i < this.f3309a.size(); i++) {
            if (m3720b((C0820a) this.f3309a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public CharSequence getBreadCrumbShortTitle() {
        if (this.f3320l != 0) {
            return this.f3241r.f3197p.mo4249c().getText(this.f3320l);
        }
        return this.f3321m;
    }

    public int getBreadCrumbShortTitleRes() {
        return this.f3320l;
    }

    public CharSequence getBreadCrumbTitle() {
        if (this.f3318j != 0) {
            return this.f3241r.f3197p.mo4249c().getText(this.f3318j);
        }
        return this.f3319k;
    }

    public int getBreadCrumbTitleRes() {
        return this.f3318j;
    }

    public int getId() {
        return this.f3243t;
    }

    public String getName() {
        return this.f3317i;
    }

    /* renamed from: h */
    public void mo4199h() {
        if (this.f3325q != null) {
            for (int i = 0; i < this.f3325q.size(); i++) {
                ((Runnable) this.f3325q.get(i)).run();
            }
            this.f3325q = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3243t >= 0) {
            sb.append(" #");
            sb.append(this.f3243t);
        }
        if (this.f3317i != null) {
            sb.append(" ");
            sb.append(this.f3317i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo4183a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3317i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3243t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3242s);
            if (this.f3314f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3314f));
            }
            if (!(this.f3310b == 0 && this.f3311c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3310b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3311c));
            }
            if (!(this.f3312d == 0 && this.f3313e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3312d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3313e));
            }
            if (!(this.f3318j == 0 && this.f3319k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3318j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3319k);
            }
            if (!(this.f3320l == 0 && this.f3321m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3320l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3321m);
            }
        }
        if (!this.f3309a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3309a.size();
            for (int i = 0; i < size; i++) {
                C0820a aVar = (C0820a) this.f3309a.get(i);
                switch (aVar.f3326a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(aVar.f3326a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3327b);
                if (z) {
                    if (!(aVar.f3328c == 0 && aVar.f3329d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3328c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3329d));
                    }
                    if (aVar.f3330e != 0 || aVar.f3331f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3330e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3331f));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public int mo4185b() {
        return mo4186b(true);
    }

    /* renamed from: c */
    public void mo4191c() {
        mo4322e();
        this.f3241r.mo4087b((C0787g) this, false);
    }

    /* renamed from: d */
    public void mo4194d() {
        mo4322e();
        this.f3241r.mo4087b((C0787g) this, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4197f() {
        int size = this.f3309a.size();
        for (int i = 0; i < size; i++) {
            C0820a aVar = (C0820a) this.f3309a.get(i);
            Fragment fragment = aVar.f3327b;
            if (fragment != null) {
                fragment.setNextTransition(this.f3314f);
            }
            switch (aVar.f3326a) {
                case 1:
                    fragment.setNextAnim(aVar.f3328c);
                    this.f3241r.mo4071a(fragment, false);
                    this.f3241r.mo4067a(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f3329d);
                    this.f3241r.mo4113l(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3329d);
                    this.f3241r.mo4101f(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f3328c);
                    this.f3241r.mo4071a(fragment, false);
                    this.f3241r.mo4121p(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f3329d);
                    this.f3241r.mo4097d(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f3328c);
                    this.f3241r.mo4071a(fragment, false);
                    this.f3241r.mo4093c(fragment);
                    break;
                case 8:
                    this.f3241r.mo4119o(fragment);
                    break;
                case 9:
                    this.f3241r.mo4119o(null);
                    break;
                case 10:
                    this.f3241r.mo4070a(fragment, aVar.f3333h);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f3326a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f3324p || aVar.f3326a == 1 || fragment == null)) {
                this.f3241r.mo4107i(fragment);
            }
        }
        if (!this.f3324p) {
            FragmentManager fragmentManager = this.f3241r;
            fragmentManager.mo4062a(fragmentManager.f3196o, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4186b(boolean z) {
        if (!this.f3242s) {
            if (FragmentManager.m3606d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new C0601c(str));
                mo4182a("  ", printWriter);
                printWriter.close();
            }
            this.f3242s = true;
            if (this.f3315g) {
                this.f3243t = this.f3241r.mo4057a();
            } else {
                this.f3243t = -1;
            }
            this.f3241r.mo4073a((C0787g) this, z);
            return this.f3243t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4192c(boolean z) {
        for (int size = this.f3309a.size() - 1; size >= 0; size--) {
            C0820a aVar = (C0820a) this.f3309a.get(size);
            Fragment fragment = aVar.f3327b;
            if (fragment != null) {
                fragment.setNextTransition(FragmentManager.m3607e(this.f3314f));
            }
            switch (aVar.f3326a) {
                case 1:
                    fragment.setNextAnim(aVar.f3331f);
                    this.f3241r.mo4071a(fragment, true);
                    this.f3241r.mo4113l(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(aVar.f3330e);
                    this.f3241r.mo4067a(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3330e);
                    this.f3241r.mo4121p(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f3331f);
                    this.f3241r.mo4071a(fragment, true);
                    this.f3241r.mo4101f(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f3330e);
                    this.f3241r.mo4093c(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f3331f);
                    this.f3241r.mo4071a(fragment, true);
                    this.f3241r.mo4097d(fragment);
                    break;
                case 8:
                    this.f3241r.mo4119o(null);
                    break;
                case 9:
                    this.f3241r.mo4119o(fragment);
                    break;
                case 10:
                    this.f3241r.mo4070a(fragment, aVar.f3332g);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f3326a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f3324p || aVar.f3326a == 3 || fragment == null)) {
                this.f3241r.mo4107i(fragment);
            }
        }
        if (!this.f3324p && z) {
            FragmentManager fragmentManager = this.f3241r;
            fragmentManager.mo4062a(fragmentManager.f3196o, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4189b(int i) {
        int size = this.f3309a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C0820a) this.f3309a.get(i2)).f3327b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo4187b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3309a.size() - 1; size >= 0; size--) {
            C0820a aVar = (C0820a) this.f3309a.get(size);
            int i = aVar.f3326a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3327b;
                            break;
                        case 10:
                            aVar.f3333h = aVar.f3332g;
                            break;
                    }
                }
                arrayList.add(aVar.f3327b);
            }
            arrayList.remove(aVar.f3327b);
        }
        return fragment;
    }

    /* renamed from: b */
    private static boolean m3720b(C0820a aVar) {
        Fragment fragment = aVar.f3327b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4180a(int i, Fragment fragment, String str, int i2) {
        super.mo4180a(i, fragment, str, i2);
        fragment.mFragmentManager = this.f3241r;
    }

    /* renamed from: a */
    public C0819o mo4178a(Fragment fragment, C0864b bVar) {
        if (fragment.mFragmentManager != this.f3241r) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.f3241r);
            throw new IllegalArgumentException(sb.toString());
        } else if (bVar.mo4448a(C0864b.CREATED)) {
            super.mo4178a(fragment, bVar);
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle below ");
            sb2.append(C0864b.CREATED);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4179a(int i) {
        if (this.f3315g) {
            String str = "FragmentManager";
            if (FragmentManager.m3606d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v(str, sb.toString());
            }
            int size = this.f3309a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0820a aVar = (C0820a) this.f3309a.get(i2);
                Fragment fragment = aVar.f3327b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.m3606d(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f3327b);
                        sb2.append(" to ");
                        sb2.append(aVar.f3327b.mBackStackNesting);
                        Log.v(str, sb2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo4176a() {
        return mo4186b(false);
    }

    /* renamed from: a */
    public boolean mo4159a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f3315g) {
            this.f3241r.mo4074a(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4184a(ArrayList<C0793a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3309a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((C0820a) this.f3309a.get(i4)).f3327b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0793a aVar = (C0793a) arrayList.get(i6);
                    int size2 = aVar.f3309a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C0820a) aVar.f3309a.get(i7)).f3327b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo4177a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3309a.size()) {
            C0820a aVar = (C0820a) this.f3309a.get(i);
            int i2 = aVar.f3326a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3327b;
                    int i3 = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList2.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f3309a.add(i4, new C0820a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                C0820a aVar2 = new C0820a(3, fragment5);
                                aVar2.f3328c = aVar.f3328c;
                                aVar2.f3330e = aVar.f3330e;
                                aVar2.f3329d = aVar.f3329d;
                                aVar2.f3331f = aVar.f3331f;
                                this.f3309a.add(i4, aVar2);
                                arrayList2.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f3309a.remove(i4);
                        i4--;
                    } else {
                        aVar.f3326a = 1;
                        arrayList2.add(fragment3);
                    }
                    i = i4;
                    fragment2 = fragment4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3327b);
                    Fragment fragment6 = aVar.f3327b;
                    if (fragment6 == fragment2) {
                        this.f3309a.add(i, new C0820a(9, fragment6));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3309a.add(i, new C0820a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3327b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3327b);
            i++;
        }
        return fragment2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4181a(C0779e eVar) {
        for (int i = 0; i < this.f3309a.size(); i++) {
            C0820a aVar = (C0820a) this.f3309a.get(i);
            if (m3720b(aVar)) {
                aVar.f3327b.setOnStartEnterTransitionListener(eVar);
            }
        }
    }
}
