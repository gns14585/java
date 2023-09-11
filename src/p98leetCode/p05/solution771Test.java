package p98leetCode.p05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution771Test {

    @Test
    void numJewelsInstones() {
        Solution771 o = new Solution771();
        int i = o.numJewelsInstones("aA", "aAAbbbb");
        assertEquals(3, i);

        int j = o.numJewelsInstones("z", "ZZ");
        assertEquals(0, j);
    }
}