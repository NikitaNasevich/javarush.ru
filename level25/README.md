# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level25/task01)

Новые возможности!
Используя возможности enum-а реализуй метод getLetterPosition, который должен возвращать позицию буквы.
Позиция буквы A - 1.


Requirements:
1. Класс Solution должен содержать enum Alphabet.
2. Alphabet должен содержать по порядку 26 букв английского алфавита.
3. Метод getLetterPosition у класса Alphabet должен возвращать позицию буквы в алфавите.
4. Метод getLetterPosition должен вызывать метод ordinal.

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
