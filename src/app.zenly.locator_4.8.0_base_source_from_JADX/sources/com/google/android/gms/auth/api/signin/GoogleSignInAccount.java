package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.util.C10169f;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C9977a();

    /* renamed from: r */
    private static Clock f26175r = C10169f.m25664a();

    /* renamed from: e */
    private final int f26176e;

    /* renamed from: f */
    private String f26177f;

    /* renamed from: g */
    private String f26178g;

    /* renamed from: h */
    private String f26179h;

    /* renamed from: i */
    private String f26180i;

    /* renamed from: j */
    private Uri f26181j;

    /* renamed from: k */
    private String f26182k;

    /* renamed from: l */
    private long f26183l;

    /* renamed from: m */
    private String f26184m;

    /* renamed from: n */
    private List<Scope> f26185n;

    /* renamed from: o */
    private String f26186o;

    /* renamed from: p */
    private String f26187p;

    /* renamed from: q */
    private Set<Scope> f26188q = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f26176e = i;
        this.f26177f = str;
        this.f26178g = str2;
        this.f26179h = str3;
        this.f26180i = str4;
        this.f26181j = uri;
        this.f26182k = str5;
        this.f26183l = j;
        this.f26184m = str6;
        this.f26185n = list;
        this.f26186o = str7;
        this.f26187p = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m24979a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m24980a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f26182k = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: b */
    public String mo26927b() {
        return this.f26180i;
    }

    /* renamed from: c */
    public String mo26928c() {
        return this.f26179h;
    }

    /* renamed from: d */
    public String mo26929d() {
        return this.f26187p;
    }

    /* renamed from: e */
    public String mo26930e() {
        return this.f26186o;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f26184m.equals(this.f26184m) && googleSignInAccount.mo26936i().equals(mo26936i());
    }

    /* renamed from: f */
    public String mo26932f() {
        return this.f26177f;
    }

    /* renamed from: g */
    public String mo26933g() {
        return this.f26178g;
    }

    /* renamed from: h */
    public Uri mo26934h() {
        return this.f26181j;
    }

    public int hashCode() {
        return ((this.f26184m.hashCode() + 527) * 31) + mo26936i().hashCode();
    }

    /* renamed from: i */
    public Set<Scope> mo26936i() {
        HashSet hashSet = new HashSet(this.f26185n);
        hashSet.addAll(this.f26188q);
        return hashSet;
    }

    /* renamed from: j */
    public String mo26937j() {
        return this.f26182k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26176e);
        C10134a.m25583a(parcel, 2, mo26932f(), false);
        C10134a.m25583a(parcel, 3, mo26933g(), false);
        C10134a.m25583a(parcel, 4, mo26928c(), false);
        C10134a.m25583a(parcel, 5, mo26927b(), false);
        C10134a.m25580a(parcel, 6, (Parcelable) mo26934h(), i, false);
        C10134a.m25583a(parcel, 7, mo26937j(), false);
        C10134a.m25576a(parcel, 8, this.f26183l);
        C10134a.m25583a(parcel, 9, this.f26184m, false);
        C10134a.m25597c(parcel, 10, this.f26185n, false);
        C10134a.m25583a(parcel, 11, mo26930e(), false);
        C10134a.m25583a(parcel, 12, mo26929d(), false);
        C10134a.m25571a(parcel, a);
    }

    /* renamed from: a */
    private static GoogleSignInAccount m24980a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f26175r.currentTimeMillis() / 1000) : l).longValue();
        C10123l.m25515b(str7);
        C10123l.m25505a(set);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
        return googleSignInAccount;
    }

    /* renamed from: a */
    public Account mo26926a() {
        String str = this.f26179h;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }
}
