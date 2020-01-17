package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzrt extends zzpv<String> implements zzrw, RandomAccess {
    private static final zzrt zza;
    private static final zzrw zzb = zza;
    private final List<Object> zzc;

    static {
        zzrt zzrt = new zzrt();
        zza = zzrt;
        zzrt.zzb();
    }

    public zzrt() {
        this(10);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        zzc();
        this.zzc.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        zzc();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzqa) {
            zzqa zzqa = (zzqa) obj;
            String zzb2 = zzqa.zzb();
            if (zzqa.zzc()) {
                this.zzc.set(i, zzb2);
            }
            return zzb2;
        }
        byte[] bArr = (byte[]) obj;
        String zzb3 = zzrd.zzb(bArr);
        if (zzrd.zza(bArr)) {
            this.zzc.set(i, zzb3);
        }
        return zzb3;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        zzc();
        return zza(this.zzc.set(i, str));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final void zza(zzqa zzqa) {
        zzc();
        this.zzc.add(zzqa);
        this.modCount++;
    }

    public final /* synthetic */ zzrm zzb(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzrt(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final List<?> zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final zzrw zze() {
        return zza() ? new zztw(this) : this;
    }

    public zzrt(int i) {
        this(new ArrayList<>(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzc();
        if (collection instanceof zzrw) {
            collection = ((zzrw) collection).zzd();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        zzc();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zza(remove);
    }

    private zzrt(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    public final Object zza(int i) {
        return this.zzc.get(i);
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzqa) {
            return ((zzqa) obj).zzb();
        }
        return zzrd.zzb((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }
}
