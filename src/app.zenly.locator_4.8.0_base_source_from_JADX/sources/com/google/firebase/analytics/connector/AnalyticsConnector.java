package com.google.firebase.analytics.connector;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AnalyticsConnector {

    public interface AnalyticsConnectorHandle {
        void registerEventNames(Set<String> set);

        void unregister();

        void unregisterEventNames();
    }

    public interface AnalyticsConnectorListener {
        void onMessageTriggered(int i, Bundle bundle);
    }

    /* renamed from: com.google.firebase.analytics.connector.AnalyticsConnector$a */
    public static class C11020a {
    }

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    List<C11020a> getConditionalUserProperties(String str, String str2);

    int getMaxUserProperties(String str);

    Map<String, Object> getUserProperties(boolean z);

    void logEvent(String str, String str2, Bundle bundle);

    AnalyticsConnectorHandle registerAnalyticsConnectorListener(String str, AnalyticsConnectorListener analyticsConnectorListener);

    void setConditionalUserProperty(C11020a aVar);

    void setUserProperty(String str, String str2, Object obj);
}
