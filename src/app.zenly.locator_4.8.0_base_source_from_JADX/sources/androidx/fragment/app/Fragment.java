package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.C0642d;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.C0874n;
import androidx.lifecycle.C0886s;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.C1161a;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    static final int ACTIVITY_CREATED = 2;
    static final int ATTACHED = 0;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    C0778d mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    private Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C0808g<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0869k mLifecycleRegistry;
    C0864b mMaxState;
    boolean mMenuVisible;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1161a mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C0840s mViewLifecycleOwner;
    C0874n<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C0774a();

        /* renamed from: e */
        final Bundle f3149e;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        static class C0774a implements ClassLoaderCreator<SavedState> {
            C0774a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        SavedState(Bundle bundle) {
            this.f3149e = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3149e);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f3149e = parcel.readBundle();
            if (classLoader != null) {
                Bundle bundle = this.f3149e;
                if (bundle != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0775a implements Runnable {
        C0775a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0776b implements Runnable {
        C0776b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0777c extends C0805d {
        C0777c() {
        }

        /* renamed from: a */
        public View mo3993a(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" does not have a view");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public boolean mo3994a() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    static class C0778d {

        /* renamed from: a */
        View f3153a;

        /* renamed from: b */
        Animator f3154b;

        /* renamed from: c */
        int f3155c;

        /* renamed from: d */
        int f3156d;

        /* renamed from: e */
        int f3157e;

        /* renamed from: f */
        Object f3158f = null;

        /* renamed from: g */
        Object f3159g;

        /* renamed from: h */
        Object f3160h;

        /* renamed from: i */
        Object f3161i;

        /* renamed from: j */
        Object f3162j;

        /* renamed from: k */
        Object f3163k;

        /* renamed from: l */
        Boolean f3164l;

        /* renamed from: m */
        Boolean f3165m;

        /* renamed from: n */
        SharedElementCallback f3166n;

        /* renamed from: o */
        SharedElementCallback f3167o;

        /* renamed from: p */
        boolean f3168p;

        /* renamed from: q */
        C0779e f3169q;

        /* renamed from: r */
        boolean f3170r;

        C0778d() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f3159g = obj;
            this.f3160h = null;
            this.f3161i = obj;
            this.f3162j = null;
            this.f3163k = obj;
            this.f3166n = null;
            this.f3167o = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    interface C0779e {
        /* renamed from: a */
        void mo3995a();

        /* renamed from: b */
        void mo3996b();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0812j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C0775a();
        this.mMaxState = C0864b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C0874n<>();
        initLifecycle();
    }

    private C0778d ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0778d();
        }
        return this.mAnimationInfo;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0869k(this);
        this.mSavedStateRegistryController = C1161a.m5683a((SavedStateRegistryOwner) this);
        if (VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.mo4446a((LifecycleObserver) new LifecycleEventObserver() {
                public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
                    if (aVar == C0863a.ON_STOP) {
                        View view = Fragment.this.mView;
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* access modifiers changed from: 0000 */
    public void callStartTransitionListener() {
        C0778d dVar = this.mAnimationInfo;
        C0779e eVar = null;
        if (dVar != null) {
            dVar.f3168p = false;
            C0779e eVar2 = dVar.f3169q;
            dVar.f3169q = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.mo3996b();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            LoaderManager.m4103a(this).mo4505a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        FragmentManager fragmentManager = this.mChildFragmentManager;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        fragmentManager.mo4078a(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.mo4092c(str);
    }

    public final FragmentActivity getActivity() {
        C0808g<?> gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return (FragmentActivity) gVar.mo4248b();
    }

    public boolean getAllowEnterTransitionOverlap() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar != null) {
            Boolean bool = dVar.f3165m;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar != null) {
            Boolean bool = dVar.f3164l;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public View getAnimatingAway() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3153a;
    }

    /* access modifiers changed from: 0000 */
    public Animator getAnimator() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3154b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public Context getContext() {
        C0808g<?> gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return gVar.mo4249c();
    }

    public Factory getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C0886s(requireActivity().getApplication(), this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Object getEnterTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3158f;
    }

    /* access modifiers changed from: 0000 */
    public SharedElementCallback getEnterTransitionCallback() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3166n;
    }

    public Object getExitTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3160h;
    }

    /* access modifiers changed from: 0000 */
    public SharedElementCallback getExitTransitionCallback() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3167o;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C0808g<?> gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return gVar.mo4036e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public C0862g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.m4103a(this);
    }

    /* access modifiers changed from: 0000 */
    public int getNextAnim() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3156d;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3157e;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public Object getReenterTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3161i;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3159g;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getEnterTransition();
        }
        return obj;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo5831a();
    }

    public Object getSharedElementEnterTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f3162j;
    }

    public Object getSharedElementReturnTransition() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3163k;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    public int getStateAfterAnimating() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3155c;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            String str = this.mTargetWho;
            if (str != null) {
                return fragmentManager.mo4060a(str);
            }
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C0840s sVar = this.mViewLifecycleOwner;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C0891w getViewModelStore() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager.mo4098e(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0812j();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHideReplaced() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.f3170r;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPostponed() {
        C0778d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.f3168p;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo4130x();
    }

    public final boolean isVisible() {
        if (isAdded() && !isHidden()) {
            View view = this.mView;
            if (!(view == null || view.getWindowToken() == null || this.mView.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo4131y();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C0808g<?> gVar = this.mHost;
        Activity b = gVar == null ? null : gVar.mo4248b();
        if (b != null) {
            this.mCalled = false;
            onAttach(b);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo4089b(1)) {
            this.mChildFragmentManager.mo4099e();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C0808g<?> gVar = this.mHost;
        Activity b = gVar == null ? null : gVar.mo4248b();
        if (b != null) {
            this.mCalled = false;
            onInflate(b, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: 0000 */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo4131y();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.mo4096d();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C0841t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performAttach() {
        this.mChildFragmentManager.mo4076a(this.mHost, (C0805d) new C0777c(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.mo4249c());
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new C0841t(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.mo4063a(configuration);
    }

    /* access modifiers changed from: 0000 */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden || (!onContextItemSelected(menuItem) && !this.mChildFragmentManager.mo4081a(menuItem))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo4131y();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.mo5832a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4450a(C0863a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C0841t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo4080a(menu, menuInflater);
    }

    /* access modifiers changed from: 0000 */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.mo4131y();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0840s();
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4373a();
            this.mViewLifecycleOwnerLiveData.mo4395b(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo4375b()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroy() {
        this.mChildFragmentManager.mo4100f();
        this.mLifecycleRegistry.mo4450a(C0863a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new C0841t(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroyView() {
        this.mChildFragmentManager.mo4102g();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4374a(C0863a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            LoaderManager.m4103a(this).mo4504a();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C0841t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C0841t(sb.toString());
        } else if (!this.mChildFragmentManager.mo4129w()) {
            this.mChildFragmentManager.mo4100f();
            this.mChildFragmentManager = new C0812j();
        }
    }

    /* access modifiers changed from: 0000 */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.mo4104h();
    }

    /* access modifiers changed from: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.mo4079a(z);
    }

    /* access modifiers changed from: 0000 */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden || ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) && !this.mChildFragmentManager.mo4091b(menuItem))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo4066a(menu);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPause() {
        this.mChildFragmentManager.mo4106i();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4374a(C0863a.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo4450a(C0863a.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0841t(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.mo4088b(z);
    }

    /* access modifiers changed from: 0000 */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo4090b(menu);
    }

    /* access modifiers changed from: 0000 */
    public void performPrimaryNavigationFragmentChanged() {
        boolean g = this.mFragmentManager.mo4103g(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != g) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(g);
            onPrimaryNavigationFragmentChanged(g);
            this.mChildFragmentManager.mo4108j();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performResume() {
        this.mChildFragmentManager.mo4131y();
        this.mChildFragmentManager.mo4095c(true);
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4450a(C0863a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo4374a(C0863a.ON_RESUME);
            }
            this.mChildFragmentManager.mo4110k();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C0841t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo5833b(bundle);
        Parcelable A = this.mChildFragmentManager.mo4055A();
        if (A != null) {
            bundle.putParcelable("android:support:fragments", A);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performStart() {
        this.mChildFragmentManager.mo4131y();
        this.mChildFragmentManager.mo4095c(true);
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4450a(C0863a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo4374a(C0863a.ON_START);
            }
            this.mChildFragmentManager.mo4112l();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C0841t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStop() {
        this.mChildFragmentManager.mo4114m();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4374a(C0863a.ON_STOP);
        }
        this.mLifecycleRegistry.mo4450a(C0863a.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0841t(sb.toString());
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3168p = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        C0808g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo4032a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        String str = "Fragment ";
        if (getContext() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this);
        sb2.append(" is not a child Fragment, it is directly attached to ");
        sb2.append(getContext());
        throw new IllegalStateException(sb2.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.mChildFragmentManager.mo4065a(parcelable);
                this.mChildFragmentManager.mo4099e();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0841t(sb.toString());
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo4374a(C0863a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3165m = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3164l = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f3153a = view;
    }

    /* access modifiers changed from: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f3154b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f3166n = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3158f = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f3167o = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3160h = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo4038g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f3170r = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r2 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInitialSavedState(androidx.fragment.app.Fragment.SavedState r2) {
        /*
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 != 0) goto L_0x000f
            if (r2 == 0) goto L_0x000b
            android.os.Bundle r2 = r2.f3149e
            if (r2 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.mSavedFragmentState = r2
            return
        L_0x000f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setInitialSavedState(androidx.fragment.app.Fragment$SavedState):void");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo4038g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f3156d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f3157e = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnStartEnterTransitionListener(C0779e eVar) {
        ensureAnimationInfo();
        C0779e eVar2 = this.mAnimationInfo.f3169q;
        if (eVar != eVar2) {
            if (eVar == null || eVar2 == null) {
                C0778d dVar = this.mAnimationInfo;
                if (dVar.f3168p) {
                    dVar.f3169q = eVar;
                }
                if (eVar != null) {
                    eVar.mo3995a();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3161i = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.mo4085b(this);
        } else {
            fragmentManager.mo4115m(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3159g = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3162j = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3163k = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f3155c = i;
    }

    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.mo4111k(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C0808g<?> gVar = this.mHost;
        if (gVar != null) {
            return gVar.mo4034a(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        C0808g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo4031a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startPostponedEnterTransition() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || fragmentManager.f3197p == null) {
            ensureAnimationInfo().f3168p = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f3197p.mo4250d().getLooper()) {
            this.mFragmentManager.f3197p.mo4250d().postAtFrontOfQueue(new C0776b());
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) C0807f.m3788d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            throw new InstantiationException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new InstantiationException(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new InstantiationException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(sb4.toString(), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f3168p = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.f3197p.mo4250d();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0808g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo4030a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C0808g<?> gVar = this.mHost;
        if (gVar != null) {
            gVar.mo4030a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C0808g<?> gVar = this.mHost;
        if (gVar != null) {
            LayoutInflater f = gVar.mo4037f();
            C0642d.m3005b(f, this.mChildFragmentManager.mo4123r());
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
