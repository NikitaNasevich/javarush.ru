Только по-очереди!
1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main вывести результат для каждой нити.
5. Используй join.

Пример:

Входные данные:

a

b


c

d

e

f

Выходные данные:

a b c

d e f


Requirements:
1. Объяви в классе Solution public static класс Read3Strings.
2. Класс Read3Strings должен быть унаследован от Thread.
3. Метод run класса Read3Strings должен считывать три строки.
4. Класс Read3Strings должен содержать публичный метод printResult.
5. Метод printResult должен выводить в консоль 3 считанные строки, разделив их пробелами.
6. Метод main должен вызывать методы start у созданных нитей.
7. Метод main должен вызывать методы join у созданных нитей.
8. Вывод программы должен отображать, что потоки считывали строки последовательно, а не параллельно.