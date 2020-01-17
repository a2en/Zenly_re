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

/* renamed from: co.znly.models.core.t */
public final class C7217t extends GeneratedMessageLite<C7217t, C7218a> implements ChatProto$MediaReceivedEventsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7217t f17904f = new C7217t();

    /* renamed from: g */
    private static volatile Parser<C7217t> f17905g;

    /* renamed from: e */
    private ProtobufList<C7208s> f17906e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.t$a */
    public static final class C7218a extends Builder<C7217t, C7218a> implements ChatProto$MediaReceivedEventsOrBuilder {
        /* synthetic */ C7218a(C7066c cVar) {
            this();
        }

        public C7208s getTargets(int i) {
            return ((C7217t) this.instance).getTargets(i);
        }

        public int getTargetsCount() {
            return ((C7217t) this.instance).getTargetsCount();
        }

        public List<C7208s> getTargetsList() {
            return Collections.unmodifiableList(((C7217t) this.instance).getTargetsList());
        }

        private C7218a() {
            super(C7217t.f17904f);
        }
    }

    static {
        f17904f.makeImmutable();
    }

    private C7217t() {
    }

    public static C7217t getDefaultInstance() {
        return f17904f;
    }

    public static Parser<C7217t> parser() {
        return f17904f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7217t();
            case 2:
                return f17904f;
            case 3:
                this.f17906e.makeImmutable();
                return null;
            case 4:
                return new C7218a(null);
            case 5:
                this.f17906e = ((Visitor) obj).visitList(this.f17906e, ((C7217t) obj2).f17906e);
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
                                if (!this.f17906e.isModifiable()) {
                                    this.f17906e = GeneratedMessageLite.mutableCopy(this.f17906e);
                                }
                                this.f17906e.add(codedInputStream.readMessage(C7208s.parser(), extensionRegistryLite));
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
                if (f17905g == null) {
                    synchronized (C7217t.class) {
                        if (f17905g == null) {
                            f17905g = new DefaultInstanceBasedParser(f17904f);
                        }
                    }
                }
                return f17905g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17904f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17906e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17906e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7208s getTargets(int i) {
        return (C7208s) this.f17906e.get(i);
    }

    public int getTargetsCount() {
        return this.f17906e.size();
    }

    public List<C7208s> getTargetsList() {
        return this.f17906e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17906e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17906e.get(i));
        }
    }
}
