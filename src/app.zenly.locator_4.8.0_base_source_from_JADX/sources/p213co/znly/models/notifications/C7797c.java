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

/* renamed from: co.znly.models.notifications.c */
public final class C7797c extends GeneratedMessageLite<C7797c, C7798a> implements NotificationProto$CMDDumpReportNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7797c f19482f = new C7797c();

    /* renamed from: g */
    private static volatile Parser<C7797c> f19483g;

    /* renamed from: e */
    private String f19484e = "";

    /* renamed from: co.znly.models.notifications.c$a */
    public static final class C7798a extends Builder<C7797c, C7798a> implements NotificationProto$CMDDumpReportNotificationOrBuilder {
        /* synthetic */ C7798a(C7790a aVar) {
            this();
        }

        public String getEndpoint() {
            return ((C7797c) this.instance).getEndpoint();
        }

        public ByteString getEndpointBytes() {
            return ((C7797c) this.instance).getEndpointBytes();
        }

        private C7798a() {
            super(C7797c.f19482f);
        }
    }

    static {
        f19482f.makeImmutable();
    }

    private C7797c() {
    }

    public static C7797c getDefaultInstance() {
        return f19482f;
    }

    public static Parser<C7797c> parser() {
        return f19482f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7797c();
            case 2:
                return f19482f;
            case 3:
                return null;
            case 4:
                return new C7798a(null);
            case 5:
                C7797c cVar = (C7797c) obj2;
                this.f19484e = ((Visitor) obj).visitString(!this.f19484e.isEmpty(), this.f19484e, true ^ cVar.f19484e.isEmpty(), cVar.f19484e);
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
                                this.f19484e = codedInputStream.readStringRequireUtf8();
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
                if (f19483g == null) {
                    synchronized (C7797c.class) {
                        if (f19483g == null) {
                            f19483g = new DefaultInstanceBasedParser(f19482f);
                        }
                    }
                }
                return f19483g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19482f;
    }

    public String getEndpoint() {
        return this.f19484e;
    }

    public ByteString getEndpointBytes() {
        return ByteString.copyFromUtf8(this.f19484e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19484e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getEndpoint());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19484e.isEmpty()) {
            codedOutputStream.writeString(1, getEndpoint());
        }
    }
}
