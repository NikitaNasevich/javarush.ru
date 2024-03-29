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

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task06)

Знакомство с Executors
1. В методе main создай фиксированный пул из 5 трэдов используя класс Executors.
2. В цикле отправь на исполнение в пул 10 задач Runnable.
3. У каждой задачи в методе run вызови метод doExpensiveOperation с порядковым номером задачи начиная с 1, см. пример вывода.
4. Запрети добавление новых задач на исполнение в пул (метод shutdown).
5. Дай пулу 5 секунд на завершение всех задач (метод awaitTermination и параметр TimeUnit.SECONDS).


Requirements:
1. Используя класс Executors, создай в методе main фиксированный пул из 5 трэдов.
2. Пул должен принимать на исполнение 10 задач Runnable.
3. Каждая задача должна вызывать метод doExpensiveOperation с порядковым номером задачи, начиная с 1.
4. Запрети добавление новых задач на исполнение в пул.
5. На завершение всех задач в пуле нужно установить 5 секунд.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task07)

Знакомство с ThreadPoolExecutor
1. В методе main создай очередь LinkedBlockingQueue<Runnable>.
2. В цикле добавь в очередь 10 задач Runnable.
3. У каждой задачи в методе run вызови метод doExpensiveOperation с порядковым номером задачи начиная с 1, см. пример вывода.
4. Создай объект ThreadPoolExecutor со следующими параметрами:
- основное количество трэдов (ядро) = 3,
- максимальное количество трэдов = 5,
- время удержания трэда живым после завершения работы = 1000,
- тайм-юнит - миллисекунды,
- созданная в п.1. очередь с задачами.
5. Запусти все трэды, которые входят в основное кол-во трэдов - ядро, используй метод prestartAllCoreThreads.
6. Запрети добавление новых задач на исполнение в пул (метод shutdown).
7. Дай объекту ThreadPoolExecutor 5 секунд на завершение всех тасок (метод awaitTermination и параметр TimeUnit.SECONDS).


Requirements:
1. В методе main нужно создать очередь LinkedBlockingQueue<Runnable>.
2. В цикле добавь в очередь 10 задач Runnable.
3. Нужно создать объект ThreadPoolExecutor с параметрами, указанными в задании.
4. С помощью метода prestartAllCoreThreads нужно запустить основные трэды.
5. Каждая задача должна вызывать метод doExpensiveOperation с порядковым номером задачи, начиная с 1.
6. Запрети добавление новых задач на исполнение в пул.
7. На завершение всех задач в пуле нужно установить 5 секунд.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task08)

Осваиваем Callable
Реализуй логику метода getTask, который должен возвращать объект Callable.
Объект Callable должен вычислять сумму всех чисел от 1 до переданного числа i включая его, и возвращать его в виде строки.
Метод main не участвует в тестировании.


Requirements:
1. Класс Solution должен содержать статический метод getTask(int).
2. Метод getTask должен возвращать объект Callable<String>.
3. Объект Callable должен возвращать в виде строки сумму всех чисел от 1 до переданного числа i, включая его
4. Сумма должна правильно считаться для чисел произвольной длины.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task09)

Plants vs Zombies
1. Почитай про java.util.concurrent.Phaser.
2. Расставь методы в нужных местах:
- arriveAndDeregister() - начинает запускать методы run у тасок,
- arriveAndAwaitAdvance() - ждет, когда все трэды будут созданы.

Пример вывода см. в output.txt.

Логика:

Сначала все персонажи присоединяются к игре.
После того, как все персонажи присоединятся к игре и готовы играть, выводится фраза "Игра началась!".
После этого персонажи вступают в игру, после чего умирают.


Requirements:
1. Класс Character менять не нужно.
2. Классы Plant и Zombie менять не нужно.
3. В классе Solution вызови метод phaser.arriveAndDeregister в правильном месте.
4. В классе Solution вызови метод phaser.arriveAndAwaitAdvance в правильном месте.

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task11)

ReentrantReadWriteLock

Класс ReadWriteMap должен предоставлять корректный доступ к объекту Map из многих потоков, но в его реализации были допущены ошибки. Найди их и исправь.

P.S. Для корректной работы Map в многопоточной среде, желательно пользоваться стандартной реализацией, например ConcurrentHashMap из пакета java.util.concurrent. Но иногда требуется работа с другим типом мапы, например LinkedHashMap и тогда предложенное решение будет как никогда кстати.


Requirements:
1. Поле readLock должно быть инициализировано с помощью метода readLock вызванного на объекте lock.
2. Поле writeLock должно быть инициализировано с помощью метода writeLock вызванного на объекте lock.
3. В методе put должен быть вызван метод lock на объекте writeLock.
4. В методе get должен быть вызван метод lock на объекте readLock.
5. В методе put в блоке finally должен быть вызван метод unlock на объекте writeLock.
6. В методе get в блоке finally должен быть вызван метод unlock на объекте readLock.

# [task12](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task12) 

ShutdownNow!

Разберись в чем отличие методов shutdown и shutdownNow. Выведи список всех незавершенных задач на экран.

Должно получиться что-то вроде:

pool-1-thread-1, localId=1

pool-1-thread-2, localId=2

pool-1-thread-3, localId=3

pool-1-thread-4, localId=4

pool-1-thread-5, localId=5

java.util.concurrent.FutureTask@7e6cbb7a was not completed

java.util.concurrent.FutureTask@7c3df479 was not completed

java.util.concurrent.FutureTask@7106e68e was not completed

java.util.concurrent.FutureTask@7eda2dbb was not completed

java.util.concurrent.FutureTask@6576fe71 was not completed


Requirements:
1. В методе main класса Solution должен быть вызван метод shutdownNow на объекте executor.
2. В методе main класса Solution на экран должны быть выведены все задачи которые не успел выполнить executor.
3. Метод main должен быть публичным.
4. Метод main должен быть статическим.

# [task13](https://github.com/NikitaNasevich/javarush.ru/tree/main/level28/task13)

FutureTask

Класс FactorialCalculator предназначен для вычисления факториала числа переданного в его конструктор в качестве параметра. К сожалению, он реализован некорректно и тебе необходимо это исправить.

Внимательно разбери метод main класса Solution.


Requirements:
1. Класс FactorialCalculator должен поддерживать интерфейс Callable.
2. Метод call класса FactorialCalculator должен возвращать результат выполнения метода factorial.
3. Метод call класса FactorialCalculator должен быть публичным.
4. Поле number класса FactorialCalculator должно быть приватным.
