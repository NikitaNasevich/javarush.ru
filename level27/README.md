# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task01)

Избавляемся от меток
Избавьтесь от меток в методе isSubstringPresent сохранив логику.
Метод возвращает true, в случае если строка substring является подстрокой строки string, иначе false.
В коде должны отсутствовать операторы break и continue.


Requirements:
1. Метод isSubstringPresent должен возвращать true, если строка substring является подстрокой строки string.
2. Метод isSubstringPresent должен возвращать false, если строка substring НЕ является подстрокой строки string.
3. В методе isSubstringPresent должны отсутствовать операторы break.
4. В методе isSubstringPresent должны отсутствовать операторы continue.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task02)

Нужный оператор
Вставьте в код единственную строчку - оператор (не break), чтобы на экран выводился треугольник из букв S.


Requirements:
1. Программа должна выводить на экран треугольник из букв S.
2. В программе должен быть использован оператор continue.
3. В программе не должен быть использован оператор break.
4. Программа не должна считывать данные с клавиатуры.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task03) 

Создаем deadlock
Расставь модификаторы так, чтобы при работе с этим кодом появился deadlock.
Метод main порождает deadlock, поэтому не участвует в тестировании.


Requirements:
1. Класс Solution.Friend НЕ должен быть приватным.
2. Класс Solution.Friend должен быть статическим.
3. Метод bow должен быть объявлен с модификатором synchronized.
4. Метод bowBack должен быть объявлен с модификатором synchronized.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task04)

Модификаторы и deadlock
Расставь модификаторы так, чтобы при работе с этим кодом появился deadlock.
Метод main порождает deadlock, поэтому не участвует в тестировании.


Requirements:
1. Поле field должно быть приватным.
2. Метод getField НЕ должен быть приватным.
3. Метод sout должен быть объявлен с модификатором synchronized.
4. Метод sout2 должен быть объявлен с модификатором synchronized.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task05)

Второй вариант deadlock
В методе secondMethod расставь synchronized блоки так, чтобы при использовании класса Solution нитями образовывался deadlock.


Requirements:
1. В методе secondMethod должен присутствовать синхронизированный блок по объекту lock.
2. В методе secondMethod должен присутствовать вложенный синхронизированный блок по объекту this.
3. Поле lock должно быть приватным.
4. Метод secondMethod не должен быть объявлен с модификатором synchronized.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task06)

Убираем deadlock
Используя стратегию избегания deadlock-а сделай так, чтобы он не возник.
Метод main не участвует в тестировании.
Действуй аналогично примеру из лекций.
Изменения вноси только в safeMethod.


Requirements:
1. Метод safeMethod не должен вызывать deadlock при использовании из разных потоков.
2. В методе safeMethod должен содержаться вызов метода unsafeMethod, с теми же аргументами.
3. В методе safeMethod должен содержаться вызов метода longTimeMethod.
4. В методе safeMethod должно содержаться два блока synchronized.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task07)

Определяем порядок захвата монитора
Реализуй логику метода isLockOrderNormal, который должен определять:
соответствует ли порядок synchronized блоков в методе someMethodWithSynchronizedBlocks - порядку передаваемых в него аргументов.
В случае, если сначала происходит синхронизация по o1, а потом по o2, метод должен вернуть true.
Если наоборот - false.


Requirements:
1. Метод isLockOrderNormal должен возвращать true в случае, если синхронизация в методе someMethodWithSynchronizedBlocks происходит сначала по объекту o1, а потом по o2.
2. Метод isLockOrderNormal должен возвращать false в случае, если синхронизация в методе someMethodWithSynchronizedBlocks происходит сначала по объекту o2, а потом по o1.
3. Метод isLockOrderNormal НЕ должен быть приватным.
4. Класс Solution НЕ должен быть объявлен с модификатором final.
