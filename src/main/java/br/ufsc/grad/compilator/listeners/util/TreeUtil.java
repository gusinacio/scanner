package br.ufsc.grad.compilator.listeners.util;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

public class TreeUtil {
    /**
     * Ignores first element, chunk in multiple arrays
     * @param list
     * @param step
     */
    public static List<ParseTree[]> chunker(List<ParseTree> list,  int step) {
        List<ParseTree[]> parserList = new ArrayList<>();

        for (int i = 1; i < list.size(); i += step) {
            ParseTree[] chunk = new ParseTree[step];

            for (int j = 0; j < step && i + j < list.size(); j++) {
                chunk[j] = list.get(i + j);
            }
            parserList.add(chunk);
        }
        return parserList;
    }
}
