# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task01)

Новые возможности!
Используя возможности enum-а реализуй метод getLetterPosition, который должен возвращать позицию буквы.
Позиция буквы A - 1.


Requirements:
1. Класс Solution должен содержать enum Alphabet.
2. Alphabet должен содержать по порядку 26 букв английского алфавита.
3. Метод getLetterPosition у класса Alphabet должен возвращать позицию буквы в алфавите.
4. Метод getLetterPosition должен вызывать метод ordinal.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task02)

Машину на СТО не повезем!
Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
Выкинь исключение в случае некорректных данных.

Подсказка: если что-то не то с колесами, то это не машина!
Сигнатуры не менять.


Requirements:
1. Enum Wheel в классе Solution менять нельзя.
2. Сигнатуры в классе Car менять нельзя.
3. Во время создания машины нужно вызвать метод loadWheelNamesFromDB.
4. В случае возврата неправильных данных о колесах, нужно кинуть исключение.
5. Инициализируй поле wheels полученными данными.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task03)

Свой enum
Реализуй интерфейс Columnable у Column, описание методов смотрите в джавадоках.
Реализуй логику метода Column.getVisibleColumns.
Метод Column.configureColumns уже реализован, его не меняй.
Создавать дополнительные поля нельзя.
Метод main не участвует в тестировании.


Requirements:
1. Интерфейс Columnable менять нельзя.
2. Класс Column должен реализовывать интерфейс Columnable.
3. Создавать дополнительные поля в классе Column нельзя.
4. Метод Column.configureColumns реализован. Менять его не нужно.
5. Метод Column.getVisibleColumns должен возвращать список отображаемых колонок в скофигурированом порядке.
6. Метод Column.getColumnName должен возвращать полное имя колонки.
7. Метод Column.isShown должен возвращать true, если колонка видимая, иначе false.
8. Метод Column.hide должен скрывать колонку и сдвигать индексы остальных отображаемых колонок.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task04)

Switch для нитей
Обработай список нитей в зависимости от состояния:
1. Если нить еще не запущена, то запусти ее.
2. Если нить в ожидании, то прерви ее.
3. Если нить работает, то проверь маркер isInterrupted.
4. Если нить прекратила работу, то выведи в консоль ее приоритет.
Используй switch.


Requirements:
1. Метод processThreads принимает аргументом массив нитей.
2. Если переданная нить не запущена, нужно ее запустить.
3. Если переданная нить находится в ожидании, нужно ее прервать.
4. Если переданная нить работает, то нужно проверить маркер isInterrupted.
5. Если переданная нить завершила работу, нужно вывести в консоль ее приоритет.
6. Метод processThreads должен использовать оператор switch.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task05)

Без дураков
1. Создай private class MyUncaughtExceptionHandler, который на перехват исключения должен подождать половину секунды, а затем вывести на экран secretKey, имя трэда и сообщение возникшего исключения.
Используй String.format(...).

Пример:
super secret key, Thread-0, it's an example

2. Разберись в последовательности выполняемого кода и обеспечь логирование возникновения исключения в п.1.
3. Метод main в тестировании не участвует.


Requirements:
1. Создай private class MyUncaughtExceptionHandler с конструктором по-умолчанию в классе MyThread.
2. Во время перехвата исключения, MyUncaughtExceptionHandler должен вызвать Thread.sleep(500).
3. Затем, MyUncaughtExceptionHandler должен выводить в консоль secretKey, имя трэда и сообщение возникшего исключения.
4. Для вывода сообщения используй String.format(...).
5. Нужно обеспечить логирование возникновения исключения.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task06)

Мониторинг состояния нити
Cоздай класс нити LoggingStateThread, которая будет выводить в консоль все состояния (State) переданной в конструктор нити.
Нить LoggingStateThread должна сама завершаться после остановки переданной в конструктор нити.
Метод main не участвует в тестировании.


Requirements:
1. Создай класс LoggingStateThread в отдельном файле. Он должен наследовать класс Thread.
2. Класс LoggingStateThread должен содержать поле нити, за которой он будет следить. Это поле должно инициализироваться через конструктор.
3. Переопредели метод run в классе LoggingStateThread.
4. После запуска класс LoggingStateThread должен выводить в консоль изменения состояния переданной нити.
5. После завершения работы наблюдаемой нити, LoggingStateThread так же должен завершить работу.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task07)

