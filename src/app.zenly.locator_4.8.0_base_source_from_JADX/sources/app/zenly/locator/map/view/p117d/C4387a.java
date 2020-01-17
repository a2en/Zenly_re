package app.zenly.locator.map.view.p117d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.PointF;
import android.util.SizeF;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.p072ui.view.particles.C3180h;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.map.C4409z0;
import app.zenly.locator.map.p109i1.C4028l1;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12943u;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.map.view.d.a */
public final class C4387a {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Bitmap f11849h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Bitmap f11850i;

    /* renamed from: a */
    private final ZenlySchedulers f11851a = C1351e.m6372a(C4409z0.f11896b.mo19916a("smokeHelper"));

    /* renamed from: b */
    private final C12789c<C4395f> f11852b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3180h f11853c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final PointF f11854d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ParticleView f11855e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f11856f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4028l1 f11857g;

    /* renamed from: app.zenly.locator.map.view.d.a$a */
    static final class C4388a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4387a f11858e;

        /* renamed from: app.zenly.locator.map.view.d.a$a$a */
        static final class C4389a<T, R> implements Function<Throwable, ObservableSource<? extends Bitmap>> {

            /* renamed from: e */
            public static final C4389a f11859e = new C4389a();

            C4389a() {
            }

            /* renamed from: a */
            public final C12279e<Bitmap> apply(Throwable th) {
                C12932j.m33818b(th, "th");
                return C12279e.m32633q();
            }
        }

        /* renamed from: app.zenly.locator.map.view.d.a$a$b */
        static final class C4390b<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C12943u f11860e;

            /* renamed from: f */
            final /* synthetic */ C4395f f11861f;

            C4390b(C12943u uVar, C4395f fVar) {
                this.f11860e = uVar;
                this.f11861f = fVar;
            }

