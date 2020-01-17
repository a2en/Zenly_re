package com.google.firebase.iid;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.SuccessContinuation;

/* renamed from: com.google.firebase.iid.n0 */
final /* synthetic */ class C11076n0 implements SuccessContinuation {

    /* renamed from: a */
    private final FirebaseInstanceId f28732a;

    /* renamed from: b */
    private final String f28733b;

    /* renamed from: c */
    private final String f28734c;

    /* renamed from: d */
    private final String f28735d;

    C11076n0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f28732a = firebaseInstanceId;
        this.f28733b = str;
        this.f28734c = str2;
        this.f28735d = str3;
    }

    public final C10693c then(Object obj) {
        return this.f28732a.zzb(this.f28733b, this.f28734c, this.f28735d, (String) obj);
    }
}
