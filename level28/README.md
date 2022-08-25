# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task01)

Осваиваем switch
Реализуй логику метода switchTest:
1. Не используй условные операторы.
2. Используй 1 switch, у которого 2 case и 1 default.
3. Ожидаемый вывод:

Вывод для E1.A - "it's E1.A"

Вывод для E1.B - "it's E1.B"

Вывод для E1.C - "it's E1.C"

Вывод для E1.Y - "it's E1.Y"

Вывод для E2.D - "it's E2.D"

Вывод для E2.E - "it's E2.E"

Вывод для E2.F - "it's E2.F"

Вывод для всех других значений - "undefined"


Requirements:
1. Класс Solution должен содержать метод switchTest и enums E1, E2, E3.
2. Реализуй метод switchTest, используя 1 switch, у которого 2 case и 1 default.
3. Вывод в консоль должен соответствовать условию задачи.
4. Использовать условные операторы нельзя.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task02)

Пишем свою ThreadFactory
В классе Solution создай публичный статический класс AmigoThreadFactory, реализующий интерфейс ThreadFactory.
1. Реализация интерфейсного метода - создай и верни трэд, который должен:
1.1. не быть демоном,
1.2. иметь нормальный приоритет,
1.3. имя трэда должно иметь шаблон "GN-pool-A-thread-B",
где GN - это имя группы,
A - это номер фабрики инкрементируется в пределах класса начиная с 1, используй AtomicInteger,
B - номер треда инкрементируется в пределах конкретной фабрики начиная с 1, используй AtomicInteger.
2. Каждая фабрика должна иметь ту группу тредов (ThreadGroup), в которой она была создана.
3. Методы main и emulateThreadFactory не участвуют в тестировании.

Пример вывода:

secondGroup-pool-2-thread-1

firstGroup-pool-1-thread-1

firstGroup-pool-1-thread-3

secondGroup-pool-2-thread-3

firstGroup-pool-1-thread-2

secondGroup-pool-2-thread-2


Requirements:
1. В классе Solution нужно создать класс public static AmigoThreadFactory, который реализует интерфейс ThreadFactory.
2. Фабрика AmigoThreadFactory должна создавать трэды, которые не являются демоном.
3. Фабрика AmigoThreadFactory должна создавать трэды, которые имеют нормальный приоритет.
4. Фабрика AmigoThreadFactory должна создавать имена для трэдов по шаблону "GN-pool-A-thread-B".
5. Каждая фабрика должна производить трэды с группой (ThreadGroup), в которой она была создана.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task03)

ThreadLocalRandom
Класс Solution будет использоваться трэдами.
Реализуй логику всех методов, используй класс ThreadLocalRandom.
getRandomIntegerBetweenNumbers должен возвращать случайный int между from и to.
getRandomDouble должен возвращать случайный double.
getRandomLongBetween0AndN должен возвращать случайный long между 0 и n.


Requirements:
1. В классе Solution должны быть только статические методы.
2. Метод getRandomIntegerBetweenNumbers с помощью ThreadLocalRandom должен возвращать случайный int [from..to].
3. Метод getRandomDouble с помощью ThreadLocalRandom должен возвращать случайный double [0..1).
4. Метод getRandomLongBetween0AndN с помощью ThreadLocalRandom должен возвращать случайный long [0..n].

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task04)

Magic class
В пакете java.util.concurrent найди такую реализацию List, у которой:
1. Итератор не содержит какие-либо данные, вставленные в список после создания итератора;
2. Внутри данные хранятся в виде массива;
3. Итератор гарантированно не бросает ConcurrentModificationException;
4. Допускаются все элементы включая null;
5. Исправь строку List<String> list = null ... в методе main.


Requirements:
1. Класс Solution изменять нельзя.
2. Реализацию методов startUpdatingThread и stopUpdatingThread менять нельзя.
3. Реализацию метода copyOnWriteSolution менять нельзя.
4. Добавь в main создание нужного экземпляра List согласно заданию.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task05)

Приоритеты в Threads
В отдельном файле создай класс MyThread унаследовавшись от Thread.
MyThread должен:
1. Иметь возможность быть созданным используя любой конструктор супер-класса (Alt+Insert).
2. Приоритет у трэдов должен проставляться циклично от минимального значения до максимального значения.
3. если у трэда установлена трэд-группа(ThreadGroup), то приоритет трэда не может быть больше максимального приоритета его трэд-группы.


Requirements:
1. Создай класс MyThread в отдельном файле. Унаследуй его от Thread.
2. В классе MyThread должны присутствовать конструкторы, аналогичные конструкторам супер-класса.
3. Приоритет у объектов MyThread должен проставляться циклично, от MIN_PRIORITY до MAX_PRIORITY.
4. Если у объекта MyThread установлена ThreadGroup, приоритет MyThread не должен быть выше максимального приоритета ThreadGroup.
