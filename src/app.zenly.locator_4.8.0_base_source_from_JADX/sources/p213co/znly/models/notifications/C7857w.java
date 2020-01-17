package p213co.znly.models.notifications;

import com.android.volley.toolbox.C8733j;
import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.notifications.C7791a0.C7792a;
import p213co.znly.models.notifications.C7793b.C7794a;
import p213co.znly.models.notifications.C7795b0.C7796a;
import p213co.znly.models.notifications.C7797c.C7798a;
import p213co.znly.models.notifications.C7799c0.C7800a;
import p213co.znly.models.notifications.C7801d.C7802a;
import p213co.znly.models.notifications.C7803d0.C7804a;
import p213co.znly.models.notifications.C7805e.C7806a;
import p213co.znly.models.notifications.C7807e0.C7808a;
import p213co.znly.models.notifications.C7809f.C7810a;
import p213co.znly.models.notifications.C7811f0.C7812a;
import p213co.znly.models.notifications.C7813g.C7814a;
import p213co.znly.models.notifications.C7815g0.C7816a;
import p213co.znly.models.notifications.C7819h.C7820a;
import p213co.znly.models.notifications.C7821h0.C7822a;
import p213co.znly.models.notifications.C7823i.C7824a;
import p213co.znly.models.notifications.C7825i0.C7826a;
import p213co.znly.models.notifications.C7827j.C7828a;
import p213co.znly.models.notifications.C7829j0.C7830a;
import p213co.znly.models.notifications.C7831k.C7832a;
import p213co.znly.models.notifications.C7833l.C7834a;
import p213co.znly.models.notifications.C7835m.C7836a;
import p213co.znly.models.notifications.C7837n.C7838a;
import p213co.znly.models.notifications.C7839o.C7840a;
import p213co.znly.models.notifications.C7841p.C7842a;
import p213co.znly.models.notifications.C7843q.C7844a;
import p213co.znly.models.notifications.C7845r.C7846a;
import p213co.znly.models.notifications.C7849s.C7850a;
import p213co.znly.models.notifications.C7851t.C7852a;
import p213co.znly.models.notifications.C7853u.C7854a;
import p213co.znly.models.notifications.C7855v.C7856a;
import p213co.znly.models.notifications.C7862y.C7863a;
import p213co.znly.models.notifications.C7864z.C7865a;
import p213co.znly.models.notifications.NotificationProto$SigningNotification.C7789a;

