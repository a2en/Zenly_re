package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.gifdecoder.c */
public class C8862c {

    /* renamed from: a */
    private final byte[] f23069a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f23070b;

    /* renamed from: c */
    private C8861b f23071c;

    /* renamed from: d */
    private int f23072d = 0;

    /* renamed from: c */
    private boolean m21188c() {
        return this.f23071c.f23057b != 0;
    }

    /* renamed from: d */
    private int m21189d() {
        try {
            return this.f23070b.get() & 255;
        } catch (Exception unused) {
            this.f23071c.f23057b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m21190e() {
        this.f23071c.f23059d.f23045a = m21197l();
        this.f23071c.f23059d.f23046b = m21197l();
        this.f23071c.f23059d.f23047c = m21197l();
        this.f23071c.f23059d.f23048d = m21197l();
        int d = m21189d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C8860a aVar = this.f23071c.f23059d;
        if ((d & 64) != 0) {
            z = true;
        }
        aVar.f23049e = z;
        if (z2) {
            this.f23071c.f23059d.f23055k = m21186a(pow);
        } else {
            this.f23071c.f23059d.f23055k = null;
        }
        this.f23071c.f23059d.f23054j = this.f23070b.position();
        m21200o();
        if (!m21188c()) {
            C8861b bVar = this.f23071c;
            bVar.f23058c++;
            bVar.f23060e.add(bVar.f23059d);
        }
    }

    /* renamed from: f */
    private void m21191f() {
        this.f23072d = m21189d();
        if (this.f23072d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f23072d) {
                try {
                    i2 = this.f23072d - i;
                    this.f23070b.get(this.f23069a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    String str = "GifHeaderParser";
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f23072d);
                        Log.d(str, sb.toString(), e);
                    }
                    this.f23071c.f23057b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m21192g() {
        m21187b(Integer.MAX_VALUE);
    }

    /* renamed from: h */
    private void m21193h() {
        m21189d();
        int d = m21189d();
        C8860a aVar = this.f23071c.f23059d;
        aVar.f23051g = (d & 28) >> 2;
        boolean z = true;
        if (aVar.f23051g == 0) {
            aVar.f23051g = 1;
        }
        C8860a aVar2 = this.f23071c.f23059d;
        if ((d & 1) == 0) {
            z = false;
        }
        aVar2.f23050f = z;
        int l = m21197l();
        if (l < 2) {
            l = 10;
        }
        C8860a aVar3 = this.f23071c.f23059d;
        aVar3.f23053i = l * 10;
        aVar3.f23052h = m21189d();
        m21189d();
    }

    /* renamed from: i */
    private void m21194i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m21189d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f23071c.f23057b = 1;
            return;
        }
        m21195j();
        if (this.f23071c.f23063h && !m21188c()) {
            C8861b bVar = this.f23071c;
            bVar.f23056a = m21186a(bVar.f23064i);
            C8861b bVar2 = this.f23071c;
            bVar2.f23067l = bVar2.f23056a[bVar2.f23065j];
        }
    }

    /* renamed from: j */
    private void m21195j() {
        this.f23071c.f23061f = m21197l();
        this.f23071c.f23062g = m21197l();
        int d = m21189d();
        this.f23071c.f23063h = (d & 128) != 0;
        this.f23071c.f23064i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f23071c.f23065j = m21189d();
        this.f23071c.f23066k = m21189d();
    }

    /* renamed from: k */
    private void m21196k() {
        do {
            m21191f();
            byte[] bArr = this.f23069a;
            if (bArr[0] == 1) {
                this.f23071c.f23068m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f23072d <= 0) {
                return;
            }
        } while (!m21188c());
    }

    /* renamed from: l */
    private int m21197l() {
        return this.f23070b.getShort();
    }

    /* renamed from: m */
    private void m21198m() {
        this.f23070b = null;
        Arrays.fill(this.f23069a, 0);
        this.f23071c = new C8861b();
        this.f23072d = 0;
    }

    /* renamed from: n */
    private void m21199n() {
        int d;
        do {
            d = m21189d();
            this.f23070b.position(Math.min(this.f23070b.position() + d, this.f23070b.limit()));
        } while (d > 0);
    }

    /* renamed from: o */
    private void m21200o() {
        m21189d();
        m21199n();
    }

    /* renamed from: a */
    public C8862c mo24166a(ByteBuffer byteBuffer) {
        m21198m();
        this.f23070b = byteBuffer.asReadOnlyBuffer();
        this.f23070b.position(0);
        this.f23070b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: b */
    public C8861b mo24169b() {
        if (this.f23070b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m21188c()) {
            return this.f23071c;
        } else {
            m21194i();
            if (!m21188c()) {
                m21192g();
                C8861b bVar = this.f23071c;
                if (bVar.f23058c < 0) {
                    bVar.f23057b = 1;
                }
            }
            return this.f23071c;
        }
    }

    /* renamed from: a */
    public C8862c mo24167a(byte[] bArr) {
        if (bArr != null) {
            mo24166a(ByteBuffer.wrap(bArr));
        } else {
            this.f23070b = null;
            this.f23071c.f23057b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public void mo24168a() {
        this.f23070b = null;
        this.f23071c = null;
    }

    /* renamed from: a */
    private int[] m21186a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f23070b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            String str = "GifHeaderParser";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Format Error Reading Color Table", e);
            }
            this.f23071c.f23057b = 1;
        }
        return iArr;
    }

    /* renamed from: b */
    private void m21187b(int i) {
        boolean z = false;
        while (!z && !m21188c() && this.f23071c.f23058c <= i) {
            int d = m21189d();
            if (d == 33) {
                int d2 = m21189d();
                if (d2 == 1) {
                    m21199n();
                } else if (d2 == 249) {
                    this.f23071c.f23059d = new C8860a();
                    m21193h();
                } else if (d2 == 254) {
                    m21199n();
                } else if (d2 != 255) {
                    m21199n();
                } else {
                    m21191f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f23069a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m21196k();
                    } else {
                        m21199n();
                    }
                }
            } else if (d == 44) {
                C8861b bVar = this.f23071c;
                if (bVar.f23059d == null) {
                    bVar.f23059d = new C8860a();
                }
                m21190e();
            } else if (d != 59) {
                this.f23071c.f23057b = 1;
            } else {
                z = true;
            }
        }
    }
}
