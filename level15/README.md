# task01

ООП - Расставить интерфейсы
Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
Реализуй их методы.


Requirements:
1. Класс Clothes должен поддерживать интерфейс Movable.
2. Класс Clothes должен поддерживать интерфейс Sellable.
3. Класс Clothes должен поддерживать интерфейс Discountable.
4. В классе Clothes должен быть реализован метод isMovable().
5. В классе Clothes должен быть реализован метод getAllowedAction() без параметров.
6. В классе Clothes должен быть реализован метод getAllowedAction() с одним параметром типа String.

# task02

ООП - Наследование животных
Давай создадим классы животных и определим их размер, унаследовав их от правильных классов.
Для этого:
Создай public static класс Goose (Гусь).
Создай public static класс Dragon (Дракон).
Унаследуй класс Goose от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
Унаследуй класс Dragon от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
В классах Goose и Dragon переопредели метод String getSize(), расширь видимость до максимальной.
В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].

Requirements:
1. Класс Goose должен быть создан внутри класса Solution и быть статическим.
2. Класс Dragon должен быть создан внутри класса Solution и быть статическим.
3. Класс Goose должен быть потомком класса SmallAnimal.
4. Класс Dragon должен быть потомком класса BigAnimal.
5. В классе Goose должен быть переопределен метод getSize, который должен возвращать строку формата "Гусь маленький, " + [getSize родительского класса].
6. В классе Dragon должен быть переопределен метод getSize, который должен возвращать строку формата "Дракон большой, " + [getSize родительского класса].
7. Область видимости переопределенных методов getSize в классах Goose и Dragon нужно расширить до максимальной.

# task03

ООП - машинки
Оцени наши машины и определи их в подходящую категорию — роскошное или дешевое авто — и выведи результат.
Для вывода используй только переменные из класса Constants.
В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
Создай public static класс LuxuriousCar (РоскошнаяМашина).
Создай public static класс CheapCar (ДешеваяМашина).
Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.

Requirements:
1. Класс Solution должен содержать public static класс LuxuriousCar.
2. Класс Solution должен содержать public static класс CheapCar.
3. Класс Ferrari должен быть потомком класса LuxuriousCar.
4. Класс Lanos должен быть потомком класса CheapCar.
5. Метод printlnDesire в классе LuxuriousCar должен выводить на экран фразу "Я хочу ездить на роскошной машине".
6. Метод printlnDesire в классе CheapCar должен выводить на экран фразу "Я хочу ездить на дешевой машине".
7. Метод printlnDesire в классе Ferrari должен выводить на экран фразу "Я хочу ездить на Феррари".
8. Метод printlnDesire в классе Lanos должен выводить на экран фразу "Я хочу ездить на Ланосе".
9. Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире, чем в их классах родителях.

# task04

ООП - книги
Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
Для этого:
Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
Параметр конструктора — название книги (title).
В классе MarkTwainBook реализуй все абстрактные методы.
Для метода getBook измени тип возвращаемого значения на более подходящий.
Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
agathaChristieOutput — для книг Агаты Кристи;
markTwainOutput — для книг Марка Твена.

Requirements:
1. Класс Solution должен содержать public static класс MarkTwainBook.
2. Класс MarkTwainBook должен быть потомком класса Book.
3. В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
4. Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
5. Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.
6. Класс Solution должен содержать public static класс AgathaChristieBook.
7. Класс AgathaChristieBook должен быть потомком класса Book.
8. В классе AgathaChristieBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
9. Конструктор класса AgathaChristieBook должен вызывать конструктор класса предка (Book) с параметром "Agatha Christie".
10. Метод getBook в классе AgathaChristieBook должен иметь тип возвращаемого значения AgathaChristieBook и возвращать текущий объект.
11. Метод getTitle в классах AgathaChristieBook и MarkTwainBook должен возвращать название конкретной книги.
12. Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
13. Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
14. В классе MarkTwainBook должно быть создано поле title типа String (название книги).
15. В классе AgathaChristieBook должно быть создано поле title типа String (название книги).

