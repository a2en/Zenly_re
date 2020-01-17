package app.zenly.android.base.view;

import android.view.View;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7655a;

/* renamed from: app.zenly.android.base.view.a */
public final class C1309a {

    /* renamed from: a */
    public static final C7655a<View> f4895a = new C1310a("scale");

    /* renamed from: app.zenly.android.base.view.a$a */
    public static final class C1310a extends C7655a<View> {
        C1310a(String str) {
            super(str);
        }

        /* renamed from: a */
        public void mo6441b(View view, float f) {
            C12932j.m33818b(view, "target");
            view.setScaleX(f);
            view.setScaleY(f);
        }

        /* renamed from: a */
        public Float get(View view) {
            C12932j.m33818b(view, "target");
            return Float.valueOf(view.getScaleX());
        }
    }

    static {
        new C1309a();
    }

    private C1309a() {
    }
}
