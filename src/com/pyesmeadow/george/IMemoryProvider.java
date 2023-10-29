package com.pyesmeadow.george;

public interface IMemoryProvider {
    /**
     * @return a byte array of any length containing the first portion
     * of initial memory contents.
     */
    byte[] getMemory();
}
