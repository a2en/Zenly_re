package p213co.znly.core.scheduling;

import android.content.Context;
import com.evernote.android.job.C9447g;
import com.evernote.android.job.JobCreator;
import com.evernote.android.job.JobCreator.AddJobCreatorReceiver;

/* renamed from: co.znly.core.scheduling.AddReceiver */
public final class AddReceiver extends AddJobCreatorReceiver {
    /* access modifiers changed from: protected */
    public void addJobCreator(Context context, C9447g gVar) {
        gVar.mo25311a((JobCreator) new CustomJobCreator());
    }
}
