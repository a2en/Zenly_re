package com.google.common.base;

/* renamed from: com.google.common.base.b */
public final class C10837b {
    /* renamed from: a */
    public static String m27970a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m27971a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m27971a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m27971a(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
