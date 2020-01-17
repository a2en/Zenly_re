package app.zenly.locator.map.marker;

import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.MarkerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C12932j;
import p214e.p228e.C7571a;

public class MarkerAdapter<M extends C4178e0<V>, V extends MarkerView> {

    /* renamed from: a */
    private final List<M> f10980a = new ArrayList();

    /* renamed from: b */
    private final HashMap<String, M> f10981b = new HashMap<>();

    /* renamed from: c */
    private final C7571a<Class<M>, Map<M, V>> f10982c = new C7571a<>();

    /* renamed from: d */
    private final ArrayList<Observer> f10983d = new ArrayList<>();

    /* renamed from: e */
    private int f10984e;

    /* renamed from: f */
    private FocusedMarkerOverlay<M> f10985f;

    /* renamed from: g */
    private final C4152b f10986g = new C4152b(this);

    public interface Observer {

        /* renamed from: app.zenly.locator.map.marker.MarkerAdapter$Observer$a */
        public enum C4150a {
            GEO_POSITION,
            SCREEN_POSITION,
            VISIBILITY
        }

        void onMarkerChanged(MarkerAdapter<?, ?> markerAdapter, C4178e0<?> e0Var, C4150a aVar);
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerAdapter$a */
    public static final class C4151a {
        private C4151a() {
        }

        public /* synthetic */ C4151a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.MarkerAdapter$b */
    public static final class C4152b extends C4179a<M> {

        /* renamed from: a */
        final /* synthetic */ MarkerAdapter f10991a;

        C4152b(MarkerAdapter markerAdapter) {
            this.f10991a = markerAdapter;
        }

        /* renamed from: g */
        private final void m12048g(M m) {
            this.f10991a.m12035a(m, C4150a.GEO_POSITION);
        }

        /* renamed from: h */
        private final void m12049h(M m) {
            this.f10991a.m12035a(m, C4150a.SCREEN_POSITION);
        }

        /* renamed from: i */
        private final void m12050i(M m) {
            this.f10991a.m12035a(m, C4150a.VISIBILITY);
        }

        /* renamed from: a */
        public void mo10911a(M m) {
            C12932j.m33818b(m, "marker");
            m12050i(m);
        }

        /* renamed from: b */
        public void mo10913b(M m) {
            C12932j.m33818b(m, "marker");
            m12048g(m);
        }

        /* renamed from: c */
        public void mo10914c(M m) {
            C12932j.m33818b(m, "marker");
            m12050i(m);
        }

        /* renamed from: d */
        public void mo10916d(M m, boolean z) {
            C12932j.m33818b(m, "marker");
            m12050i(m);
        }

        /* renamed from: e */
        public void mo10917e(M m) {
            C12932j.m33818b(m, "marker");
            m12050i(m);
        }

        /* renamed from: a */
        public void mo10912a(M m, boolean z) {
            C12932j.m33818b(m, "marker");
            m12050i(m);
        }

        /* renamed from: d */
        public void mo10915d(M m) {
            C12932j.m33818b(m, "marker");
            m12049h(m);
        }
    }

    static {
        new C4151a(null);
    }

    public MarkerAdapter(String str) {
        C12932j.m33818b(str, "name");
    }

    /* renamed from: e */
    private final void m12036e(M m) {
        m.mo11099a((C4179a) this.f10986g);
    }

    /* renamed from: f */
    private final void m12037f(M m) {
        m.mo11105b((C4179a) this.f10986g);
    }

    /* renamed from: b */
    public final FocusedMarkerOverlay<M> mo10905b() {
        return this.f10985f;
    }

    /* renamed from: c */
    public void mo10907c() {
        for (M m : this.f10980a) {
            m.mo11072i(false);
            m12037f(m);
            m12035a(m, C4150a.VISIBILITY);
        }
        this.f10981b.clear();
        this.f10980a.clear();
    }

