package DZ1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Main {
    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        assertThat(calculator.calculatingDiscount(1000, 50)).isEqualTo(500);

        assertThatThrownBy(() -> {
            calculator.calculatingDiscount(-5600, 50);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessage("Ошибка: сумма покупки не может быть меньше, либо равно нулю!");

        assertThatThrownBy(() -> {
            calculator.calculatingDiscount(0, 50);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessage("Ошибка: сумма покупки не может быть меньше, либо равно нулю!");

        assertThatThrownBy(() -> {
            calculator.calculatingDiscount(50, 150);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessage("Ошибка: скидка не может быть более 100 процентов");

        assertThatThrownBy(() -> {
            calculator.calculatingDiscount(50, -10);
        }).isInstanceOf(ArithmeticException.class)
                .hasMessage("Ошибка: скидка не может быть отрицательной!");

        System.out.println(calculator.calculatingDiscount(1000, 10));

    }
}
