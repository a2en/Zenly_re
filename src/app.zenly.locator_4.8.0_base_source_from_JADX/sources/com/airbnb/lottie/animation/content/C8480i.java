package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.C8565g;
import com.airbnb.lottie.model.content.C8565g.C8566a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.animation.content.i */
public class C8480i implements C8482j, C8479h {

    /* renamed from: a */
    private final Path f21647a = new Path();

    /* renamed from: b */
    private final Path f21648b = new Path();

    /* renamed from: c */
    private final Path f21649c = new Path();

    /* renamed from: d */
    private final String f21650d;

    /* renamed from: e */
    private final List<C8482j> f21651e = new ArrayList();

    /* renamed from: f */
    private final C8565g f21652f;

    /* renamed from: com.airbnb.lottie.animation.content.i$a */
    static /* synthetic */ class C8481a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21653a = new int[C8566a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.airbnb.lottie.model.content.g$a[] r0 = com.airbnb.lottie.model.content.C8565g.C8566a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21653a = r0
                int[] r0 = f21653a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.g$a r1 = com.airbnb.lottie.model.content.C8565g.C8566a.MERGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21653a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.g$a r1 = com.airbnb.lottie.model.content.C8565g.C8566a.ADD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f21653a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.model.content.g$a r1 = com.airbnb.lottie.model.content.C8565g.C8566a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f21653a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.airbnb.lottie.model.content.g$a r1 = com.airbnb.lottie.model.content.C8565g.C8566a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f21653a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.airbnb.lottie.model.content.g$a r1 = com.airbnb.lottie.model.content.C8565g.C8566a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C8480i.C8481a.<clinit>():void");
        }
    }

    public C8480i(C8565g gVar) {
        if (VERSION.SDK_INT >= 19) {
            this.f21650d = gVar.mo23099b();
            this.f21652f = gVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: b */
    private void m19570b() {
        for (int i = 0; i < this.f21651e.size(); i++) {
            this.f21649c.addPath(((C8482j) this.f21651e.get(i)).mo22884a());
        }
    }

    /* renamed from: a */
    public void mo22887a(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof C8482j) {
                this.f21651e.add((C8482j) content);
                listIterator.remove();
            }
        }
    }

    public String getName() {
        return this.f21650d;
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.f21651e.size(); i++) {
            ((C8482j) this.f21651e.get(i)).setContents(list, list2);
        }
    }

    /* renamed from: a */
    public Path mo22884a() {
        this.f21649c.reset();
        if (this.f21652f.mo23100c()) {
            return this.f21649c;
        }
        int i = C8481a.f21653a[this.f21652f.mo23098a().ordinal()];
        if (i == 1) {
            m19570b();
        } else if (i == 2) {
            m19569a(Op.UNION);
        } else if (i == 3) {
            m19569a(Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m19569a(Op.INTERSECT);
        } else if (i == 5) {
            m19569a(Op.XOR);
        }
        return this.f21649c;
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m19569a(Op op) {
        this.f21648b.reset();
        this.f21647a.reset();
        for (int size = this.f21651e.size() - 1; size >= 1; size--) {
            C8482j jVar = (C8482j) this.f21651e.get(size);
            if (jVar instanceof C8474c) {
                C8474c cVar = (C8474c) jVar;
                List b = cVar.mo22885b();
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    Path a = ((C8482j) b.get(size2)).mo22884a();
                    a.transform(cVar.mo22886c());
                    this.f21648b.addPath(a);
                }
            } else {
                this.f21648b.addPath(jVar.mo22884a());
            }
        }
        C8482j jVar2 = (C8482j) this.f21651e.get(0);
        if (jVar2 instanceof C8474c) {
            C8474c cVar2 = (C8474c) jVar2;
            List b2 = cVar2.mo22885b();
            for (int i = 0; i < b2.size(); i++) {
                Path a2 = ((C8482j) b2.get(i)).mo22884a();
                a2.transform(cVar2.mo22886c());
                this.f21647a.addPath(a2);
            }
        } else {
            this.f21647a.set(jVar2.mo22884a());
        }
        this.f21649c.op(this.f21647a, this.f21648b, op);
    }
}
