package ru.netology.graphics.image;

/*
 * Символы соответствия: '▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'
 * Вариант: '#', '$', '@', '%', '*', '+', '-', '''
 * Диапазон 0 - 255
 *
 * d = color/n
 */
public class ColorToSymbol implements TextColorSchema {
//    private static char[] sym = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
//    private static char[] sym = {'#', '$', '@', '%', '*', '+', '-', '\''};
    private static char[] sym = {'@', '%', '$', '#', '+', '*', '-', '\''};
    private static int n = sym.length;
    private static Double dNum;
    private static final double NUMBER_OF_COLORS = 256;

    @Override
    public char convert(int color) {
        dNum = (n / NUMBER_OF_COLORS) * color;
        return sym[dNum.intValue()];
    }
}
