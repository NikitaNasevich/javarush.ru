# task01

Bingo!
Исправь строчку 'Object animal = new Pet();' в методе main() так, чтобы программа вывела "Bingo!".


Requirements:
1. Класс Cat должен наследоваться от класса Pet.
2. Класс Tiger должен наследоваться от класса Cat.
3. В переменной Object animal должен храниться объект, который будет одновременно являться и Pet, и Cat, и Tiger.
4. Программа должна выводить на экран: "Bingo!".

# task02

Bingo-2!
Исправь строчку 'Cat cat = new Cat();' так, чтобы программа вывела "Bingo!".


Requirements:
1. Класс Cat должен реализовывать интерфейс CanMove.
2. Класс Cat должен быть родителем (родительским классом) класса TomCat.
3. В переменной cat должен храниться объект, который будет одновременно являться и CanMove, и Cat, и Tomcat.
4. Программа должна выводить на экран: "Bingo!".

# task03

Building и School
В этой задаче тебе нужно:
Правильно расставить наследование между Building (здание) и School (здание школы).
Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
Изменить null на объект класса Building или School.
Сигнатуры методов getSchool() и getBuilding() не меняй.


Requirements:
1. Класс School должен наследоваться от класса Building.
2. Метод getSchool() должен возвращать новую школу (School).
3. Метод getBuilding() должен возвращать новое здание (Building).
4. Класс School должен быть статическим.
5. Класс Building должен быть статическим.

# task04

Коты
Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:
Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
вывести на экран cat.toString().

Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные после ввода пустой строки.
3. Программа должна выводить на экран описание каждого кота (cat.toString).
4. Программа должна создавать объект класса Cat для каждого введенного имени кота (строки, считанной с клавиатуры) c помощью метода getCatByKey.

# task05

Пора покушать
Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
Для этого нужно:
Реализовать интерфейс Selectable в классе Food.
Метод onSelect() должен выводить на экран фразу "The food was selected".
Подумай, какие методы можно вызвать для переменной food, а какие для — selectable.
В методе callFoodMethods вызови методы onSelect, onEat, если это возможно.
В методе callSelectableMethods вызови методы onSelect, onEat, если это возможно.
Не используй явное приведение типов.

Requirements:
1. Интерфейс Selectable должен быть реализован в классе Food.
2. Метод onSelect() в классе Food должен выводить на экран фразу "The food was selected".
3. В методе callFoodMethods должны вызываться методы объекта типа Food.
4. В методе callSelectableMethods должны вызываться методы доступные у любого объекта реализующего интерфейс Selectable.

# task06

Без ошибок
Давай напишем программу, которая создает мышонка.
Для этого инициализируй объект obj таким классом, чтобы метод main() выполнился без ошибок.


Requirements:
1. Класс GrayMouse должен наследоваться от класса Mouse.
2. Класс Jerry должен наследоваться от класса GrayMouse.
3. В переменной obj должен храниться объект, который будет одновременно являться и Mouse, и GrayMouse, и Jerry.
4. Метод main должен вызывать метод printClasses.

# task07

Player and Dancer
Посмотри, что делает эта программа.
Затем измени haveFun так, чтобы он вызывал метод:
play(), если person имеет тип Player.
dance(), если person имеет тип Dancer.

Requirements:
1. Класс Player должен реализовывать интерфейс Person.
2. Класс Dancer должен реализовывать интерфейс Person.
3. Метод haveFun() должен вызывать метод play() у переданного ему объекта, если объект является игроком (Player).
4. Метод haveFun() должен вызывать метод dance() у переданного ему объекта, если объект является танцором (Dancer).
5. Метод main() должен считывать данные с клавиатуры.
6. Метод main() должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".

# task08 

Куриная фабрика
Давай напишем Фабрику (Factory) по производству кур (Hen):
Создай класс Hen.
Сделай его абстрактным.
Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
Создай класс RussianHen, который наследуется от Hen.
Создай класс UkrainianHen, который наследуется от Hen.
Создай класс MoldovanHen, который наследуется от Hen.
Создай класс BelarusianHen, который наследуется от Hen.
В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов напиши свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
Все созданные классы должны быть в отдельных файлах.

