import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsSolutionTest {

    @Test
    public void jumpingOnTheClouds_Jumps3Steps() {
        int[] c = new int[]{0, 1, 0, 0, 0, 1, 0};
        Assert.assertEquals(3, JumpingOnTheClouds_Solution.jumpingOnClouds(c));
    }

    @Test
    public void jumpingOnTheClouds_Jumps4Steps() {
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};
        Assert.assertEquals(4, JumpingOnTheClouds_Solution.jumpingOnClouds(c));
    }

}
