package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompat.PermissionCompatDelegate;
import androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p214e.p228e.C7585h;

public class FragmentActivity extends ComponentActivity implements OnRequestPermissionsResultCallback, RequestPermissionsRequestCodeValidator {
    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final C0869k mFragmentLifecycleRegistry = new C0869k(this);
    final C0806e mFragments = C0806e.m3761a((C0808g<?>) new C0780a<Object>());
    int mNextCandidateRequestIndex;
    C7585h<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    class C0780a extends C0808g<FragmentActivity> implements ViewModelStoreOwner, OnBackPressedDispatcherOwner {
        public C0780a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public void mo4033a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        public boolean mo4035b(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: f */
        public LayoutInflater mo4037f() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: g */
        public void mo4038g() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        public C0862g getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public C0891w getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        /* renamed from: a */
        public void mo4030a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: e */
        public FragmentActivity m3580e() {
            return FragmentActivity.this;
        }

        /* renamed from: a */
        public void mo4031a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo4032a(Fragment fragment, String[] strArr, int i) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public boolean mo4034a(String str) {
            return ActivityCompat.m2351a((Activity) FragmentActivity.this, str);
        }

        /* renamed from: a */
        public void mo4029a(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        /* renamed from: a */
        public View mo3993a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo3994a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public FragmentActivity() {
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo19615a() < MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            while (this.mPendingFragmentActivityResults.mo19619b(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo19622c(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C0864b.CREATED));
    }

    private static boolean markState(FragmentManager fragmentManager, C0864b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.mo4122q()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo4445a().mo4448a(C0864b.STARTED)) {
                    fragment.mLifecycleRegistry.mo4451a(bVar);
                    z = true;
                }
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), bVar);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo4224a(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            LoaderManager.m4103a(this).mo4505a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo4245j().mo4078a(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.mo4245j();
    }

    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.m4103a(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo4246k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo19617a(i4);
            this.mPendingFragmentActivityResults.mo19625d(i4);
            String str2 = TAG;
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.mFragments.mo4225a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.onActivityResult(i & 65535, i2, intent);
            }
            return;
        }
        PermissionCompatDelegate a2 = ActivityCompat.m2345a();
        if (a2 == null || !a2.onActivityResult(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo4246k();
        this.mFragments.mo4227a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mFragments.mo4230a((Fragment) null);
        if (bundle != null) {
            this.mFragments.mo4228a(bundle.getParcelable(FRAGMENTS_TAG));
            String str = NEXT_CANDIDATE_REQUEST_INDEX_TAG;
            if (bundle.containsKey(str)) {
                this.mNextCandidateRequestIndex = bundle.getInt(str);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new C7585h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo19622c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C7585h<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_CREATE);
        this.mFragments.mo4234b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo4232a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo4238c();
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo4239d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo4237b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo4233a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo4231a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo4246k();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.mo4229a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo4240e();
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo4235b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.mo4236b(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo4246k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo19617a(i3);
            this.mPendingFragmentActivityResults.mo19625d(i3);
            String str2 = TAG;
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.mFragments.mo4225a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo4246k();
        this.mFragments.mo4244i();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_RESUME);
        this.mFragments.mo4241f();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_STOP);
        Parcelable l = this.mFragments.mo4247l();
        if (l != null) {
            bundle.putParcelable(FRAGMENTS_TAG, l);
        }
        if (this.mPendingFragmentActivityResults.mo19615a() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo19615a()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo19615a()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo19615a(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo19621c(i);
                strArr[i] = (String) this.mPendingFragmentActivityResults.mo19627f(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo4226a();
        }
        this.mFragments.mo4246k();
        this.mFragments.mo4244i();
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_START);
        this.mFragments.mo4242g();
    }

    public void onStateNotSaved() {
        this.mFragments.mo4246k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo4243h();
        this.mFragmentLifecycleRegistry.mo4450a(C0863a.ON_STOP);
    }

    /* access modifiers changed from: 0000 */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            ActivityCompat.m2350a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            ActivityCompat.m2350a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.m2349a((Activity) this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.m2353b(this, sharedElementCallback);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                ActivityCompat.m2348a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            ActivityCompat.m2348a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.m2352b(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.m2355d(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.m2357f(this);
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                ActivityCompat.m2347a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            ActivityCompat.m2347a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public FragmentActivity(int i) {
        super(i);
    }
}