Requirements:
1. Класс Hen должен быть абстрактным.
2. Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().
3. В классе Hen должен быть реализован метод String getDescription(), который возвращает строку "Я - курица.".
4. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и быть созданы в отдельных файлах.
5. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth, который должен возвращать количество яиц в месяц от данного типа куриц.
6. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription родительского класса таким образом, чтобы возвращаемая ими строка имела вид: <getDescription() родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
7. Метод getHen должен быть реализован в классе HenFactory и возвращать тип кур для переданной в него страны.

# task09

Мосты
В этой задаче тебе нужно:
Создать интерфейс Bridge с методом int getCarsCount().
Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
Метод getCarsCount() должен возвращать различные значения для различных классов.
В классе Solution создать публичный метод println(Bridge bridge).
В методе println() вывести на консоль значение getCarsCount() для объекта bridge.
Каждый класс и интерфейс должны быть в отдельных файлах.

Requirements:
1. Интерфейс Bridge должен быть создан в отдельном файле.
2. Классы WaterBridge и SuspensionBridge должны быть созданы в отдельных файлах.
3. Классы WaterBridge и SuspensionBridge должны реализовывать интерфейс Bridge.
4. Метод getCarsCount() должен возвращать различные значения типа int для различных классов, но всегда фиксированное (константное) значение для разных объектов одного и того же класса.
5. В классе Solution должен быть реализован публичный(public) метод println c одним параметром типа Bridge.
6. Метод println должен выводить в консоли количество машин (результат работы метода getCarsCount) для переданного ему моста (объекта типа Bridge).
7. В интерфейсе Bridge должен быть определен метод int getCarsCount().

# task10

Дегустация вин
Давай напишем программу, которая поможет нам определить, какое вино пить по какому случаю.
Для этого нужно:
Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно".
Создать класс Wine, наследуемый от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День Рождения".
Создать класс SparklingWine, наследуемый от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
Написать реализацию методов getDeliciousDrink, getWine, getSparklingWine.
Все классы должны находиться в отдельных файлах.

Requirements:
1. Абстрактный класс Drink должен быть создан в отдельном файле.
2. В классе Drink должен быть реализован метод public void taste(), который выводит на экран строку - "Вкусно".
3. Класс Wine должен быть создан в отдельном файле и быть потомком класса Drink.
4. В классе Wine должен быть реализован метод public String getHolidayName(), который возвращает строку - "День Рождения".
5. Класс SparklingWine должен быть создан в отдельном файле и быть потомком класса Wine.
6. В классе SparklingWine должен быть реализован метод public String getHolidayName(), который возвращает строку - "Новый Год".
7. В классе Solution должен быть реализован метод getDeliciousDrink(), который возвращает объект типа Wine.
8. В классе Solution должен быть реализован метод getWine(), который возвращает объект типа Wine.
9. В классе Solution должен быть реализован метод getSparklingWine(), который возвращает объект типа SparklingWine.

# task11

User, Loser, Coder and Proger
Давай напишем программу, которая определит, чем заняться тому или иному человеку.
Для этого нужно:
Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
Для каждой введенной строки нужно:
Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
Передать этот объект в метод doWork.
Написать реализацию метода doWork, который:
Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
Вызывает метод doNothing(), если person имеет тип Loser.
Вызывает метод writeCode(), если person имеет тип Coder.
Вызывает метод enjoy(), если person имеет тип Proger.

Requirements:
1. Метод main должен считывать строки с клавиатуры.
2. Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых (user, loser, coder, proger).
3. Для каждой корректной (user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
4. В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
5. Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
6. Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
7. Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
8. Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.

# task12

Реализовать метод printMainInfo
Напиши реализацию метода printMainInfo, чтобы:
Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
Если в метод передают объект типа Movable, у этого объекта вызывался метод move.

Requirements:
1. Класс Solution должен содержать реализацию метода printMainInfo с одним параметром типа Object.
2. Метод printMainInfo должен быть статическим.
3. Метод printMainInfo должен иметь самый широкий уровень доступа — public.
4. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод draw, если этот объект реализует интерфейс Drawable.
5. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод move, если этот объект реализует интерфейс Movable.

# task13

Computer
Давай соберем компьютер. Вот что тебе нужно сделать:
Создай интерфейс CompItem.
Добавь в него метод String getName().
Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
Создай класс Computer.
В класс Computer добавь приватное поле keyboard типа Keyboard.
В класс Computer добавь приватное поле mouse типа Mouse.
В класс Computer добавь приватное поле monitor типа Monitor.
Создай конструктор с тремя параметрами в классе Computer используя комбинацию клавиш Alt+Insert (для Windows) внутри класса (команда Constructor).
Внутри конструктора инициализируйте все три поля (переменных) класса в соответствии с переданными параметрами.
Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert (для Windows) и выбери команду Getter).
Все созданные классы и интерфейс должны быть в отдельных файлах.

