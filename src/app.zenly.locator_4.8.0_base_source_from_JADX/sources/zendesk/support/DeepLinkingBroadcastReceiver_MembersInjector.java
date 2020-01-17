package zendesk.support;

import dagger.MembersInjector;

public final class DeepLinkingBroadcastReceiver_MembersInjector implements MembersInjector<DeepLinkingBroadcastReceiver> {
    public static void injectDeepLinkHelper(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver, ZendeskDeepLinkHelper zendeskDeepLinkHelper) {
        deepLinkingBroadcastReceiver.deepLinkHelper = zendeskDeepLinkHelper;
    }
}
