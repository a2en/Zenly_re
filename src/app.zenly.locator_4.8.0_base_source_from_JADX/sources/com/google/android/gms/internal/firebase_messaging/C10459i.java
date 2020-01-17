package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase_messaging.i */
public final class C10459i {

    /* renamed from: a */
    private static final Logger f27376a = Logger.getLogger(C10459i.class.getName());

    private C10459i() {
    }

    /* renamed from: a */
    public static void m26844a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f27376a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
