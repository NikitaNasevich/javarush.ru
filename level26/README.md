# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task01)

Почитать в инете про медиану выборки
Реализуй логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы.
Верни отсортированный массив от минимального расстояния до максимального.
Если удаленность одинаковая у нескольких чисел, то сортируй их в порядке возрастания.

Пример входящего массива:

13, 8, 15, 5, 17

медиана - 13

Отсортированный масив:

13, 15, 17, 8, 5


Requirements:
1. Программа не должна выводить текст в консоль.
2. Программа не должна считывать данные с консоли.
3. Класс Solution должен содержать публичный статический метод Integer[] sort(Integer[] array).
4. Метод sort(Integer[] array) класса Solution должен сортировать данные в массиве по удаленности от его медианы.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task02)

Был бы ум - будет и успех
Солдаты всегда строились, строятся и будут строиться по убыванию роста.
Отсортируй солдат, предварительно подумав, что лучше использовать при таких условиях - Comparable или Comparator.


Requirements:
1. Класс Soldier должен содержать приватные поля String name и int height.
2. Класс Soldier должен содержать конструктор с двумя параметрами String name и int height.
3. Подумай, что лучше использовать, и реализуй Comparable или Comparator.
4. Класс Soldier должен содержать метод compareTo(Soldier solder).
5. Метод compareTo(Soldier solder) должен сравнивать двоих солдат, учитывая только их рост. Сравнивать объекты нужно с учетом убывания роста солдат.


# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task03)

Убежденному убеждать других не трудно
В таблице есть колонки, по которым можно сортировать.
Пользователь имеет возможность настроить под себя список колонок, которые будут сортироваться.
Напиши public static компаратор CustomizedComparator, который будет:
1. В конструкторе принимать массив компараторов.
2. Сортировать данные в порядке, соответствующем последовательности компараторов.
Все переданные компараторы сортируют дженерик тип Т.
В конструктор передается как минимум один компаратор.


Requirements:
1. Класс Solution должен содержать public static компаратор CustomizedComparator.
2. Класс CustomizedComparator должен содержать приватное поле comparators типа Comparator<T>[].
3. Класс CustomizedComparator должен содержать конструктор с параметром vararg компараторов.
4. Метод compare() класса CustomizedComparator должен сравнивать объекты в порядке, соответствующем последовательности компараторов comparators.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task04)

Для того, чтобы усовершенствовать ум, надо больше размышлять, чем заучивать
Расставь volatile там, где необходимо.


Requirements:
1. Класс Solution должен содержать public static final поле String DEFAULT_JAVARUSH_THREAD_NAME.
2. Класс Solution должен содержать private static final поле AtomicInteger createdThreadIndex.
3. Класс Solution должен содержать private static final поле AtomicInteger aliveThreadIndex.
4. Класс Solution должен содержать private static final поле Logger log.
5. Класс Solution должен содержать private static поле boolean debugSession.
6. Расставь volatile там, где необходимо.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task05)

Трудолюбие - душа всякого дела и залог благосостояния
Расставь volatile там, где необходимо.


Requirements:
1. Класс Solution должен содержать private static поле ScheduledExecutorService interruptScheduledExecutor.
2. Класс Solution должен содержать private static поле Thread taskThread.
3. Класс Solution должен содержать private static поле RethrowableTask task.
4. Класс RethrowableTask должен содержать private поле Throwable throwable.
5. Класс RethrowableTask должен содержать private поле Runnable runnable.
6. Расставь volatile там, где необходимо.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task06)

Тот, кто любит труд, не нуждается в развлечениях
Расставь volatile там, где необходимо.


Requirements:
1. Класс Solution должен содержать private final поле URL javarushUrl.
2. Класс Solution должен содержать private final поле URL javarushUrl1Child.
3. Класс Solution должен содержать private final поле URL javarushVkGroupUrl.
4. Класс Solution должен содержать private final поле URL javarushVkGroupUrl1Child.
5. Класс Solution должен содержать private final поле URL javarushVkGroupUrl2Child.
6. Класс Solution должен содержать private final поле URL javarushVkGroupUrl3Child.
7. Класс Solution должен содержать private поле ExecutorService executorService.
8. Класс Solution должен содержать private поле Set<URL> urlsForProcessing.
9. Класс UrlTask должен содержать private final поле URL url.
10. Расставь volatile там, где необходимо.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task07)

Вежливость - это искусственно созданное хорошее настроение
В классе Solution создай public static класс IntegerHolder.
IntegerHolder должен быть для типа int (имя переменной должно быть value), быть thread safe и изменяемым.
В этом классе должны быть два public метода get и set.


Requirements:
1. Класс Solution должен содержать public static класс IntegerHolder.
2. Класс IntegerHolder должен содержать private поле value типа int.
3. Класс IntegerHolder должен содержать public метод get(), который должен вернуть value.
4. Класс IntegerHolder должен содержать public метод set(int value), который должен установить value переданным значением.
5. Класс IntegerHolder должен быть thread safe.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task08)

Мудрый человек думает раз, прежде чем два раза сказать
Все методы, кроме метода main, класса Solution должны быть thread safe.
Сделайте так, чтобы оба метода могли выполняться одновременно двумя различными тредами.
synchronized(this) для этого не подходит, используй другой объект для лока.


Requirements:
1. Класс Solution должен содержать метод getSumOfVar1AndVar2().
2. Класс Solution должен содержать метод getSumOfVar3AndVar4().
3. Метод getSumOfVar1AndVar2() должен содержать synchronized блок.
4. Метод getSumOfVar3AndVar4() должен содержать synchronized блок.
5. Synchronized блоки методов getSumOfVar1AndVar2() и getSumOfVar3AndVar4() должны использовать мьютексы разных объектов.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level26/task09)

Распределение элементов по корзинам с собственным локом
В синхронизированных блоках используй нужный лок.


Requirements:
1. Класс Solution должен содержать private static final поле int NUMBER_LOCKS.
2. Класс Solution должен содержать private final поле Node[] buckets.
3. Класс Solution должен содержать private final поле Object[] locks.
4. Все методы класса Solution не должны быть synchronized.
5. В методе get() класса Solution в synchronized блоке используй lock из массива locks в зависимости от хэша объекта и количества лок объектов.
6. В методе clear() класса Solution в synchronized блоке используй lock из массива locks в зависимости от индекса элемента и количества лок объектов.
