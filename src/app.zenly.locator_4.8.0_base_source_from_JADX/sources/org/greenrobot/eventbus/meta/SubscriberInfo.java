package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.C13384k;

public interface SubscriberInfo {
    Class<?> getSubscriberClass();

    C13384k[] getSubscriberMethods();

    SubscriberInfo getSuperSubscriberInfo();

    boolean shouldCheckSuperclass();
}
