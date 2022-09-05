public class Main {
    public static void main(String[] args) {
        String s1 = "vaibhav";

        Name n1 = new Name(){
            @Override
            public boolean isStartingWithGivenCharacter(String name, char givenCharacter) {
                return name.charAt(0) == givenCharacter;
            }


        };
        System.out.println("n1.isStartingWithA(s1) = "
                + n1.isStartingWithGivenCharacter(s1,'A'));

    }
}
