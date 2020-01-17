package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: androidx.cursoradapter.widget.a */
public abstract class C0682a extends BaseAdapter implements Filterable, C0686a {

    /* renamed from: e */
    protected boolean f2917e;

    /* renamed from: f */
    protected boolean f2918f;

    /* renamed from: g */
    protected Cursor f2919g;

    /* renamed from: h */
    protected Context f2920h;

    /* renamed from: i */
    protected int f2921i;

    /* renamed from: j */
    protected C0683a f2922j;

    /* renamed from: k */
    protected DataSetObserver f2923k;

    /* renamed from: l */
    protected C0685b f2924l;

    /* renamed from: androidx.cursoradapter.widget.a$a */
    private class C0683a extends ContentObserver {
        C0683a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0682a.this.mo3533a();
        }
    }

    /* renamed from: androidx.cursoradapter.widget.a$b */
    private class C0684b extends DataSetObserver {
        C0684b() {
        }

        public void onChanged() {
            C0682a aVar = C0682a.this;
            aVar.f2917e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0682a aVar = C0682a.this;
            aVar.f2917e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C0682a(Context context, Cursor cursor, boolean z) {
        mo3534a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public abstract View mo3532a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3534a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2918f = true;
        } else {
            this.f2918f = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2919g = cursor;
        this.f2917e = z;
        this.f2920h = context;
        this.f2921i = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2922j = new C0683a();
            this.f2923k = new C0684b();
        } else {
            this.f2922j = null;
            this.f2923k = null;
        }
        if (z) {
            C0683a aVar = this.f2922j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2923k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2084a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor mo3535b(Cursor cursor) {
        Cursor cursor2 = this.f2919g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0683a aVar = this.f2922j;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2923k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2919g = cursor;
        if (cursor != null) {
            C0683a aVar2 = this.f2922j;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2923k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2921i = cursor.getColumnIndexOrThrow("_id");
            this.f2917e = true;
            notifyDataSetChanged();
        } else {
            this.f2921i = -1;
            this.f2917e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public abstract View mo2085b(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract CharSequence convertToString(Cursor cursor);

    public int getCount() {
        if (this.f2917e) {
            Cursor cursor = this.f2919g;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public Cursor getCursor() {
        return this.f2919g;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2917e) {
            return null;
        }
        this.f2919g.moveToPosition(i);
        if (view == null) {
            view = mo3532a(this.f2920h, this.f2919g, viewGroup);
        }
        mo2084a(view, this.f2920h, this.f2919g);
        return view;
    }

    public Filter getFilter() {
        if (this.f2924l == null) {
            this.f2924l = new C0685b(this);
        }
        return this.f2924l;
    }

    public Object getItem(int i) {
        if (this.f2917e) {
            Cursor cursor = this.f2919g;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f2919g;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f2917e) {
            Cursor cursor = this.f2919g;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f2919g.getLong(this.f2921i);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2917e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2919g.moveToPosition(i)) {
            if (view == null) {
                view = mo2085b(this.f2920h, this.f2919g, viewGroup);
            }
            mo2084a(view, this.f2920h, this.f2919g);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo2083a(Cursor cursor) {
        Cursor b = mo3535b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3533a() {
        if (this.f2918f) {
            Cursor cursor = this.f2919g;
            if (cursor != null && !cursor.isClosed()) {
                this.f2917e = this.f2919g.requery();
            }
        }
    }
}
