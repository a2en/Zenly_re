package zendesk.support;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;

final class ZendeskRequestProvider implements RequestProvider {
    /* access modifiers changed from: private */
    public final AuthenticationProvider authenticationProvider;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final SupportSdkMetadata metadata;
    /* access modifiers changed from: private */
    public final ZendeskRequestService requestService;
    /* access modifiers changed from: private */
    public final RequestSessionCache requestSessionCache;
    /* access modifiers changed from: private */
    public final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider2, RequestStorage requestStorage2, RequestSessionCache requestSessionCache2, ZendeskTracker zendeskTracker2, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider2;
        this.requestStorage = requestStorage2;
        this.requestSessionCache = requestSessionCache2;
        this.zendeskTracker = zendeskTracker2;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    /* access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final C12008e<Comment> eVar) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(eVar) {
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() == null || request.getCommentCount() == null) {
                    Logger.m31614d("ZendeskRequestProvider", "The ID and / or comment count was missing. Cannot store comment totalUpdates.", new Object[0]);
                } else {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                }
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(request.getLastComment());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List a = C12010a.m31633a((List<Type>[]) new List[]{createRequest.getTags(), supportSdkSettings.getContactZendeskTags()});
        if (C12010a.m31639b((Collection<Type>) a)) {
            Logger.m31608a("ZendeskRequestProvider", "Adding tags to feedback...", new Object[0]);
            createRequest.setTags(a);
        }
    }

    /* access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(C12008e eVar) {
        Logger.m31608a("ZendeskRequestProvider", "Conversations disabled, this feature is not available on your plan or was disabled.", new Object[0]);
        if (eVar != null) {
            eVar.onError(new C12004a("Access Denied"));
        }
    }

    /* access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData requestData : list) {
            int unreadComments = requestData.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(requestData.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* access modifiers changed from: private */
    public static List<TicketForm> convertTicketFormResponse(List<RawTicketForm> list, List<RawTicketField> list2) {
        ArrayList arrayList = new ArrayList();
        Map createTicketFieldMap = createTicketFieldMap(list2);
        for (RawTicketForm createTicketFormFromResponse : list) {
            arrayList.add(createTicketFormFromResponse(createTicketFormFromResponse, createTicketFieldMap));
        }
        return arrayList;
    }

