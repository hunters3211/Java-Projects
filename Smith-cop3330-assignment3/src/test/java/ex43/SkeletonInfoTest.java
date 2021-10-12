package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkeletonInfoTest {

    @Test
    void wantsFolders_both_yes() {
        SkeletonInfo si = new SkeletonInfo();
        String act = si.wantsFolders("y","y");
        String exp = "ab";
        assertEquals(act,exp);
    }

    @Test
    void wantsFolders_both_no() {
        SkeletonInfo si = new SkeletonInfo();
        String act = si.wantsFolders("n","n");
        String exp = "";
        assertEquals(act,exp);
    }

    @Test
    void wantsFolders_css_yes() {
        SkeletonInfo si = new SkeletonInfo();
        String act = si.wantsFolders("n","y");
        String exp = "b";
        assertEquals(act,exp);
    }
}