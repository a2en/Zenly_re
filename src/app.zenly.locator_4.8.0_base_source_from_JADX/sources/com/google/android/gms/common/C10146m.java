package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C10122k0;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.dynamic.C10186b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.m */
abstract class C10146m extends C10122k0 {

    /* renamed from: a */
    private int f26663a;

    protected C10146m(byte[] bArr) {
        C10123l.m25512a(bArr.length == 25);
        this.f26663a = Arrays.hashCode(bArr);
    }

    protected static byte[] zza(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte[] mo27522a();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzi)) {
            try {
                zzi zzi = (zzi) obj;
                if (zzi.zzc() != hashCode()) {
                    return false;
                }
                IObjectWrapper zzb = zzi.zzb();
                if (zzb == null) {
                    return false;
                }
                return Arrays.equals(mo27522a(), (byte[]) C10186b.m25716a(zzb));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f26663a;
    }

    public final IObjectWrapper zzb() {
        return C10186b.m25715a(mo27522a());
    }

    public final int zzc() {
        return hashCode();
    }
}
