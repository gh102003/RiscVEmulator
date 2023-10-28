package com.pyesmeadow.george.instruction;

public class InstructionFactory {

    public static IInstruction decodeInstruction(int instruction) {
        int opcode = instruction & 0b1111111;
        int funct3 = (instruction >> 12) & 0b111;

        // Opcode == OP-IMM
        switch (opcode) {
            case 0b0010011:
                return decodeOpImm(instruction, funct3);
            default:
                throw new IllegalStateException("Unexpected opcode: " + opcode);
        }
    }

    private static IInstruction decodeOpImm(int instruction, int funct3) {
        switch (funct3) {
            case 0b000:
                return new AddImmediateInstruction(instruction);
            default:
                throw new IllegalStateException("Unexpected funct3: " + funct3);
        }
    }
}
