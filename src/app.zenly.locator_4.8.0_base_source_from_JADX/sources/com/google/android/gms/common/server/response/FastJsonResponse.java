package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.util.C10165b;
import com.google.android.gms.common.util.C10172i;
import com.google.android.gms.common.util.C10173j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C10157a CREATOR = new C10157a();

        /* renamed from: e */
        private final int f26679e;

        /* renamed from: f */
        protected final int f26680f;

        /* renamed from: g */
        protected final boolean f26681g;

        /* renamed from: h */
        protected final int f26682h;

        /* renamed from: i */
        protected final boolean f26683i;

        /* renamed from: j */
        protected final String f26684j;

        /* renamed from: k */
        protected final int f26685k;

        /* renamed from: l */
        protected final Class<? extends FastJsonResponse> f26686l;

        /* renamed from: m */
        private final String f26687m;

        /* renamed from: n */
        private zaj f26688n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public FieldConverter<I, O> f26689o;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zab zab) {
            this.f26679e = i;
            this.f26680f = i2;
            this.f26681g = z;
            this.f26682h = i3;
            this.f26683i = z2;
            this.f26684j = str;
            this.f26685k = i4;
            if (str2 == null) {
                this.f26686l = null;
                this.f26687m = null;
            } else {
                this.f26686l = SafeParcelResponse.class;
                this.f26687m = str2;
            }
            if (zab == null) {
                this.f26689o = null;
            } else {
                this.f26689o = zab.mo27545a();
            }
        }

        /* renamed from: d */
        private final String m25618d() {
            String str = this.f26687m;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: e */
        private final zab m25619e() {
            FieldConverter<I, O> fieldConverter = this.f26689o;
            if (fieldConverter == null) {
                return null;
            }
            return zab.m25608a(fieldConverter);
        }

        /* renamed from: a */
        public int mo27553a() {
            return this.f26685k;
        }

        /* renamed from: b */
        public final boolean mo27555b() {
            return this.f26689o != null;
        }

        /* renamed from: c */
        public final Map<String, Field<?, ?>> mo27556c() {
            C10123l.m25505a(this.f26687m);
            C10123l.m25505a(this.f26688n);
            return this.f26688n.mo27574a(this.f26687m);
        }

        public final I convertBack(O o) {
            return this.f26689o.convertBack(o);
        }

        public String toString() {
            C10121a a = C10120k.m25500a((Object) this);
            a.mo27499a("versionCode", Integer.valueOf(this.f26679e));
            a.mo27499a("typeIn", Integer.valueOf(this.f26680f));
            a.mo27499a("typeInArray", Boolean.valueOf(this.f26681g));
            a.mo27499a("typeOut", Integer.valueOf(this.f26682h));
            a.mo27499a("typeOutArray", Boolean.valueOf(this.f26683i));
            a.mo27499a("outputFieldName", this.f26684j);
            a.mo27499a("safeParcelFieldId", Integer.valueOf(this.f26685k));
            a.mo27499a("concreteTypeName", m25618d());
            Class<? extends FastJsonResponse> cls = this.f26686l;
            if (cls != null) {
                a.mo27499a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f26689o;
            if (fieldConverter != null) {
                a.mo27499a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C10134a.m25570a(parcel);
            C10134a.m25575a(parcel, 1, this.f26679e);
            C10134a.m25575a(parcel, 2, this.f26680f);
            C10134a.m25586a(parcel, 3, this.f26681g);
            C10134a.m25575a(parcel, 4, this.f26682h);
            C10134a.m25586a(parcel, 5, this.f26683i);
            C10134a.m25583a(parcel, 6, this.f26684j, false);
            C10134a.m25575a(parcel, 7, mo27553a());
            C10134a.m25583a(parcel, 8, m25618d(), false);
            C10134a.m25580a(parcel, 9, (Parcelable) m25619e(), i, false);
            C10134a.m25571a(parcel, a);
        }

        /* renamed from: a */
        public final void mo27554a(zaj zaj) {
            this.f26688n = zaj;
        }
    }

    public interface FieldConverter<I, O> {
        O convert(I i);

        I convertBack(O o);

        int zach();

        int zaci();
    }

    /* renamed from: a */
    protected static <O, I> I m25610a(Field<I, O> field, Object obj) {
        return field.f26689o != null ? field.convertBack(obj) : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo27548a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo27549a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo27550b(Field field) {
        if (field.f26682h != 11) {
            return mo27551b(field.f26684j);
        }
        if (field.f26683i) {
            String str = field.f26684j;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f26684j;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo27551b(String str);

    public String toString() {
        Map a = mo27549a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (mo27550b(field)) {
                Object a2 = m25610a(field, mo27547a(field));
                String str2 = ",";
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(str2);
                }
                String str3 = "\"";
                sb.append(str3);
                sb.append(str);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f26682h) {
                        case 8:
                            sb.append(str3);
                            sb.append(C10165b.m25656a((byte[]) a2));
                            sb.append(str3);
                            break;
                        case 9:
                            sb.append(str3);
                            sb.append(C10165b.m25657b((byte[]) a2));
                            sb.append(str3);
                            break;
                        case 10:
                            C10173j.m25677a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!field.f26681g) {
                                m25611a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(str2);
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m25611a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo27547a(Field field) {
        String str = field.f26684j;
        if (field.f26686l == null) {
            return mo27548a(str);
        }
        C10123l.m25518b(mo27548a(str) == null, "Concrete field shouldn't be value object: %s", field.f26684j);
        boolean z = field.f26683i;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m25611a(StringBuilder sb, Field field, Object obj) {
        int i = field.f26680f;
        if (i == 11) {
            sb.append(((FastJsonResponse) field.f26686l.cast(obj)).toString());
        } else if (i == 7) {
            String str = "\"";
            sb.append(str);
            sb.append(C10172i.m25676a((String) obj));
            sb.append(str);
        } else {
            sb.append(obj);
        }
    }
}
