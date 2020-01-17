package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.C8867j;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p300n.C9202d;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.C9220a;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.target.C9230c;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class GifFrameLoader {

    /* renamed from: a */
    private final GifDecoder f23741a;

    /* renamed from: b */
    private final Handler f23742b;

    /* renamed from: c */
    private final List<FrameCallback> f23743c;

    /* renamed from: d */
    final C8867j f23744d;

    /* renamed from: e */
    private final BitmapPool f23745e;

    /* renamed from: f */
    private boolean f23746f;

    /* renamed from: g */
    private boolean f23747g;

    /* renamed from: h */
    private boolean f23748h;

    /* renamed from: i */
    private C8865i<Bitmap> f23749i;

    /* renamed from: j */
    private C9149a f23750j;

    /* renamed from: k */
    private boolean f23751k;

    /* renamed from: l */
    private C9149a f23752l;

    /* renamed from: m */
    private Bitmap f23753m;

    /* renamed from: n */
    private C9149a f23754n;

    /* renamed from: o */
    private C9151c f23755o;

    /* renamed from: p */
    private int f23756p;

    /* renamed from: q */
    private int f23757q;

    /* renamed from: r */
    private int f23758r;

    public interface FrameCallback {
        void onFrameReady();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$a */
    static class C9149a extends C9230c<Bitmap> {

        /* renamed from: h */
        private final Handler f23759h;

        /* renamed from: i */
        final int f23760i;

        /* renamed from: j */
        private final long f23761j;

        /* renamed from: k */
        private Bitmap f23762k;

        C9149a(Handler handler, int i, long j) {
            this.f23759h = handler;
            this.f23760i = i;
            this.f23761j = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Bitmap mo24682a() {
            return this.f23762k;
        }

        public void onLoadCleared(Drawable drawable) {
            this.f23762k = null;
        }

        /* renamed from: a */
        public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
            this.f23762k = bitmap;
            this.f23759h.sendMessageAtTime(this.f23759h.obtainMessage(1, this), this.f23761j);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$b */
    private class C9150b implements Callback {
        C9150b() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GifFrameLoader.this.mo24671a((C9149a) message.obj);
                return true;
            }
            if (i == 2) {
                GifFrameLoader.this.f23744d.mo24177a((Target<?>) (C9149a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$c */
    interface C9151c {
        void onFrameReady();
    }

    GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i, int i2, Transformation<Bitmap> transformation, Bitmap bitmap) {
        this(glide.mo24091c(), Glide.m21139d(glide.mo24093e()), gifDecoder, null, m21904a(Glide.m21139d(glide.mo24093e()), i, i2), transformation, bitmap);
    }

    /* renamed from: j */
    private static Key m21905j() {
        return new C9202d(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    private void m21906k() {
        if (this.f23746f && !this.f23747g) {
            if (this.f23748h) {
                C9216j.m22087a(this.f23754n == null, "Pending target must be null when starting from the first frame");
                this.f23741a.resetFrameIndex();
                this.f23748h = false;
            }
            C9149a aVar = this.f23754n;
            if (aVar != null) {
                this.f23754n = null;
                mo24671a(aVar);
                return;
            }
            this.f23747g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f23741a.getNextDelay());
            this.f23741a.advance();
            this.f23752l = new C9149a(this.f23742b, this.f23741a.getCurrentFrameIndex(), uptimeMillis);
            this.f23749i.m21234a((C9220a<?>) C9224d.m22183b(m21905j())).mo8533a((Object) this.f23741a).mo24171a(this.f23752l);
        }
    }

    /* renamed from: l */
    private void m21907l() {
        Bitmap bitmap = this.f23753m;
        if (bitmap != null) {
            this.f23745e.put(bitmap);
            this.f23753m = null;
        }
    }

    /* renamed from: m */
    private void m21908m() {
        if (!this.f23746f) {
            this.f23746f = true;
            this.f23751k = false;
            m21906k();
        }
    }

    /* renamed from: n */
    private void m21909n() {
        this.f23746f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24669a(Transformation<Bitmap> transformation, Bitmap bitmap) {
        C9216j.m22083a(transformation);
        Transformation transformation2 = transformation;
        C9216j.m22083a(bitmap);
        this.f23753m = bitmap;
        this.f23749i = this.f23749i.m21234a(new C9224d().mo8516a(transformation));
        this.f23756p = C9217k.m22093a(bitmap);
        this.f23757q = bitmap.getWidth();
        this.f23758r = bitmap.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24673b(FrameCallback frameCallback) {
        this.f23743c.remove(frameCallback);
        if (this.f23743c.isEmpty()) {
            m21909n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Bitmap mo24674c() {
        C9149a aVar = this.f23750j;
        return aVar != null ? aVar.mo24682a() : this.f23753m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo24675d() {
        C9149a aVar = this.f23750j;
        if (aVar != null) {
            return aVar.f23760i;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Bitmap mo24676e() {
        return this.f23753m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo24677f() {
        return this.f23741a.getFrameCount();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo24678g() {
        return this.f23758r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo24679h() {
        return this.f23741a.getByteSize() + this.f23756p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo24680i() {
        return this.f23757q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ByteBuffer mo24672b() {
        return this.f23741a.getData().asReadOnlyBuffer();
    }

    GifFrameLoader(BitmapPool bitmapPool, C8867j jVar, GifDecoder gifDecoder, Handler handler, C8865i<Bitmap> iVar, Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.f23743c = new ArrayList();
        this.f23744d = jVar;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C9150b());
        }
        this.f23745e = bitmapPool;
        this.f23742b = handler;
        this.f23749i = iVar;
        this.f23741a = gifDecoder;
        mo24669a(transformation, bitmap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24670a(FrameCallback frameCallback) {
        if (this.f23751k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f23743c.contains(frameCallback)) {
            boolean isEmpty = this.f23743c.isEmpty();
            this.f23743c.add(frameCallback);
            if (isEmpty) {
                m21908m();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24668a() {
        this.f23743c.clear();
        m21907l();
        m21909n();
        C9149a aVar = this.f23750j;
        if (aVar != null) {
            this.f23744d.mo24177a((Target<?>) aVar);
            this.f23750j = null;
        }
        C9149a aVar2 = this.f23752l;
        if (aVar2 != null) {
            this.f23744d.mo24177a((Target<?>) aVar2);
            this.f23752l = null;
        }
        C9149a aVar3 = this.f23754n;
        if (aVar3 != null) {
            this.f23744d.mo24177a((Target<?>) aVar3);
            this.f23754n = null;
        }
        this.f23741a.clear();
        this.f23751k = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24671a(C9149a aVar) {
        C9151c cVar = this.f23755o;
        if (cVar != null) {
            cVar.onFrameReady();
        }
        this.f23747g = false;
        if (this.f23751k) {
            this.f23742b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f23746f) {
            this.f23754n = aVar;
        } else {
            if (aVar.mo24682a() != null) {
                m21907l();
                C9149a aVar2 = this.f23750j;
                this.f23750j = aVar;
                for (int size = this.f23743c.size() - 1; size >= 0; size--) {
                    ((FrameCallback) this.f23743c.get(size)).onFrameReady();
                }
                if (aVar2 != null) {
                    this.f23742b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m21906k();
        }
    }

    /* renamed from: a */
    private static C8865i<Bitmap> m21904a(C8867j jVar, int i, int i2) {
        return jVar.mo8543a().m21234a(((C9224d) ((C9224d) C9224d.m22185b(C8978i.f23424b).mo8523b(true)).mo8521a(true)).mo8512a(i, i2));
    }
}
