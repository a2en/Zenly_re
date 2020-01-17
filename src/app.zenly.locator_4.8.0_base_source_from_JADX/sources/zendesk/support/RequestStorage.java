package zendesk.support;

import java.util.List;

interface RequestStorage {
    List<RequestData> getRequestData();

    boolean isRequestDataExpired();

    void markRequestAsRead(String str, int i);

    void markRequestAsUnread(String str);

    void updateRequestData(List<Request> list);
}
