package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9942b;
import com.getkeepsafe.relinker.elf.Elf.C9943c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.getkeepsafe.relinker.elf.f */
public class C9950f extends C9943c {
    public C9950f(C9949e eVar, C9942b bVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.f26087a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = bVar.f26088b + (j * ((long) bVar.f26090d));
        this.f26093a = eVar.mo26819e(allocate, j2);
        this.f26094b = eVar.mo26819e(allocate, 4 + j2);
        this.f26095c = eVar.mo26819e(allocate, 8 + j2);
        this.f26096d = eVar.mo26819e(allocate, j2 + 20);
    }
}
