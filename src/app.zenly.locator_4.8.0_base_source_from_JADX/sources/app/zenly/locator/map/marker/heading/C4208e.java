package app.zenly.locator.map.marker.heading;

import android.content.Context;
import android.graphics.RectF;
import android.widget.FrameLayout.LayoutParams;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView.C4193d;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

/* renamed from: app.zenly.locator.map.marker.heading.e */
public final class C4208e extends C4178e0<HeadingPlaceMarkerView> {

    /* renamed from: A */
    private C4213b f11287A = C4213b.UNKNOWN;

    /* renamed from: B */
    private C4193d f11288B = C4193d.NONE;

    /* renamed from: C */
    private float f11289C = 0.5f;

    /* renamed from: D */
    private float f11290D = 0.5f;

    /* renamed from: z */
    private C4209a f11291z = C4211b.f11294a;

    /* renamed from: app.zenly.locator.map.marker.heading.e$a */
    public static abstract class C4209a {

        /* renamed from: app.zenly.locator.map.marker.heading.e$a$a */
        public static final class C4210a extends C4209a {

            /* renamed from: a */
            private final String f11292a;

            /* renamed from: b */
            private final long f11293b;

            public C4210a(String str, long j) {
                super(null);
                this.f11292a = str;
                this.f11293b = j;
            }

            /* renamed from: a */
            public final String mo11202a() {
                return this.f11292a;
            }

