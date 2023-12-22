import java.util.HashMap;
import java.util.Map;
public class MockSocialMediaAPI implements SocialMediaAPI {
    @Override
    public Map<String, Integer> getPostAnalytics(String postId) {
        Map<String, Integer> analytics = new HashMap<>();
        analytics.put("Likes", 150);
        analytics.put("Shares", 50);
        analytics.put("Comments", 30);
        return analytics;
    }
}