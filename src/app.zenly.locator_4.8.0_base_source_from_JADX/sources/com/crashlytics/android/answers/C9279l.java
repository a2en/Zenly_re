package com.crashlytics.android.answers;

/* renamed from: com.crashlytics.android.answers.l */
public class C9279l extends C9263d<C9279l> {

    /* renamed from: c */
    private final String f24109c;

    public C9279l(String str) {
        if (str != null) {
            this.f24109c = this.f24073a.mo24979a(str);
            return;
        }
        throw new NullPointerException("eventName must not be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo25009b() {
        return this.f24109c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{eventName:\"");
        sb.append(this.f24109c);
        sb.append('\"');
        sb.append(", customAttributes:");
        sb.append(this.f24074b);
        sb.append("}");
        return sb.toString();
    }
}
