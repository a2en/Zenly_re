package com.facebook.common.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.facebook.common.internal.b */
public final class C9525b {

    /* renamed from: a */
    static final Logger f24706a = Logger.getLogger(C9525b.class.getName());

    private C9525b() {
    }

    /* renamed from: a */
    public static void m23252a(Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    f24706a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23253a(InputStream inputStream) {
        try {
            m23252a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
