package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.k1 */
public final class C10339k1 extends C10389r<String> implements zzcx, RandomAccess {

    /* renamed from: g */
    private static final C10339k1 f27035g;

    /* renamed from: f */
    private final List<Object> f27036f;

    static {
        C10339k1 k1Var = new C10339k1();
        f27035g = k1Var;
        k1Var.zzv();
    }

    public C10339k1() {
        this(10);
    }

    public C10339k1(int i) {
        this(new ArrayList<>(i));
    }

    private C10339k1(ArrayList<Object> arrayList) {
        this.f27036f = arrayList;
    }

    /* renamed from: a */
    private static String m26162a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C10431y ? ((C10431y) obj).mo28191c() : C10292d1.m26023c((byte[]) obj);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo28114a();
        this.f27036f.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo28114a();
        if (collection instanceof zzcx) {
            collection = ((zzcx) collection).zzbt();
        }
        boolean addAll = this.f27036f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo28114a();
        this.f27036f.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f27036f.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C10431y) {
            C10431y yVar = (C10431y) obj;
            String c = yVar.mo28191c();
            if (yVar.mo27904a()) {
                this.f27036f.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = C10292d1.m26023c(bArr);
        if (C10292d1.m26022b(bArr)) {
            this.f27036f.set(i, c2);
        }
        return c2;
    }

    public final Object getRaw(int i) {
        return this.f27036f.get(i);
    }

    public final /* synthetic */ Object remove(int i) {
        mo28114a();
        Object remove = this.f27036f.remove(i);
        this.modCount++;
        return m26162a(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo28114a();
        return m26162a(this.f27036f.set(i, str));
    }

    public final int size() {
        return this.f27036f.size();
    }

    public final List<?> zzbt() {
        return Collections.unmodifiableList(this.f27036f);
    }

    public final zzcx zzbu() {
        return zzu() ? new C10322h3(this) : this;
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f27036f);
            return new C10339k1(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
