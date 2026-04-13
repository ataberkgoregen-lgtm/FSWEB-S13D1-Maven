package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            System.out.println(clock+ " Geçersiz bir değer.");
            return false;
        };
        if (isBarking && (clock < 8 || clock > 20)){
            System.out.println("Gece "+clock+ "'de köpeğimiz havlıyor");
            return true;
        }
        if( isBarking == false) {
            System.out.println("Köpeğimiz havlamıyor.");
            return  false;
        } else if (clock >= 8 && clock <= 20) {
            System.out.println("8'den sonra tepki vermeliyiz.");
            return false;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19) ){
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            if (temp >= 25 && temp <= 45) {
                System.out.println("Kedi oynuyor.");
                return true;
            } else {
                System.out.println("Sıcaklık 25-45 arasında olmalıydı.");
                return false;
            }
        } else {
            if(temp >= 25 && temp <= 35) {
                System.out.println("Kedi oynuyor.");
                return true;
            }else {
                System.out.println("Sıcaklık 25-35 arasında olmalıydı.");
                return false;
            }
        }
    }

    public static double area(double width, double height) {
    double result;
        if(width < 0 || height < 0) {
            System.out.println("Hatalı işlem yaptınız.");
            return -1;
        } else {
           result = (width * height);
            return result;
        }

    }

    public static double area(double radius) {
        double result;
        if(radius < 0) {
            return -1;
        } else {
            result = radius*radius*Math.PI;
            return result;
        }
    }
}
