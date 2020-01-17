package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {

    /* renamed from: p */
    static final Handler f30656p = new C11843a(Looper.getMainLooper());

    /* renamed from: q */
    static volatile Picasso f30657q = null;

    /* renamed from: a */
    private final Listener f30658a;

    /* renamed from: b */
    private final RequestTransformer f30659b;

    /* renamed from: c */
    private final C11845c f30660c;

    /* renamed from: d */
    private final List<C11893u> f30661d;

    /* renamed from: e */
    final Context f30662e;

    /* renamed from: f */
    final C11870g f30663f;

    /* renamed from: g */
    final Cache f30664g;

    /* renamed from: h */
    final C11896w f30665h;

    /* renamed from: i */
    final Map<Object, C11849a> f30666i;

    /* renamed from: j */
    final Map<ImageView, C11869f> f30667j;

    /* renamed from: k */
    final ReferenceQueue<Object> f30668k;

    /* renamed from: l */
    final Config f30669l;

    /* renamed from: m */
    boolean f30670m;

    /* renamed from: n */
    volatile boolean f30671n;

    /* renamed from: o */
    boolean f30672o;

    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    public interface RequestTransformer {

        /* renamed from: a */
        public static final RequestTransformer f30673a = new C11842a();

        /* renamed from: com.squareup.picasso.Picasso$RequestTransformer$a */
        static class C11842a implements RequestTransformer {
            C11842a() {
            }

            public C11889s transformRequest(C11889s sVar) {
                return sVar;
            }
        }

        C11889s transformRequest(C11889s sVar);
    }

    /* renamed from: com.squareup.picasso.Picasso$a */
    static class C11843a extends Handler {
        C11843a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C11859c cVar = (C11859c) list.get(i2);
                        cVar.f30717f.mo35034a(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C11849a aVar = (C11849a) list2.get(i2);
                        aVar.f30696a.mo35036b(aVar);
                        i2++;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown handler message received: ");
                    sb.append(message.what);
                    throw new AssertionError(sb.toString());
                }
            } else {
                C11849a aVar2 = (C11849a) message.obj;
                if (aVar2.mo35058f().f30671n) {
                    C11851a0.m31113a("Main", "canceled", aVar2.f30697b.mo35144d(), "target got garbage collected");
                }
                aVar2.f30696a.m31067a(aVar2.mo35062j());
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$b */
    public static class C11844b {

        /* renamed from: a */
        private final Context f30674a;

        /* renamed from: b */
        private Downloader f30675b;

        /* renamed from: c */
        private ExecutorService f30676c;

        /* renamed from: d */
        private Cache f30677d;

        /* renamed from: e */
        private Listener f30678e;

        /* renamed from: f */
        private RequestTransformer f30679f;

        /* renamed from: g */
        private List<C11893u> f30680g;

        /* renamed from: h */
        private Config f30681h;

        /* renamed from: i */
        private boolean f30682i;

        /* renamed from: j */
        private boolean f30683j;

        public C11844b(Context context) {
            if (context != null) {
                this.f30674a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C11844b mo35041a(Config config) {
            if (config != null) {
                this.f30681h = config;
                return this;
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        }

        /* renamed from: a */
        public C11844b mo35042a(Downloader downloader) {
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.f30675b == null) {
                this.f30675b = downloader;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        /* renamed from: a */
        public C11844b mo35043a(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            } else if (this.f30676c == null) {
                this.f30676c = executorService;
                return this;
            } else {
                throw new IllegalStateException("Executor service already set.");
            }
        }

        /* renamed from: a */
        public Picasso mo35044a() {
            Context context = this.f30674a;
            if (this.f30675b == null) {
                this.f30675b = C11851a0.m31119c(context);
            }
            if (this.f30677d == null) {
                this.f30677d = new C11877j(context);
            }
            if (this.f30676c == null) {
                this.f30676c = new C11887r();
            }
            if (this.f30679f == null) {
                this.f30679f = RequestTransformer.f30673a;
            }
            C11896w wVar = new C11896w(this.f30677d);
            Context context2 = context;
            C11870g gVar = new C11870g(context2, this.f30676c, Picasso.f30656p, this.f30675b, this.f30677d, wVar);
            Picasso picasso = new Picasso(context2, gVar, this.f30677d, this.f30678e, this.f30679f, this.f30680g, wVar, this.f30681h, this.f30682i, this.f30683j);
            return picasso;
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$c */
    private static class C11845c extends Thread {

        /* renamed from: e */
        private final ReferenceQueue<Object> f30684e;

        /* renamed from: f */
        private final Handler f30685f;

        /* renamed from: com.squareup.picasso.Picasso$c$a */
        class C11846a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Exception f30686e;

            C11846a(C11845c cVar, Exception exc) {
                this.f30686e = exc;
            }

            public void run() {
                throw new RuntimeException(this.f30686e);
            }
        }

        C11845c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f30684e = referenceQueue;
            this.f30685f = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C11850a aVar = (C11850a) this.f30684e.remove(1000);
                    Message obtainMessage = this.f30685f.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f30708a;
                        this.f30685f.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f30685f.post(new C11846a(this, e));
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$d */
    public enum C11847d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: e */
        final int f30691e;

        private C11847d(int i) {
            this.f30691e = i;
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$e */
    public enum C11848e {
        LOW,
        NORMAL,
        HIGH
    }

    Picasso(Context context, C11870g gVar, Cache cache, Listener listener, RequestTransformer requestTransformer, List<C11893u> list, C11896w wVar, Config config, boolean z, boolean z2) {
        this.f30662e = context;
        this.f30663f = gVar;
        this.f30664g = cache;
        this.f30658a = listener;
        this.f30659b = requestTransformer;
        this.f30669l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C11895v(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C11866d(context));
        arrayList.add(new C11879l(context));
        arrayList.add(new C11868e(context));
        arrayList.add(new C11858b(context));
        arrayList.add(new C11875h(context));
        arrayList.add(new C11883o(gVar.f30749d, wVar));
        this.f30661d = Collections.unmodifiableList(arrayList);
        this.f30665h = wVar;
        this.f30666i = new WeakHashMap();
        this.f30667j = new WeakHashMap();
        this.f30670m = z;
        this.f30671n = z2;
        this.f30668k = new ReferenceQueue<>();
        this.f30660c = new C11845c(this.f30668k, f30656p);
        this.f30660c.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Bitmap mo35035b(String str) {
        Bitmap bitmap = this.f30664g.get(str);
        if (bitmap != null) {
            this.f30665h.mo35173b();
        } else {
            this.f30665h.mo35176c();
        }
        return bitmap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35037c(C11849a aVar) {
        this.f30663f.mo35105b(aVar);
    }

    /* renamed from: a */
    public void mo35030a(ImageView imageView) {
        m31067a((Object) imageView);
    }

    /* renamed from: a */
    public void mo35032a(Target target) {
        m31067a((Object) target);
    }

    /* renamed from: a */
    public C11892t mo35026a(Uri uri) {
        return new C11892t(this, uri, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35036b(C11849a aVar) {
        Bitmap b = C11881m.m31202a(aVar.f30700e) ? mo35035b(aVar.mo35055c()) : null;
        String str = "Main";
        if (b != null) {
            m31065a(b, C11847d.MEMORY, aVar);
            if (this.f30671n) {
                String d = aVar.f30697b.mo35144d();
                StringBuilder sb = new StringBuilder();
                sb.append("from ");
                sb.append(C11847d.MEMORY);
                C11851a0.m31113a(str, "completed", d, sb.toString());
                return;
            }
            return;
        }
        mo35033a(aVar);
        if (this.f30671n) {
            C11851a0.m31112a(str, "resumed", aVar.f30697b.mo35144d());
        }
    }

    /* renamed from: a */
    public C11892t mo35028a(String str) {
        if (str == null) {
            return new C11892t(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return mo35026a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: a */
    public C11892t mo35027a(File file) {
        if (file == null) {
            return new C11892t(this, null, 0);
        }
        return mo35026a(Uri.fromFile(file));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C11893u> mo35029a() {
        return this.f30661d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11889s mo35025a(C11889s sVar) {
        C11889s transformRequest = this.f30659b.transformRequest(sVar);
        if (transformRequest != null) {
            return transformRequest;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request transformer ");
        sb.append(this.f30659b.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(sVar);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35031a(ImageView imageView, C11869f fVar) {
        this.f30667j.put(imageView, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35033a(C11849a aVar) {
        Object j = aVar.mo35062j();
        if (!(j == null || this.f30666i.get(j) == aVar)) {
            m31067a(j);
            this.f30666i.put(j, aVar);
        }
        mo35037c(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35034a(C11859c cVar) {
        C11849a b = cVar.mo35073b();
        List c = cVar.mo35075c();
        boolean z = true;
        boolean z2 = c != null && !c.isEmpty();
        if (b == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.mo35076d().f30811d;
            Exception e = cVar.mo35077e();
            Bitmap k = cVar.mo35083k();
            C11847d g = cVar.mo35079g();
            if (b != null) {
                m31065a(k, g, b);
            }
            if (z2) {
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    m31065a(k, g, (C11849a) c.get(i));
                }
            }
            Listener listener = this.f30658a;
            if (!(listener == null || e == null)) {
                listener.onImageLoadFailed(this, uri, e);
            }
        }
    }

    /* renamed from: a */
    private void m31065a(Bitmap bitmap, C11847d dVar, C11849a aVar) {
        if (!aVar.mo35063k()) {
            if (!aVar.mo35064l()) {
                this.f30666i.remove(aVar.mo35062j());
            }
            String str = "Main";
            if (bitmap == null) {
                aVar.mo35054b();
                if (this.f30671n) {
                    C11851a0.m31112a(str, "errored", aVar.f30697b.mo35144d());
                }
            } else if (dVar != null) {
                aVar.mo35053a(bitmap, dVar);
                if (this.f30671n) {
                    String d = aVar.f30697b.mo35144d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("from ");
                    sb.append(dVar);
                    C11851a0.m31113a(str, "completed", d, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31067a(Object obj) {
        C11851a0.m31109a();
        C11849a aVar = (C11849a) this.f30666i.remove(obj);
        if (aVar != null) {
            aVar.mo35052a();
            this.f30663f.mo35098a(aVar);
        }
        if (obj instanceof ImageView) {
            C11869f fVar = (C11869f) this.f30667j.remove((ImageView) obj);
            if (fVar != null) {
                fVar.mo35094a();
            }
        }
    }

    /* renamed from: a */
    public static Picasso m31064a(Context context) {
        if (f30657q == null) {
            synchronized (Picasso.class) {
                if (f30657q == null) {
                    f30657q = new C11844b(context).mo35044a();
                }
            }
        }
        return f30657q;
    }
}
