public class eCommApp {
    public static void main(String[] args) {
        User newUser = new User.userBuilder()
                .firstName("Jean Fidelio")
                .lastName("Marquez")
                .email("jean.marquez@neu.edu.ph")
                .address("Mars, Milkyway")
                .phone("09999111222")
                .age(23)
                .build();

        System.out.println(newUser.firstName);
        System.out.println(newUser.lastName);
        System.out.println(newUser.email);
        System.out.println(newUser.address);
        System.out.println(newUser.phone);
        System.out.println(newUser.age);
    }
}

