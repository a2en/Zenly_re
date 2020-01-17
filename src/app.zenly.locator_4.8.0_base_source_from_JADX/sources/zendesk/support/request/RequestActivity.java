package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
import com.google.android.material.snackbar.Snackbar.SnackbarLayout;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import java.util.Map;
import p333g.p384h.p385a.C12136f;
import p333g.p384h.p385a.C12138h;
import p333g.p384h.p385a.C12140j;
import p333g.p384h.p385a.C12141k;
import zendesk.belvedere.BelvedereUi;
import zendesk.commonui.C13561l;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.suas.C13605d;
import zendesk.suas.C13622i;
import zendesk.suas.Listener;
import zendesk.suas.StateSelector;
import zendesk.suas.Store;
import zendesk.suas.Subscription;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.request.RequestUiConfig.Builder;

public class RequestActivity extends AppCompatActivity {
    private RequestAccessibilityHerald accessibilityHerald;
    ActionHandlerRegistry actionHandlerRegistry;

    /* renamed from: af */
    ActionFactory f35237af;
    HeadlessComponentListener headlessComponentListener;
    Picasso picasso;
    private RefreshRequestActionHandler refreshActionHandler;
    private RequestComponent requestComponent;
    private ComponentRequestRouter requestRouter;
    Store store;
    private Subscription subscription;

    static class MoveUpWithSnackbarBehaviour extends ScrollingViewBehavior {
        MoveUpWithSnackbarBehaviour() {
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return super.layoutDependsOn(coordinatorLayout, view, view2) || (view2 instanceof SnackbarLayout);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!(view2 instanceof SnackbarLayout)) {
                return onDependentViewChanged;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) Math.abs(Math.min(0.0f, view2.getTranslationY() - ((float) view2.getHeight()))));
            return true;
        }
    }

    private final class RefreshRequestActionHandler implements ActionHandler {
        private final String requestId;

        RefreshRequestActionHandler(String str) {
            this.requestId = str;
        }

        public boolean canHandle(String str) {
            return str.contains("request_conversation_refresh") && str.contains(this.requestId);
        }

        public ActionDescription getActionDescription() {
            return null;
        }

        public int getPriority() {
            return 0;
        }

        public void handle(Map<String, Object> map, Context context) {
            RequestActivity requestActivity = RequestActivity.this;
            requestActivity.store.dispatch(requestActivity.f35237af.updateCommentsAsync());
        }
    }

    private Subscription bindComponents(boolean z) {
        ComponentToolbar bindToolbar = bindToolbar();
        ComponentError create = ComponentError.create(this, this.store, this.f35237af);
        this.requestRouter = ComponentRequestRouter.create(this, z, this.requestComponent);
        this.accessibilityHerald = RequestAccessibilityHerald.create(this);
        return C13605d.m35914a(this.store.addListener((StateSelector<E>) bindToolbar.getToolbarSelector(), (Listener<E>) bindToolbar), this.store.addListener(this.requestRouter.getSelector(), (Listener<E>) this.requestRouter), this.store.addListener(ComponentError.getSelector(), (Listener<E>) create), this.store.addActionListener(this.accessibilityHerald));
    }

    @SuppressLint({"PrivateResource"})
    private ComponentToolbar bindToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(C12136f.activity_request_toolbar);
        ViewAlmostRealProgressBar viewAlmostRealProgressBar = (ViewAlmostRealProgressBar) findViewById(C12136f.activity_request_progressbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                RequestActivity.this.onBackPressed();
            }
        });
        if (VERSION.SDK_INT >= 21) {
            findViewById(C12136f.activity_request_compat_toolbar_shadow).setVisibility(8);
        }
        return new ComponentToolbar(this.picasso, toolbar, viewAlmostRealProgressBar);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initViews() {
        ((C0489d) findViewById(C12136f.activity_request_root).getLayoutParams()).mo2892a((Behavior) new MoveUpWithSnackbarBehaviour());
    }

    private boolean initializeStoreAndDependencies(Bundle bundle, RequestUiConfig requestUiConfig) {
        if (!injectDependencies(requestUiConfig)) {
            C13622i restoreState = restoreState(bundle);
            if (restoreState == null) {
                return true;
            }
            this.store.reset(restoreState);
        }
        return false;
    }

    private boolean injectDependencies(RequestUiConfig requestUiConfig) {
        boolean z;
        this.requestComponent = (RequestComponent) HeadlessFragment.getData(getSupportFragmentManager());
        if (this.requestComponent == null) {
            z = false;
            this.requestComponent = SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestModule(requestUiConfig));
            HeadlessFragment.install(getSupportFragmentManager(), this.requestComponent);
        } else {
            z = true;
        }
        this.requestComponent.inject(this);
        return z;
    }

    private C13622i restoreState(Bundle bundle) {
        if (bundle != null) {
            String str = "saved_state";
            if (bundle.containsKey(str)) {
                return (C13622i) bundle.getSerializable(str);
            }
        }
        return null;
    }

    public void onBackPressed() {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen == null || !currentScreen.hasUnsavedInput()) {
            super.onBackPressed();
            return;
        }
        C0123a aVar = new C0123a(this);
        aVar.mo548c(C12140j.request_dialog_title_unsaved_changes);
        aVar.mo544b(C12140j.request_dialog_body_unsaved_changes);
        aVar.mo549c(C12140j.request_dialog_button_label_delete, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RequestActivity.super.onBackPressed();
            }
        });
        aVar.mo545b(C12140j.request_dialog_button_label_cancel, new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        aVar.mo550c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(C12141k.ZendeskActivityDefaultTheme, true);
        setContentView(C12138h.zs_activity_request);
        BelvedereUi.m35621a((AppCompatActivity) this);
        initViews();
        String str = "RequestActivity";
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.m31610b(str, "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Support.INSTANCE.init(...) was called ", new Object[0]);
            finish();
            return;
        }
        RequestUiConfig requestUiConfig = (RequestUiConfig) C13561l.m35892a(getIntent().getExtras(), RequestUiConfig.class);
        if (requestUiConfig == null) {
            Logger.m31610b(str, "No configuration found. Please use RequestActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.refreshActionHandler = new RefreshRequestActionHandler(requestUiConfig.getRequestId());
        boolean initializeStoreAndDependencies = initializeStoreAndDependencies(bundle, requestUiConfig);
        if (initializeStoreAndDependencies) {
            this.headlessComponentListener.startListening(this.store);
            this.store.dispatch(this.f35237af.installStartConfigAsync(requestUiConfig));
            this.store.dispatch(this.f35237af.loadSettingsAsync());
        }
        this.subscription = bindComponents(initializeStoreAndDependencies);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        return currentScreen != null && currentScreen.inflateMenu(getMenuInflater(), menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null) {
            return currentScreen.onOptionsItemClicked(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Store store2 = this.store;
        if (store2 != null) {
            store2.dispatch(this.f35237af.androidOnPause());
        }
        Subscription subscription2 = this.subscription;
        if (subscription2 != null) {
            subscription2.removeListener();
        }
        ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
        if (actionHandlerRegistry2 != null) {
            actionHandlerRegistry2.remove(this.refreshActionHandler);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.store.dispatch(this.f35237af.androidOnResume());
        this.subscription.addListener();
        this.subscription.informWithCurrentState();
        this.actionHandlerRegistry.add(this.refreshActionHandler);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("saved_state", this.store.getState());
        super.onSaveInstanceState(bundle);
    }
}
