package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6884d;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.r */
public final class C7845r extends GeneratedMessageLite<C7845r, C7846a> implements NotificationProto$FriendIsBackNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7845r f19605h = new C7845r();

    /* renamed from: i */
    private static volatile Parser<C7845r> f19606i;

    /* renamed from: e */
    private int f19607e;

    /* renamed from: f */
    private UserProto$User f19608f;

    /* renamed from: g */
    private TrackingContextProto$TrackingContext f19609g;

    /* renamed from: co.znly.models.notifications.r$a */
    public static final class C7846a extends Builder<C7845r, C7846a> implements NotificationProto$FriendIsBackNotificationOrBuilder {
        /* synthetic */ C7846a(C7790a aVar) {
            this();
        }

        public C7847b getReason() {
            return ((C7845r) this.instance).getReason();
        }

        public int getReasonValue() {
            return ((C7845r) this.instance).getReasonValue();
        }

        public TrackingContextProto$TrackingContext getTrackingContext() {
            return ((C7845r) this.instance).getTrackingContext();
        }

        public UserProto$User getUser() {
            return ((C7845r) this.instance).getUser();
        }

        public boolean hasTrackingContext() {
            return ((C7845r) this.instance).hasTrackingContext();
        }

        public boolean hasUser() {
            return ((C7845r) this.instance).hasUser();
        }

        private C7846a() {
            super(C7845r.f19605h);
        }
    }

    /* renamed from: co.znly.models.notifications.r$b */
    public enum C7847b implements EnumLite {
        UNKNOWN(0),
        FROM_BATTERY_OFF(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f19614e;

        /* renamed from: co.znly.models.notifications.r$b$a */
        class C7848a implements EnumLiteMap<C7847b> {
            C7848a() {
            }

            public C7847b findValueByNumber(int i) {
                return C7847b.m18927a(i);
            }
        }

        static {
            new C7848a();
        }

        private C7847b(int i) {
            this.f19614e = i;
        }

        /* renamed from: a */
        public static C7847b m18927a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return FROM_BATTERY_OFF;
        }

        public final int getNumber() {
            return this.f19614e;
        }
    }

    static {
        f19605h.makeImmutable();
    }

    private C7845r() {
    }

    public static C7845r getDefaultInstance() {
        return f19605h;
    }

    public static Parser<C7845r> parser() {
        return f19605h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7845r();
            case 2:
                return f19605h;
            case 3:
                return null;
            case 4:
                return new C7846a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7845r rVar = (C7845r) obj2;
                boolean z2 = this.f19607e != 0;
                int i = this.f19607e;
                if (rVar.f19607e != 0) {
                    z = true;
                }
                this.f19607e = visitor.visitInt(z2, i, z, rVar.f19607e);
                this.f19608f = (UserProto$User) visitor.visitMessage(this.f19608f, rVar.f19608f);
                this.f19609g = (TrackingContextProto$TrackingContext) visitor.visitMessage(this.f19609g, rVar.f19609g);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f19607e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f19608f != null ? (C6925a) this.f19608f.toBuilder() : null;
                                this.f19608f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19608f);
                                    this.f19608f = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f19609g != null ? (C6884d) this.f19609g.toBuilder() : null;
                                this.f19609g = (TrackingContextProto$TrackingContext) codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19609g);
                                    this.f19609g = (TrackingContextProto$TrackingContext) builder2.buildPartial();
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
                if (f19606i == null) {
                    synchronized (C7845r.class) {
                        if (f19606i == null) {
                            f19606i = new DefaultInstanceBasedParser(f19605h);
                        }
                    }
                }
                return f19606i;
            default:
                throw new UnsupportedOperationException();
        }
        return f19605h;
    }

    public C7847b getReason() {
        C7847b a = C7847b.m18927a(this.f19607e);
        return a == null ? C7847b.UNRECOGNIZED : a;
    }

    public int getReasonValue() {
        return this.f19607e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19607e != C7847b.UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f19607e);
        }
        if (this.f19608f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getUser());
        }
        if (this.f19609g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getTrackingContext());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public TrackingContextProto$TrackingContext getTrackingContext() {
        TrackingContextProto$TrackingContext trackingContextProto$TrackingContext = this.f19609g;
        return trackingContextProto$TrackingContext == null ? TrackingContextProto$TrackingContext.getDefaultInstance() : trackingContextProto$TrackingContext;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19608f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasTrackingContext() {
        return this.f19609g != null;
    }

    public boolean hasUser() {
        return this.f19608f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19607e != C7847b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f19607e);
        }
        if (this.f19608f != null) {
            codedOutputStream.writeMessage(2, getUser());
        }
        if (this.f19609g != null) {
            codedOutputStream.writeMessage(3, getTrackingContext());
        }
    }
}
