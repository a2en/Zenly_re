package app.zenly.locator.core.config;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.config.a */
public final class C2455a {

    /* renamed from: a */
    public static final List<String> f7361a = C12848o.m33643b((Object[]) new String[]{"http", "https"});

    /* renamed from: b */
    public static final List<String> f7362b = C12846n.m33635a("zen.ly");

    /* renamed from: app.zenly.locator.core.config.a$a */
    public static final class C2456a {
        static {
            new C2456a();
        }

        private C2456a() {
        }

        /* renamed from: a */
        public static final String m8571a(Context context) {
            C12932j.m33818b(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(".fileprovider");
            return sb.toString();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
    static {
        new C2455a();
    }

    private C2455a() {
    }
}
