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
