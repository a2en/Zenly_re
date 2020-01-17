package com.crashlytics.android.answers;

import android.content.Context;
import java.io.IOException;
import java.util.UUID;
import p389io.fabric.sdk.android.services.common.CurrentTimeProvider;
import p389io.fabric.sdk.android.services.events.C12227a;
import p389io.fabric.sdk.android.services.events.EventsStorage;
import p389io.fabric.sdk.android.services.settings.C12250b;

/* renamed from: com.crashlytics.android.answers.x */
class C9296x extends C12227a<C9257b0> {

    /* renamed from: g */
    private C12250b f24143g;

    C9296x(Context context, C9264d0 d0Var, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage) throws IOException {
        super(context, d0Var, currentTimeProvider, eventsStorage, 100);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25029a(C12250b bVar) {
        this.f24143g = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo25030c() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append("sa");
        String str = "_";
        sb.append(str);
        sb.append(randomUUID.toString());
        sb.append(str);
        sb.append(this.f31785c.getCurrentTimeMillis());
        sb.append(".tap");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo25031e() {
        C12250b bVar = this.f24143g;
        return bVar == null ? super.mo25031e() : bVar.f31848c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo25032f() {
        C12250b bVar = this.f24143g;
        return bVar == null ? super.mo25032f() : bVar.f31850e;
    }
}
