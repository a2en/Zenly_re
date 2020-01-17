package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.AsyncTask;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Style {

    /* renamed from: a */
    private final C11550m f29805a;

    /* renamed from: b */
    private final HashMap<String, Source> f29806b;

    /* renamed from: c */
    private final HashMap<String, Layer> f29807c;

    /* renamed from: d */
    private final HashMap<String, Bitmap> f29808d;

    /* renamed from: e */
    private final C11511c f29809e;

    /* renamed from: f */
    private boolean f29810f;

    public interface OnStyleLoaded {
        void onStyleLoaded(Style style);
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.Style$b */
    private static class C11510b extends AsyncTask<C11512a, Void, List<Image>> {

        /* renamed from: a */
        private WeakReference<C11550m> f29811a;

        C11510b(C11550m mVar) {
            this.f29811a = new WeakReference<>(mVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Image> doInBackground(C11512a... aVarArr) {
            ArrayList arrayList = new ArrayList();
            for (C11512a aVar : aVarArr) {
                String str = aVar.f29819b;
                Bitmap bitmap = aVar.f29818a;
                boolean z = aVar.f29820c;
                Config config = bitmap.getConfig();
                Config config2 = Config.ARGB_8888;
                if (config != config2) {
                    bitmap = bitmap.copy(config2, false);
                }
                ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(allocate);
                Image image = new Image(allocate.array(), ((float) bitmap.getDensity()) / 160.0f, str, bitmap.getWidth(), bitmap.getHeight(), z);
                arrayList.add(image);
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(List<Image> list) {
            super.onPostExecute(list);
            C11550m mVar = (C11550m) this.f29811a.get();
            if (mVar != null && !mVar.mo33719d()) {
                mVar.mo33702a((Image[]) list.toArray(new Image[list.size()]));
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.Style$c */
    public static class C11511c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<Source> f29812a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<C11516e> f29813b = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final List<C11512a> f29814c = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TransitionOptions f29815d;

        /* renamed from: e */
        private String f29816e;

        /* renamed from: f */
        private String f29817f;

        /* renamed from: com.mapbox.mapboxsdk.maps.Style$c$a */
        static class C11512a {

            /* renamed from: a */
            Bitmap f29818a;

            /* renamed from: b */
            String f29819b;

            /* renamed from: c */
            boolean f29820c;

            C11512a(String str, Bitmap bitmap, boolean z) {
                this.f29819b = str;
                this.f29818a = bitmap;
                this.f29820c = z;
            }
        }

        /* renamed from: com.mapbox.mapboxsdk.maps.Style$c$b */
        class C11513b extends C11516e {

            /* renamed from: b */
            String f29821b;
        }

        /* renamed from: com.mapbox.mapboxsdk.maps.Style$c$c */
        class C11514c extends C11516e {

            /* renamed from: b */
            int f29822b;
        }

        /* renamed from: com.mapbox.mapboxsdk.maps.Style$c$d */
        class C11515d extends C11516e {

            /* renamed from: b */
            String f29823b;
        }

        /* renamed from: com.mapbox.mapboxsdk.maps.Style$c$e */
        class C11516e {

            /* renamed from: a */
            Layer f29824a;
        }

        /* renamed from: a */
        public C11511c mo33769a(String str) {
            this.f29816e = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo33772b() {
            return this.f29816e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo33771a() {
            return this.f29817f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Style mo33770a(C11550m mVar) {
            return new Style(this, mVar);
        }
    }

    /* renamed from: a */
    public void mo33757a(Source source) {
        m29920d("addSource");
        this.f29805a.mo33697a(source);
        this.f29806b.put(source.getId(), source);
    }

    /* renamed from: b */
    public List<Source> mo33759b() {
        m29920d("getSources");
        return this.f29805a.mo33704b();
    }

    /* renamed from: c */
    public boolean mo33763c(String str) {
        m29920d("removeSource");
        this.f29806b.remove(str);
        return this.f29805a.mo33715c(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo33764d() {
        if (!this.f29810f) {
            this.f29810f = true;
            for (Source a : this.f29809e.f29812a) {
                mo33757a(a);
            }
            for (C11516e eVar : this.f29809e.f29813b) {
                if (eVar instanceof C11514c) {
                    mo33754a(eVar.f29824a, ((C11514c) eVar).f29822b);
                } else if (eVar instanceof C11513b) {
                    mo33755a(eVar.f29824a, ((C11513b) eVar).f29821b);
                } else if (eVar instanceof C11515d) {
                    mo33760b(eVar.f29824a, ((C11515d) eVar).f29823b);
                } else {
                    mo33760b(eVar.f29824a, "com.mapbox.annotations.points");
                }
            }
            for (C11512a aVar : this.f29809e.f29814c) {
                mo33758a(aVar.f29819b, aVar.f29818a, aVar.f29820c);
            }
            if (this.f29809e.f29815d != null) {
                mo33756a(this.f29809e.f29815d);
            }
        }
    }

    private Style(C11511c cVar, C11550m mVar) {
        this.f29806b = new HashMap<>();
        this.f29807c = new HashMap<>();
        this.f29808d = new HashMap<>();
        this.f29809e = cVar;
        this.f29805a = mVar;
    }

    /* renamed from: b */
    public void mo33760b(Layer layer, String str) {
        m29920d("addLayerBelow");
        this.f29805a.mo33706b(layer, str);
        this.f29807c.put(layer.mo34130b(), layer);
    }

    /* renamed from: a */
    public void mo33753a(Layer layer) {
        m29920d("addLayer");
        this.f29805a.mo33693a(layer);
        this.f29807c.put(layer.mo34130b(), layer);
    }

    /* renamed from: c */
    public boolean mo33762c() {
        return this.f29810f;
    }

    /* renamed from: b */
    public boolean mo33761b(String str) {
        m29920d("removeLayer");
        this.f29807c.remove(str);
        return this.f29805a.mo33723f(str);
    }

    /* renamed from: a */
    public void mo33755a(Layer layer, String str) {
        m29920d("addLayerAbove");
        this.f29805a.mo33695a(layer, str);
        this.f29807c.put(layer.mo34130b(), layer);
    }

    /* renamed from: a */
    public void mo33754a(Layer layer, int i) {
        m29920d("addLayerAbove");
        this.f29805a.mo33694a(layer, i);
        this.f29807c.put(layer.mo34130b(), layer);
    }

    /* renamed from: a */
    public Layer mo33751a(String str) {
        m29920d("getLayer");
        Layer layer = (Layer) this.f29807c.get(str);
        return layer == null ? this.f29805a.mo33717d(str) : layer;
    }

    /* renamed from: a */
    public void mo33758a(String str, Bitmap bitmap, boolean z) {
        m29920d("addImage");
        new C11510b(this.f29805a).execute(new C11512a[]{new C11512a(str, bitmap, z)});
    }

    /* renamed from: d */
    private void m29920d(String str) {
        if (!this.f29810f) {
            throw new IllegalStateException(String.format("Calling %s when a newer style is loading/has loaded.", new Object[]{str}));
        }
    }

    /* renamed from: a */
    public void mo33756a(TransitionOptions transitionOptions) {
        m29920d("setTransition");
        this.f29805a.mo33696a(transitionOptions);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33752a() {
        this.f29810f = false;
        for (Source source : this.f29806b.values()) {
            if (source != null) {
                source.setDetached();
                this.f29805a.mo33710b(source);
            }
        }
        for (Layer layer : this.f29807c.values()) {
            if (layer != null) {
                layer.mo34132d();
                this.f29805a.mo33709b(layer);
            }
        }
        for (Entry entry : this.f29808d.entrySet()) {
            this.f29805a.mo33707b((String) entry.getKey());
            ((Bitmap) entry.getValue()).recycle();
        }
        this.f29806b.clear();
        this.f29807c.clear();
        this.f29808d.clear();
    }
}
