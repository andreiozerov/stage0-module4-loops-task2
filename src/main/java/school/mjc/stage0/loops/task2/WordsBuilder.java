package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        StringBuilder phrase = new StringBuilder();
        while (count < chars.length) {
            phrase.append(chars[count++]);
        }
        System.out.print(phrase);
    }
}
