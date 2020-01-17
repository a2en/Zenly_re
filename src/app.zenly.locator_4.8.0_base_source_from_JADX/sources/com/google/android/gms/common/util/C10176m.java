package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.m */
public class C10176m {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    /* renamed from: a */
    public static boolean m25690a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
