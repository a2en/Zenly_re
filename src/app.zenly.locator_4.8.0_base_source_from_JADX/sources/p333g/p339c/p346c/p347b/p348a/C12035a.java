package p333g.p339c.p346c.p347b.p348a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C9615g;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: g.c.c.b.a.a */
public class C12035a implements DrawableFactory {

    /* renamed from: a */
    private final Resources f31342a;

    /* renamed from: b */
    private final DrawableFactory f31343b;

    public C12035a(Resources resources, DrawableFactory drawableFactory) {
        this.f31342a = resources;
        this.f31343b = drawableFactory;
    }

    /* renamed from: a */
    private static boolean m31706a(C9731d dVar) {
        if (dVar.mo26414e() == 1 || dVar.mo26414e() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m31707b(C9731d dVar) {
        return (dVar.mo26415f() == 0 || dVar.mo26415f() == -1) ? false : true;
    }

    public Drawable createDrawable(C9730c cVar) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof C9731d) {
                C9731d dVar = (C9731d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f31342a, dVar.mo26411c());
                if (!m31707b(dVar) && !m31706a(dVar)) {
                    return bitmapDrawable;
                }
                C9615g gVar = new C9615g(bitmapDrawable, dVar.mo26415f(), dVar.mo26414e());
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return gVar;
            } else if (this.f31343b == null || !this.f31343b.supportsImageType(cVar)) {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return null;
            } else {
                Drawable createDrawable = this.f31343b.createDrawable(cVar);
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return createDrawable;
            }
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    public boolean supportsImageType(C9730c cVar) {
        return true;
    }
}
