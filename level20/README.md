# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task01)

Читаем и пишем в файл: Human
Часто необходимо сохранять состояние работы программы. До появления сериализации каждый делал это своим способом. В этой задаче нужно сохранить в файл состояние работы программы и вычитать состояние из файла без использования сериализации.

Реализуй логику записи в файл и чтения из файла для класса Human.
Поле name в классе Human не может быть пустым.
Метод main реализован только для тебя и не участвует в тестировании.


Requirements:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список assets пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если поле name и список assets не пустые.
3. Класс Solution.Human не должен поддерживать интерфейс Serializable.
4. Класс Solution.Human должен быть публичным.
5. Класс Solution.Human не должен поддерживать интерфейс Externalizable.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task02)

Читаем и пишем в файл: JavaRush
Реализуй логику записи в файл и чтения из файла для класса JavaRush.
Пустых полей у объекта User быть не может. Дату в файле удобно хранить в формате long.
Метод main реализован только для тебя и не участвует в тестировании.


Requirements:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
3. Класс Solution.JavaRush не должен поддерживать интерфейс Serializable.
4. Класс Solution.JavaRush должен быть публичным.
5. Класс Solution.JavaRush не должен поддерживать интерфейс Externalizable.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task03)

Знакомство с properties
В методе main() происходит считывание пути к файлу с консоли и заполнение runtimeStorage данными из файла.
Тебе необходимо в методе save() реализовать логику записи в файл для карты runtimeStorage, а в методе load() - логику чтения из файла для runtimeStorage.
Файл должен быть в формате .properties. Комментарии в файле игнорируй.
Про .properties прочитай в вики.
Подсказка: используй объект класса Properties.


Requirements:
1. Метод save() должен сохранять карту runtimeStorage в параметр outputStream.
2. Метод load() должен восстанавливать состояние карты runtimeStorage из параметра inputStream.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task04)

Читаем и пишем в файл статики
Реализуй логику записи в файл и чтения из файла для класса ClassWithStatic.
Метод load должен инициализировать объект включая статические поля данными из файла.
Метод main не участвует в тестировании.


Requirements:
1. Должна быть реализована возможность сохранения/загрузки объектов типа Solution.ClassWithStatic с помощью методов save/load.
2. Класс Solution не должен поддерживать интерфейс Serializable.
3. Класс Solution.ClassWithStatic не должен поддерживать интерфейс Serializable.
4. Класс Solution.ClassWithStatic должен быть публичным.
5. Класс Solution.ClassWithStatic не должен поддерживать интерфейс Externalizable.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task05)

Очень странные дела
При чтении/записи объектов типа Human возникают странные ошибки.
Разберись в чем дело и исправь их.


Requirements:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список assets равен null.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если поле name и список assets не равны null.
3. Класс Solution.Human не должен поддерживать интерфейс Serializable.
4. Класс Solution.Human должен быть публичным.
5. Класс Solution.Human не должен поддерживать интерфейс Externalizable.
6. Метод equals должен возвращать true для двух равных объектов типа Human и false для разных.
7. Метод hashCode должен всегда возвращать одно и то же значение для одного и того же объекта типа Human.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task06)

Как сериализовать?
Сделай так, чтобы сериализация класса Human была возможной.


Requirements:
1. Класс Human должен существовать внутри класса Solution.
2. Класс Human должен быть статическим.
3. Класс Human должен быть публичным.
4. Класс Human должен поддерживать интерфейс Serializable.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task07)

Как сериализовать JavaRush?
Сделай так, чтобы сериализация класса JavaRush была возможной.


Requirements:
1. Класс JavaRush должен существовать внутри класса Solution.
2. Класс JavaRush должен быть статическим.
3. Класс JavaRush должен быть публичным.
4. Должна быть возможна сериализация класса JavaRush.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task08)

Как сериализовать Singleton?
Два десериализованных объекта singleton и singleton1 имеют разные ссылки в памяти, а должны иметь одинаковые.
Синглтоном (Singleton) называют класс, у которого экземпляр создаётся только один раз. Немного больше информации про синглтон можешь найти в статье.
В класс Singleton добавь приватный метод Object readResolve(), чтобы после десериализации ссылки на объекты были равны. Метод main не участвует в тестировании.


Requirements:
1. Класс Solution.Singleton должен поддерживать интерфейс Serializable.
2. В классе Solution.Singleton должен быть реализован метод readResolve без параметров.
3. Метод readResolve должен возвращать синглтон (ourInstance).
4. Метод readResolve должен быть приватным.
5. В классе Solution должен быть публичный статический метод serializeSingletonInstance.
6. После десериализации ссылки на объекты должны быть равны.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task09)

Как сериализовать static?
Сделай так, чтобы сериализация класса ClassWithStatic была возможной.


Requirements:
1. Класс ClassWithStatic должен существовать внутри класса Solution.
2. Класс ClassWithStatic должен быть статическим.
3. Класс ClassWithStatic должен быть публичным.
4. Класс ClassWithStatic должен поддерживать интерфейс Serializable.

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task10)

Как сериализовать что-то свое?
Сделайте так, чтобы сериализация класса Object была возможной.
Подсказка: для сериализации объекта нужно, чтобы все его поля поддерживали сериализацию.
Для многих класов из JRE это уже сделано. Но если класс написан тобой, то нужно это свойство добавить вручную.


Requirements:
1. Класс Object должен существовать внутри класса Solution.
2. Класс Solution.Object должен быть статическим.
3. Класс Solution.Object должен быть публичным.
4. Класс Solution.Object должен поддерживать интерфейс Serializable.
5. Класс Solution.String должен поддерживать интерфейс Serializable.

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task11)

Externalizable для апартаментов
Реализуй интерфейс Externalizable в классе Apartment.


Requirements:
1. Класс Solution.Apartment должен поддерживать интерфейс Externalizable.
2. В классе Solution.Apartment должен быть реализован метод writeExternal с одним параметром типа ObjectOutput.
3. В классе Solution.Apartment должен быть реализован метод readExternal с одним параметром типа ObjectInput.
4. В методе writeExternal, на полученном в качестве параметра объекте типа ObjectOutput должен быть вызван метод writeObject с параметром address.
5. В методе writeExternal, на полученном в качестве параметра объекте типа ObjectOutput должен быть вызван метод writeInt с параметром year.
6. Метод readExternal должен корректно восстанавливать из ObjectInput значение поля address.
7. Метод readExternal должен корректно восстанавливать из ObjectInput значение поля year.

# [task12](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task12)

OutputToConsole
Класс OutputToConsole должен сериализовываться с помощью интерфейса Externalizable.
Найди и исправь ошибку.


Requirements:
1. Класс Solution.OutputToConsole должен поддерживать интерфейс Externalizable.
2. Класс OutputToConsole должен быть создан в классе Solution.
3. Класс OutputToConsole должен быть публичным.
4. Класс OutputToConsole должен быть статическим.

# [task13](https://github.com/NikitaNasevich/javarush.ru/tree/main/level20/task13)

Externalizable Person
Класс Person должен сериализовываться с помощью интерфейса Externalizable.
Исправь ошибку сериализации.
Сигнатуры методов менять нельзя.


Requirements:
1. В классе Solution.Person должен быть создан публичный конструктор без параметров.
2. В классе Solution.Person должен быть создан конструктор с тремя параметрами (String firstName, String lastName, int age).
3. Класс Solution.Person должен поддерживать интерфейс Externalizable.
4. Методы readExternal и writeExternal должны позволять корректно сериализовывать и десериализовывать объекты типа Person.
