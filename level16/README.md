# task01

My first thread
Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread".


Requirements:
1. Добавь в класс Solution публичный статический класс TestThread.
2. Класс TestThread должен реализовывать интерфейс Runnable.
3. Метод run класса TestThread должен выводить "My first thread".
4. Программа должна вывести "My first thread".
5. Метод main не изменять.

# task02

My second thread
1. Создать public static класс TestThread, унаследованный от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
3. Метод run должен выводить в консоль "it's a run method".


Requirements:
1. Добавь в класс Solution публичный статический класс TestThread.
2. Класс TestThread должен быть унаследован от класса Thread.
3. Класс TestThread не должен реализовывать какие-либо дополнительные интерфейсов.
4. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
5. Метод run класса TestThread должен выводить "it's a run method".
6. Метод main не изменять.

# task03

Список и нити
В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.


Requirements:
1. В методе main создай 5 объектов типа SpecialThread.
2. В методе main создай 5 объектов типа Thread.
3. Добавь 5 разных нитей в список list.
4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5. Класс SpecialThread изменять нельзя.

# task04

Вывод стек-трейса
1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
2. SpecialThread должен выводить в консоль свой стек-трейс.

Подсказка: main thread уже выводит в консоль свой стек-трейс.


Requirements:
1. Добавь в класс Solution публичный статический класс SpecialThread.
2. Класс SpecialThread не должен быть унаследован от какого-либо дополнительного класса.
3. Класс SpecialThread должен реализовывать интерфейс Runnable.
4. Метод run класса SpecialThread должен выводить свой стек-трейс.

# task05

Поговорим о музыке
1. Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры - метод startPlaying().
2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
2.3. Считай время окончания игры - метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах. Используй методы из пунктов 2.1 и 2.3.

Пример "Playing 1002 ms".


Requirements:
1. Класс Violin не должен быть унаследован от какого-либо дополнительного класса.
2. Класс Violin должен реализовывать интерфейс MusicalInstrument.
3. Метод run класса Violin должен вызывать метод startPlaying.
4. Метод run класса Violin должен вызывать метод sleepNSeconds с параметром 1 секунда.
5. Метод run класса Violin должен вызывать метод stopPlaying.
6. Метод run класса Violin должен выводить на консоль продолжительность игры в миллисекундах. Используй формат из примера.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level16/task06)

join: в нужное время в нужном месте
Подумай, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
сначала для firstThread, а потом для secondThread.
Вызови метод join в нужном месте.

Пример вывода:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20


Requirements:
1. Метод main должен вызывать метод join для объекта firstThread.
2. Метод main не должен вызывать метод join для объекта secondThread.
3. Метод main не должен вызывать System.out.println() или System.out.print().
4. Вывод программы должен соответствовать примеру из задания.

# task07

Horse Racing
Разберись, что делает программа.
Реализуй метод calculateHorsesFinished.
Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
2.3. Не считать такую лошадь финишировавшей.


Requirements:
1. Метод calculateHorsesFinished должен вернуть количество финишировавших лошадей.
2. Метод calculateHorsesFinished должен вызывать метод isFinished у каждой лошади из переданного списка.
3. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен вывести в консоль "Waiting for " + horse.getName(). Пример сообщения для первой лошади: "Waiting for Horse_01".
4. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен подождать пока она финиширует. Используй правильный метод для ожидания.
5. После завершения работы программы, консоль должна содержать информацию о том, что все лошади финишировали. Пример сообщения для первой лошади: "Horse_01 has finished the race!".
