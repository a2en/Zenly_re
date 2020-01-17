package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.core.widget.C0676d;
import com.mapbox.mapboxsdk.C11453f;
import com.mapbox.mapboxsdk.exceptions.ConversionException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.mapbox.mapboxsdk.utils.b */
public class C11595b {
    /* renamed from: a */
    public static int m30373a(Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(context.getResources().getIdentifier("colorPrimary", "attrs", context.getPackageName()), typedValue, true);
            return typedValue.data;
        } catch (Exception unused) {
            return m30374a(context, C11453f.mapbox_blue);
        }
    }

    /* renamed from: b */
    public static ColorStateList m30379b(int i) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{i, i});
    }

    /* renamed from: b */
    public static int m30378b(String str) {
        Matcher matcher = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(str);
        if (matcher.matches() && matcher.groupCount() == 3) {
            return Color.rgb(m30375a(matcher.group(1)), m30375a(matcher.group(2)), m30375a(matcher.group(3)));
        }
        if (matcher.matches() && matcher.groupCount() == 4) {
            return Color.argb(m30375a(matcher.group(4)), m30375a(matcher.group(1)), m30375a(matcher.group(2)), m30375a(matcher.group(3)));
        }
        throw new ConversionException("Not a valid rgb/rgba value");
    }

    /* renamed from: a */
    public static void m30377a(ImageView imageView, int i) {
        C0676d.m3164a(imageView, m30379b(i));
    }

    /* renamed from: a */
    private static int m30375a(String str) {
        return (int) (Float.parseFloat(str) * 255.0f);
    }

    /* renamed from: a */
    public static String m30376a(int i) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#.###");
        String format = decimalFormat.format((double) (((float) ((i >> 24) & 255)) / 255.0f));
        return String.format(Locale.US, "rgba(%d, %d, %d, %s)", new Object[]{Integer.valueOf((i >> 16) & 255), Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255), format});
    }

    /* renamed from: a */
    private static int m30374a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getResources().getColor(i, context.getTheme());
        }
        return context.getResources().getColor(i);
    }
}
