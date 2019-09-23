package Calc;

/**
 * Калькулятор с буффером
 * @author Роцинский Иван
 * @version 0.1
 */
public class Advanced_Calculator extends Calculator {

    /** Числовой буффер калькулятора*/
    private int buffer;
    /** Операционный буффер калькулятора*/
    private int operationBuffered;
    /** Конструктор*/
    public Advanced_Calculator() {super();}

    /**
     * Метод, выполняющий операцию над двумя числами
     * @param arg1 - операнд 1
     * @param arg2 - операнд 2
     * @param operation - тип операции
     */
    public int calculate(int arg1, int arg2, int operation, boolean flagBufferedNumber, boolean flagBufferedOperation) throws Exception{
        if (!flagBufferedNumber && !flagBufferedOperation) {
            return calc(arg1, arg2, operation);
        }
        if (flagBufferedNumber && !flagBufferedOperation) {
            return calc(buffer, arg2, operation);
        }
        if (!flagBufferedNumber && flagBufferedOperation) {
            return calc(arg1, arg2, operationBuffered);
        }
        if (flagBufferedNumber && flagBufferedOperation) {
            return calc(buffer, arg2, operationBuffered);
        }
        return Integer.MIN_VALUE; // Идея почему-то не понимает, что у двух флагов 4 перестановки
    }

    /**
     * Внутренняя функция для подсчета
     * @param arg1 - операнд 1
     * @param arg2 - операнд 2
     * @param operation - тип операции
     * @return int
     * @throws Exception (Пустой буффер - попытка его использовать)
     */
    private int calc(int arg1, int arg2, int operation) throws Exception {
        operationBuffered = operation;
        switch (operation) {
            case 1:
                buffer = arg1 + arg2;
                break;
            case 2:
                buffer = arg1 - arg2;
                break;
            case 3:
                buffer = arg1 * arg2;
                break;
            case 4:
                buffer = arg1 / arg2;
                break;
            default:
                throw new Exception();
        }
        return buffer;
    }
}
