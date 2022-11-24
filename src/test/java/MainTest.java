import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class MainTest {

    DBModule dbModule = Mockito.mock(DBModule.class);

    @Test
    public void T1_HasNameAndSurname() {

        when(dbModule.getData()).thenReturn(new String[]{"Filankes", "Filankesov"});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam Filankes Filankesov.", mainClass.main());

    }

    @Test
    public void T2_HasOnlyName() {

        when(dbModule.getData()).thenReturn(new String[]{"Filankes"});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam Filankes.", mainClass.main());

    }

    @Test
    public void T3_HasOnlySurnameName() {

        when(dbModule.getData()).thenReturn(new String[]{"Filankesov"});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam Filankesov.", mainClass.main());

    }

    @Test
    public void T4_NameIsEmpty() {

        when(dbModule.getData()).thenReturn(new String[]{"", "Filankesov"});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam  Filankesov.", mainClass.main());

    }

    @Test
    public void T5_SurnameIsEmpty() {

        when(dbModule.getData()).thenReturn(new String[]{"Filankes", ""});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam Filankes .", mainClass.main());

    }

    @Test
    public void T6_NoNameAndSurname() {

        when(dbModule.getData()).thenReturn(new String[]{});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam .", mainClass.main());

    }

    @Test
    public void T7_NameAndSurnameIsEmpty() {

        when(dbModule.getData()).thenReturn(new String[]{"",""});

        Main mainClass = new Main(dbModule);

        assertEquals("Salam  .", mainClass.main());

    }
}