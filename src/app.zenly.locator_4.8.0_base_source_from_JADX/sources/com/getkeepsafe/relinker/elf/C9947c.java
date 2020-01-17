package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9941a;
import com.getkeepsafe.relinker.elf.Elf.C9942b;
import com.getkeepsafe.relinker.elf.Elf.C9943c;
import com.getkeepsafe.relinker.elf.Elf.C9944d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.getkeepsafe.relinker.elf.c */
public class C9947c extends C9942b {

    /* renamed from: g */
    private final C9949e f26098g;

    public C9947c(boolean z, C9949e eVar) throws IOException {
        this.f26087a = z;
        this.f26098g = eVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        eVar.mo26814b(allocate, 16);
        this.f26088b = eVar.mo26819e(allocate, 28);
        this.f26089c = eVar.mo26819e(allocate, 32);
        this.f26090d = eVar.mo26814b(allocate, 42);
        this.f26091e = eVar.mo26814b(allocate, 44);
        this.f26092f = eVar.mo26814b(allocate, 46);
        eVar.mo26814b(allocate, 48);
        eVar.mo26814b(allocate, 50);
    }

    /* renamed from: a */
    public C9944d mo26810a(int i) throws IOException {
        return new C9952h(this.f26098g, this, i);
    }

    /* renamed from: a */
    public C9943c mo26809a(long j) throws IOException {
        return new C9950f(this.f26098g, this, j);
    }

    /* renamed from: a */
    public C9941a mo26808a(long j, int i) throws IOException {
        C9945a aVar = new C9945a(this.f26098g, this, j, i);
        return aVar;
    }
}
