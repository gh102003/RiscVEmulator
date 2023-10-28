import com.pyesmeadow.george.Hart;
import com.pyesmeadow.george.instruction.TypeIInstruction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTypeIInstruction {

    @Test
    void whenConstructorCalled_shouldExtractOperands() {
        TypeIInstruction instr1 = new TypeIInstruction(0b01010111100011110110000101010110) {
            @Override
            public void execute(Hart hart) {
                throw new UnsupportedOperationException();
            }
        };

        assertEquals(0b010101111000, instr1.imm);
        assertEquals(0b11110, instr1.rs1);
        assertEquals(0b110, instr1.funct3);
        assertEquals(0b00010, instr1.rd);
        assertEquals(0b1010110, instr1.opcode);

        TypeIInstruction instr2 = new TypeIInstruction(0b11010111100011110110000101010110) {
            @Override
            public void execute(Hart hart) {
                throw new UnsupportedOperationException();
            }
        };

        assertEquals(0b11111111111111111111110101111000, instr2.imm);
        assertEquals(0b11110, instr2.rs1);
        assertEquals(0b110, instr2.funct3);
        assertEquals(0b00010, instr2.rd);
        assertEquals(0b1010110, instr2.opcode);
    }
}
