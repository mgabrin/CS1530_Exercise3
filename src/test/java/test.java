import org.junit.Test;
import static org.junit.Assert.*;

import lazy;
import tri;

public class Exercise3Tests {
  @Test
  public void triangleTest1() {
    assertEquals(tri(5), 15);
  }

  @Test
  public void triangleTest2() {
    assertEquals(tri(0), 0);
  }
  @Test
  public void triangleTest3() {
    try{
        tri(-5);
        fail("Should have thrown an exception");
    } catch(Exception e) {
      assertThat(e.getCode(), is(2));
    }
  }
  @Test
  public void lazyTest1() {
    assertEquals(lazy(5), 16);
  }
  @Test
  public void lazyTest2() {
    assertEquals(lazy(0), 1);
  }
  @Test
  public void lazyTest3() {
    try {
      lazy(-5)
    } catch(Exception e) {
      assertThat(e.getCode(0), is(2));
    }

  }
}
