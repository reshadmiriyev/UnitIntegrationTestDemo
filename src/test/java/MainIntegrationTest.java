import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainIntegrationTest {

    DBModule dbModule = new DBModule();

    @Test
    public void T1_HasNameAndSurname() {

        Main mainClass = new Main(dbModule);

        assertEquals("Salam Rashad Miriyev.", mainClass.main());

    }
}