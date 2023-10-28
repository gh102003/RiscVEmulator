package com.pyesmeadow.george;

import com.pyesmeadow.george.instruction.IInstruction;
import com.pyesmeadow.george.instruction.InstructionFactory;

public class Hart {

    public static final int XLEN = 32;

    private IInstruction decode(int instruction) {
        return InstructionFactory.decodeInstruction(instruction);
    }

    public void step() {

    }
}
