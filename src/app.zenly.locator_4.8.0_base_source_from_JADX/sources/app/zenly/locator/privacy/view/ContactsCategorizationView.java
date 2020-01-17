package app.zenly.locator.privacy.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.base.widget.LinearLayout.LayoutParams;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.privacy.C5093v;
import app.zenly.locator.privacy.model.C5082d;
import java.util.HashMap;
import java.util.Map;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public class ContactsCategorizationView extends LinearLayout {

    /* renamed from: A */
    private C5097b f13194A;

    /* renamed from: B */
    private DataSetObserver f13195B;

    /* renamed from: v */
    private C5093v f13196v;

    /* renamed from: w */
    private Map<C5082d, TextView> f13197w;

    /* renamed from: x */
    private Map<C5082d, TextView> f13198x;

    /* renamed from: y */
    private Map<C5082d, TextView> f13199y;

    /* renamed from: z */
    private Map<C5082d, PaddedGridView> f13200z;

    public interface ContactCheckedChangedListener {
        void onContactCheckedStateChanged(Pair<UserProto$User, C6981a> pair, boolean z);
    }

    /* renamed from: app.zenly.locator.privacy.view.ContactsCategorizationView$a */
    class C5096a extends DataSetObserver {
        C5096a() {
        }

        public void onChanged() {
            ContactsCategorizationView.this.mo12353b();
        }

        public void onInvalidated() {
            ContactsCategorizationView.this.mo12353b();
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.ContactsCategorizationView$b */
    private class C5097b implements ContactCheckedChangedListener {

        /* renamed from: a */
        private ContactCheckedChangedListener f13202a;

        private C5097b(ContactsCategorizationView contactsCategorizationView) {
        }

        /* renamed from: a */
        public void mo12361a(ContactCheckedChangedListener contactCheckedChangedListener) {
            this.f13202a = contactCheckedChangedListener;
        }

        public void onContactCheckedStateChanged(Pair<UserProto$User, C6981a> pair, boolean z) {
            this.f13202a.onContactCheckedStateChanged(pair, z);
        }

        /* synthetic */ C5097b(ContactsCategorizationView contactsCategorizationView, C5096a aVar) {
            this(contactsCategorizationView);
        }

        /* renamed from: a */
        public boolean mo12362a() {
            return this.f13202a != null;
        }
    }

    public ContactsCategorizationView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo6846a() {
        for (int i = 0; i < this.f13196v.mo12333a(); i++) {
            C5082d dVar = (C5082d) this.f13196v.mo12336a(i).getKey();
            View b = this.f13196v.mo12339b(i, null, this);
            b.setTag(dVar);
            PaddedGridView a = this.f13196v.mo12335a(i, null, this);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.rightMargin = getContext().getResources().getDimensionPixelSize(R.dimen.spacing_200);
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R.dimen.spacing_200);
            a.setLayoutParams(layoutParams);
            TextView textView = (TextView) b.findViewById(R.id.selectAll);
            TextView textView2 = (TextView) b.findViewById(R.id.noFriends);
            TextView textView3 = (TextView) b.findViewById(R.id.noFriendsDescription);
            textView2.setText(dVar.f13160g);
            if (C7674a.m18692a(dVar.f13161h)) {
                textView3.setText(dVar.f13161h);
            }
            textView.setVisibility(this.f13196v.mo12342b(i) ? 4 : 0);
            int i2 = 8;
            textView2.setVisibility(this.f13196v.mo12342b(i) ? 0 : 8);
            if (this.f13196v.mo12342b(i)) {
                i2 = 0;
            }
            textView3.setVisibility(i2);
            textView.setOnClickListener(new C5109b(a));
            this.f13197w.put(dVar, textView);
            this.f13198x.put(dVar, textView2);
            this.f13199y.put(dVar, textView3);
            a.setTag(dVar);
            a.setSelectionListener(new C5108a(this, textView));
            this.f13200z.put(dVar, a);
        }
        addView(new View(getContext()), -1, C3200e0.m10183a(getContext(), 120));
    }

    /* renamed from: b */
    public void mo12353b() {
        for (C5082d dVar : this.f13200z.keySet()) {
            PaddedGridView paddedGridView = (PaddedGridView) this.f13200z.get(dVar);
            paddedGridView.getAdapter().notifyDataSetChanged();
            int ordinal = dVar.ordinal();
            TextView textView = (TextView) this.f13197w.get(dVar);
            TextView textView2 = (TextView) this.f13198x.get(dVar);
            TextView textView3 = (TextView) this.f13199y.get(dVar);
            int i = 0;
            textView.setVisibility(this.f13196v.mo12342b(ordinal) ? 4 : 0);
            textView2.setVisibility(this.f13196v.mo12342b(ordinal) ? 0 : 8);
            if (!this.f13196v.mo12342b(ordinal)) {
                i = 8;
            }
            textView3.setVisibility(i);
            if (paddedGridView.mo12395a()) {
                textView.setText(R.string.commons_button_unselectall);
            } else {
                textView.setText(R.string.commons_button_selectall);
            }
        }
    }

    /* renamed from: c */
    public void mo12354c() {
        for (PaddedGridView c : this.f13200z.values()) {
            c.mo12397c();
        }
    }

    public C5093v getAdapter() {
        return this.f13196v;
    }

    public void setActionModeCallback(ContactCheckedChangedListener contactCheckedChangedListener) {
        if (this.f13194A == null) {
            this.f13194A = new C5097b(this, null);
        }
        this.f13194A.mo12361a(contactCheckedChangedListener);
    }

    public void setAdapter(C5093v vVar) {
        C5093v vVar2 = this.f13196v;
        if (vVar2 != null) {
            vVar2.mo12341b(this.f13195B);
        }
        this.f13196v = vVar;
        C5093v vVar3 = this.f13196v;
        if (vVar3 != null) {
            vVar3.mo12337a(this.f13195B);
        }
        mo6846a();
        mo12353b();
    }

    public ContactsCategorizationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactsCategorizationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13195B = new C5096a();
        setOrientation(1);
        this.f13197w = new HashMap();
        this.f13198x = new HashMap();
        this.f13199y = new HashMap();
        this.f13200z = new HashMap();
    }

    /* renamed from: a */
    static /* synthetic */ void m14509a(PaddedGridView paddedGridView, View view) {
        if (paddedGridView.mo12395a()) {
            paddedGridView.mo12397c();
        } else {
            paddedGridView.mo12396b();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12352a(TextView textView, PaddedGridView paddedGridView, int i, boolean z) {
        if (this.f13194A.mo12362a()) {
            this.f13194A.onContactCheckedStateChanged((Pair) paddedGridView.getAdapter().getItem(i), z);
        }
        if (paddedGridView.mo12395a()) {
            textView.setText(R.string.commons_button_unselectall);
        } else {
            textView.setText(R.string.commons_button_selectall);
        }
    }
}
