package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

/* renamed from: com.crashlytics.android.core.l0 */
interface C9388l0 {

    /* renamed from: com.crashlytics.android.core.l0$a */
    public enum C9389a {
        JAVA,
        NATIVE
    }

    /* renamed from: a */
    Map<String, String> mo25081a();

    /* renamed from: b */
    String mo25082b();

    /* renamed from: c */
    File mo25083c();

    /* renamed from: d */
    File[] mo25084d();

    String getIdentifier();

    C9389a getType();

    void remove();
}
