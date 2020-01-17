package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0607i;
import java.util.List;

/* renamed from: androidx.core.provider.a */
public final class C0574a {

    /* renamed from: a */
    private final String f2657a;

    /* renamed from: b */
    private final String f2658b;

    /* renamed from: c */
    private final String f2659c;

    /* renamed from: d */
    private final List<List<byte[]>> f2660d;

    /* renamed from: e */
    private final int f2661e;

    /* renamed from: f */
    private final String f2662f;

    public C0574a(String str, String str2, String str3, List<List<byte[]>> list) {
        C0607i.m2773a(str);
        this.f2657a = str;
        C0607i.m2773a(str2);
        this.f2658b = str2;
        C0607i.m2773a(str3);
        this.f2659c = str3;
        C0607i.m2773a(list);
        this.f2660d = list;
        this.f2661e = 0;
        StringBuilder sb = new StringBuilder(this.f2657a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.f2658b);
        sb.append(str4);
        sb.append(this.f2659c);
        this.f2662f = sb.toString();
    }

    /* renamed from: a */
    public List<List<byte[]>> mo3182a() {
        return this.f2660d;
    }

    /* renamed from: b */
    public int mo3183b() {
        return this.f2661e;
    }

    /* renamed from: c */
    public String mo3184c() {
        return this.f2662f;
    }

    /* renamed from: d */
    public String mo3185d() {
        return this.f2657a;
    }

    /* renamed from: e */
    public String mo3186e() {
        return this.f2658b;
    }

    /* renamed from: f */
    public String mo3187f() {
        return this.f2659c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f2657a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f2658b);
        sb2.append(", mQuery: ");
        sb2.append(this.f2659c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f2660d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f2660d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f2661e);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public C0574a(String str, String str2, String str3, int i) {
        C0607i.m2773a(str);
        this.f2657a = str;
        C0607i.m2773a(str2);
        this.f2658b = str2;
        C0607i.m2773a(str3);
        this.f2659c = str3;
        this.f2660d = null;
        C0607i.m2775a(i != 0);
        this.f2661e = i;
        StringBuilder sb = new StringBuilder(this.f2657a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.f2658b);
        sb.append(str4);
        sb.append(this.f2659c);
        this.f2662f = sb.toString();
    }
}
