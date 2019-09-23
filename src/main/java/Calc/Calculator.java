package Calc;

/**
 * Обычный калькулятор
 * @author Симонова Юлия
 * @version 0.1
 */
public class Calculator {
    /** Конструктор класса*/
    public Calculator() {}

    /**
     * Метод, выполняющий операцию над двумя числами
     * @param arg1 - операнд 1
     * @param arg2 - операнд 2
     * @param operation - тип операции
     * @return int
     */
    public int calculate(int arg1, int arg2, int operation) throws Exception{
        return this.calc(arg1, arg2, operation);
    }
    /**
     * Внутренняя функция для подсчета
     * @param arg1 - операнд 1
     * @param arg2 - операнд 2
     * @param operation - тип операции
     * @return int
     */
    private int calc(int arg1, int arg2, int operation) throws Exception {
        switch (operation) {
            case 1:
                return arg1 + arg2;
            case 2:
                return arg1 - arg2;
            case 3:
                return arg1 * arg2;
            case 4:
                return arg1 / arg2;
            default:
                throw new Exception();
        }
    }
}