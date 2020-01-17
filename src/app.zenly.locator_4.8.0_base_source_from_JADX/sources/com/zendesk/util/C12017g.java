package com.zendesk.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.zendesk.util.g */
public class C12017g {

    /* renamed from: a */
    private static Map<Character, String> f31297a = new HashMap();

    /* renamed from: b */
    public static final String f31298b = System.getProperty("line.separator");

    static {
        f31297a.put(Character.valueOf('\''), "\\'");
        f31297a.put(Character.valueOf('\"'), "\\\"");
        f31297a.put(Character.valueOf('\\'), "\\\\");
        f31297a.put(Character.valueOf('/'), "\\/");
        f31297a.put(Character.valueOf(8), "\\b");
        f31297a.put(Character.valueOf(10), "\\n");
        f31297a.put(Character.valueOf(9), "\\t");
        f31297a.put(Character.valueOf(12), "\\f");
        f31297a.put(Character.valueOf(13), "\\r");
    }

    /* renamed from: a */
    public static boolean m31655a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String c : strArr) {
            if (m31659c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m31658b(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: c */
    public static boolean m31659c(String str) {
        return !m31658b(str);
    }

    /* renamed from: d */
    public static boolean m31660d(String str) {
        if (m31659c(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m31657b(String... strArr) {
        return m31653a(strArr == null ? null : Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static String m31653a(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (m31658b((String) list.get(i))) {
                sb.append((String) list.get(i));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m31656b(List<? extends Number> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Number number : list) {
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return m31653a((List<String>) arrayList);
    }

    /* renamed from: a */
    public static List<String> m31654a(String str) {
        if (!m31658b(str)) {
            return C12010a.m31641c(new ArrayList(0));
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (m31658b(str2)) {
                arrayList.add(str2);
            }
        }
        return C12010a.m31641c(arrayList);
    }
}
