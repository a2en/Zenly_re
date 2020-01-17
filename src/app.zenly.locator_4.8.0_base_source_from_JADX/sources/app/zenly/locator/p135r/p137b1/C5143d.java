package app.zenly.locator.p135r.p137b1;

import app.zenly.locator.core.invitations.C2545e0;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.r.b1.d */
public final class C5143d {

    /* renamed from: a */
    private final UserProto$User f13341a;

    /* renamed from: b */
    private final List<C5139b> f13342b;

    /* renamed from: c */
    private final List<C5139b> f13343c;

    /* renamed from: d */
    private final List<C5139b> f13344d;

    /* renamed from: e */
    private final List<C2545e0> f13345e;

    public C5143d(UserProto$User userProto$User, List<C5139b> list, List<C5139b> list2, List<C5139b> list3, List<? extends C2545e0> list4) {
        C12932j.m33818b(list, "alreadyList");
        C12932j.m33818b(list2, "suggestedList");
        C12932j.m33818b(list3, "contactList");
        C12932j.m33818b(list4, "sharingOptions");
        this.f13341a = userProto$User;
        this.f13342b = list;
        this.f13343c = list2;
        this.f13344d = list3;
        this.f13345e = list4;
    }

    /* renamed from: a */
    public final List<C5139b> mo12490a() {
        return this.f13342b;
    }

    /* renamed from: b */
    public final List<C5139b> mo12491b() {
        return this.f13344d;
    }

    /* renamed from: c */
    public final UserProto$User mo12492c() {
        return this.f13341a;
    }

    /* renamed from: d */
    public final List<C2545e0> mo12493d() {
        return this.f13345e;
    }

    /* renamed from: e */
    public final List<C5139b> mo12494e() {
        return this.f13343c;
    }
}
