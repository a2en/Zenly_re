package com.mapbox.mapboxsdk.p320n.p322b;

import com.getkeepsafe.relinker.ReLinker;
import com.getkeepsafe.relinker.ReLinker.Logger;
import com.mapbox.mapboxsdk.C11419a;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.LibraryLoaderProvider;
import com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException;

/* renamed from: com.mapbox.mapboxsdk.n.b.a */
public class C11580a implements LibraryLoaderProvider {

    /* renamed from: com.mapbox.mapboxsdk.n.b.a$b */
    private static class C11582b extends C11419a {

        /* renamed from: com.mapbox.mapboxsdk.n.b.a$b$a */
        private static class C11583a implements Logger {
            private C11583a() {
            }

            public void log(String str) {
                com.mapbox.mapboxsdk.log.Logger.m29678d("Mbgl-LibraryLoader", str);
            }
        }

        private C11582b() {
        }

        /* renamed from: a */
        public void mo33165a(String str) {
            try {
                ReLinker.m24849a(new C11583a()).mo26800a(C11451d.m29567b(), str);
            } catch (MapboxConfigurationException unused) {
                com.mapbox.mapboxsdk.log.Logger.m29680e("Mbgl-LibraryLoader", "Couldn't load so file with relinker, application context missing, call Mapbox.getInstance(Context context, String accessToken) first");
            }
        }
    }

    public C11419a getDefaultLibraryLoader() {
        return new C11582b();
    }
}
