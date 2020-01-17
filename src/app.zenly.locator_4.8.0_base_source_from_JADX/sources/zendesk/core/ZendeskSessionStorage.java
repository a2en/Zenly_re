package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12010a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.C13204g;

class ZendeskSessionStorage implements SessionStorage {
    private final BaseStorage additionalSdkStorage;
    private final IdentityStorage identityStorage;
    private final BaseStorage mediaCache;
    private final List<File> registeredFolders;
    private final C13204g responseCache;
    private final File zendeskCacheDir;
    private final File zendeskDataDir;

    ZendeskSessionStorage(IdentityStorage identityStorage2, BaseStorage baseStorage, C13204g gVar, BaseStorage baseStorage2, File file, File file2, File file3) {
        this.identityStorage = identityStorage2;
        this.additionalSdkStorage = baseStorage;
        this.responseCache = gVar;
        this.zendeskCacheDir = file;
        this.zendeskDataDir = file2;
        this.mediaCache = baseStorage2;
        this.registeredFolders = new ArrayList(Arrays.asList(new File[]{this.zendeskCacheDir, this.zendeskDataDir, file3}));
    }

    private static void clearDirectory(File file) {
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && file.isDirectory() && C12010a.m31640b((Type[]) listFiles)) {
                for (File clearDirectory : listFiles) {
                    clearDirectory(clearDirectory);
                }
            }
            file.delete();
        }
    }

    private File createDirIfNotExists(File file) {
        if (file.exists()) {
            Logger.m31608a("SessionStorage", "Created dir %s, success: %s", file.getAbsolutePath(), Boolean.valueOf(file.mkdirs()));
        }
        return file;
    }

    public void clear() {
        this.identityStorage.clear();
        this.additionalSdkStorage.clear();
        this.mediaCache.clear();
        try {
            this.responseCache.mo37924a();
        } catch (IOException unused) {
        }
        for (File clearDirectory : this.registeredFolders) {
            clearDirectory(clearDirectory);
        }
    }

    public BaseStorage getAdditionalSdkStorage() {
        return this.additionalSdkStorage;
    }

    public File getZendeskCacheDir() {
        File file = this.zendeskCacheDir;
        createDirIfNotExists(file);
        return file;
    }

    public File getZendeskDataDir() {
        File file = this.zendeskDataDir;
        createDirIfNotExists(file);
        return file;
    }
}
