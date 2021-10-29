package chapterSixteen;

import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void testForCollections()
    {
        List<Character> character = Arrays.asList('H','E','L','L','O','W','O','R','L','D');
        Collections.reverse(character);
        Collections.shuffle(character);
        System.out.println(character);

        Set<Dogs> setOfDogs = new HashSet<>();
//        setOfDogs.add("Aja", 23);

    }
}
