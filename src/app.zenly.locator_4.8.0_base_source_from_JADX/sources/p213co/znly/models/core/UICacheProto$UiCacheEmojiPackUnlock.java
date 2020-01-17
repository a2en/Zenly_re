package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.UICacheProto$UiCacheEmojiPackUnlock */
public final class UICacheProto$UiCacheEmojiPackUnlock extends GeneratedMessageLite<UICacheProto$UiCacheEmojiPackUnlock, C7046a> implements UICacheProto$UiCacheEmojiPackUnlockOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final UICacheProto$UiCacheEmojiPackUnlock f17431f = new UICacheProto$UiCacheEmojiPackUnlock();

    /* renamed from: g */
    private static volatile Parser<UICacheProto$UiCacheEmojiPackUnlock> f17432g;

    /* renamed from: e */
    private ProtobufList<C7047b> f17433e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.UICacheProto$UiCacheEmojiPackUnlock$PackUnlockOrBuilder */
    public interface PackUnlockOrBuilder extends MessageLiteOrBuilder {
        String getPackUuid();

        ByteString getPackUuidBytes();

        Timestamp getUnlockedAt();

        boolean hasUnlockedAt();
    }

    /* renamed from: co.znly.models.core.UICacheProto$UiCacheEmojiPackUnlock$a */
    public static final class C7046a extends Builder<UICacheProto$UiCacheEmojiPackUnlock, C7046a> implements UICacheProto$UiCacheEmojiPackUnlockOrBuilder {
        /* synthetic */ C7046a(C7240v2 v2Var) {
            this();
        }

        public C7047b getUnlockedPacks(int i) {
            return ((UICacheProto$UiCacheEmojiPackUnlock) this.instance).getUnlockedPacks(i);
        }

        public int getUnlockedPacksCount() {
            return ((UICacheProto$UiCacheEmojiPackUnlock) this.instance).getUnlockedPacksCount();
        }

        public List<C7047b> getUnlockedPacksList() {
            return Collections.unmodifiableList(((UICacheProto$UiCacheEmojiPackUnlock) this.instance).getUnlockedPacksList());
        }

        private C7046a() {
            super(UICacheProto$UiCacheEmojiPackUnlock.f17431f);
        }
    }

    /* renamed from: co.znly.models.core.UICacheProto$UiCacheEmojiPackUnlock$b */
    public static final class C7047b extends GeneratedMessageLite<C7047b, C7048a> implements PackUnlockOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C7047b f17434g = new C7047b();

        /* renamed from: h */
        private static volatile Parser<C7047b> f17435h;

        /* renamed from: e */
        private String f17436e = "";

        /* renamed from: f */
        private Timestamp f17437f;

        /* renamed from: co.znly.models.core.UICacheProto$UiCacheEmojiPackUnlock$b$a */
        public static final class C7048a extends Builder<C7047b, C7048a> implements PackUnlockOrBuilder {
            /* synthetic */ C7048a(C7240v2 v2Var) {
                this();
            }

            public String getPackUuid() {
                return ((C7047b) this.instance).getPackUuid();
            }

            public ByteString getPackUuidBytes() {
                return ((C7047b) this.instance).getPackUuidBytes();
            }

            public Timestamp getUnlockedAt() {
                return ((C7047b) this.instance).getUnlockedAt();
            }

            public boolean hasUnlockedAt() {
                return ((C7047b) this.instance).hasUnlockedAt();
            }

            private C7048a() {
                super(C7047b.f17434g);
            }
        }

        static {
            f17434g.makeImmutable();
        }

        private C7047b() {
        }

        public static Parser<C7047b> parser() {
            return f17434g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7240v2.f17964a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7047b();
                case 2:
                    return f17434g;
                case 3:
                    return null;
                case 4:
                    return new C7048a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C7047b bVar = (C7047b) obj2;
                    this.f17436e = visitor.visitString(!this.f17436e.isEmpty(), this.f17436e, true ^ bVar.f17436e.isEmpty(), bVar.f17436e);
                    this.f17437f = (Timestamp) visitor.visitMessage(this.f17437f, bVar.f17437f);
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
                                    this.f17436e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    Builder builder = this.f17437f != null ? (Timestamp.Builder) this.f17437f.toBuilder() : null;
                                    this.f17437f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f17437f);
                                        this.f17437f = (Timestamp) builder.buildPartial();
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
                    if (f17435h == null) {
                        synchronized (C7047b.class) {
                            if (f17435h == null) {
                                f17435h = new DefaultInstanceBasedParser(f17434g);
                            }
                        }
                    }
                    return f17435h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17434g;
        }

        public String getPackUuid() {
            return this.f17436e;
        }

        public ByteString getPackUuidBytes() {
            return ByteString.copyFromUtf8(this.f17436e);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17436e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getPackUuid());
            }
            if (this.f17437f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getUnlockedAt());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getUnlockedAt() {
            Timestamp timestamp = this.f17437f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasUnlockedAt() {
            return this.f17437f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17436e.isEmpty()) {
                codedOutputStream.writeString(1, getPackUuid());
            }
            if (this.f17437f != null) {
                codedOutputStream.writeMessage(2, getUnlockedAt());
            }
        }
    }

    static {
        f17431f.makeImmutable();
    }

    private UICacheProto$UiCacheEmojiPackUnlock() {
    }

    public static C7046a newBuilder() {
        return (C7046a) f17431f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7240v2.f17964a[methodToInvoke.ordinal()]) {
            case 1:
                return new UICacheProto$UiCacheEmojiPackUnlock();
            case 2:
                return f17431f;
            case 3:
                this.f17433e.makeImmutable();
                return null;
            case 4:
                return new C7046a(null);
            case 5:
                this.f17433e = ((Visitor) obj).visitList(this.f17433e, ((UICacheProto$UiCacheEmojiPackUnlock) obj2).f17433e);
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
                                if (!this.f17433e.isModifiable()) {
                                    this.f17433e = GeneratedMessageLite.mutableCopy(this.f17433e);
                                }
                                this.f17433e.add(codedInputStream.readMessage(C7047b.parser(), extensionRegistryLite));
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
                if (f17432g == null) {
                    synchronized (UICacheProto$UiCacheEmojiPackUnlock.class) {
                        if (f17432g == null) {
                            f17432g = new DefaultInstanceBasedParser(f17431f);
                        }
                    }
                }
                return f17432g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17431f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17433e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17433e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7047b getUnlockedPacks(int i) {
        return (C7047b) this.f17433e.get(i);
    }

    public int getUnlockedPacksCount() {
        return this.f17433e.size();
    }

    public List<C7047b> getUnlockedPacksList() {
        return this.f17433e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17433e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17433e.get(i));
        }
    }
}
