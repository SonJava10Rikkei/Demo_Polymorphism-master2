package upcasting;

public class Upcasting {
    public static void main(String[] args) {
        //        Animal animal1 = new Cat();
        Cat cat = new Cat();
        Animal animal1 = cat;           //Chuyển kiểu không tường minh
        Animal animal2 = (Animal) new Cat();  // Chuyển kiểu tường minh



        cat.eat();
        cat.meow();
        animal1.eat();
        animal2.eat();
//        animal2.meow();   // Không thể gọi phương thức meow()
    }
}
