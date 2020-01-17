package app.zenly.locator.p210z.p212c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.report.base.ReportReasonController;
import com.bluelinelabs.conductor.C8819d;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: app.zenly.locator.z.c.i */
public final class C6332i extends ReportReasonController {

    /* renamed from: X */
    private static final Map<String, Integer> f15858X = new LinkedHashMap();

    /* renamed from: app.zenly.locator.z.c.i$a */
    class C6333a extends C2509b {
        C6333a() {
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C8819d dVar;
            String reason = C6332i.this.f13764R.getReason();
            if (!TextUtils.isEmpty(reason)) {
                boolean z = TextUtils.equals(reason, C6334b.SPAM.f15866e) || TextUtils.equals(reason, C6334b.MULTIPLE_INVITES.f15866e);
                C6332i iVar = C6332i.this;
                if (z) {
                    dVar = new C6329f(iVar.mo12757E());
                } else {
                    dVar = new C6331h(iVar.mo12757E());
                }
                iVar.mo12767c(dVar);
            }
        }
    }

    /* renamed from: app.zenly.locator.z.c.i$b */
    public enum C6334b {
        SPAM("report_user_reason_spam_chat"),
        MULTIPLE_INVITES("report_user_reason_repeatedInvites"),
        PICTURE("report_user_reason_picture"),
        NAME("report_user_reason_name"),
        OTHER("report_user_reason_other");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f15866e;

        private C6334b(String str) {
            this.f15866e = str;
        }

        /* renamed from: a */
        public static C6334b m17414a(String str) {
            C6334b[] values;
            for (C6334b bVar : values()) {
                if (TextUtils.equals(bVar.f15866e, str)) {
                    return bVar;
                }
            }
            throw new IllegalArgumentException("Unknown reason");
        }
    }

    static {
        f15858X.put(C6334b.SPAM.f15866e, Integer.valueOf(R.string.report_user_reason_spam_chat));
        f15858X.put(C6334b.MULTIPLE_INVITES.f15866e, Integer.valueOf(R.string.report_user_reason_repeatedInvites));
        f15858X.put(C6334b.PICTURE.f15866e, Integer.valueOf(R.string.report_user_reason_picture));
        f15858X.put(C6334b.NAME.f15866e, Integer.valueOf(R.string.report_user_reason_name));
        f15858X.put(C6334b.OTHER.f15866e, Integer.valueOf(R.string.report_user_reason_other));
    }

    public C6332i(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: d */
    public /* synthetic */ void mo14174d(String str) {
        this.f13764R.mo22225a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        Context context = a.getContext();
        this.f13746U.setTitle((CharSequence) context.getString(R.string.report_user_title, new Object[]{this.f13762P}));
        mo12774a(context, f15858X, new C6328e(this));
        this.f13748W.setOnClickListener(new C6333a());
        return a;
    }
}
