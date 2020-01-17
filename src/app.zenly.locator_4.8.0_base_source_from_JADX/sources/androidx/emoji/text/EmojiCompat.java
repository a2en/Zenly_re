package androidx.emoji.text;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.util.C0607i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p214e.p228e.C7573b;

public class EmojiCompat {

    /* renamed from: m */
    private static final Object f3036m = new Object();

    /* renamed from: n */
    private static volatile EmojiCompat f3037n;

    /* renamed from: a */
    private final ReadWriteLock f3038a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set<C0736d> f3039b;

    /* renamed from: c */
    private int f3040c = 3;

    /* renamed from: d */
    private final Handler f3041d;

    /* renamed from: e */
    private final C0734b f3042e;

    /* renamed from: f */
    final MetadataRepoLoader f3043f;

    /* renamed from: g */
    final boolean f3044g;

    /* renamed from: h */
    final boolean f3045h;

    /* renamed from: i */
    final int[] f3046i;

    /* renamed from: j */
    private final boolean f3047j;

    /* renamed from: k */
    private final int f3048k;

    /* renamed from: l */
    private final int f3049l;

    public interface MetadataRepoLoader {
        void load(C0738f fVar);
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$a */
    private static final class C0732a extends C0734b {

        /* renamed from: b */
        private volatile C0741b f3050b;

        /* renamed from: c */
        private volatile C0757f f3051c;

        /* renamed from: androidx.emoji.text.EmojiCompat$a$a */
        class C0733a extends C0738f {
            C0733a() {
            }

            /* renamed from: a */
            public void mo3703a(C0757f fVar) {
                C0732a.this.mo3701a(fVar);
            }

            /* renamed from: a */
            public void mo3704a(Throwable th) {
                C0732a.this.f3053a.mo3691a(th);
            }
        }