    private static Map<Long, TicketField> createTicketFieldMap(List<RawTicketField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RawTicketField rawTicketField : list) {
            hashMap.put(Long.valueOf(rawTicketField.getId()), TicketField.create(rawTicketField));
        }
        return hashMap;
    }

    private static TicketForm createTicketFormFromResponse(RawTicketForm rawTicketForm, Map<Long, TicketField> map) {
        ArrayList arrayList = new ArrayList();
        for (Long l : rawTicketForm.getTicketFieldIds()) {
            if (!(l == null || map.get(l) == null)) {
                arrayList.add(map.get(l));
            }
        }
        return RawTicketForm.create(rawTicketForm, arrayList);
    }

    /* access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final C12008e<List<Request>> eVar) {
        if (C12017g.m31659c(str)) {
            str = "new,open,pending,hold,solved,closed";
        }
        C136753 r0 = new ZendeskCallbackSuccess<List<Request>>(eVar) {
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(list);
                }
            }
        };
        String str2 = "public_updated_at,last_commenting_agents,last_comment,first_comment";
        if (authenticationType == AuthenticationType.ANONYMOUS) {
            List<RequestData> requestData = this.requestStorage.getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData id : requestData) {
                arrayList.add(id.getId());
            }
            if (C12010a.m31635a((Collection<Type>) arrayList)) {
                Logger.m31614d("ZendeskRequestProvider", "getAllRequestsInternal: There are no requests to fetch", new Object[0]);
                if (eVar != null) {
                    eVar.onSuccess(new ArrayList());
                    return;
                }
                return;
            }
            this.requestService.getAllRequests(C12017g.m31653a((List<String>) arrayList), str, str2, r0);
            return;
        }
        this.requestService.getAllRequests(str, str2, r0);
    }

    /* access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final C12008e<Request> eVar) {
        C136742 r0 = new ZendeskCallbackSuccess<Request>(eVar) {
            public void onSuccess(Request request) {
                if (request.getId() == null) {
                    onError(new C12004a("The request was created, but the ID is unknown."));
                    return;
                }
                ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(request);
                }
            }
        };
        if (authenticationType != AuthenticationType.ANONYMOUS || identity == null || !(identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest(null, createRequest, r0);
            return;
        }
        this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, r0);
    }

    public void addComment(String str, EndUserComment endUserComment, C12008e<Comment> eVar) {
        SupportSettingsProvider supportSettingsProvider = this.settingsProvider;
        final String str2 = str;
        final EndUserComment endUserComment2 = endUserComment;
        final C12008e<Comment> eVar2 = eVar;
        C136808 r1 = new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str2, endUserComment2, eVar2);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(eVar2);
                }
            }
        };
        supportSettingsProvider.getSettings(r1);
    }

    public void createRequest(final CreateRequest createRequest, final C12008e<Request> eVar) {
        if (!(createRequest != null)) {
            String str = "configuration is invalid: request null";
            Logger.m31610b("ZendeskRequestProvider", str, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str));
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), eVar);
            }
        });
    }

    public void getAllRequests(C12008e<List<Request>> eVar) {
        getRequests(null, eVar);
    }

    public void getComments(final String str, final C12008e<CommentsResponse> eVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, eVar);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(eVar);
                }
            }
        });
    }

    public void getCommentsSince(String str, Date date, boolean z, C12008e<CommentsResponse> eVar) {
        SupportSettingsProvider supportSettingsProvider = this.settingsProvider;
        final String str2 = str;
        final Date date2 = date;
        final boolean z2 = z;
        final C12008e<CommentsResponse> eVar2 = eVar;
        C136786 r1 = new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str2, date2, z2, eVar2);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(eVar2);
                }
            }
        };
        supportSettingsProvider.getSettings(r1);
    }

    public void getRequest(final String str, final C12008e<Request> eVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, "public_updated_at,last_commenting_agents,last_comment,first_comment", eVar);
                    return;
                }
                ZendeskRequestProvider.answerCallbackOnConversationsDisabled(eVar);
            }
        });
    }

    public void getRequests(final String str, final C12008e<List<Request>> eVar) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), eVar);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(eVar);
                }
            }
        });
    }

    public void getTicketFormsById(List<Long> list, final C12008e<List<TicketForm>> eVar) {
        if (C12010a.m31635a((Collection<Type>) list)) {
            if (eVar != null) {
                eVar.onError(new C12004a("Ticket forms must at least contain 1 Id"));
            }
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
            Logger.m31608a("ZendeskRequestProvider", "Maximum number of allowed ticket fields: %d.", Integer.valueOf(5));
        } else {
            arrayList.addAll(list);
        }
        if (!this.requestSessionCache.containsAllTicketForms(arrayList)) {
            this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(eVar) {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (supportSdkSettings.isTicketFormSupportAvailable()) {
                        ZendeskRequestProvider.this.requestService.getTicketFormsById(C12017g.m31656b(arrayList), new ZendeskCallbackSuccess<RawTicketFormResponse>(eVar) {
                            public void onSuccess(RawTicketFormResponse rawTicketFormResponse) {
                                List access$1200 = ZendeskRequestProvider.convertTicketFormResponse(rawTicketFormResponse.getTicketForms(), rawTicketFormResponse.getTicketFields());
                                ZendeskRequestProvider.this.requestSessionCache.updateTicketFormCache(access$1200);
                                C12008e eVar = eVar;
                                if (eVar != null) {
                                    eVar.onSuccess(access$1200);
                                }
                            }
                        });
                        return;
                    }
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onError(new C12004a("Ticket form support disabled."));
                    }
                }
            });
        } else if (eVar != null) {
            eVar.onSuccess(this.requestSessionCache.getTicketFormsById(arrayList));
        }
    }

    public void getUpdatesForDevice(final C12008e<RequestUpdates> eVar) {
        if (!this.requestStorage.isRequestDataExpired()) {
            eVar.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        } else {
            this.settingsProvider.getSettings(new C12008e<SupportSdkSettings>() {
                public void onError(ErrorResponse errorResponse) {
                    eVar.onError(errorResponse);
                }

                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(eVar);
                    } else {
                        ZendeskRequestProvider.this.getAllRequestsInternal(null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(eVar) {
                            public void onSuccess(List<Request> list) {
                                eVar.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    }
                }
            });
        }
    }

    public void markRequestAsRead(String str, int i) {
        this.requestStorage.markRequestAsRead(str, i);
    }

    public void markRequestAsUnread(String str) {
        this.requestStorage.markRequestAsUnread(str);
    }
}
