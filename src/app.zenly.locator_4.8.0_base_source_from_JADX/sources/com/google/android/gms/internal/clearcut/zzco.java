package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class zzco extends IOException {
    public zzco(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzco m26829a() {
        return new zzco("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzco m26830b() {
        return new zzco("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static zzcp m26831c() {
        return new zzcp("Protocol message tag had invalid wire type.");
    }

    /* renamed from: d */
    static zzco m26832d() {
        return new zzco("Failed to parse the message.");
    }

    /* renamed from: e */
    static zzco m26833e() {
        return new zzco("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public final zzco mo28265a(zzdo zzdo) {
        return this;
    }
}
