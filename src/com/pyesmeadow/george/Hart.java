package com.pyesmeadow.george;

import com.pyesmeadow.george.instruction.IInstruction;
import com.pyesmeadow.george.instruction.InstructionFactory;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;

public class Hart {

    public static final int MEMORY_SIZE = 1024;

    public Hart(IMemoryProvider provider) {
        memory = Arrays.copyOf(provider.getMemory(), MEMORY_SIZE);
    }

    // registers
    public int[] x = new int[32];
    public int pc = 0;

    // memory
    public byte[] memory;

    public static final int XLEN = 32;

    private IInstruction decode(int instruction) {
        return InstructionFactory.decodeInstruction(instruction);
    }

    public int fetch() {
        int instr = 0;
        for (int i = 0; i < 4; i++) {
            instr |= ((int) memory[pc + i] & 0xff) << (8 * i);
        }

        return instr;
    }

    public void step() {
        // fetch
        int instr = fetch();
        // decode
        IInstruction decodedInstr = InstructionFactory.decodeInstruction(instr);
        // execute
        decodedInstr.execute(this);

        pc += 4;
    }
}
