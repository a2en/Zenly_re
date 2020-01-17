package com.crashlytics.android.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.core.i0 */
final class C9330i0 {

    /* renamed from: a */
    private static final Pattern f24199a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    /* renamed from: a */
    public static C9323h0 m22539a(String str) {
        Matcher matcher = f24199a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            C9323h0 h0Var = new C9323h0(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            return h0Var;
        } catch (Exception unused) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not parse map entry: ");
            sb.append(str);
            f.mo35954d("CrashlyticsCore", sb.toString());
            return null;
        }
    }
}
