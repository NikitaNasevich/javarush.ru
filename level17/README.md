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
