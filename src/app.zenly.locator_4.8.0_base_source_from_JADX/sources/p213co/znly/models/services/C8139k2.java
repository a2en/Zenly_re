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
import p213co.znly.models.footsteps.C7315g;

/* renamed from: co.znly.models.services.k2 */
public final class C8139k2 extends GeneratedMessageLite<C8139k2, C8140a> implements ZenlyProto$FootstepsRecordRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8139k2 f20620i = new C8139k2();

    /* renamed from: j */
    private static volatile Parser<C8139k2> f20621j;

    /* renamed from: e */
    private int f20622e;

    /* renamed from: f */
    private LongList f20623f = GeneratedMessageLite.emptyLongList();

    /* renamed from: g */
    private int f20624g;

    /* renamed from: h */
    private boolean f20625h;

    /* renamed from: co.znly.models.services.k2$a */
    public static final class C8140a extends Builder<C8139k2, C8140a> implements ZenlyProto$FootstepsRecordRequestOrBuilder {
        private C8140a() {
            super(C8139k2.f20620i);
        }

        /* synthetic */ C8140a(C8104i0 i0Var) {
            this();
        }

        public boolean getIsCompact() {
            return ((C8139k2) this.instance).getIsCompact();
        }

        public C7315g getLimit() {
            return ((C8139k2) this.instance).getLimit();
        }

        public int getLimitValue() {
            return ((C8139k2) this.instance).getLimitValue();
        }

        public long getLocality(int i) {
            return ((C8139k2) this.instance).getLocality(i);
        }

        public int getLocalityCount() {
            return ((C8139k2) this.instance).getLocalityCount();
        }

        public List<Long> getLocalityList() {
            return Collections.unmodifiableList(((C8139k2) this.instance).getLocalityList());
        }
    }

    static {
        f20620i.makeImmutable();
    }

    private C8139k2() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8139k2();
            case 2:
                return f20620i;
            case 3:
                this.f20623f.makeImmutable();
                return null;
            case 4:
                return new C8140a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8139k2 k2Var = (C8139k2) obj2;
                this.f20623f = visitor.visitLongList(this.f20623f, k2Var.f20623f);
                boolean z2 = this.f20624g != 0;
                int i = this.f20624g;
                if (k2Var.f20624g != 0) {
                    z = true;
                }
                this.f20624g = visitor.visitInt(z2, i, z, k2Var.f20624g);
                boolean z3 = this.f20625h;
                boolean z4 = k2Var.f20625h;
                this.f20625h = visitor.visitBoolean(z3, z3, z4, z4);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20622e |= k2Var.f20622e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 16) {
                                if (!this.f20623f.isModifiable()) {
                                    this.f20623f = GeneratedMessageLite.mutableCopy(this.f20623f);
                                }
                                this.f20623f.addLong(codedInputStream.readUInt64());
                            } else if (readTag == 18) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.f20623f.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f20623f = GeneratedMessageLite.mutableCopy(this.f20623f);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f20623f.addLong(codedInputStream.readUInt64());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 24) {
                                this.f20624g = codedInputStream.readEnum();
                            } else if (readTag == 32) {
                                this.f20625h = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z = true;
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
                if (f20621j == null) {
                    synchronized (C8139k2.class) {
                        if (f20621j == null) {
                            f20621j = new DefaultInstanceBasedParser(f20620i);
                        }
                    }
                }
                return f20621j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20620i;
    }

    public boolean getIsCompact() {
        return this.f20625h;
    }

    public C7315g getLimit() {
        C7315g a = C7315g.m18006a(this.f20624g);
        return a == null ? C7315g.UNRECOGNIZED : a;
    }

    public int getLimitValue() {
        return this.f20624g;
    }

    public long getLocality(int i) {
        return this.f20623f.getLong(i);
    }

    public int getLocalityCount() {
        return this.f20623f.size();
    }

    public List<Long> getLocalityList() {
        return this.f20623f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20623f.size(); i3++) {
            i2 += CodedOutputStream.computeUInt64SizeNoTag(this.f20623f.getLong(i3));
        }
        int size = 0 + i2 + (getLocalityList().size() * 1);
        if (this.f20624g != C7315g.TOP2.getNumber()) {
            size += CodedOutputStream.computeEnumSize(3, this.f20624g);
        }
        boolean z = this.f20625h;
        if (z) {
            size += CodedOutputStream.computeBoolSize(4, z);
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f20623f.size(); i++) {
            codedOutputStream.writeUInt64(2, this.f20623f.getLong(i));
        }
        if (this.f20624g != C7315g.TOP2.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20624g);
        }
        boolean z = this.f20625h;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
    }
}
