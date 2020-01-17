package app.zenly.locator.chat;

import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.SingleSource;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.chat.w4 */
public final class C2375w4 {

    /* renamed from: a */
    private final String f7171a;

    /* renamed from: b */
    private final C12279e<Boolean> f7172b;

    /* renamed from: c */
    private final C12279e<Integer> f7173c;

    /* renamed from: d */
    private final C12279e<Boolean> f7174d;

    /* renamed from: e */
    private final C2376a f7175e;

    /* renamed from: app.zenly.locator.chat.w4$a */
    interface C2376a {
        /* renamed from: a */
        C12279e<String> mo7610a(String str);
    }

    C2375w4(String str, C12279e<Boolean> eVar, C12279e<Integer> eVar2, C12279e<Boolean> eVar3, C2376a aVar) {
        this.f7171a = str;
        this.f7172b = eVar;
        this.f7173c = eVar2;
        this.f7174d = eVar3;
        this.f7175e = aVar;
    }

    /* renamed from: a */
    public /* synthetic */ SingleSource mo8314a(PingProto$Ping2 pingProto$Ping2) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (C6824b bVar : pingProto$Ping2.getContentList()) {
            arrayList.add(this.f7175e.mo7610a(bVar.getEmojiUuid()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36501i(new C2325t0(pingProto$Ping2, bVar)));
        }
        return C12279e.m32624c((Iterable<? extends ObservableSource<? extends T>>) arrayList).mo36511n();
    }

    /* renamed from: b */
    public C12279e<Boolean> mo8316b() {
        return this.f7174d;
    }

    /* renamed from: c */
    public C12279e<List<C2242d>> mo8317c() {
        return this.f7172b.mo36477d().mo36509m(new C2312s0(C5448c.m15478a().pingRead(this.f7171a).mo36499h((Function<? super T, ? extends SingleSource<? extends R>>) new C2298r0<Object,Object>(this))));
    }

    /* renamed from: a */
    static /* synthetic */ C2242d m8421a(PingProto$Ping2 pingProto$Ping2, C6824b bVar, String str) throws Exception {
        return new C2242d(pingProto$Ping2.getAuthorUuid(), bVar.getEmojiUuid(), str, bVar.getWeight());
    }

    /* renamed from: a */
    static /* synthetic */ ObservableSource m8422a(C12279e eVar, Boolean bool) throws Exception {
        return bool.booleanValue() ? eVar.mo36464c(1000, TimeUnit.MILLISECONDS) : eVar;
    }

    /* renamed from: a */
    public C12279e<Integer> mo8315a() {
        return this.f7173c;
    }
}
