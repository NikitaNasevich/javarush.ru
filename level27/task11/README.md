CountDownLatch Дана стандартная реализация методологии wait-notify. Почитай про CountDownLatch и перепиши тело метода someMethod используя поле latch. Весь лишний код удали из класса.

Requirements:

Из класса Solution должно быть удалено поле lock.
Из метода someMethod должен быть удален synchronized блок.
В методе someMethod должен быть вызван метод await без параметров у объекта сохраненного в поле latch.
В методе someMethod должен быть вызван метод retrieveValue.
В методе someMethod должен быть вызван метод countDown у объекта сохраненного в поле latch.
