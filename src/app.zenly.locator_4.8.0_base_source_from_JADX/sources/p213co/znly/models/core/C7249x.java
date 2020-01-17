package p213co.znly.models.core;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.x */
public final class C7249x extends GeneratedMessageLite<C7249x, C7250a> implements ChatProto$RequestMediaReceivedEventsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7249x f17982f = new C7249x();

    /* renamed from: g */
    private static volatile Parser<C7249x> f17983g;

    /* renamed from: e */
    private ProtobufList<C7241w> f17984e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.x$a */
    public static final class C7250a extends Builder<C7249x, C7250a> implements ChatProto$RequestMediaReceivedEventsOrBuilder {
        /* synthetic */ C7250a(C7066c cVar) {
            this();
        }

        public C7241w getTargets(int i) {
            return ((C7249x) this.instance).getTargets(i);
        }

        public int getTargetsCount() {
            return ((C7249x) this.instance).getTargetsCount();
        }

        public List<C7241w> getTargetsList() {
            return Collections.unmodifiableList(((C7249x) this.instance).getTargetsList());
        }

        private C7250a() {
            super(C7249x.f17982f);
        }
    }

    static {
        f17982f.makeImmutable();
    }

    private C7249x() {
    }

    public static C7249x getDefaultInstance() {
        return f17982f;
    }

    public static Parser<C7249x> parser() {
        return f17982f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7249x();
            case 2:
                return f17982f;
            case 3:
                this.f17984e.makeImmutable();
                return null;
            case 4:
                return new C7250a(null);
            case 5:
                this.f17984e = ((Visitor) obj).visitList(this.f17984e, ((C7249x) obj2).f17984e);
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
                                if (!this.f17984e.isModifiable()) {
                                    this.f17984e = GeneratedMessageLite.mutableCopy(this.f17984e);
                                }
                                this.f17984e.add(codedInputStream.readMessage(C7241w.parser(), extensionRegistryLite));
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
                if (f17983g == null) {
                    synchronized (C7249x.class) {
                        if (f17983g == null) {
                            f17983g = new DefaultInstanceBasedParser(f17982f);
                        }
                    }
                }
                return f17983g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17982f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17984e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17984e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7241w getTargets(int i) {
        return (C7241w) this.f17984e.get(i);
    }

    public int getTargetsCount() {
        return this.f17984e.size();
    }

    public List<C7241w> getTargetsList() {
        return this.f17984e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17984e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17984e.get(i));
        }
    }
}