Requirements:
1. Интерфейс CompItem должен существовать в отдельном файле.
2. В интерфейсе CompItem должен быть объявлен метод getName() с типом возвращаемого значения String и без параметров.
3. Классы Keyboard, Monitor и Mouse должны реализовывать интерфейс CompItem, а также существовать в отдельных файлах.
4. Метод getName в классах, реализующих интерфейс CompItem, должен возвращать простое имя класса, например, "Keyboard" для класса Keyboard.
5. Класс Computer должен содержать по одному приватному полю типа Keyboard, Mouse, Monitor, а также существовать в отдельном файле.
6. Конструктор класса Computer должен принимать 3 параметра (keyboard, mouse, monitor) и корректно инициализировать соответствующие поля класса.
7. Для полей keyboard, mouse и monitor Computer должны быть созданы геттеры (getKeyboard, getMouse, getMonitor), которые будут возвращать соответствующие поля класса Computer.

# task14

MovieFactory
У нас есть кинофабрика, но она работает не в полную силу.
Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
Вот что тебе нужно сделать для успешного решения:
Разобраться, что программа умеет делать.
Все классы должны быть внутри класса Solution.
Добавить классы Cartoon, Thriller.
Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
Считать с консоли несколько ключей (строк).
Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".

Создать переменную movie типа Movie и для каждой введенной строки (ключа):
получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
вывести на экран movie.getClass().getSimpleName().

Requirements:
1. Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
2. Метод MovieFactory.getMovie должен возвращать объект типа Cartoon при передаче ему строки "cartoon" в качестве параметра.
3. Метод MovieFactory.getMovie должен возвращать объект типа Thriller при передаче ему строки "thriller" в качестве параметра.
4. Метод main должен считывать строки с клавиатуры.
5. Метод main должен прекращать считывать строки с клавиатуры, если была введена некорректная строка (не "cartoon", не "thriller" или не "soapOpera").
6. Для каждой введенной строки (в том числе для некорректной) необходимо вызвать метод MovieFactory.getMovie().
7. Для всех введенных корректных строк необходимо вывести на экран простые имена (movie.getClass().getSimpleName()) типов объектов, возвращаемых методом MovieFactory.getMovie().

# task15

Клининговый центр
В этой задаче тебе нужно:
Реализовать метод cleanAllApartments().
Пройтись по списку объектов apartments:
для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room();
для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms();
для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().
Использовать instanceof.

Requirements:
1. Метод cleanAllApartments должен принимать список аппартаметов в качестве параметра.
2. В методе cleanAllApartments для всех однокомнатных аппартаментов (OneRoomApt), содержащихся в списке, необходимо вызвать метод clean1Room().
3. В методе cleanAllApartments для всех двухкомнатных аппартаментов (TwoRoomApt), содержащихся в списке, необходимо вызвать метод clean2Rooms().
4. В методе cleanAllApartments для всех трехкомнатных аппартаментов (ThreeRoomApt), содержащихся в списке, необходимо вызвать метод clean3Rooms().
5. Классы OneRoomApt, TwoRoomApt, ThreeRoomApt должны поддерживать (реализовывать) интерфейс Apartment.

# task16

Стой, кто плывет?
Давай напишем программу, которая определит, что умеют делать жители океана:
Подумай, как связаны интерфейсы CanSwim (способен плавать) и CanWalk (способен ходить) с классом SeaCreature (морское животное).
Правильно расставь наследование интерфейсов и класса SeaCreature.
Подумай, как могут быть связаны классы Orca (Косатка), Whale (Кит), RiverOtter (Выдра) с классом SeaCreature.
Расставь правильно наследование между классами Orca, Whale, RiverOtter и классом SeaCreature.
У выбранных классов реализуй метод getCurrentCreature, чтобы он возвращал объект у которого его вызвали.
Подумай, какой класс должен реализовать интерфейс CanWalk и добавить интерфейс этому классу.
Подумай, какое животное еще не умеет плавать и добавить ему интерфейс CanSwim.

