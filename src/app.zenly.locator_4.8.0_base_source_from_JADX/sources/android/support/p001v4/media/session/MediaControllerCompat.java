package android.support.p001v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.IMediaControllerCallback.C0050a;
import android.support.p001v4.media.session.IMediaSession.C0051a;
import android.support.p001v4.media.session.MediaControllerCompatApi21.Callback;
import android.support.p001v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p001v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.C0522d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0058b f81a;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0058b {

        /* renamed from: a */
        protected final Object f82a;

        /* renamed from: b */
        final Object f83b = new Object();

        /* renamed from: c */
        private final List<C0054a> f84c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0054a, C0053a> f85d = new HashMap<>();

        /* renamed from: e */
        final Token f86e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: e */
            private WeakReference<MediaControllerImplApi21> f87e;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f87e = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f87e.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f83b) {
                        mediaControllerImplApi21.f86e.mo231a(C0051a.m119a(C0522d.m2465a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f86e.mo230a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.mo189a();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0053a extends C0057c {
            C0053a(C0054a aVar) {
                super(aVar);
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void onQueueChanged(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            public void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f86e = token;
            this.f82a = MediaControllerCompatApi21.m136a(context, this.f86e.mo232b());
            if (this.f82a == null) {
                throw new RemoteException();
            } else if (this.f86e.mo229a() == null) {
                m121b();
            }
        }

        /* renamed from: b */
        private void m121b() {
            mo190a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: a */
        public boolean mo191a(KeyEvent keyEvent) {
            return MediaControllerCompatApi21.m139a(this.f82a, keyEvent);
        }

        /* renamed from: a */
        public void mo190a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaControllerCompatApi21.m138a(this.f82a, str, bundle, resultReceiver);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo189a() {
            if (this.f86e.mo229a() != null) {
                for (C0054a aVar : this.f84c) {
                    C0053a aVar2 = new C0053a(aVar);
                    this.f85d.put(aVar, aVar2);
                    aVar.f89b = aVar2;
                    try {
                        this.f86e.mo229a().registerCallbackListener(aVar2);
                        aVar.mo194a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f84c.clear();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0054a implements DeathRecipient {

        /* renamed from: a */
        C0055a f88a;

        /* renamed from: b */
        IMediaControllerCallback f89b;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0055a extends Handler {
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0056b implements Callback {

            /* renamed from: a */
            private final WeakReference<C0054a> f90a;

            C0056b(C0054a aVar) {
                this.f90a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null) {
                    C0062f fVar = new C0062f(i, i2, i3, i4, i5);
                    aVar.mo197a(fVar);
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null) {
                    aVar.mo195a(bundle);
                }
            }

            public void onMetadataChanged(Object obj) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null) {
                    aVar.mo196a(MediaMetadataCompat.m81a(obj));
                }
            }

            public void onPlaybackStateChanged(Object obj) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null && aVar.f89b == null) {
                    aVar.mo198a(PlaybackStateCompat.m152a(obj));
                }
            }

            public void onQueueChanged(List<?> list) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null) {
                    aVar.mo201a(QueueItem.m145a(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null) {
                    aVar.mo199a(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar != null) {
                    aVar.mo193a();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                C0054a aVar = (C0054a) this.f90a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f89b == null || VERSION.SDK_INT >= 23) {
                    aVar.mo200a(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0057c extends C0050a {

            /* renamed from: a */
            private final WeakReference<C0054a> f91a;

            C0057c(C0054a aVar) {
                this.f91a = new WeakReference<>(aVar);
            }

            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(11, Boolean.valueOf(z), null);
                }
            }

            public void onEvent(String str, Bundle bundle) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(1, str, bundle);
                }
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(7, bundle, null);
                }
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(3, mediaMetadataCompat, null);
                }
            }

            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(2, playbackStateCompat, null);
                }
            }

            public void onQueueChanged(List<QueueItem> list) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(5, list, null);
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(6, charSequence, null);
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(9, Integer.valueOf(i), null);
                }
            }

            public void onSessionDestroyed() throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(8, null, null);
                }
            }

            public void onSessionReady() throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(13, null, null);
                }
            }

            public void onShuffleModeChanged(int i) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(12, Integer.valueOf(i), null);
                }
            }

            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0054a aVar = (C0054a) this.f91a.get();
                if (aVar != null) {
                    aVar.mo194a(4, parcelableVolumeInfo != null ? new C0062f(parcelableVolumeInfo.f99e, parcelableVolumeInfo.f100f, parcelableVolumeInfo.f101g, parcelableVolumeInfo.f102h, parcelableVolumeInfo.f103i) : null, null);
                }
            }
        }

        public C0054a() {
            if (VERSION.SDK_INT >= 21) {
                MediaControllerCompatApi21.m137a(new C0056b(this));
            } else {
                this.f89b = new C0057c(this);
            }
        }

        /* renamed from: a */
        public void mo193a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo194a(int i, Object obj, Bundle bundle) {
            C0055a aVar = this.f88a;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: a */
        public void mo195a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo196a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo197a(C0062f fVar) {
        }

        /* renamed from: a */
        public void mo198a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo199a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo200a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo201a(List<QueueItem> list) {
        }

        public void binderDied() {
            mo194a(8, null, null);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0058b {
        /* renamed from: a */
        boolean mo191a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0059c extends MediaControllerImplApi21 {
        public C0059c(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0060d extends C0059c {
        public C0060d(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0061e implements C0058b {

        /* renamed from: a */
        private IMediaSession f92a;

        public C0061e(Token token) {
            this.f92a = C0051a.m119a((IBinder) token.mo232b());
        }

        /* renamed from: a */
        public boolean mo191a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f92a.sendMediaButton(keyEvent);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0062f {
        C0062f(int i, int i2, int i3, int i4, int i5) {
        }
    }

    public MediaControllerCompat(Context context, Token token) throws RemoteException {
        new HashSet();
        if (token != null) {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                this.f81a = new C0060d(context, token);
            } else if (i >= 23) {
                this.f81a = new C0059c(context, token);
            } else if (i >= 21) {
                this.f81a = new MediaControllerImplApi21(context, token);
            } else {
                this.f81a = new C0061e(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    /* renamed from: a */
    public boolean mo188a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f81a.mo191a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
