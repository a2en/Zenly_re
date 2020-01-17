package p213co.znly.core.scheduling;

import com.evernote.android.job.C9435b;
import com.evernote.android.job.JobCreator;

/* renamed from: co.znly.core.scheduling.CustomJobCreator */
public class CustomJobCreator implements JobCreator {
    public C9435b create(String str) {
        if (((str.hashCode() == -77867262 && str.equals(SyncJob.TAG)) ? (char) 0 : 65535) != 0) {
            return null;
        }
        return new SyncJob();
    }
}
