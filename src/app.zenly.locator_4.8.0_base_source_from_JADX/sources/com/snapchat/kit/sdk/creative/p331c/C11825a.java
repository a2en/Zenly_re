package com.snapchat.kit.sdk.creative.p331c;

import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;

/* renamed from: com.snapchat.kit.sdk.creative.c.a */
public class C11825a {

    /* renamed from: a */
    private final KitEventBaseFactory f30608a;

    C11825a(KitEventBaseFactory kitEventBaseFactory) {
        this.f30608a = kitEventBaseFactory;
    }

    /* renamed from: b */
    private CreativeKitEventBase m31021b() {
        return new Builder().kit_event_base(this.f30608a.createKitEventBase(KitType.CREATIVE_KIT, "1.1.4")).build();
    }

    /* renamed from: a */
    public ServerEvent mo34966a() {
        return m31020a(new ServerEventData.Builder().creative_kit_share_start(new CreativeKitShareStart.Builder().creative_kit_event_base(m31021b()).build()).build());
    }

    /* renamed from: a */
    private ServerEvent m31020a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }
}
