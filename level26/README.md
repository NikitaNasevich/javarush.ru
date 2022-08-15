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
