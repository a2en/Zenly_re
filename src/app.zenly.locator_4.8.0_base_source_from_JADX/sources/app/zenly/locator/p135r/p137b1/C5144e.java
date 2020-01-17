package app.zenly.locator.p135r.p137b1;

import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2949h;
import app.zenly.locator.core.store.api.C2956k0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.r.b1.e */
public class C5144e {

    /* renamed from: a */
    public Map<String, C2935a> f13346a = new LinkedHashMap();

    /* renamed from: b */
    public Map<String, C2949h> f13347b = new LinkedHashMap();

    /* renamed from: c */
    public Map<String, C7339i> f13348c = new LinkedHashMap();

    /* renamed from: d */
    public List<C2956k0> f13349d = new ArrayList();

    /* renamed from: e */
    public Map<String, C2936a0> f13350e = new LinkedHashMap();

    /* renamed from: f */
    public List<C7434p> f13351f = new ArrayList();

    /* renamed from: g */
    public List<C2545e0> f13352g = new ArrayList();

    /* renamed from: h */
    public UserProto$User f13353h = null;

    /* renamed from: i */
    public boolean f13354i = false;

    /* renamed from: j */
    public boolean f13355j = false;

    public C5144e() {
    }

    /* renamed from: a */
    public synchronized C5144e mo12495a() {
        return new C5144e(this);
    }

    /* renamed from: b */
    public synchronized void mo12500b(List<C2956k0> list) {
        this.f13349d.clear();
        this.f13349d.addAll(list);
    }

    /* renamed from: c */
    public synchronized void mo12502c(List<C2936a0> list) {
        this.f13350e.clear();
        for (C2936a0 a0Var : list) {
            this.f13350e.put(a0Var.mo9074a().getPhoneNumber(), a0Var);
        }
    }

    /* renamed from: d */
    public synchronized void mo12503d(List<C2545e0> list) {
        this.f13352g.clear();
        this.f13352g.addAll(list);
    }

    /* renamed from: e */
    public synchronized void mo12504e(List<C2949h> list) {
        this.f13347b.clear();
        for (C2949h a : list) {
            m14676a(a);
        }
    }

    /* renamed from: f */
    public synchronized void mo12505f(List<C7434p> list) {
        this.f13351f.clear();
        this.f13351f.addAll(list);
    }

    /* renamed from: a */
    public synchronized void mo12497a(C7339i iVar) {
        this.f13348c.put(iVar.getDeviceContactId(), iVar);
    }

    /* renamed from: a */
    public synchronized void mo12498a(List<C2935a> list) {
        this.f13346a.clear();
        for (C2935a aVar : list) {
            this.f13346a.put(aVar.mo9069a().getDeviceContactId(), aVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo12501b(boolean z) {
        this.f13355j = z;
    }

    /* renamed from: a */
    public synchronized void mo12496a(UserProto$User userProto$User) {
        this.f13353h = userProto$User;
    }

    /* renamed from: a */
    private void m14676a(C2949h hVar) {
        this.f13347b.put(hVar.mo9104a().getDeviceContactId(), hVar);
    }

    /* renamed from: a */
    public synchronized void mo12499a(boolean z) {
        this.f13354i = z;
    }

    private C5144e(C5144e eVar) {
        this.f13346a = new LinkedHashMap(eVar.f13346a);
        this.f13347b = new LinkedHashMap(eVar.f13347b);
        this.f13348c = new LinkedHashMap(eVar.f13348c);
        this.f13349d = new ArrayList(eVar.f13349d);
        this.f13351f = new ArrayList(eVar.f13351f);
        this.f13350e = new LinkedHashMap(eVar.f13350e);
        this.f13354i = eVar.f13354i;
        this.f13352g = new ArrayList(eVar.f13352g);
        this.f13355j = eVar.f13355j;
        this.f13353h = eVar.f13353h;
    }
}
