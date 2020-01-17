package com.segment.analytics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.segment.analytics.p */
class C11681p {

    /* renamed from: a */
    final HandlerThread f30292a = new HandlerThread("Segment-Stats", 10);

    /* renamed from: b */
    final C11682a f30293b;

    /* renamed from: c */
    long f30294c;

    /* renamed from: d */
    long f30295d;

    /* renamed from: e */
    long f30296e;

    /* renamed from: f */
    long f30297f;

    /* renamed from: g */
    Map<String, Long> f30298g = new HashMap();

    /* renamed from: com.segment.analytics.p$a */
    private static class C11682a extends Handler {

        /* renamed from: a */
        private final C11681p f30299a;

        C11682a(Looper looper, C11681p pVar) {
            super(looper);
            this.f30299a = pVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.f30299a.mo34403b(message.arg1);
            } else if (i == 2) {
                this.f30299a.mo34401a((Pair) message.obj);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown Stats handler message: ");
                sb.append(message);
                throw new AssertionError(sb.toString());
            }
        }
    }

    C11681p() {
        this.f30292a.start();
        this.f30293b = new C11682a(this.f30292a.getLooper(), this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34400a(int i) {
        C11682a aVar = this.f30293b;
        aVar.sendMessage(aVar.obtainMessage(1, i, 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34403b(int i) {
        this.f30294c++;
        this.f30295d += (long) i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34402a(String str, long j) {
        C11682a aVar = this.f30293b;
        aVar.sendMessage(aVar.obtainMessage(2, new Pair(str, Long.valueOf(j))));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34401a(Pair<String, Long> pair) {
        this.f30296e++;
        this.f30297f += ((Long) pair.second).longValue();
        Long l = (Long) this.f30298g.get(pair.first);
        if (l == null) {
            this.f30298g.put(pair.first, pair.second);
        } else {
            this.f30298g.put(pair.first, Long.valueOf(l.longValue() + ((Long) pair.second).longValue()));
        }
    }
}
