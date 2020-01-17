package zendesk.support;

import com.google.gson.C11125d;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12012b;
import java.io.IOException;
import java.lang.reflect.Type;
import okio.C13354l;
import p333g.p369e.p370a.C12095a;
import p333g.p369e.p370a.C12095a.C12098c;
import p333g.p369e.p370a.C12095a.C12101e;
import zendesk.support.Streams.Use;

public class SupportUiStorage {
    /* access modifiers changed from: private */
    public final C11125d gson;
    private final C12095a storage;

    public SupportUiStorage(C12095a aVar, C11125d dVar) {
        this.storage = aVar;
        this.gson = dVar;
    }

    private static void abortEdit(C12098c cVar) {
        String str = "SupportUiStorage";
        Logger.m31614d(str, "Unable to cache data", new Object[0]);
        if (cVar != null) {
            try {
                cVar.mo35821a();
            } catch (IOException e) {
                Logger.m31612c(str, "Unable to abort write", e, new Object[0]);
            }
        }
    }

    private static String key(String str) {
        return C12012b.m31642a(str);
    }

    public <E> E read(String str, final Type type) {
        E use;
        try {
            synchronized (this.storage) {
                use = Streams.use(this.storage.mo35814b(key(str)), new Use<E, C12101e>() {
                    public E use(C12101e eVar) throws Exception {
                        return SupportUiStorage.this.gson.mo32456a(Streams.toReader(C13354l.m35381a(eVar.mo35830a(0))), type);
                    }
                });
            }
            return use;
        } catch (IOException unused) {
            Logger.m31614d("SupportUiStorage", "Unable to read from cache", new Object[0]);
            return null;
        }
    }

    public void write(String str, Object obj) {
        C12098c cVar = null;
        try {
            synchronized (this.storage) {
                cVar = this.storage.mo35812a(key(str));
            }
            if (cVar != null) {
                Streams.toJson(this.gson, C13354l.m35378a(cVar.mo35820a(0)), obj);
                cVar.mo35822b();
            }
        } catch (IOException unused) {
            abortEdit(cVar);
        }
    }
}
