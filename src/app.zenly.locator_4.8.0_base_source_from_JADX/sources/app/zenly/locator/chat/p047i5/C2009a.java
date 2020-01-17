package app.zenly.locator.chat.p047i5;

import app.zenly.locator.R;
import app.zenly.locator.chat.view.ComposeView;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.chat.i5.a */
public final class C2009a {

    /* renamed from: a */
    private final ComposeView f6418a;

    public C2009a(ComposeView composeView) {
        C12932j.m33818b(composeView, "composeView");
        this.f6418a = composeView;
    }

    /* renamed from: a */
    public final void mo7814a() {
        this.f6418a.mo8258a(2131231608, R.string.gchat_groupleft_title_short, new Object[0]);
    }

    /* renamed from: b */
    public final void mo7818b(String str) {
        C12932j.m33818b(str, "userName");
        this.f6418a.mo8258a(2131231391, R.string.chat_zenbot_message_blocked, str);
    }

    /* renamed from: c */
    public final void mo7819c() {
        this.f6418a.mo8258a(2131231501, R.string.chat_placeholder_private_self, new Object[0]);
    }

    /* renamed from: d */
    public final void mo7821d(String str) {
        C12932j.m33818b(str, "userName");
        this.f6418a.mo8258a(2131231391, R.string.chat_zenbot_message_block, str);
    }

    /* renamed from: a */
    public final void mo7815a(String str) {
        C12932j.m33818b(str, "hintWithName");
        this.f6418a.mo8258a(C7674a.f19294a, R.string.chat_placeholder_messageuser, str);
    }

    /* renamed from: b */
    public final void mo7817b() {
        this.f6418a.mo8258a(C7674a.f19294a, R.string.chat_placeholder_message_group, new Object[0]);
    }

    /* renamed from: c */
    public final void mo7820c(String str) {
        C12932j.m33818b(str, "userName");
        this.f6418a.mo8258a(2131231501, R.string.chat_placeholder_private_other, str);
    }

    /* renamed from: a */
    public final void mo7816a(boolean z) {
        this.f6418a.setStateEnabled(z);
    }
}
