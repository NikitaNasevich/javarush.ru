# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task01)

Строки нитей или строковые нити? Вот в чем вопрос
1. Метод getPartOfString должен возвращать подстроку между первой и последней табуляцией.
2. На некорректные данные getPartOfString должен бросить исключение:
а) StringForFirstThreadTooShortException, если имя трэда FIRST_THREAD_NAME.
б) StringForSecondThreadTooShortException, если имя трэда SECOND_THREAD_NAME.
в) RuntimeException в других случаях.
3. Реализуй логику трех protected методов в OurUncaughtExceptionHandler используя вызовы соответствующих методов согласно следующим шаблонам:
a) 1# : StringForFirstThreadTooShortException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
б) java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#
в) RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#


Requirements:
1. Метод getPartOfString() должен возвращать подстроку между первой и последней табуляцией строки string переданной ему в качестве первого параметра.
2. В случае некорректных данных метод getPartOfString() должен бросить исключение StringForFirstThreadTooShortException, если имя трэда(threadName) Solution.FIRST_THREAD_NAME.
3. В случае некорректных данных метод getPartOfString() должен бросить исключение StringForSecondThreadTooShortException, если имя трэда(threadName) Solution.SECOND_THREAD_NAME.
4. В случае некорректных данных метод getPartOfString() должен бросить исключение RuntimeException, если имя трэда(threadName) не Solution.FIRST_THREAD_NAME или Solution.SECOND_THREAD_NAME.
5. Метод getFormattedStringForFirstThread() должен возвращать строку сформированную из переданных параметров по шаблону указанному в задании.
6. Метод getFormattedStringForSecondThread() должен возвращать строку сформированную из переданных параметров по шаблону указанному в задании.
7. Метод getFormattedStringForOtherThread() должен возвращать строку сформированную из переданных параметров по шаблону указанному в задании.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task02)

Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
"JavaRush - лучший сервис обучения Java."

Результат:
"- лучший сервис обучения"

Пример:
"Амиго и Диего лучшие друзья!"

Результат:
"и Диего лучшие друзья!"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).


Requirements:
1. Класс TooShortStringException должен быть потомком класса RuntimeException.
2. Метод getPartOfString должен принимать строку в качестве параметра.
3. В случае, если в метод getPartOfString были переданы некорректные данные, должно возникнуть исключение TooShortStringException.
4. Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова, которое следует после 4-го пробела.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task03)

Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.


Requirements:
1. Класс TooShortStringException должен быть потомком класса Exception.
2. Метод getPartOfString должен принимать строку в качестве параметра.
3. В случае, если строка, переданная в метод getPartOfString содержит менее 2 табуляций должно возникнуть исключение TooShortStringException.
4. Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task04)

Форматирование строки
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
Для перевода каретки не используй \n.

Должен быть вывод:

20 / 7 = 2,86

Exp = 3,33e+00


Requirements:
1. Для перевода строки не должно быть использовано выражение \n.
2. Метод getFormattedString должен быть статическим.
3. Вывод на экран должен соответствовать условию задачи.
4. Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task05)

МНЕ нравится курс JavaRush
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
Параметры должны меняться местами.

Должен быть вывод:
МНЕ нравится курс JavaRush


Requirements:
1. Метод getFormattedString должен быть публичным.
2. Метод getFormattedString должен быть статическим.
3. Вывод на экран должен соответствовать условию задачи.
4. Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task06)

Форматирование даты
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.

Должен быть вывод аналогичный следующему:

05:04:18 09:09:09 (число:месяц:год часы:минуты:секунды)


Requirements:
1. Метод getFormattedString должен быть публичным.
2. Метод getFormattedString должен быть статическим.
3. Вывод на экран должен соответствовать условию задачи.
4. Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task07)

Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.

Пример содержимого файла

рот тор торт о

о тот тот тот

Вывод:

рот тор

о о

тот тот


Requirements:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе main должен быть использован StringBuilder.
3. В классе Solution должен содержаться вложенный класс Pair с методами equals, hashCode и toString. Удалять или изменять эти методы нельзя.
4. В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).
5. Список result должен быть заполнен корректными парами согласно условию задачи.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task08)

Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:

{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:

name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Requirements:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task09)

Составить цепочку слов
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Считай, что абсолютно все слова из исходного списка могут (и должны!) быть включены в результат (лишних слов нет).
Метод getLine должен возвращать любой правильный вариант при наличии нескольких таковых (см. пример).
Слова разделять пробелом.
Вывести полученную строку на экран.

Пример тела входного файла:

Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:

Амстердам Мельбурн Нью-Йорк Киев Вена

или

Вена Амстердам Мельбурн Нью-Йорк Киев

или

Мельбурн Нью-Йорк Киев Вена Амстердам

и т.п.


Requirements:
1. Метод main должен считывать имя файла с клавиатуры.
2. В классе Solution не должно быть статических полей.
3. В методе getLine должен быть использован StringBuilder.
4. Метод getLine должен возвращать пустую строку (пустой StringBuilder) в случае если ему не были переданы параметры (слова).
5. Метод getLine не должен изменять переданные ему параметры (слова).
6. Все слова переданные в метод getLine должны быть включены в результирующую строку.
7. Вывод на экран должен соответствовать условию задачи.

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task10)

StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример

getTokens("level22.lesson13.task01", ".")

возвращает массив строк

{"level22", "lesson13", "task01"}


Requirements:
1. Метод getTokens должен использовать StringTokenizer.
2. Метод getTokens должен быть публичным.
3. Метод getTokens должен принимать два параметра типа String.
4. Массив типа String возвращенный методом getTokens должен быть заполнен правильно(согласно условию задачи).

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level22/task11)

Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.


Requirements:
1. Программа НЕ должна считывать данные с клавиатуры.
2. Программа НЕ должна выводить данные на экран.
3. Программа должна записывать данные в файл.
4. Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).
