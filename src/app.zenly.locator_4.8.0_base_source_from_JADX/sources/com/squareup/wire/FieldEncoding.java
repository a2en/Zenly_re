package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;

public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);
    
    final int value;

    /* renamed from: com.squareup.wire.FieldEncoding$1 */
    static /* synthetic */ class C119041 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$FieldEncoding = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.squareup.wire.FieldEncoding[] r0 = com.squareup.wire.FieldEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$FieldEncoding = r0
                int[] r0 = $SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.squareup.wire.FieldEncoding r1 = com.squareup.wire.FieldEncoding.VARINT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x001f }
                com.squareup.wire.FieldEncoding r1 = com.squareup.wire.FieldEncoding.FIXED32     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x002a }
                com.squareup.wire.FieldEncoding r1 = com.squareup.wire.FieldEncoding.FIXED64     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.squareup.wire.FieldEncoding r1 = com.squareup.wire.FieldEncoding.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.FieldEncoding.C119041.<clinit>():void");
        }
    }

    private FieldEncoding(int i) {
        this.value = i;
    }

    static FieldEncoding get(int i) throws IOException {
        if (i == 0) {
            return VARINT;
        }
        if (i == 1) {
            return FIXED64;
        }
        if (i == 2) {
            return LENGTH_DELIMITED;
        }
        if (i == 5) {
            return FIXED32;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected FieldEncoding: ");
        sb.append(i);
        throw new ProtocolException(sb.toString());
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int i = C119041.$SwitchMap$com$squareup$wire$FieldEncoding[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new AssertionError();
    }
}