# task05

ООП - исправь ошибки в наследовании
У каждого человека есть рост и вес. Класс Human реализует соответствующие интерфейсы. Но, похоже, в такой реализации закралась ошибка. Обрати внимание на вывод программы. Исправь ошибки в интерфейсах (подсказка: переименуй методы, согласно требований к задаче) и, соответственно, в остальном коде. На экран должны быть выведены рост и вес человека (любые положительные целые числа).


Requirements:
1. Метод int getValue() интерфейса HasWeight должен быть переименован в getWeight.
2. Метод int getValue() интерфейса HasHeight должен быть переименован в getHeight.
3. В классе Human должны быть переопределены методы getWeight и getHeight. Каждый из них должен возвращать любое целое число больше 0.
4. В классе Human не должно быть метода getValue.
5. В методе main у объекта класса human должны вызываться методы getWeight и getHeight.

# task06

Что-то лишнее
Удали реализации всех лишних методов, чтобы вывод программы выглядел так:
Это double
Это Object
Это double
Это Integer
Это double


Requirements:
1. В классе Solution должен остаться метод print() с одним параметром типа Integer.
2. В классе Solution должен остаться метод print() с одним параметром типа Object.
3. В классе Solution должен остаться метод print() с одним параметром типа double.
4. Вывод на экран должен соответствовать условию.

# task07

ООП - Перегрузка
Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя получилось 10 различных методов printMatrix().


Requirements:
1. В классе Solution должны быть реализованы 10 методов printMatrix() с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.

# task08

ООП - Перегрузка - убираем лишнее
Посмотри на реализации метода print() в коде и определи, какой из них будет вызван.
Удали все лишние реализации метода print().


Requirements:
1. В классе Solution кроме метода main должен остаться только один метод print (с правильным параметром).
2. Метод print() должен быть публичным.
3. Метод print() должен быть статическим.
4. Программа должна выводить на экран строку "Я буду Java прогером!".

# task09

Мужчина или женщина?
Измени метод printName() так, чтобы он выполнялся для man и woman.
Реализация метода printName() должна быть одна.


Requirements:
1. В классе Solution должен быть реализован только один метод printName().
2. Метод printName() должен принимать один параметр типа Human.
3. Класс Man должен быть потомком класса Human.
4. Класс Woman должен быть потомком класса Human.

# task10

Все лишнее - прочь!
Убери в методе main() лишние строки, для которых метод add() не реализован.


Requirements:
1. В классе Solution должно быть реализовано три метода add().
2. В методе main() нужно убрать лишние строки.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.

# task11

Максимально простой код-1
Упрости код: убери все наследования и реализации, которые автоматически добавятся при компиляции.
Взаимосвязь между объектами me и zapp — Has-a: http://ru.wikipedia.org/wiki/Has-a


Requirements:
1. Интерфейс SpecificSerializable должен расширять (extends) интерфейс Serializable.
2. Класс JavaDev должен реализовывать интерфейс SpecificSerializable.
3. В коде не должно быть явного наследования от Object (extends Object).
4. Класс JuniorJavaDev не должен явно наследовать интерфейс SpecificSerializable.

# task12

Максимально простой код-2
Упрости код — удали все конструкторы и вызовы конструкторов суперклассов, которые автоматически добавятся при компиляции.

Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat — Is-a: http://en.wikipedia.org/wiki/Is-a

Requirements:
1. Класс NormalCat должен быть потомком класса NakedCat.
2. Класс SiamCat должен быть потомком класса NormalCat.
3. Упрости код класса NakedCat.
4. Упрости код класса NormalCat.

# task13

Максимально простой код-3
Упрости код:
убери все наследования классов, которые автоматически добавятся при компиляции;
убери все конструкторы, которые создаются и добавляются автоматически.

