import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long ammount = 1000;
        boolean registred = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate (ammount,registred);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registred = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registred);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long ammount = 1000;
        boolean registred = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(ammount, registred);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long ammount = 1_000_000;
        boolean registred = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(ammount, registred);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}


