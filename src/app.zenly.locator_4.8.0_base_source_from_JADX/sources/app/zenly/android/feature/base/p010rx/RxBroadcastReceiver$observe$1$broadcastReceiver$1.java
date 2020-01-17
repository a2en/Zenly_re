package app.zenly.android.feature.base.p010rx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.ObservableEmitter;

/* renamed from: app.zenly.android.feature.base.rx.RxBroadcastReceiver$observe$1$broadcastReceiver$1 */
public final class RxBroadcastReceiver$observe$1$broadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ObservableEmitter f4952a;

    RxBroadcastReceiver$observe$1$broadcastReceiver$1(ObservableEmitter observableEmitter) {
        this.f4952a = observableEmitter;
    }

    public void onReceive(Context context, Intent intent) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(intent, "intent");
        this.f4952a.onNext(intent);
    }
}
