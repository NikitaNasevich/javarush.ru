# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task01)

Запрети наследование
Запрети наследование от класса Listener.


Requirements:
1. Класс Listener должен быть создан внутри класса Solution.
2. Класс Listener должен быть публичным.
3. Класс Listener должен быть статическим.
4. Должна быть запрещена возможность стать потомком класса Listener

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task02)

Запрети переопределение
Запрети переопределение метода onMouseDown.


Requirements:
1. Класс Listener должен быть создан внутри класса Solution.
2. Класс Listener должен быть публичным.
3. Метод onMouseDown должен быть публичным.
4. Должна быть запрещена возможность переопределить метод onMouseDown.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task03)

Запрети создание экземпляров класса
Запрети создание экземпляров класса Listener.


Requirements:
1. Класс Listener должен быть создан внутри класса Solution.
2. Класс Listener должен быть публичным.
3. Класс Listener должен быть статическим.
4. Должна быть запрещена возможность создавать экземпляры класса Listener.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task04)

Inner 3
Внутри класса Solution:
1) реализуй private class TaskDataProvider используя Task и MockDB, цель которого - обновить поле tasks.
2) реализуй private class NameDataProvider используя String и MockDB, цель которого - обновить поле names.


Requirements:
1. Класс TaskDataProvider должен быть создан внутри класса Solution и быть приватным.
2. Класс NameDataProvider должен быть создан внутри класса Solution и быть приватным.
3. Класс TaskDataProvider должен реализовывать интерфейс DbDataProvider с параметром типа Task.
4. Класс NameDataProvider должен реализовывать интерфейс DbDataProvider с параметром типа String.
5. Метод refreshAllData в классе TaskDataProvider должен сохранять в список tasks результат работы метода getFakeTasks класса MockDB.
6. Метод refreshAllData в классе NameDataProvider должен сохранять в список names результат работы метода getFakeNames класса MockDB.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task05)

Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.


Requirements:
1. В классе Solution должен быть реализован метод getTwoSolutions.
2. Метод getTwoSolutions должен быть статическим.
3. Метод getTwoSolutions должен быть публичным.
4. Метод getTwoSolutions должен возвращать массив типа Solution заполненный согласно заданию.
