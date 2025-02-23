
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class CoherenceApp {
    public static void main(String[] args) {
        // Ensure Coherence starts up
        CacheFactory.ensureCluster();

        // Access the cache
        NamedCache<String, String> cache = CacheFactory.getCache("example-cache");

        // Put and get a value
        cache.put("greeting", "Hello, Coherence!");
        String value = cache.get("greeting");

        // Display the value
        System.out.println(value);

        // Shutdown Coherence
        CacheFactory.shutdown();
    }
}
