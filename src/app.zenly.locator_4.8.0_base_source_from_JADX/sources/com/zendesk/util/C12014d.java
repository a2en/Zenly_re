package com.zendesk.util;

import android.os.Build.VERSION;
import com.zendesk.logger.Logger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: com.zendesk.util.d */
public class C12014d {

    /* renamed from: a */
    private static final String f31287a = "d";

    /* renamed from: b */
    private static final List<String> f31288b = Arrays.asList(new String[]{"he", "yi", "id"});

    /* renamed from: a */
    public static String m31647a(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (C12017g.m31658b(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(Locale.US));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static Locale m31650b(String str, String str2) {
        try {
            Method declaredMethod = Locale.class.getDeclaredMethod("createConstant", new Class[]{String.class, String.class});
            declaredMethod.setAccessible(true);
            return (Locale) declaredMethod.invoke(null, new Object[]{str, str2});
        } catch (Exception e) {
            Logger.m31607a(f31287a, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static Locale m31648a(String str) {
        Locale locale;
        Logger.m31608a(f31287a, "Assuming Locale.getDefault()", new Object[0]);
        Locale locale2 = Locale.getDefault();
        if (!C12017g.m31658b(str)) {
            return locale2;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        int countTokens = stringTokenizer.countTokens();
        int i = 2;
        if (countTokens == 1 || countTokens == 2) {
            if (countTokens != 1) {
                i = 5;
            }
            if (i != str.length()) {
                Logger.m31608a(f31287a, "number of tokens is correct but the length of the locale string does not match the expected length", new Object[0]);
                return locale2;
            }
            String nextToken = stringTokenizer.nextToken();
            String upperCase = (stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "").toUpperCase(Locale.US);
            if (f31288b.contains(nextToken)) {
                Logger.m31608a(f31287a, "New ISO-6390-Alpha3 locale detected trying to create new locale per reflection", new Object[0]);
                locale = m31650b(nextToken, upperCase);
                if (locale == null) {
                    locale = m31649a(nextToken, upperCase);
                }
                if (locale == null) {
                    locale = new Locale(nextToken, upperCase);
                }
            } else {
                locale = new Locale(nextToken, upperCase);
            }
            return locale;
        }
        Logger.m31614d(f31287a, "Unexpected number of tokens, must be at least one and at most two", new Object[0]);
        return locale2;
    }

    /* renamed from: a */
    private static Locale m31649a(String str, String str2) {
        try {
            if (VERSION.SDK_INT >= 14) {
                Constructor declaredConstructor = Locale.class.getDeclaredConstructor(new Class[]{Boolean.TYPE, String.class, String.class});
                declaredConstructor.setAccessible(true);
                return (Locale) declaredConstructor.newInstance(new Object[]{Boolean.valueOf(true), str, str2});
            }
            Constructor declaredConstructor2 = Locale.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor2.setAccessible(true);
            Locale locale = (Locale) declaredConstructor2.newInstance(new Object[0]);
            Class cls = locale.getClass();
            Field declaredField = cls.getDeclaredField("languageCode");
            declaredField.setAccessible(true);
            declaredField.set(locale, str);
            Field declaredField2 = cls.getDeclaredField("countryCode");
            declaredField2.setAccessible(true);
            declaredField2.set(locale, str2);
            return locale;
        } catch (Exception e) {
            Logger.m31607a(f31287a, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }
}
