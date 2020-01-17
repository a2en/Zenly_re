package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import androidx.cursoradapter.widget.C0687c;
import com.appsflyer.share.Constants;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p214e.p215a.C7521a;
import p214e.p215a.C7526f;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.u */
class C0285u extends C0687c implements OnClickListener {

    /* renamed from: A */
    private int f1278A = -1;

    /* renamed from: B */
    private int f1279B = -1;

    /* renamed from: C */
    private int f1280C = -1;

    /* renamed from: p */
    private final SearchView f1281p;

    /* renamed from: q */
    private final SearchableInfo f1282q;

    /* renamed from: r */
    private final Context f1283r;

    /* renamed from: s */
    private final WeakHashMap<String, ConstantState> f1284s;

    /* renamed from: t */
    private final int f1285t;

    /* renamed from: u */
    private boolean f1286u = false;

    /* renamed from: v */
    private int f1287v = 1;

    /* renamed from: w */
    private ColorStateList f1288w;

    /* renamed from: x */
    private int f1289x = -1;

    /* renamed from: y */
    private int f1290y = -1;

    /* renamed from: z */
    private int f1291z = -1;

    /* renamed from: androidx.appcompat.widget.u$a */
    private static final class C0286a {

        /* renamed from: a */
        public final TextView f1292a;

        /* renamed from: b */
        public final TextView f1293b;

        /* renamed from: c */
        public final ImageView f1294c;

        /* renamed from: d */
        public final ImageView f1295d;

        /* renamed from: e */
        public final ImageView f1296e;

        public C0286a(View view) {
            this.f1292a = (TextView) view.findViewById(16908308);
            this.f1293b = (TextView) view.findViewById(16908309);
            this.f1294c = (ImageView) view.findViewById(16908295);
            this.f1295d = (ImageView) view.findViewById(16908296);
            this.f1296e = (ImageView) view.findViewById(C7526f.edit_query);
        }
    }

    public C0285u(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.f2920h.getSystemService("search");
        this.f1281p = searchView;
        this.f1282q = searchableInfo;
        this.f1285t = searchView.getSuggestionCommitIconResId();
        this.f1283r = context;
        this.f1284s = weakHashMap;
    }

