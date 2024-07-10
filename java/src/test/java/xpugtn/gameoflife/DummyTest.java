package xpugtn.gameoflife;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DummyTest {

  private boolean isOk = false;

  @BeforeEach
  void setUp() {
    isOk = true;
  }

  @AfterEach
  void tearDown() {
    isOk = false;
  }

  @Test
  void environmentOk() {
    assertThat(isOk).isTrue();

  }
}