            /* renamed from: b */
            public final long mo11203b() {
                return this.f11293b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C4210a) {
                        C4210a aVar = (C4210a) obj;
                        if (C12932j.m33817a((Object) this.f11292a, (Object) aVar.f11292a)) {
                            if (this.f11293b == aVar.f11293b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f11292a;
                return ((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.f11293b).hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Left(name=");
                sb.append(this.f11292a);
                sb.append(", time=");
                sb.append(this.f11293b);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: app.zenly.locator.map.marker.heading.e$a$b */
        public static final class C4211b extends C4209a {

            /* renamed from: a */
            public static final C4211b f11294a = new C4211b();

            private C4211b() {
                super(null);
            }
        }

        /* renamed from: app.zenly.locator.map.marker.heading.e$a$c */
        public static final class C4212c extends C4209a {

            /* renamed from: a */
            private final String f11295a;

            /* renamed from: b */
            private final long f11296b;

            public C4212c(String str, long j) {
                super(null);
                this.f11295a = str;
                this.f11296b = j;
            }

            /* renamed from: a */
            public final String mo11207a() {
                return this.f11295a;
            }

            /* renamed from: b */
            public final long mo11208b() {
                return this.f11296b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C4212c) {
                        C4212c cVar = (C4212c) obj;
                        if (C12932j.m33817a((Object) this.f11295a, (Object) cVar.f11295a)) {
                            if (this.f11296b == cVar.f11296b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f11295a;
                return ((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.f11296b).hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("ShouldArrive(name=");
                sb.append(this.f11295a);
                sb.append(", time=");
                sb.append(this.f11296b);
                sb.append(")");
                return sb.toString();
            }
        }

        private C4209a() {
        }

        public /* synthetic */ C4209a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.e$b */
    public enum C4213b {
        HOME(2131951618, 104, 104, 0.5f, 0.92f),
        SCHOOL(2131951619, 104, 104, 0.25f, 0.91f),
        WORK(2131951620, 104, 104, 0.4f, 0.87f),
        UNKNOWN(2131951617, 104, 104, 0.5f, 0.86f);
        

        /* renamed from: e */
        private final int f11302e;

        /* renamed from: f */
        private final int f11303f;

        /* renamed from: g */
        private final int f11304g;

        /* renamed from: h */
        private final float f11305h;

        /* renamed from: i */
        private final float f11306i;

        private C4213b(int i, int i2, int i3, float f, float f2) {
            this.f11302e = i;
            this.f11303f = i2;
            this.f11304g = i3;
            this.f11305h = f;
            this.f11306i = f2;
        }

        /* renamed from: a */
        public final float mo11212a() {
            return this.f11305h;
        }

        /* renamed from: b */
        public final float mo11213b() {
            return this.f11306i;
        }

        /* renamed from: c */
        public final int mo11214c() {
            return this.f11302e;
        }

        /* renamed from: d */
        public final int mo11215d() {
            return this.f11304g;
        }

        /* renamed from: e */
        public final int mo11216e() {
            return this.f11303f;
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.e$c */
    static final class C4214c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4208e f11307f;

        C4214c(C4208e eVar) {
            this.f11307f = eVar;
            super(0);
        }

        public final void invoke() {
            this.f11307f.m12540J();
        }
    }

    public C4208e(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "uuid");
        super(context, str);
        mo11092a(1.0f);
        mo11111f(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m12540J() {
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        float anchorX = headingPlaceMarkerView != null ? headingPlaceMarkerView.getAnchorX() : this.f11289C;
        HeadingPlaceMarkerView headingPlaceMarkerView2 = (HeadingPlaceMarkerView) mo11112g();
        float anchorY = headingPlaceMarkerView2 != null ? headingPlaceMarkerView2.getAnchorY() : this.f11290D;
        if (anchorX != this.f11289C || anchorY != this.f11290D) {
            this.f11289C = anchorX;
            this.f11290D = anchorY;
            mo11085C();
        }
    }

    /* renamed from: I */
    public void mo11062I() {
        super.mo11062I();
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        if (headingPlaceMarkerView != null) {
            headingPlaceMarkerView.setPlace(null);
            headingPlaceMarkerView.setOnAnchorChange(null);
        }
    }

    /* renamed from: d */
    public float mo11069d() {
        return this.f11289C;
    }

    /* renamed from: e */
    public float mo11070e() {
        return this.f11290D;
    }

    /* renamed from: n */
    public RectF mo11115n() {
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        if (headingPlaceMarkerView != null) {
            RectF touchRect = headingPlaceMarkerView.getTouchRect();
            if (touchRect != null) {
                return touchRect;
            }
        }
        return new RectF();
    }

    /* renamed from: a */
    public final void mo11200a(C4209a aVar) {
        C12932j.m33818b(aVar, "value");
        this.f11291z = aVar;
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        if (headingPlaceMarkerView != null) {
            headingPlaceMarkerView.setInfo(aVar);
        }
    }

    /* renamed from: r */
    public HeadingPlaceMarkerView m12551r() {
        C7707a.m18761b("map:create:PlaceMarkerView");
        try {
            Context f = mo11110f();
            C12932j.m33815a((Object) f, "context");
            HeadingPlaceMarkerView headingPlaceMarkerView = new HeadingPlaceMarkerView(f, null, 0, 6, null);
            headingPlaceMarkerView.setLayoutParams(new LayoutParams(-2, -2));
            return headingPlaceMarkerView;
        } finally {
            C7707a.m18759a();
        }
    }

    /* renamed from: a */
    public final void mo11201a(C4213b bVar) {
        C12932j.m33818b(bVar, "value");
        this.f11287A = bVar;
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        if (headingPlaceMarkerView != null) {
            headingPlaceMarkerView.setPlace(bVar);
        }
    }

    /* renamed from: a */
    public final void mo11199a(C4193d dVar) {
        C12932j.m33818b(dVar, "value");
        this.f11288B = dVar;
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        if (headingPlaceMarkerView != null) {
            headingPlaceMarkerView.setCalloutVisibility(dVar);
        }
    }

    /* renamed from: a */
    public void mo11033a() {
        HeadingPlaceMarkerView headingPlaceMarkerView = (HeadingPlaceMarkerView) mo11112g();
        if (headingPlaceMarkerView != null) {
            headingPlaceMarkerView.setPlace(this.f11287A);
            headingPlaceMarkerView.setInfo(this.f11291z);
            mo11199a(this.f11288B);
            headingPlaceMarkerView.setOnAnchorChange(new C4214c(this));
        }
        m12540J();
    }
}
