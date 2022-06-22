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
