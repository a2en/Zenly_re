package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9941a;
import com.getkeepsafe.relinker.elf.Elf.C9942b;
import com.getkeepsafe.relinker.elf.Elf.C9943c;
import com.getkeepsafe.relinker.elf.Elf.C9944d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.getkeepsafe.relinker.elf.d */
public class C9948d extends C9942b {

    /* renamed from: g */
    private final C9949e f26099g;

    public C9948d(boolean z, C9949e eVar) throws IOException {
        this.f26087a = z;
        this.f26099g = eVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        eVar.mo26814b(allocate, 16);
        this.f26088b = eVar.mo26816c(allocate, 32);
        this.f26089c = eVar.mo26816c(allocate, 40);
        this.f26090d = eVar.mo26814b(allocate, 54);
        this.f26091e = eVar.mo26814b(allocate, 56);
        this.f26092f = eVar.mo26814b(allocate, 58);
        eVar.mo26814b(allocate, 60);
        eVar.mo26814b(allocate, 62);
    }

    /* renamed from: a */
    public C9944d mo26810a(int i) throws IOException {
        return new C9953i(this.f26099g, this, i);
    }

    /* renamed from: a */
    public C9943c mo26809a(long j) throws IOException {
        return new C9951g(this.f26099g, this, j);
    }

    /* renamed from: a */
    public C9941a mo26808a(long j, int i) throws IOException {
        C9946b bVar = new C9946b(this.f26099g, this, j, i);
        return bVar;
    }
}
