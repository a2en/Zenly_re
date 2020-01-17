package zendesk.support;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zendesk.logger.Logger;

public class DeepLinkingBroadcastReceiver extends BroadcastReceiver {
    ZendeskDeepLinkHelper deepLinkHelper;

    public void onReceive(Context context, Intent intent) {
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.m31610b("DeepLinkingBroadcastReceiver", "Cannot use Support SDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...) and Support.INSTANCE.init(Zendesk)", new Object[0]);
            return;
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
        this.deepLinkHelper.deepLinkToRequest((Intent) intent.getParcelableExtra("extra_request_intent"), context, intent.getParcelableArrayListExtra("extra_follow_up_activities"));
    }
}
