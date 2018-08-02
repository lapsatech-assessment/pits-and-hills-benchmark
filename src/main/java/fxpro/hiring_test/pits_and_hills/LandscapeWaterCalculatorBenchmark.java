package fxpro.hiring_test.pits_and_hills;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import fxpro.hiring_test.pits_and_hills.LandscapeWaterCalculator;

public class LandscapeWaterCalculatorBenchmark {

  private final static LandscapeWaterCalculator calculator = new LandscapeWaterCalculator();
  private final static Random r = new Random();

  private final static int[] GIANT_LANDSCAPE = r.ints(32_000L, 0, 32_000).toArray();

  @Benchmark
  @Fork(value = 1, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void calculateWaterAmount_giant() {
    calculator.calculateWaterAmount(GIANT_LANDSCAPE);
  }

  private final static int[] MEDIUM_LANDSCAPE = r.ints(1000L, 0, 1000).toArray();

  @Fork(value = 1, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void calculateWaterAmount_medium() {
    calculator.calculateWaterAmount(MEDIUM_LANDSCAPE);
  }

  private final static int[] SMALL_LANDSCAPE = r.ints(50L, 0, 50).toArray();

  @Benchmark
  @Fork(value = 1, warmups = 1)
  @BenchmarkMode(Mode.AverageTime)
  @OutputTimeUnit(TimeUnit.MICROSECONDS)
  public void calculateWaterAmount_small() {
    calculator.calculateWaterAmount(SMALL_LANDSCAPE);
  }
}
