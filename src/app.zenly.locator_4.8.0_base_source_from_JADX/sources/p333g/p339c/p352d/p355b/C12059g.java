package p333g.p339c.p352d.p355b;

import android.os.Build.VERSION;
import com.facebook.imagepipeline.core.C9706a;
import com.facebook.imagepipeline.memory.C9743b0;
import com.facebook.imagepipeline.platform.PlatformDecoder;

/* renamed from: g.c.d.b.g */
public class C12059g {
    /* renamed from: a */
    public static C12058f m31853a(C9743b0 b0Var, PlatformDecoder platformDecoder, C9706a aVar) {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            return new C12053a(b0Var.mo26512a(), aVar);
        }
        if (i >= 11) {
            return new C12057e(new C12054b(b0Var.mo26517f()), platformDecoder, aVar);
        }
        return new C12055c();
    }
}