        C0732a(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3699a() {
            try {
                this.f3053a.f3043f.load(new C0733a());
            } catch (Throwable th) {
                this.f3053a.mo3691a(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3701a(C0757f fVar) {
            if (fVar == null) {
                this.f3053a.mo3691a((Throwable) new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3051c = fVar;
            C0757f fVar2 = this.f3051c;
            C0739g gVar = new C0739g();
            EmojiCompat emojiCompat = this.f3053a;
            this.f3050b = new C0741b(fVar2, gVar, emojiCompat.f3045h, emojiCompat.f3046i);
            this.f3053a.mo3696d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3702a(CharSequence charSequence) {
            return this.f3050b.mo3721a(charSequence) != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo3698a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3050b.mo3722a(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3700a(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3051c.mo3749c());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3053a.f3044g);
        }
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$b */
    private static class C0734b {

        /* renamed from: a */
        final EmojiCompat f3053a;

        C0734b(EmojiCompat emojiCompat) {
            this.f3053a = emojiCompat;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo3698a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3699a() {
            this.f3053a.mo3696d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3700a(EditorInfo editorInfo) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3702a(CharSequence charSequence) {
            return false;
        }
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$c */
    public static abstract class C0735c {

        /* renamed from: a */
        final MetadataRepoLoader f3054a;

        /* renamed from: b */
        boolean f3055b;

        /* renamed from: c */
        boolean f3056c;

        /* renamed from: d */
        int[] f3057d;

        /* renamed from: e */
        Set<C0736d> f3058e;

        /* renamed from: f */
        boolean f3059f;

        /* renamed from: g */
        int f3060g = -16711936;

        /* renamed from: h */
        int f3061h = 0;

        protected C0735c(MetadataRepoLoader metadataRepoLoader) {
            C0607i.m2774a(metadataRepoLoader, (Object) "metadataLoader cannot be null.");
            this.f3054a = metadataRepoLoader;
        }

        /* renamed from: a */
        public C0735c mo3705a(C0736d dVar) {
            C0607i.m2774a(dVar, (Object) "initCallback cannot be null");
            if (this.f3058e == null) {
                this.f3058e = new C7573b();
            }
            this.f3058e.add(dVar);
            return this;
        }
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$d */
    public static abstract class C0736d {
        /* renamed from: a */
        public void mo3706a() {
        }

        /* renamed from: a */
        public void mo3707a(Throwable th) {
        }
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$e */
    private static class C0737e implements Runnable {

        /* renamed from: e */
        private final List<C0736d> f3062e;

        /* renamed from: f */
        private final Throwable f3063f;

        /* renamed from: g */
        private final int f3064g;

        C0737e(C0736d dVar, int i) {
            C0607i.m2774a(dVar, (Object) "initCallback cannot be null");
            this(Arrays.asList(new C0736d[]{dVar}), i, null);
        }

        public void run() {
            int size = this.f3062e.size();
            int i = 0;
            if (this.f3064g != 1) {
                while (i < size) {
                    ((C0736d) this.f3062e.get(i)).mo3707a(this.f3063f);
                    i++;
                }
                return;
            }
            while (i < size) {
                ((C0736d) this.f3062e.get(i)).mo3706a();
                i++;
            }
        }

        C0737e(Collection<C0736d> collection, int i) {
            this(collection, i, null);
        }

        C0737e(Collection<C0736d> collection, int i, Throwable th) {
            C0607i.m2774a(collection, (Object) "initCallbacks cannot be null");
            this.f3062e = new ArrayList(collection);
            this.f3064g = i;
            this.f3063f = th;
        }
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$f */
    public static abstract class C0738f {
        /* renamed from: a */
        public abstract void mo3703a(C0757f fVar);

        /* renamed from: a */
        public abstract void mo3704a(Throwable th);
    }

    /* renamed from: androidx.emoji.text.EmojiCompat$g */
    static class C0739g {
        C0739g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0745c mo3709a(C0740a aVar) {
            return new C0759g(aVar);
        }
    }

    private EmojiCompat(C0735c cVar) {
        this.f3044g = cVar.f3055b;
        this.f3045h = cVar.f3056c;
        this.f3046i = cVar.f3057d;
        this.f3047j = cVar.f3059f;
        this.f3048k = cVar.f3060g;
        this.f3043f = cVar.f3054a;
        this.f3049l = cVar.f3061h;
        this.f3041d = new Handler(Looper.getMainLooper());
        this.f3039b = new C7573b();
        Set<C0736d> set = cVar.f3058e;
        if (set != null && !set.isEmpty()) {
            this.f3039b.addAll(cVar.f3058e);
        }
        this.f3042e = VERSION.SDK_INT < 19 ? new C0734b(this) : new C0732a(this);
        m3435g();
    }

    /* renamed from: a */
    public static EmojiCompat m3430a(C0735c cVar) {
        if (f3037n == null) {
            synchronized (f3036m) {
                if (f3037n == null) {
                    f3037n = new EmojiCompat(cVar);
                }
            }
        }
        return f3037n;
    }

    /* renamed from: e */
    public static EmojiCompat m3433e() {
        EmojiCompat emojiCompat;
        synchronized (f3036m) {
            C0607i.m2777a(f3037n != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            emojiCompat = f3037n;
        }
        return emojiCompat;
    }

    /* renamed from: f */
    private boolean m3434f() {
        return mo3693b() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private void m3435g() {
        this.f3038a.writeLock().lock();
        try {
            if (this.f3049l == 0) {
                this.f3040c = 0;
            }
            this.f3038a.writeLock().unlock();
            if (mo3693b() == 0) {
                this.f3042e.mo3699a();
            }
        } catch (Throwable th) {
            this.f3038a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public int mo3693b() {
        this.f3038a.readLock().lock();
        try {
            return this.f3040c;
        } finally {
            this.f3038a.readLock().unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3695c() {
        return this.f3047j;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3696d() {
        ArrayList arrayList = new ArrayList();
        this.f3038a.writeLock().lock();
        try {
            this.f3040c = 1;
            arrayList.addAll(this.f3039b);
            this.f3039b.clear();
            this.f3038a.writeLock().unlock();
            this.f3041d.post(new C0737e((Collection<C0736d>) arrayList, this.f3040c));
        } catch (Throwable th) {
            this.f3038a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public CharSequence mo3694b(CharSequence charSequence) {
        return mo3686a(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3691a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3038a.writeLock().lock();
        try {
            this.f3040c = 2;
            arrayList.addAll(this.f3039b);
            this.f3039b.clear();
            this.f3038a.writeLock().unlock();
            this.f3041d.post(new C0737e(arrayList, this.f3040c, th));
        } catch (Throwable th2) {
            this.f3038a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: a */
    public void mo3690a(C0736d dVar) {
        C0607i.m2774a(dVar, (Object) "initCallback cannot be null");
        this.f3038a.writeLock().lock();
        try {
            if (this.f3040c != 1) {
                if (this.f3040c != 2) {
                    this.f3039b.add(dVar);
                }
            }
            this.f3041d.post(new C0737e(dVar, this.f3040c));
        } finally {
            this.f3038a.writeLock().unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3685a() {
        return this.f3048k;
    }

    /* renamed from: a */
    public static boolean m3431a(Editable editable, int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 19) {
            return C0741b.m3478a(editable, i, keyEvent);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3432a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            return C0741b.m3481a(inputConnection, editable, i, i2, z);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3692a(CharSequence charSequence) {
        C0607i.m2777a(m3434f(), "Not initialized yet");
        C0607i.m2774a(charSequence, (Object) "sequence cannot be null");
        return this.f3042e.mo3702a(charSequence);
    }

    /* renamed from: a */
    public CharSequence mo3686a(CharSequence charSequence, int i, int i2) {
        return mo3687a(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public CharSequence mo3687a(CharSequence charSequence, int i, int i2, int i3) {
        return mo3688a(charSequence, i, i2, i3, 0);
    }

    /* renamed from: a */
    public CharSequence mo3688a(CharSequence charSequence, int i, int i2, int i3, int i4) {
        C0607i.m2777a(m3434f(), "Not initialized yet");
        C0607i.m2772a(i, "start cannot be negative");
        C0607i.m2772a(i2, "end cannot be negative");
        C0607i.m2772a(i3, "maxEmojiCount cannot be negative");
        C0607i.m2776a(i <= i2, (Object) "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        C0607i.m2776a(i <= charSequence.length(), (Object) "start should be < than charSequence length");
        C0607i.m2776a(i2 <= charSequence.length(), (Object) "end should be < than charSequence length");
        if (!(charSequence.length() == 0 || i == i2)) {
            boolean z = i4 != 1 ? i4 != 2 ? this.f3044g : false : true;
            charSequence = this.f3042e.mo3698a(charSequence, i, i2, i3, z);
        }
        return charSequence;
    }

    /* renamed from: a */
    public void mo3689a(EditorInfo editorInfo) {
        if (m3434f() && editorInfo != null && editorInfo.extras != null) {
            this.f3042e.mo3700a(editorInfo);
        }
    }
}
