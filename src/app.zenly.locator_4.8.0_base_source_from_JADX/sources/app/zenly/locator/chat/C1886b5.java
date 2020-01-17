package app.zenly.locator.chat;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p213co.znly.models.PingProto$Conversation.C6818b;

/* renamed from: app.zenly.locator.chat.b5 */
public class C1886b5 {

    /* renamed from: a */
    private final Map<String, C6818b> f6174a = new ConcurrentHashMap();

    /* renamed from: b */
    private final Map<String, String> f6175b = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo7613a(C6818b bVar) {
        this.f6174a.put(bVar.getUserUuid(), bVar);
    }

    /* renamed from: b */
    public void mo7617b(C6818b bVar) {
        this.f6174a.remove(bVar.getUserUuid());
    }

    /* renamed from: a */
    public void mo7615a(List<C6818b> list) {
        for (C6818b a : list) {
            mo7613a(a);
        }
    }

    /* renamed from: b */
    public void mo7618b(List<C6818b> list) {
        for (C6818b b : list) {
            mo7617b(b);
        }
    }

    /* renamed from: a */
    public C6818b mo7611a(String str) {
        return (C6818b) this.f6174a.get(str);
    }

    /* renamed from: b */
    public Collection<C6818b> mo7616b() {
        return this.f6174a.values();
    }

    /* renamed from: a */
    public void mo7614a(String str, String str2) {
        this.f6175b.put(str, str2);
    }

    /* renamed from: a */
    public Map<String, String> mo7612a() {
        return this.f6175b;
    }
}
