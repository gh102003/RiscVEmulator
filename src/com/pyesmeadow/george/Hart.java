package com.pyesmeadow.george;

import com.pyesmeadow.george.instruction.IInstruction;
import com.pyesmeadow.george.instruction.InstructionFactory;

import java.util.Arrays;

public class Hart {

    // registers
    public int[] x = new int[32];
    public int pc = 0;

    // memory
    public int[] memory = new int[16 * 1024];

    public static final int XLEN = 32;

    private IInstruction decode(int instruction) {
        return InstructionFactory.decodeInstruction(instruction);
    }

    public void step() {
        // fetch
        int instr = memory[pc];
        // decode
        IInstruction decodedInstr = InstructionFactory.decodeInstruction(instr);
        // execute
        decodedInstr.execute(this);
    }
}
