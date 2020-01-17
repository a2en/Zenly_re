package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7354j0;

/* renamed from: co.znly.models.services.ZenlyProto$MediaUploadRequestOrBuilder */
public interface ZenlyProto$MediaUploadRequestOrBuilder extends MessageLiteOrBuilder {
    C8204o1 getChatSendRequest();

    ZenlyProto$ChatSendMessageMultiRequest getChatSendRequestMulti();

    C7354j0 getMedia();

    boolean hasChatSendRequest();

    boolean hasChatSendRequestMulti();

    boolean hasMedia();
}
