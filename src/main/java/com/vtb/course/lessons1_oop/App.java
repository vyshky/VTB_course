package com.vtb.course.lessons1_oop;

public class App {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}


// public,default,private,protected
//      public    - член класса доступен из любой части программы
//      private   - доступен только внутри класса, в котором объявлен.
//      default   - если в объявлении члена класса отсутствует явно указанный модификатор доступа (default),
//                    то он доступен для подклассов и других классов из данного пакета
//      protected - если же требуется, чтобы элемент был доступен за пределами его текущего пакета

// static variable    - это 1 общий объект для всех объектов класса
// static method      - не может обращаться к не статичным переменным, так как не понимает какую переменную прочитать из множества объектов класса
// static - это как бы глобальная переменная или функция, которая создается отдельно от объекта и привязывается к классу, чтобы ее можно было вызвать из класса
//              из-за этого иногда не возможно использовать не статические переменные внутри статического класса, так как не статические переменные могут быть множеством разных объектов, одного класса


// Особенности всех уровней доступа в языке Java
//                                                    | private | Модификатор отсутствует | protected | public|
// Один и тот же класс                                |    +    |           +             |     +     |   +   |
// Подкласс, производный от класса из того же пакета  |    -    |           +             |     +     |   +   |
// Класс из того же пакета, не являющийся подклассом  |    -    |           +             |     +     |   +   |
// Подкласс, производный от класса другого пакета     |    -    |           -             |     +     |   +   |
// Класс из другого пакета, не являющийся подклассом, |    -    |           -             |     -     |   +   |
// производный от класса данного пакета


// abstract class
// public abstract void function();
// в наследнике прописываем @Override, это аннотация проверяет, есть ли абстрактная функция в абстрактном классе, если нет, то не скомпилируется,
//       это защита, чтобы не создавались функции которых нет в абстрактном классе или если удаляется функция из абстрактного класса и мы понимаем какие классы ломаются


// final класс   - нельзя наследоваться от класса
// final поле    - константа, нельзя перезаписать
// final функции - нельзя переопределять в наследниках через @Override