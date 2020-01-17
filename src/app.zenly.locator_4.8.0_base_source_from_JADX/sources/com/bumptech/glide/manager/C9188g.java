package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.C8867j;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.manager.g */
public class C9188g extends Fragment {

    /* renamed from: e */
    private final C9181a f23839e;

    /* renamed from: f */
    private final RequestManagerTreeNode f23840f;

    /* renamed from: g */
    private final Set<C9188g> f23841g;

    /* renamed from: h */
    private C8867j f23842h;

    /* renamed from: i */
    private C9188g f23843i;

    /* renamed from: j */
    private Fragment f23844j;

    /* renamed from: com.bumptech.glide.manager.g$a */
    private class C9189a implements RequestManagerTreeNode {
        C9189a() {
        }

        public Set<C8867j> getDescendants() {
            Set<C9188g> a = C9188g.this.mo24760a();
            HashSet hashSet = new HashSet(a.size());
            for (C9188g gVar : a) {
                if (gVar.mo24764c() != null) {
                    hashSet.add(gVar.mo24764c());
                }
            }
            return hashSet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C9188g.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C9188g() {
        this(new C9181a());
    }

    @TargetApi(17)
    /* renamed from: e */
    private Fragment m22009e() {
        Fragment parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f23844j;
    }

    /* renamed from: f */
    private void m22010f() {
        C9188g gVar = this.f23843i;
        if (gVar != null) {
            gVar.m22007b(this);
            this.f23843i = null;
        }
    }

    /* renamed from: a */
    public void mo24762a(C8867j jVar) {
        this.f23842h = jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9181a mo24763b() {
        return this.f23839e;
    }

    /* renamed from: c */
    public C8867j mo24764c() {
        return this.f23842h;
    }

    /* renamed from: d */
    public RequestManagerTreeNode mo24765d() {
        return this.f23840f;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m22005a(activity);
        } catch (IllegalStateException e) {
            String str = "RMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f23839e.mo24755a();
        m22010f();
    }

    public void onDetach() {
        super.onDetach();
        m22010f();
    }

    public void onStart() {
        super.onStart();
        this.f23839e.mo24756b();
    }

    public void onStop() {
        super.onStop();
        this.f23839e.mo24757c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m22009e());
        sb.append("}");
        return sb.toString();
    }

    @SuppressLint({"ValidFragment"})
    C9188g(C9181a aVar) {
        this.f23840f = new C9189a();
        this.f23841g = new HashSet();
        this.f23839e = aVar;
    }

    /* renamed from: a */
    private void m22006a(C9188g gVar) {
        this.f23841g.add(gVar);
    }

    /* renamed from: b */
    private void m22007b(C9188g gVar) {
        this.f23841g.remove(gVar);
    }

    @TargetApi(17)
    /* renamed from: b */
    private boolean m22008b(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(17)
    /* renamed from: a */
    public Set<C9188g> mo24760a() {
        if (equals(this.f23843i)) {
            return Collections.unmodifiableSet(this.f23841g);
        }
        if (this.f23843i == null || VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C9188g gVar : this.f23843i.mo24760a()) {
            if (m22008b(gVar.getParentFragment())) {
                hashSet.add(gVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24761a(Fragment fragment) {
        this.f23844j = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m22005a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    private void m22005a(Activity activity) {
        m22010f();
        this.f23843i = Glide.m21128a((Context) activity).mo24096h().mo24752b(activity);
        if (!equals(this.f23843i)) {
            this.f23843i.m22006a(this);
        }
    }
}
