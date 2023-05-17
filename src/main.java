public class main {
    public static void main(String[] args) {
        Box box = new Box();            //объявление объекта класса и вызов конструктора без параметров
        double result = box.volume();
        System.out.println(result);
/*
        Box box = new Box(10,10,10);    //объявление объекта класса и вызов конструктора с параметрами
        double result = box.volume();
        System.out.println(result);
    }
*/
}
