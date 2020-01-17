package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.r1 */
public final class C7454r1 extends GeneratedMessageLite<C7454r1, C7455a> implements PingProto$ConversationTimelineOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7454r1 f18651j = new C7454r1();

    /* renamed from: k */
    private static volatile Parser<C7454r1> f18652k;

    /* renamed from: e */
    private String f18653e;

    /* renamed from: f */
    private String f18654f;

    /* renamed from: g */
    private int f18655g;

    /* renamed from: h */
    private boolean f18656h;

    /* renamed from: i */
    private String f18657i;

    /* renamed from: co.znly.models.r1$a */
    public static final class C7455a extends Builder<C7454r1, C7455a> implements PingProto$ConversationTimelineOrBuilder {
        /* synthetic */ C7455a(C7383l1 l1Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C7454r1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7454r1) this.instance).getConversationUuidBytes();
        }

        public boolean getIsGroup() {
            return ((C7454r1) this.instance).getIsGroup();
        }

        public int getKind() {
            return ((C7454r1) this.instance).getKind();
        }

        public String getTargetUuid() {
            return ((C7454r1) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C7454r1) this.instance).getTargetUuidBytes();
        }

        public String getTimelineUuid() {
            return ((C7454r1) this.instance).getTimelineUuid();
        }

        public ByteString getTimelineUuidBytes() {
            return ((C7454r1) this.instance).getTimelineUuidBytes();
        }

        private C7455a() {
            super(C7454r1.f18651j);
        }
    }

    static {
        f18651j.makeImmutable();
    }

    private C7454r1() {
        String str = "";
        this.f18653e = str;
        this.f18654f = str;
        this.f18657i = str;
    }

    public static C7454r1 getDefaultInstance() {
        return f18651j;
    }

    public static Parser<C7454r1> parser() {
        return f18651j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7454r1();
            case 2:
                return f18651j;
            case 3:
                return null;
            case 4:
                return new C7455a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7454r1 r1Var = (C7454r1) obj2;
                this.f18653e = visitor.visitString(!this.f18653e.isEmpty(), this.f18653e, !r1Var.f18653e.isEmpty(), r1Var.f18653e);
                this.f18654f = visitor.visitString(!this.f18654f.isEmpty(), this.f18654f, !r1Var.f18654f.isEmpty(), r1Var.f18654f);
                boolean z2 = this.f18655g != 0;
                int i = this.f18655g;
                if (r1Var.f18655g != 0) {
                    z = true;
                }
                this.f18655g = visitor.visitInt(z2, i, z, r1Var.f18655g);
                boolean z3 = this.f18656h;
                boolean z4 = r1Var.f18656h;
                this.f18656h = visitor.visitBoolean(z3, z3, z4, z4);
                this.f18657i = visitor.visitString(!this.f18657i.isEmpty(), this.f18657i, !r1Var.f18657i.isEmpty(), r1Var.f18657i);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f18653e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18654f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f18655g = codedInputStream.readInt32();
                            } else if (readTag == 32) {
                                this.f18656h = codedInputStream.readBool();
                            } else if (readTag == 42) {
                                this.f18657i = codedInputStream.readStringRequireUtf8();
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
                if (f18652k == null) {
                    synchronized (C7454r1.class) {
                        if (f18652k == null) {
                            f18652k = new DefaultInstanceBasedParser(f18651j);
                        }
                    }
                }
                return f18652k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18651j;
    }

    public String getConversationUuid() {
        return this.f18653e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f18653e);
    }

    public boolean getIsGroup() {
        return this.f18656h;
    }

    public int getKind() {
        return this.f18655g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18653e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (!this.f18654f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getTimelineUuid());
        }
        int i3 = this.f18655g;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        boolean z = this.f18656h;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(4, z);
        }
        if (!this.f18657i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getTargetUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f18657i;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f18657i);
    }

    public String getTimelineUuid() {
        return this.f18654f;
    }

    public ByteString getTimelineUuidBytes() {
        return ByteString.copyFromUtf8(this.f18654f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18653e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (!this.f18654f.isEmpty()) {
            codedOutputStream.writeString(2, getTimelineUuid());
        }
        int i = this.f18655g;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        boolean z = this.f18656h;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        if (!this.f18657i.isEmpty()) {
            codedOutputStream.writeString(5, getTargetUuid());
        }
    }
}
