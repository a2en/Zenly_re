package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.LongList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.services.m2 */
public final class C8167m2 extends GeneratedMessageLite<C8167m2, C8168a> implements ZenlyProto$FootstepsShapeRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8167m2 f20676h = new C8167m2();

    /* renamed from: i */
    private static volatile Parser<C8167m2> f20677i;

    /* renamed from: e */
    private int f20678e;

    /* renamed from: f */
    private LongList f20679f = GeneratedMessageLite.emptyLongList();

    /* renamed from: g */
    private boolean f20680g;

    /* renamed from: co.znly.models.services.m2$a */
    public static final class C8168a extends Builder<C8167m2, C8168a> implements ZenlyProto$FootstepsShapeRequestOrBuilder {
        private C8168a() {
            super(C8167m2.f20676h);
        }

        /* synthetic */ C8168a(C8104i0 i0Var) {
            this();
        }

        public long getId(int i) {
            return ((C8167m2) this.instance).getId(i);
        }

        public int getIdCount() {
            return ((C8167m2) this.instance).getIdCount();
        }

        public List<Long> getIdList() {
            return Collections.unmodifiableList(((C8167m2) this.instance).getIdList());
        }

        public boolean getSkipShape() {
            return ((C8167m2) this.instance).getSkipShape();
        }
    }

    static {
        f20676h.makeImmutable();
    }

    private C8167m2() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8167m2();
            case 2:
                return f20676h;
            case 3:
                this.f20679f.makeImmutable();
                return null;
            case 4:
                return new C8168a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8167m2 m2Var = (C8167m2) obj2;
                this.f20679f = visitor.visitLongList(this.f20679f, m2Var.f20679f);
                boolean z = this.f20680g;
                boolean z2 = m2Var.f20680g;
                this.f20680g = visitor.visitBoolean(z, z, z2, z2);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20678e |= m2Var.f20678e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                if (!this.f20679f.isModifiable()) {
                                    this.f20679f = GeneratedMessageLite.mutableCopy(this.f20679f);
                                }
                                this.f20679f.addLong(codedInputStream.readUInt64());
                            } else if (readTag == 10) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.f20679f.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f20679f = GeneratedMessageLite.mutableCopy(this.f20679f);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f20679f.addLong(codedInputStream.readUInt64());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 24) {
                                this.f20680g = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e.setUnfinishedMessage(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f20677i == null) {
                    synchronized (C8167m2.class) {
                        if (f20677i == null) {
                            f20677i = new DefaultInstanceBasedParser(f20676h);
                        }
                    }
                }
                return f20677i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20676h;
    }

    public long getId(int i) {
        return this.f20679f.getLong(i);
    }

    public int getIdCount() {
        return this.f20679f.size();
    }

    public List<Long> getIdList() {
        return this.f20679f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20679f.size(); i3++) {
            i2 += CodedOutputStream.computeUInt64SizeNoTag(this.f20679f.getLong(i3));
        }
        int size = 0 + i2 + (getIdList().size() * 1);
        boolean z = this.f20680g;
        if (z) {
            size += CodedOutputStream.computeBoolSize(3, z);
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean getSkipShape() {
        return this.f20680g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f20679f.size(); i++) {
            codedOutputStream.writeUInt64(1, this.f20679f.getLong(i));
        }
        boolean z = this.f20680g;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
    }
}