    /* renamed from: d */
    public void mo10909d(M m) {
        C12932j.m33818b(m, "marker");
        String o = m.mo11116o();
        C12932j.m33815a((Object) o, "marker.uuid");
        C4178e0 a = mo10900a(o);
        if (a != null) {
            a.mo11072i(false);
            m12037f(a);
            m12035a(a, C4150a.VISIBILITY);
            this.f10981b.remove(a.mo11116o());
            this.f10980a.remove(a);
        }
    }

    /* renamed from: a */
    public final void mo10902a(FocusedMarkerOverlay<M> focusedMarkerOverlay) {
        this.f10985f = focusedMarkerOverlay;
    }

    /* renamed from: b */
    public final V mo10906b(M m) {
        C12932j.m33818b(m, "marker");
        Map map = (Map) this.f10982c.get(m.getClass());
        V g = m.mo11112g();
        if (g == null) {
            if (map != null) {
                g = (MarkerView) map.remove(m);
                if (g == null && (!map.isEmpty())) {
                    Iterator it = map.entrySet().iterator();
                    g = (MarkerView) ((Entry) it.next()).getValue();
                    it.remove();
                }
            }
            if (g == null) {
                g = m.mo11076r();
            }
            m.mo11098a(g);
            m.mo11033a();
        }
        return g;
    }

    /* renamed from: a */
    public final List<M> mo10901a() {
        List<M> unmodifiableList = Collections.unmodifiableList(this.f10980a);
        C12932j.m33815a((Object) unmodifiableList, "Collections.unmodifiableList(markers)");
        return unmodifiableList;
    }

    /* renamed from: a */
    public final void mo10903a(Observer observer) {
        C12932j.m33818b(observer, "observer");
        if (!this.f10983d.contains(observer)) {
            this.f10983d.add(observer);
        }
    }

    /* renamed from: a */
    public void mo10904a(M m) {
        C12932j.m33818b(m, "marker");
        String o = m.mo11116o();
        String str = "marker.uuid";
        C12932j.m33815a((Object) o, str);
        M a = mo10900a(o);
        if (a == null || a != m) {
            if (a != null) {
                m12037f(a);
                m.mo11098a(a.mo11112g());
                a.mo11098a(null);
                this.f10980a.remove(a);
                a.mo11072i(false);
            }
            int i = this.f10984e;
            this.f10984e = i + 1;
            m.mo11094a(i);
            m12036e(m);
            HashMap<String, M> hashMap = this.f10981b;
            String o2 = m.mo11116o();
            C12932j.m33815a((Object) o2, str);
            hashMap.put(o2, m);
            this.f10980a.add(m);
            m.mo11072i(true);
        }
        m12035a(m, C4150a.VISIBILITY);
    }

    /* renamed from: c */
    public final void mo10908c(M m) {
        C12932j.m33818b(m, "marker");
        MarkerView g = m.mo11112g();
        if (g != null) {
            m.mo11062I();
            FocusedMarkerOverlay<M> focusedMarkerOverlay = this.f10985f;
            if (focusedMarkerOverlay != null) {
                if (focusedMarkerOverlay == null) {
                    C12932j.m33814a();
                    throw null;
                } else if (m == focusedMarkerOverlay.getMarker()) {
                    FocusedMarkerOverlay<M> focusedMarkerOverlay2 = this.f10985f;
                    if (focusedMarkerOverlay2 != null) {
                        focusedMarkerOverlay2.mo2248a();
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                }
            }
            Map map = (Map) this.f10982c.get(m.getClass());
            if (map == null) {
                map = new LinkedHashMap();
                this.f10982c.put(m.getClass(), map);
            }
            if (map.size() < 100) {
                map.put(m, g);
            }
            m.mo11098a(null);
        }
    }

    /* renamed from: a */
    public final M mo10900a(String str) {
        C12932j.m33818b(str, "uuid");
        return (C4178e0) this.f10981b.get(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12035a(C4178e0<?> e0Var, C4150a aVar) {
        int size = this.f10983d.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((Observer) this.f10983d.get(size)).onMarkerChanged(this, e0Var, aVar);
            } else {
                return;
            }
        }
    }
}
