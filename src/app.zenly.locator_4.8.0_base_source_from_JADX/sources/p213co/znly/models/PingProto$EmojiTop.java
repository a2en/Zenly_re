package p213co.znly.models;

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

/* renamed from: co.znly.models.PingProto$EmojiTop */
public final class PingProto$EmojiTop extends GeneratedMessageLite<PingProto$EmojiTop, C6820a> implements PingProto$EmojiTopOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final PingProto$EmojiTop f16610f = new PingProto$EmojiTop();

    /* renamed from: g */
    private static volatile Parser<PingProto$EmojiTop> f16611g;

    /* renamed from: e */
    private ProtobufList<C6821b> f16612e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.PingProto$EmojiTop$ScoreOrBuilder */
    public interface ScoreOrBuilder extends MessageLiteOrBuilder {
        String getEmojiUuid();

        ByteString getEmojiUuidBytes();

        long getScore();
    }

    /* renamed from: co.znly.models.PingProto$EmojiTop$a */
    public static final class C6820a extends Builder<PingProto$EmojiTop, C6820a> implements PingProto$EmojiTopOrBuilder {
        /* synthetic */ C6820a(C7383l1 l1Var) {
            this();
        }

        public C6821b getScores(int i) {
            return ((PingProto$EmojiTop) this.instance).getScores(i);
        }

        public int getScoresCount() {
            return ((PingProto$EmojiTop) this.instance).getScoresCount();
        }

        public List<C6821b> getScoresList() {
            return Collections.unmodifiableList(((PingProto$EmojiTop) this.instance).getScoresList());
        }

        private C6820a() {
            super(PingProto$EmojiTop.f16610f);
        }
    }

    /* renamed from: co.znly.models.PingProto$EmojiTop$b */
    public static final class C6821b extends GeneratedMessageLite<C6821b, C6822a> implements ScoreOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6821b f16613g = new C6821b();

        /* renamed from: h */
        private static volatile Parser<C6821b> f16614h;

        /* renamed from: e */
        private String f16615e = "";

        /* renamed from: f */
        private long f16616f;

        /* renamed from: co.znly.models.PingProto$EmojiTop$b$a */
        public static final class C6822a extends Builder<C6821b, C6822a> implements ScoreOrBuilder {
            /* synthetic */ C6822a(C7383l1 l1Var) {
                this();
            }

            public String getEmojiUuid() {
                return ((C6821b) this.instance).getEmojiUuid();
            }

            public ByteString getEmojiUuidBytes() {
                return ((C6821b) this.instance).getEmojiUuidBytes();
            }

            public long getScore() {
                return ((C6821b) this.instance).getScore();
            }

            private C6822a() {
                super(C6821b.f16613g);
            }
        }

        static {
            f16613g.makeImmutable();
        }

        private C6821b() {
        }

        public static Parser<C6821b> parser() {
            return f16613g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6821b();
                case 2:
                    return f16613g;
                case 3:
                    return null;
                case 4:
                    return new C6822a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6821b bVar = (C6821b) obj2;
                    this.f16615e = visitor.visitString(!this.f16615e.isEmpty(), this.f16615e, !bVar.f16615e.isEmpty(), bVar.f16615e);
                    this.f16616f = visitor.visitLong(this.f16616f != 0, this.f16616f, bVar.f16616f != 0, bVar.f16616f);
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
                                    this.f16615e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f16616f = codedInputStream.readInt64();
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
                    if (f16614h == null) {
                        synchronized (C6821b.class) {
                            if (f16614h == null) {
                                f16614h = new DefaultInstanceBasedParser(f16613g);
                            }
                        }
                    }
                    return f16614h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16613g;
        }

        public String getEmojiUuid() {
            return this.f16615e;
        }

        public ByteString getEmojiUuidBytes() {
            return ByteString.copyFromUtf8(this.f16615e);
        }

        public long getScore() {
            return this.f16616f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f16615e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getEmojiUuid());
            }
            long j = this.f16616f;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(2, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f16615e.isEmpty()) {
                codedOutputStream.writeString(1, getEmojiUuid());
            }
            long j = this.f16616f;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
        }
    }

    static {
        f16610f.makeImmutable();
    }

    private PingProto$EmojiTop() {
    }

    public static PingProto$EmojiTop getDefaultInstance() {
        return f16610f;
    }

    public static Parser<PingProto$EmojiTop> parser() {
        return f16610f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new PingProto$EmojiTop();
            case 2:
                return f16610f;
            case 3:
                this.f16612e.makeImmutable();
                return null;
            case 4:
                return new C6820a(null);
            case 5:
                this.f16612e = ((Visitor) obj).visitList(this.f16612e, ((PingProto$EmojiTop) obj2).f16612e);
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
                                if (!this.f16612e.isModifiable()) {
                                    this.f16612e = GeneratedMessageLite.mutableCopy(this.f16612e);
                                }
                                this.f16612e.add(codedInputStream.readMessage(C6821b.parser(), extensionRegistryLite));
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
                if (f16611g == null) {
                    synchronized (PingProto$EmojiTop.class) {
                        if (f16611g == null) {
                            f16611g = new DefaultInstanceBasedParser(f16610f);
                        }
                    }
                }
                return f16611g;
            default:
                throw new UnsupportedOperationException();
        }
        return f16610f;
    }

    public C6821b getScores(int i) {
        return (C6821b) this.f16612e.get(i);
    }

    public int getScoresCount() {
        return this.f16612e.size();
    }

    public List<C6821b> getScoresList() {
        return this.f16612e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16612e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f16612e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f16612e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f16612e.get(i));
        }
    }
}
