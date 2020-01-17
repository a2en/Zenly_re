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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import zenly.protobuf.protomodels.C13835a;

/* renamed from: co.znly.models.notifications.NotificationProto$SigningNotification */
public final class NotificationProto$SigningNotification extends GeneratedMessageLite<NotificationProto$SigningNotification, C7789a> implements NotificationProto$SigningNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final NotificationProto$SigningNotification f19463g = new NotificationProto$SigningNotification();

    /* renamed from: h */
    private static volatile Parser<NotificationProto$SigningNotification> f19464h;

    /* renamed from: e */
    private ByteString f19465e;

    /* renamed from: f */
    private ByteString f19466f;

    /* renamed from: co.znly.models.notifications.NotificationProto$SigningNotification$KeysOrBuilder */
    public interface KeysOrBuilder extends MessageLiteOrBuilder {
        C13835a getCipher();

        int getCipherValue();

        ByteString getPrivKey();

        ByteString getPubKey();

        ByteString getPubSign();
    }

    /* renamed from: co.znly.models.notifications.NotificationProto$SigningNotification$a */
    public static final class C7789a extends Builder<NotificationProto$SigningNotification, C7789a> implements NotificationProto$SigningNotificationOrBuilder {
        /* synthetic */ C7789a(C7790a aVar) {
            this();
        }

        public ByteString getBoxPublicKey() {
            return ((NotificationProto$SigningNotification) this.instance).getBoxPublicKey();
        }

        public ByteString getKeys() {
            return ((NotificationProto$SigningNotification) this.instance).getKeys();
        }

        private C7789a() {
            super(NotificationProto$SigningNotification.f19463g);
        }
    }

    static {
        f19463g.makeImmutable();
    }

    private NotificationProto$SigningNotification() {
        ByteString byteString = ByteString.EMPTY;
        this.f19465e = byteString;
        this.f19466f = byteString;
    }

    public static NotificationProto$SigningNotification getDefaultInstance() {
        return f19463g;
    }

    public static Parser<NotificationProto$SigningNotification> parser() {
        return f19463g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new NotificationProto$SigningNotification();
            case 2:
                return f19463g;
            case 3:
                return null;
            case 4:
                return new C7789a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                NotificationProto$SigningNotification notificationProto$SigningNotification = (NotificationProto$SigningNotification) obj2;
                this.f19465e = visitor.visitByteString(this.f19465e != ByteString.EMPTY, this.f19465e, notificationProto$SigningNotification.f19465e != ByteString.EMPTY, notificationProto$SigningNotification.f19465e);
                boolean z2 = this.f19466f != ByteString.EMPTY;
                ByteString byteString = this.f19466f;
                if (notificationProto$SigningNotification.f19466f != ByteString.EMPTY) {
                    z = true;
                }
                this.f19466f = visitor.visitByteString(z2, byteString, z, notificationProto$SigningNotification.f19466f);
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
                                this.f19465e = codedInputStream.readBytes();
                            } else if (readTag == 18) {
                                this.f19466f = codedInputStream.readBytes();
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
                if (f19464h == null) {
                    synchronized (NotificationProto$SigningNotification.class) {
                        if (f19464h == null) {
                            f19464h = new DefaultInstanceBasedParser(f19463g);
                        }
                    }
                }
                return f19464h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19463g;
    }

    public ByteString getBoxPublicKey() {
        return this.f19466f;
    }

    public ByteString getKeys() {
        return this.f19465e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19465e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeBytesSize(1, this.f19465e);
        }
        if (!this.f19466f.isEmpty()) {
            i2 += CodedOutputStream.computeBytesSize(2, this.f19466f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19465e.isEmpty()) {
            codedOutputStream.writeBytes(1, this.f19465e);
        }
        if (!this.f19466f.isEmpty()) {
            codedOutputStream.writeBytes(2, this.f19466f);
        }
    }
}
