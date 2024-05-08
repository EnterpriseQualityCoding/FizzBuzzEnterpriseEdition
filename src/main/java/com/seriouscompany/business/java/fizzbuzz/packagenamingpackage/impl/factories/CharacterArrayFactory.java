package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import it.unimi.dsi.fastutils.chars.CharacterList;

/**
 * Factory for CharacterArray
 */
public class CharacterArrayFactory {
    private final IntFunction<char[]> myCharacterArrayMakerFunction;
    
    public CharacterArrayFactory(IntFunction<char[]> characterArrayMakerFunction) {
        this.myCharacterArrayMakerFunction = characterArrayMakerFunction;
    }

    public char[] createCharacterArray(CharacterList characterList, final int characterArrayLength) {
        char[] myCharacterArray = this.myCharacterArraySupplier.apply(characterArrayLength);
        return myCharacterArray;
    }
}