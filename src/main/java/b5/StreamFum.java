package b5;

public class StreamFum {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2==1) {
                System.out.println(numeros.get(i));
            }
        }

        numeros.stream()
                .filter(n -> n % 2==1)
                .forEach(System.out::println);
        System.out.println("___________________________________");
        int suma=numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(suma);




    }


}
}