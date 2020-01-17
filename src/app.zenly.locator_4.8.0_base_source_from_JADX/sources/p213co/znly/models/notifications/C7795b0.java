package p213co.znly.models.notifications;

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

/* renamed from: co.znly.models.notifications.b0 */
public final class C7795b0 extends GeneratedMessageLite<C7795b0, C7796a> implements NotificationProto$RawNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7795b0 f19478g = new C7795b0();

    /* renamed from: h */
    private static volatile Parser<C7795b0> f19479h;

    /* renamed from: e */
    private String f19480e;

    /* renamed from: f */
    private String f19481f;

    /* renamed from: co.znly.models.notifications.b0$a */
    public static final class C7796a extends Builder<C7795b0, C7796a> implements NotificationProto$RawNotificationOrBuilder {
        /* synthetic */ C7796a(C7790a aVar) {
            this();
        }

        public String getMessage() {
            return ((C7795b0) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C7795b0) this.instance).getMessageBytes();
        }

        public String getTitle() {
            return ((C7795b0) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((C7795b0) this.instance).getTitleBytes();
        }

        private C7796a() {
            super(C7795b0.f19478g);
        }
    }

    static {
        f19478g.makeImmutable();
    }

    private C7795b0() {
        String str = "";
        this.f19480e = str;
        this.f19481f = str;
    }

    public static C7795b0 getDefaultInstance() {
        return f19478g;
    }

    public static Parser<C7795b0> parser() {
        return f19478g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7795b0();
            case 2:
                return f19478g;
            case 3:
                return null;
            case 4:
                return new C7796a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7795b0 b0Var = (C7795b0) obj2;
                this.f19480e = visitor.visitString(!this.f19480e.isEmpty(), this.f19480e, !b0Var.f19480e.isEmpty(), b0Var.f19480e);
                this.f19481f = visitor.visitString(!this.f19481f.isEmpty(), this.f19481f, true ^ b0Var.f19481f.isEmpty(), b0Var.f19481f);
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
                                this.f19480e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f19481f = codedInputStream.readStringRequireUtf8();
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
                if (f19479h == null) {
                    synchronized (C7795b0.class) {
                        if (f19479h == null) {
                            f19479h = new DefaultInstanceBasedParser(f19478g);
                        }
                    }
                }
                return f19479h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19478g;
    }

    public String getMessage() {
        return this.f19480e;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f19480e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19480e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getMessage());
        }
        if (!this.f19481f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getTitle());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTitle() {
        return this.f19481f;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.f19481f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19480e.isEmpty()) {
            codedOutputStream.writeString(1, getMessage());
        }
        if (!this.f19481f.isEmpty()) {
            codedOutputStream.writeString(2, getTitle());
        }
    }
}
