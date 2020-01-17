package zendesk.support.requestlist;

import com.google.gson.p316k.C11261a;
import com.zendesk.func.ZFunc1;
import com.zendesk.func.ZFunc2;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.Attachment;
import zendesk.support.Comment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.RequestUpdates;
import zendesk.support.SupportUiStorage;
import zendesk.support.User;
import zendesk.support.requestlist.RequestInfo.AgentInfo;
import zendesk.support.requestlist.RequestInfo.MessageInfo;

public interface RequestInfoDataSource {

    public static class Disk implements RequestInfoDataSource {
        private final Executor backgroundThreadExecutor;
        /* access modifiers changed from: private */
        public final String cacheKey;
        /* access modifiers changed from: private */
        public final Executor mainThreadExecutor;
        /* access modifiers changed from: private */
        public final SupportUiStorage supportUiStorage;

        public Disk(Executor executor, Executor executor2, SupportUiStorage supportUiStorage2, String str) {
            this.mainThreadExecutor = executor;
            this.backgroundThreadExecutor = executor2;
            this.supportUiStorage = supportUiStorage2;
            this.cacheKey = str;
        }

        public void load(final C12008e<List<RequestInfo>> eVar) {
            this.backgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    final List list = (List) Disk.this.supportUiStorage.read(Disk.this.cacheKey, new C11261a<List<RequestInfo>>(this) {
                    }.getType());
                    Disk.this.mainThreadExecutor.execute(new Runnable() {
                        public void run() {
                            eVar.onSuccess(C12010a.m31638b(list));
                        }
                    });
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public void save(final List<RequestInfo> list, final C12008e<List<RequestInfo>> eVar) {
            this.backgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    Disk.this.supportUiStorage.write(Disk.this.cacheKey, list);
                    if (eVar != null) {
                        Disk.this.mainThreadExecutor.execute(new Runnable() {
                            public void run() {
                                C138022 r0 = C138022.this;
                                eVar.onSuccess(list);
                            }
                        });
                    }
                }
            });
        }
    }

    public static class LocalDataSource implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final Disk disk;

        public LocalDataSource(Disk disk2) {
            this.disk = disk2;
        }

        public void insert(final RequestInfo requestInfo, final C12008e<List<RequestInfo>> eVar) {
            this.disk.load(new C12008e<List<RequestInfo>>() {
                public void onError(ErrorResponse errorResponse) {
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onError(errorResponse);
                    }
                }

                public void onSuccess(List<RequestInfo> list) {
                    List a = C12010a.m31631a(list, requestInfo, new ZFunc2<RequestInfo, RequestInfo, Boolean>(this) {
                        public Boolean apply(RequestInfo requestInfo, RequestInfo requestInfo2) {
                            boolean equals = requestInfo2.getLocalId().equals(requestInfo.getLocalId());
                            boolean z = true;
                            boolean z2 = C12017g.m31658b(requestInfo2.getRemoteId()) && requestInfo2.getRemoteId().equals(requestInfo.getRemoteId());
                            if (!equals && !z2) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    Collections.sort(a, Repository.REQUEST_INFO_COMPARATOR);
                    LocalDataSource.this.disk.save(a, eVar);
                }
            });
        }

        public void load(C12008e<List<RequestInfo>> eVar) {
            this.disk.load(eVar);
        }

        public void remove(final String str, final C12008e<List<RequestInfo>> eVar) {
            this.disk.load(new C12008e<List<RequestInfo>>() {
                public void onError(ErrorResponse errorResponse) {
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onError(errorResponse);
                    }
                }

                public void onSuccess(List<RequestInfo> list) {
                    LocalDataSource.this.disk.save(C12010a.m31630a(list, new ZFunc1<RequestInfo, Boolean>() {
                        public Boolean apply(RequestInfo requestInfo) {
                            return Boolean.valueOf(!str.equals(requestInfo.getLocalId()));
                        }
                    }), eVar);
                }
            });
        }
    }

    public static class Network implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final RequestProvider requestProvider;

        Network(RequestProvider requestProvider2) {
            this.requestProvider = requestProvider2;
        }

        /* access modifiers changed from: private */
        public RequestInfo map(Request request, boolean z) {
            Comment firstComment = request.getFirstComment();
            Comment lastComment = request.getLastComment();
            String str = "";
            boolean z2 = z;
            RequestInfo requestInfo = new RequestInfo(str, request.getId(), request.getStatus(), z2, request.getPublicUpdatedAt(), C12010a.m31637b(C12010a.m31630a(request.getLastCommentingAgents(), new ZFunc1<User, Boolean>(this) {
                public Boolean apply(User user) {
                    return Boolean.valueOf(user != null);
                }
            }), new ZFunc1<User, AgentInfo>(this) {
                public AgentInfo apply(User user) {
                    Attachment photo = user.getPhoto();
                    return new AgentInfo(String.valueOf(user.getId()), user.getName(), photo != null ? photo.getContentUrl() : "");
                }
            }), new MessageInfo(String.valueOf(firstComment.getId()), firstComment.getCreatedAt(), firstComment.getBody()), new MessageInfo(String.valueOf(lastComment.getId()), lastComment.getCreatedAt(), lastComment.getBody()), new HashSet());
            return requestInfo;
        }

        public void load(final C12008e<List<RequestInfo>> eVar) {
            this.requestProvider.getAllRequests(new C12008e<List<Request>>() {
                public void onError(ErrorResponse errorResponse) {
                    eVar.onError(errorResponse);
                }

                public void onSuccess(final List<Request> list) {
                    Network.this.requestProvider.getUpdatesForDevice(new C12008e<RequestUpdates>() {
                        public void onError(ErrorResponse errorResponse) {
                            eVar.onError(errorResponse);
                        }

                        public void onSuccess(final RequestUpdates requestUpdates) {
                            eVar.onSuccess(C12010a.m31637b(list, new ZFunc1<Request, RequestInfo>() {
                                public RequestInfo apply(Request request) {
                                    return Network.this.map(request, requestUpdates.isRequestUnread(request.getId()));
                                }
                            }));
                        }
                    });
                }
            });
        }
    }

    public static class RemoteDataSource implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final Disk disk;
        private final Network network;

        RemoteDataSource(Network network2, Disk disk2) {
            this.network = network2;
            this.disk = disk2;
        }

        public void load(final C12008e<List<RequestInfo>> eVar) {
            this.network.load(new C12008e<List<RequestInfo>>() {
                public void onError(final ErrorResponse errorResponse) {
                    RemoteDataSource.this.disk.load(new C12008e<List<RequestInfo>>() {
                        public void onError(ErrorResponse errorResponse) {
                            eVar.onError(errorResponse);
                        }

                        public void onSuccess(List<RequestInfo> list) {
                            eVar.onSuccess(list);
                            eVar.onError(errorResponse);
                        }
                    });
                }

                public void onSuccess(List<RequestInfo> list) {
                    RemoteDataSource.this.disk.save(list, eVar);
                }
            });
        }
    }

    public static class Repository implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public static final Comparator<RequestInfo> REQUEST_INFO_COMPARATOR = new Comparator<RequestInfo>() {
            public int compare(RequestInfo requestInfo, RequestInfo requestInfo2) {
                return requestInfo.getLastUpdated().compareTo(requestInfo2.getLastUpdated()) * -1;
            }
        };
        private final RequestInfoDataSource localDataSource;
        /* access modifiers changed from: private */
        public final Merger merger;
        /* access modifiers changed from: private */
        public final RequestInfoDataSource remoteDataSource;

        static class Merger {
            Merger() {
            }

            /* access modifiers changed from: 0000 */
            public List<RequestInfo> merge(List<RequestInfo> list, List<RequestInfo> list2) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (RequestInfo requestInfo : list) {
                    String remoteId = requestInfo.getRemoteId();
                    if (C12017g.m31658b(remoteId)) {
                        hashMap.put(remoteId, requestInfo);
                    } else {
                        arrayList.add(requestInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (RequestInfo requestInfo2 : list2) {
                    String remoteId2 = requestInfo2.getRemoteId();
                    if (hashMap.containsKey(remoteId2)) {
                        arrayList2.add(merge((RequestInfo) hashMap.get(remoteId2), requestInfo2));
                        hashMap.remove(remoteId2);
                    } else {
                        arrayList2.add(requestInfo2);
                    }
                }
                arrayList2.addAll(hashMap.values());
                Collections.sort(arrayList2, Repository.REQUEST_INFO_COMPARATOR);
                return arrayList2;
            }

            private RequestInfo merge(RequestInfo requestInfo, RequestInfo requestInfo2) {
                Date lastUpdated = requestInfo.getLastUpdated();
                Date lastUpdated2 = requestInfo2.getLastUpdated();
                Date date = lastUpdated.after(lastUpdated2) ? lastUpdated : lastUpdated2;
                MessageInfo lastMessageInfo = requestInfo.getLastMessageInfo();
                MessageInfo lastMessageInfo2 = requestInfo2.getLastMessageInfo();
                RequestInfo requestInfo3 = new RequestInfo(requestInfo.getLocalId(), requestInfo2.getRemoteId(), requestInfo2.getRequestStatus(), requestInfo2.isUnread(), date, requestInfo2.getAgentInfos(), requestInfo2.getFirstMessageInfo(), lastMessageInfo.getDate().after(lastMessageInfo2.getDate()) ? lastMessageInfo : lastMessageInfo2, requestInfo.getFailedMessageIds());
                return requestInfo3;
            }
        }

        Repository(RequestInfoDataSource requestInfoDataSource, RequestInfoDataSource requestInfoDataSource2, Merger merger2) {
            this.localDataSource = requestInfoDataSource;
            this.remoteDataSource = requestInfoDataSource2;
            this.merger = merger2;
        }

        public void load(final C12008e<List<RequestInfo>> eVar) {
            this.localDataSource.load(new C12008e<List<RequestInfo>>() {
                public void onError(ErrorResponse errorResponse) {
                }

                public void onSuccess(final List<RequestInfo> list) {
                    Repository.this.remoteDataSource.load(new C12008e<List<RequestInfo>>() {
                        public void onError(ErrorResponse errorResponse) {
                            eVar.onError(errorResponse);
                        }

                        public void onSuccess(List<RequestInfo> list) {
                            C138162 r0 = C138162.this;
                            eVar.onSuccess(Repository.this.merger.merge(list, list));
                        }
                    });
                }
            });
        }
    }

    void load(C12008e<List<RequestInfo>> eVar);
}
