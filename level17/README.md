# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task01)

Заметки
Асинхронность выполнения нитей.
1. Класс Note будет использоваться нитями.
2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
2.1. Используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
"Thread-0-Note4"
2.2. Заснет на 1 миллисекунду
2.3. Используя метод removeNote удалит заметку
2.4. В качестве параметра в removeNote передай имя нити - метод getName()


Requirements:
1. Класс Solution должен содержать public static класс NoteThread.
2. Класс NoteThread должен быть нитью.
3. В методе run класса NoteThread должен быть цикл.
4. Метод run класса NoteThread должен 1000 раз вызывать метод addNote c параметром (getName() + "-Note" + index).
5. Метод run класса NoteThread должен 1000 раз вызывать Thread.sleep() c параметром (1).
6. Метод run класса NoteThread должен 1000 раз вызывать метод removeNote c параметром (getName()).

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task02)

Вместе быстрее? Ща проверим :)
1. Разберись, что и как работает.
2. Создай public static нить SortThread, которая в методе run отсортирует статический массив testArray используя метод sort.


Requirements:
1. Класс Solution должен содержать public static класс SortThread.
2. Класс SortThread должен быть нитью.
3. В методе run класса SortThread должен вызывать метод sort() с параметром testArray.
4. Программа должна выводить текст на экран.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task03)

Синхронизированные заметки
1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, не this
2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized


Requirements:
1. Метод addNote() должен добавлять записки в список notes.
2. Метод removeNote() должен удалять записку из списка notes.
3. В методе addNote() должен находиться synchronized блок.
4. В методе removeNote() должен находиться synchronized блок.
5. Synchronized блок в методе addNote() должен блокировать мьютекс notes.
6. Synchronized блок в методе removeNote() должен блокировать мьютекс notes.
7. В synchronized блоке метода addNote() должен находиться вызов метода add у notes.
8. В synchronized блоке метода removeNote() должен находиться вызов метода remove у notes.
9. Все команды вывода на экран не должны находиться в блоке synchronized.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task04)

Синхронизированные заметки 2
Класс Note будет использоваться нитями. Поэтому сделай так, чтобы вcе методы были синхронизированы.


Requirements:
1. Метод addNote() должен добавлять записки в список notes.
2. Метод removeNote() должен удалять записку из списка notes.
3. Метод addNote() должен быть синхронизирован.
4. Метод removeNote() должен быть синхронизирован.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task05)

Сад-огород
1. Создай метод public void addFruit(int index, String fruit) - который добавляет параметр fruit в лист fruits на позицию index.
2. Создай метод public void removeFruit(int index) - который удаляет из fruits элемент с индексом index.
3. Создай метод public void addVegetable(int index, String vegetable) - который добавляет параметр vegetable в лист vegetables на позицию index.
4. Создай метод public void removeVegetable(int index) - который удаляет из vegetables элемент с индексом index.
5. Класс Garden будет использоваться нитями. Поэтому сделай так, чтобы все методы блокировали мьютекс this.
6. Реализуй это минимальным количеством кода.


Requirements:
1. Класс Garden должен содержать метод public void addFruit(int index, String fruit).
2. Класс Garden должен содержать метод public void removeFruit(int index).
3. Класс Garden должен содержать метод public void addVegetable(int index, String vegetable).
4. Класс Garden должен содержать метод public void removeVegetable(int index).
5. Метод addFruit(int index, String fruit) должен добавлять параметр fruit в лист fruits на позицию index.
6. Метод removeFruit(int index) должен удалять из fruits элемент с индексом index.
7. Метод addVegetable(int index, String vegetable) должен добавлять параметр vegetable в лист vegetables на позицию index.
8. Метод removeVegetable(int index) должен удалять из vegetables элемент с индексом index.
9. Все методы класса Garden должны блокировать мьютекс this (быть синхронизированы).

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task06)

Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке.
Внутри класса OurPresident в статическом блоке создай синхронизированный блок.
Внутри синхронизированного блока инициализируй president.


Requirements:
1. Класс OurPresident должен содержать приватное статическое поле OurPresident president.
2. Класс OurPresident должен содержать публичный статический метод OurPresident getOurPresident().
3. Класс OurPresident должен содержать приватный конструктор.
4. Класс OurPresident должен содержать статический блок.
5. Внутри статического блока класса OurPresident должен быть синхронизированный блок.
6. Внутри синхронизированного блока должно быть проинициализировано поле president.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task07)

