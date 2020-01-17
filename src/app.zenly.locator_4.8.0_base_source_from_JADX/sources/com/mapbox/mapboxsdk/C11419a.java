package com.mapbox.mapboxsdk;

import com.mapbox.mapboxsdk.log.Logger;

/* renamed from: com.mapbox.mapboxsdk.a */
public abstract class C11419a {

    /* renamed from: a */
    private static final C11419a f29534a = C11451d.m29568c().createLibraryLoaderProvider().getDefaultLibraryLoader();

    /* renamed from: b */
    private static volatile C11419a f29535b = f29534a;

    /* renamed from: c */
    private static boolean f29536c;

    /* renamed from: a */
    public static void m29393a() {
        try {
            if (!f29536c) {
                f29536c = true;
                f29535b.mo33165a("mapbox-gl");
            }
        } catch (UnsatisfiedLinkError e) {
            f29536c = false;
            String str = "Failed to load native shared library.";
            Logger.m29681e("Mbgl-LibraryLoader", str, e);
            C11445b.m29551a(str, e);
        }
    }

    /* renamed from: a */
    public abstract void mo33165a(String str);
}
