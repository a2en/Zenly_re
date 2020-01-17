package app.zenly.android.feature.base.p010rx;

import android.content.Intent;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.functions.Action;

/* renamed from: app.zenly.android.feature.base.rx.RxBroadcastReceiver$observe$1 */
final class RxBroadcastReceiver$observe$1<T> implements ObservableOnSubscribe<T> {

    /* renamed from: a */
    final /* synthetic */ RxBroadcastReceiver f4949a;

    /* renamed from: app.zenly.android.feature.base.rx.RxBroadcastReceiver$observe$1$a */
    static final class C1338a implements Action {

        /* renamed from: a */
        final /* synthetic */ RxBroadcastReceiver$observe$1 f4950a;

        /* renamed from: b */
        final /* synthetic */ RxBroadcastReceiver$observe$1$broadcastReceiver$1 f4951b;

        C1338a(RxBroadcastReceiver$observe$1 rxBroadcastReceiver$observe$1, RxBroadcastReceiver$observe$1$broadcastReceiver$1 rxBroadcastReceiver$observe$1$broadcastReceiver$1) {
            this.f4950a = rxBroadcastReceiver$observe$1;
            this.f4951b = rxBroadcastReceiver$observe$1$broadcastReceiver$1;
        }

        public final void run() {
            try {
                this.f4950a.f4949a.f4947a.unregisterReceiver(this.f4951b);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    RxBroadcastReceiver$observe$1(RxBroadcastReceiver rxBroadcastReceiver) {
        this.f4949a = rxBroadcastReceiver;
    }

    public final void subscribe(ObservableEmitter<Intent> observableEmitter) {
        C12932j.m33818b(observableEmitter, "emitter");
        RxBroadcastReceiver$observe$1$broadcastReceiver$1 rxBroadcastReceiver$observe$1$broadcastReceiver$1 = new RxBroadcastReceiver$observe$1$broadcastReceiver$1(observableEmitter);
        this.f4949a.f4947a.registerReceiver(rxBroadcastReceiver$observe$1$broadcastReceiver$1, this.f4949a.f4948b);
        observableEmitter.setDisposable(C12276c.m32593a((Action) new C1338a(this, rxBroadcastReceiver$observe$1$broadcastReceiver$1)));
    }
}
