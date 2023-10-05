package arrays_hashing;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

 class GroupAnagramTest {

    @Test
     void test1() {
        GroupAnagram validator = new GroupAnagram();
        String[] words = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> e1 = Arrays.asList("bat");
        List<String> e2 = Arrays.asList("tan", "nat");
        List<String> e3 = Arrays.asList("ate", "eat", "tea");
        List<List<String>> expected = Arrays.asList(e1, e2, e3);
        List<List<String>> actual = validator.groupAnagrams(words);
        assertEquals(expected.size(), actual.size());
        assertEquals(expected.containsAll(actual), actual.containsAll(expected));
        for (List<String> a : actual) {
            switch (a.size()) {
                case 1:
                    assertTrue(CollectionUtils.isEqualCollection(e1, a));
                    break;
                case 2:
                    assertTrue(CollectionUtils.isEqualCollection(e2, a));
                    break;
                case 3:
                    assertTrue(CollectionUtils.isEqualCollection(e3, a));
                    break;
                default:
                    //Should not have come into this branch ever.
                    assertTrue(false);
            }
        }
    }
}
