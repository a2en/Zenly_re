package app.zenly.locator.core.helper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import app.zenly.locator.core.models.C2916z;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.util.C3225m;
import java.util.List;

/* renamed from: app.zenly.locator.core.helper.d */
public class C2511d {

    /* renamed from: a */
    private static double f7522a = 100.0d;

    /* renamed from: b */
    private static SparseArray<Bitmap> f7523b = new SparseArray<>();

    /* renamed from: app.zenly.locator.core.helper.d$a */
    static /* synthetic */ class C2512a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7524a = new int[C2918b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.core.models.z$b[] r0 = app.zenly.locator.core.models.C2916z.C2918b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7524a = r0
                int[] r0 = f7524a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.models.z$b r1 = app.zenly.locator.core.models.C2916z.C2918b.HOME     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7524a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.models.z$b r1 = app.zenly.locator.core.models.C2916z.C2918b.WORK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7524a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.models.z$b r1 = app.zenly.locator.core.models.C2916z.C2918b.SCHOOL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.helper.C2511d.C2512a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Bitmap m8764a(Resources resources, C2918b bVar) {
        Bitmap bitmap = (Bitmap) f7523b.get(bVar.ordinal());
        if (bitmap == null) {
            int i = C2512a.f7524a[bVar.ordinal()];
            if (i == 1) {
                bitmap = BitmapFactory.decodeResource(resources, 2131230929);
            } else if (i == 2) {
                bitmap = BitmapFactory.decodeResource(resources, 2131230936);
            } else if (i == 3) {
                bitmap = BitmapFactory.decodeResource(resources, 2131230933);
            }
            if (bitmap != null) {
                f7523b.put(bVar.ordinal(), bitmap);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    public static C2916z m8765a(List<C2916z> list, double d, double d2, double d3) {
        double d4 = Double.MAX_VALUE;
        C2916z zVar = null;
        for (C2916z zVar2 : list) {
            if (zVar2.mo9015b() != null) {
                double a = (double) C3225m.m10225a(d, d2, zVar2.mo9015b().mo13060b(), zVar2.mo9015b().mo13062c());
                if (a < zVar2.mo9016c() + Math.min(d3, f7522a) && a < d4) {
                    zVar = zVar2;
                    d4 = a;
                }
            }
        }
        return zVar;
    }
}
