package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.C9980a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GoogleSignInOptions extends AbstractSafeParcelable implements Optional, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C9979c();

    /* renamed from: o */
    public static final Scope f26189o = new Scope("profile");

    /* renamed from: p */
    public static final Scope f26190p = new Scope("openid");

    /* renamed from: q */
    public static final Scope f26191q = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: r */
    public static final Scope f26192r = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: e */
    private final int f26193e;

    /* renamed from: f */
    private final ArrayList<Scope> f26194f;

    /* renamed from: g */
    private Account f26195g;

    /* renamed from: h */
    private boolean f26196h;

    /* renamed from: i */
    private final boolean f26197i;

    /* renamed from: j */
    private final boolean f26198j;

    /* renamed from: k */
    private String f26199k;

    /* renamed from: l */
    private String f26200l;

    /* renamed from: m */
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f26201m;

    /* renamed from: n */
    private String f26202n;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C9976a {

        /* renamed from: a */
        private Set<Scope> f26203a = new HashSet();

        /* renamed from: b */
        private boolean f26204b;

        /* renamed from: c */
        private boolean f26205c;

        /* renamed from: d */
        private boolean f26206d;

        /* renamed from: e */
        private String f26207e;

        /* renamed from: f */
        private Account f26208f;

        /* renamed from: g */
        private String f26209g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f26210h = new HashMap();

        /* renamed from: i */
        private String f26211i;

        /* renamed from: a */
        public final C9976a mo26950a(Scope scope, Scope... scopeArr) {
            this.f26203a.add(scope);
            this.f26203a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: b */
        public final C9976a mo26952b() {
            this.f26203a.add(GoogleSignInOptions.f26190p);
            return this;
        }

        /* renamed from: c */
        public final C9976a mo26953c() {
            this.f26203a.add(GoogleSignInOptions.f26189o);
            return this;
        }

        /* renamed from: a */
        public final GoogleSignInOptions mo26951a() {
            if (this.f26203a.contains(GoogleSignInOptions.f26192r) && this.f26203a.contains(GoogleSignInOptions.f26191q)) {
                this.f26203a.remove(GoogleSignInOptions.f26191q);
            }
            if (this.f26206d && (this.f26208f == null || !this.f26203a.isEmpty())) {
                mo26952b();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f26203a), this.f26208f, this.f26206d, this.f26204b, this.f26205c, this.f26207e, this.f26209g, this.f26210h, this.f26211i, null);
            return googleSignInOptions;
        }
    }

    static {
        new Scope("email");
        C9976a b = new C9976a().mo26952b();
        b.mo26953c();
        b.mo26951a();
        C9976a aVar = new C9976a();
        aVar.mo26950a(f26191q, new Scope[0]);
        aVar.mo26951a();
        new C9978b();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m24991a(arrayList2), str3);
    }

    /* renamed from: a */
    public Account mo26939a() {
        return this.f26195g;
    }

    /* renamed from: b */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo26940b() {
        return this.f26201m;
    }

    /* renamed from: c */
    public String mo26941c() {
        return this.f26202n;
    }

    /* renamed from: d */
    public ArrayList<Scope> mo26942d() {
        return new ArrayList<>(this.f26194f);
    }

    /* renamed from: e */
    public String mo26943e() {
        return this.f26199k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f26195g.equals(r4.mo26939a()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f26199k.equals(r4.mo26943e()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f26201m     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 > 0) goto L_0x0091
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f26201m     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0091
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f26194f     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList r2 = r4.mo26942d()     // Catch:{ ClassCastException -> 0x0091 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f26194f     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList r2 = r4.mo26942d()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0091
        L_0x0035:
            android.accounts.Account r1 = r3.f26195g     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo26939a()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0091
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f26195g     // Catch:{ ClassCastException -> 0x0091 }
            android.accounts.Account r2 = r4.mo26939a()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
        L_0x004c:
            java.lang.String r1 = r3.f26199k     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo26943e()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f26199k     // Catch:{ ClassCastException -> 0x0091 }
            java.lang.String r2 = r4.mo26943e()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
        L_0x006b:
            boolean r1 = r3.f26198j     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo26945f()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            boolean r1 = r3.f26196h     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo26946g()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            boolean r1 = r3.f26197i     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo26947h()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            java.lang.String r1 = r3.f26202n     // Catch:{ ClassCastException -> 0x0091 }
            java.lang.String r4 = r4.mo26941c()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0091 }
            if (r4 == 0) goto L_0x0091
            r4 = 1
            return r4
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public boolean mo26945f() {
        return this.f26198j;
    }

    /* renamed from: g */
    public boolean mo26946g() {
        return this.f26196h;
    }

    /* renamed from: h */
    public boolean mo26947h() {
        return this.f26197i;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f26194f;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo27054a());
        }
        Collections.sort(arrayList);
        C9980a aVar = new C9980a();
        aVar.mo26965a((Object) arrayList);
        aVar.mo26965a((Object) this.f26195g);
        aVar.mo26965a((Object) this.f26199k);
        aVar.mo26966a(this.f26198j);
        aVar.mo26966a(this.f26196h);
        aVar.mo26966a(this.f26197i);
        aVar.mo26965a((Object) this.f26202n);
        return aVar.mo26964a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26193e);
        C10134a.m25597c(parcel, 2, mo26942d(), false);
        C10134a.m25580a(parcel, 3, (Parcelable) mo26939a(), i, false);
        C10134a.m25586a(parcel, 4, mo26946g());
        C10134a.m25586a(parcel, 5, mo26947h());
        C10134a.m25586a(parcel, 6, mo26945f());
        C10134a.m25583a(parcel, 7, mo26943e(), false);
        C10134a.m25583a(parcel, 8, this.f26200l, false);
        C10134a.m25597c(parcel, 9, mo26940b(), false);
        C10134a.m25583a(parcel, 10, mo26941c(), false);
        C10134a.m25571a(parcel, a);
    }

    /* renamed from: a */
    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> m24991a(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo26962a()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f26193e = i;
        this.f26194f = arrayList;
        this.f26195g = account;
        this.f26196h = z;
        this.f26197i = z2;
        this.f26198j = z3;
        this.f26199k = str;
        this.f26200l = str2;
        this.f26201m = new ArrayList<>(map.values());
        this.f26202n = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C9978b bVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }
}
