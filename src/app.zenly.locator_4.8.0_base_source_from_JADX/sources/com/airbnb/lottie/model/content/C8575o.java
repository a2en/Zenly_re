package com.airbnb.lottie.model.content;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8488o;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8542a;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.p284i.C8586a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.o */
public class C8575o implements ContentModel {

    /* renamed from: a */
    private final String f21976a;

    /* renamed from: b */
    private final C8543b f21977b;

    /* renamed from: c */
    private final List<C8543b> f21978c;

    /* renamed from: d */
    private final C8542a f21979d;

    /* renamed from: e */
    private final C8545d f21980e;

    /* renamed from: f */
    private final C8543b f21981f;

    /* renamed from: g */
    private final C8577b f21982g;

    /* renamed from: h */
    private final C8578c f21983h;

    /* renamed from: i */
    private final float f21984i;

    /* renamed from: j */
    private final boolean f21985j;

    /* renamed from: com.airbnb.lottie.model.content.o$a */
    static /* synthetic */ class C8576a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21986a = new int[C8577b.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f21987b = new int[C8578c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        static {
            /*
                com.airbnb.lottie.model.content.o$c[] r0 = com.airbnb.lottie.model.content.C8575o.C8578c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21987b = r0
                r0 = 1
                int[] r1 = f21987b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.o$c r2 = com.airbnb.lottie.model.content.C8575o.C8578c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f21987b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.o$c r3 = com.airbnb.lottie.model.content.C8575o.C8578c.MITER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f21987b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.model.content.o$c r4 = com.airbnb.lottie.model.content.C8575o.C8578c.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.airbnb.lottie.model.content.o$b[] r3 = com.airbnb.lottie.model.content.C8575o.C8577b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f21986a = r3
                int[] r3 = f21986a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.airbnb.lottie.model.content.o$b r4 = com.airbnb.lottie.model.content.C8575o.C8577b.BUTT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f21986a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.airbnb.lottie.model.content.o$b r3 = com.airbnb.lottie.model.content.C8575o.C8577b.ROUND     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f21986a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.airbnb.lottie.model.content.o$b r1 = com.airbnb.lottie.model.content.C8575o.C8577b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.C8575o.C8576a.<clinit>():void");
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.o$b */
    public enum C8577b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: a */
        public Cap mo23152a() {
            int i = C8576a.f21986a[ordinal()];
            if (i == 1) {
                return Cap.BUTT;
            }
            if (i != 2) {
                return Cap.SQUARE;
            }
            return Cap.ROUND;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.o$c */
    public enum C8578c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: a */
        public Join mo23153a() {
            int i = C8576a.f21987b[ordinal()];
            if (i == 1) {
                return Join.BEVEL;
            }
            if (i == 2) {
                return Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Join.ROUND;
        }
    }

    public C8575o(String str, C8543b bVar, List<C8543b> list, C8542a aVar, C8545d dVar, C8543b bVar2, C8577b bVar3, C8578c cVar, float f, boolean z) {
        this.f21976a = str;
        this.f21977b = bVar;
        this.f21978c = list;
        this.f21979d = aVar;
        this.f21980e = dVar;
        this.f21981f = bVar2;
        this.f21982g = bVar3;
        this.f21983h = cVar;
        this.f21984i = f;
        this.f21985j = z;
    }

    /* renamed from: a */
    public C8577b mo23142a() {
        return this.f21982g;
    }

    /* renamed from: b */
    public C8542a mo23143b() {
        return this.f21979d;
    }

    /* renamed from: c */
    public C8543b mo23144c() {
        return this.f21977b;
    }

    /* renamed from: d */
    public C8578c mo23145d() {
        return this.f21983h;
    }

    /* renamed from: e */
    public List<C8543b> mo23146e() {
        return this.f21978c;
    }

    /* renamed from: f */
    public float mo23147f() {
        return this.f21984i;
    }

    /* renamed from: g */
    public String mo23148g() {
        return this.f21976a;
    }

    /* renamed from: h */
    public C8545d mo23149h() {
        return this.f21980e;
    }

    /* renamed from: i */
    public C8543b mo23150i() {
        return this.f21981f;
    }

    /* renamed from: j */
    public boolean mo23151j() {
        return this.f21985j;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8488o(eVar, aVar, this);
    }
}
