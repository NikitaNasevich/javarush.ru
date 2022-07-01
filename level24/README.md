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

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task03)

Так-с... сопоставим
Исправь ошибки: перемести методы clone в те классы, в которых они должны быть реализованы.
Лишние методы удали.
Не удаляй метод main.


Requirements:
1. В классе C должен быть реализован метод clone без параметров.
2. В классе Solution должен существовать метод main.
3. В классе Solution должны существовать 4 вложенных класса.
4. В классе Solution должен существовать 1 метод.
5. Метод clone в классе C должен возвращать объект типа C.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task04)

Рефакторинг Rectangle
В классе Rectangle:
1. Измени методы getHeight и getWidth, чтобы они возвращали объекты типов HasHeight и HasWidth соответственно.
2. Для этого внутри методов getHeight и getWidth создай локальные классы - реализации интерфейсов.
3. Переименуй getHeight в castToHasHeight, getWidth в castToHasWidth (на имени метода нажми Shift+F6).
4. Убери наследование интерфейсов в классе Rectangle.

P.S. Ожидается, что после внесения требуемых изменений, закомментированный код в методе станет рабочим и должен быть раскомментирован.


Requirements:
1. В класса Rectangle должен быть реализован метод castToHasHeight.
2. В класса Rectangle должен быть реализован метод castToHasWidth.
3. Метод castToHasHeight должен возвращать объект типа HasHeight.
4. Метод castToHasWidth должен возвращать объект типа HasWidth.
5. Объект возвращаемый методом castToHasHeight должен вычислять высоту, как разницу между y координатами.
6. Объект возвращаемый методом castToHasWidth должен вычислять ширину, как разницу между x координатами.
7. Класс Rectangle не должен реализовывать интерфейс HasHeight.
8. Класс Rectangle не должен реализовывать интерфейс HasWidth.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task05)

Black box
1. Восстанови логику метода someAction для поля solutionAction.
2. Пример вывода смотри в комментарии к методу main.
3. Подсказка: метод someAction анонимного класса поля solutionAction должен вызвать метод сабкласса FirstClass, если param > 0, иначе вызвать метод сабкласса SecondClass.

Не изменяй метод main!


Requirements:
1. Вывод на экран должен соответствовать условию задачи.
2. Для вывода должны быть использованы строковые константы объявленные в классе SecondClass.
3. В методе someAction анонимного класса Action созданного в классе Solution должен содержаться вызов метода someAction родительского класса (super.someAction()).
4. В методе someAction анонимного класса Action созданного в классе Solution должен быть создан объект типа FirstClass.
5. В методе someAction анонимного класса Action созданного в классе Solution должен быть создан объект типа SecondClass.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task06)

Наследование от внутреннего класса
Внутри класса Solution создай 2 внутренних public класса Apt3Bedroom, BigHall.
Унаследуй их от Apartments и Hall.


Requirements:
1. Класс Apt3Bedroom должен быть создан внутри класса Solution.
2. Класс BigHall должен быть создан внутри класса Solution.
3. Класс Apt3Bedroom должен быть публичным.
4. Класс BigHall должен быть публичным.
5. Класс Apt3Bedroom должен быть потомком класса Building.Apartments.
6. Класс BigHall должен быть потомком класса Building.Hall.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level24/task07)

Реализация интерфейса используя локальный класс
В классе Cat реализуй логику метода toSayable, которая описана в джавадоке.


Requirements:
1. В классе Cat должен быть реализован публичный метод toSayable с одним параметром типа int.
2. Метод toSayable должен возвращать объект типа Sayable.
3. Если полученный параметр меньше 1, метод say() должен вернуть строку формата: "name спит.", где name - имя текущего кота.
4. Если полученный параметр больше либо равен 1, метод say() должен вернуть строку формата: "name говорит мяяяу!", где name - имя текущего кота, а количество букв "я" в слове "мяяяу" равно полученному параметру.
5. Программа должна выводить данные на экран.
