package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.e */
public class C11791e {

    /* renamed from: a */
    private final KitEventBaseFactory f30552a;

    C11791e(KitEventBaseFactory kitEventBaseFactory) {
        this.f30552a = kitEventBaseFactory;
    }

    /* renamed from: b */
    private LoginKitEventBase m30953b() {
        return new Builder().kit_event_base(this.f30552a.createKitEventBase(KitType.LOGIN_KIT, "1.1.4")).build();
    }

    /* renamed from: a */
    public ServerEvent mo34660a() {
        return m30952a(new ServerEventData.Builder().login_kit_auth_start(new LoginKitAuthStart.Builder().log_kit_event_base(m30953b()).build()).build());
    }

    /* renamed from: a */
    public ServerEvent mo34661a(boolean z) {
        return m30952a(new ServerEventData.Builder().login_kit_auth_complete(new LoginKitAuthComplete.Builder().log_kit_event_base(m30953b()).is_success(Boolean.valueOf(z)).build()).build());
    }

    /* renamed from: a */
    private ServerEvent m30952a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }
}
