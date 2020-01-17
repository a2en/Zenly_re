package app.zenly.locator.core.app;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12948z;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.core.app.d */
public final class C2453d {

    /* renamed from: a */
    private static long f7354a;

    /* renamed from: b */
    private static long f7355b;

    /* renamed from: c */
    public static final C2453d f7356c = new C2453d();

    private C2453d() {
    }

    /* renamed from: a */
    public static final void m8555a(boolean z) {
        C2453d dVar = f7356c;
        C12948z zVar = C12948z.f33530a;
        Locale locale = Locale.ENGLISH;
        C12932j.m33815a((Object) locale, "Locale.ENGLISH");
        Object[] objArr = {String.valueOf(z)};
        String format = String.format(locale, "onStart (deepLink: %s)", Arrays.copyOf(objArr, objArr.length));
        C12932j.m33815a((Object) format, "java.lang.String.format(locale, format, *args)");
        dVar.m8554a(format);
    }

    /* renamed from: b */
    public static final void m8556b() {
        f7354a = System.currentTimeMillis();
        f7355b = f7354a;
        f7356c.m8554a("beginTrace");
    }

    /* renamed from: c */
    public static final void m8557c() {
        f7356c.m8554a("endTrace");
        f7354a = 0;
        f7355b = 0;
    }

    /* renamed from: d */
    public static final void m8558d() {
        f7356c.m8554a("ignoreSplashView");
    }

    /* renamed from: e */
    public static final void m8559e() {
        f7356c.m8554a("onMapProviderReady");
    }

    /* renamed from: f */
    public static final void m8560f() {
        f7356c.m8554a("onMapReady");
    }

    /* renamed from: g */
    public static final void m8561g() {
        f7356c.m8554a("onReceiveFirstViewport");
    }

    /* renamed from: h */
    public static final void m8562h() {
        f7356c.m8554a("onSplashAnimationEnd");
    }

    /* renamed from: i */
    public static final void m8563i() {
        f7356c.m8554a("onSplashViewReady");
    }

    /* renamed from: j */
    public static final void m8564j() {
        f7356c.m8554a("onViewportReady");
    }

    /* renamed from: k */
    public static final void m8565k() {
        f7356c.m8554a("onViewportStreamSubscribe");
    }

    /* renamed from: l */
    public static final void m8566l() {
        f7356c.m8554a("populateMap");
    }

    /* renamed from: m */
    public static final void m8567m() {
        f7356c.m8554a("removeSplashView");
    }

    /* renamed from: n */
    public static final void m8568n() {
        f7356c.m8554a("startSplashAnimation");
    }

    /* renamed from: a */
    public static final void m8553a(int i) {
        C2453d dVar = f7356c;
        C12948z zVar = C12948z.f33530a;
        Locale locale = Locale.ENGLISH;
        C12932j.m33815a((Object) locale, "Locale.ENGLISH");
        Object[] objArr = {Integer.valueOf(i)};
        String format = String.format(locale, "onMapProviderCreate: %d", Arrays.copyOf(objArr, objArr.length));
        C12932j.m33815a((Object) format, "java.lang.String.format(locale, format, *args)");
        dVar.m8554a(format);
    }

    /* renamed from: a */
    public static final void m8552a() {
        f7356c.m8554a("addSplashView");
    }

    /* renamed from: a */
    private final void m8554a(String str) {
        if (f7354a != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - f7354a;
            long j2 = currentTimeMillis - f7355b;
            ZenlyCore a = C5448c.m15478a();
            C12948z zVar = C12948z.f33530a;
            Locale locale = Locale.ENGLISH;
            C12932j.m33815a((Object) locale, "Locale.ENGLISH");
            Object[] objArr = {str, Long.valueOf(j2), Long.valueOf(j)};
            String format = String.format(locale, "LaunchTracer -> %s (%dms / %dms)", Arrays.copyOf(objArr, objArr.length));
            C12932j.m33815a((Object) format, "java.lang.String.format(locale, format, *args)");
            a.logDebug(format);
            f7355b = currentTimeMillis;
        }
    }
}
