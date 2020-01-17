package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10368o;
import com.google.android.gms.internal.clearcut.C10374p;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.o */
public abstract class C10368o<MessageType extends C10368o<MessageType, BuilderType>, BuilderType extends C10374p<MessageType, BuilderType>> implements zzdo {
    private static boolean zzey = false;
    protected int zzex = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27801a() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27803a(int i) {
        throw new UnsupportedOperationException();
    }

    public final C10431y zzr() {
        try {
            C10291d0 b = C10431y.m26595b(zzas());
            zzb(b.mo27864b());
            return b.mo27863a();
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
}
