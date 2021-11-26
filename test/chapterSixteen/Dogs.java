package chapterSixteen;

public class Dogs implements Comparable {
    private String name;
    private int age;

    public Dogs(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
