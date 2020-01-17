package androidx.emoji.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.provider.C0574a;
import androidx.core.provider.C0575b;
import androidx.core.provider.C0575b.C0580e;
import androidx.core.provider.C0575b.C0581f;
import androidx.core.util.C0607i;
import androidx.emoji.text.EmojiCompat.C0735c;
import androidx.emoji.text.EmojiCompat.C0738f;
import androidx.emoji.text.EmojiCompat.MetadataRepoLoader;
import java.nio.ByteBuffer;
import p214e.p234h.p235e.C7629k;

/* renamed from: androidx.emoji.text.d */
public class C0746d extends C0735c {

    /* renamed from: i */
    private static final C0747a f3088i = new C0747a();

    /* renamed from: androidx.emoji.text.d$a */
    public static class C0747a {
        /* renamed from: a */
        public C0580e mo3732a(Context context, C0574a aVar) throws NameNotFoundException {
            return C0575b.m2695a(context, (CancellationSignal) null, aVar);
        }

        /* renamed from: a */
        public Typeface mo3731a(Context context, C0581f fVar) throws NameNotFoundException {
            return C0575b.m2693a(context, (CancellationSignal) null, new C0581f[]{fVar});
        }

        /* renamed from: a */
        public void mo3734a(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* renamed from: a */
        public void mo3733a(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji.text.d$b */
    private static class C0748b implements MetadataRepoLoader {

        /* renamed from: a */
        private final Context f3089a;

        /* renamed from: b */
        private final C0574a f3090b;

        /* renamed from: c */
        private final C0747a f3091c;

        /* renamed from: d */
        private final Object f3092d = new Object();

        /* renamed from: e */
        private Handler f3093e;

        /* renamed from: f */
        private HandlerThread f3094f;

        /* renamed from: g */
        private C0752c f3095g;

        /* renamed from: h */
        C0738f f3096h;

        /* renamed from: i */
        private ContentObserver f3097i;

        /* renamed from: j */
        private Runnable f3098j;

        /* renamed from: androidx.emoji.text.d$b$a */
        class C0749a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0738f f3099e;

            C0749a(C0738f fVar) {
                this.f3099e = fVar;
            }

            public void run() {
                C0748b bVar = C0748b.this;
                bVar.f3096h = this.f3099e;
                bVar.mo3735a();
            }
        }

        /* renamed from: androidx.emoji.text.d$b$b */
        class C0750b extends ContentObserver {
            C0750b(Handler handler) {
                super(handler);
            }

            public void onChange(boolean z, Uri uri) {
                C0748b.this.mo3735a();
            }
        }

        /* renamed from: androidx.emoji.text.d$b$c */
        class C0751c implements Runnable {
            C0751c() {
            }

            public void run() {
                C0748b.this.mo3735a();
            }
        }

        C0748b(Context context, C0574a aVar, C0747a aVar2) {
            C0607i.m2774a(context, (Object) "Context cannot be null");
            C0607i.m2774a(aVar, (Object) "FontRequest cannot be null");
            this.f3089a = context.getApplicationContext();
            this.f3090b = aVar;
            this.f3091c = aVar2;
        }

        /* renamed from: a */
        private void m3503a(Uri uri, long j) {
            synchronized (this.f3092d) {
                if (this.f3097i == null) {
                    this.f3097i = new C0750b(this.f3093e);
                    this.f3091c.mo3734a(this.f3089a, uri, this.f3097i);
                }
                if (this.f3098j == null) {
                    this.f3098j = new C0751c();
                }
                this.f3093e.postDelayed(this.f3098j, j);
            }
        }

        /* renamed from: b */
        private void m3504b() {
            this.f3096h = null;
            ContentObserver contentObserver = this.f3097i;
            if (contentObserver != null) {
                this.f3091c.mo3733a(this.f3089a, contentObserver);
                this.f3097i = null;
            }
            synchronized (this.f3092d) {
                this.f3093e.removeCallbacks(this.f3098j);
                if (this.f3094f != null) {
                    this.f3094f.quit();
                }
                this.f3093e = null;
                this.f3094f = null;
            }
        }

        /* renamed from: c */
        private C0581f m3505c() {
            try {
                C0580e a = this.f3091c.mo3732a(this.f3089a, this.f3090b);
                if (a.mo3195b() == 0) {
                    C0581f[] a2 = a.mo3194a();
                    if (a2 != null && a2.length != 0) {
                        return a2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("fetchFonts failed (");
                sb.append(a.mo3195b());
                sb.append(")");
                throw new RuntimeException(sb.toString());
            } catch (NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void load(C0738f fVar) {
            C0607i.m2774a(fVar, (Object) "LoaderCallback cannot be null");
            synchronized (this.f3092d) {
                if (this.f3093e == null) {
                    this.f3094f = new HandlerThread("emojiCompat", 10);
                    this.f3094f.start();
                    this.f3093e = new Handler(this.f3094f.getLooper());
                }
                this.f3093e.post(new C0749a(fVar));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3735a() {
            if (this.f3096h != null) {
                try {
                    C0581f c = m3505c();
                    int a = c.mo3196a();
                    if (a == 2) {
                        synchronized (this.f3092d) {
                            if (this.f3095g != null) {
                                long a2 = this.f3095g.mo3739a();
                                if (a2 >= 0) {
                                    m3503a(c.mo3198c(), a2);
                                    return;
                                }
                            }
                        }
                    }
                    if (a == 0) {
                        Typeface a3 = this.f3091c.mo3731a(this.f3089a, c);
                        ByteBuffer a4 = C7629k.m18577a(this.f3089a, (CancellationSignal) null, c.mo3198c());
                        if (a4 != null) {
                            this.f3096h.mo3703a(C0757f.m3519a(a3, a4));
                            m3504b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("fetchFonts result is not OK. (");
                    sb.append(a);
                    sb.append(")");
                    throw new RuntimeException(sb.toString());
                } catch (Throwable th) {
                    this.f3096h.mo3704a(th);
                    m3504b();
                }
            }
        }
    }

    /* renamed from: androidx.emoji.text.d$c */
    public static abstract class C0752c {
        /* renamed from: a */
        public abstract long mo3739a();
    }

    public C0746d(Context context, C0574a aVar) {
        super(new C0748b(context, aVar, f3088i));
    }
}
