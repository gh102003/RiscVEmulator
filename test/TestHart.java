import com.pyesmeadow.george.Hart;
import com.pyesmeadow.george.IMemoryProvider;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHart {
    @Test
    public void whenInstructionFetched_BytesAreInCorrectOrder() {

        IMemoryProvider memoryProvider = () -> new byte[] {1, 2, 3, 4};
        Hart h = new Hart(memoryProvider);

        // little endian
        assertEquals(0x04030201, h.fetch());
    }

    @Test
    public void whenAddImmediateInstructionInvoked_ResultStoredInMemory() {
        IMemoryProvider memoryProvider = () -> new byte[] {-109, 1, -110, 0};

        Hart h = new Hart(memoryProvider);
    }
}
