import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Integer> task = new HashMap<>();

    public static void main(String[] args) {

//        Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.
//        Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:
//        Если такого ключа нет, то просто добавляет данные в коллекцию.
//                Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
//                Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.
//                Пример: есть HashMap "str1" —> 2.
//                Если метод принимает "str2" —> 1, добавляем новое значение.
//                Если метод принимает "str1" —> 2, кидаем исключение.
//                Если метод принимает "str1" —> 5, обновляем коллекцию (теперь по ключу "str1" будет храниться значение 5).
        task.put("str1", 1);
        task.put("str2", 2);
        task.put("str3", 3);
        task.put("str4", 4);
        task.put("str5", 5);
        addTask("str1", 1);

        System.out.println(task);

    } //-------------END main--------------------

    public static void addTask(String str, Integer number) {

        System.out.println(" есть ключ-"+task.containsKey(str));
        System.out.println(" есть значение-"+task.containsValue(number));
        task.put(str, number);
//        if (task.containsKey(str) && task.containsValue(number)) {
//            throw new IllegalArgumentException("Такая запись  уже етсь");
//        }
//        if (task.containsKey(str) && !task.containsValue(number)) {
//            task.put(str, number);
//        }
//        if (!task.containsKey(str) && !task.containsValue(number)) {
//            task.put(str, number);
//        }
    }

}//--------------END CLASS MAIN----------------------
