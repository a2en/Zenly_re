package p333g.p339c.p346c.p351d;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: g.c.c.d.c */
public class C12047c {
    /* renamed from: a */
    public static C12046b m31812a(Context context, AttributeSet attributeSet) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        C12046b bVar = new C12046b(context.getResources());
        m31813a(bVar, context, attributeSet);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x0211  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p333g.p339c.p346c.p351d.C12046b m31813a(p333g.p339c.p346c.p351d.C12046b r18, android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            if (r2 == 0) goto L_0x021f
            int[] r6 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r6)
            int r7 = r2.getIndexCount()     // Catch:{ all -> 0x01ff }
            r5 = 1
            r6 = 0
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
            r17 = 0
        L_0x001e:
            if (r8 >= r7) goto L_0x01a5
            int r3 = r2.getIndex(r8)     // Catch:{ all -> 0x01a2 }
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_actualImageScaleType     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x0031
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = m31811a(r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35717a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0031:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_placeholderImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x003e
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35726d(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x003e:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_pressedStateOverlayImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x004b
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35729e(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x004b:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_progressBarImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x0058
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35732f(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0058:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_fadeDuration     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x0065
            r4 = 0
            int r3 = r2.getInt(r3, r4)     // Catch:{ all -> 0x01a2 }
            r0.mo35715a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0065:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_viewAspectRatio     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x0072
            r4 = 0
            float r3 = r2.getFloat(r3, r4)     // Catch:{ all -> 0x01a2 }
            r0.mo35714a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0072:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_placeholderImageScaleType     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x007e
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = m31811a(r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35724c(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x007e:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_retryImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x008a
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35734g(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x008a:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_retryImageScaleType     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x0096
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = m31811a(r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35730e(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0096:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_failureImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00a2
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35720b(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x00a2:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_failureImageScaleType     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00ae
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = m31811a(r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35721b(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x00ae:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_progressBarImageScaleType     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00ba
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = m31811a(r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35727d(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x00ba:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_progressBarAutoRotateInterval     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00c6
            int r3 = r2.getInteger(r3, r6)     // Catch:{ all -> 0x01a2 }
            r6 = r3
        L_0x00c3:
            r4 = 0
            goto L_0x019c
        L_0x00c6:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_backgroundImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00d2
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35716a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x00d2:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_overlayImage     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00de
            android.graphics.drawable.Drawable r3 = m31810a(r1, r2, r3)     // Catch:{ all -> 0x01a2 }
            r0.mo35723c(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x00de:
            int r4 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundAsCircle     // Catch:{ all -> 0x01a2 }
            if (r3 != r4) goto L_0x00ef
            g.c.c.d.e r4 = m31814a(r18)     // Catch:{ all -> 0x01a2 }
            r1 = 0
            boolean r3 = r2.getBoolean(r3, r1)     // Catch:{ all -> 0x01a2 }
            r4.mo35752a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x00ef:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundedCornerRadius     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x00fc
            r4 = r17
            int r1 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x01a2 }
            r17 = r1
            goto L_0x00c3
        L_0x00fc:
            r4 = r17
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundTopLeft     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x010a
            boolean r1 = r2.getBoolean(r3, r9)     // Catch:{ all -> 0x01a2 }
            r9 = r1
        L_0x0107:
            r17 = r4
            goto L_0x00c3
        L_0x010a:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundTopRight     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0114
            boolean r1 = r2.getBoolean(r3, r11)     // Catch:{ all -> 0x01a2 }
            r11 = r1
            goto L_0x0107
        L_0x0114:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundBottomLeft     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x011e
            boolean r1 = r2.getBoolean(r3, r15)     // Catch:{ all -> 0x01a2 }
            r15 = r1
            goto L_0x0107
        L_0x011e:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundBottomRight     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0128
            boolean r1 = r2.getBoolean(r3, r13)     // Catch:{ all -> 0x01a2 }
            r13 = r1
            goto L_0x0107
        L_0x0128:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundTopStart     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0132
            boolean r1 = r2.getBoolean(r3, r10)     // Catch:{ all -> 0x01a2 }
            r10 = r1
            goto L_0x0107
        L_0x0132:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundTopEnd     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x013c
            boolean r1 = r2.getBoolean(r3, r12)     // Catch:{ all -> 0x01a2 }
            r12 = r1
            goto L_0x0107
        L_0x013c:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundBottomStart     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0146
            boolean r1 = r2.getBoolean(r3, r5)     // Catch:{ all -> 0x01a2 }
            r5 = r1
            goto L_0x0107
        L_0x0146:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundBottomEnd     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0150
            boolean r1 = r2.getBoolean(r3, r14)     // Catch:{ all -> 0x01a2 }
            r14 = r1
            goto L_0x0107
        L_0x0150:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundWithOverlayColor     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0164
            g.c.c.d.e r1 = m31814a(r18)     // Catch:{ all -> 0x01a2 }
            r17 = r4
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x01a2 }
            r1.mo35755b(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0164:
            r17 = r4
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundingBorderWidth     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x0179
            g.c.c.d.e r1 = m31814a(r18)     // Catch:{ all -> 0x01a2 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x01a2 }
            float r3 = (float) r3     // Catch:{ all -> 0x01a2 }
            r1.mo35749a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x0179:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundingBorderColor     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x018b
            g.c.c.d.e r1 = m31814a(r18)     // Catch:{ all -> 0x01a2 }
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x01a2 }
            r1.mo35751a(r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x00c3
        L_0x018b:
            int r1 = p333g.p339c.p346c.C12034a.GenericDraweeHierarchy_roundingBorderPadding     // Catch:{ all -> 0x01a2 }
            if (r3 != r1) goto L_0x00c3
            g.c.c.d.e r1 = m31814a(r18)     // Catch:{ all -> 0x01a2 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x01a2 }
            float r3 = (float) r3     // Catch:{ all -> 0x01a2 }
            r1.mo35754b(r3)     // Catch:{ all -> 0x01a2 }
        L_0x019c:
            int r8 = r8 + 1
            r1 = r19
            goto L_0x001e
        L_0x01a2:
            r0 = move-exception
            goto L_0x0208
        L_0x01a5:
            r4 = 0
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x01de
            android.content.res.Resources r1 = r19.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01de
            if (r9 == 0) goto L_0x01c4
            if (r12 == 0) goto L_0x01c4
            r1 = 1
            goto L_0x01c5
        L_0x01c4:
            r1 = 0
        L_0x01c5:
            if (r11 == 0) goto L_0x01cb
            if (r10 == 0) goto L_0x01cb
            r2 = 1
            goto L_0x01cc
        L_0x01cb:
            r2 = 0
        L_0x01cc:
            if (r13 == 0) goto L_0x01d2
            if (r5 == 0) goto L_0x01d2
            r5 = 1
            goto L_0x01d3
        L_0x01d2:
            r5 = 0
        L_0x01d3:
            if (r15 == 0) goto L_0x01da
            if (r14 == 0) goto L_0x01da
            r16 = 1
            goto L_0x01dc
        L_0x01da:
            r16 = 0
        L_0x01dc:
            r3 = r5
            goto L_0x01fc
        L_0x01de:
            if (r9 == 0) goto L_0x01e4
            if (r10 == 0) goto L_0x01e4
            r1 = 1
            goto L_0x01e5
        L_0x01e4:
            r1 = 0
        L_0x01e5:
            if (r11 == 0) goto L_0x01eb
            if (r12 == 0) goto L_0x01eb
            r2 = 1
            goto L_0x01ec
        L_0x01eb:
            r2 = 0
        L_0x01ec:
            if (r13 == 0) goto L_0x01f2
            if (r14 == 0) goto L_0x01f2
            r3 = 1
            goto L_0x01f3
        L_0x01f2:
            r3 = 0
        L_0x01f3:
            if (r15 == 0) goto L_0x01f9
            if (r5 == 0) goto L_0x01f9
            r5 = 1
            goto L_0x01fa
        L_0x01f9:
            r5 = 0
        L_0x01fa:
            r16 = r5
        L_0x01fc:
            r4 = r17
            goto L_0x0226
        L_0x01ff:
            r0 = move-exception
            r5 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
        L_0x0208:
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x021e
            android.content.res.Resources r1 = r19.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
        L_0x021e:
            throw r0
        L_0x021f:
            r2 = 1
            r4 = 0
            r1 = 1
            r3 = 1
            r6 = 0
            r16 = 1
        L_0x0226:
            android.graphics.drawable.Drawable r5 = r18.mo35741n()
            if (r5 == 0) goto L_0x023a
            if (r6 <= 0) goto L_0x023a
            com.facebook.drawee.drawable.b r5 = new com.facebook.drawee.drawable.b
            android.graphics.drawable.Drawable r7 = r18.mo35741n()
            r5.<init>(r7, r6)
            r0.mo35732f(r5)
        L_0x023a:
            if (r4 <= 0) goto L_0x0257
            g.c.c.d.e r5 = m31814a(r18)
            if (r1 == 0) goto L_0x0244
            float r1 = (float) r4
            goto L_0x0245
        L_0x0244:
            r1 = 0
        L_0x0245:
            if (r2 == 0) goto L_0x0249
            float r2 = (float) r4
            goto L_0x024a
        L_0x0249:
            r2 = 0
        L_0x024a:
            if (r3 == 0) goto L_0x024e
            float r3 = (float) r4
            goto L_0x024f
        L_0x024e:
            r3 = 0
        L_0x024f:
            if (r16 == 0) goto L_0x0253
            float r4 = (float) r4
            goto L_0x0254
        L_0x0253:
            r4 = 0
        L_0x0254:
            r5.mo35750a(r1, r2, r3, r4)
        L_0x0257:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p339c.p346c.p351d.C12047c.m31813a(g.c.c.d.b, android.content.Context, android.util.AttributeSet):g.c.c.d.b");
    }

    /* renamed from: a */
    private static C12049e m31814a(C12046b bVar) {
        if (bVar.mo35746s() == null) {
            bVar.mo35718a(new C12049e());
        }
        return bVar.mo35746s();
    }

    /* renamed from: a */
    private static Drawable m31810a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* renamed from: a */
    private static ScaleType m31811a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ScaleType.f24938a;
            case 1:
                return ScaleType.f24939b;
            case 2:
                return ScaleType.f24940c;
            case 3:
                return ScaleType.f24941d;
            case 4:
                return ScaleType.f24942e;
            case 5:
                return ScaleType.f24943f;
            case 6:
                return ScaleType.f24944g;
            case 7:
                return ScaleType.f24945h;
            case 8:
                return ScaleType.f24946i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }
}
