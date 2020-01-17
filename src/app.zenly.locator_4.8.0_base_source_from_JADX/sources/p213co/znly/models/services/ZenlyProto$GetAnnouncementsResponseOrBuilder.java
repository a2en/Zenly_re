package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.ZenlyProto$GetAnnouncementsResponse.C7950a;

/* renamed from: co.znly.models.services.ZenlyProto$GetAnnouncementsResponseOrBuilder */
public interface ZenlyProto$GetAnnouncementsResponseOrBuilder extends MessageLiteOrBuilder {
    C7950a getAnnouncements(int i);

    int getAnnouncementsCount();

    List<C7950a> getAnnouncementsList();
}
