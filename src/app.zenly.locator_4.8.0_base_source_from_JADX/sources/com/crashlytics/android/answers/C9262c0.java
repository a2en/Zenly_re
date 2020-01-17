package com.crashlytics.android.answers;

/* renamed from: com.crashlytics.android.answers.c0 */
final class C9262c0 {

    /* renamed from: a */
    public final String f24062a;

    /* renamed from: b */
    public final String f24063b;

    /* renamed from: c */
    public final String f24064c;

    /* renamed from: d */
    public final Boolean f24065d;

    /* renamed from: e */
    public final String f24066e;

    /* renamed from: f */
    public final String f24067f;

    /* renamed from: g */
    public final String f24068g;

    /* renamed from: h */
    public final String f24069h;

    /* renamed from: i */
    public final String f24070i;

    /* renamed from: j */
    public final String f24071j;

    /* renamed from: k */
    private String f24072k;

    public C9262c0(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f24062a = str;
        this.f24063b = str2;
        this.f24064c = str3;
        this.f24065d = bool;
        this.f24066e = str4;
        this.f24067f = str5;
        this.f24068g = str6;
        this.f24069h = str7;
        this.f24070i = str8;
        this.f24071j = str9;
    }

    public String toString() {
        if (this.f24072k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("appBundleId=");
            sb.append(this.f24062a);
            sb.append(", executionId=");
            sb.append(this.f24063b);
            sb.append(", installationId=");
            sb.append(this.f24064c);
            sb.append(", limitAdTrackingEnabled=");
            sb.append(this.f24065d);
            sb.append(", betaDeviceToken=");
            sb.append(this.f24066e);
            sb.append(", buildId=");
            sb.append(this.f24067f);
            sb.append(", osVersion=");
            sb.append(this.f24068g);
            sb.append(", deviceModel=");
            sb.append(this.f24069h);
            sb.append(", appVersionCode=");
            sb.append(this.f24070i);
            sb.append(", appVersionName=");
            sb.append(this.f24071j);
            this.f24072k = sb.toString();
        }
        return this.f24072k;
    }
}
