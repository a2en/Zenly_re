package com.bluelinelabs.conductor.internal;

import android.text.TextUtils;

/* renamed from: com.bluelinelabs.conductor.internal.a */
public class C8846a {
    /* renamed from: a */
    public static <T> Class<? extends T> m21100a(String str, boolean z) {
        if (z && TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("An exception occurred while finding class for name ");
            sb.append(str);
            sb.append(". ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m21101a(String str) {
        try {
            Class a = m21100a(str, true);
            if (a != null) {
                return a.newInstance();
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("An exception occurred while creating a new instance of ");
            sb.append(str);
            sb.append(". ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }
}
