package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.gson.internal.i */
public class C11173i {
    /* renamed from: a */
    public static DateFormat m28738a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m28737a(i));
        sb.append(" ");
        sb.append(m28739b(i2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* renamed from: b */
    private static String m28739b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static String m28737a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
