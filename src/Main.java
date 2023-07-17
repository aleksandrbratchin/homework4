public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("\nЗадача 1");
        byte age = 18;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        int temp = -5;
        System.out.print("На улице " + temp + " градусов, ");
        if (temp < 5) {
            System.out.println("нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
        }
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        int speed = 63;
        System.out.print("Если скорость " + speed + "км/ч, то ");
        if (speed <= 60) {
            System.out.println("можно ездить спокойно");
        } else {
            System.out.println("придется заплатить штраф");
        }
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        int age = 25;
        if(age < 0) {
            System.out.println("Возраст " + age + " неверный!");
        } else {
            System.out.print("Если возраст человека равен " + age + ", то ");
            if (age < 2) {
                System.out.println("ему пора спать");
            } else if (age >= 2 && age <= 6) {
                System.out.println("ему нужно ходить в детский сад");
            } else if (age >= 7 && age < 18) {
                System.out.println("то ему нужно ходить в школу");
            } else if (age >= 18 && age < 24) {
                System.out.println("его место в университете");
            } else if (age >= 24 && age < 60) {
                System.out.println("ему пора ходить на работу");
            } else {
                System.out.println("можно отдохнуть");
            }
        }
    }

    private static void task5() {
        System.out.println("\nЗадача 5");
        int age = 4;
        if(age < 0) {
            System.out.print("Возраст " + age + " неверный!");
        } else {
            System.out.print("Если возраст ребенка равен " + age + ", то ему ");
            if(age < 5){
                System.out.println("нельзя кататься на аттракционе");
            } else if (age >= 5 && age < 14) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }

    private static void task6() {
        System.out.println("\nЗадача 6");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int standingPlaces = wagonCapacity - seatPlace;

        int standingPlacesBusy = 40;
        int seatPlaceBusy = 59;
        int seatPlaceFree = seatPlace - seatPlaceBusy;
        int standingPlacesFree = standingPlaces - standingPlacesBusy;
        if(seatPlaceFree == 0 && standingPlacesFree == 0) {
            System.out.print("Вагон уже полностью забит!");
        } else {
            if(seatPlaceFree > 0){
                System.out.println("В вагоне есть " + seatPlaceFree + " свободных сидящих мест");
            }
            if(standingPlacesFree > 0){
                System.out.println("В вагоне есть " + standingPlacesFree + " свободных стоячих мест");
            }
        }
    }

    private static void task7() {
        System.out.println("\nЗадача 7");
        int one = 65;
        int two = 84;
        int three = 44;
        System.out.print("Из чисел " + one + ", " + two + ", " + three + " наибольшее это - ");
        if(one >= two && one >= three) {
            System.out.print(one);
        } else if (two >= three){
            System.out.print(two);
        } else {
            System.out.print(three);
        }
    }

}