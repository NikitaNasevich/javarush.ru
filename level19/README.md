# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level19/task01)

TableAdapter
Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".

Пример, "[Amigo] : DashboardTable".


Requirements:
1. Класс Solution должен содержать public static интерфейс ATable.
2. Класс Solution должен содержать public static интерфейс BTable.
3. Класс Solution должен содержать public static класс TableAdapter.
4. Класс TableAdapter должен реализовывать интерфейс BTable.
5. Класс TableAdapter должен содержать приватное поле aTable типа ATable.
6. Класс TableAdapter должен содержать конструктор с параметром ATable.
7. Класс TableAdapter должен переопределять метод getHeaderText согласно заданию.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level19/task02)

TableAdapter
Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".

Пример, "[Amigo] : DashboardTable".


Requirements:
1. Класс Solution должен содержать public static интерфейс ATable.
2. Класс Solution должен содержать public static интерфейс BTable.
3. Класс Solution должен содержать public static класс TableAdapter.
4. Класс TableAdapter должен реализовывать интерфейс BTable.
5. Класс TableAdapter должен содержать приватное поле aTable типа ATable.
6. Класс TableAdapter должен содержать конструктор с параметром ATable.
7. Класс TableAdapter должен переопределять метод getHeaderText согласно заданию.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level19/task03)

Адаптация нескольких интерфейсов
Давай представим ситуацию, что с одной стороны у нас есть некая база данных, в которой хранятся данные. База данных имеет стандартный набор команд (методов) для предоставления данных, они описаны в интерфейсе IncomeData. Примеры представления данных приведены в комментариях около каждого метода. С другой стороны есть пользователи, которые хотят получать данные из этой базы, но в каком-то другом (конкретном) формате. Запросы от пользователей представлены методами в интерфейсах Customer и Contact. Там же (в комментариях около каждого метода) есть примеры представления информации в том виде, в котором пользователи хотят ее получать из базы данных.

Твоя задача: написать логику класса адаптера IncomeDataAdapter, который будет по запросам методов из интерфейсов Customer и Contact, обращаться в базу (методы интерфейса IncomeData), получать данные, обрабатывать их, при необходимости изменять представление, и возвращать в виде результата.

Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada

При необходимости дополни начало телефонного номера (без кода страны) нулями до 10 цифр (смотри примеры в комментарии к соответствующему методу). Обрати внимание на формат вывода телефона, фамилии и имени человека (смотри примеры в комментарии к соответствующему методу).


Requirements:
1. Класс Solution должен содержать public static поле countries типа Map<String, String>.
2. В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
3. Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
4. Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
5. Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
6. В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact используя подсказки в виде комментариев в интерфейсах.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level19/task04)

И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:

Иванов Иван Иванович 31 12 1950

Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.


Requirements:
1. PersonScanner должен быть интерфейсом.
2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level19/task05)

Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.

Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:

UA Ukraine

RU Russia

CA Canada


Requirements:
1. Класс Solution должен содержать public static поле countries типа Map<String, String>.
2. В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
3. Класс Solution должен содержать интерфейс RowItem.
4. Класс Solution должен содержать интерфейс Contact.
5. Класс Solution должен содержать интерфейс Customer.
6. Класс DataAdapter должен реализовывать интерфейс RowItem.
7. Класс DataAdapter должен содержать два приватных поля: customer типа Customer и contact Contact.
8. Класс DataAdapter должен содержать конструктор с параметрами (Customer customer, Contact contact), который инициализирует поля contact и customer.
9. В классе DataAdapter реализуй методы интерфейса RowItem используя подсказки в виде комментариев в интерфейсах.
