package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf.C9941a;
import com.getkeepsafe.relinker.elf.Elf.C9942b;
import com.getkeepsafe.relinker.elf.Elf.C9943c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.getkeepsafe.relinker.elf.e */
public class C9949e implements Closeable, Elf {

    /* renamed from: e */
    private final FileChannel f26100e;

    public C9949e(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f26100e = new FileInputStream(file).getChannel();
    }

    /* renamed from: a */
    public C9942b mo26811a() throws IOException {
        this.f26100e.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo26819e(allocate, 0) == 1179403647) {
            short a = mo26812a(allocate, 4);
            boolean z = mo26812a(allocate, 5) == 2;
            if (a == 1) {
                return new C9947c(z, this);
            }
            if (a == 2) {
                return new C9948d(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: b */
    public List<String> mo26815b() throws IOException {
        long j;
        this.f26100e.position(0);
        ArrayList arrayList = new ArrayList();
        C9942b a = mo26811a();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(a.f26087a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (long) a.f26091e;
        int i = 0;
        if (j2 == 65535) {
            j2 = a.mo26810a(0).f26097a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            C9943c a2 = a.mo26809a(j3);
            if (a2.f26093a == 2) {
                j = a2.f26094b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j4 = 0;
        while (true) {
            C9941a a3 = a.mo26808a(j, i);
            long j5 = j;
            long j6 = a3.f26085a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a3.f26086b));
            } else if (j6 == 5) {
                j4 = a3.f26086b;
            }
            i++;
            if (a3.f26085a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long a4 = m24874a(a, j2, j4);
            for (Long longValue : arrayList2) {
                arrayList.add(mo26818d(allocate, longValue.longValue() + a4));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo26816c(ByteBuffer byteBuffer, long j) throws IOException {
        mo26813a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public void close() throws IOException {
        this.f26100e.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo26818d(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short a = mo26812a(byteBuffer, j);
            if (a == 0) {
                return sb.toString();
            }
            sb.append((char) a);
            j = j2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo26819e(ByteBuffer byteBuffer, long j) throws IOException {
        mo26813a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: a */
    private long m24874a(C9942b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C9943c a = bVar.mo26809a(j3);
            if (a.f26093a == 1) {
                long j4 = a.f26095c;
                if (j4 <= j2 && j2 <= a.f26096d + j4) {
                    return (j2 - j4) + a.f26094b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public short mo26812a(ByteBuffer byteBuffer, long j) throws IOException {
        mo26813a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26813a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f26100e.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo26814b(ByteBuffer byteBuffer, long j) throws IOException {
        mo26813a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }
}