            /* renamed from: a */
            public final C12279e<Bitmap> apply(Bitmap bitmap) {
                C12932j.m33818b(bitmap, "it");
                C12943u uVar = this.f11860e;
                if (!uVar.f33526e) {
                    return C12279e.m32626e(bitmap);
                }
                uVar.f33526e = false;
                List c = C12848o.m33645c(C4387a.f11850i);
                Bitmap c2 = this.f11861f.mo11526c();
                if (c2 != null) {
                    c.add(c2);
                }
                c.add(bitmap);
                return C12279e.m32623b((Iterable<? extends T>) c);
            }
        }

        C4388a(C4387a aVar) {
            this.f11858e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Bitmap> apply(C4395f fVar) {
            C12932j.m33818b(fVar, "inputData");
            List c = C12848o.m33645c(C4387a.f11850i, fVar.mo11525b());
            Bitmap c2 = fVar.mo11526c();
            if (c2 != null) {
                c.add(c2);
            }
            if (fVar.mo11525b() == null) {
                return C12279e.m32626e(C4387a.f11849h);
            }
            if (fVar.mo11524a() == null) {
                return C12279e.m32623b((Iterable<? extends T>) c);
            }
            C12943u uVar = new C12943u();
            uVar.f33526e = C12932j.m33817a((Object) fVar.mo11525b(), (Object) fVar.mo11524a().mo8961a());
            return this.f11858e.f11857g.mo10664a(fVar.mo11524a().mo8962b()).mo36502j(C4389a.f11859e).mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) new C4390b<Object,Object>(uVar, fVar)).mo36439a((Iterable<? extends T>) c);
        }
    }

    /* renamed from: app.zenly.locator.map.view.d.a$b */
    static final class C4391b<T> implements Consumer<Bitmap> {

        /* renamed from: e */
        final /* synthetic */ C4387a f11862e;

        C4391b(C4387a aVar) {
            this.f11862e = aVar;
        }

        /* renamed from: a */
        public final void accept(Bitmap bitmap) {
            if (C12932j.m33817a((Object) bitmap, (Object) C4387a.f11850i) || C12932j.m33817a((Object) bitmap, (Object) C4387a.f11849h)) {
                C3180h b = this.f11862e.f11853c;
                if (b != null) {
                    b.mo9493a(C12932j.m33817a((Object) bitmap, (Object) C4387a.f11849h));
                }
                this.f11862e.f11853c = null;
            } else if (this.f11862e.f11853c == null) {
                C4387a aVar = this.f11862e;
                PointF c = aVar.f11854d;
                int i = C2890k.f8177c;
                aVar.f11853c = new C3180h(c, new SizeF((float) i, (float) i));
                C3180h b2 = this.f11862e.f11853c;
                if (b2 != null) {
                    b2.mo9489a(bitmap, 1);
                }
                C3180h b3 = this.f11862e.f11853c;
                if (b3 != null) {
                    b3.mo9486a(this.f11862e.f11856f);
                }
                this.f11862e.f11855e.mo9542a((ParticleAnimation) this.f11862e.f11853c);
                C3180h b4 = this.f11862e.f11853c;
                if (b4 != null) {
                    b4.mo9509q();
                }
            } else {
                C3180h b5 = this.f11862e.f11853c;
                if (b5 != null) {
                    b5.mo9489a(bitmap, 1);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.d.a$c */
    static final class C4392c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4392c f11863e = new C4392c();

        C4392c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "SmokeAnimationHelper onError", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.map.view.d.a$d */
    static final class C4393d implements Action {

        /* renamed from: a */
        public static final C4393d f11864a = new C4393d();

        C4393d() {
        }

        public final void run() {
            C12143a.m32027a("SmokeAnimationHelper onComplete", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.map.view.d.a$e */
    public static final class C4394e {
        private C4394e() {
        }

        public /* synthetic */ C4394e(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.view.d.a$f */
    private static final class C4395f {

        /* renamed from: a */
        private final Bitmap f11865a;

        /* renamed from: b */
        private final C2890k f11866b;

        /* renamed from: c */
        private final Bitmap f11867c;

        public C4395f(Bitmap bitmap, C2890k kVar, Bitmap bitmap2) {
            this.f11865a = bitmap;
            this.f11866b = kVar;
            this.f11867c = bitmap2;
        }

        /* renamed from: a */
        public final C2890k mo11524a() {
            return this.f11866b;
        }

        /* renamed from: b */
        public final Bitmap mo11525b() {
            return this.f11865a;
        }

        /* renamed from: c */
        public final Bitmap mo11526c() {
            return this.f11867c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f11867c, (java.lang.Object) r3.f11867c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof app.zenly.locator.map.view.p117d.C4387a.C4395f
                if (r0 == 0) goto L_0x0027
                app.zenly.locator.map.view.d.a$f r3 = (app.zenly.locator.map.view.p117d.C4387a.C4395f) r3
                android.graphics.Bitmap r0 = r2.f11865a
                android.graphics.Bitmap r1 = r3.f11865a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x0027
                app.zenly.locator.core.models.k r0 = r2.f11866b
                app.zenly.locator.core.models.k r1 = r3.f11866b
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x0027
                android.graphics.Bitmap r0 = r2.f11867c
                android.graphics.Bitmap r3 = r3.f11867c
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.view.p117d.C4387a.C4395f.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Bitmap bitmap = this.f11865a;
            int i = 0;
            int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
            C2890k kVar = this.f11866b;
            int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
            Bitmap bitmap2 = this.f11867c;
            if (bitmap2 != null) {
                i = bitmap2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InputData(mainIcon=");
            sb.append(this.f11865a);
            sb.append(", bubble=");
            sb.append(this.f11866b);
            sb.append(", otherBitmap=");
            sb.append(this.f11867c);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        new C4394e(null);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ALPHA_8);
        if (createBitmap != null) {
            f11849h = createBitmap;
            Bitmap createBitmap2 = Bitmap.createBitmap(1, 1, Config.ALPHA_8);
            if (createBitmap2 != null) {
                f11850i = createBitmap2;
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    public C4387a(ParticleView particleView, int i, C4028l1 l1Var) {
        C12932j.m33818b(particleView, "particleView");
        C12932j.m33818b(l1Var, "bubbleMediaLoader");
        this.f11855e = particleView;
        this.f11856f = i;
        this.f11857g = l1Var;
        C12789c<C4395f> s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create<InputData>()");
        this.f11852b = s;
        this.f11854d = new PointF();
        C12932j.m33815a((Object) this.f11852b.mo36477d().mo36509m(new C4388a(this)).mo36428a((C12286f) this.f11851a.getMainThread()).mo36413a((Consumer<? super T>) new C4391b<Object>(this), (Consumer<? super Throwable>) C4392c.f11863e, (Action) C4393d.f11864a), "inputDataObservable\n    …          }\n            )");
    }

    /* renamed from: a */
    public final void mo11517a(float f, float f2) {
        this.f11854d.set(f, f2);
        C3180h hVar = this.f11853c;
        if (hVar != null) {
            hVar.mo9598a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo11518a(Bitmap bitmap, C2890k kVar, Bitmap bitmap2) {
        this.f11852b.onNext(new C4395f(bitmap, kVar, bitmap2));
    }
}
