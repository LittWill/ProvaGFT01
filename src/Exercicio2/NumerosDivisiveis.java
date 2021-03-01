package Exercicio2;

public class NumerosDivisiveis {

    public static void main(String[] args) {
        for (int i = 10; i <= 215; i++) {
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println(i);
            }
        }
    }

}
