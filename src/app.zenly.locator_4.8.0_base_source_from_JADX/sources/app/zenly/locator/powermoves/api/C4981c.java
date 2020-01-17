package app.zenly.locator.powermoves.api;

import app.zenly.locator.R;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p127b.C4987b;
import com.appsflyer.AppsFlyerLibCore;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12291g;

/* renamed from: app.zenly.locator.powermoves.api.c */
public final class C4981c implements PowerMoveDataSource {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List<C4984a> f12998a;

    /* renamed from: b */
    public static final C4981c f12999b = new C4981c();

    /* renamed from: app.zenly.locator.powermoves.api.c$a */
    static final class C4982a<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ String f13000e;

        C4982a(String str) {
            this.f13000e = str;
        }

        public final C4984a call() {
            Object obj;
            Iterator it = C4981c.f12998a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12932j.m33817a((Object) ((C4984a) obj).mo12216e(), (Object) this.f13000e)) {
                    break;
                }
            }
            C4984a aVar = (C4984a) obj;
            if (aVar != null) {
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Non existing power move id ");
            sb.append(this.f13000e);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: app.zenly.locator.powermoves.api.c$b */
    static final class C4983b<V> implements Callable<T> {

        /* renamed from: e */
        public static final C4983b f13001e = new C4983b();

        C4983b() {
        }

        public final List<C4984a> call() {
            return C4981c.f12998a;
        }
    }

    static {
        C4984a aVar = new C4984a("0", R.string.powerMoves_videoTitle_zoom, 15, C12846n.m33635a(new C4987b("RRYFvhALEDs")), null, 16, null);
        C4984a aVar2 = new C4984a("1", R.string.powerMoves_videoTitle_meet, 29, C12846n.m33635a(new C4987b("tgHH1YlmS9Q")), null, 16, null);
        C4984a aVar3 = new C4984a("2", R.string.powerMoves_videotitle_poop, 14, C12846n.m33635a(new C4987b("iAZjVshs9iM")), null, 16, null);
        C4987b[] bVarArr = {new C4987b("pNDfTSyZ5L8"), new C4987b("36EMcAwmiy4")};
        C4984a aVar4 = new C4984a("3", R.string.powerMoves_videoTitle_emojis, 27, C12848o.m33643b((Object[]) bVarArr), null, 16, null);
        C4984a aVar5 = new C4984a(AppsFlyerLibCore.f22530, R.string.powerMoves_videoTitle_bump, 13, C12848o.m33643b((Object[]) new C4987b[]{new C4987b("3kQMsO1-zMY"), new C4987b("QTRXy2FP3M8")}), null, 16, null);
        f12998a = C12848o.m33643b((Object[]) new C4984a[]{aVar, aVar2, aVar3, aVar4, aVar5});
    }

    private C4981c() {
    }

    public C12291g<C4984a> powerMove(String str) {
        C12932j.m33818b(str, "id");
        C12291g<C4984a> c = C12291g.m32769c((Callable<? extends T>) new C4982a<Object>(str));
        C12932j.m33815a((Object) c, "Single.fromCallable {\n  …r move id $id\")\n        }");
        return c;
    }

    public C12291g<List<C4984a>> powerMoves() {
        C12291g<List<C4984a>> c = C12291g.m32769c((Callable<? extends T>) C4983b.f13001e);
        C12932j.m33815a((Object) c, "Single.fromCallable {\n  …ocalePowerMoves\n        }");
        return c;
    }
}
