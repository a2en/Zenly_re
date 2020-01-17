package com.crashlytics.android.core;

import android.app.ActivityManager.RunningAppProcessInfo;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.common.C12195p.C12196a;

/* renamed from: com.crashlytics.android.core.o0 */
class C9400o0 {

    /* renamed from: a */
    private static final C9311d f24356a = C9311d.m22450a("0");

    /* renamed from: b */
    private static final C9311d f24357b = C9311d.m22450a("Unity");

    /* renamed from: a */
    public static void m22746a(C9318g gVar, String str, String str2, long j) throws Exception {
        gVar.mo25094a(1, C9311d.m22450a(str2));
        gVar.mo25094a(2, C9311d.m22450a(str));
        gVar.mo25093a(3, j);
    }

    /* renamed from: b */
    private static int m22752b(C9311d dVar) {
        return C9318g.m22484b(1, dVar) + 0;
    }

    /* renamed from: a */
    public static void m22748a(C9318g gVar, String str, String str2, String str3, String str4, String str5, int i, String str6) throws Exception {
        C9311d a = C9311d.m22450a(str);
        C9311d a2 = C9311d.m22450a(str2);
        C9311d a3 = C9311d.m22450a(str3);
        C9311d a4 = C9311d.m22450a(str4);
        C9311d a5 = C9311d.m22450a(str5);
        C9311d a6 = str6 != null ? C9311d.m22450a(str6) : null;
        gVar.mo25107c(7, 2);
        gVar.mo25110e(m22727a(a, a2, a3, a4, a5, i, a6));
        gVar.mo25094a(1, a);
        gVar.mo25094a(2, a3);
        gVar.mo25094a(3, a4);
        gVar.mo25107c(5, 2);
        gVar.mo25110e(m22752b(a2));
        gVar.mo25094a(1, a2);
        gVar.mo25094a(6, a5);
        if (a6 != null) {
            gVar.mo25094a(8, f24357b);
            gVar.mo25094a(9, a6);
        }
        gVar.mo25092a(10, i);
    }

    /* renamed from: a */
    public static void m22749a(C9318g gVar, String str, String str2, boolean z) throws Exception {
        C9311d a = C9311d.m22450a(str);
        C9311d a2 = C9311d.m22450a(str2);
        gVar.mo25107c(8, 2);
        gVar.mo25110e(m22728a(a, a2, z));
        gVar.mo25092a(1, 3);
        gVar.mo25094a(2, a);
        gVar.mo25094a(3, a2);
        gVar.mo25095a(4, z);
    }

    /* renamed from: a */
    public static void m22739a(C9318g gVar, int i, String str, int i2, long j, long j2, boolean z, Map<C12196a, String> map, int i3, String str2, String str3) throws Exception {
        C9318g gVar2 = gVar;
        C9311d a = m22737a(str);
        C9311d a2 = m22737a(str3);
        C9311d a3 = m22737a(str2);
        gVar2.mo25107c(9, 2);
        C9311d dVar = a3;
        gVar2.mo25110e(m22723a(i, a, i2, j, j2, z, map, i3, a3, a2));
        gVar2.mo25092a(3, i);
        gVar2.mo25094a(4, a);
        gVar2.mo25109d(5, i2);
        gVar2.mo25093a(6, j);
        gVar2.mo25093a(7, j2);
        gVar2.mo25095a(10, z);
        for (Entry entry : map.entrySet()) {
            gVar2.mo25107c(11, 2);
            gVar2.mo25110e(m22732a((C12196a) entry.getKey(), (String) entry.getValue()));
            gVar2.mo25092a(1, ((C12196a) entry.getKey()).f31722e);
            gVar2.mo25094a(2, C9311d.m22450a((String) entry.getValue()));
        }
        gVar2.mo25109d(12, i3);
        if (dVar != null) {
            gVar2.mo25094a(13, dVar);
        }
        if (a2 != null) {
            gVar2.mo25094a(14, a2);
        }
    }

    /* renamed from: a */
    public static void m22747a(C9318g gVar, String str, String str2, String str3) throws Exception {
        if (str == null) {
            str = "";
        }
        C9311d a = C9311d.m22450a(str);
        C9311d a2 = m22737a(str2);
        C9311d a3 = m22737a(str3);
        int b = C9318g.m22484b(1, a) + 0;
        if (str2 != null) {
            b += C9318g.m22484b(2, a2);
        }
        if (str3 != null) {
            b += C9318g.m22484b(3, a3);
        }
        gVar.mo25107c(6, 2);
        gVar.mo25110e(b);
        gVar.mo25094a(1, a);
        if (str2 != null) {
            gVar.mo25094a(2, a2);
        }
        if (str3 != null) {
            gVar.mo25094a(3, a3);
        }
    }

