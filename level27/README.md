# [task01](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task01)

Избавляемся от меток
Избавьтесь от меток в методе isSubstringPresent сохранив логику.
Метод возвращает true, в случае если строка substring является подстрокой строки string, иначе false.
В коде должны отсутствовать операторы break и continue.


Requirements:
1. Метод isSubstringPresent должен возвращать true, если строка substring является подстрокой строки string.
2. Метод isSubstringPresent должен возвращать false, если строка substring НЕ является подстрокой строки string.
3. В методе isSubstringPresent должны отсутствовать операторы break.
4. В методе isSubstringPresent должны отсутствовать операторы continue.

# [task02](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task02)

Нужный оператор
Вставьте в код единственную строчку - оператор (не break), чтобы на экран выводился треугольник из букв S.


Requirements:
1. Программа должна выводить на экран треугольник из букв S.
2. В программе должен быть использован оператор continue.
3. В программе не должен быть использован оператор break.
4. Программа не должна считывать данные с клавиатуры.

# [task03](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task03) 

Создаем deadlock
Расставь модификаторы так, чтобы при работе с этим кодом появился deadlock.
Метод main порождает deadlock, поэтому не участвует в тестировании.


Requirements:
1. Класс Solution.Friend НЕ должен быть приватным.
2. Класс Solution.Friend должен быть статическим.
3. Метод bow должен быть объявлен с модификатором synchronized.
4. Метод bowBack должен быть объявлен с модификатором synchronized.

# [task04](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task04)

Модификаторы и deadlock
Расставь модификаторы так, чтобы при работе с этим кодом появился deadlock.
Метод main порождает deadlock, поэтому не участвует в тестировании.


Requirements:
1. Поле field должно быть приватным.
2. Метод getField НЕ должен быть приватным.
3. Метод sout должен быть объявлен с модификатором synchronized.
4. Метод sout2 должен быть объявлен с модификатором synchronized.

# [task05](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task05)

Второй вариант deadlock
В методе secondMethod расставь synchronized блоки так, чтобы при использовании класса Solution нитями образовывался deadlock.


Requirements:
1. В методе secondMethod должен присутствовать синхронизированный блок по объекту lock.
2. В методе secondMethod должен присутствовать вложенный синхронизированный блок по объекту this.
3. Поле lock должно быть приватным.
4. Метод secondMethod не должен быть объявлен с модификатором synchronized.

# [task06](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task06)

Убираем deadlock
Используя стратегию избегания deadlock-а сделай так, чтобы он не возник.
Метод main не участвует в тестировании.
Действуй аналогично примеру из лекций.
Изменения вноси только в safeMethod.


Requirements:
1. Метод safeMethod не должен вызывать deadlock при использовании из разных потоков.
2. В методе safeMethod должен содержаться вызов метода unsafeMethod, с теми же аргументами.
3. В методе safeMethod должен содержаться вызов метода longTimeMethod.
4. В методе safeMethod должно содержаться два блока synchronized.

# [task07](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task07)

Определяем порядок захвата монитора
Реализуй логику метода isLockOrderNormal, который должен определять:
соответствует ли порядок synchronized блоков в методе someMethodWithSynchronizedBlocks - порядку передаваемых в него аргументов.
В случае, если сначала происходит синхронизация по o1, а потом по o2, метод должен вернуть true.
Если наоборот - false.


Requirements:
1. Метод isLockOrderNormal должен возвращать true в случае, если синхронизация в методе someMethodWithSynchronizedBlocks происходит сначала по объекту o1, а потом по o2.
2. Метод isLockOrderNormal должен возвращать false в случае, если синхронизация в методе someMethodWithSynchronizedBlocks происходит сначала по объекту o2, а потом по o1.
3. Метод isLockOrderNormal НЕ должен быть приватным.
4. Класс Solution НЕ должен быть объявлен с модификатором final.

# [task08](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task08)

