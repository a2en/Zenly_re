package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

public class ZendeskDeepLinkHelper {
    private final ZendeskDeepLinkParser parser;
    private final ActionHandlerRegistry registry;

    ZendeskDeepLinkHelper(ActionHandlerRegistry actionHandlerRegistry, ZendeskDeepLinkParser zendeskDeepLinkParser) {
        this.registry = actionHandlerRegistry;
        this.parser = zendeskDeepLinkParser;
    }

    /* access modifiers changed from: 0000 */
    public void deepLinkToRequest(Intent intent, Context context, List<Intent> list) {
        ActionHandler handlerByAction = this.registry.handlerByAction("request_view_conversation");
        if (handlerByAction != null) {
            handlerByAction.handle(DeepLinkToRequestActionHandler.data(intent, list), context);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public boolean launch(String str, UiConfig uiConfig, Context context) {
        ActionPayload parse = this.parser.parse(str);
        if (parse.isValid()) {
            ActionHandler handlerByAction = this.registry.handlerByAction(parse.getAction());
            if (handlerByAction != null) {
                Map payload = parse.getPayload();
                C13561l.m35897a(payload, uiConfig);
                handlerByAction.handle(payload, context);
                return true;
            }
        }
        return false;
    }
}
