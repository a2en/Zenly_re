package app.zenly.locator.modals;

import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;

public interface ModalProvider {
    ModalController createController() throws InvalidProtocolBufferException;

    C4545f2 getModalUuid();
}
