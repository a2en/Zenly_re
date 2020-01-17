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

/* renamed from: co.znly.models.core.f */
public final class C7092f extends GeneratedMessageLite<C7092f, C7093a> implements ChatProto$ChatStoreConversation$HiddenOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7092f f17540f = new C7092f();

    /* renamed from: g */
    private static volatile Parser<C7092f> f17541g;

    /* renamed from: e */
    private String f17542e = "";

    /* renamed from: co.znly.models.core.f$a */
    public static final class C7093a extends Builder<C7092f, C7093a> implements ChatProto$ChatStoreConversation$HiddenOrBuilder {
        /* synthetic */ C7093a(C7066c cVar) {
            this();
        }

        public String getLastUpdate() {
            return ((C7092f) this.instance).getLastUpdate();
        }

        public ByteString getLastUpdateBytes() {
            return ((C7092f) this.instance).getLastUpdateBytes();
        }

        private C7093a() {
            super(C7092f.f17540f);
        }
    }

    static {
        f17540f.makeImmutable();
    }

    private C7092f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7092f();
            case 2:
                return f17540f;
            case 3:
                return null;
            case 4:
                return new C7093a(null);
            case 5:
                C7092f fVar = (C7092f) obj2;
                this.f17542e = ((Visitor) obj).visitString(!this.f17542e.isEmpty(), this.f17542e, true ^ fVar.f17542e.isEmpty(), fVar.f17542e);
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
                                this.f17542e = codedInputStream.readStringRequireUtf8();
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
                if (f17541g == null) {
                    synchronized (C7092f.class) {
                        if (f17541g == null) {
                            f17541g = new DefaultInstanceBasedParser(f17540f);
                        }
                    }
                }
                return f17541g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17540f;
    }

    public String getLastUpdate() {
        return this.f17542e;
    }

    public ByteString getLastUpdateBytes() {
        return ByteString.copyFromUtf8(this.f17542e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17542e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getLastUpdate());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17542e.isEmpty()) {
            codedOutputStream.writeString(1, getLastUpdate());
        }
    }
}
