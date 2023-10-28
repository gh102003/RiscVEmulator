package com.pyesmeadow.george.instruction;

import com.pyesmeadow.george.Hart;

public class AddImmediateInstruction extends TypeIInstruction {
    public AddImmediateInstruction(int instruction) {
        super(instruction);
    }

    @Override
    public void execute(Hart hart) {
        throw new UnsupportedOperationException();
    }
}
