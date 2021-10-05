package chapterTen;

public class MasterCard extends CreditCard implements Movable {

    @Override
    public int validate(int something) {
        int jerry = 50;
        return jerry;
    }

    @Override
    public void move() {
        System.out.println();
    }
}
