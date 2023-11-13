package DZ1;

public class Calculator {

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public double calculatingDiscount(double purchaseAmount, int discountAmount) throws Exception{
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки

        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Ошибка: сумма покупки не может быть меньше, либо равно нулю!");

        } else if (discountAmount < 0) {
            throw new ArithmeticException("Ошибка: скидка не может быть отрицательной!");

        } else if (discountAmount > 100) {
            throw new ArithmeticException("Ошибка: скидка не может быть более 100 процентов");

        } else return purchaseAmount - (purchaseAmount*discountAmount/100); // Метод должен возвращать сумму покупки со скидкой
    }
}