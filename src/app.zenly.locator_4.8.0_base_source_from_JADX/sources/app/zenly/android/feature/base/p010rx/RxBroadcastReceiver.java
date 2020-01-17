package app.zenly.android.feature.base.p010rx;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableOnSubscribe;

/* renamed from: app.zenly.android.feature.base.rx.RxBroadcastReceiver */
public final class RxBroadcastReceiver {

    /* renamed from: c */
    public static final C1337a f4946c = new C1337a(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f4947a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final IntentFilter f4948b;

    /* renamed from: app.zenly.android.feature.base.rx.RxBroadcastReceiver$a */
    public static final class C1337a {
        private C1337a() {
        }

        /* renamed from: a */
        public final C12279e<Intent> mo6555a(Context context, IntentFilter intentFilter) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(intentFilter, "intentFilter");
            return new RxBroadcastReceiver(context, intentFilter, null).m6352a();
        }

        public /* synthetic */ C1337a(C12928f fVar) {
            this();
        }
    }

    private RxBroadcastReceiver(Context context, IntentFilter intentFilter) {
        this.f4948b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        C12932j.m33815a((Object) applicationContext, "context.applicationContext");
        this.f4947a = applicationContext;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<Intent> m6352a() {
        C12279e<Intent> a = C12279e.m32602a((ObservableOnSubscribe<T>) new RxBroadcastReceiver$observe$1<T>(this));
        C12932j.m33815a((Object) a, "Observable.create<Intent…       }\n        })\n    }");
        return a;
    }

    public /* synthetic */ RxBroadcastReceiver(Context context, IntentFilter intentFilter, C12928f fVar) {
        this(context, intentFilter);
    }
}
