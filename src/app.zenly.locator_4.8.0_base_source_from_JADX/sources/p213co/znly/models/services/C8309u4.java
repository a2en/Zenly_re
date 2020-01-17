package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7402n2;
import p213co.znly.models.C7402n2.C7403a;
import p213co.znly.models.UserPreferencesProto$UserPreferences;
import p213co.znly.models.UserPreferencesProto$UserPreferences.C6914a;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.C8254r1.C8255a;
import p213co.znly.models.services.C8275s4.C8276a;

/* renamed from: co.znly.models.services.u4 */
public final class C8309u4 extends GeneratedMessageLite<C8309u4, C8310a> implements ZenlyProto$SessionVerifyResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8309u4 f21007k = new C8309u4();

    /* renamed from: l */
    private static volatile Parser<C8309u4> f21008l;

    /* renamed from: e */
    private C7402n2 f21009e;

    /* renamed from: f */
    private UserPreferencesProto$UserPreferences f21010f;

    /* renamed from: g */
    private C8254r1 f21011g;

    /* renamed from: h */
    private UserProto$User f21012h;

    /* renamed from: i */
    private boolean f21013i;

    /* renamed from: j */
    private C8275s4 f21014j;

    /* renamed from: co.znly.models.services.u4$a */
    public static final class C8310a extends Builder<C8309u4, C8310a> implements ZenlyProto$SessionVerifyResponseOrBuilder {
        /* synthetic */ C8310a(C8104i0 i0Var) {
            this();
        }

        public C8254r1 getConfiguration() {
            return ((C8309u4) this.instance).getConfiguration();
        }

        public C8275s4 getError() {
            return ((C8309u4) this.instance).getError();
        }

        public boolean getForcedOnboardingEnabled() {
            return ((C8309u4) this.instance).getForcedOnboardingEnabled();
        }

        public UserProto$User getMe() {
            return ((C8309u4) this.instance).getMe();
        }

        public C7402n2 getSession() {
            return ((C8309u4) this.instance).getSession();
        }

        public UserPreferencesProto$UserPreferences getUserPreferences() {
            return ((C8309u4) this.instance).getUserPreferences();
        }

        public boolean hasConfiguration() {
            return ((C8309u4) this.instance).hasConfiguration();
        }

        public boolean hasError() {
            return ((C8309u4) this.instance).hasError();
        }

        public boolean hasMe() {
            return ((C8309u4) this.instance).hasMe();
        }

        public boolean hasSession() {
            return ((C8309u4) this.instance).hasSession();
        }

        public boolean hasUserPreferences() {
            return ((C8309u4) this.instance).hasUserPreferences();
        }

        private C8310a() {
            super(C8309u4.f21007k);
        }
    }

    static {
        f21007k.makeImmutable();
    }

    private C8309u4() {
    }

    public static C8310a newBuilder() {
        return (C8310a) f21007k.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8309u4();
            case 2:
                return f21007k;
            case 3:
                return null;
            case 4:
                return new C8310a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8309u4 u4Var = (C8309u4) obj2;
                this.f21009e = (C7402n2) visitor.visitMessage(this.f21009e, u4Var.f21009e);
                this.f21010f = (UserPreferencesProto$UserPreferences) visitor.visitMessage(this.f21010f, u4Var.f21010f);
                this.f21011g = (C8254r1) visitor.visitMessage(this.f21011g, u4Var.f21011g);
                this.f21012h = (UserProto$User) visitor.visitMessage(this.f21012h, u4Var.f21012h);
                boolean z = this.f21013i;
                boolean z2 = u4Var.f21013i;
                this.f21013i = visitor.visitBoolean(z, z, z2, z2);
                this.f21014j = (C8275s4) visitor.visitMessage(this.f21014j, u4Var.f21014j);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f21009e != null ? (C7403a) this.f21009e.toBuilder() : null;
                                this.f21009e = (C7402n2) codedInputStream.readMessage(C7402n2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21009e);
                                    this.f21009e = (C7402n2) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f21010f != null ? (C6914a) this.f21010f.toBuilder() : null;
                                this.f21010f = (UserPreferencesProto$UserPreferences) codedInputStream.readMessage(UserPreferencesProto$UserPreferences.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f21010f);
                                    this.f21010f = (UserPreferencesProto$UserPreferences) builder2.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f21013i = codedInputStream.readBool();
                            } else if (readTag == 42) {
                                Builder builder3 = this.f21011g != null ? (C8255a) this.f21011g.toBuilder() : null;
                                this.f21011g = (C8254r1) codedInputStream.readMessage(C8254r1.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f21011g);
                                    this.f21011g = (C8254r1) builder3.buildPartial();
                                }
                            } else if (readTag == 50) {
                                Builder builder4 = this.f21012h != null ? (C6925a) this.f21012h.toBuilder() : null;
                                this.f21012h = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f21012h);
                                    this.f21012h = (UserProto$User) builder4.buildPartial();
                                }
                            } else if (readTag == 1010) {
                                Builder builder5 = this.f21014j != null ? (C8276a) this.f21014j.toBuilder() : null;
                                this.f21014j = (C8275s4) codedInputStream.readMessage(C8275s4.parser(), extensionRegistryLite);
                                if (builder5 != null) {
                                    builder5.mergeFrom(this.f21014j);
                                    this.f21014j = (C8275s4) builder5.buildPartial();
                                }
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f21008l == null) {
                    synchronized (C8309u4.class) {
                        if (f21008l == null) {
                            f21008l = new DefaultInstanceBasedParser(f21007k);
                        }
                    }
                }
                return f21008l;
            default:
                throw new UnsupportedOperationException();
        }
        return f21007k;
    }

    public C8254r1 getConfiguration() {
        C8254r1 r1Var = this.f21011g;
        return r1Var == null ? C8254r1.getDefaultInstance() : r1Var;
    }

    public C8275s4 getError() {
        C8275s4 s4Var = this.f21014j;
        return s4Var == null ? C8275s4.getDefaultInstance() : s4Var;
    }

    public boolean getForcedOnboardingEnabled() {
        return this.f21013i;
    }

    public UserProto$User getMe() {
        UserProto$User userProto$User = this.f21012h;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21009e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getSession());
        }
        if (this.f21010f != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getUserPreferences());
        }
        boolean z = this.f21013i;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(4, z);
        }
        if (this.f21011g != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getConfiguration());
        }
        if (this.f21012h != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getMe());
        }
        if (this.f21014j != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7402n2 getSession() {
        C7402n2 n2Var = this.f21009e;
        return n2Var == null ? C7402n2.getDefaultInstance() : n2Var;
    }

    public UserPreferencesProto$UserPreferences getUserPreferences() {
        UserPreferencesProto$UserPreferences userPreferencesProto$UserPreferences = this.f21010f;
        return userPreferencesProto$UserPreferences == null ? UserPreferencesProto$UserPreferences.getDefaultInstance() : userPreferencesProto$UserPreferences;
    }

    public boolean hasConfiguration() {
        return this.f21011g != null;
    }

    public boolean hasError() {
        return this.f21014j != null;
    }

    public boolean hasMe() {
        return this.f21012h != null;
    }

    public boolean hasSession() {
        return this.f21009e != null;
    }

    public boolean hasUserPreferences() {
        return this.f21010f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21009e != null) {
            codedOutputStream.writeMessage(1, getSession());
        }
        if (this.f21010f != null) {
            codedOutputStream.writeMessage(3, getUserPreferences());
        }
        boolean z = this.f21013i;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        if (this.f21011g != null) {
            codedOutputStream.writeMessage(5, getConfiguration());
        }
        if (this.f21012h != null) {
            codedOutputStream.writeMessage(6, getMe());
        }
        if (this.f21014j != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
