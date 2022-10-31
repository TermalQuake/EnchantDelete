package me.termalquake.enchanteddelete.addmetods;

public class StringReplaceClass {
    public StringReplaceClass() {
    }

    public static String stringReplace(String stringa, String playername) {
        String player = estraiStringa(stringa, '%', '%');
        return stringa.replace(player, playername);
    }

    private static String estraiStringa(String stringa, char i, char f) {
        int posin = stringa.indexOf(i);
        int posfi = stringa.lastIndexOf(f);
        return stringa.substring(posin, posfi + 1);
    }
}

