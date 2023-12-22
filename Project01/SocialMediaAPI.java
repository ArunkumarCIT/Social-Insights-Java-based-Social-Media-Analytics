import java.util.Map;

public interface SocialMediaAPI {
    Map<String, Integer> getPostAnalytics(String postId);
}