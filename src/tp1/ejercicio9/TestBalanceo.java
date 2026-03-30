package tp1.ejercicio9;

public class TestBalanceo {

    public static Boolean combina(char cpila, char c){
        if (cpila == '{' && c == '}') return true;
        if (cpila == '(' && c == ')') return true;
        if (cpila == '[' && c == ']') return true;
        return false;
    }
    public static Boolean esBalanceado(String cadena) {
        Pila<Character> p = new Pila<>();
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if (actual == '{' || actual == '(' || actual == '[') {
                p.push(actual);
            } else if (actual == '}' || actual == ')' || actual == ']') {
                if (p.isEmpty()) {
                    return false;
                } else {
                    if (!combina(p.pop(), actual)) {
                        return false;
                    }
                }
            }
        }
        return p.isEmpty();
    }

    public static void main(String[] args){
        String s = "as(dsdds)ccd{[dckl)]}";
        System.out.println(esBalanceado(s));
    }
}
