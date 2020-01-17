package android.support.p001v4.media.session;

import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;

/* renamed from: android.support.v4.media.session.a */
class C0071a {

    /* renamed from: android.support.v4.media.session.a$a */
    interface C0072a {
    }

    /* renamed from: android.support.v4.media.session.a$b */
    static class C0073b {
        /* renamed from: a */
        public static Object m155a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m156b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m154a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
