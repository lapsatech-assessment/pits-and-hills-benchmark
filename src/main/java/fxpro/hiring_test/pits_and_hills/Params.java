package fxpro.hiring_test.pits_and_hills;

import java.util.Random;

public class Params {

  private final static Random r = new Random();
  public final static int[] GIANT_LANDSCAPE = r.ints(32_000L, 0, 32_000).toArray();
  public final static int[] MEDIUM_LANDSCAPE = r.ints(1000L, 0, 1000).toArray();
  public final static int[] SMALL_LANDSCAPE = r.ints(50L, 0, 50).toArray();

}
