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

/* renamed from: co.znly.models.notifications.l */
public final class C7833l extends GeneratedMessageLite<C7833l, C7834a> implements NotificationProto$EmojiPackUnlockedNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7833l f19583f = new C7833l();

    /* renamed from: g */
    private static volatile Parser<C7833l> f19584g;

    /* renamed from: e */
    private String f19585e = "";

    /* renamed from: co.znly.models.notifications.l$a */
    public static final class C7834a extends Builder<C7833l, C7834a> implements NotificationProto$EmojiPackUnlockedNotificationOrBuilder {
        /* synthetic */ C7834a(C7790a aVar) {
            this();
        }

        public String getPackUuid() {
            return ((C7833l) this.instance).getPackUuid();
        }

        public ByteString getPackUuidBytes() {
            return ((C7833l) this.instance).getPackUuidBytes();
        }

        private C7834a() {
            super(C7833l.f19583f);
        }
    }

    static {
        f19583f.makeImmutable();
    }

    private C7833l() {
    }

    public static C7833l getDefaultInstance() {
        return f19583f;
    }

    public static Parser<C7833l> parser() {
        return f19583f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7833l();
            case 2:
                return f19583f;
            case 3:
                return null;
            case 4:
                return new C7834a(null);
            case 5:
                C7833l lVar = (C7833l) obj2;
                this.f19585e = ((Visitor) obj).visitString(!this.f19585e.isEmpty(), this.f19585e, true ^ lVar.f19585e.isEmpty(), lVar.f19585e);
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
                                this.f19585e = codedInputStream.readStringRequireUtf8();
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
                if (f19584g == null) {
                    synchronized (C7833l.class) {
                        if (f19584g == null) {
                            f19584g = new DefaultInstanceBasedParser(f19583f);
                        }
                    }
                }
                return f19584g;
            default:
                throw new UnsupportedOperationException();
        }
        return f19583f;
    }

    public String getPackUuid() {
        return this.f19585e;
    }

    public ByteString getPackUuidBytes() {
        return ByteString.copyFromUtf8(this.f19585e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19585e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getPackUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19585e.isEmpty()) {
            codedOutputStream.writeString(1, getPackUuid());
        }
    }
}
