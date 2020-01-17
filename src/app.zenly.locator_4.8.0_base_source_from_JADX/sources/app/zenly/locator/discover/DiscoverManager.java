package app.zenly.locator.discover;

import android.content.Context;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.C2718k5.C2721c;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2881e;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.core.util.C3238u;
import app.zenly.locator.map.p109i1.C4047p1;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p150n.C5459d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.core.C7264z0;
import p213co.znly.models.core.C7264z0.C7265a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p406n.C12789c;

public class DiscoverManager {

    /* renamed from: t */
    private static final float f9543t = ((float) TimeUnit.HOURS.toSeconds(4));

    /* renamed from: u */
    private static final float f9544u = ((float) TimeUnit.HOURS.toSeconds(48));

    /* renamed from: v */
    private static final long f9545v = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: w */
    private static final float f9546w;

    /* renamed from: a */
    private final HotContentListener f9547a;

    /* renamed from: b */
    private final C2718k5 f9548b;

    /* renamed from: c */
    private final MeUserManager f9549c;

    /* renamed from: d */
    private final C4047p1 f9550d;

    /* renamed from: e */
    private final String f9551e;

    /* renamed from: f */
    private final ZenlySchedulers f9552f = C1351e.m6372a(C3571p.f9615b.mo19916a("manager"));

    /* renamed from: g */
    private final C12286f f9553g = this.f9552f.getSingle();

    /* renamed from: h */
    private final C12275b f9554h = new C12275b();

    /* renamed from: i */
    private final C12789c<C2896p> f9555i = C12789c.m33462s();

    /* renamed from: j */
    private final C3550c f9556j = new C3550c();

    /* renamed from: k */
    private C3549b f9557k;

    /* renamed from: l */
    private C3549b f9558l;

    /* renamed from: m */
    private int f9559m;

    /* renamed from: n */
    private int f9560n;

    /* renamed from: o */
    private Date f9561o;

    /* renamed from: p */
    private int f9562p;

    /* renamed from: q */
    private int f9563q;

    /* renamed from: r */
    private boolean f9564r;

    /* renamed from: s */
    private boolean f9565s;

    public interface HotContentListener {
        void onNewHotContent(int i);
    }

    /* renamed from: app.zenly.locator.discover.DiscoverManager$b */
    private static class C3549b {

        /* renamed from: a */
        final List<C2896p> f9566a;

        /* renamed from: b */
        final List<String> f9567b;

        /* renamed from: c */
        final List<String> f9568c;

        /* renamed from: d */
        final Map<String, Integer> f9569d = new HashMap();

        /* renamed from: e */
        final Map<String, ArrayList<String>> f9570e = new HashMap();

