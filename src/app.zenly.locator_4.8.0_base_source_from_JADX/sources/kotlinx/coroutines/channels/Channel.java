package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.C13108o;

public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {

    /* renamed from: kotlinx.coroutines.channels.Channel$a */
    public static final class C13067a {

        /* renamed from: a */
        static final /* synthetic */ C13067a f33645a = new C13067a();

        static {
            C13108o.m34216a("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);
        }

        private C13067a() {
        }
    }

    static {
        C13067a aVar = C13067a.f33645a;
    }
}