Убираем deadLock используя открытые вызовы
Синхронизированные методы, которые вызывают внутри себя синхронизированные методы других классов, приводят к dead-lock-у.
1. Перенесите синхронизацию с метода в синхронизированный блок, куда поместите лишь необходимые части кода.
2. Уберите избыточную синхронизацию методов.
3. В стеке вызова методов не должно быть перекрестной синхронизации, т.е. такого synchronizedMethodAClass().synchronizedMethodBClass().synchronizedMethodAClass()

Этот способ избавления от дэдлока называется "открытые вызовы", о нем читайте в дополнительном материале к лекции.
Метод main не участвует в тестировании.


Requirements:
1. Должна быть обеспечена возможность корректного взаимодействия объектов типа Apartment и RealEstate без возникновения взаимных блокировок.
2. Метод up класса RealEstate должен быть объявлен без модификатора synchronized.
3. Метод revalidate класса RealEstate должен быть объявлен без модификатора synchronized.
4. Метод revalidate класса Apartment должен быть объявлен без модификатора synchronized.
5. Метод revalidate класса RealEstate должен содержать один synchronized блок.
6. В synchronized блоке метода revalidate класса RealEstate должен содержаться вызов метода revalidate на объекте apartment с параметром randomValue.

# [task09](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task09)

Producer–consumer
В классе TransferObject расставь вызовы методов wait/notify/notifyAll, чтобы обеспечить последовательное создание и получение объекта.
В методах run классов ConsumerTask и ProducerTask создай необходимые synchronized блоки.

Ожидаемый вывод:

...

Put: M

Got: M

Put: N

Got: N

Put: K

Got: K

...

где M, N, K - числа

Метод main не участвует в тестировании

P.S. Всегда старайся использовать concurrent коллекции вместо ручной реализации wait/notify/notifyAll.
Задачи подобные этой позволяют лучше понять основы работы многопоточных приложений.


Requirements:
1. В классе TransferObject публичный метод get() с типом возвращаемого значения int должен быть синхронизирован.
2. В классе TransferObject публичный метод put(int) с типом возвращаемого значения void должен быть синхронизирован.
3. Метод get класса TransferObject должен ждать появления value, и возвращать его после того, как оно появится.
4. Метод put класса TransferObject должен ждать пока value заберут и обновлять его значение после того, как оно пропадет.
5. Метод get класса TransferObject должен устанавливать флаг isValuePresent в false и уведомлять другие нити ожидающие освобождения монитора перед возвратом значение поля value.
6. Метод put класса TransferObject должен устанавливать флаг isValuePresent в true и уведомлять другие нити ожидающие освобождения монитора после обновления значение поля value.

# [task10](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task10)

Расставь wait-notify

Расставь wait-notify.

Пример вывода:

Thread-0 MailServer received: [Person [Thread-1] wrote an email 'AAA'] in 1001 ms after start


Requirements:
1. Объекты класса MailServer должны работать корректно в многопоточном окружении.
2. Объекты класса Person должны работать корректно в многопоточном окружении.
3. В методе run класса MailServer должен присутствовать synchronized блок, монитор - mail.
4. В методе run класса Person должен присутствовать synchronized блок, монитор - mail.

# [task11](https://github.com/NikitaNasevich/javarush.ru/tree/main/level27/task11)

CountDownLatch
Дана стандартная реализация методологии wait-notify.
Почитай про CountDownLatch и перепиши тело метода someMethod используя поле latch.
Весь лишний код удали из класса.


Requirements:
1. Из класса Solution должно быть удалено поле lock.
2. Из метода someMethod должен быть удален synchronized блок.
3. В методе someMethod должен быть вызван метод await без параметров у объекта сохраненного в поле latch.
4. В методе someMethod должен быть вызван метод retrieveValue.
5. В методе someMethod должен быть вызван метод countDown у объекта сохраненного в поле latch.
