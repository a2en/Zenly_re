package com.google.gson.internal;

/* renamed from: com.google.gson.internal.e */
public final class C11162e {

    /* renamed from: a */
    private static final int f28884a = m28716a();

    /* renamed from: a */
    private static int m28716a() {
        return m28719b(System.getProperty("java.version"));
    }

    /* renamed from: b */
    static int m28719b(String str) {
        int c = m28720c(str);
        if (c == -1) {
            c = m28717a(str);
        }
        if (c == -1) {
            return 6;
        }
        return c;
    }

    /* renamed from: c */
    private static int m28720c(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m28717a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m28718b() {
        return f28884a;
    }

    /* renamed from: c */
    public static boolean m28721c() {
        return f28884a >= 9;
    }
}
