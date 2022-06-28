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

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task06)

Inner 2
В классе SuperUser метод getDescription должен учитывать страну и город, т.е. возвращать результат аналогичный следующему:

My name is George. I'm from Seattle in the United States.

Используй возможности иннер класса.


Requirements:
1. Класс SuperUser должен быть приватным.
2. Класс SuperUser должен содержать метод getDescription.
3. Метод getDescription в классе SuperUser должен быть публичным.
4. Метод getDescription в классе SuperUser должен возвращать строку учитывающую имя, страну и город пользователя форматированную согласно условию задачи.
5. Метод getTrickyUser должен возвращать объект типа SuperUser.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task07)

Как выбрать нужное?
В методе main присвой объекту Object obj экземпляр класса TEST.
Не изменяй ничего кроме метода main.


Requirements:
1. В классе Solution должно существовать поле TEST.
2. В классе Solution должен существовать класс TEST.
3. В классе Solution должно существовать поле obj.
4. В методе main в поле obj должен быть сохранен объект типа TEST(экземпляр класса TEST).

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task08)

Рефакторинг, вложенные классы
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.


Requirements:
1. В классе Solution должен быть создан класс Constants содержащий строковые константы.
2. Класс Constants должен быть публичным.
3. Класс Constants должен быть объявлен с модификатором, запрещающим наследование от этого класса.
4. В классе Constants должна существовать константа SERVER_IS_CURRENTLY_NOT_ACCESSIBLE со значением "The server is not currently accessible.".
5. В классе Constants должна существовать константа USER_IS_NOT_AUTHORIZED со значением "The user is not authorized.".
6. В классе Constants должна существовать константа USER_IS_BANNED со значением "The user is banned.".
7. В классе Constants должна существовать константа ACCESS_IS_DENIED со значением "Access is denied.".

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task09)

Анонимность иногда так приятна!
1. В пакете vo создай public классы User, Location, Server, Subject, Subscription, которые наследуются от NamedItem
2. В классе Solution для каждого класса создай свой метод, который возвращает список экземпляров класса.

Например, для класса User это будет - public List<User> getUsers()
Для класса Location это будет - public List<Location> getLocations()

3. Внутри каждого такого метода создай анонимный класс от AbstractDbSelectExecutor и вызови его нужный метод.

Подсказка:
тело метода должно начинаться так: return new AbstractDbSelectExecutor

4. Пример вывода для User и Location:
Id=5, name='User-5', description=Received from executing 'SELECT * FROM USER'
Id=1, name='Location-1', description=Received from executing 'SELECT * FROM LOCATION'

5. Проанализируй пример вывода и сформируй правильный query для всех классов.


Requirements:
1. В пакете vo должен быть создан public класс User, унаследованный от класса NamedItem.
2. В пакете vo должен быть создан public класс Location, унаследованный от класса NamedItem.
3. В пакете vo должен быть создан public класс Server, унаследованный от класса NamedItem.
4. В пакете vo должен быть создан public класс Subject, унаследованный от класса NamedItem.
5. В пакете vo должен быть создан public класс Subscription, унаследованный от класса NamedItem.
6. В методе getUsers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа User.
7. В методе getLocations должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Location.
8. В методе getServers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Server.
9. В методе getSubjects должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Subject.
10. В методе getSubscriptions должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Subscription.
11. Метод getUsers должен возвращать корректный список(в соответствии с условием задачи).
12. Метод getLocations должен возвращать корректный список(в соответствии с условием задачи).
13. Метод getServers должен возвращать корректный список(в соответствии с условием задачи).
14. Метод getSubjects должен возвращать корректный список(в соответствии с условием задачи).
15. Метод getSubscriptions должен возвращать корректный список(в соответствии с условием задачи).

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task10)

Напряги извилины!
Метод printName должен выводить имя собственного объекта, т.е. "The Darkside Hacker"
Сделайте минимум изменений.


Requirements:
1. Вывод на экран должен соответствовать условию.
2. В классе Solution должен присутствовать метод sout без параметров.
3. В классе Solution должно присутствовать поле name.
4. Модификатор доступа метода getName должен быть расширен.

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task11)

Повторяем threads
Сделать так, чтобы в методе someActions вызывались только методы класса Solution.

Ожидаемый вывод в методе main:

Amigo: Mmmmm, beef

Amigo: knock knock

Amigo: Zzzzzzz...1 s


Requirements:
1. Вывод на экран должен соответствовать условию задачи.
2. В методе someActions должен быть вызван метод sleep класса Solution.
3. В классе Solution должно присутствовать поле name.
4. В классе Solution должно присутствовать поле food.
5. В классе Solution должно присутствовать поле sound.

# [task12](https://github.com/NikitaNasevich/javarush.ru/tree/main/level23/task12)

Игра Змейка. Условия внутри.
