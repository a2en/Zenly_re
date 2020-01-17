package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9941a;
import com.getkeepsafe.relinker.elf.Elf.C9942b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.getkeepsafe.relinker.elf.a */
public class C9945a extends C9941a {
    public C9945a(C9949e eVar, C9942b bVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(bVar.f26087a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        this.f26085a = eVar.mo26819e(allocate, j2);
        this.f26086b = eVar.mo26819e(allocate, j2 + 4);
    }
}
