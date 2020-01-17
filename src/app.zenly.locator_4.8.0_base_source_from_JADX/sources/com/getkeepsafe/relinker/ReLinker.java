package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

public class ReLinker {

    public interface LibraryInstaller {
        void installLibrary(Context context, String[] strArr, String str, File file, C9936b bVar);
    }

    public interface LibraryLoader {
        void loadLibrary(String str);

        void loadPath(String str);

        String mapLibraryName(String str);

        String[] supportedAbis();

        String unmapLibraryName(String str);
    }

    public interface LoadListener {
        void failure(Throwable th);

        void success();
    }

    public interface Logger {
        void log(String str);
    }

    /* renamed from: a */
    public static C9936b m24849a(Logger logger) {
        C9936b bVar = new C9936b();
        bVar.mo26798a(logger);
        return bVar;
    }
}
