package app.zenly.locator.contactpicker.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.locator.R;
import app.zenly.locator.contactpicker.adapter.p061m.C2418a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.StickyRecyclerHeadersAdapter;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.LoadingTextView;
import app.zenly.locator.p135r.p137b1.C5139b;
import app.zenly.locator.p135r.p137b1.C5142c;
import app.zenly.locator.p135r.p138c1.C5151b;
import app.zenly.locator.p135r.p138c1.C5155d;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p389io.reactivex.disposables.C12275b;

public class ContactAdapter extends C1069g<C2418a> implements StickyRecyclerHeadersAdapter<C2418a>, Filterable {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C5139b> f7202e = new ArrayList();

    /* renamed from: f */
    private final Filter f7203f = new C2400d(this, null);

    /* renamed from: g */
    private final AvatarLoader f7204g;

    /* renamed from: h */
    private final C5155d f7205h;

    /* renamed from: i */
    private final OnCellInteraction f7206i = new C2398b(this, null);

    /* renamed from: j */
    private final LinkedHashMap<String, C5139b> f7207j = new LinkedHashMap<>();

    /* renamed from: k */
    private final ArrayList<String> f7208k = new ArrayList<>();

    /* renamed from: l */
    private final boolean f7209l;

    /* renamed from: m */
    private final boolean f7210m;

    /* renamed from: n */
    private final boolean f7211n;

    /* renamed from: o */
    private final Activity f7212o;

    /* renamed from: p */
    private final C12275b f7213p;

    /* renamed from: q */
    private final boolean f7214q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public List<C5139b> f7215r = this.f7202e;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7216s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Listener f7217t;

    public interface Listener {
        void onAddBumpClick();

        void onAddContactsClick();

        void onAddPhoneClick();

        void onAddUsernameClick();

        void onItemAddClick(C5139b bVar);

        void onItemClick(C5139b bVar);

        void onItemDismissed(C5139b bVar);

        void onItemsSelected(int i);
    }

    public interface OnCellInteraction {
        void onCellSelected();

        void onCellUpdated(C5139b bVar);
    }

