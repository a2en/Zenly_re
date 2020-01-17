package zendesk.core;

import com.zendesk.service.C12008e;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ZendeskUserProvider implements UserProvider {
    private static final RequestExtractor<UserFieldResponse, List<Object>> FIELDS_EXTRACTOR = new RequestExtractor<UserFieldResponse, List<Object>>() {
        public List<Object> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final RequestExtractor<UserResponse, Map<String, String>> FIELDS_MAP_EXTRACTOR = new RequestExtractor<UserResponse, Map<String, String>>() {
        public Map<String, String> extract(UserResponse userResponse) {
            if (userResponse == null || userResponse.getUser() == null) {
                return C12010a.m31634a((Map<Key, Value>) new HashMap<Key,Value>());
            }
            return userResponse.getUser().getUserFields();
        }
    };
    private static final RequestExtractor<UserResponse, List<String>> TAGS_EXTRACTOR = new RequestExtractor<UserResponse, List<String>>() {
        public List<String> extract(UserResponse userResponse) {
            if (userResponse == null || userResponse.getUser() == null) {
                return C12010a.m31632a((List<Type>) new ArrayList<Type>());
            }
            return userResponse.getUser().getTags();
        }
    };
    private static final RequestExtractor<UserResponse, User> USER_EXTRACTOR = new RequestExtractor<UserResponse, User>() {
        public User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private final UserService userService;

    ZendeskUserProvider(UserService userService2) {
        this.userService = userService2;
    }

    public void addTags(List<String> list, final C12008e<List<String>> eVar) {
        UserTagRequest userTagRequest = new UserTagRequest();
        userTagRequest.setTags(C12010a.m31638b(list));
        this.userService.addTags(userTagRequest).enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<List<String>>(this, eVar) {
            public void onSuccess(List<String> list) {
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(list);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    public void deleteTags(List<String> list, final C12008e<List<String>> eVar) {
        this.userService.deleteTags(C12017g.m31653a(C12010a.m31638b(list))).enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<List<String>>(this, eVar) {
            public void onSuccess(List<String> list) {
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(list);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    public void getUser(final C12008e<User> eVar) {
        this.userService.getUser().enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<User>(this, eVar) {
            public void onSuccess(User user) {
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(user);
                }
            }
        }, USER_EXTRACTOR));
    }

    public void getUserFields(final C12008e<List<Object>> eVar) {
        this.userService.getUserFields().enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<List<Object>>(this, eVar) {
            public void onSuccess(List<Object> list) {
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(list);
                }
            }
        }, FIELDS_EXTRACTOR));
    }

    public void setUserFields(Map<String, String> map, final C12008e<Map<String, String>> eVar) {
        this.userService.setUserFields(new UserFieldRequest(map)).enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<Map<String, String>>(this, eVar) {
            public void onSuccess(Map<String, String> map) {
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(map);
                }
            }
        }, FIELDS_MAP_EXTRACTOR));
    }
}
