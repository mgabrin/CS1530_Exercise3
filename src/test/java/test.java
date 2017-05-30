import org.junit.Test;
import static org.junit.Assert.*;

import exercise3.TriCater;


public class test {
  @Rule
  public final ExpectedSystemExit exit = ExpectedSystemExit.none();

  @Test
  public void triangleTest1() {
    assertEquals(TriCater.tri(5), 15);
  }

  @Test
  public void triangleTest2() {
    assertEquals(TriCater.tri(0), 0);
  }
  @Test
  public void triangleTest3() {
    exit.expectSystemExit(2);
    TriCater.tri(-5);
  }

  @Test
  public void lazyTest1() {
    assertEquals(TriCater.lazy(5), 16);
  }
  @Test
  public void lazyTest2() {
    assertEquals(TriCater.lazy(0), 1);
  }
  @Test
  public void lazyTest3() {
    exit.expectSystemExit(2);
    TriCater.lazy(-5);
  }
}
