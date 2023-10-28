package com.pyesmeadow.george.instruction;

public abstract class TypeIInstruction implements IInstruction {

    public final int opcode;
    public final int rd;
    public final int funct3;
    public final int rs1;
    public final int imm;

    public TypeIInstruction(int instruction) {
        opcode = instruction &0b1111111;
        rd = (instruction >> 7) & 0b11111;
        funct3 = (instruction >> 12) & 0b111;
        rs1 = (instruction >> 15) & 0b11111;
        imm = (instruction >> 20);
    }
}
