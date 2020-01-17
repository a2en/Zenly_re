package p213co.znly.models.timetogether;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory */
public final class TimeTogetherProto$FriendsPerCategory extends GeneratedMessageLite<TimeTogetherProto$FriendsPerCategory, C8426a> implements TimeTogetherProto$FriendsPerCategoryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final TimeTogetherProto$FriendsPerCategory f21351i = new TimeTogetherProto$FriendsPerCategory();

    /* renamed from: j */
    private static volatile Parser<TimeTogetherProto$FriendsPerCategory> f21352j;

    /* renamed from: e */
    private int f21353e;

    /* renamed from: f */
    private int f21354f;

    /* renamed from: g */
    private Timestamp f21355g;

    /* renamed from: h */
    private ProtobufList<C8427b> f21356h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory$FriendOrBuilder */
    public interface FriendOrBuilder extends MessageLiteOrBuilder {
        String getUserId();

        ByteString getUserIdBytes();
    }

    /* renamed from: co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory$a */
    public static final class C8426a extends Builder<TimeTogetherProto$FriendsPerCategory, C8426a> implements TimeTogetherProto$FriendsPerCategoryOrBuilder {
        /* synthetic */ C8426a(C8432a aVar) {
            this();
        }

        public Timestamp getBestSince() {
            return ((TimeTogetherProto$FriendsPerCategory) this.instance).getBestSince();
        }

        public C8433b getCategory() {
            return ((TimeTogetherProto$FriendsPerCategory) this.instance).getCategory();
        }

        public int getCategoryValue() {
            return ((TimeTogetherProto$FriendsPerCategory) this.instance).getCategoryValue();
        }

        public C8427b getSortedFriends(int i) {
            return ((TimeTogetherProto$FriendsPerCategory) this.instance).getSortedFriends(i);
        }

        public int getSortedFriendsCount() {
            return ((TimeTogetherProto$FriendsPerCategory) this.instance).getSortedFriendsCount();
        }

        public List<C8427b> getSortedFriendsList() {
            return Collections.unmodifiableList(((TimeTogetherProto$FriendsPerCategory) this.instance).getSortedFriendsList());
        }

        public boolean hasBestSince() {
            return ((TimeTogetherProto$FriendsPerCategory) this.instance).hasBestSince();
        }

        private C8426a() {
            super(TimeTogetherProto$FriendsPerCategory.f21351i);
        }
    }

    /* renamed from: co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory$b */
    public static final class C8427b extends GeneratedMessageLite<C8427b, C8428a> implements FriendOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C8427b f21357f = new C8427b();

        /* renamed from: g */
        private static volatile Parser<C8427b> f21358g;

        /* renamed from: e */
        private String f21359e = "";

        /* renamed from: co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory$b$a */
        public static final class C8428a extends Builder<C8427b, C8428a> implements FriendOrBuilder {
            /* synthetic */ C8428a(C8432a aVar) {
                this();
            }

            public String getUserId() {
                return ((C8427b) this.instance).getUserId();
            }

            public ByteString getUserIdBytes() {
                return ((C8427b) this.instance).getUserIdBytes();
            }

            private C8428a() {
                super(C8427b.f21357f);
            }
        }

        static {
            f21357f.makeImmutable();
        }

        private C8427b() {
        }

        public static Parser<C8427b> parser() {
            return f21357f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C8432a.f21379a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C8427b();
                case 2:
                    return f21357f;
                case 3:
                    return null;
                case 4:
                    return new C8428a(null);
                case 5:
                    C8427b bVar = (C8427b) obj2;
                    this.f21359e = ((Visitor) obj).visitString(!this.f21359e.isEmpty(), this.f21359e, true ^ bVar.f21359e.isEmpty(), bVar.f21359e);
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
                                    this.f21359e = codedInputStream.readStringRequireUtf8();
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
                    if (f21358g == null) {
                        synchronized (C8427b.class) {
                            if (f21358g == null) {
                                f21358g = new DefaultInstanceBasedParser(f21357f);
                            }
                        }
                    }
                    return f21358g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f21357f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f21359e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserId());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUserId() {
            return this.f21359e;
        }

        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.f21359e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f21359e.isEmpty()) {
                codedOutputStream.writeString(1, getUserId());
            }
        }
    }

    static {
        f21351i.makeImmutable();
    }

    private TimeTogetherProto$FriendsPerCategory() {
    }

    public static Parser<TimeTogetherProto$FriendsPerCategory> parser() {
        return f21351i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8432a.f21379a[methodToInvoke.ordinal()]) {
            case 1:
                return new TimeTogetherProto$FriendsPerCategory();
            case 2:
                return f21351i;
            case 3:
                this.f21356h.makeImmutable();
                return null;
            case 4:
                return new C8426a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                TimeTogetherProto$FriendsPerCategory timeTogetherProto$FriendsPerCategory = (TimeTogetherProto$FriendsPerCategory) obj2;
                boolean z2 = this.f21354f != 0;
                int i = this.f21354f;
                if (timeTogetherProto$FriendsPerCategory.f21354f != 0) {
                    z = true;
                }
                this.f21354f = visitor.visitInt(z2, i, z, timeTogetherProto$FriendsPerCategory.f21354f);
                this.f21355g = (Timestamp) visitor.visitMessage(this.f21355g, timeTogetherProto$FriendsPerCategory.f21355g);
                this.f21356h = visitor.visitList(this.f21356h, timeTogetherProto$FriendsPerCategory.f21356h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f21353e |= timeTogetherProto$FriendsPerCategory.f21353e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f21354f = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                Builder builder = this.f21355g != null ? (Timestamp.Builder) this.f21355g.toBuilder() : null;
                                this.f21355g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21355g);
                                    this.f21355g = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                if (!this.f21356h.isModifiable()) {
                                    this.f21356h = GeneratedMessageLite.mutableCopy(this.f21356h);
                                }
                                this.f21356h.add(codedInputStream.readMessage(C8427b.parser(), extensionRegistryLite));
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
                if (f21352j == null) {
                    synchronized (TimeTogetherProto$FriendsPerCategory.class) {
                        if (f21352j == null) {
                            f21352j = new DefaultInstanceBasedParser(f21351i);
                        }
                    }
                }
                return f21352j;
            default:
                throw new UnsupportedOperationException();
        }
        return f21351i;
    }

    public Timestamp getBestSince() {
        Timestamp timestamp = this.f21355g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C8433b getCategory() {
        C8433b a = C8433b.m19506a(this.f21354f);
        return a == null ? C8433b.UNRECOGNIZED : a;
    }

    public int getCategoryValue() {
        return this.f21354f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.f21354f != C8433b.UNKNOWN_CATEGORY.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f21354f) + 0 : 0;
        if (this.f21355g != null) {
            computeEnumSize += CodedOutputStream.computeMessageSize(2, getBestSince());
        }
        for (int i2 = 0; i2 < this.f21356h.size(); i2++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f21356h.get(i2));
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    public C8427b getSortedFriends(int i) {
        return (C8427b) this.f21356h.get(i);
    }

    public int getSortedFriendsCount() {
        return this.f21356h.size();
    }

    public List<C8427b> getSortedFriendsList() {
        return this.f21356h;
    }

    public boolean hasBestSince() {
        return this.f21355g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21354f != C8433b.UNKNOWN_CATEGORY.getNumber()) {
            codedOutputStream.writeEnum(1, this.f21354f);
        }
        if (this.f21355g != null) {
            codedOutputStream.writeMessage(2, getBestSince());
        }
        for (int i = 0; i < this.f21356h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f21356h.get(i));
        }
    }
}
