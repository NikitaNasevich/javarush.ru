Обеспечение отсутствия прерывания важной операции
Разберись, что делает программа.
Запусти 10 раз и посмотри в какие моменты происходит "проверка".
Попробуй добиться выполнения "проверки" после каждого изменения баланса, для этого в moveMoney() вызови Thread.yield().


Requirements:
1. Класс Solution должен содержать класс Account.
2. Метод moveMoney() должен перечислять сумму amount с счета from на счет to.
3. Запусти программу 10 раз и обрати внимание когда происходит проверка.
4. В методе moveMoney() добавь вызовы Thread.yield().
5. Снова запусти программу 10 раз, и убедись, что Thread.yield() никак не повлиял на результат работы.
