package school.mjc.stage0.conditions.task3;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        List<Character>charactersVowel = new ArrayList<>();
        List<Character>charactersConsonant = new ArrayList<>();
        charactersVowel.add('a');
        charactersVowel.add('e');
        charactersVowel.add('i');
        charactersVowel.add('o');
        charactersVowel.add('u');

        charactersVowel.add('A');
        charactersVowel.add('E');
        charactersVowel.add('I');
        charactersVowel.add('O');
        charactersVowel.add('U');

        for (int i = 65; i <= 90 ; i++) {
            if(!charactersVowel.contains((char)i))
            charactersConsonant.add((char)i);
        }
        for (int i = 97; i <= 122 ; i++) {
            if(!charactersVowel.contains((char)i))
            charactersConsonant.add((char)i);
        }

        if(charactersVowel.contains(character)){
            System.out.println("Vowel");
            return;
        }
        if(charactersConsonant.contains(character)){
            System.out.println("Consonant");
        }
        else {
            System.out.println("wrong alphabet!");
        }
    }
}
