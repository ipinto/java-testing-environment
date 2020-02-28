package com.ipinto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

  @Test
  void test_that_the_basic_config_works() {
    Assertions.assertThat(Example.plusTwo(3)).isEqualTo(5);
  }

}