Requirements:
1. Косатка (Orca) является морским животным (потомком SeaCreature) и умеет плавать (поддерживает интерфейс CanSwim).
2. Кит (Whale) является морским животным (потомком SeaCreature) и умеет плавать (поддерживает интерфейс CanSwim).
3. Выдра (RiverOtter) умеет ходить (поддерживает интерфейс CanWalk) и плавать (поддерживает интерфейс CanSwim).
4. Выдра (RiverOtter) НЕ является морским животным (потомком SeaCreature).
5. Кит (Whale) и Косатка (Orca) НЕ умеют ходить (не поддерживают интерфейс CanWalk).

# task17

Валюты
Расширь функциональность программы, которая позволит производить манипуляции с валютами.
В существующем абстрактном классе Money создай приватное поле amount типа double.
Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому полю можно было получить доступ извне класса Money.
В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.
В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() который будет возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, который принимает один параметр и вызывает конструктор базового класса (super) с этим параметром.
Заполни список allMoney объектами всех возможных в рамках условия задачи и функциональности программы валют.

Requirements:
1. В классе Money должно содержаться приватное поле amount типа double.
2. В классе Money должен быть реализован публичный конструктор с одним параметром типа double, который устанавливает значение переменной amount согласно переданному параметру.
3. В классе Money должен быть реализован публичный метод getAmount(), который будет возвращать значение поля amount.
4. Классы Hryvnia, Ruble и USD должны быть потомками класса Money и существовать в отдельных файлах.
5. В классах Hryvnia, Ruble и USD должен быть реализован метод getCurrencyName().
6. Метод getCurrencyName() должен возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
7. В классах Hryvnia, Ruble и USD должен быть реализован публичный конструктор с одним параметром типа double, который устанавливает значение поля amount класса Money путем вызова конструктора класса родителя c тем же параметром.

# task18

Исправь четыре ошибки
У нас есть программа, которая должна заполнять список и выводить его определенным образом в консоли.
Сейчас она работает некорректно. Чтобы исправить программу:
Подумай что делает метод main().
Создай в классе Solution статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
Найди блок кода, который заполняет значениями список, и перемести его в метод initList.
Найди блок кода, который в цикле for выводит на экран содержимое списка, и перемести его в метод printListValues.
Найди блок кода, в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран, и перемести его в метод processCastedObjects.
Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
Исправь 2 ошибки в методе processCastedObjects, связанные с приведением типов:
для объекта типа Float нужно вывести "Is float value defined? " + !([Float_object].isNaN()).
для объекта типа Double нужно вывести "Is double value infinite? " + [Double_object].isInfinite().
Метод main() не учавствует в проверке, но для отображения результата можно вызвать все новые методы и передать каждому список list.

Requirements:
1. В классе Solution должны быть реализованы статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
2. Метод initList должен заполнять полученный список произвольными значениями.
3. Метод printListValues должен выводить содержимое полученного списка на экран.
4. Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.

# task19
  
Нашествие исключений
Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Requirements:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.  

# task20
  
  НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.

Requirements:
1. Программа должна считывать с клавиатуры 2 строки.
2. Программа должна выводить данные на экран.
3. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.

# task21
  
Singleton
Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.

Реализуй Singleton pattern:
Создай класс Singleton в отдельном файле.
Добавь в него статический метод getInstance().
При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
Подумай, каким образом можно запретить создание других объектов этого класса.
Сделай все конструкторы в классе Singleton приватными (private).
В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.

Requirements:
1. Класс Singleton должен быть создан в отдельном файле.
2. Класс Singleton не должен позволять создавать объекты своего типа извне класса.
3. Класс Singleton должен содержать приватное статическое поле instance типа Singleton.
4. В классе Singleton должен быть реализован публичный статический метод getInstance() возвращающий значение поля instance.
5. Метод getInstance должен всегда возвращать один и тот же объект.
