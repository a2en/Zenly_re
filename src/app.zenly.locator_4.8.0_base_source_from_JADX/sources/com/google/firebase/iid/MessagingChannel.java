package com.google.firebase.iid;

import com.google.android.gms.tasks.C10693c;

public interface MessagingChannel {
    C10693c<Void> ackMessage(String str);

    C10693c<Void> buildChannel(String str, String str2);

    C10693c<Void> deleteInstanceId(String str);

    C10693c<Void> deleteToken(String str, String str2, String str3, String str4);

    C10693c<String> getToken(String str, String str2, String str3, String str4);

    boolean isAvailable();

    boolean isChannelBuilt();

    boolean needsRefresh();

    C10693c<Void> subscribeToTopic(String str, String str2, String str3);

    C10693c<Void> unsubscribeFromTopic(String str, String str2, String str3);
}