    /* renamed from: app.zenly.locator.contactpicker.adapter.ContactAdapter$a */
    static /* synthetic */ class C2397a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7218a = new int[C5142c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                app.zenly.locator.r.b1.c[] r0 = app.zenly.locator.p135r.p137b1.C5142c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7218a = r0
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.ALREADY_ON_ZENLY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.CONTACTS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.SUGGESTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.REFERRER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.BROADCAST_INVITE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x004b }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.ADD_CONTACTS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x0056 }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.ADD_BY_BUMP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x0062 }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.ADD_BY_PHONE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f7218a     // Catch:{ NoSuchFieldError -> 0x006e }
                app.zenly.locator.r.b1.c r1 = app.zenly.locator.p135r.p137b1.C5142c.ADD_BY_USERNAME     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.contactpicker.adapter.ContactAdapter.C2397a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.contactpicker.adapter.ContactAdapter$b */
    private class C2398b implements OnCellInteraction {
        private C2398b() {
        }

        public void onCellSelected() {
            if (ContactAdapter.this.f7217t != null) {
                ContactAdapter.this.f7217t.onItemsSelected(ContactAdapter.this.mo8342c().size());
            }
        }

        public void onCellUpdated(C5139b bVar) {
            ContactAdapter contactAdapter = ContactAdapter.this;
            int a = contactAdapter.m8436a(bVar, contactAdapter.f7215r);
            if (a >= 0 && a < ContactAdapter.this.f7215r.size()) {
                ContactAdapter.this.notifyItemChanged(a);
            }
        }

        /* synthetic */ C2398b(ContactAdapter contactAdapter, C2397a aVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.contactpicker.adapter.ContactAdapter$c */
    public static abstract class C2399c implements Listener {
        public void onAddBumpClick() {
        }

        public void onAddContactsClick() {
        }

        public void onAddPhoneClick() {
        }

        public void onAddUsernameClick() {
        }

        public void onItemClick(C5139b bVar) {
        }

        public void onItemDismissed(C5139b bVar) {
        }
    }

    /* renamed from: app.zenly.locator.contactpicker.adapter.ContactAdapter$d */
    private class C2400d extends Filter {
        private C2400d() {
        }

        /* renamed from: a */
        private String m8476a(CharSequence charSequence) {
            return Normalizer.normalize(charSequence, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase(Locale.getDefault());
        }

        /* renamed from: b */
        private boolean m8478b(C5139b bVar, String str) {
            boolean z = true;
            if (bVar.mo12471a() != null) {
                for (String contains : bVar.mo12471a().getPhoneNumbersList()) {
                    if (contains.contains(str)) {
                        return true;
                    }
                }
            }
            if (bVar.mo12484g() == null || !bVar.mo12484g().getPhoneNumber().contains(str)) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: protected */
        public FilterResults performFiltering(CharSequence charSequence) {
            FilterResults filterResults = new FilterResults();
            if (TextUtils.isEmpty(charSequence)) {
                ContactAdapter.this.f7216s = true;
                filterResults.values = ContactAdapter.this.f7202e;
                filterResults.count = ContactAdapter.this.f7202e.size();
            } else {
                ContactAdapter.this.f7216s = false;
                String a = m8476a(charSequence);
                ArrayList arrayList = new ArrayList();
                for (C5139b bVar : ContactAdapter.this.f7202e) {
                    if (m8477a(bVar, a) || m8478b(bVar, a)) {
                        arrayList.add(bVar);
                    }
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            ContactAdapter contactAdapter = ContactAdapter.this;
            Object obj = filterResults.values;
            contactAdapter.f7215r = obj != null ? (List) obj : Collections.emptyList();
            ContactAdapter.this.notifyDataSetChanged();
        }

        /* synthetic */ C2400d(ContactAdapter contactAdapter, C2397a aVar) {
            this();
        }

        /* renamed from: a */
        private boolean m8477a(C5139b bVar, String str) {
            String str2;
            if (bVar.mo12471a() == null && bVar.mo12484g() == null) {
                return false;
            }
            if (bVar.mo12471a() != null) {
                str2 = m8476a(bVar.mo12471a().getFull());
            } else {
                str2 = m8476a(bVar.mo12484g().getName());
            }
            for (String startsWith : str2.split("\\s+")) {
                if (startsWith.startsWith(str)) {
                    return true;
                }
            }
            return str2.startsWith(str);
        }
    }

    public ContactAdapter(AvatarLoader avatarLoader, Activity activity, C12275b bVar, C2538c0 c0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f7204g = avatarLoader;
        this.f7212o = activity;
        this.f7213p = bVar;
        this.f7205h = new C5155d(c0Var, this.f7206i, z3);
        this.f7216s = z5;
        this.f7209l = z;
        this.f7210m = z2;
        this.f7211n = z4;
        this.f7214q = z3;
    }

    /* renamed from: a */
    static /* synthetic */ void m8439a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: d */
    private void m8450d(C2418a aVar, C5139b bVar) {
        if (bVar.mo12484g() != null) {
            int friendsCount = bVar.mo12484g().getFriendsCount();
            if (friendsCount > 0) {
                aVar.f7263e.setText(C7706a.m18757d(aVar.itemView.getContext(), friendsCount));
                aVar.f7263e.setVisibility(0);
                return;
            }
            aVar.f7263e.setVisibility(8);
            return;
        }
        int d = bVar.mo12481d();
        if (d > 1) {
            aVar.f7263e.setText(C7706a.m18755b(aVar.itemView.getContext(), d));
            aVar.f7263e.setVisibility(0);
            return;
        }
        aVar.f7263e.setVisibility(8);
    }

    /* renamed from: e */
    private void m8452e(C2418a aVar, C5139b bVar) {
        aVar.f7267i.setVisibility(8);
        aVar.f7264f.mo9418b();
        aVar.f7264f.setVisibility(8);
        aVar.f7265g.setVisibility(8);
        aVar.f7266h.setVisibility(8);
        aVar.f7260b.setVisibility(8);
        aVar.f7270l.setVisibility(8);
        aVar.itemView.setAlpha(1.0f);
        int a = this.f7205h.mo12524a(bVar);
        if (bVar.mo12484g() != null && bVar.mo12484g().getPrivateMode()) {
            aVar.f7267i.setVisibility(0);
            aVar.f7267i.setText(R.string.contacts_contactcell_label_private);
        } else if (bVar.mo12485h()) {
            aVar.f7267i.setVisibility(0);
            aVar.f7267i.setText(R.string.commons_label_friend);
        } else if (a == 3) {
            this.f7205h.mo12527a(bVar, Integer.valueOf(2));
            C5151b.m14709a(aVar, bVar, this.f7206i);
        } else if (a == 2 || bVar.mo12480c()) {
            aVar.f7267i.setVisibility(0);
            aVar.f7267i.setText(R.string.commons_label_invited_singular);
        } else if (a == 0 || a == 1) {
            if (bVar.mo12482e() != C5142c.ALREADY_ON_ZENLY || !this.f7209l) {
                if (bVar.mo12484g() != null) {
                    aVar.f7264f.setText(R.string.contacts_contactcell_button_add);
                } else {
                    aVar.f7264f.setText(R.string.contacts_contactcell_button_invite);
                }
                aVar.f7264f.setOnClickListener(new C2408h(this, aVar, bVar));
                if (a == 1) {
                    aVar.f7264f.mo9417a();
                }
                aVar.f7264f.setVisibility(0);
            } else {
                m8453f(aVar, bVar);
                return;
            }
        }
        if (this.f7210m && bVar.mo12482e() == C5142c.SUGGESTED) {
            aVar.f7265g.setVisibility(0);
            aVar.f7265g.setOnClickListener(new C2401a(this, aVar, bVar));
        }
        aVar.itemView.setClickable(this.f7211n);
        if (!this.f7209l && this.f7211n) {
            aVar.itemView.setOnClickListener(new C2407g(this, bVar));
        }
    }

    /* renamed from: f */
    private void m8453f(C2418a aVar, C5139b bVar) {
        aVar.f7264f.setVisibility(8);
        aVar.f7260b.setVisibility(0);
        aVar.f7260b.setOnCheckedChangeListener(null);
        if (this.f7207j.containsKey(bVar.mo12484g().getUuid())) {
            aVar.f7260b.setChecked(true);
        } else {
            aVar.f7260b.setChecked(false);
        }
        aVar.itemView.setOnClickListener(new C2406f(this, bVar, aVar));
    }

    /* renamed from: g */
    private void m8454g(C2418a aVar, C5139b bVar) {
        Context context = aVar.itemView.getContext();
        C0123a aVar2 = new C0123a(context);
        aVar2.mo537a((CharSequence) context.getString(R.string.contactpicker_dismissableSuggested_modal_title, new Object[]{bVar.mo12477b()}));
        aVar2.mo545b(R.string.contactpicker_dismissableSuggested_modal_cancel, C2404d.f7228e);
        aVar2.mo549c(R.string.contactpicker_dismissableSuggested_modal_hide, new C2402b(this, aVar, bVar));
        aVar2.mo550c();
    }

    public Filter getFilter() {
        return this.f7203f;
    }

    public long getHeaderId(int i) {
        long j = -1;
        if (i >= 0 && i < getItemCount() && this.f7216s) {
            C5142c e = ((C5139b) this.f7215r.get(i)).mo12482e();
            switch (C2397a.f7218a[e.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 5:
                    j = (long) e.ordinal();
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    return -1;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot find a header id for this type :");
                    sb.append(e);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
        return j;
    }

    public int getItemCount() {
        return this.f7215r.size();
    }

    public int getItemViewType(int i) {
        C5142c e = ((C5139b) this.f7215r.get(i)).mo12482e();
        switch (C2397a.f7218a[e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return R.layout.list_item_contact;
            case 5:
                return R.layout.list_item_broadcast_invite_list;
            case 6:
            case 7:
            case 8:
            case 9:
                return R.layout.list_item_contact_add;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find a layout for this type :");
                sb.append(e);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private void m8448c(C2418a aVar, C5139b bVar) {
        aVar.f7262d.setText(bVar.mo12477b());
        if (bVar.mo12484g() != null) {
            this.f7204g.load(C2884f.m9355a(bVar.mo12484g())).into(aVar.f7261c);
        } else if (bVar.mo12471a() != null) {
            this.f7204g.load(C2884f.m9357a(bVar.mo12471a())).into(aVar.f7261c);
        }
        if (bVar.mo12486i()) {
            aVar.f7263e.setText(R.string.z_track5exp1var1_contacts_contactCell_label_invited);
            aVar.f7263e.setVisibility(0);
            aVar.f7272n.setVisibility(0);
            aVar.f7272n.setBackgroundTintList(ColorStateList.valueOf(C0540a.m2536a((Context) this.f7212o, this.f7214q ? R.color.blue_medium_o70 : R.color.gray_light_o70)));
        } else {
            aVar.f7272n.setVisibility(8);
            m8450d(aVar, bVar);
        }
        m8452e(aVar, bVar);
    }

    /* renamed from: b */
    public void onBindViewHolder(C2418a aVar, int i) {
        C5139b bVar = (C5139b) this.f7215r.get(i);
        C5142c e = bVar.mo12482e();
        switch (C2397a.f7218a[e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                m8448c(aVar, bVar);
                return;
            case 5:
                m8445b(aVar, bVar);
                return;
            case 6:
                m8447c(aVar);
                return;
            case 7:
                m8444b(aVar);
                return;
            case 8:
                m8449d(aVar);
                return;
            case 9:
                m8451e(aVar);
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find a layout for this type :");
                sb.append(e);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public C2418a onCreateHeaderViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_section, viewGroup, false);
        inflate.setBackgroundColor(C7678c.m18702a(inflate.getContext(), (int) R.attr.zenlyColorBackground));
        return new C2418a(inflate);
    }

    public C2418a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2418a(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    /* renamed from: a */
    public void mo8327a(Listener listener) {
        this.f7217t = listener;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8331a(C2418a aVar, C5139b bVar, View view) {
        C5498a.m15600a(aVar.itemView.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f7205h.mo12527a(bVar, Integer.valueOf(1));
        aVar.f7264f.setVisibility(0);
        aVar.f7264f.mo9417a();
        this.f7205h.mo12525a(aVar.f7261c.getContext(), bVar);
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onItemAddClick(bVar);
        }
    }

    /* renamed from: b */
    private void m8445b(C2418a aVar, C5139b bVar) {
        new C2412l(this.f7212o, aVar.f7271m, bVar.mo12483f(), this.f7214q).mo8373a(this.f7213p);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8333a(C5139b bVar, View view) {
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onItemClick(bVar);
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo8344d(View view) {
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onAddUsernameClick();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8334a(C5139b bVar, C2418a aVar, View view) {
        String uuid = bVar.mo12484g().getUuid();
        if (this.f7207j.containsKey(uuid)) {
            this.f7208k.add(uuid);
            this.f7207j.remove(uuid);
            aVar.f7260b.setChecked(false);
            this.f7206i.onCellSelected();
            return;
        }
        this.f7208k.remove(uuid);
        this.f7207j.put(uuid, bVar);
        aVar.f7260b.setChecked(true);
        this.f7206i.onCellSelected();
    }

    /* renamed from: b */
    public /* synthetic */ void mo8339b(C2418a aVar, C5139b bVar, View view) {
        m8454g(aVar, bVar);
    }

    /* renamed from: d */
    private void m8449d(C2418a aVar) {
        m8440a(aVar, 2131231527, (int) R.string.add_friends_phone_number, (OnClickListener) new C2405e(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo8340b(C5139b bVar) {
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onItemDismissed(bVar);
        }
    }

    /* renamed from: c */
    private void m8447c(C2418a aVar) {
        m8440a(aVar, 2131231413, (int) R.string.add_friends_contacts, (OnClickListener) new C2410j(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo8337b(View view) {
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onAddContactsClick();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo8343c(View view) {
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onAddPhoneClick();
        }
    }

    /* renamed from: b */
    private void m8444b(C2418a aVar) {
        m8440a(aVar, 2131231395, (int) R.string.add_friends_bump, (OnClickListener) new C2403c(this));
    }

    /* renamed from: b */
    public void mo8341b(List<C5139b> list) {
        this.f7207j.clear();
        for (C5139b bVar : list) {
            String uuid = bVar.mo12484g().getUuid();
            if (!bVar.mo12484g().getPrivateMode() && !this.f7208k.contains(uuid)) {
                this.f7207j.put(uuid, bVar);
            }
        }
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onItemsSelected(mo8342c().size());
        }
    }

    /* renamed from: c */
    public LinkedHashMap<String, C5139b> mo8342c() {
        return this.f7207j;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8330a(C2418a aVar, C5139b bVar, DialogInterface dialogInterface, int i) {
        m8441a(aVar, bVar);
    }

    /* renamed from: a */
    private void m8441a(C2418a aVar, C5139b bVar) {
        aVar.f7265g.setVisibility(4);
        aVar.f7266h.setVisibility(0);
        aVar.itemView.animate().alpha(0.3f).withEndAction(new C2409i(this, bVar));
    }

    /* renamed from: b */
    public int mo8336b() {
        return this.f7205h.mo12523a(2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8326a(View view) {
        Listener listener = this.f7217t;
        if (listener != null) {
            listener.onAddBumpClick();
        }
    }

    /* renamed from: a */
    private void m8440a(C2418a aVar, int i, int i2, OnClickListener onClickListener) {
        aVar.f7268j.setImageResource(i);
        aVar.f7269k.setText(i2);
        aVar.itemView.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo8324a() {
        this.f7202e.clear();
    }

    /* renamed from: e */
    private void m8451e(C2418a aVar) {
        m8440a(aVar, 2131231582, (int) R.string.add_friends_username, (OnClickListener) new C2411k(this));
    }

    /* renamed from: a */
    public void mo8332a(C5139b bVar) {
        this.f7202e.add(bVar);
    }

    /* renamed from: a */
    public void mo8335a(List<C5139b> list) {
        this.f7202e.addAll(list);
    }

    /* renamed from: a */
    public void mo8325a(Context context) {
        this.f7205h.mo12526a(context, this.f7207j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m8436a(C5139b bVar, List<C5139b> list) {
        for (int i = 0; i < list.size(); i++) {
            C5139b bVar2 = (C5139b) list.get(i);
            if (bVar.mo12471a() != null && bVar2.mo12471a() != null && bVar2.mo12471a().getDeviceContactId().equals(bVar.mo12471a().getDeviceContactId())) {
                return i;
            }
            if (bVar.mo12484g() != null && bVar2.mo12484g() != null && bVar2.mo12484g().getUuid().equals(bVar.mo12484g().getUuid())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void onBindHeaderViewHolder(C2418a aVar, int i) {
        String str;
        long headerId = getHeaderId(i);
        Context context = aVar.itemView.getContext();
        if (headerId == ((long) C5142c.ALREADY_ON_ZENLY.ordinal())) {
            str = context.getString(R.string.signup_contactpicker_title_alreadyonzenly);
        } else if (headerId == ((long) C5142c.CONTACTS.ordinal())) {
            str = context.getString(R.string.signup_contactpicker_title_soononzenly);
        } else if (headerId == ((long) C5142c.SUGGESTED.ordinal())) {
            str = context.getString(R.string.signup_contactpicker_title_suggested);
        } else if (headerId == ((long) C5142c.BROADCAST_INVITE.ordinal())) {
            str = context.getString(R.string.add_friends_section_broadcastedInvite_title);
        } else {
            return;
        }
        aVar.f7259a.setText(str);
    }

    /* renamed from: a */
    public void onViewRecycled(C2418a aVar) {
        super.onViewRecycled(aVar);
        LoadingTextView loadingTextView = aVar.f7264f;
        if (loadingTextView != null) {
            loadingTextView.mo9418b();
        }
    }
}
