package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public interface Dns {

    /* renamed from: a */
    public static final Dns f33788a = C13173c.f33827b;

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