Requirements:
1. В классе Car не должно быть явно реализованных конструкторов без параметров.
2. В классе Machine не должно быть явно реализованных конструкторов без параметров.
3. Класс Car должен быть потомком класса Machine.
4. В коде не должно быть явного наследования от Object (extends Object).
5. Класс Car не должен явно наследовать интерфейс Runnable.

# task14

Статики-1
В статическом блоке инициализируй labels пятью различными парами ключ-значение.


Requirements:
1. В классе Solution должен быть только один метод — main().
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.

# task15

Статики-2
В этой задаче тебе нужно:
В статическом блоке считать с консоли А и В — две переменные с типом int.
Обработать IOException в блоке catch.
Закрыть поток ввода методом close().

Requirements:
1. Поле A должно быть публичным и статическим.
2. Поле B должно быть публичным и статическим.
3. Программа должна считывать данные с клавиатуры в статическом блоке.
4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.

# task16

Значения по умолчанию
В этой задаче тебе нужно:
Создать 7 нестатических public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()

Requirements:
1. В классе Solution должно быть объявлено поле intVar типа int.
2. В классе Solution должно быть объявлено поле doubleVar типа double.
3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
5. В классе Solution должно быть объявлено поле ObjectVar типа Object.
6. В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
7. В классе Solution должно быть объявлено поле StringVar типа String.
8. Метод main должен выводить значения полей на экран (каждое — с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.

# task17

Статики и исключения
В статическом блоке класса Solution напиши код, выполнение которого приведет к возникновению исключения.
В результате класс не загрузится, и вместо значения переменной B появится сообщение об ошибке:
Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement


Requirements:
1. В классе Solution в статическом блоке должно возникать исключение (Exception).
2. Программа не должна ничего выводить на экран, кроме автоматического сообщения о возникшем исключении.
3. Программа не должна считывать данные с клавиатуры.
4. Класс Solution должен быть public.

# task18

Статики и котики
В этой задаче тебе нужно:
Создать класс Cat с публичным полем name типа String в классе Solution.
В статическом блоке создать объект типа Cat и инициализировать им переменную cat (не забудь инициализировать поле name).
В статическом блоке вывести имя созданного кота на экран.
Примечание: не создавай конструкторы с параметрами в классе Cat.

Requirements:
1. Класс Cat должен быть создан внутри класса Solution и быть публичным и статическим.
2. В классе Cat должно быть публичное поле name типа String.
3. Переменная cat должна быть инициализирована в статическом блоке класса Solution.
4. В статическом блоке на экран должно быть выведено имя созданного кота.
5. Класс Cat не должен содержать конструкторы с параметрами.  

# task19
  
Разные методы для разных типов
В этой задаче тебе нужно:
Считывать с консоли данные, пока не будет введено слово "exit".
Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
содержит точку '.', вызвать метод print() для Double;
больше нуля, но меньше 128, вызвать метод print() для short;
меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
иначе — вызвать метод print() для String.

Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того, как введена строка "exit".
3. Если введенная строка содержит точку("."), и ее можно корректно преобразовать в число типа Double - должен быть вызван метод print(Double value).
4. Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0, но меньше 128 - должен быть вызван метод print(short value).
5. Если введенная строка может быть корректно преобразована в число типа Integer и полученное число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
6. Во всех остальных случаях должен быть вызван метод print(String value).

# task20

Тренировка мозга
Найди логическую ошибку: утка (Duck) должна корректно реализовывать интерфейс CanMove.
Исправь ошибку. Результат вывода в консоль должен быть таким:
Flying
Moving

# task21

ООП. Перегрузка
Для решения этой задачи:
Два раза перегрузи в классе Tree метод info(Object s) так, чтобы получилось три метода: info(Object s), info(Number s), info(String s).
Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
Например, для метода info(Number s) результат может быть таким: "Дерево № 123 , метод Number, параметр Short".

Requirements:
1. В классе Tree должен быть реализован метод info(Object s).
2. В классе Tree должен быть реализован метод info(Number s).
3. В классе Tree должен быть реализован метод info(String s).
4. Метод info(Number s) должен выводить на экран строку, аналогичную строке из метода info(Object s), заменив лишь фразу("метод Object" на "метод Number").
5. Метод info(String s) должен выводить на экран строку, аналогичную строке из метода info(Object s), заменив лишь фразу("метод Object" на "метод String").  

Requirements:
1. Результат вывода на экран должен соответствовать условию.
2. В классе Duck должен быть реализован метод doAnotherAction().
3. Метод doAnotherAction() в классе Duck должен выводить на экран строку "Moving".
4. Метод move() в классе Util должен вызывать метод doAnotherAction() у переданного ему объекта.
5. Класс Duck должен реализовывать интерфейс CanMove.
6. Класс Duck должен реализовывать интерфейс CanFly.
 
# task22
  
Закрепляем паттерн Singleton
Для решения этой задачи тебе нужно:
Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
Реализовать интерфейс Planet в классах Sun, Moon, Earth.
В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
для этого считай с консоли один параметр типа String.
если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.

Requirements:
1. Класс Sun не должен позволять создавать объекты своего типа за пределами класса.
2. Класс Sun должен содержать приватное статическое поле instance типа Sun.
3. В классе Sun должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
4. Метод getInstance() в классе Sun должен всегда возвращать один и тот же объект.
5. Поле instance класса Sun должно быть инициализировано только после первого обращения к методу getInstance().
6. Класс Moon не должен позволять создавать объекты своего типа за пределами класса.
7. Класс Moon должен содержать приватное статическое поле instance типа Moon.
8. В классе Moon должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
9. Метод getInstance() в классе Moon должен всегда возвращать один и тот же объект.
10. Поле instance класса Moon должно быть инициализировано только после первого обращения к методу getInstance().
11. Класс Earth не должен позволять создавать объекты своего типа за пределами класса.
12. Класс Earth должен содержать приватное статическое поле instance типа Earth.
13. В классе Earth должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
14. Метод getInstance в классе Earth должен всегда возвращать один и тот же объект.
15. Поле instance класса Earth должно быть инициализировано только после первого обращения к методу getInstance().
16. Метод readKeyFromConsoleAndInitPlanet() должен быть вызван в статическом блоке класса Solution.
17. Метод readKeyFromConsoleAndInitPlanet() должен считывать одну строку с клавиатуры.
18. Метод readKeyFromConsoleAndInitPlanet() должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
19. Классы Sun, Moon и Earth должны быть созданы в отдельных файлах.
  
# task23
  
Перегрузка конструкторов
Чтобы решить эту задачу:
Создай 4 конструктора с разными модификаторами доступа в классе Solution.
В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).

