package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.TrackingContextProto$TrackingContext */
public final class TrackingContextProto$TrackingContext extends GeneratedMessageLite<TrackingContextProto$TrackingContext, C6884d> implements TrackingContextProto$TrackingContextOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final TrackingContextProto$TrackingContext f16770Y = new TrackingContextProto$TrackingContext();

    /* renamed from: Z */
    private static volatile Parser<TrackingContextProto$TrackingContext> f16771Z;

    /* renamed from: A */
    private Timestamp f16772A;

    /* renamed from: B */
    private int f16773B;

    /* renamed from: C */
    private double f16774C;

    /* renamed from: D */
    private double f16775D;

    /* renamed from: E */
    private double f16776E;

    /* renamed from: F */
    private double f16777F;

    /* renamed from: G */
    private int f16778G;

    /* renamed from: H */
    private WiFi f16779H;

    /* renamed from: I */
    private Duration f16780I;

    /* renamed from: J */
    private int f16781J;

    /* renamed from: K */
    private C6880c f16782K;

    /* renamed from: L */
    private C6907l f16783L;

    /* renamed from: M */
    private MusicPlayer f16784M;

    /* renamed from: N */
    private C6885e f16785N;

    /* renamed from: O */
    private C6903k f16786O;

    /* renamed from: P */
    private ProtobufList<C6893g> f16787P = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: Q */
    private double f16788Q;

    /* renamed from: R */
    private C6901j f16789R;

    /* renamed from: S */
    private C6878b f16790S;

    /* renamed from: T */
    private C6897h f16791T;

    /* renamed from: U */
    private C6889f f16792U;

    /* renamed from: V */
    private C6876a f16793V;

    /* renamed from: W */
    private C6899i f16794W;

    /* renamed from: X */
    private int f16795X;

    /* renamed from: e */
    private int f16796e;

    /* renamed from: f */
    private int f16797f;

    /* renamed from: g */
    private String f16798g;

    /* renamed from: h */
    private Timestamp f16799h;

    /* renamed from: i */
    private String f16800i;

    /* renamed from: j */
    private String f16801j;

    /* renamed from: k */
    private String f16802k;

    /* renamed from: l */
    private int f16803l;

    /* renamed from: m */
    private int f16804m;

    /* renamed from: n */
    private String f16805n;

    /* renamed from: o */
    private String f16806o;

    /* renamed from: p */
    private String f16807p;

    /* renamed from: q */
    private double f16808q;

    /* renamed from: r */
    private double f16809r;

    /* renamed from: s */
    private double f16810s;

    /* renamed from: t */
    private int f16811t;

    /* renamed from: u */
    private boolean f16812u;

    /* renamed from: v */
    private String f16813v;

    /* renamed from: w */
    private double f16814w;

    /* renamed from: x */
    private double f16815x;

    /* renamed from: y */
    private boolean f16816y;

    /* renamed from: z */
    private boolean f16817z;

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$AlarmClockOrBuilder */
    public interface AlarmClockOrBuilder extends MessageLiteOrBuilder {
        Timestamp getNextFireAt();

        boolean hasNextFireAt();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$BarometerOrBuilder */
    public interface BarometerOrBuilder extends MessageLiteOrBuilder {
        double getPressure();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$BatteryOrBuilder */
    public interface BatteryOrBuilder extends MessageLiteOrBuilder {
        double getLevel();

        C6882b getState();

        int getStateValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$CellularOrBuilder */
    public interface CellularOrBuilder extends MessageLiteOrBuilder {
        int getNetworkOperatorMcc();

        int getNetworkOperatorMnc();

        int getNetworkOperatorName();

        int getRssi();

        int getSimOperatorMcc();

        int getSimOperatorMnc();

        int getSimOperatorName();

        C7500w2 getType();

        int getTypeValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$DeviceLockStateOrBuilder */
    public interface DeviceLockStateOrBuilder extends MessageLiteOrBuilder {
        C6887b getState();

        int getStateValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$DoNotDisturbOrBuilder */
    public interface DoNotDisturbOrBuilder extends MessageLiteOrBuilder {
        C6891b getState();

        int getStateValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$LocationOrBuilder */
    public interface LocationOrBuilder extends MessageLiteOrBuilder {
        double getAltitude();

        double getLatitude();

        double getLongitude();

        double getPrecisionHorizontal();

        double getPrecisionVertical();

        C6895b getProvider();

        int getProviderValue();

        Timestamp getTimestamp();

        boolean hasTimestamp();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MagnetometerOrBuilder */
    public interface MagnetometerOrBuilder extends MessageLiteOrBuilder {
        Timestamp getCreatedAt();

        float getX();

        float getY();

        float getZ();

        boolean hasCreatedAt();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MetadataOrBuilder */
    public interface MetadataOrBuilder extends MessageLiteOrBuilder {
        String getIsGhost();

        ByteString getIsGhostBytes();

        String getPushId();

        ByteString getPushIdBytes();

        String getWatcherUuids(int i);

        ByteString getWatcherUuidsBytes(int i);

        int getWatcherUuidsCount();

        List<String> getWatcherUuidsList();

        String getWillSleepin();

        ByteString getWillSleepinBytes();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer */
    public static final class MusicPlayer extends GeneratedMessageLite<MusicPlayer, C6864a> implements MusicPlayerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final MusicPlayer f16818g = new MusicPlayer();

        /* renamed from: h */
        private static volatile Parser<MusicPlayer> f16819h;

        /* renamed from: e */
        private int f16820e;

        /* renamed from: f */
        private C6865b f16821f;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer$SongOrBuilder */
        public interface SongOrBuilder extends MessageLiteOrBuilder {
            String getAlbum();

            ByteString getAlbumBytes();

            String getArtist();

            ByteString getArtistBytes();

            String getTrack();

            ByteString getTrackBytes();
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer$a */
        public static final class C6864a extends Builder<MusicPlayer, C6864a> implements MusicPlayerOrBuilder {
            /* synthetic */ C6864a(C7477t2 t2Var) {
                this();
            }

            public C6865b getSong() {
                return ((MusicPlayer) this.instance).getSong();
            }

            public C6867c getState() {
                return ((MusicPlayer) this.instance).getState();
            }

            public int getStateValue() {
                return ((MusicPlayer) this.instance).getStateValue();
            }

            public boolean hasSong() {
                return ((MusicPlayer) this.instance).hasSong();
            }

            private C6864a() {
                super(MusicPlayer.f16818g);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer$b */
        public static final class C6865b extends GeneratedMessageLite<C6865b, C6866a> implements SongOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: h */
            public static final C6865b f16822h = new C6865b();

            /* renamed from: i */
            private static volatile Parser<C6865b> f16823i;

            /* renamed from: e */
            private String f16824e;

            /* renamed from: f */
            private String f16825f;

            /* renamed from: g */
            private String f16826g;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer$b$a */
            public static final class C6866a extends Builder<C6865b, C6866a> implements SongOrBuilder {
                /* synthetic */ C6866a(C7477t2 t2Var) {
                    this();
                }

                public String getAlbum() {
                    return ((C6865b) this.instance).getAlbum();
                }

                public ByteString getAlbumBytes() {
                    return ((C6865b) this.instance).getAlbumBytes();
                }

                public String getArtist() {
                    return ((C6865b) this.instance).getArtist();
                }

                public ByteString getArtistBytes() {
                    return ((C6865b) this.instance).getArtistBytes();
                }

                public String getTrack() {
                    return ((C6865b) this.instance).getTrack();
                }

                public ByteString getTrackBytes() {
                    return ((C6865b) this.instance).getTrackBytes();
                }

                private C6866a() {
                    super(C6865b.f16822h);
                }
            }

            static {
                f16822h.makeImmutable();
            }

            private C6865b() {
                String str = "";
                this.f16824e = str;
                this.f16825f = str;
                this.f16826g = str;
            }

            public static C6865b getDefaultInstance() {
                return f16822h;
            }

            public static Parser<C6865b> parser() {
                return f16822h.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C6865b();
                    case 2:
                        return f16822h;
                    case 3:
                        return null;
                    case 4:
                        return new C6866a(null);
                    case 5:
                        Visitor visitor = (Visitor) obj;
                        C6865b bVar = (C6865b) obj2;
                        this.f16824e = visitor.visitString(!this.f16824e.isEmpty(), this.f16824e, !bVar.f16824e.isEmpty(), bVar.f16824e);
                        this.f16825f = visitor.visitString(!this.f16825f.isEmpty(), this.f16825f, !bVar.f16825f.isEmpty(), bVar.f16825f);
                        this.f16826g = visitor.visitString(!this.f16826g.isEmpty(), this.f16826g, true ^ bVar.f16826g.isEmpty(), bVar.f16826g);
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
                                        this.f16824e = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 18) {
                                        this.f16825f = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        this.f16826g = codedInputStream.readStringRequireUtf8();
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
                        if (f16823i == null) {
                            synchronized (C6865b.class) {
                                if (f16823i == null) {
                                    f16823i = new DefaultInstanceBasedParser(f16822h);
                                }
                            }
                        }
                        return f16823i;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f16822h;
            }

            public String getAlbum() {
                return this.f16825f;
            }

            public ByteString getAlbumBytes() {
                return ByteString.copyFromUtf8(this.f16825f);
            }

            public String getArtist() {
                return this.f16824e;
            }

            public ByteString getArtistBytes() {
                return ByteString.copyFromUtf8(this.f16824e);
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!this.f16824e.isEmpty()) {
                    i2 = 0 + CodedOutputStream.computeStringSize(1, getArtist());
                }
                if (!this.f16825f.isEmpty()) {
                    i2 += CodedOutputStream.computeStringSize(2, getAlbum());
                }
                if (!this.f16826g.isEmpty()) {
                    i2 += CodedOutputStream.computeStringSize(3, getTrack());
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public String getTrack() {
                return this.f16826g;
            }

            public ByteString getTrackBytes() {
                return ByteString.copyFromUtf8(this.f16826g);
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.f16824e.isEmpty()) {
                    codedOutputStream.writeString(1, getArtist());
                }
                if (!this.f16825f.isEmpty()) {
                    codedOutputStream.writeString(2, getAlbum());
                }
                if (!this.f16826g.isEmpty()) {
                    codedOutputStream.writeString(3, getTrack());
                }
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer$c */
        public enum C6867c implements EnumLite {
            STATE_UNKNOWN(0),
            STATE_STOPPED(1),
            STATE_PAUSED(2),
            STATE_PLAYING(3),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16833e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayer$c$a */
            class C6868a implements EnumLiteMap<C6867c> {
                C6868a() {
                }

                public C6867c findValueByNumber(int i) {
                    return C6867c.m17607a(i);
                }
            }

            static {
                new C6868a();
            }

            private C6867c(int i) {
                this.f16833e = i;
            }

            /* renamed from: a */
            public static C6867c m17607a(int i) {
                if (i == 0) {
                    return STATE_UNKNOWN;
                }
                if (i == 1) {
                    return STATE_STOPPED;
                }
                if (i == 2) {
                    return STATE_PAUSED;
                }
                if (i != 3) {
                    return null;
                }
                return STATE_PLAYING;
            }

            public final int getNumber() {
                return this.f16833e;
            }
        }

        static {
            f16818g.makeImmutable();
        }

        private MusicPlayer() {
        }

        public static MusicPlayer getDefaultInstance() {
            return f16818g;
        }

        public static Parser<MusicPlayer> parser() {
            return f16818g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MusicPlayer();
                case 2:
                    return f16818g;
                case 3:
                    return null;
                case 4:
                    return new C6864a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    MusicPlayer musicPlayer = (MusicPlayer) obj2;
                    boolean z2 = this.f16820e != 0;
                    int i = this.f16820e;
                    if (musicPlayer.f16820e != 0) {
                        z = true;
                    }
                    this.f16820e = visitor.visitInt(z2, i, z, musicPlayer.f16820e);
                    this.f16821f = (C6865b) visitor.visitMessage(this.f16821f, musicPlayer.f16821f);
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
                                    this.f16820e = codedInputStream.readEnum();
                                } else if (readTag == 18) {
                                    Builder builder = this.f16821f != null ? (C6866a) this.f16821f.toBuilder() : null;
                                    this.f16821f = (C6865b) codedInputStream.readMessage(C6865b.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16821f);
                                        this.f16821f = (C6865b) builder.buildPartial();
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
                    if (f16819h == null) {
                        synchronized (MusicPlayer.class) {
                            if (f16819h == null) {
                                f16819h = new DefaultInstanceBasedParser(f16818g);
                            }
                        }
                    }
                    return f16819h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16818g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16820e != C6867c.STATE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16820e);
            }
            if (this.f16821f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getSong());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6865b getSong() {
            C6865b bVar = this.f16821f;
            return bVar == null ? C6865b.getDefaultInstance() : bVar;
        }

        public C6867c getState() {
            C6867c a = C6867c.m17607a(this.f16820e);
            return a == null ? C6867c.UNRECOGNIZED : a;
        }

        public int getStateValue() {
            return this.f16820e;
        }

        public boolean hasSong() {
            return this.f16821f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16820e != C6867c.STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16820e);
            }
            if (this.f16821f != null) {
                codedOutputStream.writeMessage(2, getSong());
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$MusicPlayerOrBuilder */
    public interface MusicPlayerOrBuilder extends MessageLiteOrBuilder {
        C6865b getSong();

        C6867c getState();

        int getStateValue();

        boolean hasSong();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$PedometerOrBuilder */
    public interface PedometerOrBuilder extends MessageLiteOrBuilder {
        int getNumberOfSteps();

        Timestamp getSince();

        boolean hasSince();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$PhoneStateOrBuilder */
    public interface PhoneStateOrBuilder extends MessageLiteOrBuilder {
        C6905b getState();

        int getStateValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$RingerOrBuilder */
    public interface RingerOrBuilder extends MessageLiteOrBuilder {
        int getLevel();

        C6909b getMode();

        int getModeValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi */
    public static final class WiFi extends GeneratedMessageLite<WiFi, C6873b> implements WiFiOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final WiFi f16834i = new WiFi();

        /* renamed from: j */
        private static volatile Parser<WiFi> f16835j;

        /* renamed from: e */
        private int f16836e;

        /* renamed from: f */
        private int f16837f;

        /* renamed from: g */
        private boolean f16838g;

        /* renamed from: h */
        private ProtobufList<C6869a> f16839h = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$AccessPointOrBuilder */
        public interface AccessPointOrBuilder extends MessageLiteOrBuilder {
            C6870a getBand();

            int getBandValue();

            String getBssid();

            ByteString getBssidBytes();

            int getChannel();

            boolean getIsConnected();

            Timestamp getLastSeenAt();

            int getRssi();

            String getSsid();

            ByteString getSsidBytes();

            boolean hasLastSeenAt();
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$a */
        public static final class C6869a extends GeneratedMessageLite<C6869a, C6872b> implements AccessPointOrBuilder {
            /* access modifiers changed from: private */

            /* renamed from: l */
            public static final C6869a f16840l = new C6869a();

            /* renamed from: m */
            private static volatile Parser<C6869a> f16841m;

            /* renamed from: e */
            private boolean f16842e;

            /* renamed from: f */
            private String f16843f;

            /* renamed from: g */
            private String f16844g;

            /* renamed from: h */
            private int f16845h;

            /* renamed from: i */
            private int f16846i;

            /* renamed from: j */
            private int f16847j;

            /* renamed from: k */
            private Timestamp f16848k;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$a$a */
            public enum C6870a implements EnumLite {
                BAND_UNKNOWN(0),
                BAND_2_4G(1),
                BAND_5G(2),
                UNRECOGNIZED(-1);
                

                /* renamed from: e */
                private final int f16854e;

                /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$a$a$a */
                class C6871a implements EnumLiteMap<C6870a> {
                    C6871a() {
                    }

                    public C6870a findValueByNumber(int i) {
                        return C6870a.m17609a(i);
                    }
                }

                static {
                    new C6871a();
                }

                private C6870a(int i) {
                    this.f16854e = i;
                }

                /* renamed from: a */
                public static C6870a m17609a(int i) {
                    if (i == 0) {
                        return BAND_UNKNOWN;
                    }
                    if (i == 1) {
                        return BAND_2_4G;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return BAND_5G;
                }

                public final int getNumber() {
                    return this.f16854e;
                }
            }

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$a$b */
            public static final class C6872b extends Builder<C6869a, C6872b> implements AccessPointOrBuilder {
                /* synthetic */ C6872b(C7477t2 t2Var) {
                    this();
                }

                public C6870a getBand() {
                    return ((C6869a) this.instance).getBand();
                }

                public int getBandValue() {
                    return ((C6869a) this.instance).getBandValue();
                }

                public String getBssid() {
                    return ((C6869a) this.instance).getBssid();
                }

                public ByteString getBssidBytes() {
                    return ((C6869a) this.instance).getBssidBytes();
                }

                public int getChannel() {
                    return ((C6869a) this.instance).getChannel();
                }

                public boolean getIsConnected() {
                    return ((C6869a) this.instance).getIsConnected();
                }

                public Timestamp getLastSeenAt() {
                    return ((C6869a) this.instance).getLastSeenAt();
                }

                public int getRssi() {
                    return ((C6869a) this.instance).getRssi();
                }

                public String getSsid() {
                    return ((C6869a) this.instance).getSsid();
                }

                public ByteString getSsidBytes() {
                    return ((C6869a) this.instance).getSsidBytes();
                }

                public boolean hasLastSeenAt() {
                    return ((C6869a) this.instance).hasLastSeenAt();
                }

                private C6872b() {
                    super(C6869a.f16840l);
                }
            }

            static {
                f16840l.makeImmutable();
            }

            private C6869a() {
                String str = "";
                this.f16843f = str;
                this.f16844g = str;
            }

            public static Parser<C6869a> parser() {
                return f16840l.getParserForType();
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new C6869a();
                    case 2:
                        return f16840l;
                    case 3:
                        return null;
                    case 4:
                        return new C6872b(null);
                    case 5:
                        Visitor visitor = (Visitor) obj;
                        C6869a aVar = (C6869a) obj2;
                        boolean z2 = this.f16842e;
                        boolean z3 = aVar.f16842e;
                        this.f16842e = visitor.visitBoolean(z2, z2, z3, z3);
                        this.f16843f = visitor.visitString(!this.f16843f.isEmpty(), this.f16843f, !aVar.f16843f.isEmpty(), aVar.f16843f);
                        this.f16844g = visitor.visitString(!this.f16844g.isEmpty(), this.f16844g, !aVar.f16844g.isEmpty(), aVar.f16844g);
                        this.f16845h = visitor.visitInt(this.f16845h != 0, this.f16845h, aVar.f16845h != 0, aVar.f16845h);
                        this.f16846i = visitor.visitInt(this.f16846i != 0, this.f16846i, aVar.f16846i != 0, aVar.f16846i);
                        boolean z4 = this.f16847j != 0;
                        int i = this.f16847j;
                        if (aVar.f16847j != 0) {
                            z = true;
                        }
                        this.f16847j = visitor.visitInt(z4, i, z, aVar.f16847j);
                        this.f16848k = (Timestamp) visitor.visitMessage(this.f16848k, aVar.f16848k);
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
                                        this.f16842e = codedInputStream.readBool();
                                    } else if (readTag == 18) {
                                        this.f16843f = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        this.f16844g = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 32) {
                                        this.f16845h = codedInputStream.readInt32();
                                    } else if (readTag == 40) {
                                        this.f16846i = codedInputStream.readInt32();
                                    } else if (readTag == 48) {
                                        this.f16847j = codedInputStream.readEnum();
                                    } else if (readTag == 58) {
                                        Builder builder = this.f16848k != null ? (Timestamp.Builder) this.f16848k.toBuilder() : null;
                                        this.f16848k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                        if (builder != null) {
                                            builder.mergeFrom(this.f16848k);
                                            this.f16848k = (Timestamp) builder.buildPartial();
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
                        if (f16841m == null) {
                            synchronized (C6869a.class) {
                                if (f16841m == null) {
                                    f16841m = new DefaultInstanceBasedParser(f16840l);
                                }
                            }
                        }
                        return f16841m;
                    default:
                        throw new UnsupportedOperationException();
                }
                return f16840l;
            }

            public C6870a getBand() {
                C6870a a = C6870a.m17609a(this.f16847j);
                return a == null ? C6870a.UNRECOGNIZED : a;
            }

            public int getBandValue() {
                return this.f16847j;
            }

            public String getBssid() {
                return this.f16843f;
            }

            public ByteString getBssidBytes() {
                return ByteString.copyFromUtf8(this.f16843f);
            }

            public int getChannel() {
                return this.f16846i;
            }

            public boolean getIsConnected() {
                return this.f16842e;
            }

            public Timestamp getLastSeenAt() {
                Timestamp timestamp = this.f16848k;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public int getRssi() {
                return this.f16845h;
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                boolean z = this.f16842e;
                if (z) {
                    i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
                }
                if (!this.f16843f.isEmpty()) {
                    i2 += CodedOutputStream.computeStringSize(2, getBssid());
                }
                if (!this.f16844g.isEmpty()) {
                    i2 += CodedOutputStream.computeStringSize(3, getSsid());
                }
                int i3 = this.f16845h;
                if (i3 != 0) {
                    i2 += CodedOutputStream.computeInt32Size(4, i3);
                }
                int i4 = this.f16846i;
                if (i4 != 0) {
                    i2 += CodedOutputStream.computeInt32Size(5, i4);
                }
                if (this.f16847j != C6870a.BAND_UNKNOWN.getNumber()) {
                    i2 += CodedOutputStream.computeEnumSize(6, this.f16847j);
                }
                if (this.f16848k != null) {
                    i2 += CodedOutputStream.computeMessageSize(7, getLastSeenAt());
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public String getSsid() {
                return this.f16844g;
            }

            public ByteString getSsidBytes() {
                return ByteString.copyFromUtf8(this.f16844g);
            }

            public boolean hasLastSeenAt() {
                return this.f16848k != null;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                boolean z = this.f16842e;
                if (z) {
                    codedOutputStream.writeBool(1, z);
                }
                if (!this.f16843f.isEmpty()) {
                    codedOutputStream.writeString(2, getBssid());
                }
                if (!this.f16844g.isEmpty()) {
                    codedOutputStream.writeString(3, getSsid());
                }
                int i = this.f16845h;
                if (i != 0) {
                    codedOutputStream.writeInt32(4, i);
                }
                int i2 = this.f16846i;
                if (i2 != 0) {
                    codedOutputStream.writeInt32(5, i2);
                }
                if (this.f16847j != C6870a.BAND_UNKNOWN.getNumber()) {
                    codedOutputStream.writeEnum(6, this.f16847j);
                }
                if (this.f16848k != null) {
                    codedOutputStream.writeMessage(7, getLastSeenAt());
                }
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$b */
        public static final class C6873b extends Builder<WiFi, C6873b> implements WiFiOrBuilder {
            /* synthetic */ C6873b(C7477t2 t2Var) {
                this();
            }

            public C6869a getAccessPoints(int i) {
                return ((WiFi) this.instance).getAccessPoints(i);
            }

            public int getAccessPointsCount() {
                return ((WiFi) this.instance).getAccessPointsCount();
            }

            public List<C6869a> getAccessPointsList() {
                return Collections.unmodifiableList(((WiFi) this.instance).getAccessPointsList());
            }

            public boolean getIsScanning() {
                return ((WiFi) this.instance).getIsScanning();
            }

            public C6874c getState() {
                return ((WiFi) this.instance).getState();
            }

            public int getStateValue() {
                return ((WiFi) this.instance).getStateValue();
            }

            private C6873b() {
                super(WiFi.f16834i);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$c */
        public enum C6874c implements EnumLite {
            STATE_UNKNOWN(0),
            STATE_DISABLED(1),
            STATE_ENABLED(2),
            STATE_CONNECTED(3),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16861e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFi$c$a */
            class C6875a implements EnumLiteMap<C6874c> {
                C6875a() {
                }

                public C6874c findValueByNumber(int i) {
                    return C6874c.m17610a(i);
                }
            }

            static {
                new C6875a();
            }

            private C6874c(int i) {
                this.f16861e = i;
            }

            /* renamed from: a */
            public static C6874c m17610a(int i) {
                if (i == 0) {
                    return STATE_UNKNOWN;
                }
                if (i == 1) {
                    return STATE_DISABLED;
                }
                if (i == 2) {
                    return STATE_ENABLED;
                }
                if (i != 3) {
                    return null;
                }
                return STATE_CONNECTED;
            }

            public final int getNumber() {
                return this.f16861e;
            }
        }

        static {
            f16834i.makeImmutable();
        }

        private WiFi() {
        }

        public static WiFi getDefaultInstance() {
            return f16834i;
        }

        public static Parser<WiFi> parser() {
            return f16834i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WiFi();
                case 2:
                    return f16834i;
                case 3:
                    this.f16839h.makeImmutable();
                    return null;
                case 4:
                    return new C6873b(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    WiFi wiFi = (WiFi) obj2;
                    boolean z2 = this.f16837f != 0;
                    int i = this.f16837f;
                    if (wiFi.f16837f != 0) {
                        z = true;
                    }
                    this.f16837f = visitor.visitInt(z2, i, z, wiFi.f16837f);
                    boolean z3 = this.f16838g;
                    boolean z4 = wiFi.f16838g;
                    this.f16838g = visitor.visitBoolean(z3, z3, z4, z4);
                    this.f16839h = visitor.visitList(this.f16839h, wiFi.f16839h);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f16836e |= wiFi.f16836e;
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
                                    this.f16837f = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.f16838g = codedInputStream.readBool();
                                } else if (readTag == 26) {
                                    if (!this.f16839h.isModifiable()) {
                                        this.f16839h = GeneratedMessageLite.mutableCopy(this.f16839h);
                                    }
                                    this.f16839h.add(codedInputStream.readMessage(C6869a.parser(), extensionRegistryLite));
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
                    if (f16835j == null) {
                        synchronized (WiFi.class) {
                            if (f16835j == null) {
                                f16835j = new DefaultInstanceBasedParser(f16834i);
                            }
                        }
                    }
                    return f16835j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16834i;
        }

        public C6869a getAccessPoints(int i) {
            return (C6869a) this.f16839h.get(i);
        }

        public int getAccessPointsCount() {
            return this.f16839h.size();
        }

        public List<C6869a> getAccessPointsList() {
            return this.f16839h;
        }

        public boolean getIsScanning() {
            return this.f16838g;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.f16837f != C6874c.STATE_UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f16837f) + 0 : 0;
            boolean z = this.f16838g;
            if (z) {
                computeEnumSize += CodedOutputStream.computeBoolSize(2, z);
            }
            for (int i2 = 0; i2 < this.f16839h.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f16839h.get(i2));
            }
            this.memoizedSerializedSize = computeEnumSize;
            return computeEnumSize;
        }

        public C6874c getState() {
            C6874c a = C6874c.m17610a(this.f16837f);
            return a == null ? C6874c.UNRECOGNIZED : a;
        }

        public int getStateValue() {
            return this.f16837f;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16837f != C6874c.STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16837f);
            }
            boolean z = this.f16838g;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            for (int i = 0; i < this.f16839h.size(); i++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f16839h.get(i));
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$WiFiOrBuilder */
    public interface WiFiOrBuilder extends MessageLiteOrBuilder {
        C6869a getAccessPoints(int i);

        int getAccessPointsCount();

        List<C6869a> getAccessPointsList();

        boolean getIsScanning();

        C6874c getState();

        int getStateValue();
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$a */
    public static final class C6876a extends GeneratedMessageLite<C6876a, C6877a> implements AlarmClockOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6876a f16862f = new C6876a();

        /* renamed from: g */
        private static volatile Parser<C6876a> f16863g;

        /* renamed from: e */
        private Timestamp f16864e;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$a$a */
        public static final class C6877a extends Builder<C6876a, C6877a> implements AlarmClockOrBuilder {
            /* synthetic */ C6877a(C7477t2 t2Var) {
                this();
            }

            public Timestamp getNextFireAt() {
                return ((C6876a) this.instance).getNextFireAt();
            }

            public boolean hasNextFireAt() {
                return ((C6876a) this.instance).hasNextFireAt();
            }

            private C6877a() {
                super(C6876a.f16862f);
            }
        }

        static {
            f16862f.makeImmutable();
        }

        private C6876a() {
        }

        public static C6876a getDefaultInstance() {
            return f16862f;
        }

        public static Parser<C6876a> parser() {
            return f16862f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6876a();
                case 2:
                    return f16862f;
                case 3:
                    return null;
                case 4:
                    return new C6877a(null);
                case 5:
                    this.f16864e = (Timestamp) ((Visitor) obj).visitMessage(this.f16864e, ((C6876a) obj2).f16864e);
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
                                    Builder builder = this.f16864e != null ? (Timestamp.Builder) this.f16864e.toBuilder() : null;
                                    this.f16864e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16864e);
                                        this.f16864e = (Timestamp) builder.buildPartial();
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
                    if (f16863g == null) {
                        synchronized (C6876a.class) {
                            if (f16863g == null) {
                                f16863g = new DefaultInstanceBasedParser(f16862f);
                            }
                        }
                    }
                    return f16863g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16862f;
        }

        public Timestamp getNextFireAt() {
            Timestamp timestamp = this.f16864e;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16864e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getNextFireAt());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasNextFireAt() {
            return this.f16864e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16864e != null) {
                codedOutputStream.writeMessage(1, getNextFireAt());
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$b */
    public static final class C6878b extends GeneratedMessageLite<C6878b, C6879a> implements BarometerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6878b f16865f = new C6878b();

        /* renamed from: g */
        private static volatile Parser<C6878b> f16866g;

        /* renamed from: e */
        private double f16867e;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$b$a */
        public static final class C6879a extends Builder<C6878b, C6879a> implements BarometerOrBuilder {
            /* synthetic */ C6879a(C7477t2 t2Var) {
                this();
            }

            public double getPressure() {
                return ((C6878b) this.instance).getPressure();
            }

            private C6879a() {
                super(C6878b.f16865f);
            }
        }

        static {
            f16865f.makeImmutable();
        }

        private C6878b() {
        }

        public static C6878b getDefaultInstance() {
            return f16865f;
        }

        public static Parser<C6878b> parser() {
            return f16865f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6878b();
                case 2:
                    return f16865f;
                case 3:
                    return null;
                case 4:
                    return new C6879a(null);
                case 5:
                    C6878b bVar = (C6878b) obj2;
                    this.f16867e = ((Visitor) obj).visitDouble(this.f16867e != 0.0d, this.f16867e, bVar.f16867e != 0.0d, bVar.f16867e);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 9) {
                                    this.f16867e = codedInputStream.readDouble();
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
                    if (f16866g == null) {
                        synchronized (C6878b.class) {
                            if (f16866g == null) {
                                f16866g = new DefaultInstanceBasedParser(f16865f);
                            }
                        }
                    }
                    return f16866g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16865f;
        }

        public double getPressure() {
            return this.f16867e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            double d = this.f16867e;
            if (d != 0.0d) {
                i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            double d = this.f16867e;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(1, d);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$c */
    public static final class C6880c extends GeneratedMessageLite<C6880c, C6881a> implements BatteryOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6880c f16868g = new C6880c();

        /* renamed from: h */
        private static volatile Parser<C6880c> f16869h;

        /* renamed from: e */
        private int f16870e;

        /* renamed from: f */
        private double f16871f;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$c$a */
        public static final class C6881a extends Builder<C6880c, C6881a> implements BatteryOrBuilder {
            /* synthetic */ C6881a(C7477t2 t2Var) {
                this();
            }

            public double getLevel() {
                return ((C6880c) this.instance).getLevel();
            }

            public C6882b getState() {
                return ((C6880c) this.instance).getState();
            }

            public int getStateValue() {
                return ((C6880c) this.instance).getStateValue();
            }

            private C6881a() {
                super(C6880c.f16868g);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$c$b */
        public enum C6882b implements EnumLite {
            STATE_UNKNOWN(0),
            STATE_DISCARCHING(1),
            STATE_CHARGING(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16877e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$c$b$a */
            class C6883a implements EnumLiteMap<C6882b> {
                C6883a() {
                }

                public C6882b findValueByNumber(int i) {
                    return C6882b.m17614a(i);
                }
            }

            static {
                new C6883a();
            }

            private C6882b(int i) {
                this.f16877e = i;
            }

            /* renamed from: a */
            public static C6882b m17614a(int i) {
                if (i == 0) {
                    return STATE_UNKNOWN;
                }
                if (i == 1) {
                    return STATE_DISCARCHING;
                }
                if (i != 2) {
                    return null;
                }
                return STATE_CHARGING;
            }

            public final int getNumber() {
                return this.f16877e;
            }
        }

        static {
            f16868g.makeImmutable();
        }

        private C6880c() {
        }

        public static C6880c getDefaultInstance() {
            return f16868g;
        }

        public static Parser<C6880c> parser() {
            return f16868g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6880c();
                case 2:
                    return f16868g;
                case 3:
                    return null;
                case 4:
                    return new C6881a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6880c cVar = (C6880c) obj2;
                    this.f16870e = visitor.visitInt(this.f16870e != 0, this.f16870e, cVar.f16870e != 0, cVar.f16870e);
                    this.f16871f = visitor.visitDouble(this.f16871f != 0.0d, this.f16871f, cVar.f16871f != 0.0d, cVar.f16871f);
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
                                    this.f16870e = codedInputStream.readEnum();
                                } else if (readTag == 17) {
                                    this.f16871f = codedInputStream.readDouble();
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
                    if (f16869h == null) {
                        synchronized (C6880c.class) {
                            if (f16869h == null) {
                                f16869h = new DefaultInstanceBasedParser(f16868g);
                            }
                        }
                    }
                    return f16869h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16868g;
        }

        public double getLevel() {
            return this.f16871f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16870e != C6882b.STATE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16870e);
            }
            double d = this.f16871f;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6882b getState() {
            C6882b a = C6882b.m17614a(this.f16870e);
            return a == null ? C6882b.UNRECOGNIZED : a;
        }

        public int getStateValue() {
            return this.f16870e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16870e != C6882b.STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16870e);
            }
            double d = this.f16871f;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(2, d);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$d */
    public static final class C6884d extends Builder<TrackingContextProto$TrackingContext, C6884d> implements TrackingContextProto$TrackingContextOrBuilder {
        /* synthetic */ C6884d(C7477t2 t2Var) {
            this();
        }

        public int getActivity() {
            return ((TrackingContextProto$TrackingContext) this.instance).getActivity();
        }

        public C6876a getAlarmClock() {
            return ((TrackingContextProto$TrackingContext) this.instance).getAlarmClock();
        }

        public double getAltitude() {
            return ((TrackingContextProto$TrackingContext) this.instance).getAltitude();
        }

        public C6878b getBarometer() {
            return ((TrackingContextProto$TrackingContext) this.instance).getBarometer();
        }

        public C6880c getBattery() {
            return ((TrackingContextProto$TrackingContext) this.instance).getBattery();
        }

        public int getBatteryLevel() {
            return ((TrackingContextProto$TrackingContext) this.instance).getBatteryLevel();
        }

        public double getBearing() {
            return ((TrackingContextProto$TrackingContext) this.instance).getBearing();
        }

        public String getCellularNetworkCountryCode() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkCountryCode();
        }

        public ByteString getCellularNetworkCountryCodeBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkCountryCodeBytes();
        }

        public String getCellularNetworkName() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkName();
        }

        public ByteString getCellularNetworkNameBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkNameBytes();
        }

        public int getCellularNetworkStrength() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkStrength();
        }

        public C7484u2 getCellularNetworkType() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkType();
        }

        public int getCellularNetworkTypeValue() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCellularNetworkTypeValue();
        }

        public Duration getClock() {
            return ((TrackingContextProto$TrackingContext) this.instance).getClock();
        }

        public Timestamp getCreatedAt() {
            return ((TrackingContextProto$TrackingContext) this.instance).getCreatedAt();
        }

        public Timestamp getDeviceTimestamp() {
            return ((TrackingContextProto$TrackingContext) this.instance).getDeviceTimestamp();
        }

        public String getDeviceUuid() {
            return ((TrackingContextProto$TrackingContext) this.instance).getDeviceUuid();
        }

        public ByteString getDeviceUuidBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getDeviceUuidBytes();
        }

        public C6889f getDnd() {
            return ((TrackingContextProto$TrackingContext) this.instance).getDnd();
        }

        public int getFloor() {
            return ((TrackingContextProto$TrackingContext) this.instance).getFloor();
        }

        public C7492v2 getGhostType() {
            return ((TrackingContextProto$TrackingContext) this.instance).getGhostType();
        }

        public int getGhostTypeValue() {
            return ((TrackingContextProto$TrackingContext) this.instance).getGhostTypeValue();
        }

        public double getHeading() {
            return ((TrackingContextProto$TrackingContext) this.instance).getHeading();
        }

        public double getHeadingPrecision() {
            return ((TrackingContextProto$TrackingContext) this.instance).getHeadingPrecision();
        }

        public double getHorizontalPrecision() {
            return ((TrackingContextProto$TrackingContext) this.instance).getHorizontalPrecision();
        }

        public String getIp() {
            return ((TrackingContextProto$TrackingContext) this.instance).getIp();
        }

        public ByteString getIpBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getIpBytes();
        }

        public boolean getIsCharging() {
            return ((TrackingContextProto$TrackingContext) this.instance).getIsCharging();
        }

        public boolean getIsForeground() {
            return ((TrackingContextProto$TrackingContext) this.instance).getIsForeground();
        }

        public boolean getIsGhost() {
            return ((TrackingContextProto$TrackingContext) this.instance).getIsGhost();
        }

        public double getLatitude() {
            return ((TrackingContextProto$TrackingContext) this.instance).getLatitude();
        }

        public C6893g getLocations(int i) {
            return ((TrackingContextProto$TrackingContext) this.instance).getLocations(i);
        }

        public int getLocationsCount() {
            return ((TrackingContextProto$TrackingContext) this.instance).getLocationsCount();
        }

        public List<C6893g> getLocationsList() {
            return Collections.unmodifiableList(((TrackingContextProto$TrackingContext) this.instance).getLocationsList());
        }

        public C6885e getLockState() {
            return ((TrackingContextProto$TrackingContext) this.instance).getLockState();
        }

        public double getLongitude() {
            return ((TrackingContextProto$TrackingContext) this.instance).getLongitude();
        }

        public C6897h getMagnetometer() {
            return ((TrackingContextProto$TrackingContext) this.instance).getMagnetometer();
        }

        public C6899i getMeta() {
            return ((TrackingContextProto$TrackingContext) this.instance).getMeta();
        }

        public MusicPlayer getMusicPlayer() {
            return ((TrackingContextProto$TrackingContext) this.instance).getMusicPlayer();
        }

        public C6901j getPedometer() {
            return ((TrackingContextProto$TrackingContext) this.instance).getPedometer();
        }

        public C6903k getPhoneState() {
            return ((TrackingContextProto$TrackingContext) this.instance).getPhoneState();
        }

        public double getPressure() {
            return ((TrackingContextProto$TrackingContext) this.instance).getPressure();
        }

        public C6907l getRinger() {
            return ((TrackingContextProto$TrackingContext) this.instance).getRinger();
        }

        public int getSeq() {
            return ((TrackingContextProto$TrackingContext) this.instance).getSeq();
        }

        public double getSpeed() {
            return ((TrackingContextProto$TrackingContext) this.instance).getSpeed();
        }

        public String getUserUuid() {
            return ((TrackingContextProto$TrackingContext) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((TrackingContextProto$TrackingContext) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getUuidBytes();
        }

        public double getVerticalPrecision() {
            return ((TrackingContextProto$TrackingContext) this.instance).getVerticalPrecision();
        }

        public WiFi getWifi() {
            return ((TrackingContextProto$TrackingContext) this.instance).getWifi();
        }

        public String getWifiNetworkBssid() {
            return ((TrackingContextProto$TrackingContext) this.instance).getWifiNetworkBssid();
        }

        public ByteString getWifiNetworkBssidBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getWifiNetworkBssidBytes();
        }

        public String getWifiNetworkName() {
            return ((TrackingContextProto$TrackingContext) this.instance).getWifiNetworkName();
        }

        public ByteString getWifiNetworkNameBytes() {
            return ((TrackingContextProto$TrackingContext) this.instance).getWifiNetworkNameBytes();
        }

        public boolean hasAlarmClock() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasAlarmClock();
        }

        public boolean hasBarometer() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasBarometer();
        }

        public boolean hasBattery() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasBattery();
        }

        public boolean hasClock() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasClock();
        }

        public boolean hasCreatedAt() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasCreatedAt();
        }

        public boolean hasDeviceTimestamp() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasDeviceTimestamp();
        }

        public boolean hasDnd() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasDnd();
        }

        public boolean hasLockState() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasLockState();
        }

        public boolean hasMagnetometer() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasMagnetometer();
        }

        public boolean hasMeta() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasMeta();
        }

        public boolean hasMusicPlayer() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasMusicPlayer();
        }

        public boolean hasPedometer() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasPedometer();
        }

        public boolean hasPhoneState() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasPhoneState();
        }

        public boolean hasRinger() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasRinger();
        }

        public boolean hasWifi() {
            return ((TrackingContextProto$TrackingContext) this.instance).hasWifi();
        }

        private C6884d() {
            super(TrackingContextProto$TrackingContext.f16770Y);
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$e */
    public static final class C6885e extends GeneratedMessageLite<C6885e, C6886a> implements DeviceLockStateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6885e f16878f = new C6885e();

        /* renamed from: g */
        private static volatile Parser<C6885e> f16879g;

        /* renamed from: e */
        private int f16880e;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$e$a */
        public static final class C6886a extends Builder<C6885e, C6886a> implements DeviceLockStateOrBuilder {
            /* synthetic */ C6886a(C7477t2 t2Var) {
                this();
            }

            public C6887b getState() {
                return ((C6885e) this.instance).getState();
            }

            public int getStateValue() {
                return ((C6885e) this.instance).getStateValue();
            }

            private C6886a() {
                super(C6885e.f16878f);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$e$b */
        public enum C6887b implements EnumLite {
            STATE_UNKNOWN(0),
            STATE_LOCKED(1),
            STATE_UNLOCKED(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16886e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$e$b$a */
            class C6888a implements EnumLiteMap<C6887b> {
                C6888a() {
                }

                public C6887b findValueByNumber(int i) {
                    return C6887b.m17616a(i);
                }
            }

            static {
                new C6888a();
            }

            private C6887b(int i) {
                this.f16886e = i;
            }

            /* renamed from: a */
            public static C6887b m17616a(int i) {
                if (i == 0) {
                    return STATE_UNKNOWN;
                }
                if (i == 1) {
                    return STATE_LOCKED;
                }
                if (i != 2) {
                    return null;
                }
                return STATE_UNLOCKED;
            }

            public final int getNumber() {
                return this.f16886e;
            }
        }

        static {
            f16878f.makeImmutable();
        }

        private C6885e() {
        }

        public static C6885e getDefaultInstance() {
            return f16878f;
        }

        public static Parser<C6885e> parser() {
            return f16878f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6885e();
                case 2:
                    return f16878f;
                case 3:
                    return null;
                case 4:
                    return new C6886a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6885e eVar = (C6885e) obj2;
                    boolean z2 = this.f16880e != 0;
                    int i = this.f16880e;
                    if (eVar.f16880e != 0) {
                        z = true;
                    }
                    this.f16880e = visitor.visitInt(z2, i, z, eVar.f16880e);
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
                                    this.f16880e = codedInputStream.readEnum();
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
                    if (f16879g == null) {
                        synchronized (C6885e.class) {
                            if (f16879g == null) {
                                f16879g = new DefaultInstanceBasedParser(f16878f);
                            }
                        }
                    }
                    return f16879g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16878f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16880e != C6887b.STATE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16880e);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6887b getState() {
            C6887b a = C6887b.m17616a(this.f16880e);
            return a == null ? C6887b.UNRECOGNIZED : a;
        }

        public int getStateValue() {
            return this.f16880e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16880e != C6887b.STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16880e);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$f */
    public static final class C6889f extends GeneratedMessageLite<C6889f, C6890a> implements DoNotDisturbOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6889f f16887f = new C6889f();

        /* renamed from: g */
        private static volatile Parser<C6889f> f16888g;

        /* renamed from: e */
        private int f16889e;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$f$a */
        public static final class C6890a extends Builder<C6889f, C6890a> implements DoNotDisturbOrBuilder {
            /* synthetic */ C6890a(C7477t2 t2Var) {
                this();
            }

            public C6891b getState() {
                return ((C6889f) this.instance).getState();
            }

            public int getStateValue() {
                return ((C6889f) this.instance).getStateValue();
            }

            private C6890a() {
                super(C6889f.f16887f);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$f$b */
        public enum C6891b implements EnumLite {
            STATE_FILTER_UNKNOWN(0),
            STATE_FILTER_NONE(1),
            STATE_FILTER_PRIORITY(2),
            STATE_FILTER_ALARMS(3),
            STATE_FILTER_ALL(4),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16897e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$f$b$a */
            class C6892a implements EnumLiteMap<C6891b> {
                C6892a() {
                }

                public C6891b findValueByNumber(int i) {
                    return C6891b.m17617a(i);
                }
            }

            static {
                new C6892a();
            }

            private C6891b(int i) {
                this.f16897e = i;
            }

            /* renamed from: a */
            public static C6891b m17617a(int i) {
                if (i == 0) {
                    return STATE_FILTER_UNKNOWN;
                }
                if (i == 1) {
                    return STATE_FILTER_NONE;
                }
                if (i == 2) {
                    return STATE_FILTER_PRIORITY;
                }
                if (i == 3) {
                    return STATE_FILTER_ALARMS;
                }
                if (i != 4) {
                    return null;
                }
                return STATE_FILTER_ALL;
            }

            public final int getNumber() {
                return this.f16897e;
            }
        }

        static {
            f16887f.makeImmutable();
        }

        private C6889f() {
        }

        public static C6889f getDefaultInstance() {
            return f16887f;
        }

        public static Parser<C6889f> parser() {
            return f16887f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6889f();
                case 2:
                    return f16887f;
                case 3:
                    return null;
                case 4:
                    return new C6890a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6889f fVar = (C6889f) obj2;
                    boolean z2 = this.f16889e != 0;
                    int i = this.f16889e;
                    if (fVar.f16889e != 0) {
                        z = true;
                    }
                    this.f16889e = visitor.visitInt(z2, i, z, fVar.f16889e);
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
                                    this.f16889e = codedInputStream.readEnum();
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
                    if (f16888g == null) {
                        synchronized (C6889f.class) {
                            if (f16888g == null) {
                                f16888g = new DefaultInstanceBasedParser(f16887f);
                            }
                        }
                    }
                    return f16888g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16887f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16889e != C6891b.STATE_FILTER_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16889e);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6891b getState() {
            C6891b a = C6891b.m17617a(this.f16889e);
            return a == null ? C6891b.UNRECOGNIZED : a;
        }

        public int getStateValue() {
            return this.f16889e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16889e != C6891b.STATE_FILTER_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16889e);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$g */
    public static final class C6893g extends GeneratedMessageLite<C6893g, C6894a> implements LocationOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final C6893g f16898l = new C6893g();

        /* renamed from: m */
        private static volatile Parser<C6893g> f16899m;

        /* renamed from: e */
        private Timestamp f16900e;

        /* renamed from: f */
        private double f16901f;

        /* renamed from: g */
        private double f16902g;

        /* renamed from: h */
        private double f16903h;

        /* renamed from: i */
        private double f16904i;

        /* renamed from: j */
        private double f16905j;

        /* renamed from: k */
        private int f16906k;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$g$a */
        public static final class C6894a extends Builder<C6893g, C6894a> implements LocationOrBuilder {
            /* synthetic */ C6894a(C7477t2 t2Var) {
                this();
            }

            public double getAltitude() {
                return ((C6893g) this.instance).getAltitude();
            }

            public double getLatitude() {
                return ((C6893g) this.instance).getLatitude();
            }

            public double getLongitude() {
                return ((C6893g) this.instance).getLongitude();
            }

            public double getPrecisionHorizontal() {
                return ((C6893g) this.instance).getPrecisionHorizontal();
            }

            public double getPrecisionVertical() {
                return ((C6893g) this.instance).getPrecisionVertical();
            }

            public C6895b getProvider() {
                return ((C6893g) this.instance).getProvider();
            }

            public int getProviderValue() {
                return ((C6893g) this.instance).getProviderValue();
            }

            public Timestamp getTimestamp() {
                return ((C6893g) this.instance).getTimestamp();
            }

            public boolean hasTimestamp() {
                return ((C6893g) this.instance).hasTimestamp();
            }

            private C6894a() {
                super(C6893g.f16898l);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$g$b */
        public enum C6895b implements EnumLite {
            PROVIDER_UNKNOWN(0),
            PROVIDER_CORELOCATION(1),
            PROVIDER_GOOGLEPLAY_FUSED(2),
            PROVIDER_ANDROID_PASSIVE(3),
            PROVIDER_ANDROID_NETWORK(4),
            PROVIDER_ANDROID_GPS(5),
            PROVIDER_MAPZEN(6),
            PROVIDER_APWLS(7),
            PROVIDER_CORELOCATION_NETWORK(8),
            PROVIDER_CORELOCATION_GPS(9),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16919e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$g$b$a */
            class C6896a implements EnumLiteMap<C6895b> {
                C6896a() {
                }

                public C6895b findValueByNumber(int i) {
                    return C6895b.m17619a(i);
                }
            }

            static {
                new C6896a();
            }

            private C6895b(int i) {
                this.f16919e = i;
            }

            /* renamed from: a */
            public static C6895b m17619a(int i) {
                switch (i) {
                    case 0:
                        return PROVIDER_UNKNOWN;
                    case 1:
                        return PROVIDER_CORELOCATION;
                    case 2:
                        return PROVIDER_GOOGLEPLAY_FUSED;
                    case 3:
                        return PROVIDER_ANDROID_PASSIVE;
                    case 4:
                        return PROVIDER_ANDROID_NETWORK;
                    case 5:
                        return PROVIDER_ANDROID_GPS;
                    case 6:
                        return PROVIDER_MAPZEN;
                    case 7:
                        return PROVIDER_APWLS;
                    case 8:
                        return PROVIDER_CORELOCATION_NETWORK;
                    case 9:
                        return PROVIDER_CORELOCATION_GPS;
                    default:
                        return null;
                }
            }

            public final int getNumber() {
                return this.f16919e;
            }
        }

        static {
            f16898l.makeImmutable();
        }

        private C6893g() {
        }

        public static Parser<C6893g> parser() {
            return f16898l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6893g();
                case 2:
                    return f16898l;
                case 3:
                    return null;
                case 4:
                    return new C6894a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6893g gVar = (C6893g) obj2;
                    this.f16900e = (Timestamp) visitor.visitMessage(this.f16900e, gVar.f16900e);
                    this.f16901f = visitor.visitDouble(this.f16901f != 0.0d, this.f16901f, gVar.f16901f != 0.0d, gVar.f16901f);
                    this.f16902g = visitor.visitDouble(this.f16902g != 0.0d, this.f16902g, gVar.f16902g != 0.0d, gVar.f16902g);
                    this.f16903h = visitor.visitDouble(this.f16903h != 0.0d, this.f16903h, gVar.f16903h != 0.0d, gVar.f16903h);
                    this.f16904i = visitor.visitDouble(this.f16904i != 0.0d, this.f16904i, gVar.f16904i != 0.0d, gVar.f16904i);
                    this.f16905j = visitor.visitDouble(this.f16905j != 0.0d, this.f16905j, gVar.f16905j != 0.0d, gVar.f16905j);
                    boolean z2 = this.f16906k != 0;
                    int i = this.f16906k;
                    if (gVar.f16906k != 0) {
                        z = true;
                    }
                    this.f16906k = visitor.visitInt(z2, i, z, gVar.f16906k);
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
                                    Builder builder = this.f16900e != null ? (Timestamp.Builder) this.f16900e.toBuilder() : null;
                                    this.f16900e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16900e);
                                        this.f16900e = (Timestamp) builder.buildPartial();
                                    }
                                } else if (readTag == 17) {
                                    this.f16901f = codedInputStream.readDouble();
                                } else if (readTag == 25) {
                                    this.f16902g = codedInputStream.readDouble();
                                } else if (readTag == 33) {
                                    this.f16903h = codedInputStream.readDouble();
                                } else if (readTag == 41) {
                                    this.f16904i = codedInputStream.readDouble();
                                } else if (readTag == 49) {
                                    this.f16905j = codedInputStream.readDouble();
                                } else if (readTag == 56) {
                                    this.f16906k = codedInputStream.readEnum();
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
                    if (f16899m == null) {
                        synchronized (C6893g.class) {
                            if (f16899m == null) {
                                f16899m = new DefaultInstanceBasedParser(f16898l);
                            }
                        }
                    }
                    return f16899m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16898l;
        }

        public double getAltitude() {
            return this.f16903h;
        }

        public double getLatitude() {
            return this.f16901f;
        }

        public double getLongitude() {
            return this.f16902g;
        }

        public double getPrecisionHorizontal() {
            return this.f16904i;
        }

        public double getPrecisionVertical() {
            return this.f16905j;
        }

        public C6895b getProvider() {
            C6895b a = C6895b.m17619a(this.f16906k);
            return a == null ? C6895b.UNRECOGNIZED : a;
        }

        public int getProviderValue() {
            return this.f16906k;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16900e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getTimestamp());
            }
            double d = this.f16901f;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(2, d);
            }
            double d2 = this.f16902g;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(3, d2);
            }
            double d3 = this.f16903h;
            if (d3 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(4, d3);
            }
            double d4 = this.f16904i;
            if (d4 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(5, d4);
            }
            double d5 = this.f16905j;
            if (d5 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(6, d5);
            }
            if (this.f16906k != C6895b.PROVIDER_UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(7, this.f16906k);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getTimestamp() {
            Timestamp timestamp = this.f16900e;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasTimestamp() {
            return this.f16900e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16900e != null) {
                codedOutputStream.writeMessage(1, getTimestamp());
            }
            double d = this.f16901f;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(2, d);
            }
            double d2 = this.f16902g;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(3, d2);
            }
            double d3 = this.f16903h;
            if (d3 != 0.0d) {
                codedOutputStream.writeDouble(4, d3);
            }
            double d4 = this.f16904i;
            if (d4 != 0.0d) {
                codedOutputStream.writeDouble(5, d4);
            }
            double d5 = this.f16905j;
            if (d5 != 0.0d) {
                codedOutputStream.writeDouble(6, d5);
            }
            if (this.f16906k != C6895b.PROVIDER_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(7, this.f16906k);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$h */
    public static final class C6897h extends GeneratedMessageLite<C6897h, C6898a> implements MagnetometerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6897h f16920i = new C6897h();

        /* renamed from: j */
        private static volatile Parser<C6897h> f16921j;

        /* renamed from: e */
        private Timestamp f16922e;

        /* renamed from: f */
        private float f16923f;

        /* renamed from: g */
        private float f16924g;

        /* renamed from: h */
        private float f16925h;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$h$a */
        public static final class C6898a extends Builder<C6897h, C6898a> implements MagnetometerOrBuilder {
            /* synthetic */ C6898a(C7477t2 t2Var) {
                this();
            }

            public Timestamp getCreatedAt() {
                return ((C6897h) this.instance).getCreatedAt();
            }

            public float getX() {
                return ((C6897h) this.instance).getX();
            }

            public float getY() {
                return ((C6897h) this.instance).getY();
            }

            public float getZ() {
                return ((C6897h) this.instance).getZ();
            }

            public boolean hasCreatedAt() {
                return ((C6897h) this.instance).hasCreatedAt();
            }

            private C6898a() {
                super(C6897h.f16920i);
            }
        }

        static {
            f16920i.makeImmutable();
        }

        private C6897h() {
        }

        public static C6897h getDefaultInstance() {
            return f16920i;
        }

        public static Parser<C6897h> parser() {
            return f16920i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6897h();
                case 2:
                    return f16920i;
                case 3:
                    return null;
                case 4:
                    return new C6898a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6897h hVar = (C6897h) obj2;
                    this.f16922e = (Timestamp) visitor.visitMessage(this.f16922e, hVar.f16922e);
                    this.f16923f = visitor.visitFloat(this.f16923f != 0.0f, this.f16923f, hVar.f16923f != 0.0f, hVar.f16923f);
                    this.f16924g = visitor.visitFloat(this.f16924g != 0.0f, this.f16924g, hVar.f16924g != 0.0f, hVar.f16924g);
                    boolean z2 = this.f16925h != 0.0f;
                    float f = this.f16925h;
                    if (hVar.f16925h != 0.0f) {
                        z = true;
                    }
                    this.f16925h = visitor.visitFloat(z2, f, z, hVar.f16925h);
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
                                    Builder builder = this.f16922e != null ? (Timestamp.Builder) this.f16922e.toBuilder() : null;
                                    this.f16922e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16922e);
                                        this.f16922e = (Timestamp) builder.buildPartial();
                                    }
                                } else if (readTag == 21) {
                                    this.f16923f = codedInputStream.readFloat();
                                } else if (readTag == 29) {
                                    this.f16924g = codedInputStream.readFloat();
                                } else if (readTag == 37) {
                                    this.f16925h = codedInputStream.readFloat();
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
                    if (f16921j == null) {
                        synchronized (C6897h.class) {
                            if (f16921j == null) {
                                f16921j = new DefaultInstanceBasedParser(f16920i);
                            }
                        }
                    }
                    return f16921j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16920i;
        }

        public Timestamp getCreatedAt() {
            Timestamp timestamp = this.f16922e;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16922e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getCreatedAt());
            }
            float f = this.f16923f;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(2, f);
            }
            float f2 = this.f16924g;
            if (f2 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(3, f2);
            }
            float f3 = this.f16925h;
            if (f3 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(4, f3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public float getX() {
            return this.f16923f;
        }

        public float getY() {
            return this.f16924g;
        }

        public float getZ() {
            return this.f16925h;
        }

        public boolean hasCreatedAt() {
            return this.f16922e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16922e != null) {
                codedOutputStream.writeMessage(1, getCreatedAt());
            }
            float f = this.f16923f;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(2, f);
            }
            float f2 = this.f16924g;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(3, f2);
            }
            float f3 = this.f16925h;
            if (f3 != 0.0f) {
                codedOutputStream.writeFloat(4, f3);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$i */
    public static final class C6899i extends GeneratedMessageLite<C6899i, C6900a> implements MetadataOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static final C6899i f16926j = new C6899i();

        /* renamed from: k */
        private static volatile Parser<C6899i> f16927k;

        /* renamed from: e */
        private int f16928e;

        /* renamed from: f */
        private String f16929f;

        /* renamed from: g */
        private String f16930g;

        /* renamed from: h */
        private String f16931h;

        /* renamed from: i */
        private ProtobufList<String> f16932i = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$i$a */
        public static final class C6900a extends Builder<C6899i, C6900a> implements MetadataOrBuilder {
            /* synthetic */ C6900a(C7477t2 t2Var) {
                this();
            }

            public String getIsGhost() {
                return ((C6899i) this.instance).getIsGhost();
            }

            public ByteString getIsGhostBytes() {
                return ((C6899i) this.instance).getIsGhostBytes();
            }

            public String getPushId() {
                return ((C6899i) this.instance).getPushId();
            }

            public ByteString getPushIdBytes() {
                return ((C6899i) this.instance).getPushIdBytes();
            }

            public String getWatcherUuids(int i) {
                return ((C6899i) this.instance).getWatcherUuids(i);
            }

            public ByteString getWatcherUuidsBytes(int i) {
                return ((C6899i) this.instance).getWatcherUuidsBytes(i);
            }

            public int getWatcherUuidsCount() {
                return ((C6899i) this.instance).getWatcherUuidsCount();
            }

            public List<String> getWatcherUuidsList() {
                return Collections.unmodifiableList(((C6899i) this.instance).getWatcherUuidsList());
            }

            public String getWillSleepin() {
                return ((C6899i) this.instance).getWillSleepin();
            }

            public ByteString getWillSleepinBytes() {
                return ((C6899i) this.instance).getWillSleepinBytes();
            }

            private C6900a() {
                super(C6899i.f16926j);
            }
        }

        static {
            f16926j.makeImmutable();
        }

        private C6899i() {
            String str = "";
            this.f16929f = str;
            this.f16930g = str;
            this.f16931h = str;
        }

        public static C6899i getDefaultInstance() {
            return f16926j;
        }

        public static Parser<C6899i> parser() {
            return f16926j.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6899i();
                case 2:
                    return f16926j;
                case 3:
                    this.f16932i.makeImmutable();
                    return null;
                case 4:
                    return new C6900a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6899i iVar = (C6899i) obj2;
                    this.f16929f = visitor.visitString(!this.f16929f.isEmpty(), this.f16929f, !iVar.f16929f.isEmpty(), iVar.f16929f);
                    this.f16930g = visitor.visitString(!this.f16930g.isEmpty(), this.f16930g, !iVar.f16930g.isEmpty(), iVar.f16930g);
                    this.f16931h = visitor.visitString(!this.f16931h.isEmpty(), this.f16931h, true ^ iVar.f16931h.isEmpty(), iVar.f16931h);
                    this.f16932i = visitor.visitList(this.f16932i, iVar.f16932i);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f16928e |= iVar.f16928e;
                    }
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
                                    this.f16929f = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.f16930g = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f16931h = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.f16932i.isModifiable()) {
                                        this.f16932i = GeneratedMessageLite.mutableCopy(this.f16932i);
                                    }
                                    this.f16932i.add(readStringRequireUtf8);
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
                    if (f16927k == null) {
                        synchronized (C6899i.class) {
                            if (f16927k == null) {
                                f16927k = new DefaultInstanceBasedParser(f16926j);
                            }
                        }
                    }
                    return f16927k;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16926j;
        }

        public String getIsGhost() {
            return this.f16930g;
        }

        public ByteString getIsGhostBytes() {
            return ByteString.copyFromUtf8(this.f16930g);
        }

        public String getPushId() {
            return this.f16929f;
        }

        public ByteString getPushIdBytes() {
            return ByteString.copyFromUtf8(this.f16929f);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !this.f16929f.isEmpty() ? CodedOutputStream.computeStringSize(1, getPushId()) + 0 : 0;
            if (!this.f16930g.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(2, getIsGhost());
            }
            if (!this.f16931h.isEmpty()) {
                computeStringSize += CodedOutputStream.computeStringSize(3, getWillSleepin());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f16932i.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f16932i.get(i3));
            }
            int size = computeStringSize + i2 + (getWatcherUuidsList().size() * 1);
            this.memoizedSerializedSize = size;
            return size;
        }

        public String getWatcherUuids(int i) {
            return (String) this.f16932i.get(i);
        }

        public ByteString getWatcherUuidsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.f16932i.get(i));
        }

        public int getWatcherUuidsCount() {
            return this.f16932i.size();
        }

        public List<String> getWatcherUuidsList() {
            return this.f16932i;
        }

        public String getWillSleepin() {
            return this.f16931h;
        }

        public ByteString getWillSleepinBytes() {
            return ByteString.copyFromUtf8(this.f16931h);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f16929f.isEmpty()) {
                codedOutputStream.writeString(1, getPushId());
            }
            if (!this.f16930g.isEmpty()) {
                codedOutputStream.writeString(2, getIsGhost());
            }
            if (!this.f16931h.isEmpty()) {
                codedOutputStream.writeString(3, getWillSleepin());
            }
            for (int i = 0; i < this.f16932i.size(); i++) {
                codedOutputStream.writeString(4, (String) this.f16932i.get(i));
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$j */
    public static final class C6901j extends GeneratedMessageLite<C6901j, C6902a> implements PedometerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6901j f16933g = new C6901j();

        /* renamed from: h */
        private static volatile Parser<C6901j> f16934h;

        /* renamed from: e */
        private int f16935e;

        /* renamed from: f */
        private Timestamp f16936f;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$j$a */
        public static final class C6902a extends Builder<C6901j, C6902a> implements PedometerOrBuilder {
            /* synthetic */ C6902a(C7477t2 t2Var) {
                this();
            }

            public int getNumberOfSteps() {
                return ((C6901j) this.instance).getNumberOfSteps();
            }

            public Timestamp getSince() {
                return ((C6901j) this.instance).getSince();
            }

            public boolean hasSince() {
                return ((C6901j) this.instance).hasSince();
            }

            private C6902a() {
                super(C6901j.f16933g);
            }
        }

        static {
            f16933g.makeImmutable();
        }

        private C6901j() {
        }

        public static C6901j getDefaultInstance() {
            return f16933g;
        }

        public static Parser<C6901j> parser() {
            return f16933g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6901j();
                case 2:
                    return f16933g;
                case 3:
                    return null;
                case 4:
                    return new C6902a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6901j jVar = (C6901j) obj2;
                    boolean z2 = this.f16935e != 0;
                    int i = this.f16935e;
                    if (jVar.f16935e != 0) {
                        z = true;
                    }
                    this.f16935e = visitor.visitInt(z2, i, z, jVar.f16935e);
                    this.f16936f = (Timestamp) visitor.visitMessage(this.f16936f, jVar.f16936f);
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
                                    this.f16935e = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    Builder builder = this.f16936f != null ? (Timestamp.Builder) this.f16936f.toBuilder() : null;
                                    this.f16936f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16936f);
                                        this.f16936f = (Timestamp) builder.buildPartial();
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
                    if (f16934h == null) {
                        synchronized (C6901j.class) {
                            if (f16934h == null) {
                                f16934h = new DefaultInstanceBasedParser(f16933g);
                            }
                        }
                    }
                    return f16934h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16933g;
        }

        public int getNumberOfSteps() {
            return this.f16935e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16935e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            if (this.f16936f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getSince());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Timestamp getSince() {
            Timestamp timestamp = this.f16936f;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasSince() {
            return this.f16936f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16935e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            if (this.f16936f != null) {
                codedOutputStream.writeMessage(2, getSince());
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$k */
    public static final class C6903k extends GeneratedMessageLite<C6903k, C6904a> implements PhoneStateOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6903k f16937f = new C6903k();

        /* renamed from: g */
        private static volatile Parser<C6903k> f16938g;

        /* renamed from: e */
        private int f16939e;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$k$a */
        public static final class C6904a extends Builder<C6903k, C6904a> implements PhoneStateOrBuilder {
            /* synthetic */ C6904a(C7477t2 t2Var) {
                this();
            }

            public C6905b getState() {
                return ((C6903k) this.instance).getState();
            }

            public int getStateValue() {
                return ((C6903k) this.instance).getStateValue();
            }

            private C6904a() {
                super(C6903k.f16937f);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$k$b */
        public enum C6905b implements EnumLite {
            STATE_UNKNOWN(0),
            STATE_IDLE(1),
            STATE_RINGING(2),
            STATE_OFFHOOK(3),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16946e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$k$b$a */
            class C6906a implements EnumLiteMap<C6905b> {
                C6906a() {
                }

                public C6905b findValueByNumber(int i) {
                    return C6905b.m17624a(i);
                }
            }

            static {
                new C6906a();
            }

            private C6905b(int i) {
                this.f16946e = i;
            }

            /* renamed from: a */
            public static C6905b m17624a(int i) {
                if (i == 0) {
                    return STATE_UNKNOWN;
                }
                if (i == 1) {
                    return STATE_IDLE;
                }
                if (i == 2) {
                    return STATE_RINGING;
                }
                if (i != 3) {
                    return null;
                }
                return STATE_OFFHOOK;
            }

            public final int getNumber() {
                return this.f16946e;
            }
        }

        static {
            f16937f.makeImmutable();
        }

        private C6903k() {
        }

        public static C6903k getDefaultInstance() {
            return f16937f;
        }

        public static Parser<C6903k> parser() {
            return f16937f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6903k();
                case 2:
                    return f16937f;
                case 3:
                    return null;
                case 4:
                    return new C6904a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6903k kVar = (C6903k) obj2;
                    boolean z2 = this.f16939e != 0;
                    int i = this.f16939e;
                    if (kVar.f16939e != 0) {
                        z = true;
                    }
                    this.f16939e = visitor.visitInt(z2, i, z, kVar.f16939e);
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
                                    this.f16939e = codedInputStream.readEnum();
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
                    if (f16938g == null) {
                        synchronized (C6903k.class) {
                            if (f16938g == null) {
                                f16938g = new DefaultInstanceBasedParser(f16937f);
                            }
                        }
                    }
                    return f16938g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16937f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16939e != C6905b.STATE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16939e);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public C6905b getState() {
            C6905b a = C6905b.m17624a(this.f16939e);
            return a == null ? C6905b.UNRECOGNIZED : a;
        }

        public int getStateValue() {
            return this.f16939e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16939e != C6905b.STATE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16939e);
            }
        }
    }

    /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$l */
    public static final class C6907l extends GeneratedMessageLite<C6907l, C6908a> implements RingerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6907l f16947g = new C6907l();

        /* renamed from: h */
        private static volatile Parser<C6907l> f16948h;

        /* renamed from: e */
        private int f16949e;

        /* renamed from: f */
        private int f16950f;

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$l$a */
        public static final class C6908a extends Builder<C6907l, C6908a> implements RingerOrBuilder {
            /* synthetic */ C6908a(C7477t2 t2Var) {
                this();
            }

            public int getLevel() {
                return ((C6907l) this.instance).getLevel();
            }

            public C6909b getMode() {
                return ((C6907l) this.instance).getMode();
            }

            public int getModeValue() {
                return ((C6907l) this.instance).getModeValue();
            }

            private C6908a() {
                super(C6907l.f16947g);
            }
        }

        /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$l$b */
        public enum C6909b implements EnumLite {
            MODE_UNKNOWN(0),
            MODE_SILENT(1),
            MODE_VIBRATE(2),
            MODE_NORMAL(3),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16957e;

            /* renamed from: co.znly.models.TrackingContextProto$TrackingContext$l$b$a */
            class C6910a implements EnumLiteMap<C6909b> {
                C6910a() {
                }

                public C6909b findValueByNumber(int i) {
                    return C6909b.m17626a(i);
                }
            }

            static {
                new C6910a();
            }

            private C6909b(int i) {
                this.f16957e = i;
            }

            /* renamed from: a */
            public static C6909b m17626a(int i) {
                if (i == 0) {
                    return MODE_UNKNOWN;
                }
                if (i == 1) {
                    return MODE_SILENT;
                }
                if (i == 2) {
                    return MODE_VIBRATE;
                }
                if (i != 3) {
                    return null;
                }
                return MODE_NORMAL;
            }

            public final int getNumber() {
                return this.f16957e;
            }
        }

        static {
            f16947g.makeImmutable();
        }

        private C6907l() {
        }

        public static C6907l getDefaultInstance() {
            return f16947g;
        }

        public static Parser<C6907l> parser() {
            return f16947g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6907l();
                case 2:
                    return f16947g;
                case 3:
                    return null;
                case 4:
                    return new C6908a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6907l lVar = (C6907l) obj2;
                    this.f16949e = visitor.visitInt(this.f16949e != 0, this.f16949e, lVar.f16949e != 0, lVar.f16949e);
                    boolean z2 = this.f16950f != 0;
                    int i = this.f16950f;
                    if (lVar.f16950f != 0) {
                        z = true;
                    }
                    this.f16950f = visitor.visitInt(z2, i, z, lVar.f16950f);
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
                                    this.f16949e = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.f16950f = codedInputStream.readInt32();
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
                    if (f16948h == null) {
                        synchronized (C6907l.class) {
                            if (f16948h == null) {
                                f16948h = new DefaultInstanceBasedParser(f16947g);
                            }
                        }
                    }
                    return f16948h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16947g;
        }

        public int getLevel() {
            return this.f16950f;
        }

        public C6909b getMode() {
            C6909b a = C6909b.m17626a(this.f16949e);
            return a == null ? C6909b.UNRECOGNIZED : a;
        }

        public int getModeValue() {
            return this.f16949e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16949e != C6909b.MODE_UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f16949e);
            }
            int i3 = this.f16950f;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16949e != C6909b.MODE_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.f16949e);
            }
            int i = this.f16950f;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
        }
    }

    static {
        f16770Y.makeImmutable();
    }

    private TrackingContextProto$TrackingContext() {
        String str = "";
        this.f16798g = str;
        this.f16800i = str;
        this.f16801j = str;
        this.f16802k = str;
        this.f16805n = str;
        this.f16806o = str;
        this.f16807p = str;
        this.f16813v = str;
    }

    public static TrackingContextProto$TrackingContext getDefaultInstance() {
        return f16770Y;
    }

    public static C6884d newBuilder() {
        return (C6884d) f16770Y.toBuilder();
    }

    public static Parser<TrackingContextProto$TrackingContext> parser() {
        return f16770Y.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7477t2.f18756a[methodToInvoke.ordinal()]) {
            case 1:
                return new TrackingContextProto$TrackingContext();
            case 2:
                return f16770Y;
            case 3:
                this.f16787P.makeImmutable();
                return null;
            case 4:
                return new C6884d(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                TrackingContextProto$TrackingContext trackingContextProto$TrackingContext = (TrackingContextProto$TrackingContext) obj2;
                this.f16798g = visitor.visitString(!this.f16798g.isEmpty(), this.f16798g, !trackingContextProto$TrackingContext.f16798g.isEmpty(), trackingContextProto$TrackingContext.f16798g);
                this.f16799h = (Timestamp) visitor.visitMessage(this.f16799h, trackingContextProto$TrackingContext.f16799h);
                this.f16800i = visitor.visitString(!this.f16800i.isEmpty(), this.f16800i, !trackingContextProto$TrackingContext.f16800i.isEmpty(), trackingContextProto$TrackingContext.f16800i);
                this.f16801j = visitor.visitString(!this.f16801j.isEmpty(), this.f16801j, !trackingContextProto$TrackingContext.f16801j.isEmpty(), trackingContextProto$TrackingContext.f16801j);
                this.f16802k = visitor.visitString(!this.f16802k.isEmpty(), this.f16802k, !trackingContextProto$TrackingContext.f16802k.isEmpty(), trackingContextProto$TrackingContext.f16802k);
                this.f16803l = visitor.visitInt(this.f16803l != 0, this.f16803l, trackingContextProto$TrackingContext.f16803l != 0, trackingContextProto$TrackingContext.f16803l);
                this.f16804m = visitor.visitInt(this.f16804m != 0, this.f16804m, trackingContextProto$TrackingContext.f16804m != 0, trackingContextProto$TrackingContext.f16804m);
                this.f16805n = visitor.visitString(!this.f16805n.isEmpty(), this.f16805n, !trackingContextProto$TrackingContext.f16805n.isEmpty(), trackingContextProto$TrackingContext.f16805n);
                this.f16806o = visitor.visitString(!this.f16806o.isEmpty(), this.f16806o, !trackingContextProto$TrackingContext.f16806o.isEmpty(), trackingContextProto$TrackingContext.f16806o);
                this.f16807p = visitor.visitString(!this.f16807p.isEmpty(), this.f16807p, !trackingContextProto$TrackingContext.f16807p.isEmpty(), trackingContextProto$TrackingContext.f16807p);
                this.f16808q = visitor.visitDouble(this.f16808q != 0.0d, this.f16808q, trackingContextProto$TrackingContext.f16808q != 0.0d, trackingContextProto$TrackingContext.f16808q);
                this.f16809r = visitor.visitDouble(this.f16809r != 0.0d, this.f16809r, trackingContextProto$TrackingContext.f16809r != 0.0d, trackingContextProto$TrackingContext.f16809r);
                this.f16810s = visitor.visitDouble(this.f16810s != 0.0d, this.f16810s, trackingContextProto$TrackingContext.f16810s != 0.0d, trackingContextProto$TrackingContext.f16810s);
                this.f16811t = visitor.visitInt(this.f16811t != 0, this.f16811t, trackingContextProto$TrackingContext.f16811t != 0, trackingContextProto$TrackingContext.f16811t);
                boolean z2 = this.f16812u;
                boolean z3 = trackingContextProto$TrackingContext.f16812u;
                this.f16812u = visitor.visitBoolean(z2, z2, z3, z3);
                this.f16813v = visitor.visitString(!this.f16813v.isEmpty(), this.f16813v, !trackingContextProto$TrackingContext.f16813v.isEmpty(), trackingContextProto$TrackingContext.f16813v);
                this.f16814w = visitor.visitDouble(this.f16814w != 0.0d, this.f16814w, trackingContextProto$TrackingContext.f16814w != 0.0d, trackingContextProto$TrackingContext.f16814w);
                this.f16815x = visitor.visitDouble(this.f16815x != 0.0d, this.f16815x, trackingContextProto$TrackingContext.f16815x != 0.0d, trackingContextProto$TrackingContext.f16815x);
                boolean z4 = this.f16816y;
                boolean z5 = trackingContextProto$TrackingContext.f16816y;
                this.f16816y = visitor.visitBoolean(z4, z4, z5, z5);
                boolean z6 = this.f16817z;
                boolean z7 = trackingContextProto$TrackingContext.f16817z;
                this.f16817z = visitor.visitBoolean(z6, z6, z7, z7);
                this.f16772A = (Timestamp) visitor.visitMessage(this.f16772A, trackingContextProto$TrackingContext.f16772A);
                this.f16773B = visitor.visitInt(this.f16773B != 0, this.f16773B, trackingContextProto$TrackingContext.f16773B != 0, trackingContextProto$TrackingContext.f16773B);
                this.f16774C = visitor.visitDouble(this.f16774C != 0.0d, this.f16774C, trackingContextProto$TrackingContext.f16774C != 0.0d, trackingContextProto$TrackingContext.f16774C);
                this.f16775D = visitor.visitDouble(this.f16775D != 0.0d, this.f16775D, trackingContextProto$TrackingContext.f16775D != 0.0d, trackingContextProto$TrackingContext.f16775D);
                this.f16776E = visitor.visitDouble(this.f16776E != 0.0d, this.f16776E, trackingContextProto$TrackingContext.f16776E != 0.0d, trackingContextProto$TrackingContext.f16776E);
                this.f16777F = visitor.visitDouble(this.f16777F != 0.0d, this.f16777F, trackingContextProto$TrackingContext.f16777F != 0.0d, trackingContextProto$TrackingContext.f16777F);
                this.f16778G = visitor.visitInt(this.f16778G != 0, this.f16778G, trackingContextProto$TrackingContext.f16778G != 0, trackingContextProto$TrackingContext.f16778G);
                this.f16779H = (WiFi) visitor.visitMessage(this.f16779H, trackingContextProto$TrackingContext.f16779H);
                this.f16780I = (Duration) visitor.visitMessage(this.f16780I, trackingContextProto$TrackingContext.f16780I);
                this.f16781J = visitor.visitInt(this.f16781J != 0, this.f16781J, trackingContextProto$TrackingContext.f16781J != 0, trackingContextProto$TrackingContext.f16781J);
                this.f16782K = (C6880c) visitor.visitMessage(this.f16782K, trackingContextProto$TrackingContext.f16782K);
                this.f16783L = (C6907l) visitor.visitMessage(this.f16783L, trackingContextProto$TrackingContext.f16783L);
                this.f16784M = (MusicPlayer) visitor.visitMessage(this.f16784M, trackingContextProto$TrackingContext.f16784M);
                this.f16785N = (C6885e) visitor.visitMessage(this.f16785N, trackingContextProto$TrackingContext.f16785N);
                this.f16786O = (C6903k) visitor.visitMessage(this.f16786O, trackingContextProto$TrackingContext.f16786O);
                this.f16787P = visitor.visitList(this.f16787P, trackingContextProto$TrackingContext.f16787P);
                this.f16788Q = visitor.visitDouble(this.f16788Q != 0.0d, this.f16788Q, trackingContextProto$TrackingContext.f16788Q != 0.0d, trackingContextProto$TrackingContext.f16788Q);
                this.f16789R = (C6901j) visitor.visitMessage(this.f16789R, trackingContextProto$TrackingContext.f16789R);
                this.f16790S = (C6878b) visitor.visitMessage(this.f16790S, trackingContextProto$TrackingContext.f16790S);
                this.f16791T = (C6897h) visitor.visitMessage(this.f16791T, trackingContextProto$TrackingContext.f16791T);
                this.f16792U = (C6889f) visitor.visitMessage(this.f16792U, trackingContextProto$TrackingContext.f16792U);
                this.f16793V = (C6876a) visitor.visitMessage(this.f16793V, trackingContextProto$TrackingContext.f16793V);
                this.f16794W = (C6899i) visitor.visitMessage(this.f16794W, trackingContextProto$TrackingContext.f16794W);
                boolean z8 = this.f16795X != 0;
                int i = this.f16795X;
                if (trackingContextProto$TrackingContext.f16795X != 0) {
                    z = true;
                }
                this.f16795X = visitor.visitInt(z8, i, z, trackingContextProto$TrackingContext.f16795X);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f16796e |= trackingContextProto$TrackingContext.f16796e;
                    this.f16797f |= trackingContextProto$TrackingContext.f16797f;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f16798g = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f16799h != null ? (Timestamp.Builder) this.f16799h.toBuilder() : null;
                                this.f16799h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f16799h);
                                    this.f16799h = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f16800i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f16801j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.f16802k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 48:
                                this.f16803l = codedInputStream.readEnum();
                                break;
                            case 56:
                                this.f16804m = codedInputStream.readInt32();
                                break;
                            case 66:
                                this.f16806o = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.f16807p = codedInputStream.readStringRequireUtf8();
                                break;
                            case 81:
                                this.f16808q = codedInputStream.readDouble();
                                break;
                            case 89:
                                this.f16809r = codedInputStream.readDouble();
                                break;
                            case 97:
                                this.f16810s = codedInputStream.readDouble();
                                break;
                            case 104:
                                this.f16811t = codedInputStream.readInt32();
                                break;
                            case 112:
                                this.f16812u = codedInputStream.readBool();
                                break;
                            case 122:
                                this.f16813v = codedInputStream.readStringRequireUtf8();
                                break;
                            case 129:
                                this.f16814w = codedInputStream.readDouble();
                                break;
                            case 137:
                                this.f16815x = codedInputStream.readDouble();
                                break;
                            case 144:
                                this.f16816y = codedInputStream.readBool();
                                break;
                            case 152:
                                this.f16817z = codedInputStream.readBool();
                                break;
                            case 162:
                                Builder builder2 = this.f16772A != null ? (Timestamp.Builder) this.f16772A.toBuilder() : null;
                                this.f16772A = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f16772A);
                                    this.f16772A = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 168:
                                this.f16773B = codedInputStream.readUInt32();
                                break;
                            case 177:
                                this.f16774C = codedInputStream.readDouble();
                                break;
                            case 185:
                                this.f16775D = codedInputStream.readDouble();
                                break;
                            case 193:
                                this.f16776E = codedInputStream.readDouble();
                                break;
                            case 201:
                                this.f16777F = codedInputStream.readDouble();
                                break;
                            case 208:
                                this.f16778G = codedInputStream.readInt32();
                                break;
                            case 218:
                                Builder builder3 = this.f16794W != null ? (C6900a) this.f16794W.toBuilder() : null;
                                this.f16794W = (C6899i) codedInputStream.readMessage(C6899i.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f16794W);
                                    this.f16794W = (C6899i) builder3.buildPartial();
                                    break;
                                }
                            case 226:
                                this.f16805n = codedInputStream.readStringRequireUtf8();
                                break;
                            case 232:
                                this.f16795X = codedInputStream.readEnum();
                                break;
                            case 242:
                                Builder builder4 = this.f16779H != null ? (C6873b) this.f16779H.toBuilder() : null;
                                this.f16779H = (WiFi) codedInputStream.readMessage(WiFi.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f16779H);
                                    this.f16779H = (WiFi) builder4.buildPartial();
                                    break;
                                }
                            case 250:
                                Builder builder5 = this.f16780I != null ? (Duration.Builder) this.f16780I.toBuilder() : null;
                                this.f16780I = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f16780I);
                                    this.f16780I = (Duration) builder5.buildPartial();
                                    break;
                                }
                            case 256:
                                this.f16781J = codedInputStream.readInt32();
                                break;
                            case 266:
                                Builder builder6 = this.f16782K != null ? (C6881a) this.f16782K.toBuilder() : null;
                                this.f16782K = (C6880c) codedInputStream.readMessage(C6880c.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f16782K);
                                    this.f16782K = (C6880c) builder6.buildPartial();
                                    break;
                                }
                            case 274:
                                Builder builder7 = this.f16783L != null ? (C6908a) this.f16783L.toBuilder() : null;
                                this.f16783L = (C6907l) codedInputStream.readMessage(C6907l.parser(), extensionRegistryLite);
                                if (builder7 == null) {
                                    break;
                                } else {
                                    builder7.mergeFrom(this.f16783L);
                                    this.f16783L = (C6907l) builder7.buildPartial();
                                    break;
                                }
                            case 282:
                                Builder builder8 = this.f16784M != null ? (C6864a) this.f16784M.toBuilder() : null;
                                this.f16784M = (MusicPlayer) codedInputStream.readMessage(MusicPlayer.parser(), extensionRegistryLite);
                                if (builder8 == null) {
                                    break;
                                } else {
                                    builder8.mergeFrom(this.f16784M);
                                    this.f16784M = (MusicPlayer) builder8.buildPartial();
                                    break;
                                }
                            case 290:
                                Builder builder9 = this.f16785N != null ? (C6886a) this.f16785N.toBuilder() : null;
                                this.f16785N = (C6885e) codedInputStream.readMessage(C6885e.parser(), extensionRegistryLite);
                                if (builder9 == null) {
                                    break;
                                } else {
                                    builder9.mergeFrom(this.f16785N);
                                    this.f16785N = (C6885e) builder9.buildPartial();
                                    break;
                                }
                            case 298:
                                Builder builder10 = this.f16786O != null ? (C6904a) this.f16786O.toBuilder() : null;
                                this.f16786O = (C6903k) codedInputStream.readMessage(C6903k.parser(), extensionRegistryLite);
                                if (builder10 == null) {
                                    break;
                                } else {
                                    builder10.mergeFrom(this.f16786O);
                                    this.f16786O = (C6903k) builder10.buildPartial();
                                    break;
                                }
                            case 306:
                                if (!this.f16787P.isModifiable()) {
                                    this.f16787P = GeneratedMessageLite.mutableCopy(this.f16787P);
                                }
                                this.f16787P.add(codedInputStream.readMessage(C6893g.parser(), extensionRegistryLite));
                                break;
                            case 313:
                                this.f16788Q = codedInputStream.readDouble();
                                break;
                            case 322:
                                Builder builder11 = this.f16789R != null ? (C6902a) this.f16789R.toBuilder() : null;
                                this.f16789R = (C6901j) codedInputStream.readMessage(C6901j.parser(), extensionRegistryLite);
                                if (builder11 == null) {
                                    break;
                                } else {
                                    builder11.mergeFrom(this.f16789R);
                                    this.f16789R = (C6901j) builder11.buildPartial();
                                    break;
                                }
                            case 330:
                                Builder builder12 = this.f16790S != null ? (C6879a) this.f16790S.toBuilder() : null;
                                this.f16790S = (C6878b) codedInputStream.readMessage(C6878b.parser(), extensionRegistryLite);
                                if (builder12 == null) {
                                    break;
                                } else {
                                    builder12.mergeFrom(this.f16790S);
                                    this.f16790S = (C6878b) builder12.buildPartial();
                                    break;
                                }
                            case 338:
                                Builder builder13 = this.f16791T != null ? (C6898a) this.f16791T.toBuilder() : null;
                                this.f16791T = (C6897h) codedInputStream.readMessage(C6897h.parser(), extensionRegistryLite);
                                if (builder13 == null) {
                                    break;
                                } else {
                                    builder13.mergeFrom(this.f16791T);
                                    this.f16791T = (C6897h) builder13.buildPartial();
                                    break;
                                }
                            case 346:
                                Builder builder14 = this.f16792U != null ? (C6890a) this.f16792U.toBuilder() : null;
                                this.f16792U = (C6889f) codedInputStream.readMessage(C6889f.parser(), extensionRegistryLite);
                                if (builder14 == null) {
                                    break;
                                } else {
                                    builder14.mergeFrom(this.f16792U);
                                    this.f16792U = (C6889f) builder14.buildPartial();
                                    break;
                                }
                            case 354:
                                Builder builder15 = this.f16793V != null ? (C6877a) this.f16793V.toBuilder() : null;
                                this.f16793V = (C6876a) codedInputStream.readMessage(C6876a.parser(), extensionRegistryLite);
                                if (builder15 == null) {
                                    break;
                                } else {
                                    builder15.mergeFrom(this.f16793V);
                                    this.f16793V = (C6876a) builder15.buildPartial();
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
                if (f16771Z == null) {
                    synchronized (TrackingContextProto$TrackingContext.class) {
                        if (f16771Z == null) {
                            f16771Z = new DefaultInstanceBasedParser(f16770Y);
                        }
                    }
                }
                return f16771Z;
            default:
                throw new UnsupportedOperationException();
        }
        return f16770Y;
    }

    public int getActivity() {
        return this.f16773B;
    }

    public C6876a getAlarmClock() {
        C6876a aVar = this.f16793V;
        return aVar == null ? C6876a.getDefaultInstance() : aVar;
    }

    public double getAltitude() {
        return this.f16810s;
    }

    public C6878b getBarometer() {
        C6878b bVar = this.f16790S;
        return bVar == null ? C6878b.getDefaultInstance() : bVar;
    }

    public C6880c getBattery() {
        C6880c cVar = this.f16782K;
        return cVar == null ? C6880c.getDefaultInstance() : cVar;
    }

    public int getBatteryLevel() {
        return this.f16811t;
    }

    public double getBearing() {
        return this.f16775D;
    }

    public String getCellularNetworkCountryCode() {
        return this.f16805n;
    }

    public ByteString getCellularNetworkCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.f16805n);
    }

    public String getCellularNetworkName() {
        return this.f16802k;
    }

    public ByteString getCellularNetworkNameBytes() {
        return ByteString.copyFromUtf8(this.f16802k);
    }

    public int getCellularNetworkStrength() {
        return this.f16804m;
    }

    public C7484u2 getCellularNetworkType() {
        C7484u2 a = C7484u2.m18114a(this.f16803l);
        return a == null ? C7484u2.UNRECOGNIZED : a;
    }

    public int getCellularNetworkTypeValue() {
        return this.f16803l;
    }

    public Duration getClock() {
        Duration duration = this.f16780I;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f16799h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getDeviceTimestamp() {
        Timestamp timestamp = this.f16772A;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getDeviceUuid() {
        return this.f16801j;
    }

    public ByteString getDeviceUuidBytes() {
        return ByteString.copyFromUtf8(this.f16801j);
    }

    public C6889f getDnd() {
        C6889f fVar = this.f16792U;
        return fVar == null ? C6889f.getDefaultInstance() : fVar;
    }

    public int getFloor() {
        return this.f16778G;
    }

    public C7492v2 getGhostType() {
        C7492v2 a = C7492v2.m18118a(this.f16795X);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getGhostTypeValue() {
        return this.f16795X;
    }

    public double getHeading() {
        return this.f16776E;
    }

    public double getHeadingPrecision() {
        return this.f16777F;
    }

    public double getHorizontalPrecision() {
        return this.f16814w;
    }

    public String getIp() {
        return this.f16813v;
    }

    public ByteString getIpBytes() {
        return ByteString.copyFromUtf8(this.f16813v);
    }

    public boolean getIsCharging() {
        return this.f16816y;
    }

    public boolean getIsForeground() {
        return this.f16812u;
    }

    public boolean getIsGhost() {
        return this.f16817z;
    }

    public double getLatitude() {
        return this.f16808q;
    }

    public C6893g getLocations(int i) {
        return (C6893g) this.f16787P.get(i);
    }

    public int getLocationsCount() {
        return this.f16787P.size();
    }

    public List<C6893g> getLocationsList() {
        return this.f16787P;
    }

    public C6885e getLockState() {
        C6885e eVar = this.f16785N;
        return eVar == null ? C6885e.getDefaultInstance() : eVar;
    }

    public double getLongitude() {
        return this.f16809r;
    }

    public C6897h getMagnetometer() {
        C6897h hVar = this.f16791T;
        return hVar == null ? C6897h.getDefaultInstance() : hVar;
    }

    public C6899i getMeta() {
        C6899i iVar = this.f16794W;
        return iVar == null ? C6899i.getDefaultInstance() : iVar;
    }

    public MusicPlayer getMusicPlayer() {
        MusicPlayer musicPlayer = this.f16784M;
        return musicPlayer == null ? MusicPlayer.getDefaultInstance() : musicPlayer;
    }

    public C6901j getPedometer() {
        C6901j jVar = this.f16789R;
        return jVar == null ? C6901j.getDefaultInstance() : jVar;
    }

    public C6903k getPhoneState() {
        C6903k kVar = this.f16786O;
        return kVar == null ? C6903k.getDefaultInstance() : kVar;
    }

    public double getPressure() {
        return this.f16788Q;
    }

    public C6907l getRinger() {
        C6907l lVar = this.f16783L;
        return lVar == null ? C6907l.getDefaultInstance() : lVar;
    }

    public int getSeq() {
        return this.f16781J;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f16798g.isEmpty() ? CodedOutputStream.computeStringSize(1, getUuid()) + 0 : 0;
        if (this.f16799h != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f16800i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        if (!this.f16801j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getDeviceUuid());
        }
        if (!this.f16802k.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, getCellularNetworkName());
        }
        if (this.f16803l != C7484u2.GPRS.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(6, this.f16803l);
        }
        int i2 = this.f16804m;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(7, i2);
        }
        if (!this.f16806o.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getWifiNetworkName());
        }
        if (!this.f16807p.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(9, getWifiNetworkBssid());
        }
        double d = this.f16808q;
        if (d != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(10, d);
        }
        double d2 = this.f16809r;
        if (d2 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(11, d2);
        }
        double d3 = this.f16810s;
        if (d3 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(12, d3);
        }
        int i3 = this.f16811t;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(13, i3);
        }
        boolean z = this.f16812u;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(14, z);
        }
        if (!this.f16813v.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(15, getIp());
        }
        double d4 = this.f16814w;
        if (d4 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(16, d4);
        }
        double d5 = this.f16815x;
        if (d5 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(17, d5);
        }
        boolean z2 = this.f16816y;
        if (z2) {
            computeStringSize += CodedOutputStream.computeBoolSize(18, z2);
        }
        boolean z3 = this.f16817z;
        if (z3) {
            computeStringSize += CodedOutputStream.computeBoolSize(19, z3);
        }
        if (this.f16772A != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(20, getDeviceTimestamp());
        }
        int i4 = this.f16773B;
        if (i4 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(21, i4);
        }
        double d6 = this.f16774C;
        if (d6 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(22, d6);
        }
        double d7 = this.f16775D;
        if (d7 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(23, d7);
        }
        double d8 = this.f16776E;
        if (d8 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(24, d8);
        }
        double d9 = this.f16777F;
        if (d9 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(25, d9);
        }
        int i5 = this.f16778G;
        if (i5 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(26, i5);
        }
        if (this.f16794W != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(27, getMeta());
        }
        if (!this.f16805n.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(28, getCellularNetworkCountryCode());
        }
        if (this.f16795X != C7492v2.noghost.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(29, this.f16795X);
        }
        if (this.f16779H != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(30, getWifi());
        }
        if (this.f16780I != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(31, getClock());
        }
        int i6 = this.f16781J;
        if (i6 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(32, i6);
        }
        if (this.f16782K != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(33, getBattery());
        }
        if (this.f16783L != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(34, getRinger());
        }
        if (this.f16784M != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(35, getMusicPlayer());
        }
        if (this.f16785N != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(36, getLockState());
        }
        if (this.f16786O != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(37, getPhoneState());
        }
        for (int i7 = 0; i7 < this.f16787P.size(); i7++) {
            computeStringSize += CodedOutputStream.computeMessageSize(38, (MessageLite) this.f16787P.get(i7));
        }
        double d10 = this.f16788Q;
        if (d10 != 0.0d) {
            computeStringSize += CodedOutputStream.computeDoubleSize(39, d10);
        }
        if (this.f16789R != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(40, getPedometer());
        }
        if (this.f16790S != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(41, getBarometer());
        }
        if (this.f16791T != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(42, getMagnetometer());
        }
        if (this.f16792U != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(43, getDnd());
        }
        if (this.f16793V != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(44, getAlarmClock());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public double getSpeed() {
        return this.f16774C;
    }

    public String getUserUuid() {
        return this.f16800i;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f16800i);
    }

    public String getUuid() {
        return this.f16798g;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f16798g);
    }

    public double getVerticalPrecision() {
        return this.f16815x;
    }

    public WiFi getWifi() {
        WiFi wiFi = this.f16779H;
        return wiFi == null ? WiFi.getDefaultInstance() : wiFi;
    }

    public String getWifiNetworkBssid() {
        return this.f16807p;
    }

    public ByteString getWifiNetworkBssidBytes() {
        return ByteString.copyFromUtf8(this.f16807p);
    }

    public String getWifiNetworkName() {
        return this.f16806o;
    }

    public ByteString getWifiNetworkNameBytes() {
        return ByteString.copyFromUtf8(this.f16806o);
    }

    public boolean hasAlarmClock() {
        return this.f16793V != null;
    }

    public boolean hasBarometer() {
        return this.f16790S != null;
    }

    public boolean hasBattery() {
        return this.f16782K != null;
    }

    public boolean hasClock() {
        return this.f16780I != null;
    }

    public boolean hasCreatedAt() {
        return this.f16799h != null;
    }

    public boolean hasDeviceTimestamp() {
        return this.f16772A != null;
    }

    public boolean hasDnd() {
        return this.f16792U != null;
    }

    public boolean hasLockState() {
        return this.f16785N != null;
    }

    public boolean hasMagnetometer() {
        return this.f16791T != null;
    }

    public boolean hasMeta() {
        return this.f16794W != null;
    }

    public boolean hasMusicPlayer() {
        return this.f16784M != null;
    }

    public boolean hasPedometer() {
        return this.f16789R != null;
    }

    public boolean hasPhoneState() {
        return this.f16786O != null;
    }

    public boolean hasRinger() {
        return this.f16783L != null;
    }

    public boolean hasWifi() {
        return this.f16779H != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f16798g.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f16799h != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f16800i.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        if (!this.f16801j.isEmpty()) {
            codedOutputStream.writeString(4, getDeviceUuid());
        }
        if (!this.f16802k.isEmpty()) {
            codedOutputStream.writeString(5, getCellularNetworkName());
        }
        if (this.f16803l != C7484u2.GPRS.getNumber()) {
            codedOutputStream.writeEnum(6, this.f16803l);
        }
        int i = this.f16804m;
        if (i != 0) {
            codedOutputStream.writeInt32(7, i);
        }
        if (!this.f16806o.isEmpty()) {
            codedOutputStream.writeString(8, getWifiNetworkName());
        }
        if (!this.f16807p.isEmpty()) {
            codedOutputStream.writeString(9, getWifiNetworkBssid());
        }
        double d = this.f16808q;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(10, d);
        }
        double d2 = this.f16809r;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(11, d2);
        }
        double d3 = this.f16810s;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(12, d3);
        }
        int i2 = this.f16811t;
        if (i2 != 0) {
            codedOutputStream.writeInt32(13, i2);
        }
        boolean z = this.f16812u;
        if (z) {
            codedOutputStream.writeBool(14, z);
        }
        if (!this.f16813v.isEmpty()) {
            codedOutputStream.writeString(15, getIp());
        }
        double d4 = this.f16814w;
        if (d4 != 0.0d) {
            codedOutputStream.writeDouble(16, d4);
        }
        double d5 = this.f16815x;
        if (d5 != 0.0d) {
            codedOutputStream.writeDouble(17, d5);
        }
        boolean z2 = this.f16816y;
        if (z2) {
            codedOutputStream.writeBool(18, z2);
        }
        boolean z3 = this.f16817z;
        if (z3) {
            codedOutputStream.writeBool(19, z3);
        }
        if (this.f16772A != null) {
            codedOutputStream.writeMessage(20, getDeviceTimestamp());
        }
        int i3 = this.f16773B;
        if (i3 != 0) {
            codedOutputStream.writeUInt32(21, i3);
        }
        double d6 = this.f16774C;
        if (d6 != 0.0d) {
            codedOutputStream.writeDouble(22, d6);
        }
        double d7 = this.f16775D;
        if (d7 != 0.0d) {
            codedOutputStream.writeDouble(23, d7);
        }
        double d8 = this.f16776E;
        if (d8 != 0.0d) {
            codedOutputStream.writeDouble(24, d8);
        }
        double d9 = this.f16777F;
        if (d9 != 0.0d) {
            codedOutputStream.writeDouble(25, d9);
        }
        int i4 = this.f16778G;
        if (i4 != 0) {
            codedOutputStream.writeInt32(26, i4);
        }
        if (this.f16794W != null) {
            codedOutputStream.writeMessage(27, getMeta());
        }
        if (!this.f16805n.isEmpty()) {
            codedOutputStream.writeString(28, getCellularNetworkCountryCode());
        }
        if (this.f16795X != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(29, this.f16795X);
        }
        if (this.f16779H != null) {
            codedOutputStream.writeMessage(30, getWifi());
        }
        if (this.f16780I != null) {
            codedOutputStream.writeMessage(31, getClock());
        }
        int i5 = this.f16781J;
        if (i5 != 0) {
            codedOutputStream.writeInt32(32, i5);
        }
        if (this.f16782K != null) {
            codedOutputStream.writeMessage(33, getBattery());
        }
        if (this.f16783L != null) {
            codedOutputStream.writeMessage(34, getRinger());
        }
        if (this.f16784M != null) {
            codedOutputStream.writeMessage(35, getMusicPlayer());
        }
        if (this.f16785N != null) {
            codedOutputStream.writeMessage(36, getLockState());
        }
        if (this.f16786O != null) {
            codedOutputStream.writeMessage(37, getPhoneState());
        }
        for (int i6 = 0; i6 < this.f16787P.size(); i6++) {
            codedOutputStream.writeMessage(38, (MessageLite) this.f16787P.get(i6));
        }
        double d10 = this.f16788Q;
        if (d10 != 0.0d) {
            codedOutputStream.writeDouble(39, d10);
        }
        if (this.f16789R != null) {
            codedOutputStream.writeMessage(40, getPedometer());
        }
        if (this.f16790S != null) {
            codedOutputStream.writeMessage(41, getBarometer());
        }
        if (this.f16791T != null) {
            codedOutputStream.writeMessage(42, getMagnetometer());
        }
        if (this.f16792U != null) {
            codedOutputStream.writeMessage(43, getDnd());
        }
        if (this.f16793V != null) {
            codedOutputStream.writeMessage(44, getAlarmClock());
        }
    }
}
