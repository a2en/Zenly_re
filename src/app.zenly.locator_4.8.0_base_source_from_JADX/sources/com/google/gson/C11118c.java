package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.google.gson.c */
public enum C11118c implements FieldNamingStrategy {
    IDENTITY {
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String translateName(Field field) {
            return C11118c.m28630a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String translateName(Field field) {
            return C11118c.m28630a(C11118c.m28631a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String translateName(Field field) {
            return C11118c.m28631a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String translateName(Field field) {
            return C11118c.m28631a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        public String translateName(Field field) {
            return C11118c.m28631a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m28631a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m28630a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m28629a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m28629a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str.substring(i));
        return sb.toString();
    }
}
