package com.pyesmeadow.george.instruction;

public abstract class ITypeInstruction implements IInstruction {

    final int opcode;
    final int rd;
    final int funct3;
    final int rs1;
    final int imm;

    public ITypeInstruction(int instruction) {
        opcode = instruction &0b1111111;
        rd = (instruction >> 7) & 0b11111;
        funct3 = (instruction >> 12) & 0b111;
        rs1 = (instruction >> 15) & 0b11111;
        imm = (instruction >> 20);
    }
}
