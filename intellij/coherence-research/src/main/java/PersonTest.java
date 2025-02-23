//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Hello World");


        // Create a Person object
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                .setName("John Doe")
                .setId(1)
                .setEmail("john.doe@example.com")
                .setAddress(getAddress())
                .build();

        System.out.println(person);

        // Verify the Person object
   //     assertEquals("John Doe", person.getName());
   //     assertEquals(1, person.getId());
    //    assertEquals("john.doe@example.com", person.getEmail());
    }

    private static PersonOuterClass.Address getAddress() {
        return PersonOuterClass.Address.newBuilder()
                .setStreet("123 Main St")
                .setCity("Anytown")
                .setState("CA")
                .setZip("12345")
                .build();
    }
}
