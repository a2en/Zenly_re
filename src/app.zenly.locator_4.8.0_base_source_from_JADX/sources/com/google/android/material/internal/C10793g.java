package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0291z;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12076k;

/* renamed from: com.google.android.material.internal.g */
public final class C10793g {

    /* renamed from: a */
    private static final int[] f28197a = {C12067b.colorPrimary};

    /* renamed from: b */
    private static final int[] f28198b = {C12067b.colorSecondary};

    /* renamed from: a */
    private static void m27772a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C12076k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m27776b(context);
        }
        m27771a(context);
    }

    /* renamed from: b */
    private static boolean m27777b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    public static TypedArray m27778c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m27772a(context, attributeSet, i, i2);
        m27773a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0291z m27779d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m27772a(context, attributeSet, i, i2);
        m27773a(context, attributeSet, iArr, i, i2, iArr2);
        return C0291z.m1196a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static void m27776b(Context context) {
        m27774a(context, f28198b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static void m27773a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C12076k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean z = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(C12076k.ThemeEnforcement_android_textAppearance, -1) != -1 : m27777b(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    public static void m27771a(Context context) {
        m27774a(context, f28197a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static boolean m27775a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: a */
    private static void m27774a(Context context, int[] iArr, String str) {
        if (!m27775a(context, iArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
