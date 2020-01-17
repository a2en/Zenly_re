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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.TrackingContextProto$TrackingContext.C6884d;

/* renamed from: co.znly.models.PublicShareProto$PublicShare */
public final class PublicShareProto$PublicShare extends GeneratedMessageLite<PublicShareProto$PublicShare, C6853a> implements PublicShareProto$PublicShareOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final PublicShareProto$PublicShare f16721p = new PublicShareProto$PublicShare();

    /* renamed from: q */
    private static volatile Parser<PublicShareProto$PublicShare> f16722q;

    /* renamed from: e */
    private int f16723e;

    /* renamed from: f */
    private String f16724f;

    /* renamed from: g */
    private Timestamp f16725g;

    /* renamed from: h */
    private Timestamp f16726h;

    /* renamed from: i */
    private String f16727i;

    /* renamed from: j */
    private Timestamp f16728j;

    /* renamed from: k */
    private Timestamp f16729k;

    /* renamed from: l */
    private TrackingContextProto$TrackingContext f16730l;

    /* renamed from: m */
    private String f16731m;

    /* renamed from: n */
    private String f16732n;

    /* renamed from: o */
    private ProtobufList<C6854b> f16733o = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.PublicShareProto$PublicShare$MetadataOrBuilder */
    public interface MetadataOrBuilder extends MessageLiteOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        String getUuid();

        ByteString getUuidBytes();

        ByteString getValue();
    }

    /* renamed from: co.znly.models.PublicShareProto$PublicShare$a */
    public static final class C6853a extends Builder<PublicShareProto$PublicShare, C6853a> implements PublicShareProto$PublicShareOrBuilder {
        /* synthetic */ C6853a(C7301f2 f2Var) {
            this();
        }

        public Timestamp getCreatedAt() {
            return ((PublicShareProto$PublicShare) this.instance).getCreatedAt();
        }

        public Timestamp getInvalidUntil() {
            return ((PublicShareProto$PublicShare) this.instance).getInvalidUntil();
        }

        public String getMessage() {
            return ((PublicShareProto$PublicShare) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((PublicShareProto$PublicShare) this.instance).getMessageBytes();
        }

        public C6854b getMetadata(int i) {
            return ((PublicShareProto$PublicShare) this.instance).getMetadata(i);
        }

        public int getMetadataCount() {
            return ((PublicShareProto$PublicShare) this.instance).getMetadataCount();
        }

        public List<C6854b> getMetadataList() {
            return Collections.unmodifiableList(((PublicShareProto$PublicShare) this.instance).getMetadataList());
        }

        public TrackingContextProto$TrackingContext getTrackingContext() {
            return ((PublicShareProto$PublicShare) this.instance).getTrackingContext();
        }

        public Timestamp getUpdatedAt() {
            return ((PublicShareProto$PublicShare) this.instance).getUpdatedAt();
        }

        public String getUrl() {
            return ((PublicShareProto$PublicShare) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((PublicShareProto$PublicShare) this.instance).getUrlBytes();
        }

        public String getUserUuid() {
            return ((PublicShareProto$PublicShare) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((PublicShareProto$PublicShare) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((PublicShareProto$PublicShare) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((PublicShareProto$PublicShare) this.instance).getUuidBytes();
        }

        public Timestamp getValidUntil() {
            return ((PublicShareProto$PublicShare) this.instance).getValidUntil();
        }

        public boolean hasCreatedAt() {
            return ((PublicShareProto$PublicShare) this.instance).hasCreatedAt();
        }

        public boolean hasInvalidUntil() {
            return ((PublicShareProto$PublicShare) this.instance).hasInvalidUntil();
        }

        public boolean hasTrackingContext() {
            return ((PublicShareProto$PublicShare) this.instance).hasTrackingContext();
        }

        public boolean hasUpdatedAt() {
            return ((PublicShareProto$PublicShare) this.instance).hasUpdatedAt();
        }

        public boolean hasValidUntil() {
            return ((PublicShareProto$PublicShare) this.instance).hasValidUntil();
        }

        private C6853a() {
            super(PublicShareProto$PublicShare.f16721p);
        }
    }

    /* renamed from: co.znly.models.PublicShareProto$PublicShare$b */
    public static final class C6854b extends GeneratedMessageLite<C6854b, C6855a> implements MetadataOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6854b f16734h = new C6854b();

        /* renamed from: i */
        private static volatile Parser<C6854b> f16735i;

        /* renamed from: e */
        private String f16736e;

        /* renamed from: f */
        private String f16737f;

        /* renamed from: g */
        private ByteString f16738g = ByteString.EMPTY;

        /* renamed from: co.znly.models.PublicShareProto$PublicShare$b$a */
        public static final class C6855a extends Builder<C6854b, C6855a> implements MetadataOrBuilder {
            /* synthetic */ C6855a(C7301f2 f2Var) {
                this();
            }

            public String getKey() {
                return ((C6854b) this.instance).getKey();
            }

            public ByteString getKeyBytes() {
                return ((C6854b) this.instance).getKeyBytes();
            }

            public String getUuid() {
                return ((C6854b) this.instance).getUuid();
            }

            public ByteString getUuidBytes() {
                return ((C6854b) this.instance).getUuidBytes();
            }

            public ByteString getValue() {
                return ((C6854b) this.instance).getValue();
            }

            private C6855a() {
                super(C6854b.f16734h);
            }
        }

        static {
            f16734h.makeImmutable();
        }

        private C6854b() {
            String str = "";
            this.f16736e = str;
            this.f16737f = str;
        }

        public static Parser<C6854b> parser() {
            return f16734h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7301f2.f18122a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6854b();
                case 2:
                    return f16734h;
                case 3:
                    return null;
                case 4:
                    return new C6855a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6854b bVar = (C6854b) obj2;
                    this.f16736e = visitor.visitString(!this.f16736e.isEmpty(), this.f16736e, !bVar.f16736e.isEmpty(), bVar.f16736e);
                    this.f16737f = visitor.visitString(!this.f16737f.isEmpty(), this.f16737f, !bVar.f16737f.isEmpty(), bVar.f16737f);
                    boolean z2 = this.f16738g != ByteString.EMPTY;
                    ByteString byteString = this.f16738g;
                    if (bVar.f16738g != ByteString.EMPTY) {
                        z = true;
                    }
                    this.f16738g = visitor.visitByteString(z2, byteString, z, bVar.f16738g);
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
                                    this.f16736e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.f16737f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f16738g = codedInputStream.readBytes();
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
                    if (f16735i == null) {
                        synchronized (C6854b.class) {
                            if (f16735i == null) {
                                f16735i = new DefaultInstanceBasedParser(f16734h);
                            }
                        }
                    }
                    return f16735i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16734h;
        }

        public String getKey() {
            return this.f16737f;
        }

        public ByteString getKeyBytes() {
            return ByteString.copyFromUtf8(this.f16737f);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f16736e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
            }
            if (!this.f16737f.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(2, getKey());
            }
            if (!this.f16738g.isEmpty()) {
                i2 += CodedOutputStream.computeBytesSize(3, this.f16738g);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUuid() {
            return this.f16736e;
        }

        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.f16736e);
        }

        public ByteString getValue() {
            return this.f16738g;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f16736e.isEmpty()) {
                codedOutputStream.writeString(1, getUuid());
            }
            if (!this.f16737f.isEmpty()) {
                codedOutputStream.writeString(2, getKey());
            }
            if (!this.f16738g.isEmpty()) {
                codedOutputStream.writeBytes(3, this.f16738g);
            }
        }
    }

    static {
        f16721p.makeImmutable();
    }

    private PublicShareProto$PublicShare() {
        String str = "";
        this.f16724f = str;
        this.f16727i = str;
        this.f16731m = str;
        this.f16732n = str;
    }

    public static PublicShareProto$PublicShare getDefaultInstance() {
        return f16721p;
    }

    public static Parser<PublicShareProto$PublicShare> parser() {
        return f16721p.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7301f2.f18122a[methodToInvoke.ordinal()]) {
            case 1:
                return new PublicShareProto$PublicShare();
            case 2:
                return f16721p;
            case 3:
                this.f16733o.makeImmutable();
                return null;
            case 4:
                return new C6853a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                PublicShareProto$PublicShare publicShareProto$PublicShare = (PublicShareProto$PublicShare) obj2;
                this.f16724f = visitor.visitString(!this.f16724f.isEmpty(), this.f16724f, !publicShareProto$PublicShare.f16724f.isEmpty(), publicShareProto$PublicShare.f16724f);
                this.f16725g = (Timestamp) visitor.visitMessage(this.f16725g, publicShareProto$PublicShare.f16725g);
                this.f16726h = (Timestamp) visitor.visitMessage(this.f16726h, publicShareProto$PublicShare.f16726h);
                this.f16727i = visitor.visitString(!this.f16727i.isEmpty(), this.f16727i, !publicShareProto$PublicShare.f16727i.isEmpty(), publicShareProto$PublicShare.f16727i);
                this.f16728j = (Timestamp) visitor.visitMessage(this.f16728j, publicShareProto$PublicShare.f16728j);
                this.f16729k = (Timestamp) visitor.visitMessage(this.f16729k, publicShareProto$PublicShare.f16729k);
                this.f16730l = (TrackingContextProto$TrackingContext) visitor.visitMessage(this.f16730l, publicShareProto$PublicShare.f16730l);
                this.f16731m = visitor.visitString(!this.f16731m.isEmpty(), this.f16731m, !publicShareProto$PublicShare.f16731m.isEmpty(), publicShareProto$PublicShare.f16731m);
                this.f16732n = visitor.visitString(!this.f16732n.isEmpty(), this.f16732n, true ^ publicShareProto$PublicShare.f16732n.isEmpty(), publicShareProto$PublicShare.f16732n);
                this.f16733o = visitor.visitList(this.f16733o, publicShareProto$PublicShare.f16733o);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16723e |= publicShareProto$PublicShare.f16723e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f16724f = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f16725g != null ? (Timestamp.Builder) this.f16725g.toBuilder() : null;
                                this.f16725g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f16725g);
                                    this.f16725g = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f16727i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                Builder builder2 = this.f16728j != null ? (Timestamp.Builder) this.f16728j.toBuilder() : null;
                                this.f16728j = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f16728j);
                                    this.f16728j = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 42:
                                Builder builder3 = this.f16730l != null ? (C6884d) this.f16730l.toBuilder() : null;
                                this.f16730l = (TrackingContextProto$TrackingContext) codedInputStream.readMessage(TrackingContextProto$TrackingContext.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f16730l);
                                    this.f16730l = (TrackingContextProto$TrackingContext) builder3.buildPartial();
                                    break;
                                }
                            case 50:
                                this.f16731m = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.f16732n = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                Builder builder4 = this.f16729k != null ? (Timestamp.Builder) this.f16729k.toBuilder() : null;
                                this.f16729k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f16729k);
                                    this.f16729k = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 74:
                                if (!this.f16733o.isModifiable()) {
                                    this.f16733o = GeneratedMessageLite.mutableCopy(this.f16733o);
                                }
                                this.f16733o.add(codedInputStream.readMessage(C6854b.parser(), extensionRegistryLite));
                                break;
                            case 82:
                                Builder builder5 = this.f16726h != null ? (Timestamp.Builder) this.f16726h.toBuilder() : null;
                                this.f16726h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f16726h);
                                    this.f16726h = (Timestamp) builder5.buildPartial();
                                    break;
                                }
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f16722q == null) {
                    synchronized (PublicShareProto$PublicShare.class) {
                        if (f16722q == null) {
                            f16722q = new DefaultInstanceBasedParser(f16721p);
                        }
                    }
                }
                return f16722q;
            default:
                throw new UnsupportedOperationException();
        }
        return f16721p;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f16725g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getInvalidUntil() {
        Timestamp timestamp = this.f16729k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getMessage() {
        return this.f16732n;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f16732n);
    }

    public C6854b getMetadata(int i) {
        return (C6854b) this.f16733o.get(i);
    }

    public int getMetadataCount() {
        return this.f16733o.size();
    }

    public List<C6854b> getMetadataList() {
        return this.f16733o;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f16724f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f16725g != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f16727i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        if (this.f16728j != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, getValidUntil());
        }
        if (this.f16730l != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, getTrackingContext());
        }
        if (!this.f16731m.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, getUrl());
        }
        if (!this.f16732n.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, getMessage());
        }
        if (this.f16729k != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(8, getInvalidUntil());
        }
        for (int i2 = 0; i2 < this.f16733o.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f16733o.get(i2));
        }
        if (this.f16726h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(10, getUpdatedAt());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public TrackingContextProto$TrackingContext getTrackingContext() {
        TrackingContextProto$TrackingContext trackingContextProto$TrackingContext = this.f16730l;
        return trackingContextProto$TrackingContext == null ? TrackingContextProto$TrackingContext.getDefaultInstance() : trackingContextProto$TrackingContext;
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f16726h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUrl() {
        return this.f16731m;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.f16731m);
    }

    public String getUserUuid() {
        return this.f16727i;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f16727i);
    }

    public String getUuid() {
        return this.f16724f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f16724f);
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f16728j;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasCreatedAt() {
        return this.f16725g != null;
    }

    public boolean hasInvalidUntil() {
        return this.f16729k != null;
    }

    public boolean hasTrackingContext() {
        return this.f16730l != null;
    }

    public boolean hasUpdatedAt() {
        return this.f16726h != null;
    }

    public boolean hasValidUntil() {
        return this.f16728j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16724f.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f16725g != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f16727i.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        if (this.f16728j != null) {
            codedOutputStream.writeMessage(4, getValidUntil());
        }
        if (this.f16730l != null) {
            codedOutputStream.writeMessage(5, getTrackingContext());
        }
        if (!this.f16731m.isEmpty()) {
            codedOutputStream.writeString(6, getUrl());
        }
        if (!this.f16732n.isEmpty()) {
            codedOutputStream.writeString(7, getMessage());
        }
        if (this.f16729k != null) {
            codedOutputStream.writeMessage(8, getInvalidUntil());
        }
        for (int i = 0; i < this.f16733o.size(); i++) {
            codedOutputStream.writeMessage(9, (MessageLite) this.f16733o.get(i));
        }
        if (this.f16726h != null) {
            codedOutputStream.writeMessage(10, getUpdatedAt());
        }
    }
}
