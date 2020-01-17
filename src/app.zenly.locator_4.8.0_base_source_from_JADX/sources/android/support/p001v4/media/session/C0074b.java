package android.support.p001v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.b */
class C0074b {

    /* renamed from: android.support.v4.media.session.b$a */
    static final class C0075a {
        /* renamed from: a */
        public static String m166a(Object obj) {
            return ((CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m167b(Object obj) {
            return ((CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m168c(Object obj) {
            return ((CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m169d(Object obj) {
            return ((CustomAction) obj).getName();
        }
    }

    /* renamed from: a */
    public static long m157a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m158b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m159c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m160d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m161e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m162f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m163g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m164h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m165i(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