Работать в поте лица!
Реализуй логику метода interrupt, который должен прерывать трэд предварительно закрыв используемые ресурсы.
Используй метод super-класса в блоке finally.


Requirements:
1. Сигнатуру метода interrupt менять нельзя.
2. Метод interrupt должен закрывать используемые классом Solution ресурсы.
3. Затем, метод interrupt должен прерывать трэд (вызов super.interrupt).
4. Трэд должен быть прерван в любом случае, даже если во время закрытия ресурсов было выкинуто исключение.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task08)

Не валять дурака
Восстанови логику класса TaskManipulator.


Requirements:
1. Класс TaskManipulator должен реализовывать интерфейсы Runnable и CustomThreadManipulator.
2. Метод run должен каждые 100 миллисекунд выводить имя исполняемой нити в консоль.
3. Класс TaskManipulator должен иметь внутреннее поле типа Thread.
4. Метод start должен создавать, сохранять во внутреннее поле и запускать нить с именем, которое передано через аргумент метода.
5. Метод stop должен прерывать последнюю созданную классом TaskManipulator нить.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task09)

Все не так легко, как кажется
1. Почитать в инете про Socket, ThreadPoolExecutor, RunnableFuture, Callable.
2. Реализуй логику метода cancel в классе SocketTask.
3. Реализуй логику метода cancel для локального класса внутри метода newTask в классе SocketTask.


Requirements:
1. Определение класса SocketTask, его поля и сигнатуры методов менять нельзя.
2. Метод cancel в классе SocketTask должен закрывать используемые классом ресурсы.
3. Метод cancel для локального класса внутри метода newTask должен закрывать ресурсы SocketTask и вызвать cancel у родительского класса.
4. Метод у родительского класса должен быть вызван, даже если во время закрытия ресурсов было выкинуто исключение.

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task10)

Поживем - увидим
Все исключения, которые возникают в процессе работы нити Solution, должны быть обработаны одним из вариантов:
1. Если это Error, то вывести в консоль "Нельзя дальше работать".
2. Если это Exception, то вывести в консоль "Надо обработать".
3. Если это Throwable, то вывести в консоль "Поживем - увидим".
Реализуй эту логику.


Requirements:
1. В конструкторе Solution должен устанавливаться свой UncaughtExceptionHandler, который будет перехватывать возникшие ошибки и выводить текст в консоль.
2. Если выполнение нити Solution закончилось исключением Error, нужно вывести в консоль "Нельзя дальше работать".
3. Если выполнение нити Solution закончилось исключением Exception, нужно вывести в консоль "Надо обработать".
4. Если выполнение нити Solution закончилось исключением Throwable, нужно вывести в консоль "Поживем - увидим".

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task11)

Вооружаемся до зубов!
Создай свой UncaughtExceptionHandler в виде локального класса внутри конструктора.
UncaughtExceptionHandler должен маскировать звездочками имя трэда и выводить в консоль описание возникшей ошибки.
"Thread-0" должно быть заменено на "********".
"Thread-4321" должно быть заменено на "***********".


Requirements:
1. Определение класса Solution и его поля менять нельзя.
2. Конструктор Solution должен создавать свой UncaughtExceptionHandler, и сохранять его в поле handler.
3. Созданный UncaughtExceptionHandler должен выводить описание возникшей ошибки в консоль.
4. В описании ошибки имя трэда должно быть замаскировано символами "*".

# [task12](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task12)

Живем своим умом
В классе Solution реализуй интерфейс UncaughtExceptionHandler, который должен:
1. прервать нить, которая бросила исключение.
2. вывести в консоль стек исключений, начиная с самого вложенного.

Пример исключения:

new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")))

Пример вывода:

java.lang.IllegalAccessException: GHI

java.lang.RuntimeException: DEF

java.lang.Exception: ABC


Requirements:
1. Класс Solution должен реализовывать интерфейс Thread.UncaughtExceptionHandler.
2. После вызова uncaughtException нужно прервать нить, которая бросила исключение.
3. Затем, вывести в консоль стек исключений, начиная с самого вложенного исключения.
4. Сообщения должны выводиться в формате "exception class: exception message".
