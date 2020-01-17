package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.C0969j;
import androidx.navigation.C0974m;
import androidx.navigation.C0995q;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C0958b.C0959a;

public class NavHostFragment extends Fragment implements NavHost {

    /* renamed from: e */
    private C0974m f3675e;

    /* renamed from: f */
    private Boolean f3676f = null;

    /* renamed from: g */
    private int f3677g;

    /* renamed from: h */
    private boolean f3678h;

    /* renamed from: a */
    public static NavController m4286a(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).getNavController();
            }
            Fragment u = fragment2.getParentFragmentManager().mo4127u();
            if (u instanceof NavHostFragment) {
                return ((NavHostFragment) u).getNavController();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return C0995q.m4501a(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" does not have a NavController set");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    private int m4287b() {
        int id = getId();
        if (id == 0 || id == -1) {
            return C0961c.nav_host_fragment_container;
        }
        return id;
    }

    public final NavController getNavController() {
        C0974m mVar = this.f3675e;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f3678h) {
            C0819o b = getParentFragmentManager().mo4084b();
            b.mo4195e(this);
            b.mo4176a();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f3675e = new C0974m(requireContext());
        this.f3675e.mo4636a((LifecycleOwner) this);
        this.f3675e.mo4635a(requireActivity().getOnBackPressedDispatcher());
        C0974m mVar = this.f3675e;
        Boolean bool = this.f3676f;
        int i = 0;
        mVar.mo4640a(bool != null && bool.booleanValue());
        Bundle bundle3 = null;
        this.f3676f = null;
        this.f3675e.mo4637a(getViewModelStore());
        mo4700a((NavController) this.f3675e);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f3678h = true;
                C0819o b = getParentFragmentManager().mo4084b();
                b.mo4195e(this);
                b.mo4176a();
            }
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f3675e.mo4634a(bundle2);
        }
        int i2 = this.f3677g;
        if (i2 != 0) {
            this.f3675e.mo4644b(i2);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("android-support-nav:fragment:graphId");
        }
        if (arguments != null) {
            bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
        }
        if (i != 0) {
            this.f3675e.mo4631a(i, bundle3);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(m4287b());
        return fragmentContainerView;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0962d.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(C0962d.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f3677g = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0962d.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(C0962d.NavHostFragment_defaultNavHost, false)) {
            this.f3678h = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
        C0974m mVar = this.f3675e;
        if (mVar != null) {
            mVar.mo4640a(z);
        } else {
            this.f3676f = Boolean.valueOf(z);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle e = this.f3675e.mo4648e();
        if (e != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", e);
        }
        if (this.f3678h) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            C0995q.m4502a(view, this.f3675e);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                if (view2.getId() == getId()) {
                    C0995q.m4502a(view2, this.f3675e);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("created host view ");
        sb.append(view);
        sb.append(" is not a ViewGroup");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4700a(NavController navController) {
        navController.mo4646c().mo4796a((Navigator<? extends C0969j>) new DialogFragmentNavigator<Object>(requireContext(), getChildFragmentManager()));
        navController.mo4646c().mo4796a(mo4699a());
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public Navigator<? extends C0959a> mo4699a() {
        return new C0958b(requireContext(), getChildFragmentManager(), m4287b());
    }
}
