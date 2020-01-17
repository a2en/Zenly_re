package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.C9525b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9542m;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.C9547c;
import com.facebook.common.util.C9557c;
import com.facebook.imagepipeline.image.C9732e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.decoder.c */
public class C9727c {

    /* renamed from: a */
    private int f25548a = 0;

    /* renamed from: b */
    private int f25549b = 0;

    /* renamed from: c */
    private int f25550c = 0;

    /* renamed from: d */
    private int f25551d = 0;

    /* renamed from: e */
    private int f25552e = 0;

    /* renamed from: f */
    private int f25553f = 0;

    /* renamed from: g */
    private boolean f25554g;

    /* renamed from: h */
    private final ByteArrayPool f25555h;

    public C9727c(ByteArrayPool byteArrayPool) {
        C9536j.m23271a(byteArrayPool);
        this.f25555h = byteArrayPool;
    }

    /* renamed from: a */
    private static boolean m24047a(int i) {
        boolean z = true;
        if (i == 1) {
            return false;
        }
        if (i >= 208 && i <= 215) {
            return false;
        }
        if (i == 217 || i == 216) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private void m24049b(int i) {
        if (this.f25551d > 0) {
            this.f25553f = i;
        }
        int i2 = this.f25551d;
        this.f25551d = i2 + 1;
        this.f25552e = i2;
    }

    /* renamed from: a */
    public boolean mo26397a(C9732e eVar) {
        if (this.f25548a == 6 || eVar.mo26437k() <= this.f25550c) {
            return false;
        }
        C9547c cVar = new C9547c(eVar.mo26434h(), (byte[]) this.f25555h.get(16384), this.f25555h);
        try {
            C9557c.m23381a(cVar, (long) this.f25550c);
            boolean a = m24048a((InputStream) cVar);
            C9525b.m23253a(cVar);
            return a;
        } catch (IOException e) {
            C9542m.m23285a(e);
            throw null;
        } catch (Throwable th) {
            C9525b.m23253a(cVar);
            throw th;
        }
    }

    /* renamed from: c */
    public boolean mo26399c() {
        return this.f25554g;
    }

    /* renamed from: b */
    public int mo26398b() {
        return this.f25552e;
    }

    /* renamed from: a */
    private boolean m24048a(InputStream inputStream) {
        boolean z;
        int i = this.f25552e;
        while (true) {
            try {
                z = false;
                if (this.f25548a == 6) {
                    break;
                }
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                this.f25550c++;
                if (this.f25554g) {
                    this.f25548a = 6;
                    this.f25554g = false;
                    return false;
                }
                int i2 = this.f25548a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    this.f25548a = 5;
                                } else if (i2 != 5) {
                                    C9536j.m23279b(false);
                                } else {
                                    int i3 = ((this.f25549b << 8) + read) - 2;
                                    C9557c.m23381a(inputStream, (long) i3);
                                    this.f25550c += i3;
                                    this.f25548a = 2;
                                }
                            } else if (read == 255) {
                                this.f25548a = 3;
                            } else if (read == 0) {
                                this.f25548a = 2;
                            } else if (read == 217) {
                                this.f25554g = true;
                                m24049b(this.f25550c - 2);
                                this.f25548a = 2;
                            } else {
                                if (read == 218) {
                                    m24049b(this.f25550c - 2);
                                }
                                if (m24047a(read)) {
                                    this.f25548a = 4;
                                } else {
                                    this.f25548a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f25548a = 3;
                        }
                    } else if (read == 216) {
                        this.f25548a = 2;
                    } else {
                        this.f25548a = 6;
                    }
                } else if (read == 255) {
                    this.f25548a = 1;
                } else {
                    this.f25548a = 6;
                }
                this.f25549b = read;
            } catch (IOException e) {
                C9542m.m23285a(e);
                throw null;
            }
        }
        if (!(this.f25548a == 6 || this.f25552e == i)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public int mo26396a() {
        return this.f25553f;
    }
}
