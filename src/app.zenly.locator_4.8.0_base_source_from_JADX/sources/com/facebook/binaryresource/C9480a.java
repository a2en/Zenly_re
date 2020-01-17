package com.facebook.binaryresource;

import com.facebook.common.internal.C9528e;
import com.facebook.common.internal.C9536j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.binaryresource.a */
public class C9480a implements BinaryResource {

    /* renamed from: a */
    private final File f24569a;

    private C9480a(File file) {
        C9536j.m23271a(file);
        this.f24569a = file;
    }

    /* renamed from: a */
    public File mo25497a() {
        return this.f24569a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9480a)) {
            return false;
        }
        return this.f24569a.equals(((C9480a) obj).f24569a);
    }

    public int hashCode() {
        return this.f24569a.hashCode();
    }

    public InputStream openStream() throws IOException {
        return new FileInputStream(this.f24569a);
    }

    public byte[] read() throws IOException {
        return C9528e.m23254a(this.f24569a);
    }

    public long size() {
        return this.f24569a.length();
    }

    /* renamed from: a */
    public static C9480a m23130a(File file) {
        if (file != null) {
            return new C9480a(file);
        }
        return null;
    }
}
