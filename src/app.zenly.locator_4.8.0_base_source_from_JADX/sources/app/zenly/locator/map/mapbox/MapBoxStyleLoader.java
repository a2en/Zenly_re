package app.zenly.locator.map.mapbox;

import android.content.Context;
import android.os.AsyncTask;
import app.zenly.locator.core.util.C3227n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class MapBoxStyleLoader {

    /* renamed from: b */
    private static final List<String> f10797b = C3227n.m10229a((T[]) new String[]{"en", "es", "fr", "de", "ru", "zh"});

    /* renamed from: a */
    private final Context f10798a;

    public interface MapBoxStyleLoaderCallback {
        void onMapBoxStyleLoaded(C4123a aVar, String str, String str2);
    }

    /* renamed from: app.zenly.locator.map.mapbox.MapBoxStyleLoader$a */
    public enum C4123a {
        HYBRID("mapbox_style_hybrid_2017_03_08.json"),
        NIGHT("mapbox_style_night_2018_05_15.json"),
        STANDARD("mapbox_style_standard_2017_03_07.json"),
        ZENLY("mapbox_style_zenly_2018_04_07.json");
        

        /* renamed from: e */
        private final String f10804e;

        private C4123a(String str) {
            this.f10804e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m11872a() {
            StringBuilder sb = new StringBuilder();
            sb.append("asset://");
            sb.append(this.f10804e);
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public InputStream m11870a(Context context) throws IOException {
            return context.getAssets().open(this.f10804e);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m11877a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(this.f10804e);
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public File m11868a(Context context, String str) {
            File file = new File(context.getFilesDir(), "mapboxStyles");
            if (!file.exists()) {
                file.mkdir();
            }
            return new File(file, m11877a(str));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m11876a(File file) {
            if (!file.exists()) {
                return m11872a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            sb.append(file.getAbsolutePath());
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.map.mapbox.MapBoxStyleLoader$b */
    private static class C4124b extends AsyncTask<Void, Void, String> {

        /* renamed from: f */
        private static final HashMap<String, C4124b> f10805f = new HashMap<>();

        /* renamed from: a */
        private Context f10806a;

        /* renamed from: b */
        private String f10807b;

        /* renamed from: c */
        private final C4123a f10808c;

        /* renamed from: d */
        private final String f10809d;

        /* renamed from: e */
        private final ArrayList<MapBoxStyleLoaderCallback> f10810e = new ArrayList<>();

        private C4124b(Context context, String str, C4123a aVar, String str2, MapBoxStyleLoaderCallback mapBoxStyleLoaderCallback) {
            this.f10806a = context;
            this.f10807b = str;
            this.f10808c = aVar;
            this.f10809d = str2;
            this.f10810e.add(mapBoxStyleLoaderCallback);
        }

        /* renamed from: a */
        public static void m11878a(Context context, C4123a aVar, String str, MapBoxStyleLoaderCallback mapBoxStyleLoaderCallback) {
            synchronized (f10805f) {
                String a = aVar.m11877a(str);
                C4124b bVar = (C4124b) f10805f.get(a);
                if (bVar == null) {
                    C4124b bVar2 = new C4124b(context, a, aVar, str, mapBoxStyleLoaderCallback);
                    f10805f.put(a, bVar2);
                    bVar2.execute(new Void[0]);
                } else {
                    bVar.mo10804a(mapBoxStyleLoaderCallback);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            synchronized (f10805f) {
                f10805f.remove(this.f10807b);
            }
            synchronized (this) {
                Iterator it = this.f10810e.iterator();
                while (it.hasNext()) {
                    ((MapBoxStyleLoaderCallback) it.next()).onMapBoxStyleLoaded(this.f10808c, this.f10809d, str);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }

        /* renamed from: a */
        public synchronized void mo10804a(MapBoxStyleLoaderCallback mapBoxStyleLoaderCallback) {
            this.f10810e.add(mapBoxStyleLoaderCallback);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r4.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
            if (r0 != null) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            if (r0 != null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0029 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r4) {
            /*
                r3 = this;
                app.zenly.locator.map.mapbox.MapBoxStyleLoader$a r4 = r3.f10808c
                android.content.Context r0 = r3.f10806a
                java.lang.String r1 = r3.f10809d
                java.io.File r4 = r4.m11868a(r0, r1)
                boolean r0 = r4.exists()
                if (r0 != 0) goto L_0x0035
                r0 = 0
                app.zenly.locator.map.mapbox.MapBoxStyleLoader$a r1 = r3.f10808c     // Catch:{ IOException -> 0x0029 }
                android.content.Context r2 = r3.f10806a     // Catch:{ IOException -> 0x0029 }
                java.io.InputStream r0 = r1.m11870a(r2)     // Catch:{ IOException -> 0x0029 }
                app.zenly.locator.map.mapbox.a r1 = new app.zenly.locator.map.mapbox.a     // Catch:{ IOException -> 0x0029 }
                r1.<init>(r3)     // Catch:{ IOException -> 0x0029 }
                app.zenly.locator.core.util.FileUtil.m10158a(r0, r4, r1)     // Catch:{ IOException -> 0x0029 }
                if (r0 == 0) goto L_0x0035
            L_0x0023:
                r0.close()     // Catch:{ Exception -> 0x0035 }
                goto L_0x0035
            L_0x0027:
                r4 = move-exception
                goto L_0x002f
            L_0x0029:
                r4.delete()     // Catch:{ all -> 0x0027 }
                if (r0 == 0) goto L_0x0035
                goto L_0x0023
            L_0x002f:
                if (r0 == 0) goto L_0x0034
                r0.close()     // Catch:{ Exception -> 0x0034 }
            L_0x0034:
                throw r4
            L_0x0035:
                app.zenly.locator.map.mapbox.MapBoxStyleLoader$a r0 = r3.f10808c
                java.lang.String r4 = r0.m11876a(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.mapbox.MapBoxStyleLoader.C4124b.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* renamed from: a */
        public /* synthetic */ String mo10802a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("{name_");
            sb.append(this.f10809d);
            sb.append("}");
            return str.replaceAll("\\{name\\}", sb.toString());
        }
    }

    public MapBoxStyleLoader(Context context) {
        this.f10798a = context;
    }

    /* renamed from: a */
    public void mo10799a(C4123a aVar, MapBoxStyleLoaderCallback mapBoxStyleLoaderCallback) {
        mo10800a(aVar, Locale.getDefault().getLanguage(), mapBoxStyleLoaderCallback);
    }

    /* renamed from: a */
    public void mo10800a(C4123a aVar, String str, MapBoxStyleLoaderCallback mapBoxStyleLoaderCallback) {
        File a = aVar.m11868a(this.f10798a, str);
        if (a.exists()) {
            mapBoxStyleLoaderCallback.onMapBoxStyleLoaded(aVar, str, aVar.m11876a(a));
        } else if (!f10797b.contains(str)) {
            mapBoxStyleLoaderCallback.onMapBoxStyleLoaded(aVar, str, aVar.m11872a());
        } else {
            C4124b.m11878a(this.f10798a, aVar, str, mapBoxStyleLoaderCallback);
        }
    }
}
