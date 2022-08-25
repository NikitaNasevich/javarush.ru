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

# [task03]()

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
