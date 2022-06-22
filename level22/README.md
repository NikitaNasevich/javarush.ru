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
