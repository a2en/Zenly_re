package com.facebook.drawee.backends.pipeline.info;

import android.graphics.Rect;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.info.p306g.C9582a;
import com.facebook.drawee.backends.pipeline.info.p306g.C9583b;
import com.facebook.drawee.backends.pipeline.info.p306g.C9584c;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.listener.C9735b;
import com.facebook.imagepipeline.listener.RequestListener;
import java.util.LinkedList;
import java.util.List;
import p333g.p339c.p346c.p347b.p348a.C12038d;

/* renamed from: com.facebook.drawee.backends.pipeline.info.e */
public class C9580e {

    /* renamed from: a */
    private final C12038d f24805a;

    /* renamed from: b */
    private final MonotonicClock f24806b;

    /* renamed from: c */
    private final C9581f f24807c = new C9581f();

    /* renamed from: d */
    private C9577b f24808d;

    /* renamed from: e */
    private ImageOriginListener f24809e;

    /* renamed from: f */
    private C9584c f24810f;

    /* renamed from: g */
    private C9582a f24811g;

    /* renamed from: h */
    private C9735b f24812h;

    /* renamed from: i */
    private List<ImagePerfDataListener> f24813i;

    /* renamed from: j */
    private boolean f24814j;

    public C9580e(MonotonicClock monotonicClock, C12038d dVar) {
        this.f24806b = monotonicClock;
        this.f24805a = dVar;
    }

    /* renamed from: d */
    private void m23456d() {
        if (this.f24811g == null) {
            this.f24811g = new C9582a(this.f24806b, this.f24807c, this);
        }
        if (this.f24810f == null) {
            this.f24810f = new C9584c(this.f24806b, this.f24807c);
        }
        if (this.f24809e == null) {
            this.f24809e = new C9583b(this.f24807c, this);
        }
        C9577b bVar = this.f24808d;
        if (bVar == null) {
            this.f24808d = new C9577b(this.f24805a.mo25863f(), this.f24809e);
        } else {
            bVar.mo25786a(this.f24805a.mo25863f());
        }
        if (this.f24812h == null) {
            this.f24812h = new C9735b(this.f24810f, this.f24808d);
        }
    }

    /* renamed from: a */
    public void mo25791a(boolean z) {
        this.f24814j = z;
        if (z) {
            m23456d();
            ImageOriginListener imageOriginListener = this.f24809e;
            if (imageOriginListener != null) {
                this.f24805a.mo35680a(imageOriginListener);
            }
            C9582a aVar = this.f24811g;
            if (aVar != null) {
                this.f24805a.mo25847a((ControllerListener<? super INFO>) aVar);
            }
            C9735b bVar = this.f24812h;
            if (bVar != null) {
                this.f24805a.mo35683a((RequestListener) bVar);
                return;
            }
            return;
        }
        ImageOriginListener imageOriginListener2 = this.f24809e;
        if (imageOriginListener2 != null) {
            this.f24805a.mo35686b(imageOriginListener2);
        }
        C9582a aVar2 = this.f24811g;
        if (aVar2 != null) {
            this.f24805a.mo25855b((ControllerListener<? super INFO>) aVar2);
        }
        C9735b bVar2 = this.f24812h;
        if (bVar2 != null) {
            this.f24805a.mo35687b((RequestListener) bVar2);
        }
    }

    /* renamed from: b */
    public void mo25792b() {
        List<ImagePerfDataListener> list = this.f24813i;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: c */
    public void mo25794c() {
        mo25792b();
        mo25791a(false);
        this.f24807c.mo25803b();
    }

    /* renamed from: b */
    public void mo25793b(C9581f fVar, int i) {
        fVar.mo25796a(i);
        if (this.f24814j) {
            List<ImagePerfDataListener> list = this.f24813i;
            if (list != null && !list.isEmpty()) {
                if (i == 3) {
                    mo25788a();
                }
                C9579d c = fVar.mo25808c();
                for (ImagePerfDataListener onImageLoadStatusUpdated : this.f24813i) {
                    onImageLoadStatusUpdated.onImageLoadStatusUpdated(c, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo25789a(ImagePerfDataListener imagePerfDataListener) {
        if (imagePerfDataListener != null) {
            if (this.f24813i == null) {
                this.f24813i = new LinkedList();
            }
            this.f24813i.add(imagePerfDataListener);
        }
    }

    /* renamed from: a */
    public void mo25790a(C9581f fVar, int i) {
        if (this.f24814j) {
            List<ImagePerfDataListener> list = this.f24813i;
            if (list != null && !list.isEmpty()) {
                C9579d c = fVar.mo25808c();
                for (ImagePerfDataListener onImageVisibilityUpdated : this.f24813i) {
                    onImageVisibilityUpdated.onImageVisibilityUpdated(c, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo25788a() {
        DraweeHierarchy hierarchy = this.f24805a.getHierarchy();
        if (hierarchy != null && hierarchy.getTopLevelDrawable() != null) {
            Rect bounds = hierarchy.getTopLevelDrawable().getBounds();
            this.f24807c.mo25812d(bounds.width());
            this.f24807c.mo25809c(bounds.height());
        }
    }
}
