package p333g.p339c.p346c.p347b.p348a;

import android.content.Context;
import com.facebook.common.logging.C9543a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.C9712f;
import com.facebook.imagepipeline.core.C9716g;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* renamed from: g.c.c.b.a.c */
public class C12037c {

    /* renamed from: a */
    private static final Class<?> f31344a = C12037c.class;

    /* renamed from: b */
    private static C12041f f31345b = null;

    /* renamed from: c */
    private static volatile boolean f31346c = false;

    private C12037c() {
    }

    /* renamed from: a */
    public static void m31713a(Context context) {
        m31714a(context, null, null);
    }

    /* renamed from: a */
    public static void m31714a(Context context, C9712f fVar, C12036b bVar) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("Fresco#initialize");
        }
        if (f31346c) {
            C9543a.m23320c(f31344a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f31346c = true;
        }
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("Fresco.initialize->SoLoader.init");
            }
            SoLoader.m24763a(context, 0);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            Context applicationContext = context.getApplicationContext();
            if (fVar == null) {
                C9716g.m23968b(applicationContext);
            } else {
                C9716g.m23967a(fVar);
            }
            m31715a(applicationContext, bVar);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        } catch (IOException e) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            throw new RuntimeException("Could not initialize SoLoader", e);
        }
    }

    /* renamed from: a */
    private static void m31715a(Context context, C12036b bVar) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("Fresco.initializeDrawee");
        }
        f31345b = new C12041f(context, bVar);
        SimpleDraweeView.m23638a(f31345b);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: a */
    public static C12039e m31712a() {
        return f31345b.get();
    }
}