МВФ
Singleton паттерн - синхронизация в методе.
Класс IMF - это Международный Валютный Фонд.
Внутри метода getFund создай синхронизированный блок.
Внутри синхронизированного блока инициализируй поле imf так, чтобы метод getFund всегда возвращал один и тот же объект.


Requirements:
1. Класс IMF должен содержать приватное статическое поле IMF imf.
2. Класс IMF должен содержать приватный конструктор.
3. Класс IMF должен содержать публичный статический метод IMF getFund().
4. Метод getFund() должен содержать синхронизированный блок.
5. Внутри синхронизированного блока должно быть проинициализировано поле imf.
6. Метод getFund() должен всегда возвращать один и тот же объект.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task08)

Заметки для всех
Класс Note будет использоваться нитями.
Поэтому сделай так, чтобы лист notes находился в общей памяти, Т.е не будет кэшироваться потоками в свою локальную область памяти.


Requirements:
1. Класс Note должен содержать метод addNote(int index, String note).
2. Класс Note должен содержать метод removeNote(int index).
3. Класс Note должен содержать публичное поле List<String> notes.
4. Поле List<String> notes не должно находится в локальном кэше.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task09)
  
Предложения
Не используя synchronized сделай так, чтобы количество сделанных и принятых предложений было одинаковым.


Requirements:
1. Класс Solution должен содержать нить MakeProposal.
2. Класс Solution должен содержать нить AcceptProposal.
3. Класс Solution должен содержать публичную статическую переменную int proposal.
4. Программа не должна содержать synchronized методов или synchronized блоков.
5. Переменная int proposal не должна находится в локальном кэше.

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task10)
  
CRUD
CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:

  -c name sex bd

  -r id

  -u id name sex bd

  -d id

Значения параметров:

  name - имя, String

  sex - пол, "м" или "ж", одна буква

  bd - дата рождения в следующем формате 15/04/1990

  -c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран

  -r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

  -u - обновляет данные человека с данным id

  -d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -r:
Миронов м 15-Apr-1990

Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
Например, при запуске программы c параметрами:
-c name sex bd
получим в методе main
args[0] = "-c"
args[1] = "name"
args[2] = "sex"
args[3] = "bd"
Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments в меню Run -> Edit Configurations.


Requirements:
1. Класс Solution должен содержать public static поле allPeople типа List<Person>.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
4. При запуске программы с параметром -r программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
5. При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
6. При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.

  
# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task11)
  
CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion.

Программа запускается с одним из следующих наборов параметров:

  -c name1 sex1 bd1 name2 sex2 bd2 ...

  -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...

  -d id1 id2 id3 id4 ...

  -i id1 id2 id3 id4 ...

Значения параметров:

  name - имя, String

  sex - пол, "м" или "ж", одна буква

  bd - дата рождения в следующем формате 15/04/1990

  -с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке

  -u - обновляет соответствующие данные людей с заданными id

  -d - производит логическое удаление человека с id, заменяет все его данные на null

  -i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке.
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople.
Порядок вывода данных соответствует вводу данных.
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997


Requirements:
1. Класс Solution должен содержать public static volatile поле allPeople типа List<Person>.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople, и выводить id каждого (index) на экран.
4. При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
5. При параметре -d программа должна логически удалять людей с заданными id в списке allPeople.
6. При параметре -i программа должна выводить на экран данные о всех людях с заданными id по формату указанному в задании.
7. Метод main класса Solution должен содержать оператор switch по значению args[0].
8. Каждый case оператора switch должен иметь блок синхронизации по allPeople.

  
# [task12](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task12)
  
