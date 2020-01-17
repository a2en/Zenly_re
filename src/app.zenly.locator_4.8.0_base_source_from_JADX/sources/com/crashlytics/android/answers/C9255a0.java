package com.crashlytics.android.answers;

import p389io.fabric.sdk.android.services.events.FileRollOverManager;
import p389io.fabric.sdk.android.services.settings.C12250b;

/* renamed from: com.crashlytics.android.answers.a0 */
interface C9255a0 extends FileRollOverManager {
    /* renamed from: a */
    void mo24954a(C9259b bVar);

    /* renamed from: a */
    void mo24955a(C12250b bVar, String str);

    void deleteAllEvents();

    void sendEvents();
}
