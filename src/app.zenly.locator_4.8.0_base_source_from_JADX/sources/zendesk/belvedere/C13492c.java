package zendesk.belvedere;

import android.os.Handler;
import android.os.Looper;

/* renamed from: zendesk.belvedere.c */
public abstract class C13492c<E> {
    private boolean canceled = false;

    /* renamed from: zendesk.belvedere.c$a */
    class C13493a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Object f34998e;

        C13493a(Object obj) {
            this.f34998e = obj;
        }

        public void run() {
            C13492c.this.success(this.f34998e);
        }
    }

    /* access modifiers changed from: 0000 */
    public void internalSuccess(E e) {
        if (!this.canceled) {
            new Handler(Looper.getMainLooper()).post(new C13493a(e));
        }
    }

    public abstract void success(E e);
}
