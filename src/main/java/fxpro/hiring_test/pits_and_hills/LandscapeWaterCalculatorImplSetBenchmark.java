package fxpro.hiring_test.pits_and_hills;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Threads;

@Fork(value = 5, warmups = 1)
@Threads(5)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class LandscapeWaterCalculatorImplSetBenchmark {

  private final static LandscapeWaterCalculator calculator = new LandscapeWaterCalculatorImplSet();

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
