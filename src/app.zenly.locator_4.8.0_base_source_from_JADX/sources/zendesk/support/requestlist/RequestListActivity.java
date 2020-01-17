package zendesk.support.requestlist;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.zendesk.logger.Logger;
import p333g.p384h.p385a.C12141k;
import zendesk.commonui.C13561l;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.requestlist.RequestListUiConfig.Builder;

public class RequestListActivity extends AppCompatActivity {
    ActionHandlerRegistry actionHandlerRegistry;
    RequestListModel model;
    RequestListPresenter presenter;
    RequestListSyncHandler syncHandler;
    RequestListView view;

    public static Builder builder() {
        return new Builder();
    }

    public static void refresh(Context context, ActionHandlerRegistry actionHandlerRegistry2) {
        ActionHandler handlerByAction = actionHandlerRegistry2.handlerByAction("request_list_refresh");
        if (handlerByAction != null) {
            handlerByAction.handle(null, context);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        getTheme().applyStyle(C12141k.ZendeskActivityDefaultTheme, true);
        String str = "RequestListActivity";
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.m31610b(str, "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Support.INSTANCE.init(...) was called ", new Object[0]);
            finish();
            return;
        }
        RequestListUiConfig requestListUiConfig = (RequestListUiConfig) C13561l.m35892a(getIntent().getExtras(), RequestListUiConfig.class);
        if (requestListUiConfig == null) {
            Logger.m31610b(str, "No configuration found. Please use RequestListActivity.builder()", new Object[0]);
            finish();
            return;
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestListModule(this, requestListUiConfig)).inject(this);
        setContentView((View) this.view);
        RequestListPresenter requestListPresenter = this.presenter;
        if (bundle != null) {
            z = false;
        }
        requestListPresenter.onCreate(z);
        this.actionHandlerRegistry.add(this.syncHandler);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        ActionHandlerRegistry actionHandlerRegistry2 = this.actionHandlerRegistry;
        if (actionHandlerRegistry2 != null) {
            actionHandlerRegistry2.remove(this.syncHandler);
        }
        RequestListPresenter requestListPresenter = this.presenter;
        if (requestListPresenter != null) {
            requestListPresenter.onDestroy(isChangingConfigurations());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.syncHandler.setRunning(false);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.syncHandler.setRunning(true);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.view.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.view.onStop();
    }
}
