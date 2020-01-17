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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.g0 */
public final class C7815g0 extends GeneratedMessageLite<C7815g0, C7816a> implements NotificationProto$SleepDetectionNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7815g0 f19525h = new C7815g0();

    /* renamed from: i */
    private static volatile Parser<C7815g0> f19526i;

    /* renamed from: e */
    private int f19527e;

    /* renamed from: f */
    private Timestamp f19528f;

    /* renamed from: g */
    private UserProto$User f19529g;

    /* renamed from: co.znly.models.notifications.g0$a */
    public static final class C7816a extends Builder<C7815g0, C7816a> implements NotificationProto$SleepDetectionNotificationOrBuilder {
        /* synthetic */ C7816a(C7790a aVar) {
            this();
        }

        public C7817b getCase() {
            return ((C7815g0) this.instance).getCase();
        }

        public int getCaseValue() {
            return ((C7815g0) this.instance).getCaseValue();
        }

        public Timestamp getPredictedWakeupTime() {
            return ((C7815g0) this.instance).getPredictedWakeupTime();
        }

        public UserProto$User getUser() {
            return ((C7815g0) this.instance).getUser();
        }

        public boolean hasPredictedWakeupTime() {
            return ((C7815g0) this.instance).hasPredictedWakeupTime();
        }

        public boolean hasUser() {
            return ((C7815g0) this.instance).hasUser();
        }

        private C7816a() {
            super(C7815g0.f19525h);
        }
    }

    /* renamed from: co.znly.models.notifications.g0$b */
    public enum C7817b implements EnumLite {
        WOKE_UP_ON_TIME(0),
        WOKE_UP_LONG_BEFORE_PREDICTED_TIME(1),
        WOKE_UP_BEFORE_PREDICTED_TIME(2),
        WOKE_UP_AFTER_PREDICTED_TIME(3),
        WOKE_UP_LONG_AFTER_PREDICTED_TIME(4),
        WOKE_UP_VERY_LONG_AFTER_PREDICTED_TIME(5),
        OVER_SLEEPING_FOR_WAY_TOO_LONG(6),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f19539e;

        /* renamed from: co.znly.models.notifications.g0$b$a */
        class C7818a implements EnumLiteMap<C7817b> {
            C7818a() {
            }

            public C7817b findValueByNumber(int i) {
                return C7817b.m18913a(i);
            }
        }

        static {
            new C7818a();
        }

        private C7817b(int i) {
            this.f19539e = i;
        }

        /* renamed from: a */
        public static C7817b m18913a(int i) {
            switch (i) {
                case 0:
                    return WOKE_UP_ON_TIME;
                case 1:
                    return WOKE_UP_LONG_BEFORE_PREDICTED_TIME;
                case 2:
                    return WOKE_UP_BEFORE_PREDICTED_TIME;
                case 3:
                    return WOKE_UP_AFTER_PREDICTED_TIME;
                case 4:
                    return WOKE_UP_LONG_AFTER_PREDICTED_TIME;
                case 5:
                    return WOKE_UP_VERY_LONG_AFTER_PREDICTED_TIME;
                case 6:
                    return OVER_SLEEPING_FOR_WAY_TOO_LONG;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f19539e;
        }
    }

    static {
        f19525h.makeImmutable();
    }

    private C7815g0() {
    }

    public static C7815g0 getDefaultInstance() {
        return f19525h;
    }

    public static Parser<C7815g0> parser() {
        return f19525h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7815g0();
            case 2:
                return f19525h;
            case 3:
                return null;
            case 4:
                return new C7816a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7815g0 g0Var = (C7815g0) obj2;
                boolean z2 = this.f19527e != 0;
                int i = this.f19527e;
                if (g0Var.f19527e != 0) {
                    z = true;
                }
                this.f19527e = visitor.visitInt(z2, i, z, g0Var.f19527e);
                this.f19528f = (Timestamp) visitor.visitMessage(this.f19528f, g0Var.f19528f);
                this.f19529g = (UserProto$User) visitor.visitMessage(this.f19529g, g0Var.f19529g);
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
                                this.f19527e = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                Builder builder = this.f19529g != null ? (C6925a) this.f19529g.toBuilder() : null;
                                this.f19529g = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19529g);
                                    this.f19529g = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 74) {
                                Builder builder2 = this.f19528f != null ? (Timestamp.Builder) this.f19528f.toBuilder() : null;
                                this.f19528f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19528f);
                                    this.f19528f = (Timestamp) builder2.buildPartial();
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
                if (f19526i == null) {
                    synchronized (C7815g0.class) {
                        if (f19526i == null) {
                            f19526i = new DefaultInstanceBasedParser(f19525h);
                        }
                    }
                }
                return f19526i;
            default:
                throw new UnsupportedOperationException();
        }
        return f19525h;
    }

    public C7817b getCase() {
        C7817b a = C7817b.m18913a(this.f19527e);
        return a == null ? C7817b.UNRECOGNIZED : a;
    }

    public int getCaseValue() {
        return this.f19527e;
    }

    public Timestamp getPredictedWakeupTime() {
        Timestamp timestamp = this.f19528f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19527e != C7817b.WOKE_UP_ON_TIME.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f19527e);
        }
        if (this.f19529g != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getUser());
        }
        if (this.f19528f != null) {
            i2 += CodedOutputStream.computeMessageSize(9, getPredictedWakeupTime());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getUser() {
        UserProto$User userProto$User = this.f19529g;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasPredictedWakeupTime() {
        return this.f19528f != null;
    }

    public boolean hasUser() {
        return this.f19529g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19527e != C7817b.WOKE_UP_ON_TIME.getNumber()) {
            codedOutputStream.writeEnum(1, this.f19527e);
        }
        if (this.f19529g != null) {
            codedOutputStream.writeMessage(4, getUser());
        }
        if (this.f19528f != null) {
            codedOutputStream.writeMessage(9, getPredictedWakeupTime());
        }
    }
}
