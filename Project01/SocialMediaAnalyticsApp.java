public class SocialMediaAnalyticsApp {
    public static void main(String[] args) {
        String postId = "123456789";
        SocialMediaAPI socialMediaAPI = new MockSocialMediaAPI();
        displayPostAnalytics(postId, socialMediaAPI);
    }

    private static void displayPostAnalytics(String postId, SocialMediaAPI socialMediaAPI) {
        System.out.println("Analytics for Post ID: " + postId);
        System.out.println("----------------------------");
        Map<String, Integer> analytics = socialMediaAPI.getPostAnalytics(postId);

        for (Map.Entry<String, Integer> entry : analytics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}