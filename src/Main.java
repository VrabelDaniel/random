public class Main {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .title("Builder Pattern in Java")
                .text("The Builder pattern is a creational design pattern that allows for the step-by-step construction of complex objects.")
                .category("Design Patterns")
                .build();

        System.out.println(post);

        KesmarkiPost kesmarkiPost = new KesmarkiPost()
                .setTitle("Kesmarki Post Example")
                .setText("This is an example of a post using the KesmarkiPost class.")
                .setCategory("Example");

        System.out.println(kesmarkiPost);

        lifoExample();
        heapExample();
        System.out.println("END");
    }

    private static void lifoExample(){
        int firstNum = 10;

        if (firstNum > 0) {
            int secondNum = 12;

            for (int i = firstNum; i < secondNum; i++) {
                int thirdNum = 30;
                System.out.println(thirdNum);
            }
        }

        System.out.println("END of LIFO example");
    }

    private static void heapExample() {
        // 1. String literal (String Pool)
        String s1 = "Hello";
        String s2 = "Hello"; // ugyanarra az objektumra mutat a String Pool-ban

        // 2. Új String objektum a heap-en (nem a String Pool-ban)
        String s3 = new String("Hello");

        // 3. Módosítások heap-en
        String s4 = s3 + " World"; // új objektum jön létre a heap-en

        System.out.println(s1 == s2); // true (ugyanaz a pool objektum)
        System.out.println(s1 == s3); // false (külön objektum a heap-en)
        System.out.println(s4);       // "Hello World"
    }
}