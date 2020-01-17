package app.zenly.locator.p143s.p151o.p152c;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7656b;

/* renamed from: app.zenly.locator.s.o.c.a */
public final class C5467a {

    /* renamed from: a */
    public static final C7656b<Drawable> f14066a = new C5468a("alpha");

    /* renamed from: b */
    public static final C5467a f14067b = new C5467a();

    /* renamed from: app.zenly.locator.s.o.c.a$a */
    public static final class C5468a extends C7656b<Drawable> {
        C5468a(String str) {
            super(str);
        }

        /* renamed from: a */
        public void mo6445b(Drawable drawable, int i) {
            C12932j.m33818b(drawable, "target");
            drawable.setAlpha(i);
        }

        /* renamed from: a */
        public Integer get(Drawable drawable) {
            C12932j.m33818b(drawable, "target");
            return Integer.valueOf(drawable.getAlpha());
        }
    }

    /* renamed from: app.zenly.locator.s.o.c.a$b */
    public static final class C5469b extends Property<Drawable, Rect> {

        /* renamed from: a */
        final /* synthetic */ Rect f14068a;

        C5469b(Rect rect, Class cls, String str) {
            this.f14068a = rect;
            super(cls, str);
        }

        /* renamed from: a */
        public void set(Drawable drawable, Rect rect) {
            C12932j.m33818b(drawable, "target");
            C12932j.m33818b(rect, "value");
            drawable.setBounds(rect);
        }

        /* renamed from: a */
        public Rect get(Drawable drawable) {
            C12932j.m33818b(drawable, "target");
            this.f14068a.set(drawable.getBounds());
            return this.f14068a;
        }
    }

    private C5467a() {
    }

    /* renamed from: a */
    public final Property<Drawable, Rect> mo13086a(Rect rect) {
        C12932j.m33818b(rect, "reuseRect");
        return new C5469b(rect, Rect.class, "bounds");
    }
}
