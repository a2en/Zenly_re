package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.f */
public class C0558f {
    /* renamed from: a */
    public static boolean m2622a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m2623b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2622a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: c */
    public static int m2625c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2622a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static float m2614a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m2622a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static TypedValue m2624b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2622a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: a */
    public static boolean m2621a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m2622a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static int m2615a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2622a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static C0550b m2619a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m2622a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0550b.m2588b(typedValue.data);
            }
            C0550b b = C0550b.m2589b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C0550b.m2588b(i2);
    }

    /* renamed from: a */
    public static ColorStateList m2616a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i) {
        if (!m2622a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        } else if (i2 < 28 || i2 > 31) {
            return C0549a.m2580a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m2617a(typedValue);
        }
    }

    /* renamed from: a */
    private static ColorStateList m2617a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: a */
    public static String m2620a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2622a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static TypedArray m2618a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
