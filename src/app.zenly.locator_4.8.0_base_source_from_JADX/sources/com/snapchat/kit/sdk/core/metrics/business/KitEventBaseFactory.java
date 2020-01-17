package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.model.KitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.networking.C11803b;
import java.util.Locale;

public class KitEventBaseFactory {

    /* renamed from: a */
    private final String f30538a;

    KitEventBaseFactory(String str) {
        this.f30538a = str;
    }

    /* renamed from: a */
    private static String m30945a() {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return "";
        }
        return locale.toString();
    }

    public KitEventBase createKitEventBase(KitType kitType, String str) {
        return new Builder().kit_variant(kitType).kit_variant_version(str).oauth_client_id(this.f30538a).kit_user_agent(C11803b.f30574a).locale(m30945a()).kit_client_timestamp_millis(Long.valueOf(System.currentTimeMillis())).build();
    }
}