Requirements:
1. В классе SubSolution должно содержаться 3 различных конструктора.
2. В классе Solution должно содержаться 4 различных конструктора.
3. В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
4. В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа, кроме private.
5. Класс Solution должен быть родителем класса SubSolution.

# task24
  
Порядок загрузки переменных
Разберись, что и в какой последовательности инициализируется в этой программе, а затем:
Поставь брейкпойнты и используй дебаггер.
Исправь порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name

Requirements:
1. Программа должна выводить данные на экран.
2. Вывод на экран должен соответствовать условию задачи.
3. Результатом работы статического инициализатора класса Solution должен быть вывод на экран строк "static void init()" и "Static block".
4. Программа не должна считывать данные с клавиатуры. 

# task25
  
Файл в статическом блоке
Для решения этой задачи:
Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Requirements:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
 
# task26
  
Дебаг, дебаг, и еще раз дебаг
Программа выводит 0 9, а должна — 6 9. Найди одну(!) ошибку и исправь ее.
Используй дебаг. Для этого поставь breakpoint-ы (Ctrl+F8), потом зайди в меню Run -> Debug.
F9 - выполнение кода до следующего breakpoint-а.
F8 - переход к следующей строке кода.


Requirements:
1. Программа должна выводить данные на экран.
2. Вывод на экран должен соответствовать условию задачи.
3. У метода initialize() в классе A должен быть правильный модификатор доступа.
4. Программа не должна считывать данные с клавиатуры.
  