    /* renamed from: c */
    private Drawable m1175c(Cursor cursor) {
        Drawable b = m1171b(this.f1282q.getSearchActivity());
        if (b != null) {
            return b;
        }
        return this.f2920h.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: d */
    private Drawable m1176d(Cursor cursor) {
        int i = this.f1278A;
        if (i == -1) {
            return null;
        }
        Drawable b = m1173b(cursor.getString(i));
        if (b != null) {
            return b;
        }
        return m1175c(cursor);
    }

    /* renamed from: e */
    private Drawable m1177e(Cursor cursor) {
        int i = this.f1279B;
        if (i == -1) {
            return null;
        }
        return m1173b(cursor.getString(i));
    }

    /* renamed from: f */
    private void m1178f(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    public void mo2082a(int i) {
        this.f1287v = i;
    }

    /* renamed from: b */
    public View mo2085b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.mo2085b(context, cursor, viewGroup);
        b.setTag(new C0286a(b));
        ((ImageView) b.findViewById(C7526f.edit_query)).setImageResource(this.f1285t);
        return b;
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m1167a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f1282q.shouldRewriteQueryFromData()) {
            String a2 = m1167a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f1282q.shouldRewriteQueryFromText()) {
            String a3 = m1167a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo3532a(this.f2920h, this.f2919g, viewGroup);
            if (a != null) {
                ((C0286a) a.getTag()).f1292a.setText(e.toString());
            }
            return a;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2085b(this.f2920h, this.f2919g, viewGroup);
            if (b != null) {
                ((C0286a) b.getTag()).f1292a.setText(e.toString());
            }
            return b;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1178f(getCursor());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1178f(getCursor());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1281p.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: a */
    public Cursor mo2080a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1281p.getVisibility() == 0 && this.f1281p.getWindowVisibility() == 0) {
            try {
                Cursor a = mo2079a(this.f1282q, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private CharSequence m1174b(CharSequence charSequence) {
        if (this.f1288w == null) {
            TypedValue typedValue = new TypedValue();
            this.f2920h.getTheme().resolveAttribute(C7521a.textColorSearchUrl, typedValue, true);
            this.f1288w = this.f2920h.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f1288w, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    public void mo2083a(Cursor cursor) {
        String str = "SuggestionsAdapter";
        if (this.f1286u) {
            Log.w(str, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo2083a(cursor);
            if (cursor != null) {
                this.f1289x = cursor.getColumnIndex("suggest_text_1");
                this.f1290y = cursor.getColumnIndex("suggest_text_2");
                this.f1291z = cursor.getColumnIndex("suggest_text_2_url");
                this.f1278A = cursor.getColumnIndex("suggest_icon_1");
                this.f1279B = cursor.getColumnIndex("suggest_icon_2");
                this.f1280C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(str, "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: b */
    private Drawable m1173b(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                sb.append(this.f1283r.getPackageName());
                sb.append(Constants.URL_PATH_DELIMITER);
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable a = m1165a(sb2);
                if (a != null) {
                    return a;
                }
                Drawable c = C0540a.m2546c(this.f1283r, parseInt);
                m1170a(sb2, c);
                return c;
            } catch (NumberFormatException unused) {
                Drawable a2 = m1165a(str);
                if (a2 != null) {
                    return a2;
                }
                drawable = m1172b(Uri.parse(str));
                m1170a(str, drawable);
            } catch (NotFoundException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Icon resource not found: ");
                sb3.append(str);
                Log.w("SuggestionsAdapter", sb3.toString());
                return null;
            }
        }
        return drawable;
    }

    /* renamed from: a */
    public void mo2084a(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0286a aVar = (C0286a) view.getTag();
        int i = this.f1280C;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1292a != null) {
            m1169a(aVar.f1292a, (CharSequence) m1166a(cursor, this.f1289x));
        }
        if (aVar.f1293b != null) {
            String a = m1166a(cursor, this.f1291z);
            if (a != null) {
                charSequence = m1174b((CharSequence) a);
            } else {
                charSequence = m1166a(cursor, this.f1290y);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1292a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1292a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1292a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1292a.setMaxLines(1);
                }
            }
            m1169a(aVar.f1293b, charSequence);
        }
        ImageView imageView = aVar.f1294c;
        if (imageView != null) {
            m1168a(imageView, m1176d(cursor), 4);
        }
        ImageView imageView2 = aVar.f1295d;
        if (imageView2 != null) {
            m1168a(imageView2, m1177e(cursor), 8);
        }
        int i3 = this.f1287v;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1296e.setVisibility(0);
            aVar.f1296e.setTag(aVar.f1292a.getText());
            aVar.f1296e.setOnClickListener(this);
            return;
        }
        aVar.f1296e.setVisibility(8);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Resource does not exist: ");
        r3.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException(r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1172b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo2081a(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1283r     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0285u.m1172b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.graphics.drawable.Drawable, android.graphics.drawable.Drawable$ConstantState]
      uses: [java.lang.Object, android.graphics.drawable.Drawable]
      mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1171b(android.content.ComponentName r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f1284s
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f1284s
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f1283r
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m1164a(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f1284s
            r1.put(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0285u.m1171b(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private void m1169a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m1168a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private Drawable m1165a(String str) {
        ConstantState constantState = (ConstantState) this.f1284s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m1170a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1284s.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: a */
    private Drawable m1164a(ComponentName componentName) {
        String str = "SuggestionsAdapter";
        PackageManager packageManager = this.f2920h.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            Log.w(str, sb.toString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w(str, e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m1167a(Cursor cursor, String str) {
        return m1166a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m1166a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo2081a(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2920h.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo2079a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder authority = new Builder().scheme("content").authority(suggestAuthority);
        String str2 = "";
        Builder fragment = authority.query(str2).fragment(str2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2920h.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }
}
