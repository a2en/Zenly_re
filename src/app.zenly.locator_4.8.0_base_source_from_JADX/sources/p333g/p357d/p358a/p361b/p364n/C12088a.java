package p333g.p357d.p358a.p361b.p364n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: g.d.a.b.n.a */
public class C12088a {
    /* renamed from: a */
    public static ColorStateList m31903a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C7531a.m18132b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m31904b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable c = C7531a.m18133c(context, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return typedArray.getDrawable(i);
    }
}
