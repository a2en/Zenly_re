package app.zenly.locator.chat.p059r5;

import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.chat.p053m5.C2097a;
import p213co.znly.models.C7354j0;
import p213co.znly.models.C7354j0.C7357c;
import p213co.znly.models.C7354j0.C7360e;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6825a;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p213co.znly.models.services.C8143k4;
import p213co.znly.models.services.C8143k4.C8144a;
import p213co.znly.models.services.C8222p1;
import p213co.znly.models.services.C8222p1.C8223a;
import p213co.znly.models.services.C8387y3;
import p213co.znly.models.services.C8387y3.C8388a;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest.C7943a;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest.C7944b;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest.C7944b.C7945a;

/* renamed from: app.zenly.locator.chat.r5.a */
public class C2303a {
    /* renamed from: a */
    public static C7943a m8202a(C2097a aVar, String str) {
        return m8203a(aVar, str, "");
    }

    /* renamed from: b */
    public static C7943a m8210b(C2097a aVar, String str) {
        if (aVar.f6583a == 1) {
            return m8211b(aVar.f6584b, str);
        }
        return m8202a(aVar, str);
    }

    /* renamed from: a */
    public static C7943a m8203a(C2097a aVar, String str, String str2) {
        return m8204a(aVar, new String[]{str}, str2);
    }

    /* renamed from: a */
    public static C7943a m8204a(C2097a aVar, String[] strArr, String str) {
        C7943a newBuilder = ZenlyProto$ChatSendMessageMultiRequest.newBuilder();
        C6825a newBuilder2 = C6824b.newBuilder();
        C7357c newBuilder3 = C7354j0.newBuilder();
        newBuilder3.mo19256a(C7360e.TYPE_IMAGE);
        newBuilder3.mo19259b(aVar.f6585c);
        newBuilder3.mo19258b(aVar.f6586d);
        newBuilder3.mo19255a(aVar.f6587e);
        newBuilder3.mo19257a(str);
        newBuilder2.mo17343a(newBuilder3);
        newBuilder2.mo17342a(C6826b.MEDIA);
        for (String a : strArr) {
            C7945a newBuilder4 = C7944b.newBuilder();
            newBuilder4.mo21045a(a);
            newBuilder.mo21044a(newBuilder4);
        }
        C6823a newBuilder5 = PingProto$Ping2.newBuilder();
        newBuilder5.mo17339a(newBuilder2);
        newBuilder.mo21043a(newBuilder5);
        return newBuilder;
    }

    /* renamed from: b */
    public static C7943a m8211b(String str, String str2) {
        C7943a newBuilder = ZenlyProto$ChatSendMessageMultiRequest.newBuilder();
        C6825a newBuilder2 = C6824b.newBuilder();
        newBuilder2.mo17346c(str);
        newBuilder2.mo17342a(C6826b.TEXT);
        C7945a newBuilder3 = C7944b.newBuilder();
        newBuilder3.mo21045a(str2);
        newBuilder.mo21044a(newBuilder3);
        C6823a newBuilder4 = PingProto$Ping2.newBuilder();
        newBuilder4.mo17339a(newBuilder2);
        newBuilder.mo21043a(newBuilder4);
        return newBuilder;
    }

    /* renamed from: a */
    public static C8144a m8206a(String str) {
        C8144a newBuilder = C8143k4.newBuilder();
        newBuilder.mo22160a(str);
        newBuilder.mo22159a(0);
        return newBuilder;
    }

    /* renamed from: a */
    public static ZenlyProto$ChatSendMessageMultiRequest m8205a(C1949d dVar) {
        C7943a newBuilder = ZenlyProto$ChatSendMessageMultiRequest.newBuilder();
        newBuilder.mo21043a(dVar.f6310c);
        return (ZenlyProto$ChatSendMessageMultiRequest) newBuilder.build();
    }

    /* renamed from: a */
    public static C8387y3 m8209a(int i, String str, String str2, String str3) {
        C8388a newBuilder = C8387y3.newBuilder();
        C6823a newBuilder2 = PingProto$Ping2.newBuilder();
        C6825a newBuilder3 = C6824b.newBuilder();
        newBuilder3.mo17342a(C6826b.EMOJI);
        newBuilder3.mo17344a(str);
        newBuilder3.mo17345b(str2);
        newBuilder3.mo17346c(str2);
        newBuilder3.mo17341a(i);
        newBuilder2.mo17339a(newBuilder3);
        newBuilder2.mo17340a(str3);
        newBuilder.mo22340a(newBuilder2);
        return (C8387y3) newBuilder.build();
    }

    /* renamed from: a */
    public static C8222p1 m8207a(C1949d dVar, String str) {
        return m8208a(dVar.f6310c.getUuid(), str);
    }

    /* renamed from: a */
    public static C8222p1 m8208a(String str, String str2) {
        C8223a newBuilder = C8222p1.newBuilder();
        newBuilder.mo22212a(str2);
        newBuilder.mo22213b(str);
        return (C8222p1) newBuilder.build();
    }
}
