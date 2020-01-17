package p389io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: io.fabric.sdk.android.services.settings.n */
public class C12262n {

    /* renamed from: a */
    public final String f31894a;

    /* renamed from: b */
    public final int f31895b;

    /* renamed from: c */
    public final int f31896c;

    /* renamed from: d */
    public final int f31897d;

    public C12262n(String str, int i, int i2, int i3) {
        this.f31894a = str;
        this.f31895b = i;
        this.f31896c = i2;
        this.f31897d = i3;
    }

    /* renamed from: a */
    public static C12262n m32501a(Context context, String str) {
        String str2 = "Fabric";
        if (str != null) {
            try {
                int d = C12180h.m32269d(context);
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("App icon resource ID is ");
                sb.append(d);
                f.mo35954d(str2, sb.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), d, options);
                return new C12262n(str, d, options.outWidth, options.outHeight);
            } catch (Exception e) {
                C12154c.m32113f().mo35957e(str2, "Failed to load icon", e);
            }
        }
        return null;
    }
}
