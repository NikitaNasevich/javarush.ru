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
