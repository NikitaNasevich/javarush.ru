# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task01)

Рефакторинг в соответствии с Naming and Code Convention
Исправить код в соответствии с Naming and Code Convention (Shift+F6 для рефакторинга).


Requirements:
1. Переименуй константу defaultFileName в соответствии с Naming and Code Convention.
2. Переименуй метод getFileLoaded() в соответствии с Naming and Code Convention.
3. Переименуй метод DownloadFileContent() в соответствии с Naming and Code Convention.
4. Переименуй метод isexpectedline() в соответствии с Naming and Code Convention.
5. Переименуй параметр expectedline метода принимающего String в соответствии с Naming and Code Convention.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task02)

Рефакторинг в соответствии с Naming and Code Convention 2
Исправить код в соответствии с Naming and Code Convention (Shift+F6 для рефакторинга).


Requirements:
1. Переименуй переменную Solution типа Solution в соответствии с Naming and Code Convention.
2. Переименуй переменную name_of_file_to_be_opened_by_notepad типа String в соответствии с Naming and Code Convention.
3. Переименуй переменную NOTEPAD типа Process в соответствии с Naming and Code Convention.
4. Переименуй метод getstartnotepadprocess() в соответствии с Naming and Code Convention.
5. Переименуй параметр FILE_NAME метода принимающего String в соответствии с Naming and Code Convention.
6. Переименуй переменную cmd_array типа String[] в соответствии с Naming and Code Convention.
7. Переименуй метод Getabsolutepathtodefaulttxtfile() в соответствии с Naming and Code Convention.
8. Переименуй переменную uRi типа URI в соответствии с Naming and Code Convention.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task03)

И еще раз рефакторинг Ӏ Java Multithreading: 9 уровень, 5 лекция
1. Исправить код в соответствии с Naming and Code Convention (Shift+F6 для рефакторинга)
2. Просмотри методы класса ConcurrentMap.
3. В строке "String previousEntry = null;" у concurrentMap вызови метод, который вставит пару (randomInt, text) только для ключа, которого нет в concurrentMap.
(Вызванный метод должен возвращать предыдущее значение либо null для новой пары.)


Requirements:
1. Переименуй константу random в соответствии с Naming and Code Convention.
2. Объект, возвращаемый методом getRunnable(), должен быть экземпляром анонимного класса.
3. Метод run() внутри метода getRunnable() должен вызывать у concurrentMap метод, вставляющий пару (randomInt, text), если в concurrentMap еще нет пары со значением ключа randomInt.
4. Метод run() класса, возвращаемого методом getRunnable(), должен выводить текст на экран.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task04)

Особенности автобоксинга

Исправь ошибку в методе getValueByIndex().

Читай доп. статью про особенности автобоксинга.


Requirements:
1. Метод getValueByIndex() должен возвращать объект типа Integer из массива array, если элемент с индексом index есть в массиве.
2. Метод getValueByIndex() должен возвращать объект типа Double, равный -1, если в массиве array нет элемента с индексом index.
3. Метод main() не изменять.
4. Программа должна вывести две строки: "-1.0, class java.lang.Double" и "3, class java.lang.Integer".

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task05)

Странные ошибки О_о
Исправь 2 ошибки:
1) возникновение исключения
2) подвисание
Сделай минимальные изменения.


Requirements:
1. Метод startCreatingMessages() должен без зависаний добавлять в messageQueue 100000 элементов.
2. Исправь ошибку в строке "messageQueue.drainTo(messageQueue, MAX_BATCH_SIZE);".
3. Метод main() не должен зависать.
4. Вывод программы должен показывать, что все сообщения из messageQueue были перенесены в fakeDataBase.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task06)

Особенности автобоксинга - 2

Исправь ошибку реализации, приводящую к NullPointerException, в методе getValue().

Читай доп. статью про особенности автобоксинга.


Requirements:
1. Реализация метод getValue() должна использовать тернарный оператор.
2. Метод getValue() не должен кидать исключений при любых значениях параметров first и second.
3. Метод getValue() должен вернуть 100, если в него передать Boolean.TRUE и Boolean.TRUE.
4. Метод getValue() должен вернуть 200, если в него передать Boolean.FALSE и Boolean.TRUE.
5. Метод getValue() должен вернуть null, если в него передать Boolean.FALSE и Boolean.FALSE.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task07)

Этот странный BigDecimal

Исправь ошибку реализации, приводящую к погрешности вычисления, в методе getValue().

Сигнатуру метода не менять. Округление не использовать.

Читай доп. статью про особенности автобоксинга.


Requirements:
1. Метод getValue() должен создавать два объекта типа BigDecimal.
2. Метод getValue() должен вызывать метод add() у созданного объекта BigDecimal.
3. Метод getValue() НЕ должен использовать метод round().
4. Метод getValue() должен возвращать результат без погрешности.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task08)

Кеширование

В CacheComputeManager реализуй логику пустого метода.

Догадайся, что он должен делать по названию метода и по логике класса.


Requirements:
1. Метод createFutureTaskForNewArgumentThatHasToComputeValue() должен создавать и возвращать объект типа FutureTask.
2. В методе createFutureTaskForNewArgumentThatHasToComputeValue() должен создаваться объект анонимного класса, реализующего интерфейс Callable.
3. Внутри метода createFutureTaskForNewArgumentThatHasToComputeValue() должна встречаться строка "return computable.compute(arg);".
4. Программа должна выводить текст указанный в комментариях в классе Solution.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level29/task09)

Большая задача. Рефакторинг.


