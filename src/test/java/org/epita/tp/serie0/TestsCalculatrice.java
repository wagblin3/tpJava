package org.epita.tp.serie0;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestsCalculatrice {
    @Test
    public void test_should_return_valid_integer_when_use_valid_integer_for_multiply_method(){
        Calculatrice c = new Calculatrice();
        Integer res = c.multiply(2,4);
        Assertions.assertThat(res).isEqualTo(8);
    }
    @Test
    public void test_should_return_valid_integer_for_division(){
        Calculatrice calculatrice = new Calculatrice();
        Integer result = calculatrice.divide(4, 2);
        Assertions.assertThat(result).isEqualTo(2);
    }
    @Test
    public void test_should_throw_illegalarithmeticexception_when_divide_per_zero(){
        Calculatrice calculatrice = new Calculatrice();
        org.junit.jupiter.api.Assertions.assertThrows(ArithmeticException.class, () -> {
            Integer result = calculatrice.divide(4, 0);
        });
    }
}