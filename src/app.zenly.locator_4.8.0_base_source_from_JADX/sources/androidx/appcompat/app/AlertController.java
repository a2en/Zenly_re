package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import java.lang.ref.WeakReference;
import p214e.p215a.C7521a;
import p214e.p215a.C7526f;
import p214e.p215a.C7530j;

class AlertController {

    /* renamed from: A */
    NestedScrollView f148A;

    /* renamed from: B */
    private int f149B = 0;

    /* renamed from: C */
    private Drawable f150C;

    /* renamed from: D */
    private ImageView f151D;

    /* renamed from: E */
    private TextView f152E;

    /* renamed from: F */
    private TextView f153F;

    /* renamed from: G */
    private View f154G;

    /* renamed from: H */
    ListAdapter f155H;

    /* renamed from: I */
    int f156I = -1;

    /* renamed from: J */
    private int f157J;

    /* renamed from: K */
    private int f158K;

    /* renamed from: L */
    int f159L;

    /* renamed from: M */
    int f160M;

    /* renamed from: N */
    int f161N;

    /* renamed from: O */
    int f162O;

    /* renamed from: P */
    private boolean f163P;

    /* renamed from: Q */
    private int f164Q = 0;

    /* renamed from: R */
    Handler f165R;

    /* renamed from: S */
    private final OnClickListener f166S = new C0094a();

    /* renamed from: a */
    private final Context f167a;

    /* renamed from: b */
    final C0125c f168b;

    /* renamed from: c */
    private final Window f169c;

    /* renamed from: d */
    private final int f170d;

    /* renamed from: e */
    private CharSequence f171e;

    /* renamed from: f */
    private CharSequence f172f;

    /* renamed from: g */
    ListView f173g;

    /* renamed from: h */
    private View f174h;

    /* renamed from: i */
    private int f175i;

    /* renamed from: j */
    private int f176j;

    /* renamed from: k */
    private int f177k;

    /* renamed from: l */
    private int f178l;

    /* renamed from: m */
    private int f179m;

    /* renamed from: n */
    private boolean f180n = false;

    /* renamed from: o */
    Button f181o;

    /* renamed from: p */
    private CharSequence f182p;

    /* renamed from: q */
    Message f183q;

    /* renamed from: r */
    private Drawable f184r;

    /* renamed from: s */
    Button f185s;

    /* renamed from: t */
    private CharSequence f186t;

    /* renamed from: u */
    Message f187u;

    /* renamed from: v */
    private Drawable f188v;

    /* renamed from: w */
    Button f189w;

    /* renamed from: x */
    private CharSequence f190x;

    /* renamed from: y */
    Message f191y;

    /* renamed from: z */
    private Drawable f192z;

    public static class AlertParams {

        /* renamed from: A */
        public int f193A;

        /* renamed from: B */
        public int f194B;

        /* renamed from: C */
        public int f195C;

        /* renamed from: D */
        public int f196D;

        /* renamed from: E */
        public boolean f197E = false;

        /* renamed from: F */
        public boolean[] f198F;

        /* renamed from: G */
        public boolean f199G;

        /* renamed from: H */
        public boolean f200H;

        /* renamed from: I */
        public int f201I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f202J;

        /* renamed from: K */
        public Cursor f203K;

        /* renamed from: L */
        public String f204L;

        /* renamed from: M */
        public String f205M;

        /* renamed from: N */
        public OnItemSelectedListener f206N;

        /* renamed from: O */
        public OnPrepareListViewListener f207O;

        /* renamed from: a */
        public final Context f208a;

        /* renamed from: b */
        public final LayoutInflater f209b;

        /* renamed from: c */
        public int f210c = 0;

        /* renamed from: d */
        public Drawable f211d;

        /* renamed from: e */
        public int f212e = 0;

        /* renamed from: f */
        public CharSequence f213f;

        /* renamed from: g */
        public View f214g;

        /* renamed from: h */
        public CharSequence f215h;

        /* renamed from: i */
        public CharSequence f216i;

        /* renamed from: j */
        public Drawable f217j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f218k;

        /* renamed from: l */
        public CharSequence f219l;

        /* renamed from: m */
        public Drawable f220m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f221n;

        /* renamed from: o */
        public CharSequence f222o;

        /* renamed from: p */
        public Drawable f223p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f224q;

        /* renamed from: r */
        public boolean f225r;

        /* renamed from: s */
        public OnCancelListener f226s;

        /* renamed from: t */
        public OnDismissListener f227t;

        /* renamed from: u */
        public OnKeyListener f228u;

        /* renamed from: v */
        public CharSequence[] f229v;

