public class Box {
    double height;
    double width;
    double length;

    Box(){                   // объявление конструктора без параметров
        this.height = 10;
        this.width = 10;
        this.length = 10;
    }

/*    Box(double height, double width, double length) {   // объявление конструктора с параметрами
        this.height = height;
        this.width = width;
        this.length = length;
    }
*/
    double volume () {
        return(height * width * length);
    }

}
