# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task01)

Определяем адрес сети
1. Даны IP-адрес и маска подсети, необходимо вычислить адрес сети - реализуй метод getNetAddress.
Используй операцию поразрядной конъюнкции (логическое И).

Пример:

IP-адрес: 11000000 10101000 00000001 00000010 (192.168.1.2)

Маска подсети: 11111111 11111111 11111110 00000000 (255.255.254.0)

Адрес сети: 11000000 10101000 00000000 00000000 (192.168.0.0)

2. Реализовать метод print, который выведет в консоль данные в двоичном коде. Для IP-адреса(192.168.1.2)
должна быть выведена строка "11000000 10101000 00000001 00000010"
3. Метод main не участвует в тестировании


Requirements:
1. Метод getNetAddress должен вычислять и возвращать адрес сети согласно переданным параметрам(IP-адрес и маска подсети).
2. Метод getNetAddress должен быть статическим и публичным.
3. Метод print должен быть статическим и публичным.
4. Метод print должен преобразовывать переданный ему IP адрес в двоичный код и выводить на экран(как в условии).

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task02)

Сравниваем модификаторы
Реализовать логику метода isModifierSet, который проверяет, содержит ли переданный параметр allModifiers значение конкретного модификатора specificModifier.

P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.


Requirements:
1. Метод isModifierSet должен быть статическим.
2. Метод isModifierSet должен возвращать значение типа boolean.
3. Метод isModifierSet должен принимать два параметра типа int.
4. Метод isModifierSet должен возвращать корректное значение в соответствии с условием задачи(true, если заданный модификатор присутствует в allModifiers, иначе false).

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task03)

Все гениальное - просто!
Упростить. Переменные не переименовывать, комментарии не оставлять.


Requirements:
1. Метод calculate должен быть статическим.
2. Метод calculate должен возвращать значение типа boolean.
3. Метод calculate должен принимать четыре параметра типа boolean.
4. Метод calculate должен быть максимально упрощен(поведение должно остаться прежним).

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task04)

Equals and HashCode
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов(детали уточни у своего любимого поисковика).
Обе строки first и last должны принимать участие в сравнении с помощью метода equals и вычислении hashcode.
Метод main не участвует в тестировании.


Requirements:
1. Хешкоды одинаковых объектов должны быть равны.
2. Метод equals должен проверять равен ли переданный объект текущему(сравнение через ==).
3. Метод equals должен проверять является ли переданный объект объектом класса Solution.
4. Метод equals должен возвращать true в случае, если поля first и last равны у переданного объекта и текущего(не забудь что они могут быть равны null).
5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task05)

Исправить ошибку. Сравнение объектов
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.


Requirements:
1. Хешкоды одинаковых объектов должны быть равны.
2. Метод equals должен проверять равен ли переданный объект равен текущему(сравнение через ==).
3. Метод equals должен проверять является ли переданный объект объектом класса Solution.
4. Метод equals должен возвращать true в случае, если поля first и last равны у переданного объекта и текущего(не забудь что они могут быть равны null).
5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
6. В классе Solution должен быть реализован метод hashCode.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task06)

Ошибка в equals/hashCode
Исправьте ошибки реализаций методов equals и hashCode для класса Solution.


Requirements:
1. Хешкоды одинаковых объектов должны быть равны.
2. Метод equals должен проверять равен ли переданный объект равен текущему (сравнение через ==).
3. Метод equals должен проверять является ли переданный объект объектом класса Solution.
4. Метод equals должен проверять значения всех полей у переданного объекта и текущего (учти что некоторые из них могут быть равны null).
5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
6. В классе Solution должен быть реализован метод hashCode.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task07)

Глубокое клонирование карты
Обеспечь возможность клонирования объекта класса Solution используя глубокое клонирование.
Данные в карте users также должны быть клонированы.
Не забудь о методах equals и hashCode для корректного добавления элементов типа User в HashMap.


Requirements:
1. Класс Solution должен поддерживать интерфейс Cloneable.
2. Класс User должен поддерживать интерфейс Cloneable.
3. В классе User должен быть корректно реализован метод clone.
4. В классе Solution должен быть корректно реализован метод clone.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task08)

Клонирование растений
Класс Plant не должен реализовывать интерфейс Cloneable
Реализуй механизм глубокого клонирования для Tree.


Requirements:
1. Класс Plant не должен поддерживать интерфейс Cloneable.
2. Класс Tree должен поддерживать интерфейс Cloneable.
3. Класс Tree должен быть потомком класса Plant.
4. В классе Tree должен быть корректно реализован метод clone.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task09)

Запретить клонирование
Разреши клонировать класс А
Запрети клонировать класс B
Разреши клонировать класс C
Не забудь о методах equals и hashCode!


Requirements:
1. Класс A должен поддерживать интерфейс Cloneable.
2. Класс B должен быть потомком класса A.
3. При объявлении класса B не должно быть явно указано implements Cloneable.
4. Метод clone в классе B должен быть переопределен таким образом, чтобы при попытке клонирования объекта класса B возникало исключение CloneNotSupportedException.
5. Класс C должен быть потомком класса B.
6. Клонирование объектов класса C должно завершаться успешно.

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task10)

Рефакторинг методов
Отрефакторите метод writeZipEntriesToFile в соответствии с java7 try-with-resources.


Requirements:
1. Метод writeZipEntriesToFile должен быть объявлен с модификатором доступа public.
2. Метод writeZipEntriesToFile должен быть статическим.
3. Тип возвращаемого значения метода writeZipEntriesToFile должен быть void.
4. Метод writeZipEntriesToFile должен корректно использовать try-with-resources.

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task11)

Освобождаем ресурсы
Реализуй метод finalize, предварительно обдумав, что именно в нем должно быть.
Проведи рефакторинг метода getUsers в соответствии с java7 try-with-resources.


Requirements:
1. Метод finalize в классе Solution должен содержать вызов super.finalize().
2. Метод finalize в классе Solution должен корректно завершаться в случае, если значение поля connection равно null.
3. Метод finalize в классе Solution должен закрывать текущее соединение, если значение поля connection не равно null.
4. Метод getUsers должен корректно использовать try-with-resources.

# [task12](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task12)

AutoCloseable и try-with-resources
В классе FakeConnection реализуй интерфейс AutoCloseable, чтобы объекты этого типа можно было использовать в try-with-resources.
Метод close() должен выводить на экран фразу "Closing database connection..."
В блоке try последовательно вызови методы usefulOperation() и unsupportedOperation().

Вывод на экран должен быть следующим:

Establishing database connection...

Entering body of try block.

Executing useful operation.

Operation is not supported yet!

Closing database connection...

Обрати внимание на то, что ресурсы были освобождены автоматически несмотря на исключение брошенное методом unsupportedOperation.


Requirements:
1. Класс FakeConnection должен поддерживать интерфейс AutoCloseable.
2. Метод close класса FakeConnection должен выводить на экран фразу "Closing database connection...".
3. В методе main класса Solution должны быть вызваны методы usefulOperation и unsupportedOperation у объекта класса FakeConnection.
4. Вывод на экран должен соответствовать условию задачи.
5. Метод close класса FakeConnection не должен быть вызван явно.

# [task13](https://github.com/NikitaNasevich/javarush.ru/tree/main/level21/task13)

Игра Ипподром. Условия внутри.
