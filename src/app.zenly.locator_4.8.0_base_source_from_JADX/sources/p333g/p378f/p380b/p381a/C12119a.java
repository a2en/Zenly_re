package p333g.p378f.p380b.p381a;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: g.f.b.a.a */
public class C12119a {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Long> f31544a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AtomicLong f31545b = new AtomicLong();

    /* renamed from: a */
    public long mo35844a(String str) {
        Long l = (Long) this.f31544a.get(str);
        if (l == null) {
            long incrementAndGet = this.f31545b.incrementAndGet();
            Long l2 = (Long) this.f31544a.putIfAbsent(str, Long.valueOf(incrementAndGet));
            if (l2 != null) {
                incrementAndGet = l2.longValue();
            }
            l = Long.valueOf(incrementAndGet);
        }
        return l.longValue();
    }
}
