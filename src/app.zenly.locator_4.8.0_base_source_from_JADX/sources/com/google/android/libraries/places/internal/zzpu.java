package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzpt;
import com.google.android.libraries.places.internal.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzpu<MessageType extends zzpu<MessageType, BuilderType>, BuilderType extends zzpt<MessageType, BuilderType>> implements zzsm {
    protected int zza = 0;

    /* access modifiers changed from: 0000 */
    public void zza(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzqa zzc() {
        try {
            zzqi zzc = zzqa.zzc(zzh());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzd() {
        try {
            byte[] bArr = new byte[zzh()];
            zzqn zza2 = zzqn.zza(bArr);
            zza(zza2);
            zza2.zzb();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    public int zze() {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzrd.zza(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        if (iterable instanceof zzrw) {
            List zzd = ((zzrw) iterable).zzd();
            zzrw zzrw = (zzrw) list;
            int size = list.size();
            for (Object next : zzd) {
                if (next == null) {
                    int size2 = zzrw.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(str2);
                    sb.append(size2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (int size3 = zzrw.size() - 1; size3 >= size; size3--) {
                        zzrw.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzqa) {
                    zzrw.zza((zzqa) next);
                } else {
                    zzrw.add((String) next);
                }
            }
        } else if (iterable instanceof zzsv) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size() - size4;
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(str2);
                    sb3.append(size5);
                    sb3.append(str);
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
