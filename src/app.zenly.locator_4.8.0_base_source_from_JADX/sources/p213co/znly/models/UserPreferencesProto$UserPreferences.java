package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.UserPreferencesProto$UserPreferences */
public final class UserPreferencesProto$UserPreferences extends GeneratedMessageLite<UserPreferencesProto$UserPreferences, C6914a> implements UserPreferencesProto$UserPreferencesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final UserPreferencesProto$UserPreferences f16968i = new UserPreferencesProto$UserPreferences();

    /* renamed from: j */
    private static volatile Parser<UserPreferencesProto$UserPreferences> f16969j;

    /* renamed from: e */
    private float f16970e;

    /* renamed from: f */
    private boolean f16971f;

    /* renamed from: g */
    private boolean f16972g;

    /* renamed from: h */
    private C6915b f16973h;

    /* renamed from: co.znly.models.UserPreferencesProto$UserPreferences$DescendantsOrBuilder */
    public interface DescendantsOrBuilder extends MessageLiteOrBuilder {
        int getCount();

        int getHintFlags();

        Timestamp getLastSeenDate();

        int getLastSeenLevelThreshold();

        boolean hasLastSeenDate();
    }

    /* renamed from: co.znly.models.UserPreferencesProto$UserPreferences$a */
    public static final class C6914a extends Builder<UserPreferencesProto$UserPreferences, C6914a> implements UserPreferencesProto$UserPreferencesOrBuilder {
        /* synthetic */ C6914a(C7513y2 y2Var) {
            this();
        }

        public float getBumpAccelerationThreshold() {
            return ((UserPreferencesProto$UserPreferences) this.instance).getBumpAccelerationThreshold();
        }

        public C6915b getDescendants() {
            return ((UserPreferencesProto$UserPreferences) this.instance).getDescendants();
        }

        public boolean getFootstepsOnboardingDone() {
            return ((UserPreferencesProto$UserPreferences) this.instance).getFootstepsOnboardingDone();
        }

        public boolean getFootstepsStartedOnce() {
            return ((UserPreferencesProto$UserPreferences) this.instance).getFootstepsStartedOnce();
        }

        public boolean hasDescendants() {
            return ((UserPreferencesProto$UserPreferences) this.instance).hasDescendants();
        }

        private C6914a() {
            super(UserPreferencesProto$UserPreferences.f16968i);
        }
    }

    /* renamed from: co.znly.models.UserPreferencesProto$UserPreferences$b */
    public static final class C6915b extends GeneratedMessageLite<C6915b, C6916a> implements DescendantsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6915b f16974i = new C6915b();

        /* renamed from: j */
        private static volatile Parser<C6915b> f16975j;

        /* renamed from: e */
        private int f16976e;

        /* renamed from: f */
        private int f16977f;

        /* renamed from: g */
        private int f16978g;

        /* renamed from: h */
        private Timestamp f16979h;

        /* renamed from: co.znly.models.UserPreferencesProto$UserPreferences$b$a */
        public static final class C6916a extends Builder<C6915b, C6916a> implements DescendantsOrBuilder {
            /* synthetic */ C6916a(C7513y2 y2Var) {
                this();
            }

            /* renamed from: a */
            public C6916a mo17856a(int i) {
                copyOnWrite();
                ((C6915b) this.instance).m17629a(i);
                return this;
            }

            /* renamed from: b */
            public C6916a mo17858b(int i) {
                copyOnWrite();
                ((C6915b) this.instance).m17633b(i);
                return this;
            }

            /* renamed from: c */
            public C6916a mo17859c(int i) {
                copyOnWrite();
                ((C6915b) this.instance).m17635c(i);
                return this;
            }

            public int getCount() {
                return ((C6915b) this.instance).getCount();
            }

            public int getHintFlags() {
                return ((C6915b) this.instance).getHintFlags();
            }

            public Timestamp getLastSeenDate() {
                return ((C6915b) this.instance).getLastSeenDate();
            }

            public int getLastSeenLevelThreshold() {
                return ((C6915b) this.instance).getLastSeenLevelThreshold();
            }

            public boolean hasLastSeenDate() {
                return ((C6915b) this.instance).hasLastSeenDate();
            }

            private C6916a() {
                super(C6915b.f16974i);
            }

            /* renamed from: a */
            public C6916a mo17857a(Timestamp timestamp) {
                copyOnWrite();
                ((C6915b) this.instance).m17630a(timestamp);
                return this;
            }
        }

        static {
            f16974i.makeImmutable();
        }

        private C6915b() {
        }

        public static C6915b getDefaultInstance() {
            return f16974i;
        }

        public static C6916a newBuilder() {
            return (C6916a) f16974i.toBuilder();
        }

        public static Parser<C6915b> parser() {
            return f16974i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7513y2.f18876a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6915b();
                case 2:
                    return f16974i;
                case 3:
                    return null;
                case 4:
                    return new C6916a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6915b bVar = (C6915b) obj2;
                    this.f16976e = visitor.visitInt(this.f16976e != 0, this.f16976e, bVar.f16976e != 0, bVar.f16976e);
                    this.f16977f = visitor.visitInt(this.f16977f != 0, this.f16977f, bVar.f16977f != 0, bVar.f16977f);
                    boolean z2 = this.f16978g != 0;
                    int i = this.f16978g;
                    if (bVar.f16978g != 0) {
                        z = true;
                    }
                    this.f16978g = visitor.visitInt(z2, i, z, bVar.f16978g);
                    this.f16979h = (Timestamp) visitor.visitMessage(this.f16979h, bVar.f16979h);
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
                                    this.f16976e = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f16977f = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    this.f16978g = codedInputStream.readInt32();
                                } else if (readTag == 34) {
                                    Builder builder = this.f16979h != null ? (Timestamp.Builder) this.f16979h.toBuilder() : null;
                                    this.f16979h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16979h);
                                        this.f16979h = (Timestamp) builder.buildPartial();
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
                    if (f16975j == null) {
                        synchronized (C6915b.class) {
                            if (f16975j == null) {
                                f16975j = new DefaultInstanceBasedParser(f16974i);
                            }
                        }
                    }
                    return f16975j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16974i;
        }

        public int getCount() {
            return this.f16976e;
        }

        public int getHintFlags() {
            return this.f16977f;
        }

        public Timestamp getLastSeenDate() {
            Timestamp timestamp = this.f16979h;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public int getLastSeenLevelThreshold() {
            return this.f16978g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16976e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            int i4 = this.f16977f;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i4);
            }
            int i5 = this.f16978g;
            if (i5 != 0) {
                i2 += CodedOutputStream.computeInt32Size(3, i5);
            }
            if (this.f16979h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getLastSeenDate());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasLastSeenDate() {
            return this.f16979h != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16976e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.f16977f;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            int i3 = this.f16978g;
            if (i3 != 0) {
                codedOutputStream.writeInt32(3, i3);
            }
            if (this.f16979h != null) {
                codedOutputStream.writeMessage(4, getLastSeenDate());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17633b(int i) {
            this.f16977f = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m17635c(int i) {
            this.f16978g = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17629a(int i) {
            this.f16976e = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17630a(Timestamp timestamp) {
            if (timestamp != null) {
                this.f16979h = timestamp;
                return;
            }
            throw new NullPointerException();
        }
    }

    static {
        f16968i.makeImmutable();
    }

    private UserPreferencesProto$UserPreferences() {
    }

    public static UserPreferencesProto$UserPreferences getDefaultInstance() {
        return f16968i;
    }

    public static Parser<UserPreferencesProto$UserPreferences> parser() {
        return f16968i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7513y2.f18876a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserPreferencesProto$UserPreferences();
            case 2:
                return f16968i;
            case 3:
                return null;
            case 4:
                return new C6914a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                UserPreferencesProto$UserPreferences userPreferencesProto$UserPreferences = (UserPreferencesProto$UserPreferences) obj2;
                boolean z2 = this.f16970e != 0.0f;
                float f = this.f16970e;
                if (userPreferencesProto$UserPreferences.f16970e != 0.0f) {
                    z = true;
                }
                this.f16970e = visitor.visitFloat(z2, f, z, userPreferencesProto$UserPreferences.f16970e);
                boolean z3 = this.f16971f;
                boolean z4 = userPreferencesProto$UserPreferences.f16971f;
                this.f16971f = visitor.visitBoolean(z3, z3, z4, z4);
                boolean z5 = this.f16972g;
                boolean z6 = userPreferencesProto$UserPreferences.f16972g;
                this.f16972g = visitor.visitBoolean(z5, z5, z6, z6);
                this.f16973h = (C6915b) visitor.visitMessage(this.f16973h, userPreferencesProto$UserPreferences.f16973h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 13) {
                                this.f16970e = codedInputStream.readFloat();
                            } else if (readTag == 16) {
                                this.f16971f = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.f16972g = codedInputStream.readBool();
                            } else if (readTag == 34) {
                                Builder builder = this.f16973h != null ? (C6916a) this.f16973h.toBuilder() : null;
                                this.f16973h = (C6915b) codedInputStream.readMessage(C6915b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16973h);
                                    this.f16973h = (C6915b) builder.buildPartial();
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
                if (f16969j == null) {
                    synchronized (UserPreferencesProto$UserPreferences.class) {
                        if (f16969j == null) {
                            f16969j = new DefaultInstanceBasedParser(f16968i);
                        }
                    }
                }
                return f16969j;
            default:
                throw new UnsupportedOperationException();
        }
        return f16968i;
    }

    public float getBumpAccelerationThreshold() {
        return this.f16970e;
    }

    public C6915b getDescendants() {
        C6915b bVar = this.f16973h;
        return bVar == null ? C6915b.getDefaultInstance() : bVar;
    }

    public boolean getFootstepsOnboardingDone() {
        return this.f16971f;
    }

    public boolean getFootstepsStartedOnce() {
        return this.f16972g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        float f = this.f16970e;
        if (f != 0.0f) {
            i2 = 0 + CodedOutputStream.computeFloatSize(1, f);
        }
        boolean z = this.f16971f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        boolean z2 = this.f16972g;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(3, z2);
        }
        if (this.f16973h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getDescendants());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDescendants() {
        return this.f16973h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        float f = this.f16970e;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(1, f);
        }
        boolean z = this.f16971f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        boolean z2 = this.f16972g;
        if (z2) {
            codedOutputStream.writeBool(3, z2);
        }
        if (this.f16973h != null) {
            codedOutputStream.writeMessage(4, getDescendants());
        }
    }
}
