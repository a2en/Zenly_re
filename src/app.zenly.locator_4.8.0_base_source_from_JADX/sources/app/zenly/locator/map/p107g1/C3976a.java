package app.zenly.locator.map.p107g1;

import com.google.android.gms.maps.model.C10648j;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.g1.a */
public final class C3976a extends C10648j {

    /* renamed from: d */
    private final String f10505d;

    /* renamed from: app.zenly.locator.map.g1.a$a */
    public static final class C3977a {
        private C3977a() {
        }

        public /* synthetic */ C3977a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3977a(null);
    }

    public C3976a(String str) {
        C12932j.m33818b(str, "tileSkeleton");
        super(256, 256);
        this.f10505d = str;
    }

    /* renamed from: a */
    public URL mo10643a(int i, int i2, int i3) {
        String str = this.f10505d;
        String num = Integer.toString(i);
        C12932j.m33815a((Object) num, "Integer.toString(x)");
        String a = C13028q.m33999a(str, "{x}", num, false, 4, (Object) null);
        String num2 = Integer.toString(i2);
        C12932j.m33815a((Object) num2, "Integer.toString(y)");
        String a2 = C13028q.m33999a(a, "{y}", num2, false, 4, (Object) null);
        String num3 = Integer.toString(i3);
        C12932j.m33815a((Object) num3, "Integer.toString(zoom)");
        try {
            return new URL(C13028q.m33999a(a2, "{z}", num3, false, 4, (Object) null));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
