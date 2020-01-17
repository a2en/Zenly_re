package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7270d;
import p213co.znly.models.C7270d.C7271a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.b */
public final class C7793b extends GeneratedMessageLite<C7793b, C7794a> implements NotificationProto$BrumpNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7793b f19472i = new C7793b();

    /* renamed from: j */
    private static volatile Parser<C7793b> f19473j;

    /* renamed from: e */
    private UserProto$User f19474e;

    /* renamed from: f */
    private UserProto$User f19475f;

    /* renamed from: g */
    private Timestamp f19476g;

    /* renamed from: h */
    private C7270d f19477h;

    /* renamed from: co.znly.models.notifications.b$a */
    public static final class C7794a extends Builder<C7793b, C7794a> implements NotificationProto$BrumpNotificationOrBuilder {
        /* synthetic */ C7794a(C7790a aVar) {
            this();
        }

        public C7270d getBrumpInfo() {
            return ((C7793b) this.instance).getBrumpInfo();
        }

        public UserProto$User getUser1() {
            return ((C7793b) this.instance).getUser1();
        }

        public UserProto$User getUser2() {
            return ((C7793b) this.instance).getUser2();
        }

        public Timestamp getValidUntil() {
            return ((C7793b) this.instance).getValidUntil();
        }

        public boolean hasBrumpInfo() {
            return ((C7793b) this.instance).hasBrumpInfo();
        }

        public boolean hasUser1() {
            return ((C7793b) this.instance).hasUser1();
        }

        public boolean hasUser2() {
            return ((C7793b) this.instance).hasUser2();
        }

        public boolean hasValidUntil() {
            return ((C7793b) this.instance).hasValidUntil();
        }

        private C7794a() {
            super(C7793b.f19472i);
        }
    }

    static {
        f19472i.makeImmutable();
    }

    private C7793b() {
    }

    public static C7793b getDefaultInstance() {
        return f19472i;
    }

    public static Parser<C7793b> parser() {
        return f19472i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7793b();
            case 2:
                return f19472i;
            case 3:
                return null;
            case 4:
                return new C7794a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7793b bVar = (C7793b) obj2;
                this.f19474e = (UserProto$User) visitor.visitMessage(this.f19474e, bVar.f19474e);
                this.f19475f = (UserProto$User) visitor.visitMessage(this.f19475f, bVar.f19475f);
                this.f19476g = (Timestamp) visitor.visitMessage(this.f19476g, bVar.f19476g);
                this.f19477h = (C7270d) visitor.visitMessage(this.f19477h, bVar.f19477h);
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
                                Builder builder = this.f19474e != null ? (C6925a) this.f19474e.toBuilder() : null;
                                this.f19474e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19474e);
                                    this.f19474e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19475f != null ? (C6925a) this.f19475f.toBuilder() : null;
                                this.f19475f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19475f);
                                    this.f19475f = (UserProto$User) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f19476g != null ? (Timestamp.Builder) this.f19476g.toBuilder() : null;
                                this.f19476g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f19476g);
                                    this.f19476g = (Timestamp) builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder4 = this.f19477h != null ? (C7271a) this.f19477h.toBuilder() : null;
                                this.f19477h = (C7270d) codedInputStream.readMessage(C7270d.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f19477h);
                                    this.f19477h = (C7270d) builder4.buildPartial();
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
                if (f19473j == null) {
                    synchronized (C7793b.class) {
                        if (f19473j == null) {
                            f19473j = new DefaultInstanceBasedParser(f19472i);
                        }
                    }
                }
                return f19473j;
            default:
                throw new UnsupportedOperationException();
        }
        return f19472i;
    }

    public C7270d getBrumpInfo() {
        C7270d dVar = this.f19477h;
        return dVar == null ? C7270d.getDefaultInstance() : dVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19474e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser1());
        }
        if (this.f19475f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getUser2());
        }
        if (this.f19476g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getValidUntil());
        }
        if (this.f19477h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getBrumpInfo());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser1() {
        UserProto$User userProto$User = this.f19474e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public UserProto$User getUser2() {
        UserProto$User userProto$User = this.f19475f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f19476g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasBrumpInfo() {
        return this.f19477h != null;
    }

    public boolean hasUser1() {
        return this.f19474e != null;
    }

    public boolean hasUser2() {
        return this.f19475f != null;
    }

    public boolean hasValidUntil() {
        return this.f19476g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19474e != null) {
            codedOutputStream.writeMessage(1, getUser1());
        }
        if (this.f19475f != null) {
            codedOutputStream.writeMessage(2, getUser2());
        }
        if (this.f19476g != null) {
            codedOutputStream.writeMessage(3, getValidUntil());
        }
        if (this.f19477h != null) {
            codedOutputStream.writeMessage(4, getBrumpInfo());
        }
    }
}
