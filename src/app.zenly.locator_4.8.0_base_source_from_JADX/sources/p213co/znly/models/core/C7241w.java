package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.w */
public final class C7241w extends GeneratedMessageLite<C7241w, C7242a> implements ChatProto$RequestMediaReceivedEventOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7241w f17965h = new C7241w();

    /* renamed from: i */
    private static volatile Parser<C7241w> f17966i;

    /* renamed from: e */
    private int f17967e;

    /* renamed from: f */
    private String f17968f = "";

    /* renamed from: g */
    private ProtobufList<C7234v> f17969g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.w$a */
    public static final class C7242a extends Builder<C7241w, C7242a> implements ChatProto$RequestMediaReceivedEventOrBuilder {
        /* synthetic */ C7242a(C7066c cVar) {
            this();
        }

        public C7234v getReceived(int i) {
            return ((C7241w) this.instance).getReceived(i);
        }

        public int getReceivedCount() {
            return ((C7241w) this.instance).getReceivedCount();
        }

        public List<C7234v> getReceivedList() {
            return Collections.unmodifiableList(((C7241w) this.instance).getReceivedList());
        }

        public String getTargetUuid() {
            return ((C7241w) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C7241w) this.instance).getTargetUuidBytes();
        }

        private C7242a() {
            super(C7241w.f17965h);
        }
    }

    static {
        f17965h.makeImmutable();
    }

    private C7241w() {
    }

    public static Parser<C7241w> parser() {
        return f17965h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7241w();
            case 2:
                return f17965h;
            case 3:
                this.f17969g.makeImmutable();
                return null;
            case 4:
                return new C7242a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7241w wVar = (C7241w) obj2;
                this.f17968f = visitor.visitString(!this.f17968f.isEmpty(), this.f17968f, true ^ wVar.f17968f.isEmpty(), wVar.f17968f);
                this.f17969g = visitor.visitList(this.f17969g, wVar.f17969g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17967e |= wVar.f17967e;
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
                                this.f17968f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!this.f17969g.isModifiable()) {
                                    this.f17969g = GeneratedMessageLite.mutableCopy(this.f17969g);
                                }
                                this.f17969g.add(codedInputStream.readMessage(C7234v.parser(), extensionRegistryLite));
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
                if (f17966i == null) {
                    synchronized (C7241w.class) {
                        if (f17966i == null) {
                            f17966i = new DefaultInstanceBasedParser(f17965h);
                        }
                    }
                }
                return f17966i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17965h;
    }

    public C7234v getReceived(int i) {
        return (C7234v) this.f17969g.get(i);
    }

    public int getReceivedCount() {
        return this.f17969g.size();
    }

    public List<C7234v> getReceivedList() {
        return this.f17969g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f17968f.isEmpty() ? CodedOutputStream.computeStringSize(1, getTargetUuid()) + 0 : 0;
        for (int i2 = 0; i2 < this.f17969g.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f17969g.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getTargetUuid() {
        return this.f17968f;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f17968f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17968f.isEmpty()) {
            codedOutputStream.writeString(1, getTargetUuid());
        }
        for (int i = 0; i < this.f17969g.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f17969g.get(i));
        }
    }
}