Ресторан
1.Разберись, что делает программа. Официант почему-то не относит приготовленные блюда назад к столам :(

2.Исправь ошибку.

Подсказка: это одна строчка


Requirements:
1. Класс Restaurant должен содержать список поваров и официантов (public static поле threads типа List<Thread>).
2. Класс Manager должен содержать очередь с заказами (private final поле orderQueue типа Queue<Order>).
3. Класс Manager должен содержать очередь с готовыми блюдами (private final поле dishesQueue типа Queue<Dishes>).
4. Класс Manager должен реализовывать паттерн Singleton.
5. Класс Waiter должен реализовывать интерфейс Runnable.
6. Класс Cook должен реализовывать интерфейс Runnable.
7. Если нет готовых блюд в очереди, нить класса Waiter должна получать заказ от столика и добавлять его в очередь заказов.
8. Если есть готовые блюда в очереди, нить класса Waiter должна брать блюдо из очереди и относить заказ для столика.
9. Если нет заказов в очереди с заказами, нить класса Cook должна отдыхать (повар отдыхает).
10. Если есть заказы в очереди с заказами, нить класса Cook должна готовить блюдо и добавлять его в очередь с готовыми блюдами.

  
# [task13](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task13)
  
Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйся полем original.
4. Список будет использоваться нитями, поэтому позаботься, чтобы все методы были синхронизированы.


Requirements:
1. Класс Solution должен реализовывать интерфейс List<Long>.
2. Класс Solution должен содержать private поле original типа ArrayList<Long>.
3. Все переопределенные в классе Solution методы интерфейса List должны вызывать соответствующие методы объекта original.
4. Все методы класса Solution, кроме метода main, должны быть синхронизированы.

  
# [task14](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task14)
  
Comparable
Реализуй интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботься, чтобы все методы были синхронизированы.
Реализуй метод compareTo так, чтобы при сравнении двух пляжей он выдавал:
– положительное число, если первый пляж лучше;
– отрицательное число, если второй пляж лучше;
– ноль, если пляжи одинаковые.
Сравни каждый критерий по отдельности, чтобы победителем был пляж с лучшими показателями по большинству критериев. Учти при сравнении, чем меньше расстояние к пляжу (distance), тем пляж лучше.


Requirements:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable<Beach>.
3. Метод compareTo класса Beach должен учитывать качество пляжа (quality) и дистанцию (distance).
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.

  
# [task15](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task15)
  
Аптека
Реализуй интерфейс Runnable в классах Apteka и Person.
Все нити должны работать пока не isStopped.
Логика для Apteka: drugsController должен сделать продажу (вызвать метод void sell(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс.
Логика для Person: drugsController должен сделать покупку (вызвать метод void buy(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс.
Расставь synchronized там, где это необходимо.


Requirements:
1. Класс Solution должен содержать public static поле drugsController типа DrugsController.
2. Класс Solution должен содержать public static поле isStopped типа boolean.
3. Класс Solution должен содержать private static void метод waitAMoment(), который должен ждать 100 мс.
4. Класс Apteka должен реализовывать интерфейс Runnable.
5. Нить Apteka должна работать пока isStopped = false.
6. Нить Apteka должна использовать drugsController для продажи случайного лекарства (getRandomDrug) в количестве (getRandomCount).
7. Нить Apteka должна ждать 300мс между продажами, используя метод waitAMoment().
8. Класс Person должен реализовывать интерфейс Runnable.
9. Нить Person должна работать пока isStopped = false.
10. Нить Person должна использовать drugsController для покупки случайного лекарства (getRandomDrug) в количестве (getRandomCount).
11. Нить Person должна ждать 100мс между покупками, используя метод waitAMoment().
12. Методы класса DrugsController должны быть synchronized.

  
# [task16](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task16)
  
Синхронизированные методы
Установить модификатор synchronized только тем методам, которым необходимо.
Объект класса Solution будет использоваться нитями.


Requirements:
1. В method0, если необходимо, используй synchronized.
2. В method1, если необходимо, используй synchronized.
3. В method2, если необходимо, используй synchronized.
4. В method3, если необходимо, используй synchronized.
5. В method4, если необходимо, используй synchronized.
6. В method5, если необходимо, используй synchronized.
7. В method6, если необходимо, используй synchronized.
8. В method7, если необходимо, используй synchronized.

  
# [task17](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task17)
  
Лишняя синхронизация
Несколько раз запусти программу и каждый раз обрати внимание на вывод - информация по каждому человеку отображается одним блоком, без перемешивания. Так как synchronized существенно замедляет программу (на нашей маленькой программе это, скорее всего, заметно не будет), то попробуй как будет работать программа без synchronized - удали все synchronized и посмотри на вывод.
Твоя задача: удалить лишние synchronized, но так, чтобы вывод информации по каждому человеку отображался одним блоком.


Requirements:
1. В программе должны быть удалены synchronized согласно условию.
2. Вывод информации по каждому человеку не должен перемешиваться с выводом информации по другим людям.

  
# [task18](https://github.com/NikitaNasevich/javarush.ru/tree/main/level17/task18)
  
Глажка
И снова быт...
Поставьте один synchronized, чтобы diana и igor гладили по очереди, ведь утюг всего один!

Подсказка:
использовать блокировку на уровне класса.


Requirements:
1. Класс Solution должен содержать public static класс Clothes.
2. Класс Solution должен содержать public static класс Iron.
3. Класс Solution должен содержать public static класс Person.
4. Класс Person должен быть нитью.
5. В методе run() класса Person должен быть synchronized блок.
6. Synchronized блок должен использовать блокировку на уровне класса.
