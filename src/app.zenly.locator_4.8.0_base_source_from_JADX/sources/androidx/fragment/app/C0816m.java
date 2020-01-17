package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment.SavedState;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.ViewModelStoreOwner;
import p214e.p243k.C7640b;

/* renamed from: androidx.fragment.app.m */
class C0816m {

    /* renamed from: a */
    private final C0810i f3300a;

    /* renamed from: b */
    private final Fragment f3301b;

    /* renamed from: androidx.fragment.app.m$a */
    static /* synthetic */ class C0817a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3302a = new int[C0864b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.C0862g.C0864b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3302a = r0
                int[] r0 = f3302a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0862g.C0864b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3302a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0862g.C0864b.STARTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3302a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.C0862g.C0864b.CREATED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0816m.C0817a.<clinit>():void");
        }
    }

    C0816m(C0810i iVar, Fragment fragment) {
        this.f3300a = iVar;
        this.f3301b = fragment;
    }

    /* renamed from: o */
    private Bundle m3841o() {
        Bundle bundle = new Bundle();
        this.f3301b.performSaveInstanceState(bundle);
        this.f3300a.mo4262d(this.f3301b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3301b.mView != null) {
            mo4306l();
        }
        if (this.f3301b.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3301b.mSavedViewState);
        }
        if (!this.f3301b.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3301b.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4295a(ClassLoader classLoader) {
        Bundle bundle = this.f3301b.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3301b;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3301b;
            fragment2.mTargetWho = fragment2.mSavedFragmentState.getString("android:target_state");
            Fragment fragment3 = this.f3301b;
            if (fragment3.mTargetWho != null) {
                fragment3.mTargetRequestCode = fragment3.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f3301b;
            Boolean bool = fragment4.mSavedUserVisibleHint;
            if (bool != null) {
                fragment4.mUserVisibleHint = bool.booleanValue();
                this.f3301b.mSavedUserVisibleHint = null;
            } else {
                fragment4.mUserVisibleHint = fragment4.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f3301b;
            if (!fragment5.mUserVisibleHint) {
                fragment5.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4296b() {
        int i = 4;
        if (!this.f3301b.mAdded) {
            i = Math.min(4, 1);
        }
        Fragment fragment = this.f3301b;
        if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        Fragment fragment2 = this.f3301b;
        if (fragment2.mDeferStart && fragment2.mState < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C0817a.f3302a[this.f3301b.mMaxState.ordinal()];
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return Math.min(i, 3);
        }
        if (i2 != 3) {
            return Math.min(i, -1);
        }
        return Math.min(i, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4297c() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f3301b;
        if (!fragment.mIsCreated) {
            this.f3300a.mo4260c(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f3301b;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C0810i iVar = this.f3300a;
            Fragment fragment3 = this.f3301b;
            iVar.mo4258b(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f3301b.mState = 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4298d() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f3301b.performDetach();
        this.f3300a.mo4259b(this.f3301b, false);
        Fragment fragment = this.f3301b;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4299e() {
        Fragment fragment = this.f3301b;
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m3606d(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f3301b);
                Log.d("FragmentManager", sb.toString());
            }
            Fragment fragment2 = this.f3301b;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3301b.mSavedFragmentState);
            View view = this.f3301b.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3301b;
                if (fragment3.mHidden) {
                    fragment3.mView.setVisibility(8);
                }
                Fragment fragment4 = this.f3301b;
                fragment4.onViewCreated(fragment4.mView, fragment4.mSavedFragmentState);
                C0810i iVar = this.f3300a;
                Fragment fragment5 = this.f3301b;
                iVar.mo4255a(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Fragment mo4300f() {
        return this.f3301b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4301g() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f3301b.performPause();
        this.f3300a.mo4261c(this.f3301b, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4302h() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f3301b;
        if (fragment.mView != null) {
            fragment.restoreViewState(fragment.mSavedFragmentState);
        }
        this.f3301b.mSavedFragmentState = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4303i() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f3301b.performResume();
        this.f3300a.mo4263d(this.f3301b, false);
        Fragment fragment = this.f3301b;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public SavedState mo4304j() {
        if (this.f3301b.mState <= -1) {
            return null;
        }
        Bundle o = m3841o();
        if (o != null) {
            return new SavedState(o);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public FragmentState mo4305k() {
        FragmentState fragmentState = new FragmentState(this.f3301b);
        if (this.f3301b.mState <= -1 || fragmentState.f3239q != null) {
            fragmentState.f3239q = this.f3301b.mSavedFragmentState;
        } else {
            fragmentState.f3239q = m3841o();
            if (this.f3301b.mTargetWho != null) {
                if (fragmentState.f3239q == null) {
                    fragmentState.f3239q = new Bundle();
                }
                fragmentState.f3239q.putString("android:target_state", this.f3301b.mTargetWho);
                int i = this.f3301b.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f3239q.putInt("android:target_req_state", i);
                }
            }
        }
        return fragmentState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4306l() {
        if (this.f3301b.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3301b.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3301b.mSavedViewState = sparseArray;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4307m() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f3301b.performStart();
        this.f3300a.mo4264e(this.f3301b, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo4308n() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f3301b.performStop();
        this.f3300a.mo4265f(this.f3301b, false);
    }

    C0816m(C0810i iVar, ClassLoader classLoader, C0807f fVar, FragmentState fragmentState) {
        this.f3300a = iVar;
        this.f3301b = fVar.mo4142a(classLoader, fragmentState.f3227e);
        Bundle bundle = fragmentState.f3236n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f3301b.setArguments(fragmentState.f3236n);
        Fragment fragment = this.f3301b;
        fragment.mWho = fragmentState.f3228f;
        fragment.mFromLayout = fragmentState.f3229g;
        fragment.mRestored = true;
        fragment.mFragmentId = fragmentState.f3230h;
        fragment.mContainerId = fragmentState.f3231i;
        fragment.mTag = fragmentState.f3232j;
        fragment.mRetainInstance = fragmentState.f3233k;
        fragment.mRemoving = fragmentState.f3234l;
        fragment.mDetached = fragmentState.f3235m;
        fragment.mHidden = fragmentState.f3237o;
        fragment.mMaxState = C0864b.values()[fragmentState.f3238p];
        Bundle bundle2 = fragmentState.f3239q;
        if (bundle2 != null) {
            this.f3301b.mSavedFragmentState = bundle2;
        } else {
            this.f3301b.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(this.f3301b);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4293a(C0808g<?> gVar, FragmentManager fragmentManager, Fragment fragment) {
        Fragment fragment2 = this.f3301b;
        fragment2.mHost = gVar;
        fragment2.mParentFragment = fragment;
        fragment2.mFragmentManager = fragmentManager;
        this.f3300a.mo4257b(fragment2, gVar.mo4249c(), false);
        this.f3301b.performAttach();
        Fragment fragment3 = this.f3301b;
        Fragment fragment4 = fragment3.mParentFragment;
        if (fragment4 == null) {
            gVar.mo4029a(fragment3);
        } else {
            fragment4.onAttachFragment(fragment3);
        }
        this.f3300a.mo4253a(this.f3301b, gVar.mo4249c(), false);
    }

    C0816m(C0810i iVar, Fragment fragment, FragmentState fragmentState) {
        this.f3300a = iVar;
        this.f3301b = fragment;
        Fragment fragment2 = this.f3301b;
        fragment2.mSavedViewState = null;
        fragment2.mBackStackNesting = 0;
        fragment2.mInLayout = false;
        fragment2.mAdded = false;
        Fragment fragment3 = fragment2.mTarget;
        fragment2.mTargetWho = fragment3 != null ? fragment3.mWho : null;
        Fragment fragment4 = this.f3301b;
        fragment4.mTarget = null;
        Bundle bundle = fragmentState.f3239q;
        if (bundle != null) {
            fragment4.mSavedFragmentState = bundle;
        } else {
            fragment4.mSavedFragmentState = new Bundle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4292a(C0805d dVar) {
        String str;
        if (!this.f3301b.mFromLayout) {
            if (FragmentManager.m3606d(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f3301b);
                Log.d("FragmentManager", sb.toString());
            }
            ViewGroup viewGroup = null;
            Fragment fragment = this.f3301b;
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) dVar.mo3993a(i);
                        if (viewGroup == null) {
                            Fragment fragment2 = this.f3301b;
                            if (!fragment2.mRestored) {
                                try {
                                    str = fragment2.getResources().getResourceName(this.f3301b.mContainerId);
                                } catch (NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("No view found for id 0x");
                                sb2.append(Integer.toHexString(this.f3301b.mContainerId));
                                sb2.append(" (");
                                sb2.append(str);
                                sb2.append(") for fragment ");
                                sb2.append(this.f3301b);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Cannot create fragment ");
                        sb3.append(this.f3301b);
                        sb3.append(" for a container view with no id");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
            Fragment fragment3 = this.f3301b;
            fragment3.mContainer = viewGroup;
            fragment3.performCreateView(fragment3.performGetLayoutInflater(fragment3.mSavedFragmentState), viewGroup, this.f3301b.mSavedFragmentState);
            View view = this.f3301b.mView;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment4 = this.f3301b;
                fragment4.mView.setTag(C7640b.fragment_container_view_tag, fragment4);
                if (viewGroup != null) {
                    viewGroup.addView(this.f3301b.mView);
                }
                Fragment fragment5 = this.f3301b;
                if (fragment5.mHidden) {
                    fragment5.mView.setVisibility(8);
                }
                ViewCompat.m2809I(this.f3301b.mView);
                Fragment fragment6 = this.f3301b;
                fragment6.onViewCreated(fragment6.mView, fragment6.mSavedFragmentState);
                C0810i iVar = this.f3300a;
                Fragment fragment7 = this.f3301b;
                iVar.mo4255a(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                Fragment fragment8 = this.f3301b;
                if (fragment8.mView.getVisibility() == 0 && this.f3301b.mContainer != null) {
                    z = true;
                }
                fragment8.mIsNewlyAdded = z;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4291a() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f3301b;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0810i iVar = this.f3300a;
        Fragment fragment2 = this.f3301b;
        iVar.mo4254a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4294a(C0808g<?> gVar, C0813k kVar) {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f3301b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f3301b;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || kVar.mo4277f(this.f3301b)) {
            if (gVar instanceof ViewModelStoreOwner) {
                z = kVar.mo4274d();
            } else if (gVar.mo4249c() instanceof Activity) {
                z = true ^ ((Activity) gVar.mo4249c()).isChangingConfigurations();
            }
            if (z2 || z) {
                kVar.mo4270b(this.f3301b);
            }
            this.f3301b.performDestroy();
            this.f3300a.mo4256a(this.f3301b, false);
            return;
        }
        this.f3301b.mState = 0;
    }
}
