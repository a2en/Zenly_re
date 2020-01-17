package p389io.fabric.sdk.android.services.events;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.CurrentTimeProvider;

/* renamed from: io.fabric.sdk.android.services.events.a */
public abstract class C12227a<T> {

    /* renamed from: a */
    protected final Context f31783a;

    /* renamed from: b */
    protected final EventTransform<T> f31784b;

    /* renamed from: c */
    protected final CurrentTimeProvider f31785c;

    /* renamed from: d */
    protected final EventsStorage f31786d;

    /* renamed from: e */
    private final int f31787e;

    /* renamed from: f */
    protected final List<EventsStorageListener> f31788f = new CopyOnWriteArrayList();

    /* renamed from: io.fabric.sdk.android.services.events.a$a */
    class C12228a implements Comparator<C12229b> {
        C12228a(C12227a aVar) {
        }

        /* renamed from: a */
        public int compare(C12229b bVar, C12229b bVar2) {
            return (int) (bVar.f31790b - bVar2.f31790b);
        }
    }

    /* renamed from: io.fabric.sdk.android.services.events.a$b */
    static class C12229b {

        /* renamed from: a */
        final File f31789a;

        /* renamed from: b */
        final long f31790b;

        public C12229b(File file, long j) {
            this.f31789a = file;
            this.f31790b = j;
        }
    }

    public C12227a(Context context, EventTransform<T> eventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage, int i) throws IOException {
        this.f31783a = context.getApplicationContext();
        this.f31784b = eventTransform;
        this.f31786d = eventsStorage;
        this.f31785c = currentTimeProvider;
        this.f31785c.getCurrentTimeMillis();
        this.f31787e = i;
    }

    /* renamed from: b */
    private void m32368b(String str) {
        for (EventsStorageListener onRollOver : this.f31788f) {
            try {
                onRollOver.onRollOver(str);
            } catch (Exception e) {
                C12180h.m32252a(this.f31783a, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo36175a(T t) throws IOException {
        byte[] bytes = this.f31784b.toBytes(t);
        m32367a(bytes.length);
        this.f31786d.add(bytes);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo25030c();

    /* renamed from: d */
    public List<File> mo36178d() {
        return this.f31786d.getBatchOfFilesToSend(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo25031e() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo25032f() {
        return this.f31787e;
    }

    /* renamed from: g */
    public boolean mo36179g() throws IOException {
        String str;
        boolean z = true;
        if (!this.f31786d.isWorkingFileEmpty()) {
            str = mo25030c();
            this.f31786d.rollOver(str);
            C12180h.m32251a(this.f31783a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f31785c.getCurrentTimeMillis();
        } else {
            str = null;
            z = false;
        }
        m32368b(str);
        return z;
    }

    /* renamed from: a */
    public void mo36174a(EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.f31788f.add(eventsStorageListener);
        }
    }

    /* renamed from: b */
    public void mo36177b() {
        List<File> allFilesInRollOverDirectory = this.f31786d.getAllFilesInRollOverDirectory();
        int f = mo25032f();
        if (allFilesInRollOverDirectory.size() > f) {
            int size = allFilesInRollOverDirectory.size() - f;
            C12180h.m32267c(this.f31783a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(allFilesInRollOverDirectory.size()), Integer.valueOf(f), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C12228a(this));
            for (File file : allFilesInRollOverDirectory) {
                treeSet.add(new C12229b(file, mo36172a(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12229b) it.next()).f31789a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f31786d.deleteFilesInRollOverDirectory(arrayList);
        }
    }

    /* renamed from: a */
    private void m32367a(int i) throws IOException {
        if (!this.f31786d.canWorkingFileStore(i, mo25031e())) {
            C12180h.m32251a(this.f31783a, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f31786d.getWorkingFileUsedSizeInBytes()), Integer.valueOf(i), Integer.valueOf(mo25031e())}));
            mo36179g();
        }
    }

    /* renamed from: a */
    public void mo36176a(List<File> list) {
        this.f31786d.deleteFilesInRollOverDirectory(list);
    }

    /* renamed from: a */
    public void mo36173a() {
        EventsStorage eventsStorage = this.f31786d;
        eventsStorage.deleteFilesInRollOverDirectory(eventsStorage.getAllFilesInRollOverDirectory());
        this.f31786d.deleteWorkingFile();
    }

    /* renamed from: a */
    public long mo36172a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
