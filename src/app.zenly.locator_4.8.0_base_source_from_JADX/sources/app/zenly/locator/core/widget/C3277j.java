package app.zenly.locator.core.widget;

import android.content.Context;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.core.widget.j */
public final class C3277j {

    /* renamed from: a */
    private String f9131a;

    /* renamed from: b */
    private String f9132b;

    /* renamed from: c */
    private final int f9133c;

    /* renamed from: d */
    private final int f9134d;

    /* renamed from: e */
    private final TextViewLinkAction f9135e;

    public C3277j(int i, int i2) {
        this(i, i2, null, 4, null);
    }

    public C3277j(int i, int i2, TextViewLinkAction textViewLinkAction) {
        this.f9133c = i;
        this.f9134d = i2;
        this.f9135e = textViewLinkAction;
    }

    /* renamed from: a */
    public final TextViewLinkAction mo9726a() {
        return this.f9135e;
    }

    /* renamed from: b */
    public final String mo9728b() {
        return this.f9131a;
    }

    /* renamed from: c */
    public final String mo9729c() {
        return this.f9132b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3277j) {
                C3277j jVar = (C3277j) obj;
                if (this.f9133c == jVar.f9133c) {
                    if (!(this.f9134d == jVar.f9134d) || !C12932j.m33817a((Object) this.f9135e, (Object) jVar.f9135e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a = ((Integer.valueOf(this.f9133c).hashCode() * 31) + Integer.valueOf(this.f9134d).hashCode()) * 31;
        TextViewLinkAction textViewLinkAction = this.f9135e;
        return a + (textViewLinkAction != null ? textViewLinkAction.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextViewLink(textId=");
        sb.append(this.f9133c);
        sb.append(", urlId=");
        sb.append(this.f9134d);
        sb.append(", action=");
        sb.append(this.f9135e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3277j(int i, int i2, TextViewLinkAction textViewLinkAction, int i3, C12928f fVar) {
        if ((i3 & 2) != 0) {
            i2 = C7674a.f19294a;
        }
        if ((i3 & 4) != 0) {
            textViewLinkAction = null;
        }
        this(i, i2, textViewLinkAction);
    }

    /* renamed from: a */
    public final void mo9727a(Context context) {
        C12932j.m33818b(context, "context");
        this.f9131a = context.getString(this.f9133c);
        int i = this.f9134d;
        this.f9132b = i != C7674a.f19294a ? context.getString(i) : null;
    }
}
