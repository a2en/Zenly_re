package com.zendesk.service;

import com.google.gson.C11138i;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.zendesk.service.f */
public class C12009f extends C11138i<Date> {

    /* renamed from: a */
    private static final TimeZone f31286a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public void write(C11265c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo32606h();
        } else {
            cVar.mo32603d(m31625a(date));
        }
    }

    public Date read(C11262a aVar) throws IOException {
        if (aVar.peek() == C11264b.NULL) {
            aVar.mo32585o();
            return null;
        }
        String p = aVar.mo32586p();
        try {
            return m31626a(p, new ParsePosition(0));
        } catch (ParseException e) {
            String str = "ZendeskDateTypeAdapter";
            Logger.m31607a(str, String.format(Locale.US, "Failed to parse Date from: %s", new Object[]{p}), e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private String m31625a(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f31286a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(21);
        m31627a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m31627a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m31627a(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m31627a(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        m31627a(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        m31627a(sb, gregorianCalendar.get(13), 2);
        sb.append('Z');
        return sb.toString();
    }

    /* renamed from: a */
    private void m31627a(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd A[Catch:{ IndexOutOfBoundsException -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0120 A[Catch:{ IndexOutOfBoundsException -> 0x0128 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Date m31626a(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.String r4 = "'"
            int r0 = r19.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r5 = r0 + 4
            int r0 = r1.m31624a(r2, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r6 = 45
            boolean r7 = r1.m31628a(r2, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r7 == 0) goto L_0x001c
            int r5 = r5 + 1
        L_0x001c:
            int r7 = r5 + 2
            int r5 = r1.m31624a(r2, r5, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            boolean r8 = r1.m31628a(r2, r7, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r8 == 0) goto L_0x002a
            int r7 = r7 + 1
        L_0x002a:
            int r8 = r7 + 2
            int r7 = r1.m31624a(r2, r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r9 = 84
            boolean r9 = r1.m31628a(r2, r8, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r10 = 1
            if (r9 != 0) goto L_0x004d
            int r11 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r11 > r8) goto L_0x004d
            java.util.GregorianCalendar r6 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r5 = r5 - r10
            r6.<init>(r0, r5, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r3.setIndex(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            java.util.Date r0 = r6.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            return r0
        L_0x004d:
            r11 = 90
            r13 = 2
            if (r9 == 0) goto L_0x00c2
            int r8 = r8 + 1
            int r9 = r8 + 2
            int r8 = r1.m31624a(r2, r8, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r14 = 58
            boolean r15 = r1.m31628a(r2, r9, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r15 == 0) goto L_0x0064
            int r9 = r9 + 1
        L_0x0064:
            int r15 = r9 + 2
            int r9 = r1.m31624a(r2, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            boolean r14 = r1.m31628a(r2, r15, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r14 == 0) goto L_0x0072
            int r15 = r15 + 1
        L_0x0072:
            int r14 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r14 <= r15) goto L_0x00bf
            char r14 = r2.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r14 == r11) goto L_0x00bf
            r12 = 43
            if (r14 == r12) goto L_0x00bf
            if (r14 == r6) goto L_0x00bf
            int r6 = r15 + 2
            int r12 = r1.m31624a(r2, r15, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r14 = 59
            if (r12 <= r14) goto L_0x0094
            r15 = 63
            if (r12 >= r15) goto L_0x0094
            r12 = 59
        L_0x0094:
            r14 = 46
            boolean r14 = r1.m31628a(r2, r6, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r14 == 0) goto L_0x00bc
            int r6 = r6 + 1
            int r14 = r6 + 1
            int r14 = m31623a(r2, r14)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r15 = r6 + 3
            int r15 = java.lang.Math.min(r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r16 = r1.m31624a(r2, r6, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r15 = r15 - r6
            if (r15 == r10) goto L_0x00b7
            if (r15 == r13) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            int r16 = r16 * 10
            goto L_0x00b9
        L_0x00b7:
            int r16 = r16 * 100
        L_0x00b9:
            r6 = r16
            goto L_0x00c7
        L_0x00bc:
            r14 = r6
            r6 = 0
            goto L_0x00c7
        L_0x00bf:
            r14 = r15
            r6 = 0
            goto L_0x00c6
        L_0x00c2:
            r14 = r8
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x00c6:
            r12 = 0
        L_0x00c7:
            int r15 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r15 <= r14) goto L_0x0120
            char r15 = r2.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            if (r15 != r11) goto L_0x0106
            java.util.TimeZone r11 = f31286a     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r14 = r14 + r10
            java.util.GregorianCalendar r15 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r15.<init>(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r11 = 0
            r15.setLenient(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r15.set(r10, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            int r5 = r5 - r10
            r15.set(r13, r5)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r0 = 5
            r15.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r0 = 11
            r15.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r0 = 12
            r15.set(r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r0 = 13
            r15.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r0 = 14
            r15.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r3.setIndex(r14)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            java.util.Date r0 = r15.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            return r0
        L_0x0106:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r5.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            java.lang.String r6 = "Invalid time zone indicator '"
            r5.append(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r5.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r5.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            java.lang.String r5 = r5.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            r0.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
        L_0x0120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            java.lang.String r5 = "No time zone indicator"
            r0.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            if (r2 != 0) goto L_0x012d
            r2 = 0
            goto L_0x0141
        L_0x012d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 34
            r5.append(r6)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
        L_0x0141:
            java.lang.String r4 = r0.getMessage()
            if (r4 == 0) goto L_0x014d
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x016b
        L_0x014d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x016b:
            java.text.ParseException r5 = new java.text.ParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to parse date ["
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = "]: "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            int r3 = r19.getIndex()
            r5.<init>(r2, r3)
            r5.initCause(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zendesk.service.C12009f.m31626a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: a */
    private boolean m31628a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: a */
    private int m31624a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        String str2 = "Invalid number: ";
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i4 = i;
            i3 = 0;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }

    /* renamed from: a */
    private static int m31623a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
