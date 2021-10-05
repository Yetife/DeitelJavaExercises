package chapterTen;

public class VisaCard extends CreditCard{
    @Override
    public int validate(int something) {
        System.out.println("Visa can implement");
        return 0;
    }
}
