package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DiskStorage {

    public interface Entry {
        String getId();

        BinaryResource getResource();

        long getSize();

        long getTimestamp();
    }

    public interface Inserter {
        boolean cleanUp();

        BinaryResource commit(Object obj) throws IOException;

        void writeData(WriterCallback writerCallback, Object obj) throws IOException;
    }

    /* renamed from: com.facebook.cache.disk.DiskStorage$a */
    public static class C9488a {

        /* renamed from: a */
        public List<C9489b> f24597a = new ArrayList();

        /* renamed from: b */
        public Map<String, Integer> f24598b = new HashMap();
    }

    /* renamed from: com.facebook.cache.disk.DiskStorage$b */
    public static class C9489b {

        /* renamed from: a */
        public final String f24599a;

        protected C9489b(String str, String str2, float f, String str3) {
            this.f24599a = str2;
        }
    }

    void clearAll() throws IOException;

    boolean contains(String str, Object obj) throws IOException;

    C9488a getDumpInfo() throws IOException;

    Collection<Entry> getEntries() throws IOException;

    BinaryResource getResource(String str, Object obj) throws IOException;

    String getStorageName();

    Inserter insert(String str, Object obj) throws IOException;

    boolean isEnabled();

    boolean isExternal();

    void purgeUnexpectedResources();

    long remove(Entry entry) throws IOException;

    long remove(String str) throws IOException;

    boolean touch(String str, Object obj) throws IOException;
}
