package fxpro.hiring_test.pits_and_hills;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Threads;

@Fork(value = 1, warmups = 1)
@Threads(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class LandscapeWaterCalculatorImplHashMapBenchmark {

  private final static LandscapeWaterCalculator calculator = new LandscapeWaterCalculatorImplHashMap();

  @Benchmark
  public void calculateWaterAmount_giant() {
    calculator.calculateWaterAmount(Params.GIANT_LANDSCAPE);
  }

  @Benchmark
  public void calculateWaterAmount_medium() {
    calculator.calculateWaterAmount(Params.MEDIUM_LANDSCAPE);
  }

  @Benchmark
  public void calculateWaterAmount_small() {
    calculator.calculateWaterAmount(Params.SMALL_LANDSCAPE);
  }
}
