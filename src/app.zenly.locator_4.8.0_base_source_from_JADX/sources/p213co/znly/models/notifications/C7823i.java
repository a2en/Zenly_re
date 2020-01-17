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
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6884d;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.i */
public final class C7823i extends GeneratedMessageLite<C7823i, C7824a> implements NotificationProto$CountryChangeNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7823i f19551i = new C7823i();

    /* renamed from: j */
    private static volatile Parser<C7823i> f19552j;

    /* renamed from: e */
    private UserProto$User f19553e;

    /* renamed from: f */
    private String f19554f;

    /* renamed from: g */
    private String f19555g;

    /* renamed from: h */
    private TrackingContextProto$TrackingContext f19556h;

    /* renamed from: co.znly.models.notifications.i$a */
    public static final class C7824a extends Builder<C7823i, C7824a> implements NotificationProto$CountryChangeNotificationOrBuilder {
        /* synthetic */ C7824a(C7790a aVar) {
            this();
        }

        public String getDestination() {
            return ((C7823i) this.instance).getDestination();
        }

        public ByteString getDestinationBytes() {
            return ((C7823i) this.instance).getDestinationBytes();
        }

        public String getOrigin() {
            return ((C7823i) this.instance).getOrigin();
        }

        public ByteString getOriginBytes() {
            return ((C7823i) this.instance).getOriginBytes();
        }

        public TrackingContextProto$TrackingContext getTrackingContext() {
            return ((C7823i) this.instance).getTrackingContext();
        }

        public UserProto$User getUser() {
            return ((C7823i) this.instance).getUser();
        }

        public boolean hasTrackingContext() {
            return ((C7823i) this.instance).hasTrackingContext();
        }

        public boolean hasUser() {
            return ((C7823i) this.instance).hasUser();
        }

        private C7824a() {
            super(C7823i.f19551i);
        }
    }

    static {
        f19551i.makeImmutable();
    }

    private C7823i() {
        String str = "";
        this.f19554f = str;
        this.f19555g = str;
    }

    public static C7823i getDefaultInstance() {
        return f19551i;
    }

    public static Parser<C7823i> parser() {
        return f19551i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7823i();
            case 2:
                return f19551i;
            case 3:
                return null;
            case 4:
                return new C7824a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7823i iVar = (C7823i) obj2;
                this.f19553e = (UserProto$User) visitor.visitMessage(this.f19553e, iVar.f19553e);
                this.f19554f = visitor.visitString(!this.f19554f.isEmpty(), this.f19554f, !iVar.f19554f.isEmpty(), iVar.f19554f);
                this.f19555g = visitor.visitString(!this.f19555g.isEmpty(), this.f19555g, true ^ iVar.f19555g.isEmpty(), iVar.f19555g);
                this.f19556h = (TrackingContextProto$TrackingContext) visitor.visitMessage(this.f19556h, iVar.f19556h);
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
                                Builder builder = this.f19553e != null ? (C6925a) this.f19553e.toBuilder() : null;
                                this.f19553e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19553e);
                                    this.f19553e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                this.f19554f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f19555g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f19556h != null ? (C6884d) this.f19556h.toBuilder() : null;
                                this.f19556h = (TrackingContextProto$TrackingContext) codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19556h);
                                    this.f19556h = (TrackingContextProto$TrackingContext) builder2.buildPartial();
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
                if (f19552j == null) {
                    synchronized (C7823i.class) {
                        if (f19552j == null) {
                            f19552j = new DefaultInstanceBasedParser(f19551i);
                        }
                    }
                }
                return f19552j;
            default:
                throw new UnsupportedOperationException();
        }
        return f19551i;
    }

    public String getDestination() {
        return this.f19555g;
    }

    public ByteString getDestinationBytes() {
        return ByteString.copyFromUtf8(this.f19555g);
    }

    public String getOrigin() {
        return this.f19554f;
    }

    public ByteString getOriginBytes() {
        return ByteString.copyFromUtf8(this.f19554f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19553e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getUser());
        }
        if (!this.f19554f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getOrigin());
        }
        if (!this.f19555g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getDestination());
        }
        if (this.f19556h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getTrackingContext());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public TrackingContextProto$TrackingContext getTrackingContext() {
        TrackingContextProto$TrackingContext trackingContextProto$TrackingContext = this.f19556h;
        return trackingContextProto$TrackingContext == null ? TrackingContextProto$TrackingContext.getDefaultInstance() : trackingContextProto$TrackingContext;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19553e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasTrackingContext() {
        return this.f19556h != null;
    }

    public boolean hasUser() {
        return this.f19553e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19553e != null) {
            codedOutputStream.writeMessage(1, getUser());
        }
        if (!this.f19554f.isEmpty()) {
            codedOutputStream.writeString(2, getOrigin());
        }
        if (!this.f19555g.isEmpty()) {
            codedOutputStream.writeString(3, getDestination());
        }
        if (this.f19556h != null) {
            codedOutputStream.writeMessage(4, getTrackingContext());
        }
    }
}
