package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import com.zendesk.logger.Logger;
import java.util.List;
import java.util.Map;
import p333g.p384h.p385a.C12135e;
import p333g.p384h.p385a.C12140j;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestActivity;

public final class CreateRequestActionHandler implements ActionHandler {
    private final Context context;

    CreateRequestActionHandler(Context context2) {
        this.context = context2;
    }

    private static boolean isInitialized() {
        if (Support.INSTANCE.isInitialized() && Zendesk.INSTANCE.isInitialized()) {
            return true;
        }
        Logger.m31614d("CreateRequestActionHandler", "Support SDK contact handler returning false because Support.init(..) or Zendesk.init(..) has not been called!", new Object[0]);
        return false;
    }

    public boolean canHandle(String str) {
        return isInitialized() && "action_contact_option".equals(str);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"RestrictedApi"})
    public List<UiConfig> extractConfigs(Map<String, Object> map) {
        UiConfig a = C13561l.m35894a(map, UiConfig.class);
        if (a != null) {
            return a.getUiConfigs();
        }
        return null;
    }

    public ActionDescription getActionDescription() {
        String string = this.context.getString(C12140j.zs_request_contact_option_leave_a_message);
        return new ActionDescription(string, string, C12135e.zs_contact_leave_message);
    }

    public int getPriority() {
        return 0;
    }

    @SuppressLint({"RestrictedApi"})
    public void handle(Map<String, Object> map, Context context2) {
        if (isInitialized()) {
            List extractConfigs = extractConfigs(map);
            if (extractConfigs != null) {
                RequestActivity.builder().show(context2, extractConfigs);
            } else {
                RequestActivity.builder().show(context2, new UiConfig[0]);
            }
        }
    }
}
