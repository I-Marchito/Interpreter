package org.example;

public class LevelUp {

    public static String formula = "nivel * 2 + recurso";

    public static double calcularLvlUp(double nivel, double recurso) {
        String expressao;
        expressao = formula.replace("nivel", Double.toString(nivel));
        expressao = expressao.replace("recurso", Double.toString(recurso));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

}
