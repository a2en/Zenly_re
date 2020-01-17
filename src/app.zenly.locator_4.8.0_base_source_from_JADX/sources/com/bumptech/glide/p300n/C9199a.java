package com.bumptech.glide.p300n;

import android.content.Context;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.p301o.C9217k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.n.a */
public final class C9199a implements Key {

    /* renamed from: b */
    private final int f23858b;

    /* renamed from: c */
    private final Key f23859c;

    private C9199a(int i, Key key) {
        this.f23858b = i;
        this.f23859c = key;
    }

    /* renamed from: a */
    public static Key m22049a(Context context) {
        return new C9199a(context.getResources().getConfiguration().uiMode & 48, C9200b.m22052b(context));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9199a)) {
            return false;
        }
        C9199a aVar = (C9199a) obj;
        if (this.f23858b != aVar.f23858b || !this.f23859c.equals(aVar.f23859c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9217k.m22094a((Object) this.f23859c, this.f23858b);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f23859c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f23858b).array());
    }
}
