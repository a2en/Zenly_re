package app.zenly.locator.p143s.p155r;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;

/* renamed from: app.zenly.locator.s.r.a */
public final class C5498a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile C5498a f14118d;

    /* renamed from: e */
    public static final C5499a f14119e = new C5499a(null);

    /* renamed from: a */
    private final C5502b f14120a;

    /* renamed from: b */
    private final ContentResolver f14121b;

    /* renamed from: c */
    private final boolean f14122c;

    /* renamed from: app.zenly.locator.s.r.a$a */
    public static final class C5499a {
        private C5499a() {
        }

        /* renamed from: a */
        public final C5498a mo13125a(Context context) {
            C5498a a;
            C12932j.m33818b(context, "context");
            synchronized (C12946x.m33834a(C5498a.class)) {
                a = C5498a.f14118d;
                if (a == null) {
                    Context applicationContext = context.getApplicationContext();
                    C12932j.m33815a((Object) applicationContext, "context.applicationContext");
                    a = new C5498a(applicationContext, null);
                    C5498a.f14118d = a;
                }
            }
            return a;
        }

        public /* synthetic */ C5499a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.r.a$b */
    public enum C5500b {
        REWARD(false),
        POSITIVE(false),
        CHAT(false, 1, null),
        MAP(false, 1, null),
        ERROR(false, 1, null),
        NAV(false, 1, null);
        

        /* renamed from: e */
        private final boolean f14130e;

        private C5500b(boolean z) {
            this.f14130e = z;
        }

        /* renamed from: a */
        public final boolean mo13126a() {
            return this.f14130e;
        }
    }

    /* renamed from: app.zenly.locator.s.r.a$c */
    public enum C5501c {
        HEAVY(50, 50, 120),
        MEDIUM(20, 50, 70),
        LIGHT(5, 50, 35);
        

        /* renamed from: e */
        private final long f14135e;

        /* renamed from: f */
        private final long f14136f;

        /* renamed from: g */
        private final int f14137g;

        private C5501c(long j, long j2, int i) {
            this.f14135e = j;
            this.f14136f = j2;
            this.f14137g = i;
        }

        /* renamed from: a */
        public final int mo13127a() {
            return this.f14137g;
        }

        /* renamed from: b */
        public final long mo13128b() {
            return this.f14135e;
        }

        /* renamed from: c */
        public final long mo13129c() {
            return this.f14136f;
        }
    }

    private C5498a(Context context) {
        this.f14120a = C5502b.f14138b.mo13134a(context);
        this.f14121b = context.getContentResolver();
        this.f14122c = this.f14120a.mo13133b();
    }

    /* renamed from: a */
    public static final C5498a m15600a(Context context) {
        return f14119e.mo13125a(context);
    }

    /* renamed from: a */
    public final void mo13123a(C5501c cVar, C5500b bVar) {
        m15602a(this, cVar, bVar, 0, 4, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m15602a(C5498a aVar, C5501c cVar, C5500b bVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        aVar.mo13124a(cVar, bVar, i);
    }

    /* renamed from: a */
    public final void mo13124a(C5501c cVar, C5500b bVar, int i) {
        C12932j.m33818b(cVar, "feedbackType");
        C12932j.m33818b(bVar, "feedbackContext");
        if (this.f14122c || !bVar.mo13126a()) {
            try {
                if (!(System.getInt(this.f14121b, "haptic_feedback_enabled", 0) != 0)) {
                    return;
                }
            } catch (SettingNotFoundException unused) {
                if (bVar.mo13126a()) {
                    return;
                }
            }
            List c = C12848o.m33645c(Long.valueOf(0));
            List c2 = C12848o.m33645c(Integer.valueOf(0));
            for (int i2 = 0; i2 < i; i2++) {
                c.add(Long.valueOf(this.f14122c ? 20 : cVar.mo13128b()));
                c2.add(Integer.valueOf(cVar.mo13127a()));
                c.add(Long.valueOf(cVar.mo13129c()));
                c2.add(Integer.valueOf(0));
            }
            this.f14120a.mo13132a(C12857w.m33676c((Collection) c), C12857w.m33672b((Collection) c2), -1);
        }
    }

    public /* synthetic */ C5498a(Context context, C12928f fVar) {
        this(context);
    }
}
