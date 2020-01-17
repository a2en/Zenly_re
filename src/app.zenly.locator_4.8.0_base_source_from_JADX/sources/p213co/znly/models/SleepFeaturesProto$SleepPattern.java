package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.DoubleList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.SleepFeaturesProto$SleepPattern */
public final class SleepFeaturesProto$SleepPattern extends GeneratedMessageLite<SleepFeaturesProto$SleepPattern, C6856a> implements SleepFeaturesProto$SleepPatternOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final SleepFeaturesProto$SleepPattern f16739j = new SleepFeaturesProto$SleepPattern();

    /* renamed from: k */
    private static volatile Parser<SleepFeaturesProto$SleepPattern> f16740k;

    /* renamed from: e */
    private int f16741e;

    /* renamed from: f */
    private IntList f16742f = GeneratedMessageLite.emptyIntList();

    /* renamed from: g */
    private int f16743g;

    /* renamed from: h */
    private DoubleList f16744h = GeneratedMessageLite.emptyDoubleList();

    /* renamed from: i */
    private C6857b f16745i;

    /* renamed from: co.znly.models.SleepFeaturesProto$SleepPattern$ContributionsOrBuilder */
    public interface ContributionsOrBuilder extends MessageLiteOrBuilder {
        int getIsCharging();

        int getIsOffline();

        int getIsRingerLevelZero();

        int getIsRingerModeSilent();
    }

    /* renamed from: co.znly.models.SleepFeaturesProto$SleepPattern$a */
    public static final class C6856a extends Builder<SleepFeaturesProto$SleepPattern, C6856a> implements SleepFeaturesProto$SleepPatternOrBuilder {
        /* synthetic */ C6856a(C7433o2 o2Var) {
            this();
        }

        public C6857b getContributions() {
            return ((SleepFeaturesProto$SleepPattern) this.instance).getContributions();
        }

        public int getDays(int i) {
            return ((SleepFeaturesProto$SleepPattern) this.instance).getDays(i);
        }

        public int getDaysCount() {
            return ((SleepFeaturesProto$SleepPattern) this.instance).getDaysCount();
        }

        public List<Integer> getDaysList() {
            return Collections.unmodifiableList(((SleepFeaturesProto$SleepPattern) this.instance).getDaysList());
        }

        public int getNMembers() {
            return ((SleepFeaturesProto$SleepPattern) this.instance).getNMembers();
        }

        public double getPattern(int i) {
            return ((SleepFeaturesProto$SleepPattern) this.instance).getPattern(i);
        }

        public int getPatternCount() {
            return ((SleepFeaturesProto$SleepPattern) this.instance).getPatternCount();
        }

        public List<Double> getPatternList() {
            return Collections.unmodifiableList(((SleepFeaturesProto$SleepPattern) this.instance).getPatternList());
        }

        public boolean hasContributions() {
            return ((SleepFeaturesProto$SleepPattern) this.instance).hasContributions();
        }

        private C6856a() {
            super(SleepFeaturesProto$SleepPattern.f16739j);
        }
    }

    /* renamed from: co.znly.models.SleepFeaturesProto$SleepPattern$b */
    public static final class C6857b extends GeneratedMessageLite<C6857b, C6858a> implements ContributionsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6857b f16746i = new C6857b();

        /* renamed from: j */
        private static volatile Parser<C6857b> f16747j;

        /* renamed from: e */
        private int f16748e;

        /* renamed from: f */
        private int f16749f;

        /* renamed from: g */
        private int f16750g;

        /* renamed from: h */
        private int f16751h;

        /* renamed from: co.znly.models.SleepFeaturesProto$SleepPattern$b$a */
        public static final class C6858a extends Builder<C6857b, C6858a> implements ContributionsOrBuilder {
            /* synthetic */ C6858a(C7433o2 o2Var) {
                this();
            }

            public int getIsCharging() {
                return ((C6857b) this.instance).getIsCharging();
            }

            public int getIsOffline() {
                return ((C6857b) this.instance).getIsOffline();
            }

            public int getIsRingerLevelZero() {
                return ((C6857b) this.instance).getIsRingerLevelZero();
            }

            public int getIsRingerModeSilent() {
                return ((C6857b) this.instance).getIsRingerModeSilent();
            }

            private C6858a() {
                super(C6857b.f16746i);
            }
        }

        static {
            f16746i.makeImmutable();
        }

        private C6857b() {
        }

        public static C6857b getDefaultInstance() {
            return f16746i;
        }

        public static Parser<C6857b> parser() {
            return f16746i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7433o2.f18590a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6857b();
                case 2:
                    return f16746i;
                case 3:
                    return null;
                case 4:
                    return new C6858a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6857b bVar = (C6857b) obj2;
                    this.f16748e = visitor.visitInt(this.f16748e != 0, this.f16748e, bVar.f16748e != 0, bVar.f16748e);
                    this.f16749f = visitor.visitInt(this.f16749f != 0, this.f16749f, bVar.f16749f != 0, bVar.f16749f);
                    this.f16750g = visitor.visitInt(this.f16750g != 0, this.f16750g, bVar.f16750g != 0, bVar.f16750g);
                    boolean z2 = this.f16751h != 0;
                    int i = this.f16751h;
                    if (bVar.f16751h != 0) {
                        z = true;
                    }
                    this.f16751h = visitor.visitInt(z2, i, z, bVar.f16751h);
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
                                    this.f16748e = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f16749f = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    this.f16750g = codedInputStream.readInt32();
                                } else if (readTag == 32) {
                                    this.f16751h = codedInputStream.readInt32();
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
                    if (f16747j == null) {
                        synchronized (C6857b.class) {
                            if (f16747j == null) {
                                f16747j = new DefaultInstanceBasedParser(f16746i);
                            }
                        }
                    }
                    return f16747j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16746i;
        }

        public int getIsCharging() {
            return this.f16750g;
        }

        public int getIsOffline() {
            return this.f16748e;
        }

        public int getIsRingerLevelZero() {
            return this.f16751h;
        }

        public int getIsRingerModeSilent() {
            return this.f16749f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16748e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            int i4 = this.f16749f;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i4);
            }
            int i5 = this.f16750g;
            if (i5 != 0) {
                i2 += CodedOutputStream.computeInt32Size(3, i5);
            }
            int i6 = this.f16751h;
            if (i6 != 0) {
                i2 += CodedOutputStream.computeInt32Size(4, i6);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16748e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.f16749f;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            int i3 = this.f16750g;
            if (i3 != 0) {
                codedOutputStream.writeInt32(3, i3);
            }
            int i4 = this.f16751h;
            if (i4 != 0) {
                codedOutputStream.writeInt32(4, i4);
            }
        }
    }

    static {
        f16739j.makeImmutable();
    }

    private SleepFeaturesProto$SleepPattern() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7433o2.f18590a[methodToInvoke.ordinal()]) {
            case 1:
                return new SleepFeaturesProto$SleepPattern();
            case 2:
                return f16739j;
            case 3:
                this.f16742f.makeImmutable();
                this.f16744h.makeImmutable();
                return null;
            case 4:
                return new C6856a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                SleepFeaturesProto$SleepPattern sleepFeaturesProto$SleepPattern = (SleepFeaturesProto$SleepPattern) obj2;
                this.f16742f = visitor.visitIntList(this.f16742f, sleepFeaturesProto$SleepPattern.f16742f);
                boolean z2 = this.f16743g != 0;
                int i = this.f16743g;
                if (sleepFeaturesProto$SleepPattern.f16743g != 0) {
                    z = true;
                }
                this.f16743g = visitor.visitInt(z2, i, z, sleepFeaturesProto$SleepPattern.f16743g);
                this.f16744h = visitor.visitDoubleList(this.f16744h, sleepFeaturesProto$SleepPattern.f16744h);
                this.f16745i = (C6857b) visitor.visitMessage(this.f16745i, sleepFeaturesProto$SleepPattern.f16745i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16741e |= sleepFeaturesProto$SleepPattern.f16741e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 808) {
                                if (!this.f16742f.isModifiable()) {
                                    this.f16742f = GeneratedMessageLite.mutableCopy(this.f16742f);
                                }
                                this.f16742f.addInt(codedInputStream.readInt32());
                            } else if (readTag == 810) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.f16742f.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f16742f = GeneratedMessageLite.mutableCopy(this.f16742f);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f16742f.addInt(codedInputStream.readInt32());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 1608) {
                                this.f16743g = codedInputStream.readInt32();
                            } else if (readTag == 3210) {
                                Builder builder = this.f16745i != null ? (C6858a) this.f16745i.toBuilder() : null;
                                this.f16745i = (C6857b) codedInputStream.readMessage(C6857b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f16745i);
                                    this.f16745i = (C6857b) builder.buildPartial();
                                }
                            } else if (readTag == 2409) {
                                if (!this.f16744h.isModifiable()) {
                                    this.f16744h = GeneratedMessageLite.mutableCopy(this.f16744h);
                                }
                                this.f16744h.addDouble(codedInputStream.readDouble());
                            } else if (readTag == 2410) {
                                int readRawVarint32 = codedInputStream.readRawVarint32();
                                int pushLimit2 = codedInputStream.pushLimit(readRawVarint32);
                                if (!this.f16744h.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f16744h = this.f16744h.mutableCopyWithCapacity(this.f16744h.size() + (readRawVarint32 / 8));
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f16744h.addDouble(codedInputStream.readDouble());
                                }
                                codedInputStream.popLimit(pushLimit2);
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
                if (f16740k == null) {
                    synchronized (SleepFeaturesProto$SleepPattern.class) {
                        if (f16740k == null) {
                            f16740k = new DefaultInstanceBasedParser(f16739j);
                        }
                    }
                }
                return f16740k;
            default:
                throw new UnsupportedOperationException();
        }
        return f16739j;
    }

    public C6857b getContributions() {
        C6857b bVar = this.f16745i;
        return bVar == null ? C6857b.getDefaultInstance() : bVar;
    }

    public int getDays(int i) {
        return this.f16742f.getInt(i);
    }

    public int getDaysCount() {
        return this.f16742f.size();
    }

    public List<Integer> getDaysList() {
        return this.f16742f;
    }

    public int getNMembers() {
        return this.f16743g;
    }

    public double getPattern(int i) {
        return this.f16744h.getDouble(i);
    }

    public int getPatternCount() {
        return this.f16744h.size();
    }

    public List<Double> getPatternList() {
        return this.f16744h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16742f.size(); i3++) {
            i2 += CodedOutputStream.computeInt32SizeNoTag(this.f16742f.getInt(i3));
        }
        int size = 0 + i2 + (getDaysList().size() * 2);
        int i4 = this.f16743g;
        if (i4 != 0) {
            size += CodedOutputStream.computeInt32Size(201, i4);
        }
        int size2 = size + (getPatternList().size() * 8) + (getPatternList().size() * 2);
        if (this.f16745i != null) {
            size2 += CodedOutputStream.computeMessageSize(401, getContributions());
        }
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public boolean hasContributions() {
        return this.f16745i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.f16742f.size(); i++) {
            codedOutputStream.writeInt32(101, this.f16742f.getInt(i));
        }
        int i2 = this.f16743g;
        if (i2 != 0) {
            codedOutputStream.writeInt32(201, i2);
        }
        for (int i3 = 0; i3 < this.f16744h.size(); i3++) {
            codedOutputStream.writeDouble(301, this.f16744h.getDouble(i3));
        }
        if (this.f16745i != null) {
            codedOutputStream.writeMessage(401, getContributions());
        }
    }
}
