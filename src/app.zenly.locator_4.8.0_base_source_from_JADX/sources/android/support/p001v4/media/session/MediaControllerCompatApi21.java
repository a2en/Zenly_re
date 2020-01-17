package android.support.p001v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompatApi21 */
class MediaControllerCompatApi21 {

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$Callback */
    public interface Callback {
        void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5);

        void onExtrasChanged(Bundle bundle);

        void onMetadataChanged(Object obj);

        void onPlaybackStateChanged(Object obj);

        void onQueueChanged(List<?> list);

        void onQueueTitleChanged(CharSequence charSequence);

        void onSessionDestroyed();

        void onSessionEvent(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$a */
    static class C0063a<T extends Callback> extends android.media.session.MediaController.Callback {

        /* renamed from: a */
        protected final T f93a;

        public C0063a(T t) {
            this.f93a = t;
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f93a.onAudioInfoChanged(playbackInfo.getPlaybackType(), C0064b.m142b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            this.f93a.onExtrasChanged(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f93a.onMetadataChanged(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f93a.onPlaybackStateChanged(playbackState);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f93a.onQueueChanged(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f93a.onQueueTitleChanged(charSequence);
        }

        public void onSessionDestroyed() {
            this.f93a.onSessionDestroyed();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m143a(bundle);
            this.f93a.onSessionEvent(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi21$b */
    public static class C0064b {
        /* renamed from: a */
        public static AudioAttributes m141a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m142b(Object obj) {
            return m140a(m141a(obj));
        }

        /* renamed from: a */
        private static int m140a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m136a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: a */
    public static Object m137a(Callback callback) {
        return new C0063a(callback);
    }

    /* renamed from: a */
    public static boolean m139a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m138a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
