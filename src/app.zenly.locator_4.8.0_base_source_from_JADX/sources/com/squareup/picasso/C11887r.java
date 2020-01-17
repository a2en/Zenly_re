package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso.C11848e;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.r */
class C11887r extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.r$a */
    private static final class C11888a extends FutureTask<C11859c> implements Comparable<C11888a> {

        /* renamed from: e */
        private final C11859c f30806e;

        public C11888a(C11859c cVar) {
            super(cVar, null);
            this.f30806e = cVar;
        }

        /* renamed from: a */
        public int compareTo(C11888a aVar) {
            C11848e j = this.f30806e.mo35082j();
            C11848e j2 = aVar.f30806e.mo35082j();
            return j == j2 ? this.f30806e.f30716e - aVar.f30806e.f30716e : j2.ordinal() - j.ordinal();
        }
    }

    C11887r() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C11857f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35137a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            m31217a(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m31217a(1);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    m31217a(2);
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m31217a(3);
                            break;
                        default:
                            m31217a(3);
                            break;
                    }
                    m31217a(2);
                    break;
            }
        } else if (type == 1 || type == 6 || type == 9) {
            m31217a(4);
        } else {
            m31217a(3);
        }
    }

    public Future<?> submit(Runnable runnable) {
        C11888a aVar = new C11888a((C11859c) runnable);
        execute(aVar);
        return aVar;
    }

    /* renamed from: a */
    private void m31217a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }
}
