package zendesk.support;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12010a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import zendesk.core.BaseStorage;
import zendesk.core.MemoryCache;

class ZendeskRequestStorage implements RequestStorage {
    private static final SimpleDateFormat HOURS_MINUTES_FORMAT = new SimpleDateFormat("mm:ss", Locale.ENGLISH);
    private static final long HOUR_IN_MILLIS = TimeUnit.HOURS.toMillis(1);
    private final Object lock = new Object();
    private final MemoryCache memoryCache;
    private final RequestMigrator requestMigrator;
    private final BaseStorage storage;

    ZendeskRequestStorage(BaseStorage baseStorage, RequestMigrator requestMigrator2, MemoryCache memoryCache2) {
        this.storage = baseStorage;
        this.requestMigrator = requestMigrator2;
        this.memoryCache = memoryCache2;
    }

    private void checkForAndMigrateLegacyRequestData() {
        String str = "zendesk_request_storage_memory_cache_migrated_flag";
        if (!((Boolean) this.memoryCache.getOrDefault(str, Boolean.valueOf(false))).booleanValue()) {
            List legacyRequests = this.requestMigrator.getLegacyRequests();
            if (C12010a.m31639b((Collection<Type>) legacyRequests)) {
                storeRequestData(legacyRequests);
                this.requestMigrator.clearLegacyRequestStorage();
                this.memoryCache.put(str, Boolean.valueOf(true));
            }
        }
    }

    private static List<RequestData> updateRequests(List<RequestData> list, List<Request> list2) {
        HashMap hashMap = new HashMap(list.size() + list2.size());
        for (RequestData requestData : list) {
            hashMap.put(requestData.getId(), requestData);
        }
        for (Request request : list2) {
            if (hashMap.containsKey(request.getId())) {
                RequestData requestData2 = (RequestData) hashMap.get(request.getId());
                hashMap.put(requestData2.getId(), RequestData.create(requestData2.getId(), request.getCommentCount().intValue(), requestData2.getReadCommentCount()));
            } else {
                hashMap.put(request.getId(), RequestData.create(request));
            }
        }
        return new ArrayList(hashMap.values());
    }

    public List<RequestData> getRequestData() {
        RequestDataList requestDataList;
        checkForAndMigrateLegacyRequestData();
        synchronized (this.lock) {
            requestDataList = (RequestDataList) this.storage.get("zendesk_request_storage_request_data_list", RequestDataList.class);
        }
        return requestDataList != null ? requestDataList.requestDataList : new ArrayList(0);
    }

    public boolean isRequestDataExpired() {
        String str;
        long j;
        synchronized (this.lock) {
            str = this.storage.get("zendesk_request_storage_requests_data_cache_time");
        }
        if (str == null) {
            j = 0;
        } else {
            j = Long.parseLong(str);
        }
        boolean z = Math.abs(System.currentTimeMillis() - j) > HOUR_IN_MILLIS;
        if (!z) {
            Logger.m31608a("ZendeskRequestStorage", "Returning Read Requests from cache. Cached Read Requests will expire in %s", HOURS_MINUTES_FORMAT.format(Long.valueOf(j)));
        }
        return z;
    }

    public void markRequestAsRead(String str, int i) {
        synchronized (this.lock) {
            List<RequestData> requestData = getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData requestData2 : requestData) {
                if (str.equals(requestData2.getId())) {
                    arrayList.add(RequestData.create(requestData2.getId(), i, i));
                } else {
                    arrayList.add(requestData2);
                }
            }
            storeRequestData(arrayList);
        }
    }

    public void markRequestAsUnread(String str) {
        synchronized (this.lock) {
            List<RequestData> requestData = getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData requestData2 : requestData) {
                if (str.equals(requestData2.getId())) {
                    arrayList.add(RequestData.create(str, requestData2.getCommentCount() + 1, requestData2.getReadCommentCount()));
                } else {
                    arrayList.add(requestData2);
                }
            }
            storeRequestData(arrayList);
        }
    }

    public void storeRequestData(List<RequestData> list) {
        if (list != null) {
            synchronized (this.lock) {
                this.storage.put("zendesk_request_storage_request_data_list", (Object) new RequestDataList(list));
                this.storage.put("zendesk_request_storage_requests_data_cache_time", Long.toString(System.currentTimeMillis()));
            }
        }
    }

    public void updateRequestData(List<Request> list) {
        synchronized (this.lock) {
            storeRequestData(updateRequests(getRequestData(), list));
        }
    }
}
