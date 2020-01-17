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

/* renamed from: co.znly.models.core.w2 */
public final class C7247w2 extends GeneratedMessageLite<C7247w2, C7248a> implements UICacheProto$UiCacheSmsScheduler$SmsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7247w2 f17978g = new C7247w2();

    /* renamed from: h */
    private static volatile Parser<C7247w2> f17979h;

    /* renamed from: e */
    private String f17980e;

    /* renamed from: f */
    private String f17981f;

    /* renamed from: co.znly.models.core.w2$a */
    public static final class C7248a extends Builder<C7247w2, C7248a> implements UICacheProto$UiCacheSmsScheduler$SmsOrBuilder {
        /* synthetic */ C7248a(C7240v2 v2Var) {
            this();
        }

        public String getPhoneNumber() {
            return ((C7247w2) this.instance).getPhoneNumber();
        }

        public ByteString getPhoneNumberBytes() {
            return ((C7247w2) this.instance).getPhoneNumberBytes();
        }

        public String getText() {
            return ((C7247w2) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((C7247w2) this.instance).getTextBytes();
        }

        private C7248a() {
            super(C7247w2.f17978g);
        }
    }

    static {
        f17978g.makeImmutable();
    }

    private C7247w2() {
        String str = "";
        this.f17980e = str;
        this.f17981f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7240v2.f17964a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7247w2();
            case 2:
                return f17978g;
            case 3:
                return null;
            case 4:
                return new C7248a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7247w2 w2Var = (C7247w2) obj2;
                this.f17980e = visitor.visitString(!this.f17980e.isEmpty(), this.f17980e, !w2Var.f17980e.isEmpty(), w2Var.f17980e);
                this.f17981f = visitor.visitString(!this.f17981f.isEmpty(), this.f17981f, true ^ w2Var.f17981f.isEmpty(), w2Var.f17981f);
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
                                this.f17980e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17981f = codedInputStream.readStringRequireUtf8();
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
                if (f17979h == null) {
                    synchronized (C7247w2.class) {
                        if (f17979h == null) {
                            f17979h = new DefaultInstanceBasedParser(f17978g);
                        }
                    }
                }
                return f17979h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17978g;
    }

    public String getPhoneNumber() {
        return this.f17980e;
    }

    public ByteString getPhoneNumberBytes() {
        return ByteString.copyFromUtf8(this.f17980e);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17980e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getPhoneNumber());
        }
        if (!this.f17981f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getText());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getText() {
        return this.f17981f;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.f17981f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17980e.isEmpty()) {
            codedOutputStream.writeString(1, getPhoneNumber());
        }
        if (!this.f17981f.isEmpty()) {
            codedOutputStream.writeString(2, getText());
        }
    }
}
