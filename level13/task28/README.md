Битва роботов
Для начала разберись в том, что делает код: это будет непросто.
Затем измени код согласно новой архитектуре и добавь новую логику:
Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
Отредактируй класс Robot, учитывая AbstractRobot.
Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

Requirements:
1. Класс AbstractRobot должен быть абстрактным.
2. Класс AbstractRobot должен реализовывать интерфейсы Attackable и Defensable.
3. Класс Robot должен наследоваться от класса AbstractRobot.
4. Логика поведения роботов должна быть вынесена в класс AbstractRobot.
5. В классе BodyPart должна содержаться и быть инициализирована final static переменная CHEST типа BodyPart.
6. Новую часть тела (BodyPart) нужно добавить в логику методов attack и defense в классе AbstractRobot.
