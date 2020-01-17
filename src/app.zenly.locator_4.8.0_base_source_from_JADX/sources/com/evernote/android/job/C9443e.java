package com.evernote.android.job;

import com.evernote.android.job.util.C9469c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.evernote.android.job.e */
class C9443e {

    /* renamed from: b */
    private static final C9469c f24446b = new C9469c("JobCreatorHolder");

    /* renamed from: a */
    private final List<JobCreator> f24447a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo25294a(JobCreator jobCreator) {
        this.f24447a.add(jobCreator);
    }

    /* renamed from: a */
    public C9435b mo25293a(String str) {
        C9435b bVar = null;
        boolean z = false;
        for (JobCreator create : this.f24447a) {
            z = true;
            bVar = create.create(str);
            if (bVar != null) {
                break;
            }
        }
        if (!z) {
            f24446b.mo25417d("no JobCreator added");
        }
        return bVar;
    }

    /* renamed from: a */
    public boolean mo25295a() {
        return this.f24447a.isEmpty();
    }
}
