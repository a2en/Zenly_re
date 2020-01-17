package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9942b;
import com.getkeepsafe.relinker.elf.Elf.C9944d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.getkeepsafe.relinker.elf.i */
public class C9953i extends C9944d {
    public C9953i(C9949e eVar, C9942b bVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(bVar.f26087a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f26097a = eVar.mo26819e(allocate, bVar.f26089c + ((long) (i * bVar.f26092f)) + 44);
    }
}
