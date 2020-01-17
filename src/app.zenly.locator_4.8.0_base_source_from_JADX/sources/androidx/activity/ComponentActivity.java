package androidx.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.C0881q;
import androidx.lifecycle.C0886s;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.C1161a;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner {
    private int mContentLayoutId;
    private Factory mDefaultFactory;
    private final C0869k mLifecycleRegistry;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final C1161a mSavedStateRegistryController;
    private C0891w mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0084a implements Runnable {
        C0084a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0085b {

        /* renamed from: a */
        Object f130a;

        /* renamed from: b */
        C0891w f131b;

        C0085b() {
        }
    }

    public ComponentActivity() {
        this.mLifecycleRegistry = new C0869k(this);
        this.mSavedStateRegistryController = C1161a.m5683a((SavedStateRegistryOwner) this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0084a());
        if (getLifecycle() != null) {
            if (VERSION.SDK_INT >= 19) {
                getLifecycle().mo4446a(new LifecycleEventObserver() {
                    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
                        if (aVar == C0863a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().mo4446a(new LifecycleEventObserver() {
                public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
                    if (aVar == C0863a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().mo4501a();
                    }
                }
            });
            int i = VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().mo4446a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public Factory getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C0886s(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0085b bVar = (C0085b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f130a;
        }
        return null;
    }

    public C0862g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo5831a();
    }

    public C0891w getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0085b bVar = (C0085b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f131b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C0891w();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo282a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.mo5832a(bundle);
        C0881q.m4076b((Activity) this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0891w wVar = this.mViewModelStore;
        if (wVar == null) {
            C0085b bVar = (C0085b) getLastNonConfigurationInstance();
            if (bVar != null) {
                wVar = bVar.f131b;
            }
        }
        if (wVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0085b bVar2 = new C0085b();
        bVar2.f130a = onRetainCustomNonConfigurationInstance;
        bVar2.f131b = wVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0862g lifecycle = getLifecycle();
        if (lifecycle instanceof C0869k) {
            ((C0869k) lifecycle).mo4451a(C0864b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo5833b(bundle);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
