package p333g.p339c.p346c.p351d;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import com.facebook.common.logging.C9543a;
import com.facebook.drawee.drawable.C9614f;
import com.facebook.drawee.drawable.C9616h;
import com.facebook.drawee.drawable.C9617i;
import com.facebook.drawee.drawable.C9618j;
import com.facebook.drawee.drawable.C9622l;
import com.facebook.drawee.drawable.C9623m;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import p333g.p339c.p346c.p351d.C12049e.C12050a;

/* renamed from: g.c.c.d.f */
public class C12051f {

    /* renamed from: a */
    private static final Drawable f31440a = new ColorDrawable(0);

    /* renamed from: a */
    static Drawable m31832a(Drawable drawable, ScaleType scaleType) {
        return m31833a(drawable, scaleType, (PointF) null);
    }

    /* renamed from: b */
    static Drawable m31838b(Drawable drawable, C12049e eVar, Resources resources) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || eVar == null)) {
                if (eVar.mo35762h() == C12050a.BITMAP_ONLY) {
                    if (drawable instanceof C9614f) {
                        DrawableParent a = m31836a((C9614f) drawable);
                        a.setDrawable(m31835a(a.setDrawable(f31440a), eVar, resources));
                        if (FrescoSystrace.m24705c()) {
                            FrescoSystrace.m24702a();
                        }
                        return drawable;
                    }
                    Drawable a2 = m31835a(drawable, eVar, resources);
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                    return a2;
                }
            }
            return drawable;
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: a */
    static Drawable m31833a(Drawable drawable, ScaleType scaleType, PointF pointF) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || scaleType == null) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            return drawable;
        }
        C9623m mVar = new C9623m(drawable, scaleType);
        if (pointF != null) {
            mVar.mo26025a(pointF);
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return mVar;
    }

    /* renamed from: a */
    static Drawable m31834a(Drawable drawable, C12049e eVar) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || eVar == null)) {
                if (eVar.mo35762h() == C12050a.OVERLAY_COLOR) {
                    C9618j jVar = new C9618j(drawable);
                    m31837a((Rounded) jVar, eVar);
                    jVar.mo26013a(eVar.mo35757d());
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                    return jVar;
                }
            }
            return drawable;
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: a */
    private static Drawable m31835a(Drawable drawable, C12049e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C9616h hVar = new C9616h(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m31837a((Rounded) hVar, eVar);
            return hVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C9622l lVar = new C9622l((NinePatchDrawable) drawable);
            m31837a((Rounded) lVar, eVar);
            return lVar;
        } else if (!(drawable instanceof ColorDrawable) || VERSION.SDK_INT < 11) {
            C9543a.m23324c("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            C9617i a = C9617i.m23612a((ColorDrawable) drawable);
            m31837a((Rounded) a, eVar);
            return a;
        }
    }

    /* renamed from: a */
    static void m31837a(Rounded rounded, C12049e eVar) {
        rounded.setCircle(eVar.mo35761g());
        rounded.setRadii(eVar.mo35756c());
        rounded.setBorder(eVar.mo35748a(), eVar.mo35753b());
        rounded.setPadding(eVar.mo35758e());
        rounded.setScaleDownInsideBorders(eVar.mo35764i());
        rounded.setPaintFilterBitmap(eVar.mo35760f());
    }

    /* renamed from: a */
    static DrawableParent m31836a(DrawableParent drawableParent) {
        while (true) {
            Drawable drawable = drawableParent.getDrawable();
            if (drawable == drawableParent || !(drawable instanceof DrawableParent)) {
                return drawableParent;
            }
            drawableParent = (DrawableParent) drawable;
        }
        return drawableParent;
    }
}
