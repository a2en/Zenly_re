package p213co.znly.models.reversegeocoder;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape.C7892a;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue */
public final class ReverseGeoCoderProto$Venue extends GeneratedMessageLite<ReverseGeoCoderProto$Venue, C7909a> implements ReverseGeoCoderProto$VenueOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final ReverseGeoCoderProto$Venue f19982g = new ReverseGeoCoderProto$Venue();

    /* renamed from: h */
    private static volatile Parser<ReverseGeoCoderProto$Venue> f19983h;

    /* renamed from: e */
    private ReverseGeoCoderProto$Shape f19984e;

    /* renamed from: f */
    private Metadata f19985f;

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata */
    public static final class Metadata extends GeneratedMessageLite<Metadata, C7904a> implements MetadataOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static final Metadata f19986n = new Metadata();

        /* renamed from: o */
        private static volatile Parser<Metadata> f19987o;

        /* renamed from: e */
        private int f19988e;

        /* renamed from: f */
        private String f19989f;

        /* renamed from: g */
        private ProtobufList<C7905b> f19990g = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: h */
        private ProtobufList<C7907c> f19991h = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: i */
        private double f19992i;

        /* renamed from: j */
        private double f19993j;

        /* renamed from: k */
        private int f19994k;

        /* renamed from: l */
        private ProtobufList<OpeningHour> f19995l = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: m */
        private String f19996m;

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$CategoryIdsOrBuilder */
        public interface CategoryIdsOrBuilder extends MessageLiteOrBuilder {
            int getCategoryPart(int i);

            int getCategoryPartCount();

            List<Integer> getCategoryPartList();
        }

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$CategoryOrBuilder */
        public interface CategoryOrBuilder extends MessageLiteOrBuilder {
            String getCategoryPart(int i);

            ByteString getCategoryPartBytes(int i);

            int getCategoryPartCount();

            List<String> getCategoryPartList();
        }

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour */
        public static final class OpeningHour extends GeneratedMessageLite<OpeningHour, C7897a> implements OpeningHourOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: i */
            public static final OpeningHour f19997i = new OpeningHour();

            /* renamed from: j */
            private static volatile Parser<OpeningHour> f19998j;

            /* renamed from: e */
            private int f19999e;

            /* renamed from: f */
            private int f20000f;

            /* renamed from: g */
            private int f20001g;

            /* renamed from: h */
            private ProtobufList<C7900c> f20002h = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$SessionOrBuilder */
            public interface SessionOrBuilder extends MessageLiteOrBuilder {
                int getHourClose();

                int getHourOpen();

                int getMinuteClose();

                int getMinuteOpen();
            }

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$a */
            public static final class C7897a extends Builder<OpeningHour, C7897a> implements OpeningHourOrBuilder {
                /* synthetic */ C7897a(C7910a aVar) {
                    this();
                }

                public C7898b getDayOfWeek() {
                    return ((OpeningHour) this.instance).getDayOfWeek();
                }

                public int getDayOfWeekValue() {
                    return ((OpeningHour) this.instance).getDayOfWeekValue();
                }

                public C7900c getSessions(int i) {
                    return ((OpeningHour) this.instance).getSessions(i);
                }

                public int getSessionsCount() {
                    return ((OpeningHour) this.instance).getSessionsCount();
                }

                public List<C7900c> getSessionsList() {
                    return Collections.unmodifiableList(((OpeningHour) this.instance).getSessionsList());
                }

                public C7902d getSpecialTime() {
                    return ((OpeningHour) this.instance).getSpecialTime();
                }

                public int getSpecialTimeValue() {
                    return ((OpeningHour) this.instance).getSpecialTimeValue();
                }

                private C7897a() {
                    super(OpeningHour.f19997i);
                }
            }

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$b */
            public enum C7898b implements EnumLite {
                SUNDAY(0),
                MONDAY(1),
                TUESDAY(2),
                WEDNESDAY(3),
                THURSDAY(4),
                FRIDAY(5),
                SATURDAY(6),
                SPECIAL(7),
                UNRECOGNIZED(-1);
                

                /* renamed from: e */
                private final int f20013e;

                /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$b$a */
                class C7899a implements EnumLiteMap<C7898b> {
                    C7899a() {
                    }

                    public C7898b findValueByNumber(int i) {
                        return C7898b.m18953a(i);
                    }
                }

                static {
                    new C7899a();
                }

                private C7898b(int i) {
                    this.f20013e = i;
                }

                /* renamed from: a */
                public static C7898b m18953a(int i) {
                    switch (i) {
                        case 0:
                            return SUNDAY;
                        case 1:
                            return MONDAY;
                        case 2:
                            return TUESDAY;
                        case 3:
                            return WEDNESDAY;
                        case 4:
                            return THURSDAY;
                        case 5:
                            return FRIDAY;
                        case 6:
                            return SATURDAY;
                        case 7:
                            return SPECIAL;
                        default:
                            return null;
                    }
                }

                public final int getNumber() {
                    return this.f20013e;
                }
            }

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$c */
            public static final class C7900c extends GeneratedMessageLite<C7900c, C7901a> implements SessionOrBuilder {
                /* access modifiers changed from: private */

                /* renamed from: i */
                public static final C7900c f20014i = new C7900c();

                /* renamed from: j */
                private static volatile Parser<C7900c> f20015j;

                /* renamed from: e */
                private int f20016e;

                /* renamed from: f */
                private int f20017f;

                /* renamed from: g */
                private int f20018g;

                /* renamed from: h */
                private int f20019h;

                /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$c$a */
                public static final class C7901a extends Builder<C7900c, C7901a> implements SessionOrBuilder {
                    /* synthetic */ C7901a(C7910a aVar) {
                        this();
                    }

                    public int getHourClose() {
                        return ((C7900c) this.instance).getHourClose();
                    }

                    public int getHourOpen() {
                        return ((C7900c) this.instance).getHourOpen();
                    }

                    public int getMinuteClose() {
                        return ((C7900c) this.instance).getMinuteClose();
                    }

                    public int getMinuteOpen() {
                        return ((C7900c) this.instance).getMinuteOpen();
                    }

                    private C7901a() {
                        super(C7900c.f20014i);
                    }
                }

                static {
                    f20014i.makeImmutable();
                }

                private C7900c() {
                }

                public static Parser<C7900c> parser() {
                    return f20014i.getParserForType();
                }

                /* access modifiers changed from: protected */
                public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    boolean z = false;
                    switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new C7900c();
                        case 2:
                            return f20014i;
                        case 3:
                            return null;
                        case 4:
                            return new C7901a(null);
                        case 5:
                            Visitor visitor = (Visitor) obj;
                            C7900c cVar = (C7900c) obj2;
                            this.f20016e = visitor.visitInt(this.f20016e != 0, this.f20016e, cVar.f20016e != 0, cVar.f20016e);
                            this.f20017f = visitor.visitInt(this.f20017f != 0, this.f20017f, cVar.f20017f != 0, cVar.f20017f);
                            this.f20018g = visitor.visitInt(this.f20018g != 0, this.f20018g, cVar.f20018g != 0, cVar.f20018g);
                            boolean z2 = this.f20019h != 0;
                            int i = this.f20019h;
                            if (cVar.f20019h != 0) {
                                z = true;
                            }
                            this.f20019h = visitor.visitInt(z2, i, z, cVar.f20019h);
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
                                            this.f20016e = codedInputStream.readInt32();
                                        } else if (readTag == 16) {
                                            this.f20017f = codedInputStream.readInt32();
                                        } else if (readTag == 24) {
                                            this.f20018g = codedInputStream.readInt32();
                                        } else if (readTag == 32) {
                                            this.f20019h = codedInputStream.readInt32();
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
                            if (f20015j == null) {
                                synchronized (C7900c.class) {
                                    if (f20015j == null) {
                                        f20015j = new DefaultInstanceBasedParser(f20014i);
                                    }
                                }
                            }
                            return f20015j;
                        default:
                            throw new UnsupportedOperationException();
                    }
                    return f20014i;
                }

                public int getHourClose() {
                    return this.f20018g;
                }

                public int getHourOpen() {
                    return this.f20016e;
                }

                public int getMinuteClose() {
                    return this.f20019h;
                }

                public int getMinuteOpen() {
                    return this.f20017f;
                }

                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    int i3 = this.f20016e;
                    if (i3 != 0) {
                        i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
                    }
                    int i4 = this.f20017f;
                    if (i4 != 0) {
                        i2 += CodedOutputStream.computeInt32Size(2, i4);
                    }
                    int i5 = this.f20018g;
                    if (i5 != 0) {
                        i2 += CodedOutputStream.computeInt32Size(3, i5);
                    }
                    int i6 = this.f20019h;
                    if (i6 != 0) {
                        i2 += CodedOutputStream.computeInt32Size(4, i6);
                    }
                    this.memoizedSerializedSize = i2;
                    return i2;
                }

                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i = this.f20016e;
                    if (i != 0) {
                        codedOutputStream.writeInt32(1, i);
                    }
                    int i2 = this.f20017f;
                    if (i2 != 0) {
                        codedOutputStream.writeInt32(2, i2);
                    }
                    int i3 = this.f20018g;
                    if (i3 != 0) {
                        codedOutputStream.writeInt32(3, i3);
                    }
                    int i4 = this.f20019h;
                    if (i4 != 0) {
                        codedOutputStream.writeInt32(4, i4);
                    }
                }
            }

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$d */
            public enum C7902d implements EnumLite {
                UNKNOWN(0),
                NEW_YEAR(1),
                UNRECOGNIZED(-1);
                

                /* renamed from: e */
                private final int f20024e;

                /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHour$d$a */
                class C7903a implements EnumLiteMap<C7902d> {
                    C7903a() {
                    }

                    public C7902d findValueByNumber(int i) {
                        return C7902d.m18955a(i);
                    }
                }

                static {
                    new C7903a();
                }

                private C7902d(int i) {
                    this.f20024e = i;
                }

                /* renamed from: a */
                public static C7902d m18955a(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return NEW_YEAR;
                }

                public final int getNumber() {
                    return this.f20024e;
                }
            }

            static {
                f19997i.makeImmutable();
            }

            private OpeningHour() {
            }

            public static Parser<OpeningHour> parser() {
                return f19997i.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new OpeningHour();
                    case 2:
                        return f19997i;
                    case 3:
                        this.f20002h.makeImmutable();
                        return null;
                    case 4:
                        return new C7897a(null);
                    case 5:
                        Visitor visitor = (Visitor) obj;
                        OpeningHour openingHour = (OpeningHour) obj2;
                        this.f20000f = visitor.visitInt(this.f20000f != 0, this.f20000f, openingHour.f20000f != 0, openingHour.f20000f);
                        boolean z2 = this.f20001g != 0;
                        int i = this.f20001g;
                        if (openingHour.f20001g != 0) {
                            z = true;
                        }
                        this.f20001g = visitor.visitInt(z2, i, z, openingHour.f20001g);
                        this.f20002h = visitor.visitList(this.f20002h, openingHour.f20002h);
                        if (visitor == MergeFromVisitor.INSTANCE) {
                            this.f19999e |= openingHour.f19999e;
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
                                        this.f20000f = codedInputStream.readEnum();
                                    } else if (readTag == 16) {
                                        this.f20001g = codedInputStream.readEnum();
                                    } else if (readTag == 26) {
                                        if (!this.f20002h.isModifiable()) {
                                            this.f20002h = GeneratedMessageLite.mutableCopy(this.f20002h);
                                        }
                                        this.f20002h.add(codedInputStream.readMessage(C7900c.parser(), extensionRegistryLite));
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
                        if (f19998j == null) {
                            synchronized (OpeningHour.class) {
                                if (f19998j == null) {
                                    f19998j = new DefaultInstanceBasedParser(f19997i);
                                }
                            }
                        }
                        return f19998j;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f19997i;
            }

            public C7898b getDayOfWeek() {
                C7898b a = C7898b.m18953a(this.f20000f);
                return a == null ? C7898b.UNRECOGNIZED : a;
            }

            public int getDayOfWeekValue() {
                return this.f20000f;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int computeEnumSize = this.f20000f != C7898b.SUNDAY.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f20000f) + 0 : 0;
                if (this.f20001g != C7902d.UNKNOWN.getNumber()) {
                    computeEnumSize += CodedOutputStream.computeEnumSize(2, this.f20001g);
                }
                for (int i2 = 0; i2 < this.f20002h.size(); i2++) {
                    computeEnumSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f20002h.get(i2));
                }
                this.memoizedSerializedSize = computeEnumSize;
                return computeEnumSize;
            }

            public C7900c getSessions(int i) {
                return (C7900c) this.f20002h.get(i);
            }

            public int getSessionsCount() {
                return this.f20002h.size();
            }

            public List<C7900c> getSessionsList() {
                return this.f20002h;
            }

            public C7902d getSpecialTime() {
                C7902d a = C7902d.m18955a(this.f20001g);
                return a == null ? C7902d.UNRECOGNIZED : a;
            }

            public int getSpecialTimeValue() {
                return this.f20001g;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.f20000f != C7898b.SUNDAY.getNumber()) {
                    codedOutputStream.writeEnum(1, this.f20000f);
                }
                if (this.f20001g != C7902d.UNKNOWN.getNumber()) {
                    codedOutputStream.writeEnum(2, this.f20001g);
                }
                for (int i = 0; i < this.f20002h.size(); i++) {
                    codedOutputStream.writeMessage(3, (MessageLite) this.f20002h.get(i));
                }
            }
        }

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$OpeningHourOrBuilder */
        public interface OpeningHourOrBuilder extends MessageLiteOrBuilder {
            C7898b getDayOfWeek();

            int getDayOfWeekValue();

            C7900c getSessions(int i);

            int getSessionsCount();

            List<C7900c> getSessionsList();

            C7902d getSpecialTime();

            int getSpecialTimeValue();
        }

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$a */
        public static final class C7904a extends Builder<Metadata, C7904a> implements MetadataOrBuilder {
            /* synthetic */ C7904a(C7910a aVar) {
                this();
            }

            public C7905b getCategories(int i) {
                return ((Metadata) this.instance).getCategories(i);
            }

            public int getCategoriesCount() {
                return ((Metadata) this.instance).getCategoriesCount();
            }

            public List<C7905b> getCategoriesList() {
                return Collections.unmodifiableList(((Metadata) this.instance).getCategoriesList());
            }

            public C7907c getCategoryIds(int i) {
                return ((Metadata) this.instance).getCategoryIds(i);
            }

            public int getCategoryIdsCount() {
                return ((Metadata) this.instance).getCategoryIdsCount();
            }

            public List<C7907c> getCategoryIdsList() {
                return Collections.unmodifiableList(((Metadata) this.instance).getCategoryIdsList());
            }

            public OpeningHour getOpeningHours(int i) {
                return ((Metadata) this.instance).getOpeningHours(i);
            }

            public int getOpeningHoursCount() {
                return ((Metadata) this.instance).getOpeningHoursCount();
            }

            public List<OpeningHour> getOpeningHoursList() {
                return Collections.unmodifiableList(((Metadata) this.instance).getOpeningHoursList());
            }

            public double getPopularity() {
                return ((Metadata) this.instance).getPopularity();
            }

            public double getRating() {
                return ((Metadata) this.instance).getRating();
            }

            public String getResearch() {
                return ((Metadata) this.instance).getResearch();
            }

            public ByteString getResearchBytes() {
                return ((Metadata) this.instance).getResearchBytes();
            }

            public int getReviews() {
                return ((Metadata) this.instance).getReviews();
            }

            public String getSource() {
                return ((Metadata) this.instance).getSource();
            }

            public ByteString getSourceBytes() {
                return ((Metadata) this.instance).getSourceBytes();
            }

            private C7904a() {
                super(Metadata.f19986n);
            }
        }

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$b */
        public static final class C7905b extends GeneratedMessageLite<C7905b, C7906a> implements CategoryOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: f */
            public static final C7905b f20025f = new C7905b();

            /* renamed from: g */
            private static volatile Parser<C7905b> f20026g;

            /* renamed from: e */
            private ProtobufList<String> f20027e = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$b$a */
            public static final class C7906a extends Builder<C7905b, C7906a> implements CategoryOrBuilder {
                /* synthetic */ C7906a(C7910a aVar) {
                    this();
                }

                public String getCategoryPart(int i) {
                    return ((C7905b) this.instance).getCategoryPart(i);
                }

                public ByteString getCategoryPartBytes(int i) {
                    return ((C7905b) this.instance).getCategoryPartBytes(i);
                }

                public int getCategoryPartCount() {
                    return ((C7905b) this.instance).getCategoryPartCount();
                }

                public List<String> getCategoryPartList() {
                    return Collections.unmodifiableList(((C7905b) this.instance).getCategoryPartList());
                }

                private C7906a() {
                    super(C7905b.f20025f);
                }
            }

            static {
                f20025f.makeImmutable();
            }

            private C7905b() {
            }

            public static Parser<C7905b> parser() {
                return f20025f.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C7905b();
                    case 2:
                        return f20025f;
                    case 3:
                        this.f20027e.makeImmutable();
                        return null;
                    case 4:
                        return new C7906a(null);
                    case 5:
                        this.f20027e = ((Visitor) obj).visitList(this.f20027e, ((C7905b) obj2).f20027e);
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
                                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                        if (!this.f20027e.isModifiable()) {
                                            this.f20027e = GeneratedMessageLite.mutableCopy(this.f20027e);
                                        }
                                        this.f20027e.add(readStringRequireUtf8);
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
                        if (f20026g == null) {
                            synchronized (C7905b.class) {
                                if (f20026g == null) {
                                    f20026g = new DefaultInstanceBasedParser(f20025f);
                                }
                            }
                        }
                        return f20026g;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f20025f;
            }

            public String getCategoryPart(int i) {
                return (String) this.f20027e.get(i);
            }

            public ByteString getCategoryPartBytes(int i) {
                return ByteString.copyFromUtf8((String) this.f20027e.get(i));
            }

            public int getCategoryPartCount() {
                return this.f20027e.size();
            }

            public List<String> getCategoryPartList() {
                return this.f20027e;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.f20027e.size(); i3++) {
                    i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f20027e.get(i3));
                }
                int size = 0 + i2 + (getCategoryPartList().size() * 1);
                this.memoizedSerializedSize = size;
                return size;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i = 0; i < this.f20027e.size(); i++) {
                    codedOutputStream.writeString(1, (String) this.f20027e.get(i));
                }
            }
        }

        /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$c */
        public static final class C7907c extends GeneratedMessageLite<C7907c, C7908a> implements CategoryIdsOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: f */
            public static final C7907c f20028f = new C7907c();

            /* renamed from: g */
            private static volatile Parser<C7907c> f20029g;

            /* renamed from: e */
            private IntList f20030e = GeneratedMessageLite.emptyIntList();

            /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$Metadata$c$a */
            public static final class C7908a extends Builder<C7907c, C7908a> implements CategoryIdsOrBuilder {
                /* synthetic */ C7908a(C7910a aVar) {
                    this();
                }

                public int getCategoryPart(int i) {
                    return ((C7907c) this.instance).getCategoryPart(i);
                }

                public int getCategoryPartCount() {
                    return ((C7907c) this.instance).getCategoryPartCount();
                }

                public List<Integer> getCategoryPartList() {
                    return Collections.unmodifiableList(((C7907c) this.instance).getCategoryPartList());
                }

                private C7908a() {
                    super(C7907c.f20028f);
                }
            }

            static {
                f20028f.makeImmutable();
            }

            private C7907c() {
            }

            public static Parser<C7907c> parser() {
                return f20028f.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C7907c();
                    case 2:
                        return f20028f;
                    case 3:
                        this.f20030e.makeImmutable();
                        return null;
                    case 4:
                        return new C7908a(null);
                    case 5:
                        this.f20030e = ((Visitor) obj).visitIntList(this.f20030e, ((C7907c) obj2).f20030e);
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
                                    if (readTag == 8) {
                                        if (!this.f20030e.isModifiable()) {
                                            this.f20030e = GeneratedMessageLite.mutableCopy(this.f20030e);
                                        }
                                        this.f20030e.addInt(codedInputStream.readInt32());
                                    } else if (readTag == 10) {
                                        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        if (!this.f20030e.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                            this.f20030e = GeneratedMessageLite.mutableCopy(this.f20030e);
                                        }
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.f20030e.addInt(codedInputStream.readInt32());
                                        }
                                        codedInputStream.popLimit(pushLimit);
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
                        if (f20029g == null) {
                            synchronized (C7907c.class) {
                                if (f20029g == null) {
                                    f20029g = new DefaultInstanceBasedParser(f20028f);
                                }
                            }
                        }
                        return f20029g;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f20028f;
            }

            public int getCategoryPart(int i) {
                return this.f20030e.getInt(i);
            }

            public int getCategoryPartCount() {
                return this.f20030e.size();
            }

            public List<Integer> getCategoryPartList() {
                return this.f20030e;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.f20030e.size(); i3++) {
                    i2 += CodedOutputStream.computeInt32SizeNoTag(this.f20030e.getInt(i3));
                }
                int size = 0 + i2 + (getCategoryPartList().size() * 1);
                this.memoizedSerializedSize = size;
                return size;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                for (int i = 0; i < this.f20030e.size(); i++) {
                    codedOutputStream.writeInt32(1, this.f20030e.getInt(i));
                }
            }
        }

        static {
            f19986n.makeImmutable();
        }

        private Metadata() {
            String str = "";
            this.f19989f = str;
            this.f19996m = str;
        }

        public static Metadata getDefaultInstance() {
            return f19986n;
        }

        public static Parser<Metadata> parser() {
            return f19986n.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return f19986n;
                case 3:
                    this.f19990g.makeImmutable();
                    this.f19991h.makeImmutable();
                    this.f19995l.makeImmutable();
                    return null;
                case 4:
                    return new C7904a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    Metadata metadata = (Metadata) obj2;
                    this.f19989f = visitor.visitString(!this.f19989f.isEmpty(), this.f19989f, !metadata.f19989f.isEmpty(), metadata.f19989f);
                    this.f19990g = visitor.visitList(this.f19990g, metadata.f19990g);
                    this.f19991h = visitor.visitList(this.f19991h, metadata.f19991h);
                    this.f19992i = visitor.visitDouble(this.f19992i != 0.0d, this.f19992i, metadata.f19992i != 0.0d, metadata.f19992i);
                    this.f19993j = visitor.visitDouble(this.f19993j != 0.0d, this.f19993j, metadata.f19993j != 0.0d, metadata.f19993j);
                    boolean z2 = this.f19994k != 0;
                    int i = this.f19994k;
                    if (metadata.f19994k != 0) {
                        z = true;
                    }
                    this.f19994k = visitor.visitInt(z2, i, z, metadata.f19994k);
                    this.f19995l = visitor.visitList(this.f19995l, metadata.f19995l);
                    this.f19996m = visitor.visitString(!this.f19996m.isEmpty(), this.f19996m, !metadata.f19996m.isEmpty(), metadata.f19996m);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f19988e |= metadata.f19988e;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.f19989f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    if (!this.f19990g.isModifiable()) {
                                        this.f19990g = GeneratedMessageLite.mutableCopy(this.f19990g);
                                    }
                                    this.f19990g.add(codedInputStream.readMessage(C7905b.parser(), extensionRegistryLite));
                                } else if (readTag == 25) {
                                    this.f19992i = codedInputStream.readDouble();
                                } else if (readTag == 33) {
                                    this.f19993j = codedInputStream.readDouble();
                                } else if (readTag == 40) {
                                    this.f19994k = codedInputStream.readInt32();
                                } else if (readTag == 50) {
                                    if (!this.f19995l.isModifiable()) {
                                        this.f19995l = GeneratedMessageLite.mutableCopy(this.f19995l);
                                    }
                                    this.f19995l.add(codedInputStream.readMessage(OpeningHour.parser(), extensionRegistryLite));
                                } else if (readTag == 58) {
                                    if (!this.f19991h.isModifiable()) {
                                        this.f19991h = GeneratedMessageLite.mutableCopy(this.f19991h);
                                    }
                                    this.f19991h.add(codedInputStream.readMessage(C7907c.parser(), extensionRegistryLite));
                                } else if (readTag == 66) {
                                    this.f19996m = codedInputStream.readStringRequireUtf8();
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
                    if (f19987o == null) {
                        synchronized (Metadata.class) {
                            if (f19987o == null) {
                                f19987o = new DefaultInstanceBasedParser(f19986n);
                            }
                        }
                    }
                    return f19987o;
                default:
                    throw new UnsupportedOperationException();
            }
            return f19986n;
        }

        public C7905b getCategories(int i) {
            return (C7905b) this.f19990g.get(i);
        }

        public int getCategoriesCount() {
            return this.f19990g.size();
        }

        public List<C7905b> getCategoriesList() {
            return this.f19990g;
        }

        public C7907c getCategoryIds(int i) {
            return (C7907c) this.f19991h.get(i);
        }

        public int getCategoryIdsCount() {
            return this.f19991h.size();
        }

        public List<C7907c> getCategoryIdsList() {
            return this.f19991h;
        }

        public OpeningHour getOpeningHours(int i) {
            return (OpeningHour) this.f19995l.get(i);
        }

        public int getOpeningHoursCount() {
            return this.f19995l.size();
        }

        public List<OpeningHour> getOpeningHoursList() {
            return this.f19995l;
        }

        public double getPopularity() {
            return this.f19992i;
        }

        public double getRating() {
            return this.f19993j;
        }

        public String getResearch() {
            return this.f19996m;
        }

        public ByteString getResearchBytes() {
            return ByteString.copyFromUtf8(this.f19996m);
        }

        public int getReviews() {
            return this.f19994k;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.f19989f.isEmpty() ? CodedOutputStream.computeStringSize(1, getSource()) + 0 : 0;
            for (int i2 = 0; i2 < this.f19990g.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f19990g.get(i2));
            }
            double d = this.f19992i;
            if (d != 0.0d) {
                computeStringSize += CodedOutputStream.computeDoubleSize(3, d);
            }
            double d2 = this.f19993j;
            if (d2 != 0.0d) {
                computeStringSize += CodedOutputStream.computeDoubleSize(4, d2);
            }
            int i3 = this.f19994k;
            if (i3 != 0) {
                computeStringSize += CodedOutputStream.computeInt32Size(5, i3);
            }
            for (int i4 = 0; i4 < this.f19995l.size(); i4++) {
                computeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f19995l.get(i4));
            }
            for (int i5 = 0; i5 < this.f19991h.size(); i5++) {
                computeStringSize += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f19991h.get(i5));
            }
            if (!this.f19996m.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(8, getResearch());
            }
            this.memoizedSerializedSize = computeStringSize;
            return computeStringSize;
        }

        public String getSource() {
            return this.f19989f;
        }

        public ByteString getSourceBytes() {
            return ByteString.copyFromUtf8(this.f19989f);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f19989f.isEmpty()) {
                codedOutputStream.writeString(1, getSource());
            }
            for (int i = 0; i < this.f19990g.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f19990g.get(i));
            }
            double d = this.f19992i;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(3, d);
            }
            double d2 = this.f19993j;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(4, d2);
            }
            int i2 = this.f19994k;
            if (i2 != 0) {
                codedOutputStream.writeInt32(5, i2);
            }
            for (int i3 = 0; i3 < this.f19995l.size(); i3++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f19995l.get(i3));
            }
            for (int i4 = 0; i4 < this.f19991h.size(); i4++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f19991h.get(i4));
            }
            if (!this.f19996m.isEmpty()) {
                codedOutputStream.writeString(8, getResearch());
            }
        }
    }

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$MetadataOrBuilder */
    public interface MetadataOrBuilder extends MessageLiteOrBuilder {
        C7905b getCategories(int i);

        int getCategoriesCount();

        List<C7905b> getCategoriesList();

        C7907c getCategoryIds(int i);

        int getCategoryIdsCount();

        List<C7907c> getCategoryIdsList();

        OpeningHour getOpeningHours(int i);

        int getOpeningHoursCount();

        List<OpeningHour> getOpeningHoursList();

        double getPopularity();

        double getRating();

        String getResearch();

        ByteString getResearchBytes();

        int getReviews();

        String getSource();

        ByteString getSourceBytes();
    }

    /* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$Venue$a */
    public static final class C7909a extends Builder<ReverseGeoCoderProto$Venue, C7909a> implements ReverseGeoCoderProto$VenueOrBuilder {
        /* synthetic */ C7909a(C7910a aVar) {
            this();
        }

        public Metadata getMetadata() {
            return ((ReverseGeoCoderProto$Venue) this.instance).getMetadata();
        }

        public ReverseGeoCoderProto$Shape getShape() {
            return ((ReverseGeoCoderProto$Venue) this.instance).getShape();
        }

        public boolean hasMetadata() {
            return ((ReverseGeoCoderProto$Venue) this.instance).hasMetadata();
        }

        public boolean hasShape() {
            return ((ReverseGeoCoderProto$Venue) this.instance).hasShape();
        }

        private C7909a() {
            super(ReverseGeoCoderProto$Venue.f19982g);
        }
    }

    static {
        f19982g.makeImmutable();
    }

    private ReverseGeoCoderProto$Venue() {
    }

    public static ReverseGeoCoderProto$Venue getDefaultInstance() {
        return f19982g;
    }

    public static Parser<ReverseGeoCoderProto$Venue> parser() {
        return f19982g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7910a.f20031a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReverseGeoCoderProto$Venue();
            case 2:
                return f19982g;
            case 3:
                return null;
            case 4:
                return new C7909a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ReverseGeoCoderProto$Venue reverseGeoCoderProto$Venue = (ReverseGeoCoderProto$Venue) obj2;
                this.f19984e = (ReverseGeoCoderProto$Shape) visitor.visitMessage(this.f19984e, reverseGeoCoderProto$Venue.f19984e);
                this.f19985f = (Metadata) visitor.visitMessage(this.f19985f, reverseGeoCoderProto$Venue.f19985f);
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
                                Builder builder = this.f19984e != null ? (C7892a) this.f19984e.toBuilder() : null;
                                this.f19984e = (ReverseGeoCoderProto$Shape) codedInputStream.readMessage(ReverseGeoCoderProto$Shape.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19984e);
                                    this.f19984e = (ReverseGeoCoderProto$Shape) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19985f != null ? (C7904a) this.f19985f.toBuilder() : null;
                                this.f19985f = (Metadata) codedInputStream.readMessage(Metadata.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19985f);
                                    this.f19985f = (Metadata) builder2.buildPartial();
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
                if (f19983h == null) {
                    synchronized (ReverseGeoCoderProto$Venue.class) {
                        if (f19983h == null) {
                            f19983h = new DefaultInstanceBasedParser(f19982g);
                        }
                    }
                }
                return f19983h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19982g;
    }

    public Metadata getMetadata() {
        Metadata metadata = this.f19985f;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19984e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getShape());
        }
        if (this.f19985f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMetadata());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ReverseGeoCoderProto$Shape getShape() {
        ReverseGeoCoderProto$Shape reverseGeoCoderProto$Shape = this.f19984e;
        return reverseGeoCoderProto$Shape == null ? ReverseGeoCoderProto$Shape.getDefaultInstance() : reverseGeoCoderProto$Shape;
    }

    public boolean hasMetadata() {
        return this.f19985f != null;
    }

    public boolean hasShape() {
        return this.f19984e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19984e != null) {
            codedOutputStream.writeMessage(1, getShape());
        }
        if (this.f19985f != null) {
            codedOutputStream.writeMessage(2, getMetadata());
        }
    }
}
