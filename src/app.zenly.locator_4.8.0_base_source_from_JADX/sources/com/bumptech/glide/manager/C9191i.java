package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C8867j;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.i */
public class C9191i extends Fragment {

    /* renamed from: e */
    private final C9181a f23849e;

    /* renamed from: f */
    private final RequestManagerTreeNode f23850f;

    /* renamed from: g */
    private final Set<C9191i> f23851g;

    /* renamed from: h */
    private C9191i f23852h;

    /* renamed from: i */
    private C8867j f23853i;

    /* renamed from: j */
    private Fragment f23854j;

    /* renamed from: com.bumptech.glide.manager.i$a */
    private class C9192a implements RequestManagerTreeNode {
        C9192a() {
        }

        public Set<C8867j> getDescendants() {
            Set<C9191i> a = C9191i.this.mo24781a();
            HashSet hashSet = new HashSet(a.size());
            for (C9191i iVar : a) {
                if (iVar.mo24785c() != null) {
                    hashSet.add(iVar.mo24785c());
                }
            }
            return hashSet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C9191i.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C9191i() {
        this(new C9181a());
    }

    /* renamed from: e */
    private Fragment m22029e() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f23854j;
    }

    /* renamed from: f */
    private void m22030f() {
        C9191i iVar = this.f23852h;
        if (iVar != null) {
            iVar.m22027b(this);
            this.f23852h = null;
        }
    }

    /* renamed from: a */
    public void mo24783a(C8867j jVar) {
        this.f23853i = jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9181a mo24784b() {
        return this.f23849e;
    }

    /* renamed from: c */
    public C8867j mo24785c() {
        return this.f23853i;
    }

    /* renamed from: d */
    public RequestManagerTreeNode mo24786d() {
        return this.f23850f;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager b = m22026b((Fragment) this);
        String str = "SupportRMFragment";
        if (b == null) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            m22024a(getContext(), b);
        } catch (IllegalStateException e) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f23849e.mo24755a();
        m22030f();
    }

    public void onDetach() {
        super.onDetach();
        this.f23854j = null;
        m22030f();
    }

    public void onStart() {
        super.onStart();
        this.f23849e.mo24756b();
    }

    public void onStop() {
        super.onStop();
        this.f23849e.mo24757c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m22029e());
        sb.append("}");
        return sb.toString();
    }

    @SuppressLint({"ValidFragment"})
    public C9191i(C9181a aVar) {
        this.f23850f = new C9192a();
        this.f23851g = new HashSet();
        this.f23849e = aVar;
    }

    /* renamed from: a */
    private void m22025a(C9191i iVar) {
        this.f23851g.add(iVar);
    }

    /* renamed from: b */
    private void m22027b(C9191i iVar) {
        this.f23851g.remove(iVar);
    }

    /* renamed from: c */
    private boolean m22028c(Fragment fragment) {
        Fragment e = m22029e();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(e)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: b */
    private static FragmentManager m22026b(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Set<C9191i> mo24781a() {
        C9191i iVar = this.f23852h;
        if (iVar == null) {
            return Collections.emptySet();
        }
        if (equals(iVar)) {
            return Collections.unmodifiableSet(this.f23851g);
        }
        HashSet hashSet = new HashSet();
        for (C9191i iVar2 : this.f23852h.mo24781a()) {
            if (m22028c(iVar2.m22029e())) {
                hashSet.add(iVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24782a(Fragment fragment) {
        this.f23854j = fragment;
        if (!(fragment == null || fragment.getContext() == null)) {
            FragmentManager b = m22026b(fragment);
            if (b != null) {
                m22024a(fragment.getContext(), b);
            }
        }
    }

    /* renamed from: a */
    private void m22024a(Context context, FragmentManager fragmentManager) {
        m22030f();
        this.f23852h = Glide.m21128a(context).mo24096h().mo24751a(context, fragmentManager);
        if (!equals(this.f23852h)) {
            this.f23852h.m22025a(this);
        }
    }
}
