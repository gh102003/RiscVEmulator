package com.pyesmeadow.george.instruction;

import com.pyesmeadow.george.Hart;

public class AddImmediateInstruction extends TypeIInstruction {
    public AddImmediateInstruction(int instruction) {
        super(instruction);
    }

    @Override
    public void execute(Hart hart) {
        int rs1Value = hart.x[rs1];
        int sum = rs1Value + imm;
        hart.x[rd] = sum;
    }
}
