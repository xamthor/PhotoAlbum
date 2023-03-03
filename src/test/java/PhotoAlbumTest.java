import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.showcase.Main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhotoAlbumTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    @DisplayName("Test incorrect Input")
    public void testIncorrectInput() {
        String input = "d\nq\n"; // Simulate user input
        provideInput(input);

        Main.main(null);

        String expectedOutput = "Enter an album ID (or 'q' to quit): Invalid input. Please enter a number.\nEnter an album ID (or 'q' to quit): Exiting...\n";
        assertEquals(expectedOutput, testOut.toString());
    }
    @Test
    @DisplayName("Test Expected Output")
    public void testExpectedOutput() {
        String input = "3\nq\n"; // Simulate user input
        provideInput(input);

        Main.main(null);

        String expectedOutput = """
                Enter an album ID (or 'q' to quit): [101] incidunt alias vel enim
                [102] eaque iste corporis tempora vero distinctio consequuntur nisi nesciunt
                [103] et eius nisi in ut reprehenderit labore eum
                [104] et natus vero quia totam aut et minima
                [105] veritatis numquam eius
                [106] repellat molestiae nihil iste autem blanditiis officiis
                [107] maiores ipsa ut autem
                [108] qui tempora vel exercitationem harum iusto voluptas incidunt
                [109] quidem ut quos non qui debitis exercitationem
                [110] reiciendis et velit laborum recusandae
                [111] quos rem nulla ea amet
                [112] laudantium quibusdam inventore
                [113] hic nulla consectetur
                [114] consequatur quaerat sunt et
                [115] unde minus molestias
                [116] et iure eius enim explicabo
                [117] dolore quo nemo omnis odio et iure explicabo
                [118] et doloremque excepturi libero earum
                [119] quisquam error consequatur
                [120] eos quia minima modi cumque illo odit consequatur vero
                [121] commodi sed enim sint in nobis
                [122] consequatur quos odio harum alias
                [123] fuga sint ipsa quis
                [124] officiis similique autem unde repellendus
                [125] et fuga perspiciatis qui quis
                [126] id reiciendis neque voluptas explicabo quae
                [127] magnam quia sed aspernatur
                [128] est facere ut nam repellat numquam quia quia eos
                [129] alias mollitia voluptatum soluta quod
                [130] maxime provident eaque sapiente ipsa ducimus
                [131] qui sed ex
                [132] repellendus velit id non veniam dolorum quod est
                [133] placeat in reprehenderit
                [134] eveniet perspiciatis optio est qui ea dolore
                [135] qui harum quis ipsum optio ex
                [136] aut voluptas aut temporibus
                [137] et sit earum praesentium quas quis sint et
                [138] vitae delectus sed
                [139] velit placeat optio corrupti
                [140] assumenda sit non debitis dolorem saepe quae deleniti
                [141] commodi eum dolorum reiciendis unde ut
                [142] reprehenderit totam dolor itaque
                [143] totam temporibus eaque est eum et perspiciatis ullam
                [144] aspernatur possimus consectetur in tempore distinctio a ipsa officiis
                [145] eius unde ipsa incidunt corrupti quia accusamus omnis
                [146] ullam dolor ut ipsa veniam 
                [147] minima aspernatur eius nemo ut
                [148] aperiam amet est occaecati quae non ut
                [149] saepe recusandae ut odio enim ipsa quo placeat iusto
                [150] ipsum numquam ratione facilis provident animi reprehenderit ut
                Enter an album ID (or 'q' to quit): Exiting...
                """;
        assertEquals(expectedOutput, testOut.toString());
    }

}