        C3549b(List<C2896p> list, List<String> list2, List<String> list3) {
            this.f9566a = list;
            this.f9567b = list2;
            this.f9568c = list3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2896p mo10027a(int i) {
            return (C2896p) this.f9566a.get(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo10026a() {
            return this.f9566a.size();
        }
    }

    /* renamed from: app.zenly.locator.discover.DiscoverManager$c */
    private static class C3550c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Map<String, C2896p> f9571a;

        private C3550c() {
            this.f9571a = new ConcurrentHashMap();
        }
    }

    /* renamed from: app.zenly.locator.discover.DiscoverManager$d */
    private static class C3551d extends C3201f<C2896p> {

        /* renamed from: e */
        final List<String> f9572e;

        C3551d(List<String> list) {
            this.f9572e = list;
        }

        /* renamed from: a */
        public int compare(C2896p pVar, C2896p pVar2) {
            boolean contains = this.f9572e.contains(pVar.f8197a);
            boolean contains2 = this.f9572e.contains(pVar2.f8197a);
            return (contains2 ? 1 : 0) - (contains ? 1 : 0);
        }
    }

    static {
        float f = f9544u;
        f9546w = (f - f9543t) / (f - 60.0f);
    }

    public DiscoverManager(Context context, HotContentListener hotContentListener) {
        this.f9547a = hotContentListener;
        this.f9549c = C2666b.m9049a(context).mo8764b();
        this.f9548b = C2666b.m9049a(context).mo8763a();
        this.f9551e = C5447b.m15477d(C5448c.m15478a());
        this.f9550d = C4047p1.m11729a(context);
    }

    /* renamed from: a */
    static /* synthetic */ C3550c m10755a(Long l, C3550c cVar) throws Exception {
        return cVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m10757a(C3549b bVar) throws Exception {
    }

    /* renamed from: b */
    private void m10763b(C3549b bVar, Map<String, C2881e> map) {
        for (int i = 0; i < bVar.mo10026a(); i++) {
            C2896p a = bVar.mo10027a(i);
            if (((C2881e) map.get(a.f8197a)) == null) {
                this.f9550d.mo10706a(a);
            }
        }
        if (m10764m() || bVar.f9568c.size() > 0) {
            int size = bVar.f9567b.size() + bVar.f9568c.size();
            if (size > 9) {
                size = C3238u.m10270a(7, 10);
            }
            if (this.f9547a != null && size > 0) {
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (bVar.mo10027a(i3).f8214r) {
                        i2++;
                    }
                }
                if (i2 >= Math.min(2, size) || bVar.f9568c.size() > 0) {
                    this.f9547a.onNewHotContent(size);
                    this.f9562p = size;
                }
            }
        }
        if (!this.f9565s) {
            C7265a newBuilder = C7264z0.newBuilder();
            ArrayList arrayList = new ArrayList(5);
            for (int i4 = 0; i4 < Math.min(5, bVar.mo10026a()); i4++) {
                arrayList.add(bVar.mo10027a(i4).f8197a);
            }
            newBuilder.mo19190a(arrayList);
            C5448c.m15478a().discoverV1Interest((C7264z0) newBuilder.build());
            this.f9565s = true;
        }
        this.f9557k = bVar;
    }

    /* renamed from: m */
    private boolean m10764m() {
        boolean z = false;
        if (this.f9564r) {
            return false;
        }
        if (this.f9561o == null || C5448c.m15478a().timeSince(this.f9561o) > f9545v) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public /* synthetic */ C3550c mo10012a(C2721c cVar) throws Exception {
        m10758a(this.f9556j, cVar);
        return this.f9556j;
    }

    /* renamed from: c */
    public int mo10015c() {
        return this.f9560n + 1;
    }

    /* renamed from: d */
    public boolean mo10016d() {
        return this.f9562p > 0;
    }

    /* renamed from: e */
    public boolean mo10017e() {
        C3549b bVar = this.f9558l;
        return bVar != null && bVar.mo10026a() >= 1;
    }

    /* renamed from: f */
    public C3565n mo10018f() {
        this.f9559m++;
        if (this.f9559m >= this.f9558l.mo10026a()) {
            return null;
        }
        int i = this.f9559m;
        if (i > this.f9560n) {
            this.f9560n = i;
        }
        C2896p a = this.f9558l.mo10027a(this.f9559m);
        this.f9555i.onNext(a);
        C3565n a2 = m10756a(a, this.f9559m);
        C7265a newBuilder = C7264z0.newBuilder();
        ArrayList arrayList = new ArrayList(5);
        int i2 = this.f9559m;
        while (true) {
            i2++;
            if (i2 >= this.f9559m + 1 + 5 || i2 >= this.f9558l.mo10026a()) {
                newBuilder.mo19190a(arrayList);
                C5448c.m15478a().discoverV1Interest((C7264z0) newBuilder.build());
            } else {
                C2896p a3 = this.f9558l.mo10027a(i2);
                if (a3.f8215s < 1.0f) {
                    arrayList.add(a3.f8197a);
                }
            }
        }
        newBuilder.mo19190a(arrayList);
        C5448c.m15478a().discoverV1Interest((C7264z0) newBuilder.build());
        return a2;
    }

    /* renamed from: g */
    public void mo10019g() {
        C3549b bVar = this.f9557k;
        if (bVar != null) {
            this.f9564r = true;
            this.f9558l = bVar;
            this.f9563q = this.f9562p;
            this.f9560n = -1;
            this.f9559m = -1;
        }
    }

    /* renamed from: h */
    public void mo10020h() {
        this.f9561o = C5448c.m15478a().timeNow();
        this.f9562p -= this.f9560n + 1;
        if (this.f9562p < 0) {
            this.f9562p = 0;
        }
        HotContentListener hotContentListener = this.f9547a;
        if (hotContentListener != null) {
            hotContentListener.onNewHotContent(this.f9562p);
        }
        this.f9564r = false;
    }

    /* renamed from: i */
    public void mo10021i() {
        this.f9554h.add(C12279e.m32621b((ObservableSource<? extends T>) C12279e.m32599a(2, 5, TimeUnit.SECONDS).mo36426a((ObservableSource<? extends U>) this.f9548b.mo8792c().mo36428a(this.f9553g).mo36501i(new C3562k(this)), (BiFunction<? super T, ? super U, ? extends R>) C3559h.f9580a), (ObservableSource<? extends T>) this.f9555i.mo36428a(this.f9553g).mo36501i(new C3560i(this))).mo36425a((ObservableSource<U>) this.f9550d.mo10704a()).mo36428a(this.f9553g).mo36426a((ObservableSource<? extends U>) this.f9550d.mo10704a(), (BiFunction<? super T, ? super U, ? extends R>) new C3558g<Object,Object,Object>(this)).mo36428a(C12295a.m32802a()).mo36426a((ObservableSource<? extends U>) this.f9550d.mo10704a(), (BiFunction<? super T, ? super U, ? extends R>) new C3564m<Object,Object,Object>(this)).mo36412a((Consumer<? super T>) C3563l.f9584e, (Consumer<? super Throwable>) C3561j.f9582e));
        this.f9565s = false;
    }

    /* renamed from: j */
    public void mo10022j() {
        this.f9554h.mo36401a();
    }

    /* renamed from: k */
    public C3565n mo10023k() {
        int i = this.f9559m;
        if (i == 0) {
            return null;
        }
        this.f9559m = i - 1;
        C2896p a = this.f9558l.mo10027a(this.f9559m);
        this.f9555i.onNext(a);
        return m10756a(a, this.f9559m);
    }

    /* renamed from: l */
    public void mo10024l() {
        this.f9559m = -1;
    }

    /* renamed from: a */
    public /* synthetic */ C3550c mo10013a(C2896p pVar) throws Exception {
        return this.f9556j;
    }

    /* renamed from: a */
    public /* synthetic */ C3549b mo10011a(C3549b bVar, Map map) throws Exception {
        m10763b(bVar, map);
        return bVar;
    }

    /* renamed from: a */
    private void m10758a(C3550c cVar, C2721c cVar2) {
        for (C2831a aVar : cVar2.f7934b.values()) {
            C2896p c = aVar.mo8858c();
            if (!this.f9551e.equals(c.f8197a)) {
                if (C2831a.m9302a(aVar.mo8857b(), 1) && !c.mo8979d()) {
                    cVar.f9571a.remove(c.f8197a);
                } else if (c.mo8979d() && c.f8215s != 0.0f) {
                    cVar.f9571a.put(c.f8197a, c);
                }
            }
        }
    }

    /* renamed from: a */
    private C3565n m10756a(C2896p pVar, int i) {
        ArrayList arrayList;
        int i2 = -1;
        if (this.f9558l.f9569d.containsKey(pVar.f8197a)) {
            i2 = ((Integer) this.f9558l.f9569d.get(pVar.f8197a)).intValue();
            arrayList = (ArrayList) this.f9558l.f9570e.get(pVar.f8197a);
            m10761a(arrayList);
        } else {
            int i3 = pVar.f8216t;
            if (i3 != -1) {
                C2900b a = this.f9548b.mo8780a(i3);
                if (a != null && a.f8226c) {
                    i2 = pVar.f8216t;
                    ArrayList arrayList2 = new ArrayList(a.f8240l);
                    Collections.sort(arrayList2, C3205g.m10191b());
                    arrayList = new ArrayList(arrayList2.size());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C2896p) it.next()).f8197a);
                    }
                    this.f9558l.f9569d.put(pVar.f8197a, Integer.valueOf(i2));
                    this.f9558l.f9570e.put(pVar.f8197a, arrayList);
                    m10759a(pVar.f8197a, (List<String>) arrayList);
                    m10761a(arrayList);
                }
            }
            arrayList = null;
        }
        int i4 = this.f9562p;
        if (i < i4) {
            return new C3565n(pVar.f8197a, i2, arrayList, i4);
        }
        return new C3565n(pVar.f8197a, i2, arrayList);
    }

    /* renamed from: b */
    public int mo10014b() {
        return (mo10015c() * 100) / this.f9558l.mo10026a();
    }

    /* renamed from: a */
    private void m10759a(String str, List<String> list) {
        Iterator it = this.f9558l.f9566a.iterator();
        while (it.hasNext()) {
            C2896p pVar = (C2896p) it.next();
            if (list.contains(pVar.f8197a) && !pVar.f8197a.equals(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private void m10761a(ArrayList<String> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f9550d.mo10707a((String) it.next());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C3549b m10753a(C3550c cVar, Map<String, C2881e> map) {
        ArrayList<C2896p> arrayList = new ArrayList<>(cVar.f9571a.values());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Collections.sort(arrayList, C3205g.m10191b());
        int i = 0;
        for (C2896p pVar : arrayList) {
            i++;
            if (i < 15 && m10762a(pVar, map)) {
                arrayList2.add(pVar.f8197a);
            }
        }
        Collections.sort(arrayList, new C3551d(arrayList3).mo9614a(new C3551d(arrayList2)).mo9614a(C3205g.m10191b()));
        ArrayList arrayList4 = new ArrayList(arrayList2);
        HashSet hashSet = new HashSet();
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                arrayList2.remove(str);
            } else {
                C2896p a = this.f9548b.mo8779a(str);
                if (a != null) {
                    C2900b a2 = this.f9548b.mo8780a(a.f8216t);
                    if (a2 != null && a2.f8226c) {
                        Iterator it2 = a2.f8240l.iterator();
                        while (it2.hasNext()) {
                            hashSet.add(((C2896p) it2.next()).f8197a);
                        }
                    }
                }
            }
        }
        return new C3549b(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: a */
    private boolean m10762a(C2896p pVar, Map<String, C2881e> map) {
        boolean z = false;
        if (pVar.f8208l || pVar.f8215s < f9546w) {
            return false;
        }
        C2907v b = this.f9549c.mo8756b();
        C5459d dVar = b.f8252c;
        double d = b.f8253d;
        if (dVar != null) {
            C5459d dVar2 = pVar.f8199c;
            if (dVar2 != null) {
                if (m10752a(dVar, dVar2, pVar.f8202f) < d + pVar.f8202f + 100.0d) {
                    return false;
                }
                C2881e eVar = (C2881e) map.get(pVar.f8197a);
                if (eVar == null) {
                    return false;
                }
                if (m10751a(eVar.getLatitude(), eVar.getLongitude(), pVar.f8199c, pVar.f8202f) > 1000000.0d) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private double m10752a(C5459d dVar, C5459d dVar2, double d) {
        return m10751a(dVar.mo13060b(), dVar.mo13062c(), dVar2, d);
    }

    /* renamed from: a */
    private double m10751a(double d, double d2, C5459d dVar, double d3) {
        return Math.max(0.0d, ((double) C3225m.m10225a(d, d2, dVar.mo13060b(), dVar.mo13062c())) - d3);
    }

    /* renamed from: a */
    public int mo10010a() {
        if (this.f9563q == 0) {
            return 0;
        }
        if (mo10015c() > this.f9563q) {
            return 100;
        }
        return (mo10015c() * 100) / this.f9563q;
    }
}
