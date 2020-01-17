package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.core.d */
public final class C7073d extends GeneratedMessageLite<C7073d, C7074a> implements ChatProto$ChatMessagesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7073d f17495j = new C7073d();

    /* renamed from: k */
    private static volatile Parser<C7073d> f17496k;

    /* renamed from: e */
    private int f17497e;

    /* renamed from: f */
    private ProtobufList<PingProto$Ping2> f17498f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private boolean f17499g;

    /* renamed from: h */
    private boolean f17500h;

    /* renamed from: i */
    private boolean f17501i;

    /* renamed from: co.znly.models.core.d$a */
    public static final class C7074a extends Builder<C7073d, C7074a> implements ChatProto$ChatMessagesOrBuilder {
        /* synthetic */ C7074a(C7066c cVar) {
            this();
        }

        public boolean getContainsUnread() {
            return ((C7073d) this.instance).getContainsUnread();
        }

        public boolean getEmptyCache() {
            return ((C7073d) this.instance).getEmptyCache();
        }

        public PingProto$Ping2 getMsgs(int i) {
            return ((C7073d) this.instance).getMsgs(i);
        }

        public int getMsgsCount() {
            return ((C7073d) this.instance).getMsgsCount();
        }

        public List<PingProto$Ping2> getMsgsList() {
            return Collections.unmodifiableList(((C7073d) this.instance).getMsgsList());
        }

        public boolean getZero() {
            return ((C7073d) this.instance).getZero();
        }

        private C7074a() {
            super(C7073d.f17495j);
        }
    }

    static {
        f17495j.makeImmutable();
    }

    private C7073d() {
    }

    public static C7074a newBuilder() {
        return (C7074a) f17495j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7073d();
            case 2:
                return f17495j;
            case 3:
                this.f17498f.makeImmutable();
                return null;
            case 4:
                return new C7074a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7073d dVar = (C7073d) obj2;
                this.f17498f = visitor.visitList(this.f17498f, dVar.f17498f);
                boolean z = this.f17499g;
                boolean z2 = dVar.f17499g;
                this.f17499g = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f17500h;
                boolean z4 = dVar.f17500h;
                this.f17500h = visitor.visitBoolean(z3, z3, z4, z4);
                boolean z5 = this.f17501i;
                boolean z6 = dVar.f17501i;
                this.f17501i = visitor.visitBoolean(z5, z5, z6, z6);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17497e |= dVar.f17497e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z7 = false;
                while (!z7) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!this.f17498f.isModifiable()) {
                                    this.f17498f = GeneratedMessageLite.mutableCopy(this.f17498f);
                                }
                                this.f17498f.add(codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.f17499g = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.f17500h = codedInputStream.readBool();
                            } else if (readTag == 32) {
                                this.f17501i = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z7 = true;
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
                if (f17496k == null) {
                    synchronized (C7073d.class) {
                        if (f17496k == null) {
                            f17496k = new DefaultInstanceBasedParser(f17495j);
                        }
                    }
                }
                return f17496k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17495j;
    }

    public boolean getContainsUnread() {
        return this.f17501i;
    }

    public boolean getEmptyCache() {
        return this.f17499g;
    }

    public PingProto$Ping2 getMsgs(int i) {
        return (PingProto$Ping2) this.f17498f.get(i);
    }

    public int getMsgsCount() {
        return this.f17498f.size();
    }

    public List<PingProto$Ping2> getMsgsList() {
        return this.f17498f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17498f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17498f.get(i3));
        }
        boolean z = this.f17499g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        boolean z2 = this.f17500h;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(3, z2);
        }
        boolean z3 = this.f17501i;
        if (z3) {
            i2 += CodedOutputStream.computeBoolSize(4, z3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getZero() {
        return this.f17500h;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17498f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17498f.get(i));
        }
        boolean z = this.f17499g;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        boolean z2 = this.f17500h;
        if (z2) {
            codedOutputStream.writeBool(3, z2);
        }
        boolean z3 = this.f17501i;
        if (z3) {
            codedOutputStream.writeBool(4, z3);
        }
    }
}
