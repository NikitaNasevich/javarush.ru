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
