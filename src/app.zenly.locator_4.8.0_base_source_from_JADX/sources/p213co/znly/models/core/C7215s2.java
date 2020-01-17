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
import p213co.znly.models.core.C7206r2.C7207a;

/* renamed from: co.znly.models.core.s2 */
public final class C7215s2 extends GeneratedMessageLite<C7215s2, C7216a> implements TypesProto$ValueTypesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7215s2 f17901f = new C7215s2();

    /* renamed from: g */
    private static volatile Parser<C7215s2> f17902g;

    /* renamed from: e */
    private ProtobufList<C7206r2> f17903e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.s2$a */
    public static final class C7216a extends Builder<C7215s2, C7216a> implements TypesProto$ValueTypesOrBuilder {
        /* synthetic */ C7216a(C7253x1 x1Var) {
            this();
        }

        /* renamed from: a */
        public C7216a mo19189a(C7207a aVar) {
            copyOnWrite();
            ((C7215s2) this.instance).m17954a(aVar);
            return this;
        }

        public C7206r2 getValues(int i) {
            return ((C7215s2) this.instance).getValues(i);
        }

        public int getValuesCount() {
            return ((C7215s2) this.instance).getValuesCount();
        }

        public List<C7206r2> getValuesList() {
            return Collections.unmodifiableList(((C7215s2) this.instance).getValuesList());
        }

        private C7216a() {
            super(C7215s2.f17901f);
        }
    }

    static {
        f17901f.makeImmutable();
    }

    private C7215s2() {
    }

    /* renamed from: b */
    private void m17956b() {
        if (!this.f17903e.isModifiable()) {
            this.f17903e = GeneratedMessageLite.mutableCopy(this.f17903e);
        }
    }

    public static C7216a newBuilder() {
        return (C7216a) f17901f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7215s2();
            case 2:
                return f17901f;
            case 3:
                this.f17903e.makeImmutable();
                return null;
            case 4:
                return new C7216a(null);
            case 5:
                this.f17903e = ((Visitor) obj).visitList(this.f17903e, ((C7215s2) obj2).f17903e);
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
                                if (!this.f17903e.isModifiable()) {
                                    this.f17903e = GeneratedMessageLite.mutableCopy(this.f17903e);
                                }
                                this.f17903e.add(codedInputStream.readMessage(C7206r2.parser(), extensionRegistryLite));
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
                if (f17902g == null) {
                    synchronized (C7215s2.class) {
                        if (f17902g == null) {
                            f17902g = new DefaultInstanceBasedParser(f17901f);
                        }
                    }
                }
                return f17902g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17901f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17903e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17903e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7206r2 getValues(int i) {
        return (C7206r2) this.f17903e.get(i);
    }

    public int getValuesCount() {
        return this.f17903e.size();
    }

    public List<C7206r2> getValuesList() {
        return this.f17903e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17903e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17903e.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17954a(C7207a aVar) {
        m17956b();
        this.f17903e.add(aVar.build());
    }
}
