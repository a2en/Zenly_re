package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0554e;
import androidx.core.content.res.C0554e.C0555a;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: androidx.appcompat.widget.z */
public class C0291z {

    /* renamed from: a */
    private final Context f1313a;

    /* renamed from: b */
    private final TypedArray f1314b;

    /* renamed from: c */
    private TypedValue f1315c;

    private C0291z(Context context, TypedArray typedArray) {
        this.f1313a = context;
        this.f1314b = typedArray;
    }

    /* renamed from: a */
    public static C0291z m1195a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0291z(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: b */
    public Drawable mo2106b(int i) {
        if (this.f1314b.hasValue(i)) {
            int resourceId = this.f1314b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C7531a.m18133c(this.f1313a, resourceId);
            }
        }
        return this.f1314b.getDrawable(i);
    }

    /* renamed from: c */
    public Drawable mo2108c(int i) {
        if (this.f1314b.hasValue(i)) {
            int resourceId = this.f1314b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0250e.m969b().mo1895a(this.f1313a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public String mo2110d(int i) {
        return this.f1314b.getString(i);
    }

    /* renamed from: e */
    public CharSequence mo2112e(int i) {
        return this.f1314b.getText(i);
    }

    /* renamed from: f */
    public int mo2113f(int i, int i2) {
        return this.f1314b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo2115g(int i, int i2) {
        return this.f1314b.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static C0291z m1196a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0291z(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: d */
    public int mo2109d(int i, int i2) {
        return this.f1314b.getInt(i, i2);
    }

    /* renamed from: e */
    public int mo2111e(int i, int i2) {
        return this.f1314b.getInteger(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo2114f(int i) {
        return this.f1314b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean mo2116g(int i) {
        return this.f1314b.hasValue(i);
    }

    /* renamed from: a */
    public static C0291z m1194a(Context context, int i, int[] iArr) {
        return new C0291z(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: c */
    public int mo2107c(int i, int i2) {
        return this.f1314b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: a */
    public Typeface mo2101a(int i, int i2, C0555a aVar) {
        int resourceId = this.f1314b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1315c == null) {
            this.f1315c = new TypedValue();
        }
        return C0554e.m2606a(this.f1313a, resourceId, this.f1315c, i2, aVar);
    }

    /* renamed from: b */
    public float mo2104b(int i, float f) {
        return this.f1314b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo2105b(int i, int i2) {
        return this.f1314b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: a */
    public boolean mo2103a(int i, boolean z) {
        return this.f1314b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int mo2099a(int i, int i2) {
        return this.f1314b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo2100a(int i) {
        if (this.f1314b.hasValue(i)) {
            int resourceId = this.f1314b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C7531a.m18132b(this.f1313a, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return this.f1314b.getColorStateList(i);
    }

    /* renamed from: a */
    public float mo2098a(int i, float f) {
        return this.f1314b.getDimension(i, f);
    }

    /* renamed from: a */
    public void mo2102a() {
        this.f1314b.recycle();
    }
}
