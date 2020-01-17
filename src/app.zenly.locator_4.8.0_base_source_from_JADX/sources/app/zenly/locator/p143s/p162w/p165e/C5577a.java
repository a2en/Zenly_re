package app.zenly.locator.p143s.p162w.p165e;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewParent;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.w.e.a */
public final class C5577a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MediaPlayer f14251a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f14252b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f14253c;

    /* renamed from: d */
    private OnPreparedListener f14254d;

    /* renamed from: e */
    private OnCompletionListener f14255e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TextureView f14256f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5584c f14257g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f14258h;

    /* renamed from: i */
    private final C5583b f14259i;

    /* renamed from: app.zenly.locator.s.w.e.a$a */
    public static final class C5578a implements SurfaceTextureListener {

        /* renamed from: e */
        final /* synthetic */ C5577a f14260e;

        /* renamed from: app.zenly.locator.s.w.e.a$a$a */
        static final class C5579a implements OnVideoSizeChangedListener {

            /* renamed from: a */
            final /* synthetic */ C5578a f14261a;

            C5579a(C5578a aVar, SurfaceTexture surfaceTexture) {
                this.f14261a = aVar;
            }

            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                this.f14261a.f14260e.m15784g();
            }
        }

        /* renamed from: app.zenly.locator.s.w.e.a$a$b */
        static final class C5580b implements OnPreparedListener {

            /* renamed from: a */
            final /* synthetic */ C5578a f14262a;

            C5580b(C5578a aVar, SurfaceTexture surfaceTexture) {
                this.f14262a = aVar;
            }

            public final void onPrepared(MediaPlayer mediaPlayer) {
                this.f14262a.f14260e.f14253c = true;
                OnPreparedListener c = this.f14262a.f14260e.mo13194c();
                if (c != null) {
                    c.onPrepared(mediaPlayer);
                }
                if (!this.f14262a.f14260e.f14252b) {
                    mediaPlayer.start();
                }
            }
        }

        /* renamed from: app.zenly.locator.s.w.e.a$a$c */
        static final class C5581c implements OnCompletionListener {

            /* renamed from: a */
            final /* synthetic */ C5578a f14263a;

            C5581c(C5578a aVar, SurfaceTexture surfaceTexture) {
                this.f14263a = aVar;
            }

            public final void onCompletion(MediaPlayer mediaPlayer) {
                if (this.f14263a.f14260e.f14253c) {
                    OnCompletionListener b = this.f14263a.f14260e.mo13193b();
                    if (b != null) {
                        b.onCompletion(mediaPlayer);
                    }
                }
            }
        }

        /* renamed from: app.zenly.locator.s.w.e.a$a$d */
        static final class C5582d implements OnErrorListener {

            /* renamed from: a */
            public static final C5582d f14264a = new C5582d();

            C5582d() {
            }

            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return true;
            }
        }

        C5578a(C5577a aVar) {
            this.f14260e = aVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C12932j.m33818b(surfaceTexture, "surface");
            if (this.f14260e.f14251a == null) {
                C5577a aVar = this.f14260e;
                MediaPlayer mediaPlayer = new MediaPlayer();
                C5584c f = this.f14260e.f14257g;
                if (f instanceof C5585a) {
                    Context context = this.f14260e.f14256f.getContext();
                    C12932j.m33815a((Object) context, "textureView.context");
                    AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(((C5585a) this.f14260e.f14257g).mo13206a());
                    C12932j.m33815a((Object) openRawResourceFd, "afd");
                    mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                } else if (f instanceof C5586b) {
                    mediaPlayer.setDataSource(this.f14260e.f14256f.getContext(), ((C5586b) this.f14260e.f14257g).mo13207a());
                }
                mediaPlayer.setSurface(new Surface(surfaceTexture));
                mediaPlayer.setLooping(this.f14260e.f14258h);
                mediaPlayer.setOnVideoSizeChangedListener(new C5579a(this, surfaceTexture));
                mediaPlayer.setOnPreparedListener(new C5580b(this, surfaceTexture));
                mediaPlayer.setOnErrorListener(C5582d.f14264a);
                mediaPlayer.setOnCompletionListener(new C5581c(this, surfaceTexture));
                mediaPlayer.prepareAsync();
                aVar.f14251a = mediaPlayer;
                return;
            }
            throw new IllegalStateException("MediaPlayer is already created");
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C12932j.m33818b(surfaceTexture, "surface");
            MediaPlayer b = this.f14260e.f14251a;
            if (b != null && this.f14260e.f14253c) {
                b.stop();
                b.release();
            }
            this.f14260e.f14251a = null;
            this.f14260e.f14253c = false;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C12932j.m33818b(surfaceTexture, "surface");
            this.f14260e.m15784g();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C12932j.m33818b(surfaceTexture, "surface");
        }
    }

    /* renamed from: app.zenly.locator.s.w.e.a$b */
    public enum C5583b {
        CROP,
        INSIDE
    }

    /* renamed from: app.zenly.locator.s.w.e.a$c */
    public static abstract class C5584c {

        /* renamed from: app.zenly.locator.s.w.e.a$c$a */
        public static final class C5585a extends C5584c {

            /* renamed from: a */
            private final int f14268a;

            public C5585a(int i) {
                super(null);
                this.f14268a = i;
            }

            /* renamed from: a */
            public final int mo13206a() {
                return this.f14268a;
            }
        }

        /* renamed from: app.zenly.locator.s.w.e.a$c$b */
        public static final class C5586b extends C5584c {

            /* renamed from: a */
            private final Uri f14269a;

            public C5586b(Uri uri) {
                C12932j.m33818b(uri, "uri");
                super(null);
                this.f14269a = uri;
            }

            /* renamed from: a */
            public final Uri mo13207a() {
                return this.f14269a;
            }
        }

        private C5584c() {
        }

        public /* synthetic */ C5584c(C12928f fVar) {
            this();
        }
    }

    public C5577a(TextureView textureView, C5584c cVar, boolean z, C5583b bVar) {
        C12932j.m33818b(textureView, "textureView");
        C12932j.m33818b(cVar, "videoResource");
        C12932j.m33818b(bVar, "scaleType");
        this.f14256f = textureView;
        this.f14257g = cVar;
        this.f14258h = z;
        this.f14259i = bVar;
        this.f14256f.setSurfaceTextureListener(new C5578a(this));
        if (this.f14256f.isAvailable()) {
            SurfaceTextureListener surfaceTextureListener = this.f14256f.getSurfaceTextureListener();
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(this.f14256f.getSurfaceTexture(), this.f14256f.getWidth(), this.f14256f.getHeight());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m15784g() {
        MediaPlayer mediaPlayer = this.f14251a;
        if (mediaPlayer != null) {
            ViewParent parent = this.f14256f.getParent();
            if (parent != null) {
                View view = (View) parent;
                float width = (((float) view.getWidth()) - ((float) view.getPaddingLeft())) - ((float) view.getPaddingRight());
                float height = (((float) view.getHeight()) - ((float) view.getPaddingTop())) - ((float) view.getPaddingBottom());
                float videoWidth = (float) mediaPlayer.getVideoWidth();
                float videoHeight = (float) mediaPlayer.getVideoHeight();
                float f = videoWidth / videoHeight;
                boolean z = videoWidth * height > videoHeight * width;
                if ((this.f14259i != C5583b.CROP || !z) && (this.f14259i != C5583b.INSIDE || z)) {
                    this.f14256f.getLayoutParams().width = -1;
                    this.f14256f.getLayoutParams().height = (int) (width / f);
                } else {
                    this.f14256f.getLayoutParams().width = (int) (height * f);
                    this.f14256f.getLayoutParams().height = -1;
                }
                this.f14256f.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: b */
    public final OnCompletionListener mo13193b() {
        return this.f14255e;
    }

    /* renamed from: c */
    public final OnPreparedListener mo13194c() {
        return this.f14254d;
    }

    /* renamed from: d */
    public final void mo13195d() {
        this.f14252b = true;
        if (this.f14253c) {
            MediaPlayer mediaPlayer = this.f14251a;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer2 = this.f14251a;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo13196e() {
        if (this.f14253c) {
            MediaPlayer mediaPlayer = this.f14251a;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer2 = this.f14251a;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo(0);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo13197f() {
        this.f14252b = false;
        if (this.f14253c) {
            MediaPlayer mediaPlayer = this.f14251a;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo13192a(OnPreparedListener onPreparedListener) {
        this.f14254d = onPreparedListener;
    }

    /* renamed from: a */
    public final void mo13191a(OnCompletionListener onCompletionListener) {
        this.f14255e = onCompletionListener;
    }

    /* renamed from: a */
    public final void mo13190a() {
        MediaPlayer mediaPlayer = this.f14251a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}