/* renamed from: co.znly.models.notifications.w */
public final class C7857w extends GeneratedMessageLite<C7857w, C7858a> implements NotificationProto$NotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C7857w f19632m = new C7857w();

    /* renamed from: n */
    private static volatile Parser<C7857w> f19633n;

    /* renamed from: e */
    private int f19634e = 0;

    /* renamed from: f */
    private Object f19635f;

    /* renamed from: g */
    private String f19636g;

    /* renamed from: h */
    private Timestamp f19637h;

    /* renamed from: i */
    private String f19638i;

    /* renamed from: j */
    private String f19639j;

    /* renamed from: k */
    private Timestamp f19640k;

    /* renamed from: l */
    private String f19641l;

    /* renamed from: co.znly.models.notifications.w$a */
    public static final class C7858a extends Builder<C7857w, C7858a> implements NotificationProto$NotificationOrBuilder {
        /* synthetic */ C7858a(C7790a aVar) {
            this();
        }

        public C7793b getBrump() {
            return ((C7857w) this.instance).getBrump();
        }

        public C7809f getChatGroupMessage() {
            return ((C7857w) this.instance).getChatGroupMessage();
        }

        public C7813g getChatMessage() {
            return ((C7857w) this.instance).getChatMessage();
        }

        public C7797c getCmdDumpReport() {
            return ((C7857w) this.instance).getCmdDumpReport();
        }

        public C7805e getCmdHarakiri() {
            return ((C7857w) this.instance).getCmdHarakiri();
        }

        public C7801d getCmdHttpServer() {
            return ((C7857w) this.instance).getCmdHttpServer();
        }

        public C7819h getContactJoined() {
            return ((C7857w) this.instance).getContactJoined();
        }

        public C7823i getCountryChange() {
            return ((C7857w) this.instance).getCountryChange();
        }

        public Timestamp getCreatedAt() {
            return ((C7857w) this.instance).getCreatedAt();
        }

        public C7831k getDisableGhost() {
            return ((C7857w) this.instance).getDisableGhost();
        }

        public C7827j getDisableGhostAccepted() {
            return ((C7857w) this.instance).getDisableGhostAccepted();
        }

        public C7835m getEnableAlwaysOnLocation() {
            return ((C7857w) this.instance).getEnableAlwaysOnLocation();
        }

        public C7839o getEnableWifi() {
            return ((C7857w) this.instance).getEnableWifi();
        }

        public C7837n getEnableWifiAccepted() {
            return ((C7857w) this.instance).getEnableWifiAccepted();
        }

        public C7841p getFailedMsg() {
            return ((C7857w) this.instance).getFailedMsg();
        }

        public C7843q getFootstepsViews() {
            return ((C7857w) this.instance).getFootstepsViews();
        }

        public C7845r getFriendIsBack() {
            return ((C7857w) this.instance).getFriendIsBack();
        }

        public C7849s getFriendRequestAccepted() {
            return ((C7857w) this.instance).getFriendRequestAccepted();
        }

        public C7851t getFriendRequestSent() {
            return ((C7857w) this.instance).getFriendRequestSent();
        }

        public C7853u getLocationRequest() {
            return ((C7857w) this.instance).getLocationRequest();
        }

        public String getMessage() {
            return ((C7857w) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C7857w) this.instance).getMessageBytes();
        }

        public C7855v getNoFriends() {
            return ((C7857w) this.instance).getNoFriends();
        }

        public C7859b getNotificationCase() {
            return ((C7857w) this.instance).getNotificationCase();
        }

        public C7833l getPackUnlocked() {
            return ((C7857w) this.instance).getPackUnlocked();
        }

        public C7862y getPing() {
            return ((C7857w) this.instance).getPing();
        }

        public C7864z getProfilePic() {
            return ((C7857w) this.instance).getProfilePic();
        }

        public C7791a0 getPublicShare() {
            return ((C7857w) this.instance).getPublicShare();
        }

        public C7795b0 getRaw() {
            return ((C7857w) this.instance).getRaw();
        }

        public Timestamp getReadAt() {
            return ((C7857w) this.instance).getReadAt();
        }

        public C7799c0 getRecommendation() {
            return ((C7857w) this.instance).getRecommendation();
        }

        public C7803d0 getRecommendationReward() {
            return ((C7857w) this.instance).getRecommendationReward();
        }

        public C7807e0 getRequestMedia() {
            return ((C7857w) this.instance).getRequestMedia();
        }

        public NotificationProto$SigningNotification getSigning() {
            return ((C7857w) this.instance).getSigning();
        }

        public C7815g0 getSleepDetection() {
            return ((C7857w) this.instance).getSleepDetection();
        }

        public C7811f0 getSynNotification() {
            return ((C7857w) this.instance).getSynNotification();
        }

        public String getTitle() {
            return ((C7857w) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((C7857w) this.instance).getTitleBytes();
        }

        public C7821h0 getTrackingContextRequest() {
            return ((C7857w) this.instance).getTrackingContextRequest();
        }

        public C7825i0 getUserMonitor() {
            return ((C7857w) this.instance).getUserMonitor();
        }

        public String getUserUuid() {
            return ((C7857w) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7857w) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((C7857w) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7857w) this.instance).getUuidBytes();
        }

        public C7829j0 getZendesk() {
            return ((C7857w) this.instance).getZendesk();
        }

        public boolean hasCreatedAt() {
            return ((C7857w) this.instance).hasCreatedAt();
        }

        public boolean hasReadAt() {
            return ((C7857w) this.instance).hasReadAt();
        }

        private C7858a() {
            super(C7857w.f19632m);
        }
    }

    /* renamed from: co.znly.models.notifications.w$b */
    public enum C7859b implements EnumLite {
        TRACKING_CONTEXT_REQUEST(11),
        FRIEND_REQUEST_SENT(12),
        FRIEND_REQUEST_ACCEPTED(23),
        CONTACT_JOINED(13),
        ENABLE_WIFI(14),
        ENABLE_WIFI_ACCEPTED(24),
        DISABLE_GHOST(15),
        DISABLE_GHOST_ACCEPTED(25),
        LOCATION_REQUEST(16),
        PING(17),
        CHAT_MESSAGE(27),
        CHAT_GROUP_MESSAGE(30),
        FRIEND_IS_BACK(18),
        PUBLIC_SHARE(19),
        COUNTRY_CHANGE(22),
        SYN_NOTIFICATION(C8733j.DEFAULT_IMAGE_TIMEOUT_MS),
        CMD_HARAKIRI(28),
        CMD_DUMP_REPORT(29),
        CMD_HTTP_SERVER(31),
        RAW(32),
        FAILED_MSG(33),
        PACK_UNLOCKED(34),
        PROFILE_PIC(35),
        SIGNING(36),
        BRUMP(37),
        ZENDESK(38),
        REQUEST_MEDIA(39),
        FOOTSTEPS_VIEWS(40),
        USER_MONITOR(41),
        SLEEP_DETECTION(42),
        RECOMMENDATION(43),
        RECOMMENDATION_REWARD(44),
        ENABLE_ALWAYS_ON_LOCATION(45),
        NO_FRIENDS(46),
        NOTIFICATION_NOT_SET(0);
        

        /* renamed from: e */
        private final int f19678e;

        private C7859b(int i) {
            this.f19678e = i;
        }

        /* renamed from: a */
        public static C7859b m18932a(int i) {
            if (i == 0) {
                return NOTIFICATION_NOT_SET;
            }
            if (i == 1000) {
                return SYN_NOTIFICATION;
            }
            switch (i) {
                case 11:
                    return TRACKING_CONTEXT_REQUEST;
                case 12:
                    return FRIEND_REQUEST_SENT;
                case 13:
                    return CONTACT_JOINED;
                case 14:
                    return ENABLE_WIFI;
                case 15:
                    return DISABLE_GHOST;
                case 16:
                    return LOCATION_REQUEST;
                case 17:
                    return PING;
                case 18:
                    return FRIEND_IS_BACK;
                case 19:
                    return PUBLIC_SHARE;
                default:
                    switch (i) {
                        case 22:
                            return COUNTRY_CHANGE;
                        case 23:
                            return FRIEND_REQUEST_ACCEPTED;
                        case 24:
                            return ENABLE_WIFI_ACCEPTED;
                        case 25:
                            return DISABLE_GHOST_ACCEPTED;
                        default:
                            switch (i) {
                                case 27:
                                    return CHAT_MESSAGE;
                                case 28:
                                    return CMD_HARAKIRI;
                                case 29:
                                    return CMD_DUMP_REPORT;
                                case 30:
                                    return CHAT_GROUP_MESSAGE;
                                case 31:
                                    return CMD_HTTP_SERVER;
                                case 32:
                                    return RAW;
                                case 33:
                                    return FAILED_MSG;
                                case 34:
                                    return PACK_UNLOCKED;
                                case 35:
                                    return PROFILE_PIC;
                                case 36:
                                    return SIGNING;
                                case 37:
                                    return BRUMP;
                                case 38:
                                    return ZENDESK;
                                case 39:
                                    return REQUEST_MEDIA;
                                case 40:
                                    return FOOTSTEPS_VIEWS;
                                case 41:
                                    return USER_MONITOR;
                                case 42:
                                    return SLEEP_DETECTION;
                                case 43:
                                    return RECOMMENDATION;
                                case 44:
                                    return RECOMMENDATION_REWARD;
                                case 45:
                                    return ENABLE_ALWAYS_ON_LOCATION;
                                case 46:
                                    return NO_FRIENDS;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public int getNumber() {
            return this.f19678e;
        }
    }

    static {
        f19632m.makeImmutable();
    }

    private C7857w() {
        String str = "";
        this.f19636g = str;
        this.f19638i = str;
        this.f19639j = str;
        this.f19641l = str;
    }

    public static C7857w getDefaultInstance() {
        return f19632m;
    }

    public static C7858a newBuilder() {
        return (C7858a) f19632m.toBuilder();
    }

    public static C7857w parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7857w) GeneratedMessageLite.parseFrom(f19632m, bArr);
    }

    public static Parser<C7857w> parser() {
        return f19632m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7857w();
            case 2:
                return f19632m;
            case 3:
                return null;
            case 4:
                return new C7858a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7857w wVar = (C7857w) obj2;
                this.f19636g = visitor.visitString(!this.f19636g.isEmpty(), this.f19636g, !wVar.f19636g.isEmpty(), wVar.f19636g);
                this.f19637h = (Timestamp) visitor.visitMessage(this.f19637h, wVar.f19637h);
                this.f19638i = visitor.visitString(!this.f19638i.isEmpty(), this.f19638i, !wVar.f19638i.isEmpty(), wVar.f19638i);
                this.f19639j = visitor.visitString(!this.f19639j.isEmpty(), this.f19639j, !wVar.f19639j.isEmpty(), wVar.f19639j);
                this.f19640k = (Timestamp) visitor.visitMessage(this.f19640k, wVar.f19640k);
                this.f19641l = visitor.visitString(!this.f19641l.isEmpty(), this.f19641l, !wVar.f19641l.isEmpty(), wVar.f19641l);
                switch (C7790a.f19467a[wVar.getNotificationCase().ordinal()]) {
                    case 1:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 11, this.f19635f, wVar.f19635f);
                        break;
                    case 2:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 12, this.f19635f, wVar.f19635f);
                        break;
                    case 3:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 23, this.f19635f, wVar.f19635f);
                        break;
                    case 4:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 13, this.f19635f, wVar.f19635f);
                        break;
                    case 5:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 14, this.f19635f, wVar.f19635f);
                        break;
                    case 6:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 24, this.f19635f, wVar.f19635f);
                        break;
                    case 7:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 15, this.f19635f, wVar.f19635f);
                        break;
                    case 8:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 25, this.f19635f, wVar.f19635f);
                        break;
                    case 9:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 16, this.f19635f, wVar.f19635f);
                        break;
                    case 10:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 17, this.f19635f, wVar.f19635f);
                        break;
                    case 11:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 27, this.f19635f, wVar.f19635f);
                        break;
                    case 12:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 30, this.f19635f, wVar.f19635f);
                        break;
                    case 13:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 18, this.f19635f, wVar.f19635f);
                        break;
                    case 14:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 19, this.f19635f, wVar.f19635f);
                        break;
                    case 15:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 22, this.f19635f, wVar.f19635f);
                        break;
                    case 16:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 1000, this.f19635f, wVar.f19635f);
                        break;
                    case 17:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 28, this.f19635f, wVar.f19635f);
                        break;
                    case 18:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 29, this.f19635f, wVar.f19635f);
                        break;
                    case 19:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 31, this.f19635f, wVar.f19635f);
                        break;
                    case 20:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 32, this.f19635f, wVar.f19635f);
                        break;
                    case 21:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 33, this.f19635f, wVar.f19635f);
                        break;
                    case 22:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 34, this.f19635f, wVar.f19635f);
                        break;
                    case 23:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 35, this.f19635f, wVar.f19635f);
                        break;
                    case 24:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 36, this.f19635f, wVar.f19635f);
                        break;
                    case 25:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 37, this.f19635f, wVar.f19635f);
                        break;
                    case 26:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 38, this.f19635f, wVar.f19635f);
                        break;
                    case 27:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 39, this.f19635f, wVar.f19635f);
                        break;
                    case 28:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 40, this.f19635f, wVar.f19635f);
                        break;
                    case 29:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 41, this.f19635f, wVar.f19635f);
                        break;
                    case 30:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 42, this.f19635f, wVar.f19635f);
                        break;
                    case 31:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 43, this.f19635f, wVar.f19635f);
                        break;
                    case 32:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 44, this.f19635f, wVar.f19635f);
                        break;
                    case 33:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 45, this.f19635f, wVar.f19635f);
                        break;
                    case 34:
                        this.f19635f = visitor.visitOneofMessage(this.f19634e == 46, this.f19635f, wVar.f19635f);
                        break;
                    case 35:
                        visitor.visitOneofNotSet(this.f19634e != 0);
                        break;
                }
                if (visitor == MergeFromVisitor.INSTANCE) {
                    int i = wVar.f19634e;
                    if (i != 0) {
                        this.f19634e = i;
                    }
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
                                this.f19636g = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Timestamp.Builder builder = this.f19637h != null ? (Timestamp.Builder) this.f19637h.toBuilder() : null;
                                this.f19637h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f19637h);
                                    this.f19637h = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f19638i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f19639j = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                Timestamp.Builder builder2 = this.f19640k != null ? (Timestamp.Builder) this.f19640k.toBuilder() : null;
                                this.f19640k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f19640k);
                                    this.f19640k = (Timestamp) builder2.buildPartial();
                                    break;
                                }
                            case 50:
                                this.f19641l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                C7822a aVar = this.f19634e == 11 ? (C7822a) ((C7821h0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7821h0.parser(), extensionRegistryLite);
                                if (aVar != null) {
                                    aVar.mergeFrom((C7821h0) this.f19635f);
                                    this.f19635f = aVar.buildPartial();
                                }
                                this.f19634e = 11;
                                break;
                            case 98:
                                C7852a aVar2 = this.f19634e == 12 ? (C7852a) ((C7851t) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7851t.parser(), extensionRegistryLite);
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((C7851t) this.f19635f);
                                    this.f19635f = aVar2.buildPartial();
                                }
                                this.f19634e = 12;
                                break;
                            case 106:
                                C7820a aVar3 = this.f19634e == 13 ? (C7820a) ((C7819h) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7819h.parser(), extensionRegistryLite);
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((C7819h) this.f19635f);
                                    this.f19635f = aVar3.buildPartial();
                                }
                                this.f19634e = 13;
                                break;
                            case 114:
                                C7840a aVar4 = this.f19634e == 14 ? (C7840a) ((C7839o) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7839o.parser(), extensionRegistryLite);
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((C7839o) this.f19635f);
                                    this.f19635f = aVar4.buildPartial();
                                }
                                this.f19634e = 14;
                                break;
                            case 122:
                                C7832a aVar5 = this.f19634e == 15 ? (C7832a) ((C7831k) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7831k.parser(), extensionRegistryLite);
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((C7831k) this.f19635f);
                                    this.f19635f = aVar5.buildPartial();
                                }
                                this.f19634e = 15;
                                break;
                            case 130:
                                C7854a aVar6 = this.f19634e == 16 ? (C7854a) ((C7853u) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7853u.parser(), extensionRegistryLite);
                                if (aVar6 != null) {
                                    aVar6.mergeFrom((C7853u) this.f19635f);
                                    this.f19635f = aVar6.buildPartial();
                                }
                                this.f19634e = 16;
                                break;
                            case 138:
                                C7863a aVar7 = this.f19634e == 17 ? (C7863a) ((C7862y) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7862y.parser(), extensionRegistryLite);
                                if (aVar7 != null) {
                                    aVar7.mergeFrom((C7862y) this.f19635f);
                                    this.f19635f = aVar7.buildPartial();
                                }
                                this.f19634e = 17;
                                break;
                            case 146:
                                C7846a aVar8 = this.f19634e == 18 ? (C7846a) ((C7845r) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7845r.parser(), extensionRegistryLite);
                                if (aVar8 != null) {
                                    aVar8.mergeFrom((C7845r) this.f19635f);
                                    this.f19635f = aVar8.buildPartial();
                                }
                                this.f19634e = 18;
                                break;
                            case 154:
                                C7792a aVar9 = this.f19634e == 19 ? (C7792a) ((C7791a0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7791a0.parser(), extensionRegistryLite);
                                if (aVar9 != null) {
                                    aVar9.mergeFrom((C7791a0) this.f19635f);
                                    this.f19635f = aVar9.buildPartial();
                                }
                                this.f19634e = 19;
                                break;
                            case 178:
                                C7824a aVar10 = this.f19634e == 22 ? (C7824a) ((C7823i) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7823i.parser(), extensionRegistryLite);
                                if (aVar10 != null) {
                                    aVar10.mergeFrom((C7823i) this.f19635f);
                                    this.f19635f = aVar10.buildPartial();
                                }
                                this.f19634e = 22;
                                break;
                            case 186:
                                C7850a aVar11 = this.f19634e == 23 ? (C7850a) ((C7849s) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7849s.parser(), extensionRegistryLite);
                                if (aVar11 != null) {
                                    aVar11.mergeFrom((C7849s) this.f19635f);
                                    this.f19635f = aVar11.buildPartial();
                                }
                                this.f19634e = 23;
                                break;
                            case 194:
                                C7838a aVar12 = this.f19634e == 24 ? (C7838a) ((C7837n) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7837n.parser(), extensionRegistryLite);
                                if (aVar12 != null) {
                                    aVar12.mergeFrom((C7837n) this.f19635f);
                                    this.f19635f = aVar12.buildPartial();
                                }
                                this.f19634e = 24;
                                break;
                            case 202:
                                C7828a aVar13 = this.f19634e == 25 ? (C7828a) ((C7827j) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7827j.parser(), extensionRegistryLite);
                                if (aVar13 != null) {
                                    aVar13.mergeFrom((C7827j) this.f19635f);
                                    this.f19635f = aVar13.buildPartial();
                                }
                                this.f19634e = 25;
                                break;
                            case 218:
                                C7814a aVar14 = this.f19634e == 27 ? (C7814a) ((C7813g) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7813g.parser(), extensionRegistryLite);
                                if (aVar14 != null) {
                                    aVar14.mergeFrom((C7813g) this.f19635f);
                                    this.f19635f = aVar14.buildPartial();
                                }
                                this.f19634e = 27;
                                break;
                            case 226:
                                C7806a aVar15 = this.f19634e == 28 ? (C7806a) ((C7805e) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7805e.parser(), extensionRegistryLite);
                                if (aVar15 != null) {
                                    aVar15.mergeFrom((C7805e) this.f19635f);
                                    this.f19635f = aVar15.buildPartial();
                                }
                                this.f19634e = 28;
                                break;
                            case 234:
                                C7798a aVar16 = this.f19634e == 29 ? (C7798a) ((C7797c) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7797c.parser(), extensionRegistryLite);
                                if (aVar16 != null) {
                                    aVar16.mergeFrom((C7797c) this.f19635f);
                                    this.f19635f = aVar16.buildPartial();
                                }
                                this.f19634e = 29;
                                break;
                            case 242:
                                C7810a aVar17 = this.f19634e == 30 ? (C7810a) ((C7809f) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7809f.parser(), extensionRegistryLite);
                                if (aVar17 != null) {
                                    aVar17.mergeFrom((C7809f) this.f19635f);
                                    this.f19635f = aVar17.buildPartial();
                                }
                                this.f19634e = 30;
                                break;
                            case 250:
                                C7802a aVar18 = this.f19634e == 31 ? (C7802a) ((C7801d) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7801d.parser(), extensionRegistryLite);
                                if (aVar18 != null) {
                                    aVar18.mergeFrom((C7801d) this.f19635f);
                                    this.f19635f = aVar18.buildPartial();
                                }
                                this.f19634e = 31;
                                break;
                            case 258:
                                C7796a aVar19 = this.f19634e == 32 ? (C7796a) ((C7795b0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7795b0.parser(), extensionRegistryLite);
                                if (aVar19 != null) {
                                    aVar19.mergeFrom((C7795b0) this.f19635f);
                                    this.f19635f = aVar19.buildPartial();
                                }
                                this.f19634e = 32;
                                break;
                            case 266:
                                C7842a aVar20 = this.f19634e == 33 ? (C7842a) ((C7841p) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7841p.parser(), extensionRegistryLite);
                                if (aVar20 != null) {
                                    aVar20.mergeFrom((C7841p) this.f19635f);
                                    this.f19635f = aVar20.buildPartial();
                                }
                                this.f19634e = 33;
                                break;
                            case 274:
                                C7834a aVar21 = this.f19634e == 34 ? (C7834a) ((C7833l) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7833l.parser(), extensionRegistryLite);
                                if (aVar21 != null) {
                                    aVar21.mergeFrom((C7833l) this.f19635f);
                                    this.f19635f = aVar21.buildPartial();
                                }
                                this.f19634e = 34;
                                break;
                            case 282:
                                C7865a aVar22 = this.f19634e == 35 ? (C7865a) ((C7864z) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7864z.parser(), extensionRegistryLite);
                                if (aVar22 != null) {
                                    aVar22.mergeFrom((C7864z) this.f19635f);
                                    this.f19635f = aVar22.buildPartial();
                                }
                                this.f19634e = 35;
                                break;
                            case 290:
                                C7789a aVar23 = this.f19634e == 36 ? (C7789a) ((NotificationProto$SigningNotification) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(NotificationProto$SigningNotification.parser(), extensionRegistryLite);
                                if (aVar23 != null) {
                                    aVar23.mergeFrom((NotificationProto$SigningNotification) this.f19635f);
                                    this.f19635f = aVar23.buildPartial();
                                }
                                this.f19634e = 36;
                                break;
                            case 298:
                                C7794a aVar24 = this.f19634e == 37 ? (C7794a) ((C7793b) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7793b.parser(), extensionRegistryLite);
                                if (aVar24 != null) {
                                    aVar24.mergeFrom((C7793b) this.f19635f);
                                    this.f19635f = aVar24.buildPartial();
                                }
                                this.f19634e = 37;
                                break;
                            case 306:
                                C7830a aVar25 = this.f19634e == 38 ? (C7830a) ((C7829j0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7829j0.parser(), extensionRegistryLite);
                                if (aVar25 != null) {
                                    aVar25.mergeFrom((C7829j0) this.f19635f);
                                    this.f19635f = aVar25.buildPartial();
                                }
                                this.f19634e = 38;
                                break;
                            case 314:
                                C7808a aVar26 = this.f19634e == 39 ? (C7808a) ((C7807e0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7807e0.parser(), extensionRegistryLite);
                                if (aVar26 != null) {
                                    aVar26.mergeFrom((C7807e0) this.f19635f);
                                    this.f19635f = aVar26.buildPartial();
                                }
                                this.f19634e = 39;
                                break;
                            case 322:
                                C7844a aVar27 = this.f19634e == 40 ? (C7844a) ((C7843q) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7843q.parser(), extensionRegistryLite);
                                if (aVar27 != null) {
                                    aVar27.mergeFrom((C7843q) this.f19635f);
                                    this.f19635f = aVar27.buildPartial();
                                }
                                this.f19634e = 40;
                                break;
                            case 330:
                                C7826a aVar28 = this.f19634e == 41 ? (C7826a) ((C7825i0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7825i0.parser(), extensionRegistryLite);
                                if (aVar28 != null) {
                                    aVar28.mergeFrom((C7825i0) this.f19635f);
                                    this.f19635f = aVar28.buildPartial();
                                }
                                this.f19634e = 41;
                                break;
                            case 338:
                                C7816a aVar29 = this.f19634e == 42 ? (C7816a) ((C7815g0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7815g0.parser(), extensionRegistryLite);
                                if (aVar29 != null) {
                                    aVar29.mergeFrom((C7815g0) this.f19635f);
                                    this.f19635f = aVar29.buildPartial();
                                }
                                this.f19634e = 42;
                                break;
                            case 346:
                                C7800a aVar30 = this.f19634e == 43 ? (C7800a) ((C7799c0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7799c0.parser(), extensionRegistryLite);
                                if (aVar30 != null) {
                                    aVar30.mergeFrom((C7799c0) this.f19635f);
                                    this.f19635f = aVar30.buildPartial();
                                }
                                this.f19634e = 43;
                                break;
                            case 354:
                                C7804a aVar31 = this.f19634e == 44 ? (C7804a) ((C7803d0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7803d0.parser(), extensionRegistryLite);
                                if (aVar31 != null) {
                                    aVar31.mergeFrom((C7803d0) this.f19635f);
                                    this.f19635f = aVar31.buildPartial();
                                }
                                this.f19634e = 44;
                                break;
                            case 362:
                                C7836a aVar32 = this.f19634e == 45 ? (C7836a) ((C7835m) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7835m.parser(), extensionRegistryLite);
                                if (aVar32 != null) {
                                    aVar32.mergeFrom((C7835m) this.f19635f);
                                    this.f19635f = aVar32.buildPartial();
                                }
                                this.f19634e = 45;
                                break;
                            case 370:
                                C7856a aVar33 = this.f19634e == 46 ? (C7856a) ((C7855v) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7855v.parser(), extensionRegistryLite);
                                if (aVar33 != null) {
                                    aVar33.mergeFrom((C7855v) this.f19635f);
                                    this.f19635f = aVar33.buildPartial();
                                }
                                this.f19634e = 46;
                                break;
                            case 8002:
                                C7812a aVar34 = this.f19634e == 1000 ? (C7812a) ((C7811f0) this.f19635f).toBuilder() : null;
                                this.f19635f = codedInputStream.readMessage(C7811f0.parser(), extensionRegistryLite);
                                if (aVar34 != null) {
                                    aVar34.mergeFrom((C7811f0) this.f19635f);
                                    this.f19635f = aVar34.buildPartial();
                                }
                                this.f19634e = C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
                                break;
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
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f19633n == null) {
                    synchronized (C7857w.class) {
                        try {
                            if (f19633n == null) {
                                f19633n = new DefaultInstanceBasedParser(f19632m);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f19633n;
            default:
                throw new UnsupportedOperationException();
        }
        return f19632m;
    }

    public C7793b getBrump() {
        if (this.f19634e == 37) {
            return (C7793b) this.f19635f;
        }
        return C7793b.getDefaultInstance();
    }

    public C7809f getChatGroupMessage() {
        if (this.f19634e == 30) {
            return (C7809f) this.f19635f;
        }
        return C7809f.getDefaultInstance();
    }

    public C7813g getChatMessage() {
        if (this.f19634e == 27) {
            return (C7813g) this.f19635f;
        }
        return C7813g.getDefaultInstance();
    }

    public C7797c getCmdDumpReport() {
        if (this.f19634e == 29) {
            return (C7797c) this.f19635f;
        }
        return C7797c.getDefaultInstance();
    }

    public C7805e getCmdHarakiri() {
        if (this.f19634e == 28) {
            return (C7805e) this.f19635f;
        }
        return C7805e.getDefaultInstance();
    }

    public C7801d getCmdHttpServer() {
        if (this.f19634e == 31) {
            return (C7801d) this.f19635f;
        }
        return C7801d.getDefaultInstance();
    }

    public C7819h getContactJoined() {
        if (this.f19634e == 13) {
            return (C7819h) this.f19635f;
        }
        return C7819h.getDefaultInstance();
    }

    public C7823i getCountryChange() {
        if (this.f19634e == 22) {
            return (C7823i) this.f19635f;
        }
        return C7823i.getDefaultInstance();
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f19637h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7831k getDisableGhost() {
        if (this.f19634e == 15) {
            return (C7831k) this.f19635f;
        }
        return C7831k.getDefaultInstance();
    }

    public C7827j getDisableGhostAccepted() {
        if (this.f19634e == 25) {
            return (C7827j) this.f19635f;
        }
        return C7827j.getDefaultInstance();
    }

    public C7835m getEnableAlwaysOnLocation() {
        if (this.f19634e == 45) {
            return (C7835m) this.f19635f;
        }
        return C7835m.getDefaultInstance();
    }

    public C7839o getEnableWifi() {
        if (this.f19634e == 14) {
            return (C7839o) this.f19635f;
        }
        return C7839o.getDefaultInstance();
    }

    public C7837n getEnableWifiAccepted() {
        if (this.f19634e == 24) {
            return (C7837n) this.f19635f;
        }
        return C7837n.getDefaultInstance();
    }

    public C7841p getFailedMsg() {
        if (this.f19634e == 33) {
            return (C7841p) this.f19635f;
        }
        return C7841p.getDefaultInstance();
    }

    public C7843q getFootstepsViews() {
        if (this.f19634e == 40) {
            return (C7843q) this.f19635f;
        }
        return C7843q.getDefaultInstance();
    }

    public C7845r getFriendIsBack() {
        if (this.f19634e == 18) {
            return (C7845r) this.f19635f;
        }
        return C7845r.getDefaultInstance();
    }

    public C7849s getFriendRequestAccepted() {
        if (this.f19634e == 23) {
            return (C7849s) this.f19635f;
        }
        return C7849s.getDefaultInstance();
    }

    public C7851t getFriendRequestSent() {
        if (this.f19634e == 12) {
            return (C7851t) this.f19635f;
        }
        return C7851t.getDefaultInstance();
    }

    public C7853u getLocationRequest() {
        if (this.f19634e == 16) {
            return (C7853u) this.f19635f;
        }
        return C7853u.getDefaultInstance();
    }

    public String getMessage() {
        return this.f19638i;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f19638i);
    }

    public C7855v getNoFriends() {
        if (this.f19634e == 46) {
            return (C7855v) this.f19635f;
        }
        return C7855v.getDefaultInstance();
    }

    public C7859b getNotificationCase() {
        return C7859b.m18932a(this.f19634e);
    }

    public C7833l getPackUnlocked() {
        if (this.f19634e == 34) {
            return (C7833l) this.f19635f;
        }
        return C7833l.getDefaultInstance();
    }

    public C7862y getPing() {
        if (this.f19634e == 17) {
            return (C7862y) this.f19635f;
        }
        return C7862y.getDefaultInstance();
    }

    public C7864z getProfilePic() {
        if (this.f19634e == 35) {
            return (C7864z) this.f19635f;
        }
        return C7864z.getDefaultInstance();
    }

    public C7791a0 getPublicShare() {
        if (this.f19634e == 19) {
            return (C7791a0) this.f19635f;
        }
        return C7791a0.getDefaultInstance();
    }

    public C7795b0 getRaw() {
        if (this.f19634e == 32) {
            return (C7795b0) this.f19635f;
        }
        return C7795b0.getDefaultInstance();
    }

    public Timestamp getReadAt() {
        Timestamp timestamp = this.f19640k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7799c0 getRecommendation() {
        if (this.f19634e == 43) {
            return (C7799c0) this.f19635f;
        }
        return C7799c0.getDefaultInstance();
    }

    public C7803d0 getRecommendationReward() {
        if (this.f19634e == 44) {
            return (C7803d0) this.f19635f;
        }
        return C7803d0.getDefaultInstance();
    }

    public C7807e0 getRequestMedia() {
        if (this.f19634e == 39) {
            return (C7807e0) this.f19635f;
        }
        return C7807e0.getDefaultInstance();
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f19636g.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (this.f19637h != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f19638i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getMessage());
        }
        if (!this.f19639j.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getTitle());
        }
        if (this.f19640k != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getReadAt());
        }
        if (!this.f19641l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getUserUuid());
        }
        if (this.f19634e == 11) {
            i2 += CodedOutputStream.computeMessageSize(11, (C7821h0) this.f19635f);
        }
        if (this.f19634e == 12) {
            i2 += CodedOutputStream.computeMessageSize(12, (C7851t) this.f19635f);
        }
        if (this.f19634e == 13) {
            i2 += CodedOutputStream.computeMessageSize(13, (C7819h) this.f19635f);
        }
        if (this.f19634e == 14) {
            i2 += CodedOutputStream.computeMessageSize(14, (C7839o) this.f19635f);
        }
        if (this.f19634e == 15) {
            i2 += CodedOutputStream.computeMessageSize(15, (C7831k) this.f19635f);
        }
        if (this.f19634e == 16) {
            i2 += CodedOutputStream.computeMessageSize(16, (C7853u) this.f19635f);
        }
        if (this.f19634e == 17) {
            i2 += CodedOutputStream.computeMessageSize(17, (C7862y) this.f19635f);
        }
        if (this.f19634e == 18) {
            i2 += CodedOutputStream.computeMessageSize(18, (C7845r) this.f19635f);
        }
        if (this.f19634e == 19) {
            i2 += CodedOutputStream.computeMessageSize(19, (C7791a0) this.f19635f);
        }
        if (this.f19634e == 22) {
            i2 += CodedOutputStream.computeMessageSize(22, (C7823i) this.f19635f);
        }
        if (this.f19634e == 23) {
            i2 += CodedOutputStream.computeMessageSize(23, (C7849s) this.f19635f);
        }
        if (this.f19634e == 24) {
            i2 += CodedOutputStream.computeMessageSize(24, (C7837n) this.f19635f);
        }
        if (this.f19634e == 25) {
            i2 += CodedOutputStream.computeMessageSize(25, (C7827j) this.f19635f);
        }
        if (this.f19634e == 27) {
            i2 += CodedOutputStream.computeMessageSize(27, (C7813g) this.f19635f);
        }
        if (this.f19634e == 28) {
            i2 += CodedOutputStream.computeMessageSize(28, (C7805e) this.f19635f);
        }
        if (this.f19634e == 29) {
            i2 += CodedOutputStream.computeMessageSize(29, (C7797c) this.f19635f);
        }
        if (this.f19634e == 30) {
            i2 += CodedOutputStream.computeMessageSize(30, (C7809f) this.f19635f);
        }
        if (this.f19634e == 31) {
            i2 += CodedOutputStream.computeMessageSize(31, (C7801d) this.f19635f);
        }
        if (this.f19634e == 32) {
            i2 += CodedOutputStream.computeMessageSize(32, (C7795b0) this.f19635f);
        }
        if (this.f19634e == 33) {
            i2 += CodedOutputStream.computeMessageSize(33, (C7841p) this.f19635f);
        }
        if (this.f19634e == 34) {
            i2 += CodedOutputStream.computeMessageSize(34, (C7833l) this.f19635f);
        }
        if (this.f19634e == 35) {
            i2 += CodedOutputStream.computeMessageSize(35, (C7864z) this.f19635f);
        }
        if (this.f19634e == 36) {
            i2 += CodedOutputStream.computeMessageSize(36, (NotificationProto$SigningNotification) this.f19635f);
        }
        if (this.f19634e == 37) {
            i2 += CodedOutputStream.computeMessageSize(37, (C7793b) this.f19635f);
        }
        if (this.f19634e == 38) {
            i2 += CodedOutputStream.computeMessageSize(38, (C7829j0) this.f19635f);
        }
        if (this.f19634e == 39) {
            i2 += CodedOutputStream.computeMessageSize(39, (C7807e0) this.f19635f);
        }
        if (this.f19634e == 40) {
            i2 += CodedOutputStream.computeMessageSize(40, (C7843q) this.f19635f);
        }
        if (this.f19634e == 41) {
            i2 += CodedOutputStream.computeMessageSize(41, (C7825i0) this.f19635f);
        }
        if (this.f19634e == 42) {
            i2 += CodedOutputStream.computeMessageSize(42, (C7815g0) this.f19635f);
        }
        if (this.f19634e == 43) {
            i2 += CodedOutputStream.computeMessageSize(43, (C7799c0) this.f19635f);
        }
        if (this.f19634e == 44) {
            i2 += CodedOutputStream.computeMessageSize(44, (C7803d0) this.f19635f);
        }
        if (this.f19634e == 45) {
            i2 += CodedOutputStream.computeMessageSize(45, (C7835m) this.f19635f);
        }
        if (this.f19634e == 46) {
            i2 += CodedOutputStream.computeMessageSize(46, (C7855v) this.f19635f);
        }
        if (this.f19634e == 1000) {
            i2 += CodedOutputStream.computeMessageSize(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, (C7811f0) this.f19635f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public NotificationProto$SigningNotification getSigning() {
        if (this.f19634e == 36) {
            return (NotificationProto$SigningNotification) this.f19635f;
        }
        return NotificationProto$SigningNotification.getDefaultInstance();
    }

    public C7815g0 getSleepDetection() {
        if (this.f19634e == 42) {
            return (C7815g0) this.f19635f;
        }
        return C7815g0.getDefaultInstance();
    }

    public C7811f0 getSynNotification() {
        if (this.f19634e == 1000) {
            return (C7811f0) this.f19635f;
        }
        return C7811f0.getDefaultInstance();
    }

    public String getTitle() {
        return this.f19639j;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.f19639j);
    }

    public C7821h0 getTrackingContextRequest() {
        if (this.f19634e == 11) {
            return (C7821h0) this.f19635f;
        }
        return C7821h0.getDefaultInstance();
    }

    public C7825i0 getUserMonitor() {
        if (this.f19634e == 41) {
            return (C7825i0) this.f19635f;
        }
        return C7825i0.getDefaultInstance();
    }

    public String getUserUuid() {
        return this.f19641l;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f19641l);
    }

    public String getUuid() {
        return this.f19636g;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f19636g);
    }

    public C7829j0 getZendesk() {
        if (this.f19634e == 38) {
            return (C7829j0) this.f19635f;
        }
        return C7829j0.getDefaultInstance();
    }

    public boolean hasCreatedAt() {
        return this.f19637h != null;
    }

    public boolean hasReadAt() {
        return this.f19640k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f19636g.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f19637h != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f19638i.isEmpty()) {
            codedOutputStream.writeString(3, getMessage());
        }
        if (!this.f19639j.isEmpty()) {
            codedOutputStream.writeString(4, getTitle());
        }
        if (this.f19640k != null) {
            codedOutputStream.writeMessage(5, getReadAt());
        }
        if (!this.f19641l.isEmpty()) {
            codedOutputStream.writeString(6, getUserUuid());
        }
        if (this.f19634e == 11) {
            codedOutputStream.writeMessage(11, (C7821h0) this.f19635f);
        }
        if (this.f19634e == 12) {
            codedOutputStream.writeMessage(12, (C7851t) this.f19635f);
        }
        if (this.f19634e == 13) {
            codedOutputStream.writeMessage(13, (C7819h) this.f19635f);
        }
        if (this.f19634e == 14) {
            codedOutputStream.writeMessage(14, (C7839o) this.f19635f);
        }
        if (this.f19634e == 15) {
            codedOutputStream.writeMessage(15, (C7831k) this.f19635f);
        }
        if (this.f19634e == 16) {
            codedOutputStream.writeMessage(16, (C7853u) this.f19635f);
        }
        if (this.f19634e == 17) {
            codedOutputStream.writeMessage(17, (C7862y) this.f19635f);
        }
        if (this.f19634e == 18) {
            codedOutputStream.writeMessage(18, (C7845r) this.f19635f);
        }
        if (this.f19634e == 19) {
            codedOutputStream.writeMessage(19, (C7791a0) this.f19635f);
        }
        if (this.f19634e == 22) {
            codedOutputStream.writeMessage(22, (C7823i) this.f19635f);
        }
        if (this.f19634e == 23) {
            codedOutputStream.writeMessage(23, (C7849s) this.f19635f);
        }
        if (this.f19634e == 24) {
            codedOutputStream.writeMessage(24, (C7837n) this.f19635f);
        }
        if (this.f19634e == 25) {
            codedOutputStream.writeMessage(25, (C7827j) this.f19635f);
        }
        if (this.f19634e == 27) {
            codedOutputStream.writeMessage(27, (C7813g) this.f19635f);
        }
        if (this.f19634e == 28) {
            codedOutputStream.writeMessage(28, (C7805e) this.f19635f);
        }
        if (this.f19634e == 29) {
            codedOutputStream.writeMessage(29, (C7797c) this.f19635f);
        }
        if (this.f19634e == 30) {
            codedOutputStream.writeMessage(30, (C7809f) this.f19635f);
        }
        if (this.f19634e == 31) {
            codedOutputStream.writeMessage(31, (C7801d) this.f19635f);
        }
        if (this.f19634e == 32) {
            codedOutputStream.writeMessage(32, (C7795b0) this.f19635f);
        }
        if (this.f19634e == 33) {
            codedOutputStream.writeMessage(33, (C7841p) this.f19635f);
        }
        if (this.f19634e == 34) {
            codedOutputStream.writeMessage(34, (C7833l) this.f19635f);
        }
        if (this.f19634e == 35) {
            codedOutputStream.writeMessage(35, (C7864z) this.f19635f);
        }
        if (this.f19634e == 36) {
            codedOutputStream.writeMessage(36, (NotificationProto$SigningNotification) this.f19635f);
        }
        if (this.f19634e == 37) {
            codedOutputStream.writeMessage(37, (C7793b) this.f19635f);
        }
        if (this.f19634e == 38) {
            codedOutputStream.writeMessage(38, (C7829j0) this.f19635f);
        }
        if (this.f19634e == 39) {
            codedOutputStream.writeMessage(39, (C7807e0) this.f19635f);
        }
        if (this.f19634e == 40) {
            codedOutputStream.writeMessage(40, (C7843q) this.f19635f);
        }
        if (this.f19634e == 41) {
            codedOutputStream.writeMessage(41, (C7825i0) this.f19635f);
        }
        if (this.f19634e == 42) {
            codedOutputStream.writeMessage(42, (C7815g0) this.f19635f);
        }
        if (this.f19634e == 43) {
            codedOutputStream.writeMessage(43, (C7799c0) this.f19635f);
        }
        if (this.f19634e == 44) {
            codedOutputStream.writeMessage(44, (C7803d0) this.f19635f);
        }
        if (this.f19634e == 45) {
            codedOutputStream.writeMessage(45, (C7835m) this.f19635f);
        }
        if (this.f19634e == 46) {
            codedOutputStream.writeMessage(46, (C7855v) this.f19635f);
        }
        if (this.f19634e == 1000) {
            codedOutputStream.writeMessage(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, (C7811f0) this.f19635f);
        }
    }
}
