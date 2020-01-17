package p213co.znly.models.nights;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
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

/* renamed from: co.znly.models.nights.f */
public final class C7421f extends GeneratedMessageLite<C7421f, C7422a> implements NightsProto$NightsAtOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7421f f18551i = new C7421f();

    /* renamed from: j */
    private static volatile Parser<C7421f> f18552j;

    /* renamed from: e */
    private int f18553e;

    /* renamed from: f */
    private String f18554f;

    /* renamed from: g */
    private String f18555g;

    /* renamed from: h */
    private ProtobufList<C7419e> f18556h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.nights.f$a */
    public static final class C7422a extends Builder<C7421f, C7422a> implements NightsProto$NightsAtOrBuilder {
        /* synthetic */ C7422a(C7410a aVar) {
            this();
        }

        public String getLocationId() {
            return ((C7421f) this.instance).getLocationId();
        }

        public ByteString getLocationIdBytes() {
            return ((C7421f) this.instance).getLocationIdBytes();
        }

        public C7419e getNights(int i) {
            return ((C7421f) this.instance).getNights(i);
        }

        public int getNightsCount() {
            return ((C7421f) this.instance).getNightsCount();
        }

        public List<C7419e> getNightsList() {
            return Collections.unmodifiableList(((C7421f) this.instance).getNightsList());
        }

        public String getStayId() {
            return ((C7421f) this.instance).getStayId();
        }

        public ByteString getStayIdBytes() {
            return ((C7421f) this.instance).getStayIdBytes();
        }

        private C7422a() {
            super(C7421f.f18551i);
        }
    }

    static {
        f18551i.makeImmutable();
    }

    private C7421f() {
        String str = "";
        this.f18554f = str;
        this.f18555g = str;
    }

    public static Parser<C7421f> parser() {
        return f18551i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7421f();
            case 2:
                return f18551i;
            case 3:
                this.f18556h.makeImmutable();
                return null;
            case 4:
                return new C7422a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7421f fVar = (C7421f) obj2;
                this.f18554f = visitor.visitString(!this.f18554f.isEmpty(), this.f18554f, !fVar.f18554f.isEmpty(), fVar.f18554f);
                this.f18555g = visitor.visitString(!this.f18555g.isEmpty(), this.f18555g, true ^ fVar.f18555g.isEmpty(), fVar.f18555g);
                this.f18556h = visitor.visitList(this.f18556h, fVar.f18556h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18553e |= fVar.f18553e;
                }
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
                                this.f18554f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18555g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!this.f18556h.isModifiable()) {
                                    this.f18556h = GeneratedMessageLite.mutableCopy(this.f18556h);
                                }
                                this.f18556h.add(codedInputStream.readMessage(C7419e.parser(), extensionRegistryLite));
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
                if (f18552j == null) {
                    synchronized (C7421f.class) {
                        if (f18552j == null) {
                            f18552j = new DefaultInstanceBasedParser(f18551i);
                        }
                    }
                }
                return f18552j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18551i;
    }

    public String getLocationId() {
        return this.f18554f;
    }

    public ByteString getLocationIdBytes() {
        return ByteString.copyFromUtf8(this.f18554f);
    }

    public C7419e getNights(int i) {
        return (C7419e) this.f18556h.get(i);
    }

    public int getNightsCount() {
        return this.f18556h.size();
    }

    public List<C7419e> getNightsList() {
        return this.f18556h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18554f.isEmpty() ? CodedOutputStream.computeStringSize(1, getLocationId()) + 0 : 0;
        if (!this.f18555g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getStayId());
        }
        for (int i2 = 0; i2 < this.f18556h.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f18556h.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getStayId() {
        return this.f18555g;
    }

    public ByteString getStayIdBytes() {
        return ByteString.copyFromUtf8(this.f18555g);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18554f.isEmpty()) {
            codedOutputStream.writeString(1, getLocationId());
        }
        if (!this.f18555g.isEmpty()) {
            codedOutputStream.writeString(2, getStayId());
        }
        for (int i = 0; i < this.f18556h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f18556h.get(i));
        }
    }
}
