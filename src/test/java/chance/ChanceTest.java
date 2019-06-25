package chance;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChanceTest {
    @Test
    public void should_chance_not_right() {
        //given
        Chance chance = new Chance(0.5d);
        //when

        //then
        assertThat(chance.not()).isEqualToComparingFieldByField(new Chance(0.5d));
    }

}
