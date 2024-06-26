public class ChildrensBook extends Book {

    private String recommendedAgeInfo;

    public ChildrensBook(long productId, int price, String title, String author, String recommendedAgeInfo) {
        super(productId, price, title, author);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nrecommendedAgeInfo: " + recommendedAgeInfo;
    }
}
