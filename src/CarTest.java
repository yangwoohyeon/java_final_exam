public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW");
        System.out.println("obj is of type "+car1.getClass());
        if(car1.equals(car2)){
            System.out.println("동일한 종류의 차량입니다.");
        }
        else{
            System.out.println("동일한 종류의 자동차가 아닙니다.");
        }
    }

}
