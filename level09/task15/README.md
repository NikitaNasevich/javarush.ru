Перехват выборочных исключений
1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
2. Метод handleExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его (вызвать метод BEAN.log)
3. Добавь в объявление метода handleExceptions класс исключения, которое ты пробрасываешь в п.2.1.
4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch

Подсказка:
Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
catch (MyException e) {
 throw e;
}


Requirements:
1. Метод handleExceptions должен вызывать метод BEAN.methodThrowExceptions.
2. Метод handleExceptions должен логировать исключение FileSystemException (вызвать метод BEAN.log), а затем пробросить его дальше.
3. Метод handleExceptions должен только логировать (вызвать метод BEAN.log) исключение CharConversionException.
4. Метод handleExceptions должен только логировать любое исключение IOException.
5. Добавь в объявление метода handleExceptions класс исключения FileSystemException.
6. Метод main должен использовать try..catch.
7. Метод main должен логировать исключения, которые кидает метод handleExceptions.
