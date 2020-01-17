package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.p */
public final class C7184p extends GeneratedMessageLite<C7184p, C7185a> implements ChatProto$EmojiOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7184p f17798h = new C7184p();

    /* renamed from: i */
    private static volatile Parser<C7184p> f17799i;

    /* renamed from: e */
    private String f17800e;

    /* renamed from: f */
    private String f17801f;

    /* renamed from: g */
    private String f17802g;

    /* renamed from: co.znly.models.core.p$a */
    public static final class C7185a extends Builder<C7184p, C7185a> implements ChatProto$EmojiOrBuilder {
        /* synthetic */ C7185a(C7066c cVar) {
            this();
        }

        public String getUrl() {
            return ((C7184p) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((C7184p) this.instance).getUrlBytes();
        }

        public String getUtf8() {
            return ((C7184p) this.instance).getUtf8();
        }

        public ByteString getUtf8Bytes() {
            return ((C7184p) this.instance).getUtf8Bytes();
        }

        public String getUuid() {
            return ((C7184p) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7184p) this.instance).getUuidBytes();
        }

        private C7185a() {
            super(C7184p.f17798h);
        }
    }

    static {
        f17798h.makeImmutable();
    }

    private C7184p() {
        String str = "";
        this.f17800e = str;
        this.f17801f = str;
        this.f17802g = str;
    }

    public static C7185a newBuilder() {
        return (C7185a) f17798h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7184p();
            case 2:
                return f17798h;
            case 3:
                return null;
            case 4:
                return new C7185a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7184p pVar = (C7184p) obj2;
                this.f17800e = visitor.visitString(!this.f17800e.isEmpty(), this.f17800e, !pVar.f17800e.isEmpty(), pVar.f17800e);
                this.f17801f = visitor.visitString(!this.f17801f.isEmpty(), this.f17801f, !pVar.f17801f.isEmpty(), pVar.f17801f);
                this.f17802g = visitor.visitString(!this.f17802g.isEmpty(), this.f17802g, true ^ pVar.f17802g.isEmpty(), pVar.f17802g);
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
                                this.f17800e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17801f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f17802g = codedInputStream.readStringRequireUtf8();
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
                if (f17799i == null) {
                    synchronized (C7184p.class) {
                        if (f17799i == null) {
                            f17799i = new DefaultInstanceBasedParser(f17798h);
                        }
                    }
                }
                return f17799i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17798h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17800e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUtf8());
        }
        if (!this.f17801f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUuid());
        }
        if (!this.f17802g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getUrl());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUrl() {
        return this.f17802g;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.f17802g);
    }

    public String getUtf8() {
        return this.f17800e;
    }

    public ByteString getUtf8Bytes() {
        return ByteString.copyFromUtf8(this.f17800e);
    }

    public String getUuid() {
        return this.f17801f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17801f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17800e.isEmpty()) {
            codedOutputStream.writeString(1, getUtf8());
        }
        if (!this.f17801f.isEmpty()) {
            codedOutputStream.writeString(2, getUuid());
        }
        if (!this.f17802g.isEmpty()) {
            codedOutputStream.writeString(3, getUrl());
        }
    }
}
