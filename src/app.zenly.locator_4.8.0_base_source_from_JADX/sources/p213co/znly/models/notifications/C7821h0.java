package p213co.znly.models.notifications;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C7468s2;
import p213co.znly.models.C7468s2.C7470b;
import p213co.znly.wakeup.C8457b;

/* renamed from: co.znly.models.notifications.h0 */
public final class C7821h0 extends GeneratedMessageLite<C7821h0, C7822a> implements NotificationProto$TrackingContextRequestNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7821h0 f19544j = new C7821h0();

    /* renamed from: k */
    private static volatile Parser<C7821h0> f19545k;

    /* renamed from: e */
    private int f19546e;

    /* renamed from: f */
    private String f19547f = "";

    /* renamed from: g */
    private ProtobufList<String> f19548g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private C7468s2 f19549h;

    /* renamed from: i */
    private int f19550i;

    /* renamed from: co.znly.models.notifications.h0$a */
    public static final class C7822a extends Builder<C7821h0, C7822a> implements NotificationProto$TrackingContextRequestNotificationOrBuilder {
        /* synthetic */ C7822a(C7790a aVar) {
            this();
        }

        public C8457b getAction() {
            return ((C7821h0) this.instance).getAction();
        }

        public int getActionValue() {
            return ((C7821h0) this.instance).getActionValue();
        }

        public String getPushId() {
            return ((C7821h0) this.instance).getPushId();
        }

        public ByteString getPushIdBytes() {
            return ((C7821h0) this.instance).getPushIdBytes();
        }

        public C7468s2 getSpanContext() {
            return ((C7821h0) this.instance).getSpanContext();
        }

        public String getWatcherUuids(int i) {
            return ((C7821h0) this.instance).getWatcherUuids(i);
        }

        public ByteString getWatcherUuidsBytes(int i) {
            return ((C7821h0) this.instance).getWatcherUuidsBytes(i);
        }

        public int getWatcherUuidsCount() {
            return ((C7821h0) this.instance).getWatcherUuidsCount();
        }

        public List<String> getWatcherUuidsList() {
            return Collections.unmodifiableList(((C7821h0) this.instance).getWatcherUuidsList());
        }

        public boolean hasSpanContext() {
            return ((C7821h0) this.instance).hasSpanContext();
        }

        private C7822a() {
            super(C7821h0.f19544j);
        }
    }

    static {
        f19544j.makeImmutable();
    }

    private C7821h0() {
    }

    public static C7821h0 getDefaultInstance() {
        return f19544j;
    }

    public static Parser<C7821h0> parser() {
        return f19544j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7821h0();
            case 2:
                return f19544j;
            case 3:
                this.f19548g.makeImmutable();
                return null;
            case 4:
                return new C7822a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7821h0 h0Var = (C7821h0) obj2;
                this.f19547f = visitor.visitString(!this.f19547f.isEmpty(), this.f19547f, !h0Var.f19547f.isEmpty(), h0Var.f19547f);
                this.f19548g = visitor.visitList(this.f19548g, h0Var.f19548g);
                this.f19549h = (C7468s2) visitor.visitMessage(this.f19549h, h0Var.f19549h);
                boolean z2 = this.f19550i != 0;
                int i = this.f19550i;
                if (h0Var.f19550i != 0) {
                    z = true;
                }
                this.f19550i = visitor.visitInt(z2, i, z, h0Var.f19550i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f19546e |= h0Var.f19546e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 18) {
                                this.f19547f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f19548g.isModifiable()) {
                                    this.f19548g = GeneratedMessageLite.mutableCopy(this.f19548g);
                                }
                                this.f19548g.add(readStringRequireUtf8);
                            } else if (readTag == 34) {
                                Builder builder = this.f19549h != null ? (C7470b) this.f19549h.toBuilder() : null;
                                this.f19549h = (C7468s2) codedInputStream.readMessage(C7468s2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19549h);
                                    this.f19549h = (C7468s2) builder.buildPartial();
                                }
                            } else if (readTag == 40) {
                                this.f19550i = codedInputStream.readEnum();
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
                if (f19545k == null) {
                    synchronized (C7821h0.class) {
                        if (f19545k == null) {
                            f19545k = new DefaultInstanceBasedParser(f19544j);
                        }
                    }
                }
                return f19545k;
            default:
                throw new UnsupportedOperationException();
        }
        return f19544j;
    }

    public C8457b getAction() {
        C8457b a = C8457b.m19516a(this.f19550i);
        return a == null ? C8457b.UNRECOGNIZED : a;
    }

    public int getActionValue() {
        return this.f19550i;
    }

    public String getPushId() {
        return this.f19547f;
    }

    public ByteString getPushIdBytes() {
        return ByteString.copyFromUtf8(this.f19547f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f19547f.isEmpty() ? CodedOutputStream.computeStringSize(2, getPushId()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f19548g.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f19548g.get(i3));
        }
        int size = computeStringSize + i2 + (getWatcherUuidsList().size() * 1);
        if (this.f19549h != null) {
            size += CodedOutputStream.computeMessageSize(4, getSpanContext());
        }
        if (this.f19550i != C8457b.ACTION_UNKNOWN.getNumber()) {
            size += CodedOutputStream.computeEnumSize(5, this.f19550i);
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    public C7468s2 getSpanContext() {
        C7468s2 s2Var = this.f19549h;
        return s2Var == null ? C7468s2.getDefaultInstance() : s2Var;
    }

    public String getWatcherUuids(int i) {
        return (String) this.f19548g.get(i);
    }

    public ByteString getWatcherUuidsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f19548g.get(i));
    }

    public int getWatcherUuidsCount() {
        return this.f19548g.size();
    }

    public List<String> getWatcherUuidsList() {
        return this.f19548g;
    }

    public boolean hasSpanContext() {
        return this.f19549h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19547f.isEmpty()) {
            codedOutputStream.writeString(2, getPushId());
        }
        for (int i = 0; i < this.f19548g.size(); i++) {
            codedOutputStream.writeString(3, (String) this.f19548g.get(i));
        }
        if (this.f19549h != null) {
            codedOutputStream.writeMessage(4, getSpanContext());
        }
        if (this.f19550i != C8457b.ACTION_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(5, this.f19550i);
        }
    }
}
