package app.zenly.locator.p210z.p211b;

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

/* renamed from: app.zenly.locator.z.b.l */
public final class C6321l extends ReportReasonController {

    /* renamed from: X */
    private static final Map<String, Integer> f15842X = new LinkedHashMap();

    /* renamed from: app.zenly.locator.z.b.l$a */
    class C6322a extends C2509b {
        C6322a() {
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C8819d dVar;
            if (!TextUtils.isEmpty(C6321l.this.f13765S.getReason())) {
                C6321l lVar = C6321l.this;
                if (TextUtils.equals(lVar.f13765S.getReason(), C6323b.HARASSMENT.f15849e)) {
                    dVar = new C6317h(C6321l.this.mo12756D());
                } else {
                    dVar = new C6319j(C6321l.this.mo12756D());
                }
                lVar.mo12767c(dVar);
            }
        }
    }

    /* renamed from: app.zenly.locator.z.b.l$b */
    public enum C6323b {
        HARASSMENT("report_message_reason_harassment"),
        INAPPROPRIATE("report_message_reason_inappropriate"),
        OFFENSIVE("report_message_reason_offensive"),
        OTHER("report_message_reason_other");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f15849e;

        private C6323b(String str) {
            this.f15849e = str;
        }

        /* renamed from: a */
        public static C6323b m17397a(String str) {
            C6323b[] values;
            for (C6323b bVar : values()) {
                if (TextUtils.equals(bVar.f15849e, str)) {
                    return bVar;
                }
            }
            throw new IllegalArgumentException("Unknown reason");
        }
    }

    static {
        f15842X.put(C6323b.HARASSMENT.f15849e, Integer.valueOf(R.string.report_message_reason_harassment));
        f15842X.put(C6323b.INAPPROPRIATE.f15849e, Integer.valueOf(R.string.report_message_reason_inappropriate));
        f15842X.put(C6323b.OFFENSIVE.f15849e, Integer.valueOf(R.string.report_message_reason_offensive));
        f15842X.put(C6323b.OTHER.f15849e, Integer.valueOf(R.string.report_message_reason_other));
    }

    public C6321l(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: d */
    public /* synthetic */ void mo14169d(String str) {
        this.f13765S.mo22153c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a = super.mo7054a(layoutInflater, viewGroup);
        Context context = a.getContext();
        this.f13746U.setTitle((CharSequence) context.getString(R.string.report_message_title, new Object[]{this.f13762P}));
        mo12774a(context, f15842X, new C6316g(this));
        this.f13748W.setOnClickListener(new C6322a());
        return a;
    }
}
