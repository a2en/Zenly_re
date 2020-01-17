package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9941a;
import com.getkeepsafe.relinker.elf.Elf.C9942b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.getkeepsafe.relinker.elf.b */
public class C9946b extends C9941a {
    public C9946b(C9949e eVar, C9942b bVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.f26087a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        this.f26085a = eVar.mo26816c(allocate, j2);
        this.f26086b = eVar.mo26816c(allocate, j2 + 8);
    }
}