    /* renamed from: a */
    public static void m22740a(C9318g gVar, long j, String str, C9410s0 s0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, LogFileManager logFileManager, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) throws Exception {
        C9311d dVar;
        C9318g gVar2 = gVar;
        String str4 = str3;
        C9311d a = C9311d.m22450a(str2);
        if (str4 == null) {
            dVar = null;
        } else {
            dVar = C9311d.m22450a(str4.replace("-", ""));
        }
        C9311d dVar2 = dVar;
        C9311d b = logFileManager.mo25050b();
        if (b == null) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "No log data to include with this event.");
        }
        logFileManager.mo25045a();
        gVar2.mo25107c(10, 2);
        gVar2.mo25110e(m22724a(j, str, s0Var, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, a, dVar2, f, i2, z, j2, j3, b));
        gVar2.mo25093a(1, j);
        gVar2.mo25094a(2, C9311d.m22450a(str));
        C9311d dVar3 = b;
        m22744a(gVar, s0Var, thread, stackTraceElementArr, threadArr, list, 8, a, dVar2, map, runningAppProcessInfo, i);
        m22745a(gVar, f, i2, z, i, j2, j3);
        m22741a(gVar2, dVar3);
    }

    /* renamed from: a */
    private static void m22744a(C9318g gVar, C9410s0 s0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C9311d dVar, C9311d dVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) throws Exception {
        gVar.mo25107c(3, 2);
        gVar.mo25110e(m22731a(s0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2, map, runningAppProcessInfo, i2));
        m22743a(gVar, s0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2);
        if (map != null && !map.isEmpty()) {
            m22751a(gVar, map);
        }
        if (runningAppProcessInfo != null) {
            gVar.mo25095a(3, runningAppProcessInfo.importance != 100);
        }
        gVar.mo25109d(4, i2);
    }

    /* renamed from: a */
    private static void m22743a(C9318g gVar, C9410s0 s0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C9311d dVar, C9311d dVar2) throws Exception {
        gVar.mo25107c(1, 2);
        gVar.mo25110e(m22730a(s0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2));
        m22750a(gVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            m22750a(gVar, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        m22742a(gVar, s0Var, 1, i, 2);
        gVar.mo25107c(3, 2);
        gVar.mo25110e(m22722a());
        gVar.mo25094a(1, f24356a);
        gVar.mo25094a(2, f24356a);
        gVar.mo25093a(3, 0);
        gVar.mo25107c(4, 2);
        gVar.mo25110e(m22726a(dVar, dVar2));
        gVar.mo25093a(1, 0);
        gVar.mo25093a(2, 0);
        gVar.mo25094a(3, dVar);
        if (dVar2 != null) {
            gVar.mo25094a(4, dVar2);
        }
    }

    /* renamed from: a */
    private static void m22751a(C9318g gVar, Map<String, String> map) throws Exception {
        for (Entry entry : map.entrySet()) {
            gVar.mo25107c(2, 2);
            gVar.mo25110e(m22735a((String) entry.getKey(), (String) entry.getValue()));
            gVar.mo25094a(1, C9311d.m22450a((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            gVar.mo25094a(2, C9311d.m22450a(str));
        }
    }

    /* renamed from: a */
    private static void m22742a(C9318g gVar, C9410s0 s0Var, int i, int i2, int i3) throws Exception {
        gVar.mo25107c(i3, 2);
        gVar.mo25110e(m22729a(s0Var, 1, i2));
        gVar.mo25094a(1, C9311d.m22450a(s0Var.f24370b));
        String str = s0Var.f24369a;
        if (str != null) {
            gVar.mo25094a(3, C9311d.m22450a(str));
        }
        int i4 = 0;
        for (StackTraceElement a : s0Var.f24371c) {
            m22738a(gVar, 4, a, true);
        }
        C9410s0 s0Var2 = s0Var.f24372d;
        if (s0Var2 == null) {
            return;
        }
        if (i < i2) {
            m22742a(gVar, s0Var2, i + 1, i2, 6);
            return;
        }
        while (s0Var2 != null) {
            s0Var2 = s0Var2.f24372d;
            i4++;
        }
        gVar.mo25109d(7, i4);
    }

    /* renamed from: a */
    private static void m22750a(C9318g gVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) throws Exception {
        gVar.mo25107c(1, 2);
        gVar.mo25110e(m22736a(thread, stackTraceElementArr, i, z));
        gVar.mo25094a(1, C9311d.m22450a(thread.getName()));
        gVar.mo25109d(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            m22738a(gVar, 3, a, z);
        }
    }

    /* renamed from: a */
    private static void m22738a(C9318g gVar, int i, StackTraceElement stackTraceElement, boolean z) throws Exception {
        gVar.mo25107c(i, 2);
        gVar.mo25110e(m22734a(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            gVar.mo25093a(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            gVar.mo25093a(1, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        gVar.mo25094a(2, C9311d.m22450a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            gVar.mo25094a(3, C9311d.m22450a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            gVar.mo25093a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        gVar.mo25109d(5, i2);
    }

    /* renamed from: a */
    private static void m22745a(C9318g gVar, Float f, int i, boolean z, int i2, long j, long j2) throws Exception {
        gVar.mo25107c(5, 2);
        gVar.mo25110e(m22733a(f, i, z, i2, j, j2));
        if (f != null) {
            gVar.mo25091a(1, f.floatValue());
        }
        gVar.mo25103b(2, i);
        gVar.mo25095a(3, z);
        gVar.mo25109d(4, i2);
        gVar.mo25093a(5, j);
        gVar.mo25093a(6, j2);
    }

    /* renamed from: a */
    private static void m22741a(C9318g gVar, C9311d dVar) throws Exception {
        if (dVar != null) {
            gVar.mo25107c(6, 2);
            gVar.mo25110e(m22725a(dVar));
            gVar.mo25094a(1, dVar);
        }
    }

    /* renamed from: a */
    private static int m22727a(C9311d dVar, C9311d dVar2, C9311d dVar3, C9311d dVar4, C9311d dVar5, int i, C9311d dVar6) {
        int b = C9318g.m22484b(1, dVar) + 0 + C9318g.m22484b(2, dVar3) + C9318g.m22484b(3, dVar4);
        int b2 = m22752b(dVar2);
        int l = b + C9318g.m22497l(5) + C9318g.m22495j(b2) + b2 + C9318g.m22484b(6, dVar5);
        if (dVar6 != null) {
            l = l + C9318g.m22484b(8, f24357b) + C9318g.m22484b(9, dVar6);
        }
        return l + C9318g.m22490e(10, i);
    }

    /* renamed from: a */
    private static int m22728a(C9311d dVar, C9311d dVar2, boolean z) {
        return C9318g.m22490e(1, 3) + 0 + C9318g.m22484b(2, dVar) + C9318g.m22484b(3, dVar2) + C9318g.m22485b(4, z);
    }

    /* renamed from: a */
    private static int m22732a(C12196a aVar, String str) {
        return C9318g.m22490e(1, aVar.f31722e) + C9318g.m22484b(2, C9311d.m22450a(str));
    }

    /* renamed from: a */
    private static int m22723a(int i, C9311d dVar, int i2, long j, long j2, boolean z, Map<C12196a, String> map, int i3, C9311d dVar2, C9311d dVar3) {
        int i4;
        int i5;
        int i6 = 0;
        int e = C9318g.m22490e(3, i) + 0;
        if (dVar == null) {
            i4 = 0;
        } else {
            i4 = C9318g.m22484b(4, dVar);
        }
        int g = e + i4 + C9318g.m22492g(5, i2) + C9318g.m22483b(6, j) + C9318g.m22483b(7, j2) + C9318g.m22485b(10, z);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a = m22732a((C12196a) entry.getKey(), (String) entry.getValue());
                g += C9318g.m22497l(11) + C9318g.m22495j(a) + a;
            }
        }
        int g2 = g + C9318g.m22492g(12, i3);
        if (dVar2 == null) {
            i5 = 0;
        } else {
            i5 = C9318g.m22484b(13, dVar2);
        }
        int i7 = g2 + i5;
        if (dVar3 != null) {
            i6 = C9318g.m22484b(14, dVar3);
        }
        return i7 + i6;
    }

    /* renamed from: a */
    private static int m22726a(C9311d dVar, C9311d dVar2) {
        int b = C9318g.m22483b(1, 0) + 0 + C9318g.m22483b(2, 0) + C9318g.m22484b(3, dVar);
        return dVar2 != null ? b + C9318g.m22484b(4, dVar2) : b;
    }

    /* renamed from: a */
    private static int m22724a(long j, String str, C9410s0 s0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, C9311d dVar, C9311d dVar2, Float f, int i3, boolean z, long j2, long j3, C9311d dVar3) {
        long j4 = j;
        int b = C9318g.m22483b(1, j) + 0 + C9318g.m22484b(2, C9311d.m22450a(str));
        int a = m22731a(s0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2, map, runningAppProcessInfo, i2);
        int l = b + C9318g.m22497l(3) + C9318g.m22495j(a) + a;
        int a2 = m22733a(f, i3, z, i2, j2, j3);
        int l2 = l + C9318g.m22497l(5) + C9318g.m22495j(a2) + a2;
        if (dVar3 == null) {
            return l2;
        }
        int a3 = m22725a(dVar3);
        return l2 + C9318g.m22497l(6) + C9318g.m22495j(a3) + a3;
    }

    /* renamed from: a */
    private static int m22731a(C9410s0 s0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C9311d dVar, C9311d dVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a = m22730a(s0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2);
        int l = C9318g.m22497l(1) + C9318g.m22495j(a) + a;
        boolean z = false;
        int i3 = l + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a2 = m22735a((String) entry.getKey(), (String) entry.getValue());
                i3 += C9318g.m22497l(2) + C9318g.m22495j(a2) + a2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i3 += C9318g.m22485b(3, z);
        }
        return i3 + C9318g.m22492g(4, i2);
    }

    /* renamed from: a */
    private static int m22730a(C9410s0 s0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C9311d dVar, C9311d dVar2) {
        int a = m22736a(thread, stackTraceElementArr, 4, true);
        int l = C9318g.m22497l(1) + C9318g.m22495j(a) + a + 0;
        int length = threadArr.length;
        int i2 = l;
        for (int i3 = 0; i3 < length; i3++) {
            int a2 = m22736a(threadArr[i3], (StackTraceElement[]) list.get(i3), 0, false);
            i2 += C9318g.m22497l(1) + C9318g.m22495j(a2) + a2;
        }
        int a3 = m22729a(s0Var, 1, i);
        int l2 = i2 + C9318g.m22497l(2) + C9318g.m22495j(a3) + a3;
        int a4 = m22722a();
        int l3 = l2 + C9318g.m22497l(3) + C9318g.m22495j(a4) + a4;
        int a5 = m22726a(dVar, dVar2);
        return l3 + C9318g.m22497l(3) + C9318g.m22495j(a5) + a5;
    }

    /* renamed from: a */
    private static int m22735a(String str, String str2) {
        int b = C9318g.m22484b(1, C9311d.m22450a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b + C9318g.m22484b(2, C9311d.m22450a(str2));
    }

    /* renamed from: a */
    private static int m22733a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + C9318g.m22482b(1, f.floatValue());
        }
        return i3 + C9318g.m22491f(2, i) + C9318g.m22485b(3, z) + C9318g.m22492g(4, i2) + C9318g.m22483b(5, j) + C9318g.m22483b(6, j2);
    }

    /* renamed from: a */
    private static int m22725a(C9311d dVar) {
        return C9318g.m22484b(1, dVar);
    }

    /* renamed from: a */
    private static int m22729a(C9410s0 s0Var, int i, int i2) {
        int i3 = 0;
        int b = C9318g.m22484b(1, C9311d.m22450a(s0Var.f24370b)) + 0;
        String str = s0Var.f24369a;
        if (str != null) {
            b += C9318g.m22484b(3, C9311d.m22450a(str));
        }
        int i4 = b;
        for (StackTraceElement a : s0Var.f24371c) {
            int a2 = m22734a(a, true);
            i4 += C9318g.m22497l(4) + C9318g.m22495j(a2) + a2;
        }
        C9410s0 s0Var2 = s0Var.f24372d;
        if (s0Var2 == null) {
            return i4;
        }
        if (i < i2) {
            int a3 = m22729a(s0Var2, i + 1, i2);
            return i4 + C9318g.m22497l(6) + C9318g.m22495j(a3) + a3;
        }
        while (s0Var2 != null) {
            s0Var2 = s0Var2.f24372d;
            i3++;
        }
        return i4 + C9318g.m22492g(7, i3);
    }

    /* renamed from: a */
    private static int m22722a() {
        return C9318g.m22484b(1, f24356a) + 0 + C9318g.m22484b(2, f24356a) + C9318g.m22483b(3, 0);
    }

    /* renamed from: a */
    private static int m22734a(StackTraceElement stackTraceElement, boolean z) {
        int i;
        int i2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            i = C9318g.m22483b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            i = C9318g.m22483b(1, 0);
        }
        int i3 = i + 0;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        int b = i3 + C9318g.m22484b(2, C9311d.m22450a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            b += C9318g.m22484b(3, C9311d.m22450a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b += C9318g.m22483b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 2;
        }
        return b + C9318g.m22492g(5, i2);
    }

    /* renamed from: a */
    private static int m22736a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b = C9318g.m22484b(1, C9311d.m22450a(thread.getName())) + C9318g.m22492g(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = m22734a(a, z);
            b += C9318g.m22497l(3) + C9318g.m22495j(a2) + a2;
        }
        return b;
    }

    /* renamed from: a */
    private static C9311d m22737a(String str) {
        if (str == null) {
            return null;
        }
        return C9311d.m22450a(str);
    }
}
