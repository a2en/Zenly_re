package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.C10164a;
import com.google.android.gms.common.util.C10165b;
import com.google.android.gms.common.util.C10172i;
import com.google.android.gms.common.util.C10173j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Creator<SafeParcelResponse> CREATOR = new C10161e();

    /* renamed from: e */
    private final int f26690e;

    /* renamed from: f */
    private final Parcel f26691f;

    /* renamed from: g */
    private final int f26692g = 2;

    /* renamed from: h */
    private final zaj f26693h;

    /* renamed from: i */
    private final String f26694i;

    /* renamed from: j */
    private int f26695j;

    /* renamed from: k */
    private int f26696k;

    SafeParcelResponse(int i, Parcel parcel, zaj zaj) {
        this.f26690e = i;
        C10123l.m25505a(parcel);
        this.f26691f = parcel;
        this.f26693h = zaj;
        zaj zaj2 = this.f26693h;
        if (zaj2 == null) {
            this.f26694i = null;
        } else {
            this.f26694i = zaj2.mo27576b();
        }
        this.f26695j = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel m25629b() {
        /*
            r2 = this;
            int r0 = r2.f26695j
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f26691f
            int r0 = com.google.android.gms.common.internal.safeparcel.C10134a.m25570a(r0)
            r2.f26696k = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f26691f
            int r1 = r2.f26696k
            com.google.android.gms.common.internal.safeparcel.C10134a.m25571a(r0, r1)
            r0 = 2
            r2.f26695j = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f26691f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m25629b():android.os.Parcel");
    }

    /* renamed from: a */
    public Map<String, Field<?, ?>> mo27549a() {
        zaj zaj = this.f26693h;
        if (zaj == null) {
            return null;
        }
        return zaj.mo27574a(this.f26694i);
    }

    public String toString() {
        C10123l.m25506a(this.f26693h, (Object) "Cannot convert to JSON on client side.");
        Parcel b = m25629b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m25628a(sb, this.f26693h.mo27574a(this.f26694i), b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zaj zaj;
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26690e);
        C10134a.m25579a(parcel, 2, m25629b(), false);
        int i2 = this.f26692g;
        if (i2 == 0) {
            zaj = null;
        } else if (i2 == 1) {
            zaj = this.f26693h;
        } else if (i2 == 2) {
            zaj = this.f26693h;
        } else {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        C10134a.m25580a(parcel, 3, (Parcelable) zaj, i, false);
        C10134a.m25571a(parcel, a);
    }

    /* renamed from: a */
    public Object mo27548a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: a */
    private final void m25628a(StringBuilder sb, Map<String, Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((Field) entry.getValue()).mo27553a(), entry);
        }
        sb.append('{');
        int b = SafeParcelReader.m25542b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            Entry entry2 = (Entry) sparseArray.get(SafeParcelReader.m25535a(a));
            if (entry2 != null) {
                String str = ",";
                if (z) {
                    sb.append(str);
                }
                String str2 = (String) entry2.getKey();
                Field field = (Field) entry2.getValue();
                String str3 = "\"";
                sb.append(str3);
                sb.append(str2);
                sb.append("\":");
                if (field.mo27555b()) {
                    int i = field.f26682h;
                    switch (i) {
                        case 0:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, Integer.valueOf(SafeParcelReader.m25568y(parcel, a))));
                            break;
                        case 1:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, SafeParcelReader.m25545c(parcel, a)));
                            break;
                        case 2:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, Long.valueOf(SafeParcelReader.m25531A(parcel, a))));
                            break;
                        case 3:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, Float.valueOf(SafeParcelReader.m25565v(parcel, a))));
                            break;
                        case 4:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, Double.valueOf(SafeParcelReader.m25564u(parcel, a))));
                            break;
                        case 5:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, SafeParcelReader.m25538a(parcel, a)));
                            break;
                        case 6:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, Boolean.valueOf(SafeParcelReader.m25562s(parcel, a))));
                            break;
                        case 7:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, SafeParcelReader.m25558o(parcel, a)));
                            break;
                        case 8:
                        case 9:
                            m25627a(sb, field, FastJsonResponse.m25610a(field, SafeParcelReader.m25550g(parcel, a)));
                            break;
                        case 10:
                            Bundle f = SafeParcelReader.m25549f(parcel, a);
                            HashMap hashMap = new HashMap();
                            for (String str4 : f.keySet()) {
                                hashMap.put(str4, f.getString(str4));
                            }
                            m25627a(sb, field, FastJsonResponse.m25610a(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f26683i) {
                    sb.append("[");
                    switch (field.f26682h) {
                        case 0:
                            C10164a.m25650a(sb, SafeParcelReader.m25554k(parcel, a));
                            break;
                        case 1:
                            C10164a.m25652a(sb, (T[]) SafeParcelReader.m25547d(parcel, a));
                            break;
                        case 2:
                            C10164a.m25651a(sb, SafeParcelReader.m25555l(parcel, a));
                            break;
                        case 3:
                            C10164a.m25649a(sb, SafeParcelReader.m25553j(parcel, a));
                            break;
                        case 4:
                            C10164a.m25648a(sb, SafeParcelReader.m25552i(parcel, a));
                            break;
                        case 5:
                            C10164a.m25652a(sb, (T[]) SafeParcelReader.m25544b(parcel, a));
                            break;
                        case 6:
                            C10164a.m25654a(sb, SafeParcelReader.m25548e(parcel, a));
                            break;
                        case 7:
                            C10164a.m25653a(sb, SafeParcelReader.m25559p(parcel, a));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n = SafeParcelReader.m25557n(parcel, a);
                            int length = n.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(str);
                                }
                                n[i2].setDataPosition(0);
                                m25628a(sb, field.mo27556c(), n[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f26682h) {
                        case 0:
                            sb.append(SafeParcelReader.m25568y(parcel, a));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m25545c(parcel, a));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m25531A(parcel, a));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m25565v(parcel, a));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m25564u(parcel, a));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m25538a(parcel, a));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m25562s(parcel, a));
                            break;
                        case 7:
                            String o = SafeParcelReader.m25558o(parcel, a);
                            sb.append(str3);
                            sb.append(C10172i.m25676a(o));
                            sb.append(str3);
                            break;
                        case 8:
                            byte[] g = SafeParcelReader.m25550g(parcel, a);
                            sb.append(str3);
                            sb.append(C10165b.m25656a(g));
                            sb.append(str3);
                            break;
                        case 9:
                            byte[] g2 = SafeParcelReader.m25550g(parcel, a);
                            sb.append(str3);
                            sb.append(C10165b.m25657b(g2));
                            sb.append(str3);
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.m25549f(parcel, a);
                            Set<String> keySet = f2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str5 : keySet) {
                                if (!z2) {
                                    sb.append(str);
                                }
                                sb.append(str3);
                                sb.append(str5);
                                sb.append(str3);
                                sb.append(":");
                                sb.append(str3);
                                sb.append(C10172i.m25676a(f2.getString(str5)));
                                sb.append(str3);
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = SafeParcelReader.m25556m(parcel, a);
                            m.setDataPosition(0);
                            m25628a(sb, field.mo27556c(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == b) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(b);
        throw new ParseException(sb3.toString(), parcel);
    }

    /* renamed from: b */
    public boolean mo27551b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: a */
    private final void m25627a(StringBuilder sb, Field<?, ?> field, Object obj) {
        if (field.f26681g) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m25626a(sb, field.f26680f, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m25626a(sb, field.f26680f, obj);
    }

    /* renamed from: a */
    private static void m25626a(StringBuilder sb, int i, Object obj) {
        String str = "\"";
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append(str);
                sb.append(C10172i.m25676a(obj.toString()));
                sb.append(str);
                return;
            case 8:
                sb.append(str);
                sb.append(C10165b.m25656a((byte[]) obj));
                sb.append(str);
                return;
            case 9:
                sb.append(str);
                sb.append(C10165b.m25657b((byte[]) obj));
                sb.append(str);
                return;
            case 10:
                C10173j.m25677a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
