package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;
import p389io.fabric.sdk.android.services.common.C12200s;
import p389io.fabric.sdk.android.services.events.C12230b;
import p389io.fabric.sdk.android.services.persistence.FileStore;

/* renamed from: com.crashlytics.android.answers.g */
class C9274g {

    /* renamed from: a */
    final Context f24100a;

    /* renamed from: b */
    final FileStore f24101b;

    public C9274g(Context context, FileStore fileStore) {
        this.f24100a = context;
        this.f24101b = fileStore;
    }

    /* renamed from: a */
    public C9296x mo24998a() throws IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new C9296x(this.f24100a, new C9264d0(), new C12200s(), new C12230b(this.f24100a, this.f24101b.getFilesDir(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
