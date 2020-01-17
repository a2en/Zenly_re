package app.zenly.locator.core.models;

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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: app.zenly.locator.core.models.d */
public final class C2877d extends GeneratedMessageLite<C2877d, C2878a> implements AppData$SupportTicketViewedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C2877d f8139g = new C2877d();

    /* renamed from: h */
    private static volatile Parser<C2877d> f8140h;

    /* renamed from: e */
    private String f8141e = "";

    /* renamed from: f */
    private Timestamp f8142f;

    /* renamed from: app.zenly.locator.core.models.d$a */
    public static final class C2878a extends Builder<C2877d, C2878a> implements AppData$SupportTicketViewedOrBuilder {
        /* synthetic */ C2878a(C2873c cVar) {
            this();
        }

        /* renamed from: a */
        public C2878a mo8937a(String str) {
            copyOnWrite();
            ((C2877d) this.instance).m9329a(str);
            return this;
        }

        public String getId() {
            return ((C2877d) this.instance).getId();
        }

        public ByteString getIdBytes() {
            return ((C2877d) this.instance).getIdBytes();
        }

        public Timestamp getViewedAt() {
            return ((C2877d) this.instance).getViewedAt();
        }

        public boolean hasViewedAt() {
            return ((C2877d) this.instance).hasViewedAt();
        }

        private C2878a() {
            super(C2877d.f8139g);
        }

        /* renamed from: a */
        public C2878a mo8936a(Timestamp timestamp) {
            copyOnWrite();
            ((C2877d) this.instance).m9328a(timestamp);
            return this;
        }
    }

    static {
        f8139g.makeImmutable();
    }

    private C2877d() {
    }

    public static C2877d getDefaultInstance() {
        return f8139g;
    }

    public static C2878a newBuilder() {
        return (C2878a) f8139g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C2873c.f8122a[methodToInvoke.ordinal()]) {
            case 1:
                return new C2877d();
            case 2:
                return f8139g;
            case 3:
                return null;
            case 4:
                return new C2878a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C2877d dVar = (C2877d) obj2;
                this.f8141e = visitor.visitString(!this.f8141e.isEmpty(), this.f8141e, true ^ dVar.f8141e.isEmpty(), dVar.f8141e);
                this.f8142f = (Timestamp) visitor.visitMessage(this.f8142f, dVar.f8142f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f8141e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f8142f != null ? (Timestamp.Builder) this.f8142f.toBuilder() : null;
                                this.f8142f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f8142f);
                                    this.f8142f = (Timestamp) builder.buildPartial();
                                }
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
                if (f8140h == null) {
                    synchronized (C2877d.class) {
                        if (f8140h == null) {
                            f8140h = new DefaultInstanceBasedParser(f8139g);
                        }
                    }
                }
                return f8140h;
            default:
                throw new UnsupportedOperationException();
        }
        return f8139g;
    }

    public String getId() {
        return this.f8141e;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.f8141e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f8141e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getId());
        }
        if (this.f8142f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getViewedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Timestamp getViewedAt() {
        Timestamp timestamp = this.f8142f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasViewedAt() {
        return this.f8142f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f8141e.isEmpty()) {
            codedOutputStream.writeString(1, getId());
        }
        if (this.f8142f != null) {
            codedOutputStream.writeMessage(2, getViewedAt());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9329a(String str) {
        if (str != null) {
            this.f8141e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9328a(Timestamp timestamp) {
        if (timestamp != null) {
            this.f8142f = timestamp;
            return;
        }
        throw new NullPointerException();
    }
}
