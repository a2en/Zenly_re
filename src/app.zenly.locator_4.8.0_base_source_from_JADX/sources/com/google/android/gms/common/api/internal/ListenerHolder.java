package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.internal.base.C10263e;

public final class ListenerHolder<L> {

    /* renamed from: a */
    private final C10007b f26317a;

    /* renamed from: b */
    private volatile L f26318b;

    /* renamed from: c */
    private final C10006a<L> f26319c;

    public interface Notifier<L> {
        void notifyListener(L l);

        void onNotifyListenerFailed();
    }

    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$a */
    public static final class C10006a<L> {

        /* renamed from: a */
        private final L f26320a;

        /* renamed from: b */
        private final String f26321b;

        C10006a(L l, String str) {
            this.f26320a = l;
            this.f26321b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10006a)) {
                return false;
            }
            C10006a aVar = (C10006a) obj;
            return this.f26320a == aVar.f26320a && this.f26321b.equals(aVar.f26321b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f26320a) * 31) + this.f26321b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.ListenerHolder$b */
    private final class C10007b extends C10263e {
        public C10007b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C10123l.m25512a(z);
            ListenerHolder.this.mo27136b((Notifier) message.obj);
        }
    }

    ListenerHolder(Looper looper, L l, String str) {
        this.f26317a = new C10007b(looper);
        C10123l.m25506a(l, (Object) "Listener must not be null");
        this.f26318b = l;
        C10123l.m25515b(str);
        this.f26319c = new C10006a<>(l, str);
    }

    /* renamed from: a */
    public final void mo27134a(Notifier<? super L> notifier) {
        C10123l.m25506a(notifier, (Object) "Notifier must not be null");
        this.f26317a.sendMessage(this.f26317a.obtainMessage(1, notifier));
    }

    /* renamed from: b */
    public final C10006a<L> mo27135b() {
        return this.f26319c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27136b(Notifier<? super L> notifier) {
        L l = this.f26318b;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo27133a() {
        this.f26318b = null;
    }
}
