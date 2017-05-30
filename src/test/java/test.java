import org.junit.Test;
import static org.junit.Assert.*;

import exercise3.TriCater;

public class test {
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
    assertEquals(TriCater.tri(1), 1);
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
    assertEquals(TriCater.lazy(1), 2);
  }
}