# task27
  
Парсер реквестов
Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (не забывай о том, что число может быть дробным);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14


Requirements:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно корректно преобразовать в число типа double.
5. Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя корректно преобразовать в число типа double.

# task28
  
ООП. Hryvnia — тоже деньги
Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.


Requirements:
1. Класс Hryvnia должен быть потомком класса Money.
2. В классе Hryvnia должен быть реализован метод getAmount.
3. Метод getAmount в классе Hryvnia должен возвращать значение поля amount.
4. При выполнении программы не должны возникать исключения или ошибки.
  
# task29
  
 Осваивание статического блока
В этой задаче тебе нужно:
Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
В статическом методе reset() класса Solution:
считать с консоли параметр типа String;
если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
если параметр равен "plane", считать второй параметр типа int (количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
В статическом блоке инициализировать CanFly result, вызвав метод reset().
Закрыть поток ввода методом close().

Requirements:
1. Класс Plane должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
2. Класс Helicopter должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
3. Класс Plane должен иметь конструктор с параметром int.
4. В классе Solution должен быть реализован метод public static void reset().
5. Метод reset() должен считывать строки с клавиатуры.
6. Если введенная строка равна "helicopter", в переменную result должен быть сохранен объект типа Helicopter.
7. Если введенная строка равна "plane", в переменную result должен быть сохранен объект типа Plane.
8. Поле result класса Solution должно быть инициализировано в статическом блоке путем вызова метода reset().

# task30
  
Template pattern
В этой задаче тебе нужно:
В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
void getRightCup() - выбрать подходящую чашку;
void putIngredient() - положить ингредиенты;
void pour() - залить жидкость.
В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкость.
В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
Распределить следующие фразы между всеми методами в классах LatteMaker и TeaMaker:
"Заливаем кипятком"
"Берем чашку для латте"
"Насыпаем чай"
"Берем чашку для чая"
"Заливаем кофе"
"Делаем молоко с пенкой"
Каждый метод должен выводить в консоль свою фразу, не пересекаясь с другими методами.

Requirements:
1. Класс DrinkMaker должен быть создан в отдельном файле и быть абстрактным.
2. В классе DrinkMaker должны содержаться объявления трех абстрактных методов getRightCup(), putIngredient() и pour().
3. В классе DrinkMaker должен быть реализован метод makeDrink(), который будет вызывать абстрактные методы этого класса в последовательности, заданной условием.
4. Класс LatteMaker должен быть создан в отдельном файле и быть потомком класса DrinkMaker.
5. Класс TeaMaker должен быть создан в отдельном файле и быть потомком класса DrinkMaker.
6. Метод getRightCup() в классе LatteMaker должен выводить на экран фразу "Берем чашку для латте".
7. Метод putIngredient() в классе LatteMaker должен выводить на экран фразу "Делаем молоко с пенкой".
8. Метод pour() в классе LatteMaker должен выводить на экран фразу "Заливаем кофе".
9. Метод getRightCup() в классе TeaMaker должен выводить на экран фразу "Берем чашку для чая".
10. Метод putIngredient() в классе TeaMaker должен выводить на экран фразу "Насыпаем чай".
11. Метод pour() в классе TeaMaker должен выводить на экран фразу "Заливаем кипятком".

  # task31
  
  Факториал
Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.

Пример вычислений: 4! = factorial(4) = 1*2*3*4
Пример вывода: 24

Для этого:
Введи с консоли число меньше либо равно 150.
Реализуй функцию factorial.
Если введенное число меньше 0, выведи 0.
0! = 1

Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить на экран факториал введенного числа.
3. Метод factorial должен возвращать строковое представление факториала числа, переданного ему в качестве параметра.
4. Метод factorial должен принимать один параметр типа int.
