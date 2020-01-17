package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8503n;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.C8553l;
import com.airbnb.lottie.model.content.C8573m;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.c */
public class C8474c implements DrawingContent, C8482j, AnimationListener, KeyPathElement {

    /* renamed from: a */
    private Paint f21589a;

    /* renamed from: b */
    private RectF f21590b;

    /* renamed from: c */
    private final Matrix f21591c;

    /* renamed from: d */
    private final Path f21592d;

    /* renamed from: e */
    private final RectF f21593e;

    /* renamed from: f */
    private final String f21594f;

    /* renamed from: g */
    private final boolean f21595g;

    /* renamed from: h */
    private final List<Content> f21596h;

    /* renamed from: i */
    private final C8515e f21597i;

    /* renamed from: j */
    private List<C8482j> f21598j;

    /* renamed from: k */
    private C8503n f21599k;

    public C8474c(C8515e eVar, C8586a aVar, C8573m mVar) {
        this(eVar, aVar, mVar.mo23135b(), mVar.mo23136c(), m19553a(eVar, aVar, mVar.mo23134a()), m19552a(mVar.mo23134a()));
    }

    /* renamed from: a */
    private static List<Content> m19553a(C8515e eVar, C8586a aVar, List<ContentModel> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Content content = ((ContentModel) list.get(i)).toContent(eVar, aVar);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private boolean m19554d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f21596h.size(); i2++) {
            if (this.f21596h.get(i2) instanceof DrawingContent) {
                i++;
                if (i >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        C8503n nVar = this.f21599k;
        if (nVar != null) {
            nVar.mo22919a(t, cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<C8482j> mo22885b() {
        if (this.f21598j == null) {
            this.f21598j = new ArrayList();
            for (int i = 0; i < this.f21596h.size(); i++) {
                Content content = (Content) this.f21596h.get(i);
                if (content instanceof C8482j) {
                    this.f21598j.add((C8482j) content);
                }
            }
        }
        return this.f21598j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Matrix mo22886c() {
        C8503n nVar = this.f21599k;
        if (nVar != null) {
            return nVar.mo22920b();
        }
        this.f21591c.reset();
        return this.f21591c;
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (!this.f21595g) {
            this.f21591c.set(matrix);
            C8503n nVar = this.f21599k;
            if (nVar != null) {
                this.f21591c.preConcat(nVar.mo22920b());
                i = (int) ((((((float) (this.f21599k.mo22922c() == null ? 100 : ((Integer) this.f21599k.mo22922c().mo22903f()).intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z = this.f21597i.mo23007r() && m19554d() && i != 255;
            if (z) {
                this.f21590b.set(0.0f, 0.0f, 0.0f, 0.0f);
                getBounds(this.f21590b, this.f21591c, true);
                this.f21589a.setAlpha(i);
                C8658h.m20198a(canvas, this.f21590b, this.f21589a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f21596h.size() - 1; size >= 0; size--) {
                Object obj = this.f21596h.get(size);
                if (obj instanceof DrawingContent) {
                    ((DrawingContent) obj).draw(canvas, this.f21591c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f21591c.set(matrix);
        C8503n nVar = this.f21599k;
        if (nVar != null) {
            this.f21591c.preConcat(nVar.mo22920b());
        }
        this.f21593e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f21596h.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f21596h.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).getBounds(this.f21593e, this.f21591c, z);
                rectF.union(this.f21593e);
            }
        }
    }

    public String getName() {
        return this.f21594f;
    }

    public void onValueChanged() {
        this.f21597i.invalidateSelf();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        if (eVar.mo23169c(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo23166a(getName());
                if (eVar.mo23167a(getName(), i)) {
                    list.add(eVar2.mo23165a((KeyPathElement) this));
                }
            }
            if (eVar.mo23170d(getName(), i)) {
                int b = i + eVar.mo23168b(getName(), i);
                for (int i2 = 0; i2 < this.f21596h.size(); i2++) {
                    Content content = (Content) this.f21596h.get(i2);
                    if (content instanceof KeyPathElement) {
                        ((KeyPathElement) content).resolveKeyPath(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f21596h.size());
        arrayList.addAll(list);
        for (int size = this.f21596h.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f21596h.get(size);
            content.setContents(arrayList, this.f21596h.subList(0, size));
            arrayList.add(content);
        }
    }

    C8474c(C8515e eVar, C8586a aVar, String str, boolean z, List<Content> list, C8553l lVar) {
        this.f21589a = new C8540a();
        this.f21590b = new RectF();
        this.f21591c = new Matrix();
        this.f21592d = new Path();
        this.f21593e = new RectF();
        this.f21594f = str;
        this.f21597i = eVar;
        this.f21595g = z;
        this.f21596h = list;
        if (lVar != null) {
            this.f21599k = lVar.mo23048a();
            this.f21599k.mo22918a(aVar);
            this.f21599k.mo22917a((AnimationListener) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = (Content) list.get(size);
            if (content instanceof C8479h) {
                arrayList.add((C8479h) content);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C8479h) arrayList.get(size2)).mo22887a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    static C8553l m19552a(List<ContentModel> list) {
        for (int i = 0; i < list.size(); i++) {
            ContentModel contentModel = (ContentModel) list.get(i);
            if (contentModel instanceof C8553l) {
                return (C8553l) contentModel;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Path mo22884a() {
        this.f21591c.reset();
        C8503n nVar = this.f21599k;
        if (nVar != null) {
            this.f21591c.set(nVar.mo22920b());
        }
        this.f21592d.reset();
        if (this.f21595g) {
            return this.f21592d;
        }
        for (int size = this.f21596h.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f21596h.get(size);
            if (content instanceof C8482j) {
                this.f21592d.addPath(((C8482j) content).mo22884a(), this.f21591c);
            }
        }
        return this.f21592d;
    }
}
