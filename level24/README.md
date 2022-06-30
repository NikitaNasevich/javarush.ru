# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task01)

Создание своего интерфейса-маркера
1. Создай интерфейс-маркер SelfInterfaceMarker.
2. Создай класс SelfInterfaceMarkerImpl, который реализует SelfInterfaceMarker.
3. Добавь в SelfInterfaceMarkerImpl минимум 2 любых public метода.
4. Создай исключение UnsupportedInterfaceMarkerException, унаследуй его от класса Exception.
5. В методе testClass класса Util: если параметр == null, то выбросьте UnsupportedInterfaceMarkerException.


Requirements:
1. Интерфейс-маркер SelfInterfaceMarker должен быть создан в отдельном файле.
2. Класс SelfInterfaceMarkerImpl должен быть создан в отдельном файле и реализовывать интерфейс SelfInterfaceMarker.
3. В классе SelfInterfaceMarkerImpl должны существовать минимум два public метода.
4. Исключение UnsupportedInterfaceMarkerException должно быть создано в отдельном файле.
5. Метод testClass класса Util должен бросать исключение UnsupportedInterfaceMarkerException в случае, если полученный параметр равен null.
6. В интерфейсе SelfInterfaceMarker не должны быть объявлены методы или декларированы константы.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task02)

Cloneable
Добавьте java-код, чтобы метод main отработал без исключений.


Requirements:
1. Класс Test4 должен поддерживать интерфейс Cloneable.
2. В классе Test4 должен быть реализован метод clone() без параметров.
3. В методе main должен быть вызван метод clone на объекте типа Test1.
4. В методе main должен быть вызван метод clone на объекте типа Test2.
5. В методе main должен быть вызван метод clone на объекте типа Test4.
6. В методе main должен быть вызван метод c1one на объекте типа Test3.
7. Класс Test1 должен поддерживать интерфейс Cloneable.
