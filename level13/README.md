# task20

Neo
В этой задаче тебе нужно:
Реализовать интерфейс DBObject в классе User.
Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран: "The user's name is Neo, id = 1".
Метод toString и метод main менять нельзя.
Подумать, что должен возвращать метод initializeIdAndName в классе User.
Обрати внимание: методы toString() и main() менять нельзя.

Requirements:
1. Интерфейс DBObject должен быть реализован в классе User.
2. Метод initializeIdAndName должен возвращать корректный объект типа User, объект на котором производится вызов метода("этот" объект).
3. Метод initializeIdAndName должен устанавливать значения полей id и name согласно переданным ему параметрам.
4. Программа должна выводить на экран: "The user's name is Neo, id = 1".
5. Метод toString не менять.
6. Метод main не менять.


# task21

Исправление ошибок
Переделай наследование в классах и интерфейсах так, чтобы программа компилировалась и продолжала делать то же самое.
Класс Hobby должен реализовывать интерфейсы Desire, Dream.


Requirements:
1. Интерфейс Desire должен быть реализован в классе Hobby.
2. Интерфейс Dream должен быть реализован в классе Hobby.
3. Класс Hobby должен содержать статическую переменную INDEX.
4. Метод toString в классе Hobby должен инкрементировать и возвращать переменную INDEX в виде строки.


# task22

Интерфейс SimpleObject
Создай класс StringObject и реализуй в нем интерфейс SimpleObject с параметром типа String.
Программа должна компилироваться.


Requirements:
1. Класс StringObject должен реализовывать интерфейс SimpleObject.
2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
3. В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
4. Класс StringObject должен существовать в классе Solution.
5. Класс StringObject должен быть статическим.


# task23

Интерфейс Updatable в классе Screen
Реализуй интерфейс Updatable в классе Screen.


Requirements:
1. Интерфейс Updatable должен наследовать (extends) интерфейс Selectable.
2. Класс Screen должен реализовывать (implements) интерфейс Updatable.
3. В классе Screen должен быть реализован метод onSelect интерфейса Selectable.
4. В классе Screen должен быть реализован метод refresh интерфейса Updatable.


# task24

Один метод в классе
Реализуй интерфейс Animal в классе Fox.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что методы удалять нельзя.


Requirements:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод — getName.
3. Интерфейс Animal изменять нельзя.
4. Дополнительные классы или интерфейсы создавать нельзя.


# task25

Компиляция программы
Исправь классы Fox и BigFox так, чтобы программа компилировалась.
В решении этой задачи не нужно создавать экземпляры базового класса.
Метод main не изменяй.


Requirements:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод — getName().
3. В интерфейсе Animal должен быть объявлен метод getColor().
4. Класс BigFox должен быть потомком класса Fox.
5. Класс Fox должен быть абстрактным.


# task26

Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:

5

8

-2

11

3

-5

2

10

Пример вывода:

-2

2

8

10



Requirements:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.

# task27

Репка
Давай напишем программу по мотивам сказки "Репка":
Реализуй интерфейс RepkaItem в классе Person.
В классе Person реализуй метод pull(Person person), который выводит фразу типа '<name> за <person>'.
Пример:
  
Бабка за Дедку
  
Дедка за Репку

Исправь логическую ошибку цикла в методе tell класса RepkaStory.
Выполни метод main и наслаждайся сказкой!

Requirements:
1. Интерфейс RepkaItem должен быть реализован в классе Person.
2. В классе Person должен быть реализован метод pull() c одним параметром типа Person.
3. Метод pull в классе Person должен выводить на экран фразу типа '<name> за <person>'. Например: Бабка за Дедку.
4. В результате выполнения метода main() на экран должен быть выведен краткий вариант сказки про Репку.