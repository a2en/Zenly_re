package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.SDKStartUpProvider;
import zendesk.core.Zendesk;

@SuppressLint({"RestrictedApi"})
public final class SupportSdkStartupProvider extends SDKStartUpProvider {
    private CreateRequestActionHandler actionHandler;

    /* access modifiers changed from: protected */
    public void onStartUp(Context context) {
        ActionHandlerRegistry actionHandlerRegistry = Zendesk.INSTANCE.actionHandlerRegistry();
        CreateRequestActionHandler createRequestActionHandler = this.actionHandler;
        if (createRequestActionHandler != null) {
            actionHandlerRegistry.remove(createRequestActionHandler);
        }
        this.actionHandler = new CreateRequestActionHandler(context);
        actionHandlerRegistry.add(this.actionHandler);
    }
}
