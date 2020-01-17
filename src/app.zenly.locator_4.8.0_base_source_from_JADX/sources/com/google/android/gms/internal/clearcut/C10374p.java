package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10368o;
import com.google.android.gms.internal.clearcut.C10374p;

/* renamed from: com.google.android.gms.internal.clearcut.p */
public abstract class C10374p<MessageType extends C10368o<MessageType, BuilderType>, BuilderType extends C10374p<MessageType, BuilderType>> implements zzdp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo27814a(MessageType messagetype);

    public final /* synthetic */ zzdp zza(zzdo zzdo) {
        if (zzbe().getClass().isInstance(zzdo)) {
            mo27814a((C10368o) zzdo);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
