package Calc;

/**
 * Класс для определения операции над числом
 * @author Роцинский Иван
 * @version 0.1
 */
public class Options {
    /** Хранимый тип операции*/
    private int operation;
    /** Конструктор класса(требует оператор)*/
    Options(String operation) {
        if ("+".equals(operation)) {
            this.operation = 1;
        } else if ("-".equals(operation)) {
            this.operation = 2;
        } else if ("*".equals(operation)) {
            this.operation = 3;
        } else if ("/".equals(operation)) {
            this.operation = 4;
        } else {
            this.operation = 0;
        }
    }
    /** Получение информации о том, какая же операция хранится в настройках*/
    int getOperation(){
        return operation;
    }
}