        /* renamed from: w */
        public ListAdapter f230w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f231x;

        /* renamed from: y */
        public int f232y;

        /* renamed from: z */
        public View f233z;

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$a */
        class C0090a extends ArrayAdapter<CharSequence> {

            /* renamed from: e */
            final /* synthetic */ RecycleListView f234e;

            C0090a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f234e = recycleListView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = AlertParams.this.f198F;
                if (zArr != null && zArr[i]) {
                    this.f234e.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$b */
        class C0091b extends CursorAdapter {

            /* renamed from: e */
            private final int f236e;

            /* renamed from: f */
            private final int f237f;

            /* renamed from: g */
            final /* synthetic */ RecycleListView f238g;

            /* renamed from: h */
            final /* synthetic */ AlertController f239h;

            C0091b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                this.f238g = recycleListView;
                this.f239h = alertController;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.f236e = cursor2.getColumnIndexOrThrow(AlertParams.this.f204L);
                this.f237f = cursor2.getColumnIndexOrThrow(AlertParams.this.f205M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f236e));
                RecycleListView recycleListView = this.f238g;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f237f) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return AlertParams.this.f209b.inflate(this.f239h.f160M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$c */
        class C0092c implements OnItemClickListener {

            /* renamed from: e */
            final /* synthetic */ AlertController f241e;

            C0092c(AlertController alertController) {
                this.f241e = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AlertParams.this.f231x.onClick(this.f241e.f168b, i);
                if (!AlertParams.this.f200H) {
                    this.f241e.f168b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$d */
        class C0093d implements OnItemClickListener {

            /* renamed from: e */
            final /* synthetic */ RecycleListView f243e;

            /* renamed from: f */
            final /* synthetic */ AlertController f244f;

            C0093d(RecycleListView recycleListView, AlertController alertController) {
                this.f243e = recycleListView;
                this.f244f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = AlertParams.this.f198F;
                if (zArr != null) {
                    zArr[i] = this.f243e.isItemChecked(i);
                }
                AlertParams.this.f202J.onClick(this.f244f.f168b, i, this.f243e.isItemChecked(i));
            }
        }

        public AlertParams(Context context) {
            this.f208a = context;
            this.f225r = true;
            this.f209b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2, types: [androidx.appcompat.app.AlertController$g] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v17, types: [androidx.appcompat.app.AlertController$AlertParams$b] */
        /* JADX WARNING: type inference failed for: r1v18, types: [androidx.appcompat.app.AlertController$AlertParams$a] */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v19, types: [androidx.appcompat.app.AlertController$AlertParams$b] */
        /* JADX WARNING: type inference failed for: r1v20, types: [androidx.appcompat.app.AlertController$AlertParams$a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [android.widget.ListAdapter]
          assigns: [android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$AlertParams$b, androidx.appcompat.app.AlertController$AlertParams$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$AlertParams$b, androidx.appcompat.app.AlertController$AlertParams$a]
          mth insns count: 68
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m234b(androidx.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f209b
                int r1 = r12.f159L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f199G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f203K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$AlertParams$a r9 = new androidx.appcompat.app.AlertController$AlertParams$a
                android.content.Context r3 = r11.f208a
                int r4 = r12.f160M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f229v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$AlertParams$b r9 = new androidx.appcompat.app.AlertController$AlertParams$b
                android.content.Context r3 = r11.f208a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f200H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f161N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f162O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f203K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f208a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f204L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f230w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$g r9 = new androidx.appcompat.app.AlertController$g
                android.content.Context r2 = r11.f208a
                java.lang.CharSequence[] r3 = r11.f229v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$AlertParams$OnPrepareListViewListener r1 = r11.f207O
                if (r1 == 0) goto L_0x006e
                r1.onPrepareListView(r0)
            L_0x006e:
                r12.f155H = r9
                int r1 = r11.f201I
                r12.f156I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f231x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$AlertParams$c r1 = new androidx.appcompat.app.AlertController$AlertParams$c
                r1.<init>(r12)
                r0.setOnItemClickListener(r1)
                goto L_0x008d
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f202J
                if (r1 == 0) goto L_0x008d
                androidx.appcompat.app.AlertController$AlertParams$d r1 = new androidx.appcompat.app.AlertController$AlertParams$d
                r1.<init>(r0, r12)
                r0.setOnItemClickListener(r1)
            L_0x008d:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f206N
                if (r1 == 0) goto L_0x0094
                r0.setOnItemSelectedListener(r1)
            L_0x0094:
                boolean r1 = r11.f200H
                if (r1 == 0) goto L_0x009c
                r0.setChoiceMode(r8)
                goto L_0x00a4
            L_0x009c:
                boolean r1 = r11.f199G
                if (r1 == 0) goto L_0x00a4
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a4:
                r12.f173g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.AlertParams.m234b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo340a(AlertController alertController) {
            View view = this.f214g;
            if (view != null) {
                alertController.mo330a(view);
            } else {
                CharSequence charSequence = this.f213f;
                if (charSequence != null) {
                    alertController.mo337b(charSequence);
                }
                Drawable drawable = this.f211d;
                if (drawable != null) {
                    alertController.mo329a(drawable);
                }
                int i = this.f210c;
                if (i != 0) {
                    alertController.mo335b(i);
                }
                int i2 = this.f212e;
                if (i2 != 0) {
                    alertController.mo335b(alertController.mo326a(i2));
                }
            }
            CharSequence charSequence2 = this.f215h;
            if (charSequence2 != null) {
                alertController.mo332a(charSequence2);
            }
            if (!(this.f216i == null && this.f217j == null)) {
                alertController.mo328a(-1, this.f216i, this.f218k, (Message) null, this.f217j);
            }
            if (!(this.f219l == null && this.f220m == null)) {
                alertController.mo328a(-2, this.f219l, this.f221n, (Message) null, this.f220m);
            }
            if (!(this.f222o == null && this.f223p == null)) {
                alertController.mo328a(-3, this.f222o, this.f224q, (Message) null, this.f223p);
            }
            if (!(this.f229v == null && this.f203K == null && this.f230w == null)) {
                m234b(alertController);
            }
            View view2 = this.f233z;
            if (view2 == null) {
                int i3 = this.f232y;
                if (i3 != 0) {
                    alertController.mo339c(i3);
                }
            } else if (this.f197E) {
                alertController.mo331a(view2, this.f193A, this.f194B, this.f195C, this.f196D);
            } else {
                alertController.mo336b(view2);
            }
        }
    }

    public static class RecycleListView extends ListView {

        /* renamed from: e */
        private final int f246e;

        /* renamed from: f */
        private final int f247f;

        public RecycleListView(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public void mo347a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f246e, getPaddingRight(), z2 ? getPaddingBottom() : this.f247f);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.RecycleListView);
            this.f247f = obtainStyledAttributes.getDimensionPixelOffset(C7530j.RecycleListView_paddingBottomNoButtons, -1);
            this.f246e = obtainStyledAttributes.getDimensionPixelOffset(C7530j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0094a implements OnClickListener {
        C0094a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f181o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f183q
                if (r0 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f185s
                if (r3 != r1) goto L_0x001e
                android.os.Message r0 = r0.f187u
                if (r0 == 0) goto L_0x001e
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x001e:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f189w
                if (r3 != r1) goto L_0x002d
                android.os.Message r3 = r0.f191y
                if (r3 == 0) goto L_0x002d
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 == 0) goto L_0x0033
                r3.sendToTarget()
            L_0x0033:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f165R
                r1 = 1
                androidx.appcompat.app.c r3 = r3.f168b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0094a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0095b implements OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f249a;

        /* renamed from: b */
        final /* synthetic */ View f250b;

        C0095b(AlertController alertController, View view, View view2) {
            this.f249a = view;
            this.f250b = view2;
        }

        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m209a(nestedScrollView, this.f249a, this.f250b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0096c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f251e;

        /* renamed from: f */
        final /* synthetic */ View f252f;

        C0096c(View view, View view2) {
            this.f251e = view;
            this.f252f = view2;
        }

        public void run() {
            AlertController.m209a(AlertController.this.f148A, this.f251e, this.f252f);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0097d implements OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f254a;

        /* renamed from: b */
        final /* synthetic */ View f255b;

        C0097d(AlertController alertController, View view, View view2) {
            this.f254a = view;
            this.f255b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m209a(absListView, this.f254a, this.f255b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0098e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f256e;

        /* renamed from: f */
        final /* synthetic */ View f257f;

        C0098e(View view, View view2) {
            this.f256e = view;
            this.f257f = view2;
        }

        public void run() {
            AlertController.m209a(AlertController.this.f173g, this.f256e, this.f257f);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    private static final class C0099f extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f259a;

        public C0099f(DialogInterface dialogInterface) {
            this.f259a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f259a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static class C0100g extends ArrayAdapter<CharSequence> {
        public C0100g(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0125c cVar, Window window) {
        this.f167a = context;
        this.f168b = cVar;
        this.f169c = window;
        this.f165R = new C0099f(cVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C7530j.AlertDialog, C7521a.alertDialogStyle, 0);
        this.f157J = obtainStyledAttributes.getResourceId(C7530j.AlertDialog_android_layout, 0);
        this.f158K = obtainStyledAttributes.getResourceId(C7530j.AlertDialog_buttonPanelSideLayout, 0);
        this.f159L = obtainStyledAttributes.getResourceId(C7530j.AlertDialog_listLayout, 0);
        this.f160M = obtainStyledAttributes.getResourceId(C7530j.AlertDialog_multiChoiceItemLayout, 0);
        this.f161N = obtainStyledAttributes.getResourceId(C7530j.AlertDialog_singleChoiceItemLayout, 0);
        this.f162O = obtainStyledAttributes.getResourceId(C7530j.AlertDialog_listItemLayout, 0);
        this.f163P = obtainStyledAttributes.getBoolean(C7530j.AlertDialog_showTitle, true);
        this.f170d = obtainStyledAttributes.getDimensionPixelSize(C7530j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        cVar.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    private static boolean m213a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7521a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static boolean m217c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m217c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m218d() {
        View findViewById = this.f169c.findViewById(C7526f.parentPanel);
        View findViewById2 = findViewById.findViewById(C7526f.topPanel);
        View findViewById3 = findViewById.findViewById(C7526f.contentPanel);
        View findViewById4 = findViewById.findViewById(C7526f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C7526f.customPanel);
        m216c(viewGroup);
        View findViewById5 = viewGroup.findViewById(C7526f.topPanel);
        View findViewById6 = viewGroup.findViewById(C7526f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C7526f.buttonPanel);
        ViewGroup a = m208a(findViewById5, findViewById2);
        ViewGroup a2 = m208a(findViewById6, findViewById3);
        ViewGroup a3 = m208a(findViewById7, findViewById4);
        m214b(a2);
        m210a(a3);
        m219d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C7526f.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f148A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f172f == null && this.f173g == null)) {
                view = a.findViewById(C7526f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C7526f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.f173g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo347a(z2, z3);
        }
        if (!z) {
            View view2 = this.f173g;
            if (view2 == null) {
                view2 = this.f148A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m211a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f173g;
        if (listView2 != null) {
            ListAdapter listAdapter = this.f155H;
            if (listAdapter != null) {
                listView2.setAdapter(listAdapter);
                int i = this.f156I;
                if (i > -1) {
                    listView2.setItemChecked(i, true);
                    listView2.setSelection(i);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo334b() {
        this.f168b.setContentView(m215c());
        m218d();
    }

    /* renamed from: a */
    public void mo330a(View view) {
        this.f154G = view;
    }

    /* renamed from: b */
    public void mo337b(CharSequence charSequence) {
        this.f171e = charSequence;
        TextView textView = this.f152E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo332a(CharSequence charSequence) {
        this.f172f = charSequence;
        TextView textView = this.f153F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: c */
    private int m215c() {
        int i = this.f158K;
        if (i == 0) {
            return this.f157J;
        }
        if (this.f164Q == 1) {
            return i;
        }
        return this.f157J;
    }

    /* renamed from: b */
    public void mo336b(View view) {
        this.f174h = view;
        this.f175i = 0;
        this.f180n = false;
    }

    /* renamed from: a */
    public void mo331a(View view, int i, int i2, int i3, int i4) {
        this.f174h = view;
        this.f175i = 0;
        this.f180n = true;
        this.f176j = i;
        this.f177k = i2;
        this.f178l = i3;
        this.f179m = i4;
    }

    /* renamed from: b */
    public void mo335b(int i) {
        this.f150C = null;
        this.f149B = i;
        ImageView imageView = this.f151D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f151D.setImageResource(this.f149B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public void mo339c(int i) {
        this.f174h = null;
        this.f175i = i;
        this.f180n = false;
    }

    /* renamed from: c */
    private void m216c(ViewGroup viewGroup) {
        View view = this.f174h;
        boolean z = false;
        if (view == null) {
            view = this.f175i != 0 ? LayoutInflater.from(this.f167a).inflate(this.f175i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m217c(view)) {
            this.f169c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f169c.findViewById(C7526f.custom);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f180n) {
                frameLayout.setPadding(this.f176j, this.f177k, this.f178l, this.f179m);
            }
            if (this.f173g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f915a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    public void mo328a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f165R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f190x = charSequence;
            this.f191y = message;
            this.f192z = drawable;
        } else if (i == -2) {
            this.f186t = charSequence;
            this.f187u = message;
            this.f188v = drawable;
        } else if (i == -1) {
            this.f182p = charSequence;
            this.f183q = message;
            this.f184r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public boolean mo338b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f148A;
        return nestedScrollView != null && nestedScrollView.mo3455a(keyEvent);
    }

    /* renamed from: b */
    private void m214b(ViewGroup viewGroup) {
        this.f148A = (NestedScrollView) this.f169c.findViewById(C7526f.scrollView);
        this.f148A.setFocusable(false);
        this.f148A.setNestedScrollingEnabled(false);
        this.f153F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f153F;
        if (textView != null) {
            CharSequence charSequence = this.f172f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f148A.removeView(this.f153F);
                if (this.f173g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f148A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f148A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f173g, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo329a(Drawable drawable) {
        this.f150C = drawable;
        this.f149B = 0;
        ImageView imageView = this.f151D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f151D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public int mo326a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f167a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView mo327a() {
        return this.f173g;
    }

    /* renamed from: a */
    public boolean mo333a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f148A;
        return nestedScrollView != null && nestedScrollView.mo3455a(keyEvent);
    }

    /* renamed from: a */
    private ViewGroup m208a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    private void m219d(ViewGroup viewGroup) {
        if (this.f154G != null) {
            viewGroup.addView(this.f154G, 0, new LayoutParams(-1, -2));
            this.f169c.findViewById(C7526f.title_template).setVisibility(8);
            return;
        }
        this.f151D = (ImageView) this.f169c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f171e)) || !this.f163P) {
            this.f169c.findViewById(C7526f.title_template).setVisibility(8);
            this.f151D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f152E = (TextView) this.f169c.findViewById(C7526f.alertTitle);
        this.f152E.setText(this.f171e);
        int i = this.f149B;
        if (i != 0) {
            this.f151D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f150C;
        if (drawable != null) {
            this.f151D.setImageDrawable(drawable);
            return;
        }
        this.f152E.setPadding(this.f151D.getPaddingLeft(), this.f151D.getPaddingTop(), this.f151D.getPaddingRight(), this.f151D.getPaddingBottom());
        this.f151D.setVisibility(8);
    }

    /* renamed from: a */
    private void m211a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f169c.findViewById(C7526f.scrollIndicatorUp);
        View findViewById2 = this.f169c.findViewById(C7526f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            ViewCompat.m2817a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f172f != null) {
                this.f148A.setOnScrollChangeListener(new C0095b(this, findViewById, view2));
                this.f148A.post(new C0096c(findViewById, view2));
                return;
            }
            ListView listView = this.f173g;
            if (listView != null) {
                listView.setOnScrollListener(new C0097d(this, findViewById, view2));
                this.f173g.post(new C0098e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    static void m209a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m210a(ViewGroup viewGroup) {
        boolean z;
        this.f181o = (Button) viewGroup.findViewById(16908313);
        this.f181o.setOnClickListener(this.f166S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f182p) || this.f184r != null) {
            this.f181o.setText(this.f182p);
            Drawable drawable = this.f184r;
            if (drawable != null) {
                int i = this.f170d;
                drawable.setBounds(0, 0, i, i);
                this.f181o.setCompoundDrawables(this.f184r, null, null, null);
            }
            this.f181o.setVisibility(0);
            z = true;
        } else {
            this.f181o.setVisibility(8);
            z = false;
        }
        this.f185s = (Button) viewGroup.findViewById(16908314);
        this.f185s.setOnClickListener(this.f166S);
        if (!TextUtils.isEmpty(this.f186t) || this.f188v != null) {
            this.f185s.setText(this.f186t);
            Drawable drawable2 = this.f188v;
            if (drawable2 != null) {
                int i2 = this.f170d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f185s.setCompoundDrawables(this.f188v, null, null, null);
            }
            this.f185s.setVisibility(0);
            z |= true;
        } else {
            this.f185s.setVisibility(8);
        }
        this.f189w = (Button) viewGroup.findViewById(16908315);
        this.f189w.setOnClickListener(this.f166S);
        if (!TextUtils.isEmpty(this.f190x) || this.f192z != null) {
            this.f189w.setText(this.f190x);
            Drawable drawable3 = this.f184r;
            if (drawable3 != null) {
                int i3 = this.f170d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f181o.setCompoundDrawables(this.f184r, null, null, null);
            }
            this.f189w.setVisibility(0);
            z |= true;
        } else {
            this.f189w.setVisibility(8);
        }
        if (m213a(this.f167a)) {
            if (z) {
                m212a(this.f181o);
            } else if (z) {
                m212a(this.f185s);
            } else if (z) {
                m212a(this.f189w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m212a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
