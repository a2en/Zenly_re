package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.reversegeocoder.C7915d;
import p213co.znly.models.reversegeocoder.C7919f;

/* renamed from: co.znly.models.services.ZenlyProto$ContextualLabelingResponseOrBuilder */
public interface ZenlyProto$ContextualLabelingResponseOrBuilder extends MessageLiteOrBuilder {
    C7919f getProvider();

    int getProviderValue();

    C8303u1 getType();

    int getTypeValue();

    C7911b getViewportAddresses(int i);

    int getViewportAddressesCount();

    List<C7911b> getViewportAddressesList();

    C7915d getViewportsInformation(int i);

    int getViewportsInformationCount();

    List<C7915d> getViewportsInformationList();
}
