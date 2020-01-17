package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.i */
public final class C10172i {

    /* renamed from: a */
    private static final Pattern f26728a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    static {
        Pattern.compile("\\\\.");
    }

    /* renamed from: a */
    public static String m25676a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f26728a.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt == 12) {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                } else if (charAt == 13) {
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                } else if (charAt == '\"') {
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                } else if (charAt == '/') {
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            matcher.appendReplacement(stringBuffer, "\\\\b");
                            break;
                        case 9:
                            matcher.appendReplacement(stringBuffer, "\\\\t");
                            break;
                        case 10:
                            matcher.appendReplacement(stringBuffer, "\\\\n");
                            break;
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                }
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return str;
    }
}
