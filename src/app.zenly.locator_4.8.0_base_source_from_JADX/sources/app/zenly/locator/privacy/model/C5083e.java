package app.zenly.locator.privacy.model;

import android.util.Pair;
import app.zenly.locator.core.store.api.C2991u0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.privacy.model.e */
public class C5083e {

    /* renamed from: a */
    public Map<C5082d, List<Pair<UserProto$User, C6981a>>> f13162a = new LinkedHashMap();

    /* renamed from: b */
    public Map<Pair<UserProto$User, C6981a>, C5082d> f13163b = new LinkedHashMap();

    /* renamed from: c */
    public Map<String, C2991u0> f13164c = new LinkedHashMap();

    /* renamed from: d */
    public List<UserProto$User> f13165d = Collections.emptyList();

    /* renamed from: a */
    public void mo12328a(Map<String, C2991u0> map) {
        this.f13164c = map;
    }

    /* renamed from: a */
    public void mo12327a(List<UserProto$User> list) {
        this.f13165d = list;
    }
}
